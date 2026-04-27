package p000;

import android.os.SystemClock;
import p000.aga;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class lw3 implements vb9 {

    /* JADX INFO: renamed from: t */
    public static final float f58953t = 0.97f;

    /* JADX INFO: renamed from: u */
    public static final float f58954u = 1.03f;

    /* JADX INFO: renamed from: v */
    public static final long f58955v = 1000;

    /* JADX INFO: renamed from: w */
    public static final float f58956w = 0.1f;

    /* JADX INFO: renamed from: x */
    public static final long f58957x = 500;

    /* JADX INFO: renamed from: y */
    public static final float f58958y = 0.999f;

    /* JADX INFO: renamed from: z */
    public static final long f58959z = 20;

    /* JADX INFO: renamed from: a */
    public final float f58960a;

    /* JADX INFO: renamed from: b */
    public final float f58961b;

    /* JADX INFO: renamed from: c */
    public final long f58962c;

    /* JADX INFO: renamed from: d */
    public final float f58963d;

    /* JADX INFO: renamed from: e */
    public final long f58964e;

    /* JADX INFO: renamed from: f */
    public final long f58965f;

    /* JADX INFO: renamed from: g */
    public final float f58966g;

    /* JADX INFO: renamed from: h */
    public long f58967h;

    /* JADX INFO: renamed from: i */
    public long f58968i;

    /* JADX INFO: renamed from: j */
    public long f58969j;

    /* JADX INFO: renamed from: k */
    public long f58970k;

    /* JADX INFO: renamed from: l */
    public long f58971l;

    /* JADX INFO: renamed from: m */
    public long f58972m;

    /* JADX INFO: renamed from: n */
    public float f58973n;

    /* JADX INFO: renamed from: o */
    public float f58974o;

    /* JADX INFO: renamed from: p */
    public float f58975p;

    /* JADX INFO: renamed from: q */
    public long f58976q;

    /* JADX INFO: renamed from: r */
    public long f58977r;

    /* JADX INFO: renamed from: s */
    public long f58978s;

    /* JADX INFO: renamed from: lw3$b */
    public static final class C8995b {

        /* JADX INFO: renamed from: a */
        public float f58979a = 0.97f;

        /* JADX INFO: renamed from: b */
        public float f58980b = 1.03f;

        /* JADX INFO: renamed from: c */
        public long f58981c = 1000;

        /* JADX INFO: renamed from: d */
        public float f58982d = 1.0E-7f;

        /* JADX INFO: renamed from: e */
        public long f58983e = x0i.msToUs(20);

        /* JADX INFO: renamed from: f */
        public long f58984f = x0i.msToUs(500);

        /* JADX INFO: renamed from: g */
        public float f58985g = 0.999f;

        public lw3 build() {
            return new lw3(this.f58979a, this.f58980b, this.f58981c, this.f58982d, this.f58983e, this.f58984f, this.f58985g);
        }

        @op1
        public C8995b setFallbackMaxPlaybackSpeed(float f) {
            u80.checkArgument(f >= 1.0f);
            this.f58980b = f;
            return this;
        }

        @op1
        public C8995b setFallbackMinPlaybackSpeed(float f) {
            u80.checkArgument(0.0f < f && f <= 1.0f);
            this.f58979a = f;
            return this;
        }

        @op1
        public C8995b setMaxLiveOffsetErrorMsForUnitSpeed(long j) {
            u80.checkArgument(j > 0);
            this.f58983e = x0i.msToUs(j);
            return this;
        }

        @op1
        public C8995b setMinPossibleLiveOffsetSmoothingFactor(float f) {
            u80.checkArgument(f >= 0.0f && f < 1.0f);
            this.f58985g = f;
            return this;
        }

        @op1
        public C8995b setMinUpdateIntervalMs(long j) {
            u80.checkArgument(j > 0);
            this.f58981c = j;
            return this;
        }

        @op1
        public C8995b setProportionalControlFactor(float f) {
            u80.checkArgument(f > 0.0f);
            this.f58982d = f / 1000000.0f;
            return this;
        }

        @op1
        public C8995b setTargetLiveOffsetIncrementOnRebufferMs(long j) {
            u80.checkArgument(j >= 0);
            this.f58984f = x0i.msToUs(j);
            return this;
        }
    }

    private void adjustTargetLiveOffsetUs(long j) {
        long j2 = this.f58977r + (this.f58978s * 3);
        if (this.f58972m > j2) {
            float fMsToUs = x0i.msToUs(this.f58962c);
            this.f58972m = im9.max(j2, this.f58969j, this.f58972m - (((long) ((this.f58975p - 1.0f) * fMsToUs)) + ((long) ((this.f58973n - 1.0f) * fMsToUs))));
            return;
        }
        long jConstrainValue = x0i.constrainValue(j - ((long) (Math.max(0.0f, this.f58975p - 1.0f) / this.f58963d)), this.f58972m, j2);
        this.f58972m = jConstrainValue;
        long j3 = this.f58971l;
        if (j3 == -9223372036854775807L || jConstrainValue <= j3) {
            return;
        }
        this.f58972m = j3;
    }

    private void maybeResetTargetLiveOffsetUs() {
        long j = this.f58967h;
        if (j != -9223372036854775807L) {
            long j2 = this.f58968i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f58970k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f58971l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f58969j == j) {
            return;
        }
        this.f58969j = j;
        this.f58972m = j;
        this.f58977r = -9223372036854775807L;
        this.f58978s = -9223372036854775807L;
        this.f58976q = -9223372036854775807L;
    }

    private static long smooth(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f58977r;
        if (j4 == -9223372036854775807L) {
            this.f58977r = j3;
            this.f58978s = 0L;
        } else {
            long jMax = Math.max(j3, smooth(j4, j3, this.f58966g));
            this.f58977r = jMax;
            this.f58978s = smooth(this.f58978s, Math.abs(j3 - jMax), this.f58966g);
        }
    }

    @Override // p000.vb9
    public float getAdjustedPlaybackSpeed(long j, long j2) {
        if (this.f58967h == -9223372036854775807L) {
            return 1.0f;
        }
        updateSmoothedMinPossibleLiveOffsetUs(j, j2);
        if (this.f58976q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f58976q < this.f58962c) {
            return this.f58975p;
        }
        this.f58976q = SystemClock.elapsedRealtime();
        adjustTargetLiveOffsetUs(j);
        long j3 = j - this.f58972m;
        if (Math.abs(j3) < this.f58964e) {
            this.f58975p = 1.0f;
        } else {
            this.f58975p = x0i.constrainValue((this.f58963d * j3) + 1.0f, this.f58974o, this.f58973n);
        }
        return this.f58975p;
    }

    @Override // p000.vb9
    public long getTargetLiveOffsetUs() {
        return this.f58972m;
    }

    @Override // p000.vb9
    public void notifyRebuffer() {
        long j = this.f58972m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f58965f;
        this.f58972m = j2;
        long j3 = this.f58971l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f58972m = j3;
        }
        this.f58976q = -9223372036854775807L;
    }

    @Override // p000.vb9
    public void setLiveConfiguration(aga.C0239g c0239g) {
        this.f58967h = x0i.msToUs(c0239g.f1524a);
        this.f58970k = x0i.msToUs(c0239g.f1525b);
        this.f58971l = x0i.msToUs(c0239g.f1526c);
        float f = c0239g.f1527d;
        if (f == -3.4028235E38f) {
            f = this.f58960a;
        }
        this.f58974o = f;
        float f2 = c0239g.f1528e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f58961b;
        }
        this.f58973n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f58967h = -9223372036854775807L;
        }
        maybeResetTargetLiveOffsetUs();
    }

    @Override // p000.vb9
    public void setTargetLiveOffsetOverrideUs(long j) {
        this.f58968i = j;
        maybeResetTargetLiveOffsetUs();
    }

    private lw3(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f58960a = f;
        this.f58961b = f2;
        this.f58962c = j;
        this.f58963d = f3;
        this.f58964e = j2;
        this.f58965f = j3;
        this.f58966g = f4;
        this.f58967h = -9223372036854775807L;
        this.f58968i = -9223372036854775807L;
        this.f58970k = -9223372036854775807L;
        this.f58971l = -9223372036854775807L;
        this.f58974o = f;
        this.f58973n = f2;
        this.f58975p = 1.0f;
        this.f58976q = -9223372036854775807L;
        this.f58969j = -9223372036854775807L;
        this.f58972m = -9223372036854775807L;
        this.f58977r = -9223372036854775807L;
        this.f58978s = -9223372036854775807L;
    }
}
