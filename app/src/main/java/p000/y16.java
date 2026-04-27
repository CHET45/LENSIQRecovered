package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y16 {

    /* JADX INFO: renamed from: g */
    public static final int f100004g = 15;

    /* JADX INFO: renamed from: h */
    @fdi
    public static final long f100005h = 1000000;

    /* JADX INFO: renamed from: c */
    public boolean f100008c;

    /* JADX INFO: renamed from: d */
    public boolean f100009d;

    /* JADX INFO: renamed from: f */
    public int f100011f;

    /* JADX INFO: renamed from: a */
    public C15369a f100006a = new C15369a();

    /* JADX INFO: renamed from: b */
    public C15369a f100007b = new C15369a();

    /* JADX INFO: renamed from: e */
    public long f100010e = -9223372036854775807L;

    /* JADX INFO: renamed from: y16$a */
    public static final class C15369a {

        /* JADX INFO: renamed from: a */
        public long f100012a;

        /* JADX INFO: renamed from: b */
        public long f100013b;

        /* JADX INFO: renamed from: c */
        public long f100014c;

        /* JADX INFO: renamed from: d */
        public long f100015d;

        /* JADX INFO: renamed from: e */
        public long f100016e;

        /* JADX INFO: renamed from: f */
        public long f100017f;

        /* JADX INFO: renamed from: g */
        public final boolean[] f100018g = new boolean[15];

        /* JADX INFO: renamed from: h */
        public int f100019h;

        private static int getRecentFrameOutlierIndex(long j) {
            return (int) (j % 15);
        }

        public long getFrameDurationNs() {
            long j = this.f100016e;
            if (j == 0) {
                return 0L;
            }
            return this.f100017f / j;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.f100017f;
        }

        public boolean isLastFrameOutlier() {
            long j = this.f100015d;
            if (j == 0) {
                return false;
            }
            return this.f100018g[getRecentFrameOutlierIndex(j - 1)];
        }

        public boolean isSynced() {
            return this.f100015d > 15 && this.f100019h == 0;
        }

        public void onNextFrame(long j) {
            long j2 = this.f100015d;
            if (j2 == 0) {
                this.f100012a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f100012a;
                this.f100013b = j3;
                this.f100017f = j3;
                this.f100016e = 1L;
            } else {
                long j4 = j - this.f100014c;
                int recentFrameOutlierIndex = getRecentFrameOutlierIndex(j2);
                if (Math.abs(j4 - this.f100013b) <= 1000000) {
                    this.f100016e++;
                    this.f100017f += j4;
                    boolean[] zArr = this.f100018g;
                    if (zArr[recentFrameOutlierIndex]) {
                        zArr[recentFrameOutlierIndex] = false;
                        this.f100019h--;
                    }
                } else {
                    boolean[] zArr2 = this.f100018g;
                    if (!zArr2[recentFrameOutlierIndex]) {
                        zArr2[recentFrameOutlierIndex] = true;
                        this.f100019h++;
                    }
                }
            }
            this.f100015d++;
            this.f100014c = j;
        }

        public void reset() {
            this.f100015d = 0L;
            this.f100016e = 0L;
            this.f100017f = 0L;
            this.f100019h = 0;
            Arrays.fill(this.f100018g, false);
        }
    }

    public long getFrameDurationNs() {
        if (isSynced()) {
            return this.f100006a.getFrameDurationNs();
        }
        return -9223372036854775807L;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.f100006a.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.f100011f;
    }

    public long getMatchingFrameDurationSumNs() {
        if (isSynced()) {
            return this.f100006a.getMatchingFrameDurationSumNs();
        }
        return -9223372036854775807L;
    }

    public boolean isSynced() {
        return this.f100006a.isSynced();
    }

    public void onNextFrame(long j) {
        this.f100006a.onNextFrame(j);
        if (this.f100006a.isSynced() && !this.f100009d) {
            this.f100008c = false;
        } else if (this.f100010e != -9223372036854775807L) {
            if (!this.f100008c || this.f100007b.isLastFrameOutlier()) {
                this.f100007b.reset();
                this.f100007b.onNextFrame(this.f100010e);
            }
            this.f100008c = true;
            this.f100007b.onNextFrame(j);
        }
        if (this.f100008c && this.f100007b.isSynced()) {
            C15369a c15369a = this.f100006a;
            this.f100006a = this.f100007b;
            this.f100007b = c15369a;
            this.f100008c = false;
            this.f100009d = false;
        }
        this.f100010e = j;
        this.f100011f = this.f100006a.isSynced() ? 0 : this.f100011f + 1;
    }

    public void reset() {
        this.f100006a.reset();
        this.f100007b.reset();
        this.f100008c = false;
        this.f100010e = -9223372036854775807L;
        this.f100011f = 0;
    }
}
