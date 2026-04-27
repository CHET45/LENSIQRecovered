package p000;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ogi {

    /* JADX INFO: renamed from: a */
    public static final String f67590a = "VorbisUtil";

    /* JADX INFO: renamed from: ogi$a */
    public static final class C10372a {

        /* JADX INFO: renamed from: a */
        public final String f67591a;

        /* JADX INFO: renamed from: b */
        public final String[] f67592b;

        /* JADX INFO: renamed from: c */
        public final int f67593c;

        public C10372a(String str, String[] strArr, int i) {
            this.f67591a = str;
            this.f67592b = strArr;
            this.f67593c = i;
        }
    }

    /* JADX INFO: renamed from: ogi$b */
    public static final class C10373b {

        /* JADX INFO: renamed from: a */
        public final boolean f67594a;

        /* JADX INFO: renamed from: b */
        public final int f67595b;

        /* JADX INFO: renamed from: c */
        public final int f67596c;

        /* JADX INFO: renamed from: d */
        public final int f67597d;

        public C10373b(boolean z, int i, int i2, int i3) {
            this.f67594a = z;
            this.f67595b = i;
            this.f67596c = i2;
            this.f67597d = i3;
        }
    }

    /* JADX INFO: renamed from: ogi$c */
    public static final class C10374c {

        /* JADX INFO: renamed from: a */
        public final int f67598a;

        /* JADX INFO: renamed from: b */
        public final int f67599b;

        /* JADX INFO: renamed from: c */
        public final int f67600c;

        /* JADX INFO: renamed from: d */
        public final int f67601d;

        /* JADX INFO: renamed from: e */
        public final int f67602e;

        /* JADX INFO: renamed from: f */
        public final int f67603f;

        /* JADX INFO: renamed from: g */
        public final int f67604g;

        /* JADX INFO: renamed from: h */
        public final int f67605h;

        /* JADX INFO: renamed from: i */
        public final boolean f67606i;

        /* JADX INFO: renamed from: j */
        public final byte[] f67607j;

        public C10374c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f67598a = i;
            this.f67599b = i2;
            this.f67600c = i3;
            this.f67601d = i4;
            this.f67602e = i5;
            this.f67603f = i6;
            this.f67604g = i7;
            this.f67605h = i8;
            this.f67606i = z;
            this.f67607j = bArr;
        }
    }

    private ogi() {
    }

    @hib
    public static int[] getVorbisToAndroidChannelLayoutMapping(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int iLog(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private static long mapType1QuantValues(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    @hib
    public static eta parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrSplitAtFirst = t0i.splitAtFirst(str, "=");
            if (strArrSplitAtFirst.length != 2) {
                xh9.m25148w("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(svc.fromPictureBlock(new jhc(Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (RuntimeException e) {
                    xh9.m25149w("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new kgi(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new eta(arrayList);
    }

    public static kx7<byte[]> parseVorbisCsdFromEsdsInitializationData(byte[] bArr) {
        jhc jhcVar = new jhc(bArr);
        jhcVar.skipBytes(1);
        int i = 0;
        while (jhcVar.bytesLeft() > 0 && jhcVar.peekUnsignedByte() == 255) {
            i += 255;
            jhcVar.skipBytes(1);
        }
        int unsignedByte = i + jhcVar.readUnsignedByte();
        int i2 = 0;
        while (jhcVar.bytesLeft() > 0 && jhcVar.peekUnsignedByte() == 255) {
            i2 += 255;
            jhcVar.skipBytes(1);
        }
        int unsignedByte2 = i2 + jhcVar.readUnsignedByte();
        byte[] bArr2 = new byte[unsignedByte];
        int position = jhcVar.getPosition();
        System.arraycopy(bArr, position, bArr2, 0, unsignedByte);
        int i3 = position + unsignedByte + unsignedByte2;
        int length = bArr.length - i3;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i3, bArr3, 0, length);
        return kx7.m15112of(bArr2, bArr3);
    }

    private static void readFloors(jgi jgiVar) throws yhc {
        int bits = jgiVar.readBits(6) + 1;
        for (int i = 0; i < bits; i++) {
            int bits2 = jgiVar.readBits(16);
            if (bits2 == 0) {
                jgiVar.skipBits(8);
                jgiVar.skipBits(16);
                jgiVar.skipBits(16);
                jgiVar.skipBits(6);
                jgiVar.skipBits(8);
                int bits3 = jgiVar.readBits(4) + 1;
                for (int i2 = 0; i2 < bits3; i2++) {
                    jgiVar.skipBits(8);
                }
            } else {
                if (bits2 != 1) {
                    throw yhc.createForMalformedContainer("floor type greater than 1 not decodable: " + bits2, null);
                }
                int bits4 = jgiVar.readBits(5);
                int[] iArr = new int[bits4];
                int i3 = -1;
                for (int i4 = 0; i4 < bits4; i4++) {
                    int bits5 = jgiVar.readBits(4);
                    iArr[i4] = bits5;
                    if (bits5 > i3) {
                        i3 = bits5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = jgiVar.readBits(3) + 1;
                    int bits6 = jgiVar.readBits(2);
                    if (bits6 > 0) {
                        jgiVar.skipBits(8);
                    }
                    for (int i7 = 0; i7 < (1 << bits6); i7++) {
                        jgiVar.skipBits(8);
                    }
                }
                jgiVar.skipBits(2);
                int bits7 = jgiVar.readBits(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < bits4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        jgiVar.skipBits(bits7);
                        i9++;
                    }
                }
            }
        }
    }

    private static void readMappings(int i, jgi jgiVar) throws yhc {
        int bits = jgiVar.readBits(6) + 1;
        for (int i2 = 0; i2 < bits; i2++) {
            int bits2 = jgiVar.readBits(16);
            if (bits2 != 0) {
                xh9.m25144e("VorbisUtil", "mapping type other than 0 not supported: " + bits2);
            } else {
                int bits3 = jgiVar.readBit() ? jgiVar.readBits(4) + 1 : 1;
                if (jgiVar.readBit()) {
                    int bits4 = jgiVar.readBits(8) + 1;
                    for (int i3 = 0; i3 < bits4; i3++) {
                        int i4 = i - 1;
                        jgiVar.skipBits(iLog(i4));
                        jgiVar.skipBits(iLog(i4));
                    }
                }
                if (jgiVar.readBits(2) != 0) {
                    throw yhc.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (bits3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        jgiVar.skipBits(4);
                    }
                }
                for (int i6 = 0; i6 < bits3; i6++) {
                    jgiVar.skipBits(8);
                    jgiVar.skipBits(8);
                    jgiVar.skipBits(8);
                }
            }
        }
    }

    private static C10373b[] readModes(jgi jgiVar) {
        int bits = jgiVar.readBits(6) + 1;
        C10373b[] c10373bArr = new C10373b[bits];
        for (int i = 0; i < bits; i++) {
            c10373bArr[i] = new C10373b(jgiVar.readBit(), jgiVar.readBits(16), jgiVar.readBits(16), jgiVar.readBits(8));
        }
        return c10373bArr;
    }

    private static void readResidues(jgi jgiVar) throws yhc {
        int bits = jgiVar.readBits(6) + 1;
        for (int i = 0; i < bits; i++) {
            if (jgiVar.readBits(16) > 2) {
                throw yhc.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            jgiVar.skipBits(24);
            jgiVar.skipBits(24);
            jgiVar.skipBits(24);
            int bits2 = jgiVar.readBits(6) + 1;
            jgiVar.skipBits(8);
            int[] iArr = new int[bits2];
            for (int i2 = 0; i2 < bits2; i2++) {
                iArr[i2] = ((jgiVar.readBit() ? jgiVar.readBits(5) : 0) * 8) + jgiVar.readBits(3);
            }
            for (int i3 = 0; i3 < bits2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        jgiVar.skipBits(8);
                    }
                }
            }
        }
    }

    public static C10372a readVorbisCommentHeader(jhc jhcVar) throws yhc {
        return readVorbisCommentHeader(jhcVar, true, true);
    }

    public static C10374c readVorbisIdentificationHeader(jhc jhcVar) throws yhc {
        verifyVorbisHeaderCapturePattern(1, jhcVar, false);
        int littleEndianUnsignedIntToInt = jhcVar.readLittleEndianUnsignedIntToInt();
        int unsignedByte = jhcVar.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = jhcVar.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = jhcVar.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = jhcVar.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = jhcVar.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = jhcVar.readUnsignedByte();
        return new C10374c(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) Math.pow(2.0d, unsignedByte2 & 15), (int) Math.pow(2.0d, (unsignedByte2 & 240) >> 4), (jhcVar.readUnsignedByte() & 1) > 0, Arrays.copyOf(jhcVar.getData(), jhcVar.limit()));
    }

    public static C10373b[] readVorbisModes(jhc jhcVar, int i) throws yhc {
        verifyVorbisHeaderCapturePattern(5, jhcVar, false);
        int unsignedByte = jhcVar.readUnsignedByte() + 1;
        jgi jgiVar = new jgi(jhcVar.getData());
        jgiVar.skipBits(jhcVar.getPosition() * 8);
        for (int i2 = 0; i2 < unsignedByte; i2++) {
            skipBook(jgiVar);
        }
        int bits = jgiVar.readBits(6) + 1;
        for (int i3 = 0; i3 < bits; i3++) {
            if (jgiVar.readBits(16) != 0) {
                throw yhc.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        readFloors(jgiVar);
        readResidues(jgiVar);
        readMappings(i, jgiVar);
        C10373b[] modes = readModes(jgiVar);
        if (jgiVar.readBit()) {
            return modes;
        }
        throw yhc.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    private static void skipBook(jgi jgiVar) throws yhc {
        if (jgiVar.readBits(24) != 5653314) {
            throw yhc.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + jgiVar.getPosition(), null);
        }
        int bits = jgiVar.readBits(16);
        int bits2 = jgiVar.readBits(24);
        int bits3 = 0;
        if (jgiVar.readBit()) {
            jgiVar.skipBits(5);
            while (bits3 < bits2) {
                bits3 += jgiVar.readBits(iLog(bits2 - bits3));
            }
        } else {
            boolean bit = jgiVar.readBit();
            while (bits3 < bits2) {
                if (!bit) {
                    jgiVar.skipBits(5);
                } else if (jgiVar.readBit()) {
                    jgiVar.skipBits(5);
                }
                bits3++;
            }
        }
        int bits4 = jgiVar.readBits(4);
        if (bits4 > 2) {
            throw yhc.createForMalformedContainer("lookup type greater than 2 not decodable: " + bits4, null);
        }
        if (bits4 == 1 || bits4 == 2) {
            jgiVar.skipBits(32);
            jgiVar.skipBits(32);
            int bits5 = jgiVar.readBits(4) + 1;
            jgiVar.skipBits(1);
            jgiVar.skipBits((int) ((bits4 == 1 ? bits != 0 ? mapType1QuantValues(bits2, bits) : 0L : ((long) bits) * ((long) bits2)) * ((long) bits5)));
        }
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i, jhc jhcVar, boolean z) throws yhc {
        if (jhcVar.bytesLeft() < 7) {
            if (z) {
                return false;
            }
            throw yhc.createForMalformedContainer("too short header: " + jhcVar.bytesLeft(), null);
        }
        if (jhcVar.readUnsignedByte() != i) {
            if (z) {
                return false;
            }
            throw yhc.createForMalformedContainer("expected header type " + Integer.toHexString(i), null);
        }
        if (jhcVar.readUnsignedByte() == 118 && jhcVar.readUnsignedByte() == 111 && jhcVar.readUnsignedByte() == 114 && jhcVar.readUnsignedByte() == 98 && jhcVar.readUnsignedByte() == 105 && jhcVar.readUnsignedByte() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw yhc.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static C10372a readVorbisCommentHeader(jhc jhcVar, boolean z, boolean z2) throws yhc {
        if (z) {
            verifyVorbisHeaderCapturePattern(3, jhcVar, false);
        }
        String string = jhcVar.readString((int) jhcVar.readLittleEndianUnsignedInt());
        int length = string.length();
        long littleEndianUnsignedInt = jhcVar.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) littleEndianUnsignedInt];
        int length2 = length + 15;
        for (int i = 0; i < littleEndianUnsignedInt; i++) {
            String string2 = jhcVar.readString((int) jhcVar.readLittleEndianUnsignedInt());
            strArr[i] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z2 && (jhcVar.readUnsignedByte() & 1) == 0) {
            throw yhc.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new C10372a(string, strArr, length2 + 1);
    }
}
