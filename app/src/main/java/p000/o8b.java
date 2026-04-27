package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o8b {

    /* JADX INFO: renamed from: a */
    public static final String f66662a = "NalUnitUtil";

    /* JADX INFO: renamed from: b */
    public static final int f66663b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f66664c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f66665d = 5;

    /* JADX INFO: renamed from: e */
    public static final int f66666e = 6;

    /* JADX INFO: renamed from: f */
    public static final int f66667f = 7;

    /* JADX INFO: renamed from: g */
    public static final int f66668g = 8;

    /* JADX INFO: renamed from: h */
    public static final int f66669h = 9;

    /* JADX INFO: renamed from: j */
    public static final int f66671j = 255;

    /* JADX INFO: renamed from: l */
    public static final int f66673l = 6;

    /* JADX INFO: renamed from: m */
    public static final int f66674m = 7;

    /* JADX INFO: renamed from: n */
    public static final int f66675n = 39;

    /* JADX INFO: renamed from: i */
    public static final byte[] f66670i = {0, 0, 0, 1};

    /* JADX INFO: renamed from: k */
    public static final float[] f66672k = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: o */
    public static final Object f66676o = new Object();

    /* JADX INFO: renamed from: p */
    public static int[] f66677p = new int[10];

    /* JADX INFO: renamed from: o8b$a */
    public static final class C10225a {

        /* JADX INFO: renamed from: a */
        public final int f66678a;

        /* JADX INFO: renamed from: b */
        public final boolean f66679b;

        /* JADX INFO: renamed from: c */
        public final int f66680c;

        /* JADX INFO: renamed from: d */
        public final int f66681d;

        /* JADX INFO: renamed from: e */
        public final int f66682e;

        /* JADX INFO: renamed from: f */
        public final int f66683f;

        /* JADX INFO: renamed from: g */
        public final int f66684g;

        /* JADX INFO: renamed from: h */
        public final int[] f66685h;

        /* JADX INFO: renamed from: i */
        public final int f66686i;

        /* JADX INFO: renamed from: j */
        public final int f66687j;

        /* JADX INFO: renamed from: k */
        public final int f66688k;

        /* JADX INFO: renamed from: l */
        public final int f66689l;

        /* JADX INFO: renamed from: m */
        public final float f66690m;

        /* JADX INFO: renamed from: n */
        public final int f66691n;

        /* JADX INFO: renamed from: o */
        public final int f66692o;

        /* JADX INFO: renamed from: p */
        public final int f66693p;

        public C10225a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13) {
            this.f66678a = i;
            this.f66679b = z;
            this.f66680c = i2;
            this.f66681d = i3;
            this.f66682e = i4;
            this.f66683f = i5;
            this.f66684g = i6;
            this.f66685h = iArr;
            this.f66686i = i7;
            this.f66687j = i8;
            this.f66688k = i9;
            this.f66689l = i10;
            this.f66690m = f;
            this.f66691n = i11;
            this.f66692o = i12;
            this.f66693p = i13;
        }
    }

    /* JADX INFO: renamed from: o8b$b */
    public static final class C10226b {

        /* JADX INFO: renamed from: a */
        public final int f66694a;

        /* JADX INFO: renamed from: b */
        public final int f66695b;

        /* JADX INFO: renamed from: c */
        public final boolean f66696c;

        public C10226b(int i, int i2, boolean z) {
            this.f66694a = i;
            this.f66695b = i2;
            this.f66696c = z;
        }
    }

    /* JADX INFO: renamed from: o8b$c */
    public static final class C10227c {

        /* JADX INFO: renamed from: a */
        public final int f66697a;

        /* JADX INFO: renamed from: b */
        public final int f66698b;

        /* JADX INFO: renamed from: c */
        public final int f66699c;

        /* JADX INFO: renamed from: d */
        public final int f66700d;

        /* JADX INFO: renamed from: e */
        public final int f66701e;

        /* JADX INFO: renamed from: f */
        public final int f66702f;

        /* JADX INFO: renamed from: g */
        public final int f66703g;

        /* JADX INFO: renamed from: h */
        public final float f66704h;

        /* JADX INFO: renamed from: i */
        public final boolean f66705i;

        /* JADX INFO: renamed from: j */
        public final boolean f66706j;

        /* JADX INFO: renamed from: k */
        public final int f66707k;

        /* JADX INFO: renamed from: l */
        public final int f66708l;

        /* JADX INFO: renamed from: m */
        public final int f66709m;

        /* JADX INFO: renamed from: n */
        public final boolean f66710n;

        /* JADX INFO: renamed from: o */
        public final int f66711o;

        /* JADX INFO: renamed from: p */
        public final int f66712p;

        /* JADX INFO: renamed from: q */
        public final int f66713q;

        public C10227c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, boolean z, boolean z2, int i8, int i9, int i10, boolean z3, int i11, int i12, int i13) {
            this.f66697a = i;
            this.f66698b = i2;
            this.f66699c = i3;
            this.f66700d = i4;
            this.f66701e = i5;
            this.f66702f = i6;
            this.f66703g = i7;
            this.f66704h = f;
            this.f66705i = z;
            this.f66706j = z2;
            this.f66707k = i8;
            this.f66708l = i9;
            this.f66709m = i10;
            this.f66710n = z3;
            this.f66711o = i11;
            this.f66712p = i12;
            this.f66713q = i13;
        }
    }

    private o8b() {
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    public static int findNalUnit(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        u80.checkState(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    clearPrefixFlags(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int getH265NalUnitType(byte[] bArr, int i) {
        return (bArr[i + 3] & BuiltinOptions.RightShiftOptions) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean isNalUnitSei(@hib String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b & BuiltinOptions.RightShiftOptions) >> 1) == 39;
    }

    public static C10225a parseH265SpsNalUnit(byte[] bArr, int i, int i2) {
        return parseH265SpsNalUnitPayload(bArr, i + 2, i2);
    }

    public static C10225a parseH265SpsNalUnitPayload(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iIsoTransferCharacteristicsToColorTransfer;
        khc khcVar = new khc(bArr, i, i2);
        khcVar.skipBits(4);
        int bits = khcVar.readBits(3);
        khcVar.skipBit();
        int bits2 = khcVar.readBits(2);
        boolean bit = khcVar.readBit();
        int bits3 = khcVar.readBits(5);
        int i6 = 0;
        for (int i7 = 0; i7 < 32; i7++) {
            if (khcVar.readBit()) {
                i6 |= 1 << i7;
            }
        }
        int[] iArr = new int[6];
        for (int i8 = 0; i8 < 6; i8++) {
            iArr[i8] = khcVar.readBits(8);
        }
        int bits4 = khcVar.readBits(8);
        int i9 = 0;
        for (int i10 = 0; i10 < bits; i10++) {
            if (khcVar.readBit()) {
                i9 += 89;
            }
            if (khcVar.readBit()) {
                i9 += 8;
            }
        }
        khcVar.skipBits(i9);
        if (bits > 0) {
            khcVar.skipBits((8 - bits) * 2);
        }
        int unsignedExpGolombCodedInt = khcVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = khcVar.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt2 == 3) {
            khcVar.skipBit();
        }
        int unsignedExpGolombCodedInt3 = khcVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt4 = khcVar.readUnsignedExpGolombCodedInt();
        if (khcVar.readBit()) {
            int unsignedExpGolombCodedInt5 = khcVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = khcVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt7 = khcVar.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt8 = khcVar.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt3 -= ((unsignedExpGolombCodedInt2 == 1 || unsignedExpGolombCodedInt2 == 2) ? 2 : 1) * (unsignedExpGolombCodedInt5 + unsignedExpGolombCodedInt6);
            unsignedExpGolombCodedInt4 -= (unsignedExpGolombCodedInt2 == 1 ? 2 : 1) * (unsignedExpGolombCodedInt7 + unsignedExpGolombCodedInt8);
        }
        int i11 = unsignedExpGolombCodedInt4;
        int i12 = unsignedExpGolombCodedInt3;
        int i13 = i11;
        int unsignedExpGolombCodedInt9 = khcVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt10 = khcVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt11 = khcVar.readUnsignedExpGolombCodedInt();
        for (int i14 = khcVar.readBit() ? 0 : bits; i14 <= bits; i14++) {
            khcVar.readUnsignedExpGolombCodedInt();
            khcVar.readUnsignedExpGolombCodedInt();
            khcVar.readUnsignedExpGolombCodedInt();
        }
        khcVar.readUnsignedExpGolombCodedInt();
        khcVar.readUnsignedExpGolombCodedInt();
        khcVar.readUnsignedExpGolombCodedInt();
        khcVar.readUnsignedExpGolombCodedInt();
        khcVar.readUnsignedExpGolombCodedInt();
        khcVar.readUnsignedExpGolombCodedInt();
        if (khcVar.readBit() && khcVar.readBit()) {
            skipH265ScalingList(khcVar);
        }
        khcVar.skipBits(2);
        if (khcVar.readBit()) {
            khcVar.skipBits(8);
            khcVar.readUnsignedExpGolombCodedInt();
            khcVar.readUnsignedExpGolombCodedInt();
            khcVar.skipBit();
        }
        skipShortTermReferencePictureSets(khcVar);
        if (khcVar.readBit()) {
            int unsignedExpGolombCodedInt12 = khcVar.readUnsignedExpGolombCodedInt();
            for (int i15 = 0; i15 < unsignedExpGolombCodedInt12; i15++) {
                khcVar.skipBits(unsignedExpGolombCodedInt11 + 5);
            }
        }
        khcVar.skipBits(2);
        int iIsoColorPrimariesToColorSpace = -1;
        float f = 1.0f;
        if (khcVar.readBit()) {
            if (khcVar.readBit()) {
                int bits5 = khcVar.readBits(8);
                if (bits5 == 255) {
                    int bits6 = khcVar.readBits(16);
                    int bits7 = khcVar.readBits(16);
                    if (bits6 != 0 && bits7 != 0) {
                        f = bits6 / bits7;
                    }
                } else {
                    float[] fArr = f66672k;
                    if (bits5 < fArr.length) {
                        f = fArr[bits5];
                    } else {
                        yh9.m25919w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + bits5);
                    }
                }
            }
            if (khcVar.readBit()) {
                khcVar.skipBit();
            }
            if (khcVar.readBit()) {
                khcVar.skipBits(3);
                i4 = khcVar.readBit() ? 1 : 2;
                if (khcVar.readBit()) {
                    int bits8 = khcVar.readBits(8);
                    int bits9 = khcVar.readBits(8);
                    khcVar.skipBits(8);
                    iIsoColorPrimariesToColorSpace = f92.isoColorPrimariesToColorSpace(bits8);
                    iIsoTransferCharacteristicsToColorTransfer = f92.isoTransferCharacteristicsToColorTransfer(bits9);
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                }
            } else {
                iIsoTransferCharacteristicsToColorTransfer = -1;
                i4 = -1;
            }
            if (khcVar.readBit()) {
                khcVar.readUnsignedExpGolombCodedInt();
                khcVar.readUnsignedExpGolombCodedInt();
            }
            khcVar.skipBit();
            if (khcVar.readBit()) {
                i13 *= 2;
            }
            i5 = iIsoTransferCharacteristicsToColorTransfer;
            i3 = iIsoColorPrimariesToColorSpace;
        } else {
            i3 = -1;
            i4 = -1;
            i5 = -1;
        }
        return new C10225a(bits2, bit, bits3, i6, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt9, unsignedExpGolombCodedInt10, iArr, bits4, unsignedExpGolombCodedInt, i12, i13, f, i3, i4, i5);
    }

    public static C10226b parsePpsNalUnit(byte[] bArr, int i, int i2) {
        return parsePpsNalUnitPayload(bArr, i + 1, i2);
    }

    public static C10226b parsePpsNalUnitPayload(byte[] bArr, int i, int i2) {
        khc khcVar = new khc(bArr, i, i2);
        int unsignedExpGolombCodedInt = khcVar.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = khcVar.readUnsignedExpGolombCodedInt();
        khcVar.skipBit();
        return new C10226b(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, khcVar.readBit());
    }

    public static C10227c parseSpsNalUnit(byte[] bArr, int i, int i2) {
        return parseSpsNalUnitPayload(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6 A[PHI: r16
  0x01b6: PHI (r16v5 float) = (r16v4 float), (r16v9 float) binds: [B:72:0x0131, B:89:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.o8b.C10227c parseSpsNalUnitPayload(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o8b.parseSpsNalUnitPayload(byte[], int, int):o8b$c");
    }

    private static void skipH265ScalingList(khc khcVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (khcVar.readBit()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        khcVar.readSignedExpGolombCodedInt();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        khcVar.readSignedExpGolombCodedInt();
                    }
                } else {
                    khcVar.readUnsignedExpGolombCodedInt();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void skipScalingList(khc khcVar, int i) {
        int signedExpGolombCodedInt = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((khcVar.readSignedExpGolombCodedInt() + i2) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i2 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipShortTermReferencePictureSets(khc khcVar) {
        int unsignedExpGolombCodedInt = khcVar.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < unsignedExpGolombCodedInt; i3++) {
            if (i3 == 0 || !khcVar.readBit()) {
                int unsignedExpGolombCodedInt2 = khcVar.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = khcVar.readUnsignedExpGolombCodedInt();
                int[] iArr2 = new int[unsignedExpGolombCodedInt2];
                int i4 = 0;
                while (i4 < unsignedExpGolombCodedInt2) {
                    iArr2[i4] = (i4 > 0 ? iArr2[i4 - 1] : 0) - (khcVar.readUnsignedExpGolombCodedInt() + 1);
                    khcVar.skipBit();
                    i4++;
                }
                int[] iArr3 = new int[unsignedExpGolombCodedInt3];
                int i5 = 0;
                while (i5 < unsignedExpGolombCodedInt3) {
                    iArr3[i5] = (i5 > 0 ? iArr3[i5 - 1] : 0) + khcVar.readUnsignedExpGolombCodedInt() + 1;
                    khcVar.skipBit();
                    i5++;
                }
                i = unsignedExpGolombCodedInt2;
                iArr = iArr2;
                i2 = unsignedExpGolombCodedInt3;
                iArrCopyOf = iArr3;
            } else {
                int i6 = i + i2;
                int unsignedExpGolombCodedInt4 = (1 - ((khcVar.readBit() ? 1 : 0) * 2)) * (khcVar.readUnsignedExpGolombCodedInt() + 1);
                int i7 = i6 + 1;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 <= i6; i8++) {
                    if (khcVar.readBit()) {
                        zArr[i8] = true;
                    } else {
                        zArr[i8] = khcVar.readBit();
                    }
                }
                int[] iArr4 = new int[i7];
                int[] iArr5 = new int[i7];
                int i9 = 0;
                for (int i10 = i2 - 1; i10 >= 0; i10--) {
                    int i11 = iArrCopyOf[i10] + unsignedExpGolombCodedInt4;
                    if (i11 < 0 && zArr[i + i10]) {
                        iArr4[i9] = i11;
                        i9++;
                    }
                }
                if (unsignedExpGolombCodedInt4 < 0 && zArr[i6]) {
                    iArr4[i9] = unsignedExpGolombCodedInt4;
                    i9++;
                }
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = iArr[i12] + unsignedExpGolombCodedInt4;
                    if (i13 < 0 && zArr[i12]) {
                        iArr4[i9] = i13;
                        i9++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i9);
                int i14 = 0;
                for (int i15 = i - 1; i15 >= 0; i15--) {
                    int i16 = iArr[i15] + unsignedExpGolombCodedInt4;
                    if (i16 > 0 && zArr[i15]) {
                        iArr5[i14] = i16;
                        i14++;
                    }
                }
                if (unsignedExpGolombCodedInt4 > 0 && zArr[i6]) {
                    iArr5[i14] = unsignedExpGolombCodedInt4;
                    i14++;
                }
                for (int i17 = 0; i17 < i2; i17++) {
                    int i18 = iArrCopyOf[i17] + unsignedExpGolombCodedInt4;
                    if (i18 > 0 && zArr[i + i17]) {
                        iArr5[i14] = i18;
                        i14++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i14);
                iArr = iArrCopyOf2;
                i = i9;
                i2 = i14;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i) {
        int i2;
        synchronized (f66676o) {
            int iFindNextUnescapeIndex = 0;
            int i3 = 0;
            while (iFindNextUnescapeIndex < i) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i);
                    if (iFindNextUnescapeIndex < i) {
                        int[] iArr = f66677p;
                        if (iArr.length <= i3) {
                            f66677p = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f66677p[i3] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i3++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i3;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = f66677p[i6] - i5;
                System.arraycopy(bArr, i5, bArr, i4, i7);
                int i8 = i4 + i7;
                int i9 = i8 + 1;
                bArr[i8] = 0;
                i4 = i8 + 2;
                bArr[i9] = 0;
                i5 += i7 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i4, i2 - i4);
        }
        return i2;
    }
}
