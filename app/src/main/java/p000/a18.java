package p000;

import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import org.opencv.videoio.Videoio;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@nx4
public final class a18 {

    /* JADX INFO: renamed from: a */
    public static final int f98a = 4;

    /* JADX INFO: renamed from: b */
    public static final int f99b = 8;

    /* JADX INFO: renamed from: d */
    public static final char f101d = ':';

    /* JADX INFO: renamed from: c */
    public static final char f100c = '.';

    /* JADX INFO: renamed from: e */
    public static final yv1 f102e = yv1.m26360is(f100c);

    /* JADX INFO: renamed from: f */
    public static final yv1 f103f = yv1.m26360is(':');

    /* JADX INFO: renamed from: g */
    public static final Inet4Address f104g = (Inet4Address) forString("127.0.0.1");

    /* JADX INFO: renamed from: h */
    public static final Inet4Address f105h = (Inet4Address) forString("0.0.0.0");

    /* JADX INFO: renamed from: a18$a */
    public static final class C0010a {

        /* JADX INFO: renamed from: a */
        public final Inet4Address f106a;

        /* JADX INFO: renamed from: b */
        public final Inet4Address f107b;

        /* JADX INFO: renamed from: c */
        public final int f108c;

        /* JADX INFO: renamed from: d */
        public final int f109d;

        public C0010a(@wx1 Inet4Address server, @wx1 Inet4Address client, int port, int flags) {
            boolean z = false;
            v7d.checkArgument(port >= 0 && port <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", port);
            if (flags >= 0 && flags <= 65535) {
                z = true;
            }
            v7d.checkArgument(z, "flags '%s' is out of range (0 <= flags <= 0xffff)", flags);
            this.f106a = (Inet4Address) yya.firstNonNull(server, a18.f105h);
            this.f107b = (Inet4Address) yya.firstNonNull(client, a18.f105h);
            this.f108c = port;
            this.f109d = flags;
        }

        public Inet4Address getClient() {
            return this.f107b;
        }

        public int getFlags() {
            return this.f109d;
        }

        public int getPort() {
            return this.f108c;
        }

        public Inet4Address getServer() {
            return this.f106a;
        }
    }

    private a18() {
    }

    private static InetAddress bytesToInetAddress(byte[] addr) {
        try {
            return InetAddress.getByAddress(addr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public static int coerceToInteger(InetAddress ip) {
        return tj1.newDataInput(getCoercedIPv4Address(ip).getAddress()).readInt();
    }

    private static void compressLongestRunOfZeroes(int[] hextets) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < hextets.length + 1; i4++) {
            if (i4 >= hextets.length || hextets[i4] != 0) {
                if (i3 >= 0) {
                    int i5 = i4 - i3;
                    if (i5 > i) {
                        i2 = i3;
                        i = i5;
                    }
                    i3 = -1;
                }
            } else if (i3 < 0) {
                i3 = i4;
            }
        }
        if (i >= 2) {
            Arrays.fill(hextets, i2, i + i2, -1);
        }
    }

    @wx1
    private static String convertDottedQuadToHex(String ipString) {
        int iLastIndexOf = ipString.lastIndexOf(58) + 1;
        String strSubstring = ipString.substring(0, iLastIndexOf);
        byte[] bArrTextToNumericFormatV4 = textToNumericFormatV4(ipString.substring(iLastIndexOf));
        if (bArrTextToNumericFormatV4 == null) {
            return null;
        }
        return strSubstring + Integer.toHexString(((bArrTextToNumericFormatV4[0] & 255) << 8) | (bArrTextToNumericFormatV4[1] & 255)) + g1i.f38277c + Integer.toHexString((bArrTextToNumericFormatV4[3] & 255) | ((bArrTextToNumericFormatV4[2] & 255) << 8));
    }

    public static InetAddress decrement(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (length >= 0 && address2[length] == 0) {
            address2[length] = -1;
            length--;
        }
        v7d.checkArgument(length >= 0, "Decrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] - 1);
        return bytesToInetAddress(address2);
    }

    @op1
    public static InetAddress forString(String ipString) {
        byte[] bArrIpStringToBytes = ipStringToBytes(ipString);
        if (bArrIpStringToBytes != null) {
            return bytesToInetAddress(bArrIpStringToBytes);
        }
        throw formatIllegalArgumentException("'%s' is not an IP string literal.", ipString);
    }

    public static InetAddress forUriString(String hostAddr) {
        InetAddress inetAddressForUriStringNoThrow = forUriStringNoThrow(hostAddr);
        if (inetAddressForUriStringNoThrow != null) {
            return inetAddressForUriStringNoThrow;
        }
        throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", hostAddr);
    }

    @wx1
    private static InetAddress forUriStringNoThrow(String hostAddr) {
        int i;
        v7d.checkNotNull(hostAddr);
        if (hostAddr.startsWith("[") && hostAddr.endsWith("]")) {
            hostAddr = hostAddr.substring(1, hostAddr.length() - 1);
            i = 16;
        } else {
            i = 4;
        }
        byte[] bArrIpStringToBytes = ipStringToBytes(hostAddr);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != i) {
            return null;
        }
        return bytesToInetAddress(bArrIpStringToBytes);
    }

    private static IllegalArgumentException formatIllegalArgumentException(String format, Object... args) {
        return new IllegalArgumentException(String.format(Locale.ROOT, format, args));
    }

    private static InetAddress fromBigInteger(BigInteger address, boolean isIpv6) {
        v7d.checkArgument(address.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i = isIpv6 ? 16 : 4;
        byte[] byteArray = address.toByteArray();
        byte[] bArr = new byte[i];
        int iMax = Math.max(0, byteArray.length - i);
        int length = byteArray.length - iMax;
        int i2 = i - length;
        for (int i3 = 0; i3 < iMax; i3++) {
            if (byteArray[i3] != 0) {
                throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i), address);
            }
        }
        System.arraycopy(byteArray, iMax, bArr, i2, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger address) {
        return (Inet4Address) fromBigInteger(address, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger address) {
        return (Inet6Address) fromBigInteger(address, true);
    }

    public static Inet4Address fromInteger(int address) {
        return getInet4Address(rd8.toByteArray(address));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] addr) throws UnknownHostException {
        byte[] bArr = new byte[addr.length];
        for (int i = 0; i < addr.length; i++) {
            bArr[i] = addr[(addr.length - i) - 1];
        }
        return InetAddress.getByAddress(bArr);
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address ip) {
        v7d.checkArgument(is6to4Address(ip), "Address '%s' is not a 6to4 address.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress ip) {
        boolean z;
        if (ip instanceof Inet4Address) {
            return (Inet4Address) ip;
        }
        byte[] address = ip.getAddress();
        int i = 0;
        while (true) {
            if (i >= 15) {
                z = true;
                break;
            }
            if (address[i] != 0) {
                z = false;
                break;
            }
            i++;
        }
        if (z && address[15] == 1) {
            return f104g;
        }
        if (z && address[15] == 0) {
            return f105h;
        }
        Inet6Address inet6Address = (Inet6Address) ip;
        int iAsInt = xh7.murmur3_32_fixed().hashLong(hasEmbeddedIPv4ClientAddress(inet6Address) ? getEmbeddedIPv4ClientAddress(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).asInt() | Videoio.CAP_OPENNI_GENERATORS_MASK;
        if (iAsInt == -1) {
            iAsInt = -2;
        }
        return getInet4Address(rd8.toByteArray(iAsInt));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address ip) {
        v7d.checkArgument(isCompatIPv4Address(ip), "Address '%s' is not IPv4-compatible.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address ip) {
        if (isCompatIPv4Address(ip)) {
            return getCompatIPv4Address(ip);
        }
        if (is6to4Address(ip)) {
            return get6to4IPv4Address(ip);
        }
        if (isTeredoAddress(ip)) {
            return getTeredoInfo(ip).getClient();
        }
        throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(ip));
    }

    private static Inet4Address getInet4Address(byte[] bytes) {
        v7d.checkArgument(bytes.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bytes.length);
        return (Inet4Address) bytesToInetAddress(bytes);
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address ip) {
        v7d.checkArgument(isIsatapAddress(ip), "Address '%s' is not an ISATAP address.", toAddrString(ip));
        return getInet4Address(Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static C0010a getTeredoInfo(Inet6Address ip) {
        v7d.checkArgument(isTeredoAddress(ip), "Address '%s' is not a Teredo address.", toAddrString(ip));
        byte[] address = ip.getAddress();
        Inet4Address inet4Address = getInet4Address(Arrays.copyOfRange(address, 4, 8));
        int i = tj1.newDataInput(address, 8).readShort() & iqh.f48007d;
        int i2 = 65535 & (~tj1.newDataInput(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i3 = 0; i3 < bArrCopyOfRange.length; i3++) {
            bArrCopyOfRange[i3] = (byte) (~bArrCopyOfRange[i3]);
        }
        return new C0010a(inet4Address, getInet4Address(bArrCopyOfRange), i2, i);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address ip) {
        return isCompatIPv4Address(ip) || is6to4Address(ip) || isTeredoAddress(ip);
    }

    private static String hextetsToIPv6String(int[] hextets) {
        StringBuilder sb = new StringBuilder(39);
        int i = 0;
        boolean z = false;
        while (i < hextets.length) {
            boolean z2 = hextets[i] >= 0;
            if (z2) {
                if (z) {
                    sb.append(':');
                }
                sb.append(Integer.toHexString(hextets[i]));
            } else if (i == 0 || z) {
                sb.append("::");
            }
            i++;
            z = z2;
        }
        return sb.toString();
    }

    public static InetAddress increment(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (true) {
            if (length < 0 || address2[length] != -1) {
                break;
            }
            address2[length] = 0;
            length--;
        }
        v7d.checkArgument(length >= 0, "Incrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] + 1);
        return bytesToInetAddress(address2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r3 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r9 = convertDottedQuadToHex(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r1 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        return textToNumericFormatV6(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r2 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r1 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        return textToNumericFormatV4(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        return null;
     */
    @p000.wx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] ipStringToBytes(java.lang.String r9) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r9.length()
            r5 = 0
            r6 = -1
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = r8
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r5
        L1e:
            r3 = r8
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r6) goto L2e
            return r5
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = r6
        L32:
            if (r3 == 0) goto L48
            if (r2 == 0) goto L3d
            java.lang.String r9 = convertDottedQuadToHex(r9)
            if (r9 != 0) goto L3d
            return r5
        L3d:
            if (r1 == r6) goto L43
            java.lang.String r9 = r9.substring(r0, r1)
        L43:
            byte[] r9 = textToNumericFormatV6(r9)
            return r9
        L48:
            if (r2 == 0) goto L52
            if (r1 == r6) goto L4d
            return r5
        L4d:
            byte[] r9 = textToNumericFormatV4(r9)
            return r9
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a18.ipStringToBytes(java.lang.String):byte[]");
    }

    public static boolean is6to4Address(Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean isCompatIPv4Address(Inet6Address ip) {
        byte b;
        if (!ip.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b = address[15]) == 0 || b == 1)) ? false : true;
    }

    public static boolean isInetAddress(String ipString) {
        return ipStringToBytes(ipString) != null;
    }

    public static boolean isIsatapAddress(Inet6Address ip) {
        if (isTeredoAddress(ip)) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean isMappedIPv4Address(String ipString) {
        byte[] bArrIpStringToBytes = ipStringToBytes(ipString);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != 16) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= 10) {
                for (int i2 = 10; i2 < 12; i2++) {
                    if (bArrIpStringToBytes[i2] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrIpStringToBytes[i] != 0) {
                return false;
            }
            i++;
        }
    }

    public static boolean isMaximum(InetAddress address) {
        for (byte b : address.getAddress()) {
            if (b != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean isUriInetAddress(String ipString) {
        return forUriStringNoThrow(ipString) != null;
    }

    private static short parseHextet(String ipString, int start, int end) {
        int i = end - start;
        if (i <= 0 || i > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (start < end) {
            iDigit = (iDigit << 4) | Character.digit(ipString.charAt(start), 16);
            start++;
        }
        return (short) iDigit;
    }

    private static byte parseOctet(String ipString, int start, int end) {
        int i = end - start;
        if (i <= 0 || i > 3) {
            throw new NumberFormatException();
        }
        if (i > 1 && ipString.charAt(start) == '0') {
            throw new NumberFormatException();
        }
        int i2 = 0;
        while (start < end) {
            int i3 = i2 * 10;
            int iDigit = Character.digit(ipString.charAt(start), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i2 = i3 + iDigit;
            start++;
        }
        if (i2 <= 255) {
            return (byte) i2;
        }
        throw new NumberFormatException();
    }

    @wx1
    private static byte[] textToNumericFormatV4(String ipString) {
        if (f102e.countIn(ipString) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int iIndexOf = ipString.indexOf(46, i);
            if (iIndexOf == -1) {
                iIndexOf = ipString.length();
            }
            try {
                bArr[i2] = parseOctet(ipString, i, iIndexOf);
                i = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @wx1
    private static byte[] textToNumericFormatV6(String ipString) {
        int iCountIn = f103f.countIn(ipString);
        if (iCountIn >= 2 && iCountIn <= 8) {
            int i = 1;
            int i2 = iCountIn + 1;
            int i3 = 8 - i2;
            boolean z = false;
            for (int i4 = 0; i4 < ipString.length() - 1; i4++) {
                if (ipString.charAt(i4) == ':' && ipString.charAt(i4 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    int i5 = i3 + 1;
                    if (i4 == 0) {
                        i5 = i3 + 2;
                    }
                    if (i4 == ipString.length() - 2) {
                        i5++;
                    }
                    i3 = i5;
                    z = true;
                }
            }
            if (ipString.charAt(0) == ':' && ipString.charAt(1) != ':') {
                return null;
            }
            if (ipString.charAt(ipString.length() - 1) == ':' && ipString.charAt(ipString.length() - 2) != ':') {
                return null;
            }
            if (z && i3 <= 0) {
                return null;
            }
            if (!z && i2 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (ipString.charAt(0) != ':') {
                    i = 0;
                }
                while (i < ipString.length()) {
                    int iIndexOf = ipString.indexOf(58, i);
                    if (iIndexOf == -1) {
                        iIndexOf = ipString.length();
                    }
                    if (ipString.charAt(i) == ':') {
                        for (int i6 = 0; i6 < i3; i6++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(parseHextet(ipString, i, iIndexOf));
                    }
                    i = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String toAddrString(InetAddress ip) {
        v7d.checkNotNull(ip);
        if (ip instanceof Inet4Address) {
            return ip.getHostAddress();
        }
        v7d.checkArgument(ip instanceof Inet6Address);
        byte[] address = ip.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i * 2;
            iArr[i] = rd8.fromBytes((byte) 0, (byte) 0, address[i2], address[i2 + 1]);
        }
        compressLongestRunOfZeroes(iArr);
        return hextetsToIPv6String(iArr);
    }

    public static BigInteger toBigInteger(InetAddress address) {
        return new BigInteger(1, address.getAddress());
    }

    public static String toUriString(InetAddress ip) {
        if (!(ip instanceof Inet6Address)) {
            return toAddrString(ip);
        }
        return "[" + toAddrString(ip) + "]";
    }
}
