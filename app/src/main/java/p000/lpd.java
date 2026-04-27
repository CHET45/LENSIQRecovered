package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p000.asf;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@w01
@yg8
@qx4
public abstract class lpd {

    /* JADX INFO: renamed from: a */
    public final AbstractC8927a f58410a;

    /* JADX INFO: renamed from: b */
    @wx1
    public volatile Object f58411b;

    /* JADX INFO: renamed from: lpd$a */
    public static abstract class AbstractC8927a {

        /* JADX INFO: renamed from: lpd$a$a */
        public class a extends AbstractC8927a {

            /* JADX INFO: renamed from: a */
            public final d5g f58412a = d5g.createStarted();

            @Override // p000.lpd.AbstractC8927a
            /* JADX INFO: renamed from: a */
            public long mo16308a() {
                return this.f58412a.elapsed(TimeUnit.MICROSECONDS);
            }

            @Override // p000.lpd.AbstractC8927a
            /* JADX INFO: renamed from: b */
            public void mo16309b(long micros) {
                if (micros > 0) {
                    vsh.sleepUninterruptibly(micros, TimeUnit.MICROSECONDS);
                }
            }
        }

        public static AbstractC8927a createFromSystemTimer() {
            return new a();
        }

        /* JADX INFO: renamed from: a */
        public abstract long mo16308a();

        /* JADX INFO: renamed from: b */
        public abstract void mo16309b(long micros);
    }

    public lpd(AbstractC8927a stopwatch) {
        this.f58410a = (AbstractC8927a) v7d.checkNotNull(stopwatch);
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static lpd m16304a(double permitsPerSecond, long warmupPeriod, TimeUnit unit, double coldFactor, AbstractC8927a stopwatch) {
        asf.C1594c c1594c = new asf.C1594c(stopwatch, warmupPeriod, unit, coldFactor);
        c1594c.setRate(permitsPerSecond);
        return c1594c;
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public static lpd m16305b(double permitsPerSecond, AbstractC8927a stopwatch) {
        asf.C1593b c1593b = new asf.C1593b(stopwatch, 1.0d);
        c1593b.setRate(permitsPerSecond);
        return c1593b;
    }

    private boolean canAcquire(long nowMicros, long timeoutMicros) {
        return mo2655e(nowMicros) - timeoutMicros <= nowMicros;
    }

    private static void checkPermits(int permits) {
        v7d.checkArgument(permits > 0, "Requested permits (%s) must be positive", permits);
    }

    public static lpd create(double permitsPerSecond) {
        return m16305b(permitsPerSecond, AbstractC8927a.createFromSystemTimer());
    }

    private Object mutex() {
        Object obj = this.f58411b;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f58411b;
                    if (obj == null) {
                        obj = new Object();
                        this.f58411b = obj;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    @op1
    public double acquire() {
        return acquire(1);
    }

    /* JADX INFO: renamed from: c */
    public abstract double mo2653c();

    /* JADX INFO: renamed from: d */
    public abstract void mo2654d(double permitsPerSecond, long nowMicros);

    /* JADX INFO: renamed from: e */
    public abstract long mo2655e(long nowMicros);

    /* JADX INFO: renamed from: f */
    public final long m16306f(int permits) {
        long jM16307g;
        checkPermits(permits);
        synchronized (mutex()) {
            jM16307g = m16307g(permits, this.f58410a.mo16308a());
        }
        return jM16307g;
    }

    /* JADX INFO: renamed from: g */
    public final long m16307g(int permits, long nowMicros) {
        return Math.max(mo2656h(permits, nowMicros) - nowMicros, 0L);
    }

    public final double getRate() {
        double dMo2653c;
        synchronized (mutex()) {
            dMo2653c = mo2653c();
        }
        return dMo2653c;
    }

    /* JADX INFO: renamed from: h */
    public abstract long mo2656h(int permits, long nowMicros);

    public final void setRate(double permitsPerSecond) {
        v7d.checkArgument(permitsPerSecond > 0.0d && !Double.isNaN(permitsPerSecond), "rate must be positive");
        synchronized (mutex()) {
            mo2654d(permitsPerSecond, this.f58410a.mo16308a());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(long timeout, TimeUnit unit) {
        return tryAcquire(1, timeout, unit);
    }

    public static lpd create(double permitsPerSecond, long warmupPeriod, TimeUnit unit) {
        v7d.checkArgument(warmupPeriod >= 0, "warmupPeriod must not be negative: %s", warmupPeriod);
        return m16304a(permitsPerSecond, warmupPeriod, unit, 3.0d, AbstractC8927a.createFromSystemTimer());
    }

    @op1
    public double acquire(int permits) {
        long jM16306f = m16306f(permits);
        this.f58410a.mo16309b(jM16306f);
        return (jM16306f * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public boolean tryAcquire(int permits) {
        return tryAcquire(permits, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int permits, long timeout, TimeUnit unit) {
        long jMax = Math.max(unit.toMicros(timeout), 0L);
        checkPermits(permits);
        synchronized (mutex()) {
            try {
                long jMo16308a = this.f58410a.mo16308a();
                if (!canAcquire(jMo16308a, jMax)) {
                    return false;
                }
                this.f58410a.mo16309b(m16307g(permits, jMo16308a));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
