package p000;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class woe {

    /* JADX INFO: renamed from: a */
    public static boolean f94971a = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b */
    public static final long f94972b = m24692a(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue(), System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes"));

    /* JADX INFO: renamed from: woe$a */
    public static final class RunnableC14727a implements lf4, Runnable, fpe {

        /* JADX INFO: renamed from: a */
        @cfb
        public final Runnable f94973a;

        /* JADX INFO: renamed from: b */
        @cfb
        public final AbstractC14729c f94974b;

        /* JADX INFO: renamed from: c */
        @dib
        public Thread f94975c;

        public RunnableC14727a(@cfb Runnable decoratedRun, @cfb AbstractC14729c w) {
            this.f94973a = decoratedRun;
            this.f94974b = w;
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f94975c == Thread.currentThread()) {
                AbstractC14729c abstractC14729c = this.f94974b;
                if (abstractC14729c instanceof wcb) {
                    ((wcb) abstractC14729c).shutdown();
                    return;
                }
            }
            this.f94974b.dispose();
        }

        @Override // p000.fpe
        public Runnable getWrappedRunnable() {
            return this.f94973a;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f94974b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f94975c = Thread.currentThread();
            try {
                this.f94973a.run();
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: woe$b */
    public static final class RunnableC14728b implements lf4, Runnable, fpe {

        /* JADX INFO: renamed from: a */
        @cfb
        public final Runnable f94976a;

        /* JADX INFO: renamed from: b */
        @cfb
        public final AbstractC14729c f94977b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f94978c;

        public RunnableC14728b(@cfb Runnable run, @cfb AbstractC14729c worker) {
            this.f94976a = run;
            this.f94977b = worker;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f94978c = true;
            this.f94977b.dispose();
        }

        @Override // p000.fpe
        public Runnable getWrappedRunnable() {
            return this.f94976a;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f94978c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f94978c) {
                return;
            }
            try {
                this.f94976a.run();
            } catch (Throwable th) {
                dispose();
                ofe.onError(th);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: woe$c */
    public static abstract class AbstractC14729c implements lf4 {

        /* JADX INFO: renamed from: woe$c$a */
        public final class a implements Runnable, fpe {

            /* JADX INFO: renamed from: a */
            @cfb
            public final Runnable f94979a;

            /* JADX INFO: renamed from: b */
            @cfb
            public final a0f f94980b;

            /* JADX INFO: renamed from: c */
            public final long f94981c;

            /* JADX INFO: renamed from: d */
            public long f94982d;

            /* JADX INFO: renamed from: e */
            public long f94983e;

            /* JADX INFO: renamed from: f */
            public long f94984f;

            public a(long firstStartInNanoseconds, @cfb Runnable decoratedRun, long firstNowNanoseconds, @cfb a0f sd, long periodInNanoseconds) {
                this.f94979a = decoratedRun;
                this.f94980b = sd;
                this.f94981c = periodInNanoseconds;
                this.f94983e = firstNowNanoseconds;
                this.f94984f = firstStartInNanoseconds;
            }

            @Override // p000.fpe
            public Runnable getWrappedRunnable() {
                return this.f94979a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r12 = this;
                    java.lang.Runnable r0 = r12.f94979a
                    r0.run()
                    a0f r0 = r12.f94980b
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L51
                    woe$c r0 = p000.woe.AbstractC14729c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.now(r1)
                    long r4 = p000.woe.f94972b
                    long r6 = r2 + r4
                    long r8 = r12.f94983e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f94981c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f94984f
                    long r8 = r12.f94982d
                    long r8 = r8 + r6
                    r12.f94982d = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f94981c
                    long r8 = r2 + r4
                    long r10 = r12.f94982d
                    long r10 = r10 + r6
                    r12.f94982d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f94984f = r4
                    r4 = r8
                L43:
                    r12.f94983e = r2
                    long r4 = r4 - r2
                    a0f r0 = r12.f94980b
                    woe$c r2 = p000.woe.AbstractC14729c.this
                    lf4 r1 = r2.schedule(r12, r4, r1)
                    r0.replace(r1)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.woe.AbstractC14729c.a.run():void");
            }
        }

        public long now(@cfb TimeUnit unit) {
            return woe.m24693b(unit);
        }

        @cfb
        public lf4 schedule(@cfb Runnable run) {
            return schedule(run, 0L, TimeUnit.NANOSECONDS);
        }

        @cfb
        public abstract lf4 schedule(@cfb Runnable run, long delay, @cfb TimeUnit unit);

        @cfb
        public lf4 schedulePeriodically(@cfb Runnable run, final long initialDelay, final long period, @cfb final TimeUnit unit) {
            a0f a0fVar = new a0f();
            a0f a0fVar2 = new a0f(a0fVar);
            Runnable runnableOnSchedule = ofe.onSchedule(run);
            long nanos = unit.toNanos(period);
            long jNow = now(TimeUnit.NANOSECONDS);
            lf4 lf4VarSchedule = schedule(new a(jNow + unit.toNanos(initialDelay), runnableOnSchedule, jNow, a0fVar2, nanos), initialDelay, unit);
            if (lf4VarSchedule == b05.INSTANCE) {
                return lf4VarSchedule;
            }
            a0fVar.replace(lf4VarSchedule);
            return a0fVar2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m24692a(long time, String timeUnit) {
        return "seconds".equalsIgnoreCase(timeUnit) ? TimeUnit.SECONDS.toNanos(time) : "milliseconds".equalsIgnoreCase(timeUnit) ? TimeUnit.MILLISECONDS.toNanos(time) : TimeUnit.MINUTES.toNanos(time);
    }

    /* JADX INFO: renamed from: b */
    public static long m24693b(TimeUnit unit) {
        return !f94971a ? unit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : unit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public static long clockDriftTolerance() {
        return f94972b;
    }

    @cfb
    public abstract AbstractC14729c createWorker();

    public long now(@cfb TimeUnit unit) {
        return m24693b(unit);
    }

    @cfb
    public lf4 scheduleDirect(@cfb Runnable run) {
        return scheduleDirect(run, 0L, TimeUnit.NANOSECONDS);
    }

    @cfb
    public lf4 schedulePeriodicallyDirect(@cfb Runnable run, long initialDelay, long period, @cfb TimeUnit unit) {
        AbstractC14729c abstractC14729cCreateWorker = createWorker();
        RunnableC14728b runnableC14728b = new RunnableC14728b(ofe.onSchedule(run), abstractC14729cCreateWorker);
        lf4 lf4VarSchedulePeriodically = abstractC14729cCreateWorker.schedulePeriodically(runnableC14728b, initialDelay, period, unit);
        return lf4VarSchedulePeriodically == b05.INSTANCE ? lf4VarSchedulePeriodically : runnableC14728b;
    }

    public void shutdown() {
    }

    public void start() {
    }

    @cfb
    public <S extends woe & lf4> S when(@cfb sy6<l86<l86<xd2>>, xd2> combine) {
        Objects.requireNonNull(combine, "combine is null");
        return new lpe(combine, this);
    }

    @cfb
    public lf4 scheduleDirect(@cfb Runnable run, long delay, @cfb TimeUnit unit) {
        AbstractC14729c abstractC14729cCreateWorker = createWorker();
        RunnableC14727a runnableC14727a = new RunnableC14727a(ofe.onSchedule(run), abstractC14729cCreateWorker);
        abstractC14729cCreateWorker.schedule(runnableC14727a, delay, unit);
        return runnableC14727a;
    }
}
