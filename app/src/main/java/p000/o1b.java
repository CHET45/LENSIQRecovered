package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class o1b {

    /* JADX INFO: renamed from: a */
    public static final int f66208a = 4096;

    /* JADX INFO: renamed from: b */
    public static final int f66209b = 40000;

    /* JADX INFO: renamed from: c */
    public static final String[] f66210c = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: d */
    public static final int[] f66211d = {44100, 48000, 32000};

    /* JADX INFO: renamed from: e */
    public static final int[] f66212e = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: f */
    public static final int[] f66213f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: g */
    public static final int[] f66214g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: h */
    public static final int[] f66215h = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: i */
    public static final int[] f66216i = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: j */
    public static final int f66217j = 384;

    /* JADX INFO: renamed from: k */
    public static final int f66218k = 1152;

    /* JADX INFO: renamed from: l */
    public static final int f66219l = 1152;

    /* JADX INFO: renamed from: m */
    public static final int f66220m = 576;

    /* JADX INFO: renamed from: o1b$a */
    public static final class C10138a {

        /* JADX INFO: renamed from: a */
        public int f66221a;

        /* JADX INFO: renamed from: b */
        @hib
        public String f66222b;

        /* JADX INFO: renamed from: c */
        public int f66223c;

        /* JADX INFO: renamed from: d */
        public int f66224d;

        /* JADX INFO: renamed from: e */
        public int f66225e;

        /* JADX INFO: renamed from: f */
        public int f66226f;

        /* JADX INFO: renamed from: g */
        public int f66227g;

        public C10138a() {
        }

        public boolean setForHeaderData(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!o1b.isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f66221a = i2;
            this.f66222b = o1b.f66210c[3 - i3];
            int i6 = o1b.f66211d[i5];
            this.f66224d = i6;
            if (i2 == 2) {
                this.f66224d = i6 / 2;
            } else if (i2 == 0) {
                this.f66224d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.f66227g = o1b.getFrameSizeInSamples(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? o1b.f66212e[i4 - 1] : o1b.f66213f[i4 - 1];
                this.f66226f = i8;
                this.f66223c = (((i8 * 12) / this.f66224d) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i9 = i3 == 2 ? o1b.f66214g[i4 - 1] : o1b.f66215h[i4 - 1];
                    this.f66226f = i9;
                    this.f66223c = ((i9 * 144) / this.f66224d) + i7;
                } else {
                    int i10 = o1b.f66216i[i4 - 1];
                    this.f66226f = i10;
                    this.f66223c = (((i3 == 1 ? 72 : 144) * i10) / this.f66224d) + i7;
                }
            }
            this.f66225e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public C10138a(C10138a c10138a) {
            this.f66221a = c10138a.f66221a;
            this.f66222b = c10138a.f66222b;
            this.f66223c = c10138a.f66223c;
            this.f66224d = c10138a.f66224d;
            this.f66225e = c10138a.f66225e;
            this.f66226f = c10138a.f66226f;
            this.f66227g = c10138a.f66227g;
        }
    }

    private o1b() {
    }

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!isMagicPresent(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f66211d[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f66212e[i4 - 1] : f66213f[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f66214g[i4 - 1] : f66215h[i4 - 1] : f66216i[i4 - 1];
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
