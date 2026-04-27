package p000;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class sj3 implements Comparable<sj3> {

    /* JADX INFO: renamed from: d */
    public static final C12614b f81954d = new C12614b();

    /* JADX INFO: renamed from: e */
    public static final long f81955e;

    /* JADX INFO: renamed from: f */
    public static final long f81956f;

    /* JADX INFO: renamed from: m */
    public static final long f81957m;

    /* JADX INFO: renamed from: a */
    public final AbstractC12615c f81958a;

    /* JADX INFO: renamed from: b */
    public final long f81959b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f81960c;

    /* JADX INFO: renamed from: sj3$b */
    public static class C12614b extends AbstractC12615c {
        private C12614b() {
        }

        @Override // p000.sj3.AbstractC12615c
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: sj3$c */
    public static abstract class AbstractC12615c {
        public abstract long nanoTime();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f81955e = nanos;
        f81956f = -nanos;
        f81957m = TimeUnit.SECONDS.toNanos(1L);
    }

    private sj3(AbstractC12615c abstractC12615c, long j, boolean z) {
        this(abstractC12615c, abstractC12615c.nanoTime(), j, z);
    }

    public static sj3 after(long j, TimeUnit timeUnit) {
        return after(j, timeUnit, f81954d);
    }

    private static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private void checkTicker(sj3 sj3Var) {
        if (this.f81958a == sj3Var.f81958a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f81958a + " and " + sj3Var.f81958a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public static AbstractC12615c getSystemTicker() {
        return f81954d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sj3)) {
            return false;
        }
        sj3 sj3Var = (sj3) obj;
        AbstractC12615c abstractC12615c = this.f81958a;
        if (abstractC12615c != null ? abstractC12615c == sj3Var.f81958a : sj3Var.f81958a == null) {
            return this.f81959b == sj3Var.f81959b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f81958a, Long.valueOf(this.f81959b)).hashCode();
    }

    public boolean isBefore(sj3 sj3Var) {
        checkTicker(sj3Var);
        return this.f81959b - sj3Var.f81959b < 0;
    }

    public boolean isExpired() {
        if (!this.f81960c) {
            if (this.f81959b - this.f81958a.nanoTime() > 0) {
                return false;
            }
            this.f81960c = true;
        }
        return true;
    }

    public sj3 minimum(sj3 sj3Var) {
        checkTicker(sj3Var);
        return isBefore(sj3Var) ? this : sj3Var;
    }

    public sj3 offset(long j, TimeUnit timeUnit) {
        return j == 0 ? this : new sj3(this.f81958a, this.f81959b, timeUnit.toNanos(j), isExpired());
    }

    public ScheduledFuture<?> runOnExpiration(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        checkNotNull(runnable, "task");
        checkNotNull(scheduledExecutorService, "scheduler");
        return scheduledExecutorService.schedule(runnable, this.f81959b - this.f81958a.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public long timeRemaining(TimeUnit timeUnit) {
        long jNanoTime = this.f81958a.nanoTime();
        if (!this.f81960c && this.f81959b - jNanoTime <= 0) {
            this.f81960c = true;
        }
        return timeUnit.convert(this.f81959b - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jTimeRemaining = timeRemaining(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jTimeRemaining);
        long j = f81957m;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jTimeRemaining) % j;
        StringBuilder sb = new StringBuilder();
        if (jTimeRemaining < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        if (this.f81958a != f81954d) {
            sb.append(" (ticker=" + this.f81958a + c0b.f15434d);
        }
        return sb.toString();
    }

    private sj3(AbstractC12615c abstractC12615c, long j, long j2, boolean z) {
        this.f81958a = abstractC12615c;
        long jMin = Math.min(f81955e, Math.max(f81956f, j2));
        this.f81959b = j + jMin;
        this.f81960c = z && jMin <= 0;
    }

    public static sj3 after(long j, TimeUnit timeUnit, AbstractC12615c abstractC12615c) {
        checkNotNull(timeUnit, "units");
        return new sj3(abstractC12615c, timeUnit.toNanos(j), true);
    }

    @Override // java.lang.Comparable
    public int compareTo(sj3 sj3Var) {
        checkTicker(sj3Var);
        long j = this.f81959b - sj3Var.f81959b;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }
}
