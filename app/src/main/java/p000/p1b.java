package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p1b {

    /* JADX INFO: renamed from: a */
    public static final int f69407a = 4096;

    /* JADX INFO: renamed from: b */
    public static final int f69408b = 40000;

    /* JADX INFO: renamed from: c */
    public static final String[] f69409c = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: d */
    public static final int[] f69410d = {44100, 48000, 32000};

    /* JADX INFO: renamed from: e */
    public static final int[] f69411e = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: f */
    public static final int[] f69412f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: g */
    public static final int[] f69413g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: h */
    public static final int[] f69414h = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: i */
    public static final int[] f69415i = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: j */
    public static final int f69416j = 384;

    /* JADX INFO: renamed from: k */
    public static final int f69417k = 1152;

    /* JADX INFO: renamed from: l */
    public static final int f69418l = 1152;

    /* JADX INFO: renamed from: m */
    public static final int f69419m = 576;

    /* JADX INFO: renamed from: p1b$a */
    public static final class C10751a {

        /* JADX INFO: renamed from: a */
        public int f69420a;

        /* JADX INFO: renamed from: b */
        @hib
        public String f69421b;

        /* JADX INFO: renamed from: c */
        public int f69422c;

        /* JADX INFO: renamed from: d */
        public int f69423d;

        /* JADX INFO: renamed from: e */
        public int f69424e;

        /* JADX INFO: renamed from: f */
        public int f69425f;

        /* JADX INFO: renamed from: g */
        public int f69426g;

        public boolean setForHeaderData(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!p1b.isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f69420a = i2;
            this.f69421b = p1b.f69409c[3 - i3];
            int i6 = p1b.f69410d[i5];
            this.f69423d = i6;
            if (i2 == 2) {
                this.f69423d = i6 / 2;
            } else if (i2 == 0) {
                this.f69423d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.f69426g = p1b.getFrameSizeInSamples(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? p1b.f69411e[i4 - 1] : p1b.f69412f[i4 - 1];
                this.f69425f = i8;
                this.f69422c = (((i8 * 12) / this.f69423d) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i9 = i3 == 2 ? p1b.f69413g[i4 - 1] : p1b.f69414h[i4 - 1];
                    this.f69425f = i9;
                    this.f69422c = ((i9 * 144) / this.f69423d) + i7;
                } else {
                    int i10 = p1b.f69415i[i4 - 1];
                    this.f69425f = i10;
                    this.f69422c = (((i3 == 1 ? 72 : 144) * i10) / this.f69423d) + i7;
                }
            }
            this.f69424e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    private p1b() {
    }

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f69410d[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f69411e[i4 - 1] : f69412f[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f69413g[i4 - 1] : f69414h[i4 - 1] : f69415i[i4 - 1];
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        return (((i3 == 1 ? 72 : 144) * i8) / i6) + i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i) {
        int i2;
        int i3;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i2, i3);
    }
}
