package p000;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class pgi {

    /* JADX INFO: renamed from: a */
    public static final String f70720a = "VorbisUtil";

    /* JADX INFO: renamed from: pgi$a */
    public static final class C10955a {

        /* JADX INFO: renamed from: a */
        public final String f70721a;

        /* JADX INFO: renamed from: b */
        public final String[] f70722b;

        /* JADX INFO: renamed from: c */
        public final int f70723c;

        public C10955a(String str, String[] strArr, int i) {
            this.f70721a = str;
            this.f70722b = strArr;
            this.f70723c = i;
        }
    }

    /* JADX INFO: renamed from: pgi$b */
    public static final class C10956b {

        /* JADX INFO: renamed from: a */
        public final boolean f70724a;

        /* JADX INFO: renamed from: b */
        public final int f70725b;

        /* JADX INFO: renamed from: c */
        public final int f70726c;

        /* JADX INFO: renamed from: d */
        public final int f70727d;

        public C10956b(boolean z, int i, int i2, int i3) {
            this.f70724a = z;
            this.f70725b = i;
            this.f70726c = i2;
            this.f70727d = i3;
        }
    }

    /* JADX INFO: renamed from: pgi$c */
    public static final class C10957c {

        /* JADX INFO: renamed from: a */
        public final int f70728a;

        /* JADX INFO: renamed from: b */
        public final int f70729b;

        /* JADX INFO: renamed from: c */
        public final int f70730c;

        /* JADX INFO: renamed from: d */
        public final int f70731d;

        /* JADX INFO: renamed from: e */
        public final int f70732e;

        /* JADX INFO: renamed from: f */
        public final int f70733f;

        /* JADX INFO: renamed from: g */
        public final int f70734g;

        /* JADX INFO: renamed from: h */
        public final int f70735h;

        /* JADX INFO: renamed from: i */
        public final boolean f70736i;

        /* JADX INFO: renamed from: j */
        public final byte[] f70737j;

        public C10957c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f70728a = i;
            this.f70729b = i2;
            this.f70730c = i3;
            this.f70731d = i4;
            this.f70732e = i5;
            this.f70733f = i6;
            this.f70734g = i7;
            this.f70735h = i8;
            this.f70736i = z;
            this.f70737j = bArr;
        }
    }

    private pgi() {
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
    public static Metadata parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrSplitAtFirst = x0i.splitAtFirst(str, "=");
            if (strArrSplitAtFirst.length != 2) {
                yh9.m25919w("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new ihc(Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (RuntimeException e) {
                    yh9.m25920w("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void readFloors(igi igiVar) throws xhc {
        int bits = igiVar.readBits(6) + 1;
        for (int i = 0; i < bits; i++) {
            int bits2 = igiVar.readBits(16);
            if (bits2 == 0) {
                igiVar.skipBits(8);
                igiVar.skipBits(16);
                igiVar.skipBits(16);
                igiVar.skipBits(6);
                igiVar.skipBits(8);
                int bits3 = igiVar.readBits(4) + 1;
                for (int i2 = 0; i2 < bits3; i2++) {
                    igiVar.skipBits(8);
                }
            } else {
                if (bits2 != 1) {
                    throw xhc.createForMalformedContainer("floor type greater than 1 not decodable: " + bits2, null);
                }
                int bits4 = igiVar.readBits(5);
                int[] iArr = new int[bits4];
                int i3 = -1;
                for (int i4 = 0; i4 < bits4; i4++) {
                    int bits5 = igiVar.readBits(4);
                    iArr[i4] = bits5;
                    if (bits5 > i3) {
                        i3 = bits5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = igiVar.readBits(3) + 1;
                    int bits6 = igiVar.readBits(2);
                    if (bits6 > 0) {
                        igiVar.skipBits(8);
                    }
                    for (int i7 = 0; i7 < (1 << bits6); i7++) {
                        igiVar.skipBits(8);
                    }
                }
                igiVar.skipBits(2);
                int bits7 = igiVar.readBits(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < bits4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        igiVar.skipBits(bits7);
                        i9++;
                    }
                }
            }
        }
    }

    private static void readMappings(int i, igi igiVar) throws xhc {
        int bits = igiVar.readBits(6) + 1;
        for (int i2 = 0; i2 < bits; i2++) {
            int bits2 = igiVar.readBits(16);
            if (bits2 != 0) {
                yh9.m25915e("VorbisUtil", "mapping type other than 0 not supported: " + bits2);
            } else {
                int bits3 = igiVar.readBit() ? igiVar.readBits(4) + 1 : 1;
                if (igiVar.readBit()) {
                    int bits4 = igiVar.readBits(8) + 1;
                    for (int i3 = 0; i3 < bits4; i3++) {
                        int i4 = i - 1;
                        igiVar.skipBits(iLog(i4));
                        igiVar.skipBits(iLog(i4));
                    }
                }
                if (igiVar.readBits(2) != 0) {
                    throw xhc.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (bits3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        igiVar.skipBits(4);
                    }
                }
                for (int i6 = 0; i6 < bits3; i6++) {
                    igiVar.skipBits(8);
                    igiVar.skipBits(8);
                    igiVar.skipBits(8);
                }
            }
        }
    }

    private static C10956b[] readModes(igi igiVar) {
        int bits = igiVar.readBits(6) + 1;
        C10956b[] c10956bArr = new C10956b[bits];
        for (int i = 0; i < bits; i++) {
            c10956bArr[i] = new C10956b(igiVar.readBit(), igiVar.readBits(16), igiVar.readBits(16), igiVar.readBits(8));
        }
        return c10956bArr;
    }

    private static void readResidues(igi igiVar) throws xhc {
        int bits = igiVar.readBits(6) + 1;
        for (int i = 0; i < bits; i++) {
            if (igiVar.readBits(16) > 2) {
                throw xhc.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            igiVar.skipBits(24);
            igiVar.skipBits(24);
            igiVar.skipBits(24);
            int bits2 = igiVar.readBits(6) + 1;
            igiVar.skipBits(8);
            int[] iArr = new int[bits2];
            for (int i2 = 0; i2 < bits2; i2++) {
                iArr[i2] = ((igiVar.readBit() ? igiVar.readBits(5) : 0) * 8) + igiVar.readBits(3);
            }
            for (int i3 = 0; i3 < bits2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        igiVar.skipBits(8);
                    }
                }
            }
        }
    }

    public static C10955a readVorbisCommentHeader(ihc ihcVar) throws xhc {
        return readVorbisCommentHeader(ihcVar, true, true);
    }

    public static C10957c readVorbisIdentificationHeader(ihc ihcVar) throws xhc {
        verifyVorbisHeaderCapturePattern(1, ihcVar, false);
        int littleEndianUnsignedIntToInt = ihcVar.readLittleEndianUnsignedIntToInt();
        int unsignedByte = ihcVar.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = ihcVar.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = ihcVar.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = ihcVar.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = ihcVar.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = ihcVar.readUnsignedByte();
        return new C10957c(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) Math.pow(2.0d, unsignedByte2 & 15), (int) Math.pow(2.0d, (unsignedByte2 & 240) >> 4), (ihcVar.readUnsignedByte() & 1) > 0, Arrays.copyOf(ihcVar.getData(), ihcVar.limit()));
    }

    public static C10956b[] readVorbisModes(ihc ihcVar, int i) throws xhc {
        verifyVorbisHeaderCapturePattern(5, ihcVar, false);
        int unsignedByte = ihcVar.readUnsignedByte() + 1;
        igi igiVar = new igi(ihcVar.getData());
        igiVar.skipBits(ihcVar.getPosition() * 8);
        for (int i2 = 0; i2 < unsignedByte; i2++) {
            skipBook(igiVar);
        }
        int bits = igiVar.readBits(6) + 1;
        for (int i3 = 0; i3 < bits; i3++) {
            if (igiVar.readBits(16) != 0) {
                throw xhc.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        readFloors(igiVar);
        readResidues(igiVar);
        readMappings(i, igiVar);
        C10956b[] modes = readModes(igiVar);
        if (igiVar.readBit()) {
            return modes;
        }
        throw xhc.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    private static void skipBook(igi igiVar) throws xhc {
        if (igiVar.readBits(24) != 5653314) {
            throw xhc.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + igiVar.getPosition(), null);
        }
        int bits = igiVar.readBits(16);
        int bits2 = igiVar.readBits(24);
        int bits3 = 0;
        if (igiVar.readBit()) {
            igiVar.skipBits(5);
            while (bits3 < bits2) {
                bits3 += igiVar.readBits(iLog(bits2 - bits3));
            }
        } else {
            boolean bit = igiVar.readBit();
            while (bits3 < bits2) {
                if (!bit) {
                    igiVar.skipBits(5);
                } else if (igiVar.readBit()) {
                    igiVar.skipBits(5);
                }
                bits3++;
            }
        }
        int bits4 = igiVar.readBits(4);
        if (bits4 > 2) {
            throw xhc.createForMalformedContainer("lookup type greater than 2 not decodable: " + bits4, null);
        }
        if (bits4 == 1 || bits4 == 2) {
            igiVar.skipBits(32);
            igiVar.skipBits(32);
            int bits5 = igiVar.readBits(4) + 1;
            igiVar.skipBits(1);
            igiVar.skipBits((int) ((bits4 == 1 ? bits != 0 ? mapType1QuantValues(bits2, bits) : 0L : ((long) bits) * ((long) bits2)) * ((long) bits5)));
        }
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i, ihc ihcVar, boolean z) throws xhc {
        if (ihcVar.bytesLeft() < 7) {
            if (z) {
                return false;
            }
            throw xhc.createForMalformedContainer("too short header: " + ihcVar.bytesLeft(), null);
        }
        if (ihcVar.readUnsignedByte() != i) {
            if (z) {
                return false;
            }
            throw xhc.createForMalformedContainer("expected header type " + Integer.toHexString(i), null);
        }
        if (ihcVar.readUnsignedByte() == 118 && ihcVar.readUnsignedByte() == 111 && ihcVar.readUnsignedByte() == 114 && ihcVar.readUnsignedByte() == 98 && ihcVar.readUnsignedByte() == 105 && ihcVar.readUnsignedByte() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw xhc.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static C10955a readVorbisCommentHeader(ihc ihcVar, boolean z, boolean z2) throws xhc {
        if (z) {
            verifyVorbisHeaderCapturePattern(3, ihcVar, false);
        }
        String string = ihcVar.readString((int) ihcVar.readLittleEndianUnsignedInt());
        int length = string.length();
        long littleEndianUnsignedInt = ihcVar.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) littleEndianUnsignedInt];
        int length2 = length + 15;
        for (int i = 0; i < littleEndianUnsignedInt; i++) {
            String string2 = ihcVar.readString((int) ihcVar.readLittleEndianUnsignedInt());
            strArr[i] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z2 && (ihcVar.readUnsignedByte() & 1) == 0) {
            throw xhc.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new C10955a(string, strArr, length2 + 1);
    }
}
