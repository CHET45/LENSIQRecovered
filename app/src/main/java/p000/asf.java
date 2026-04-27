package p000;

import java.util.concurrent.TimeUnit;
import p000.lpd;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class asf extends lpd {

    /* JADX INFO: renamed from: c */
    public double f11774c;

    /* JADX INFO: renamed from: d */
    public double f11775d;

    /* JADX INFO: renamed from: e */
    public double f11776e;

    /* JADX INFO: renamed from: f */
    public long f11777f;

    /* JADX INFO: renamed from: asf$b */
    public static final class C1593b extends asf {

        /* JADX INFO: renamed from: g */
        public final double f11778g;

        public C1593b(lpd.AbstractC8927a stopwatch, double maxBurstSeconds) {
            super(stopwatch);
            this.f11778g = maxBurstSeconds;
        }

        @Override // p000.asf
        /* JADX INFO: renamed from: i */
        public double mo2657i() {
            return this.f11776e;
        }

        @Override // p000.asf
        /* JADX INFO: renamed from: j */
        public void mo2658j(double permitsPerSecond, double stableIntervalMicros) {
            double d = this.f11775d;
            double d2 = this.f11778g * permitsPerSecond;
            this.f11775d = d2;
            if (d == Double.POSITIVE_INFINITY) {
                this.f11774c = d2;
            } else {
                this.f11774c = d != 0.0d ? (this.f11774c * d2) / d : 0.0d;
            }
        }

        @Override // p000.asf
        /* JADX INFO: renamed from: l */
        public long mo2660l(double storedPermits, double permitsToTake) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: asf$c */
    public static final class C1594c extends asf {

        /* JADX INFO: renamed from: g */
        public final long f11779g;

        /* JADX INFO: renamed from: h */
        public double f11780h;

        /* JADX INFO: renamed from: i */
        public double f11781i;

        /* JADX INFO: renamed from: j */
        public double f11782j;

        public C1594c(lpd.AbstractC8927a stopwatch, long warmupPeriod, TimeUnit timeUnit, double coldFactor) {
            super(stopwatch);
            this.f11779g = timeUnit.toMicros(warmupPeriod);
            this.f11782j = coldFactor;
        }

        private double permitsToTime(double permits) {
            return this.f11776e + (permits * this.f11780h);
        }

        @Override // p000.asf
        /* JADX INFO: renamed from: i */
        public double mo2657i() {
            return this.f11779g / this.f11775d;
        }

        @Override // p000.asf
        /* JADX INFO: renamed from: j */
        public void mo2658j(double permitsPerSecond, double stableIntervalMicros) {
            double d = this.f11775d;
            double d2 = this.f11782j * stableIntervalMicros;
            long j = this.f11779g;
            double d3 = (j * 0.5d) / stableIntervalMicros;
            this.f11781i = d3;
            double d4 = ((j * 2.0d) / (stableIntervalMicros + d2)) + d3;
            this.f11775d = d4;
            this.f11780h = (d2 - stableIntervalMicros) / (d4 - d3);
            if (d == Double.POSITIVE_INFINITY) {
                this.f11774c = 0.0d;
                return;
            }
            if (d != 0.0d) {
                d4 = (this.f11774c * d4) / d;
            }
            this.f11774c = d4;
        }

        @Override // p000.asf
        /* JADX INFO: renamed from: l */
        public long mo2660l(double storedPermits, double permitsToTake) {
            long jPermitsToTime;
            double d = storedPermits - this.f11781i;
            if (d > 0.0d) {
                double dMin = Math.min(d, permitsToTake);
                jPermitsToTime = (long) (((permitsToTime(d) + permitsToTime(d - dMin)) * dMin) / 2.0d);
                permitsToTake -= dMin;
            } else {
                jPermitsToTime = 0;
            }
            return jPermitsToTime + ((long) (this.f11776e * permitsToTake));
        }
    }

    @Override // p000.lpd
    /* JADX INFO: renamed from: c */
    public final double mo2653c() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f11776e;
    }

    @Override // p000.lpd
    /* JADX INFO: renamed from: d */
    public final void mo2654d(double permitsPerSecond, long nowMicros) {
        m2659k(nowMicros);
        double micros = TimeUnit.SECONDS.toMicros(1L) / permitsPerSecond;
        this.f11776e = micros;
        mo2658j(permitsPerSecond, micros);
    }

    @Override // p000.lpd
    /* JADX INFO: renamed from: e */
    public final long mo2655e(long nowMicros) {
        return this.f11777f;
    }

    @Override // p000.lpd
    /* JADX INFO: renamed from: h */
    public final long mo2656h(int requiredPermits, long nowMicros) {
        m2659k(nowMicros);
        long j = this.f11777f;
        double d = requiredPermits;
        double dMin = Math.min(d, this.f11774c);
        this.f11777f = nl9.saturatedAdd(this.f11777f, mo2660l(this.f11774c, dMin) + ((long) ((d - dMin) * this.f11776e)));
        this.f11774c -= dMin;
        return j;
    }

    /* JADX INFO: renamed from: i */
    public abstract double mo2657i();

    /* JADX INFO: renamed from: j */
    public abstract void mo2658j(double permitsPerSecond, double stableIntervalMicros);

    /* JADX INFO: renamed from: k */
    public void m2659k(long nowMicros) {
        if (nowMicros > this.f11777f) {
            this.f11774c = Math.min(this.f11775d, this.f11774c + ((nowMicros - r0) / mo2657i()));
            this.f11777f = nowMicros;
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract long mo2660l(double storedPermits, double permitsToTake);

    private asf(lpd.AbstractC8927a stopwatch) {
        super(stopwatch);
        this.f11777f = 0L;
    }
}
