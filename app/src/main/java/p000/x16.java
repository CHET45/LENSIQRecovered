package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class x16 {

    /* JADX INFO: renamed from: g */
    public static final int f96007g = 15;

    /* JADX INFO: renamed from: h */
    @fdi
    public static final long f96008h = 1000000;

    /* JADX INFO: renamed from: c */
    public boolean f96011c;

    /* JADX INFO: renamed from: d */
    public boolean f96012d;

    /* JADX INFO: renamed from: f */
    public int f96014f;

    /* JADX INFO: renamed from: a */
    public C14872a f96009a = new C14872a();

    /* JADX INFO: renamed from: b */
    public C14872a f96010b = new C14872a();

    /* JADX INFO: renamed from: e */
    public long f96013e = -9223372036854775807L;

    /* JADX INFO: renamed from: x16$a */
    public static final class C14872a {

        /* JADX INFO: renamed from: a */
        public long f96015a;

        /* JADX INFO: renamed from: b */
        public long f96016b;

        /* JADX INFO: renamed from: c */
        public long f96017c;

        /* JADX INFO: renamed from: d */
        public long f96018d;

        /* JADX INFO: renamed from: e */
        public long f96019e;

        /* JADX INFO: renamed from: f */
        public long f96020f;

        /* JADX INFO: renamed from: g */
        public final boolean[] f96021g = new boolean[15];

        /* JADX INFO: renamed from: h */
        public int f96022h;

        private static int getRecentFrameOutlierIndex(long j) {
            return (int) (j % 15);
        }

        public long getFrameDurationNs() {
            long j = this.f96019e;
            if (j == 0) {
                return 0L;
            }
            return this.f96020f / j;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.f96020f;
        }

        public boolean isLastFrameOutlier() {
            long j = this.f96018d;
            if (j == 0) {
                return false;
            }
            return this.f96021g[getRecentFrameOutlierIndex(j - 1)];
        }

        public boolean isSynced() {
            return this.f96018d > 15 && this.f96022h == 0;
        }

        public void onNextFrame(long j) {
            long j2 = this.f96018d;
            if (j2 == 0) {
                this.f96015a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f96015a;
                this.f96016b = j3;
                this.f96020f = j3;
                this.f96019e = 1L;
            } else {
                long j4 = j - this.f96017c;
                int recentFrameOutlierIndex = getRecentFrameOutlierIndex(j2);
                if (Math.abs(j4 - this.f96016b) <= 1000000) {
                    this.f96019e++;
                    this.f96020f += j4;
                    boolean[] zArr = this.f96021g;
                    if (zArr[recentFrameOutlierIndex]) {
                        zArr[recentFrameOutlierIndex] = false;
                        this.f96022h--;
                    }
                } else {
                    boolean[] zArr2 = this.f96021g;
                    if (!zArr2[recentFrameOutlierIndex]) {
                        zArr2[recentFrameOutlierIndex] = true;
                        this.f96022h++;
                    }
                }
            }
            this.f96018d++;
            this.f96017c = j;
        }

        public void reset() {
            this.f96018d = 0L;
            this.f96019e = 0L;
            this.f96020f = 0L;
            this.f96022h = 0;
            Arrays.fill(this.f96021g, false);
        }
    }

    public long getFrameDurationNs() {
        if (isSynced()) {
            return this.f96009a.getFrameDurationNs();
        }
        return -9223372036854775807L;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.f96009a.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.f96014f;
    }

    public long getMatchingFrameDurationSumNs() {
        if (isSynced()) {
            return this.f96009a.getMatchingFrameDurationSumNs();
        }
        return -9223372036854775807L;
    }

    public boolean isSynced() {
        return this.f96009a.isSynced();
    }

    public void onNextFrame(long j) {
        this.f96009a.onNextFrame(j);
        if (this.f96009a.isSynced() && !this.f96012d) {
            this.f96011c = false;
        } else if (this.f96013e != -9223372036854775807L) {
            if (!this.f96011c || this.f96010b.isLastFrameOutlier()) {
                this.f96010b.reset();
                this.f96010b.onNextFrame(this.f96013e);
            }
            this.f96011c = true;
            this.f96010b.onNextFrame(j);
        }
        if (this.f96011c && this.f96010b.isSynced()) {
            C14872a c14872a = this.f96009a;
            this.f96009a = this.f96010b;
            this.f96010b = c14872a;
            this.f96011c = false;
            this.f96012d = false;
        }
        this.f96013e = j;
        this.f96014f = this.f96009a.isSynced() ? 0 : this.f96014f + 1;
    }

    public void reset() {
        this.f96009a.reset();
        this.f96010b.reset();
        this.f96011c = false;
        this.f96013e = -9223372036854775807L;
        this.f96014f = 0;
    }
}
