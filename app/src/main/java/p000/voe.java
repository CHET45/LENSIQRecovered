package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class voe {

    /* JADX INFO: renamed from: a */
    public static boolean f91869a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b */
    public static final long f91870b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: renamed from: voe$a */
    public static final class RunnableC14183a implements mf4, Runnable, epe {

        /* JADX INFO: renamed from: a */
        @bfb
        public final Runnable f91871a;

        /* JADX INFO: renamed from: b */
        @bfb
        public final AbstractC14185c f91872b;

        /* JADX INFO: renamed from: c */
        @cib
        public Thread f91873c;

        public RunnableC14183a(@bfb Runnable runnable, @bfb AbstractC14185c abstractC14185c) {
            this.f91871a = runnable;
            this.f91872b = abstractC14185c;
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f91873c == Thread.currentThread()) {
                AbstractC14185c abstractC14185c = this.f91872b;
                if (abstractC14185c instanceof xcb) {
                    ((xcb) abstractC14185c).shutdown();
                    return;
                }
            }
            this.f91872b.dispose();
        }

        @Override // p000.epe
        public Runnable getWrappedRunnable() {
            return this.f91871a;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f91872b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f91873c = Thread.currentThread();
            try {
                this.f91871a.run();
            } finally {
                dispose();
                this.f91873c = null;
            }
        }
    }

    /* JADX INFO: renamed from: voe$b */
    public static final class RunnableC14184b implements mf4, Runnable, epe {

        /* JADX INFO: renamed from: a */
        @bfb
        public final Runnable f91874a;

        /* JADX INFO: renamed from: b */
        @bfb
        public final AbstractC14185c f91875b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f91876c;

        public RunnableC14184b(@bfb Runnable runnable, @bfb AbstractC14185c abstractC14185c) {
            this.f91874a = runnable;
            this.f91875b = abstractC14185c;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f91876c = true;
            this.f91875b.dispose();
        }

        @Override // p000.epe
        public Runnable getWrappedRunnable() {
            return this.f91874a;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f91876c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f91876c) {
                return;
            }
            try {
                this.f91874a.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f91875b.dispose();
                throw j75.wrapOrThrow(th);
            }
        }
    }

    /* JADX INFO: renamed from: voe$c */
    public static abstract class AbstractC14185c implements mf4 {

        /* JADX INFO: renamed from: voe$c$a */
        public final class a implements Runnable, epe {

            /* JADX INFO: renamed from: a */
            @bfb
            public final Runnable f91877a;

            /* JADX INFO: renamed from: b */
            @bfb
            public final b0f f91878b;

            /* JADX INFO: renamed from: c */
            public final long f91879c;

            /* JADX INFO: renamed from: d */
            public long f91880d;

            /* JADX INFO: renamed from: e */
            public long f91881e;

            /* JADX INFO: renamed from: f */
            public long f91882f;

            public a(long j, @bfb Runnable runnable, long j2, @bfb b0f b0fVar, long j3) {
                this.f91877a = runnable;
                this.f91878b = b0fVar;
                this.f91879c = j3;
                this.f91881e = j2;
                this.f91882f = j;
            }

            @Override // p000.epe
            public Runnable getWrappedRunnable() {
                return this.f91877a;
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
                    java.lang.Runnable r0 = r12.f91877a
                    r0.run()
                    b0f r0 = r12.f91878b
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L51
                    voe$c r0 = p000.voe.AbstractC14185c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.now(r1)
                    long r4 = p000.voe.f91870b
                    long r6 = r2 + r4
                    long r8 = r12.f91881e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f91879c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f91882f
                    long r8 = r12.f91880d
                    long r8 = r8 + r6
                    r12.f91880d = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f91879c
                    long r8 = r2 + r4
                    long r10 = r12.f91880d
                    long r10 = r10 + r6
                    r12.f91880d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f91882f = r4
                    r4 = r8
                L43:
                    r12.f91881e = r2
                    long r4 = r4 - r2
                    b0f r0 = r12.f91878b
                    voe$c r2 = p000.voe.AbstractC14185c.this
                    mf4 r1 = r2.schedule(r12, r4, r1)
                    r0.replace(r1)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.voe.AbstractC14185c.a.run():void");
            }
        }

        public long now(@bfb TimeUnit timeUnit) {
            return voe.m24092a(timeUnit);
        }

        @bfb
        public mf4 schedule(@bfb Runnable runnable) {
            return schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @bfb
        public abstract mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit);

        @bfb
        public mf4 schedulePeriodically(@bfb Runnable runnable, long j, long j2, @bfb TimeUnit timeUnit) {
            b0f b0fVar = new b0f();
            b0f b0fVar2 = new b0f(b0fVar);
            Runnable runnableOnSchedule = pfe.onSchedule(runnable);
            long nanos = timeUnit.toNanos(j2);
            long jNow = now(TimeUnit.NANOSECONDS);
            mf4 mf4VarSchedule = schedule(new a(jNow + timeUnit.toNanos(j), runnableOnSchedule, jNow, b0fVar2, nanos), j, timeUnit);
            if (mf4VarSchedule == c05.INSTANCE) {
                return mf4VarSchedule;
            }
            b0fVar.replace(mf4VarSchedule);
            return b0fVar2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m24092a(TimeUnit timeUnit) {
        return !f91869a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public static long clockDriftTolerance() {
        return f91870b;
    }

    @bfb
    public abstract AbstractC14185c createWorker();

    public long now(@bfb TimeUnit timeUnit) {
        return m24092a(timeUnit);
    }

    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable) {
        return scheduleDirect(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @bfb
    public mf4 schedulePeriodicallyDirect(@bfb Runnable runnable, long j, long j2, @bfb TimeUnit timeUnit) {
        AbstractC14185c abstractC14185cCreateWorker = createWorker();
        RunnableC14184b runnableC14184b = new RunnableC14184b(pfe.onSchedule(runnable), abstractC14185cCreateWorker);
        mf4 mf4VarSchedulePeriodically = abstractC14185cCreateWorker.schedulePeriodically(runnableC14184b, j, j2, timeUnit);
        return mf4VarSchedulePeriodically == c05.INSTANCE ? mf4VarSchedulePeriodically : runnableC14184b;
    }

    public void shutdown() {
    }

    public void start() {
    }

    @bfb
    public <S extends voe & mf4> S when(@bfb py6<m86<m86<yd2>>, yd2> py6Var) {
        return new kpe(py6Var, this);
    }

    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
        AbstractC14185c abstractC14185cCreateWorker = createWorker();
        RunnableC14183a runnableC14183a = new RunnableC14183a(pfe.onSchedule(runnable), abstractC14185cCreateWorker);
        abstractC14185cCreateWorker.schedule(runnableC14183a, j, timeUnit);
        return runnableC14183a;
    }
}
