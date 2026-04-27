package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@by4
public final class d5g {

    /* JADX INFO: renamed from: a */
    public final qzg f28482a;

    /* JADX INFO: renamed from: b */
    public boolean f28483b;

    /* JADX INFO: renamed from: c */
    public long f28484c;

    /* JADX INFO: renamed from: d */
    public long f28485d;

    /* JADX INFO: renamed from: d5g$a */
    public static /* synthetic */ class C4622a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28486a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f28486a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28486a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28486a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28486a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28486a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28486a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28486a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public d5g() {
        this.f28482a = qzg.systemTicker();
    }

    private static String abbreviate(TimeUnit unit) {
        switch (C4622a.f28486a[unit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit chooseUnit(long nanos) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(nanos, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(nanos, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(nanos, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(nanos, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(nanos, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(nanos, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static d5g createStarted() {
        return new d5g().start();
    }

    public static d5g createUnstarted() {
        return new d5g();
    }

    private long elapsedNanos() {
        return this.f28483b ? (this.f28482a.read() - this.f28485d) + this.f28484c : this.f28484c;
    }

    public long elapsed(TimeUnit desiredUnit) {
        return desiredUnit.convert(elapsedNanos(), TimeUnit.NANOSECONDS);
    }

    public boolean isRunning() {
        return this.f28483b;
    }

    @op1
    public d5g reset() {
        this.f28484c = 0L;
        this.f28483b = false;
        return this;
    }

    @op1
    public d5g start() {
        v7d.checkState(!this.f28483b, "This stopwatch is already running.");
        this.f28483b = true;
        this.f28485d = this.f28482a.read();
        return this;
    }

    @op1
    public d5g stop() {
        long j = this.f28482a.read();
        v7d.checkState(this.f28483b, "This stopwatch is already stopped.");
        this.f28483b = false;
        this.f28484c += j - this.f28485d;
        return this;
    }

    public String toString() {
        long jElapsedNanos = elapsedNanos();
        TimeUnit timeUnitChooseUnit = chooseUnit(jElapsedNanos);
        return rwc.m21590c(jElapsedNanos / TimeUnit.NANOSECONDS.convert(1L, timeUnitChooseUnit)) + C2473f.f17566z + abbreviate(timeUnitChooseUnit);
    }

    public static d5g createStarted(qzg ticker) {
        return new d5g(ticker).start();
    }

    public static d5g createUnstarted(qzg ticker) {
        return new d5g(ticker);
    }

    public d5g(qzg ticker) {
        this.f28482a = (qzg) v7d.checkNotNull(ticker, "ticker");
    }
}
