package p000;

import java.nio.ByteBuffer;
import org.opencv.videoio.Videoio;

/* JADX INFO: renamed from: z5 */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C16006z5 {

    /* JADX INFO: renamed from: a */
    public static final int f104180a = -1;

    /* JADX INFO: renamed from: b */
    public static final int f104181b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f104182c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f104183d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f104184e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f104185f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f104186g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f104187h = 6;

    /* JADX INFO: renamed from: i */
    public static final int f104188i = 7;

    /* JADX INFO: renamed from: j */
    public static final int f104189j = 8;

    /* JADX INFO: renamed from: k */
    public static final int f104190k = 9;

    /* JADX INFO: renamed from: l */
    public static final int f104191l = 10;

    /* JADX INFO: renamed from: m */
    public static final int f104192m = 11;

    /* JADX INFO: renamed from: n */
    public static final int f104193n = 12;

    /* JADX INFO: renamed from: o */
    public static final int f104194o = 13;

    /* JADX INFO: renamed from: p */
    public static final int f104195p = 14;

    /* JADX INFO: renamed from: q */
    public static final int f104196q = 15;

    /* JADX INFO: renamed from: r */
    public static final int f104197r = 44096;

    /* JADX INFO: renamed from: s */
    public static final int f104198s = 44097;

    /* JADX INFO: renamed from: t */
    public static final int f104199t = 336000;

    /* JADX INFO: renamed from: u */
    public static final String f104200u = "Ac4Util";

    /* JADX INFO: renamed from: v */
    public static final int f104201v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f104202w = 7;

    /* JADX INFO: renamed from: x */
    public static final int f104203x = 16;

    /* JADX INFO: renamed from: y */
    public static final int[] f104204y = {2002, 2000, 1920, 1601, Videoio.CAP_OPENNI2, 1001, 1000, 960, 800, 800, Videoio.CAP_PROP_XI_CC_MATRIX_01, 400, 400, 2048};

    /* JADX INFO: renamed from: z5$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public boolean f104205a;

        /* JADX INFO: renamed from: b */
        public int f104206b;

        /* JADX INFO: renamed from: c */
        public int f104207c;

        /* JADX INFO: renamed from: d */
        public boolean f104208d;

        /* JADX INFO: renamed from: e */
        public int f104209e;

        /* JADX INFO: renamed from: f */
        public int f104210f;

        /* JADX INFO: renamed from: g */
        public int f104211g;

        private b() {
            this.f104205a = true;
            this.f104206b = -1;
            this.f104207c = -1;
            this.f104208d = true;
            this.f104209e = 2;
            this.f104210f = 1;
            this.f104211g = 0;
        }
    }

    /* JADX INFO: renamed from: z5$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f104212a;

        /* JADX INFO: renamed from: b */
        public final int f104213b;

        /* JADX INFO: renamed from: c */
        public final int f104214c;

        /* JADX INFO: renamed from: d */
        public final int f104215d;

        /* JADX INFO: renamed from: e */
        public final int f104216e;

        private c(int i, int i2, int i3, int i4, int i5) {
            this.f104212a = i;
            this.f104214c = i2;
            this.f104213b = i3;
            this.f104215d = i4;
            this.f104216e = i5;
        }
    }

    private C16006z5() {
    }

    private static String createCodecsString(int i, int i2, int i3) {
        return t0i.formatInvariant("ac-4.%02d.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void getAc4SampleHeader(int i, jhc jhcVar) {
        jhcVar.reset(7);
        byte[] data = jhcVar.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i >> 16) & 255);
        data[5] = (byte) ((i >> 8) & 255);
        data[6] = (byte) (i & 255);
    }

    private static int getAdjustedChannelCount(int i, boolean z, int i2) {
        int channelCountFromChannelMode = getChannelCountFromChannelMode(i);
        if (i != 11 && i != 12 && i != 13 && i != 14) {
            return channelCountFromChannelMode;
        }
        if (!z) {
            channelCountFromChannelMode -= 2;
        }
        return i2 != 0 ? i2 != 1 ? channelCountFromChannelMode : channelCountFromChannelMode - 2 : channelCountFromChannelMode - 4;
    }

    private static int getChannelCountFromChannelMode(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.common.C1213a parseAc4AnnexEFormat(p000.jhc r18, java.lang.String r19, @p000.hib java.lang.String r20, @p000.hib androidx.media3.common.DrmInitData r21) throws p000.yhc {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C16006z5.parseAc4AnnexEFormat(jhc, java.lang.String, java.lang.String, androidx.media3.common.DrmInitData):androidx.media3.common.a");
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new hhc(bArr)).f104216e;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C16006z5.c parseAc4SyncframeInfo(p000.hhc r11) {
        /*
            r0 = 16
            int r1 = r11.readBits(r0)
            int r0 = r11.readBits(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.readBits(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.readBits(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = readVariableBits(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.readBits(r1)
            boolean r4 = r11.readBit()
            if (r4 == 0) goto L45
            int r4 = r11.readBits(r2)
            if (r4 <= 0) goto L45
            r11.skipBits(r0)
        L45:
            boolean r4 = r11.readBit()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r9 = r7
            goto L54
        L53:
            r9 = r6
        L54:
            int r11 = r11.readBits(r3)
            if (r9 != r6) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = p000.C16006z5.f104204y
            r11 = r0[r11]
            goto L91
        L63:
            if (r9 != r7) goto L90
            int[] r4 = p000.C16006z5.f104204y
            int r6 = r4.length
            if (r11 >= r6) goto L90
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L8b
            r7 = 11
            if (r1 == r0) goto L86
            if (r1 == r2) goto L8b
            if (r1 == r3) goto L7c
            goto L84
        L7c:
            if (r11 == r2) goto L82
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
        L82:
            int r4 = r4 + 1
        L84:
            r11 = r4
            goto L91
        L86:
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
            goto L82
        L8b:
            if (r11 == r2) goto L82
            if (r11 != r6) goto L84
            goto L82
        L90:
            r11 = 0
        L91:
            z5$c r0 = new z5$c
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C16006z5.parseAc4SyncframeInfo(hhc):z5$c");
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    private static void parseDsiSubstream(hhc hhcVar, b bVar) throws yhc {
        int bits = hhcVar.readBits(5);
        hhcVar.skipBits(2);
        if (hhcVar.readBit()) {
            hhcVar.skipBits(5);
        }
        if (bits >= 7 && bits <= 10) {
            hhcVar.skipBit();
        }
        if (hhcVar.readBit()) {
            int bits2 = hhcVar.readBits(3);
            if (bVar.f104206b == -1 && bits >= 0 && bits <= 15 && (bits2 == 0 || bits2 == 1)) {
                bVar.f104206b = bits;
            }
            if (hhcVar.readBit()) {
                skipDsiLanguage(hhcVar);
            }
        }
    }

    private static void parseDsiSubstreamGroup(hhc hhcVar, b bVar) throws yhc {
        hhcVar.skipBits(2);
        boolean bit = hhcVar.readBit();
        int bits = hhcVar.readBits(8);
        for (int i = 0; i < bits; i++) {
            hhcVar.skipBits(2);
            if (hhcVar.readBit()) {
                hhcVar.skipBits(5);
            }
            if (bit) {
                hhcVar.skipBits(24);
            } else {
                if (hhcVar.readBit()) {
                    if (!hhcVar.readBit()) {
                        hhcVar.skipBits(4);
                    }
                    bVar.f104207c = hhcVar.readBits(6) + 1;
                }
                hhcVar.skipBits(4);
            }
        }
        if (hhcVar.readBit()) {
            hhcVar.skipBits(3);
            if (hhcVar.readBit()) {
                skipDsiLanguage(hhcVar);
            }
        }
    }

    private static int readVariableBits(hhc hhcVar, int i) {
        int i2 = 0;
        while (true) {
            int bits = i2 + hhcVar.readBits(i);
            if (!hhcVar.readBit()) {
                return bits;
            }
            i2 = (bits + 1) << i;
        }
    }

    private static boolean skipDsiBitrate(hhc hhcVar) {
        if (hhcVar.bitsLeft() < 66) {
            return false;
        }
        hhcVar.skipBits(66);
        return true;
    }

    private static void skipDsiLanguage(hhc hhcVar) throws yhc {
        int bits = hhcVar.readBits(6);
        if (bits < 2 || bits > 42) {
            throw yhc.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(bits)));
        }
        hhcVar.skipBits(bits * 8);
    }
}
