package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class bw3 implements ImageHeaderParser {

    /* JADX INFO: renamed from: A */
    public static final int f14985A = 1635150182;

    /* JADX INFO: renamed from: B */
    public static final int f14986B = 1635150195;

    /* JADX INFO: renamed from: b */
    public static final String f14987b = "DfltImageHeaderParser";

    /* JADX INFO: renamed from: c */
    public static final int f14988c = 4671814;

    /* JADX INFO: renamed from: d */
    public static final int f14989d = -1991225785;

    /* JADX INFO: renamed from: e */
    public static final int f14990e = 65496;

    /* JADX INFO: renamed from: f */
    public static final int f14991f = 19789;

    /* JADX INFO: renamed from: g */
    public static final int f14992g = 18761;

    /* JADX INFO: renamed from: j */
    public static final int f14995j = 218;

    /* JADX INFO: renamed from: k */
    public static final int f14996k = 217;

    /* JADX INFO: renamed from: l */
    public static final int f14997l = 255;

    /* JADX INFO: renamed from: m */
    public static final int f14998m = 225;

    /* JADX INFO: renamed from: n */
    public static final int f14999n = 274;

    /* JADX INFO: renamed from: p */
    public static final int f15001p = 1380533830;

    /* JADX INFO: renamed from: q */
    public static final int f15002q = 1464156752;

    /* JADX INFO: renamed from: r */
    public static final int f15003r = 1448097792;

    /* JADX INFO: renamed from: s */
    public static final int f15004s = -256;

    /* JADX INFO: renamed from: t */
    public static final int f15005t = 255;

    /* JADX INFO: renamed from: u */
    public static final int f15006u = 88;

    /* JADX INFO: renamed from: v */
    public static final int f15007v = 76;

    /* JADX INFO: renamed from: w */
    public static final int f15008w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f15009x = 16;

    /* JADX INFO: renamed from: y */
    public static final int f15010y = 8;

    /* JADX INFO: renamed from: z */
    public static final int f15011z = 1718909296;

    /* JADX INFO: renamed from: h */
    public static final String f14993h = "Exif\u0000\u0000";

    /* JADX INFO: renamed from: i */
    public static final byte[] f14994i = f14993h.getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: o */
    public static final int[] f15000o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: bw3$a */
    public static final class C2073a implements InterfaceC2075c {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f15012a;

        public C2073a(ByteBuffer byteBuffer) {
            this.f15012a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p000.bw3.InterfaceC2075c
        public int getUInt16() throws InterfaceC2075c.a {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // p000.bw3.InterfaceC2075c
        public short getUInt8() throws InterfaceC2075c.a {
            if (this.f15012a.remaining() >= 1) {
                return (short) (this.f15012a.get() & 255);
            }
            throw new InterfaceC2075c.a();
        }

        @Override // p000.bw3.InterfaceC2075c
        public int read(byte[] bArr, int i) {
            int iMin = Math.min(i, this.f15012a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f15012a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // p000.bw3.InterfaceC2075c
        public long skip(long j) {
            int iMin = (int) Math.min(this.f15012a.remaining(), j);
            ByteBuffer byteBuffer = this.f15012a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: bw3$b */
    public static final class C2074b {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f15013a;

        public C2074b(byte[] bArr, int i) {
            this.f15013a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean isAvailable(int i, int i2) {
            return this.f15013a.remaining() - i >= i2;
        }

        /* JADX INFO: renamed from: a */
        public short m3462a(int i) {
            if (isAvailable(i, 2)) {
                return this.f15013a.getShort(i);
            }
            return (short) -1;
        }

        /* JADX INFO: renamed from: b */
        public int m3463b(int i) {
            if (isAvailable(i, 4)) {
                return this.f15013a.getInt(i);
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        public int m3464c() {
            return this.f15013a.remaining();
        }

        /* JADX INFO: renamed from: d */
        public void m3465d(ByteOrder byteOrder) {
            this.f15013a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: bw3$c */
    public interface InterfaceC2075c {

        /* JADX INFO: renamed from: bw3$c$a */
        public static final class a extends IOException {
            private static final long serialVersionUID = 1;

            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: bw3$d */
    public static final class C2076d implements InterfaceC2075c {

        /* JADX INFO: renamed from: a */
        public final InputStream f15014a;

        public C2076d(InputStream inputStream) {
            this.f15014a = inputStream;
        }

        @Override // p000.bw3.InterfaceC2075c
        public int getUInt16() throws IOException {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // p000.bw3.InterfaceC2075c
        public short getUInt8() throws IOException {
            int i = this.f15014a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new InterfaceC2075c.a();
        }

        @Override // p000.bw3.InterfaceC2075c
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f15014a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new InterfaceC2075c.a();
            }
            return i2;
        }

        @Override // p000.bw3.InterfaceC2075c
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f15014a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f15014a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    private static int calcTagOffset(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static boolean handles(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i) {
        boolean z = bArr != null && i > f14994i.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f14994i;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    private int moveToExifSegmentAndGetLength(InterfaceC2075c interfaceC2075c) throws IOException {
        short uInt8;
        int uInt16;
        long j;
        long jSkip;
        do {
            short uInt82 = interfaceC2075c.getUInt8();
            if (uInt82 != 255) {
                if (Log.isLoggable(f14987b, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) uInt82);
                }
                return -1;
            }
            uInt8 = interfaceC2075c.getUInt8();
            if (uInt8 == 218) {
                return -1;
            }
            if (uInt8 == 217) {
                Log.isLoggable(f14987b, 3);
                return -1;
            }
            uInt16 = interfaceC2075c.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            j = uInt16;
            jSkip = interfaceC2075c.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable(f14987b, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append((int) uInt8);
            sb2.append(", wanted to skip: ");
            sb2.append(uInt16);
            sb2.append(", but actually skipped: ");
            sb2.append(jSkip);
        }
        return -1;
    }

    private int parseExifSegment(InterfaceC2075c interfaceC2075c, byte[] bArr, int i) throws IOException {
        int i2 = interfaceC2075c.read(bArr, i);
        if (i2 == i) {
            if (hasJpegExifPreamble(bArr, i)) {
                return parseExifSegment(new C2074b(bArr, i));
            }
            Log.isLoggable(f14987b, 3);
            return -1;
        }
        if (Log.isLoggable(f14987b, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to read exif segment data, length: ");
            sb.append(i);
            sb.append(", actually read: ");
            sb.append(i2);
        }
        return -1;
    }

    private boolean sniffAvif(InterfaceC2075c interfaceC2075c, int i) throws IOException {
        if (((interfaceC2075c.getUInt16() << 16) | interfaceC2075c.getUInt16()) != 1718909296) {
            return false;
        }
        int uInt16 = (interfaceC2075c.getUInt16() << 16) | interfaceC2075c.getUInt16();
        if (uInt16 == 1635150182 || uInt16 == 1635150195) {
            return true;
        }
        interfaceC2075c.skip(4L);
        int i2 = i - 16;
        if (i2 % 4 != 0) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && i2 > 0) {
            int uInt162 = (interfaceC2075c.getUInt16() << 16) | interfaceC2075c.getUInt16();
            if (uInt162 == 1635150182 || uInt162 == 1635150195) {
                return true;
            }
            i3++;
            i2 -= 4;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@efb InputStream inputStream, @efb z60 z60Var) throws IOException {
        return getOrientation(new C2076d((InputStream) t7d.checkNotNull(inputStream)), (z60) t7d.checkNotNull(z60Var));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @efb
    public ImageHeaderParser.ImageType getType(@efb InputStream inputStream) throws IOException {
        return getType(new C2076d((InputStream) t7d.checkNotNull(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @efb
    public ImageHeaderParser.ImageType getType(@efb ByteBuffer byteBuffer) throws IOException {
        return getType(new C2073a((ByteBuffer) t7d.checkNotNull(byteBuffer)));
    }

    @efb
    private ImageHeaderParser.ImageType getType(InterfaceC2075c interfaceC2075c) throws IOException {
        try {
            int uInt16 = interfaceC2075c.getUInt16();
            if (uInt16 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int uInt8 = (uInt16 << 8) | interfaceC2075c.getUInt8();
            if (uInt8 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int uInt82 = (uInt8 << 8) | interfaceC2075c.getUInt8();
            if (uInt82 == -1991225785) {
                interfaceC2075c.skip(21L);
                try {
                    return interfaceC2075c.getUInt8() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (InterfaceC2075c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (uInt82 != 1380533830) {
                return sniffAvif(interfaceC2075c, uInt82) ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            }
            interfaceC2075c.skip(4L);
            if (((interfaceC2075c.getUInt16() << 16) | interfaceC2075c.getUInt16()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int uInt162 = (interfaceC2075c.getUInt16() << 16) | interfaceC2075c.getUInt16();
            if ((uInt162 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = uInt162 & 255;
            if (i != 88) {
                if (i == 76) {
                    interfaceC2075c.skip(4L);
                    return (interfaceC2075c.getUInt8() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            interfaceC2075c.skip(4L);
            short uInt83 = interfaceC2075c.getUInt8();
            if ((uInt83 & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            if ((uInt83 & 16) != 0) {
                return ImageHeaderParser.ImageType.WEBP_A;
            }
            return ImageHeaderParser.ImageType.WEBP;
        } catch (InterfaceC2075c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@efb ByteBuffer byteBuffer, @efb z60 z60Var) throws IOException {
        return getOrientation(new C2073a((ByteBuffer) t7d.checkNotNull(byteBuffer)), (z60) t7d.checkNotNull(z60Var));
    }

    private static int parseExifSegment(C2074b c2074b) {
        ByteOrder byteOrder;
        short sM3462a = c2074b.m3462a(6);
        if (sM3462a != 18761) {
            if (sM3462a != 19789 && Log.isLoggable(f14987b, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append((int) sM3462a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        c2074b.m3465d(byteOrder);
        int iM3463b = c2074b.m3463b(10) + 6;
        short sM3462a2 = c2074b.m3462a(iM3463b);
        for (int i = 0; i < sM3462a2; i++) {
            int iCalcTagOffset = calcTagOffset(iM3463b, i);
            short sM3462a3 = c2074b.m3462a(iCalcTagOffset);
            if (sM3462a3 == 274) {
                short sM3462a4 = c2074b.m3462a(iCalcTagOffset + 2);
                if (sM3462a4 >= 1 && sM3462a4 <= 12) {
                    int iM3463b2 = c2074b.m3463b(iCalcTagOffset + 4);
                    if (iM3463b2 < 0) {
                        Log.isLoggable(f14987b, 3);
                    } else {
                        if (Log.isLoggable(f14987b, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append((int) sM3462a3);
                            sb2.append(" formatCode=");
                            sb2.append((int) sM3462a4);
                            sb2.append(" componentCount=");
                            sb2.append(iM3463b2);
                        }
                        int i2 = iM3463b2 + f15000o[sM3462a4];
                        if (i2 > 4) {
                            if (Log.isLoggable(f14987b, 3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Got byte count > 4, not orientation, continuing, formatCode=");
                                sb3.append((int) sM3462a4);
                            }
                        } else {
                            int i3 = iCalcTagOffset + 8;
                            if (i3 >= 0 && i3 <= c2074b.m3464c()) {
                                if (i2 >= 0 && i2 + i3 <= c2074b.m3464c()) {
                                    return c2074b.m3462a(i3);
                                }
                                if (Log.isLoggable(f14987b, 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append((int) sM3462a3);
                                }
                            } else if (Log.isLoggable(f14987b, 3)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Illegal tagValueOffset=");
                                sb5.append(i3);
                                sb5.append(" tagType=");
                                sb5.append((int) sM3462a3);
                            }
                        }
                    }
                } else if (Log.isLoggable(f14987b, 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append((int) sM3462a4);
                }
            }
        }
        return -1;
    }

    private int getOrientation(InterfaceC2075c interfaceC2075c, z60 z60Var) throws IOException {
        try {
            int uInt16 = interfaceC2075c.getUInt16();
            if (!handles(uInt16)) {
                if (Log.isLoggable(f14987b, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(uInt16);
                }
                return -1;
            }
            int iMoveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength(interfaceC2075c);
            if (iMoveToExifSegmentAndGetLength == -1) {
                Log.isLoggable(f14987b, 3);
                return -1;
            }
            byte[] bArr = (byte[]) z60Var.get(iMoveToExifSegmentAndGetLength, byte[].class);
            try {
                return parseExifSegment(interfaceC2075c, bArr, iMoveToExifSegmentAndGetLength);
            } finally {
                z60Var.put(bArr);
            }
        } catch (InterfaceC2075c.a unused) {
            return -1;
        }
    }
}
