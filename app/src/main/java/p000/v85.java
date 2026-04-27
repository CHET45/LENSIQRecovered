package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class v85 extends voe {

    /* JADX INFO: renamed from: e */
    public static final voe f90297e = npe.single();

    /* JADX INFO: renamed from: c */
    public final boolean f90298c;

    /* JADX INFO: renamed from: d */
    @bfb
    public final Executor f90299d;

    /* JADX INFO: renamed from: v85$a */
    public final class RunnableC13936a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final RunnableC13937b f90300a;

        public RunnableC13936a(RunnableC13937b runnableC13937b) {
            this.f90300a = runnableC13937b;
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC13937b runnableC13937b = this.f90300a;
            runnableC13937b.f90303b.replace(v85.this.scheduleDirect(runnableC13937b));
        }
    }

    /* JADX INFO: renamed from: v85$b */
    public static final class RunnableC13937b extends AtomicReference<Runnable> implements Runnable, mf4, epe {
        private static final long serialVersionUID = -4101336210206799084L;

        /* JADX INFO: renamed from: a */
        public final b0f f90302a;

        /* JADX INFO: renamed from: b */
        public final b0f f90303b;

        public RunnableC13937b(Runnable runnable) {
            super(runnable);
            this.f90302a = new b0f();
            this.f90303b = new b0f();
        }

        @Override // p000.mf4
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f90302a.dispose();
                this.f90303b.dispose();
            }
        }

        @Override // p000.epe
        public Runnable getWrappedRunnable() {
            Runnable runnable = get();
            return runnable != null ? runnable : q07.f72640b;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    b0f b0fVar = this.f90302a;
                    ag4 ag4Var = ag4.DISPOSED;
                    b0fVar.lazySet(ag4Var);
                    this.f90303b.lazySet(ag4Var);
                } catch (Throwable th) {
                    lazySet(null);
                    this.f90302a.lazySet(ag4.DISPOSED);
                    this.f90303b.lazySet(ag4.DISPOSED);
                    throw th;
                }
            }
        }
    }

    public v85(@bfb Executor executor, boolean z) {
        this.f90299d = executor;
        this.f90298c = z;
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        return new RunnableC13938c(this.f90299d, this.f90298c);
    }

    @Override // p000.voe
    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable) {
        Runnable runnableOnSchedule = pfe.onSchedule(runnable);
        try {
            if (this.f90299d instanceof ExecutorService) {
                ooe ooeVar = new ooe(runnableOnSchedule);
                ooeVar.setFuture(((ExecutorService) this.f90299d).submit(ooeVar));
                return ooeVar;
            }
            if (this.f90298c) {
                RunnableC13938c.b bVar = new RunnableC13938c.b(runnableOnSchedule, null);
                this.f90299d.execute(bVar);
                return bVar;
            }
            RunnableC13938c.a aVar = new RunnableC13938c.a(runnableOnSchedule);
            this.f90299d.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e) {
            pfe.onError(e);
            return c05.INSTANCE;
        }
    }

    @Override // p000.voe
    @bfb
    public mf4 schedulePeriodicallyDirect(@bfb Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f90299d instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
        }
        try {
            moe moeVar = new moe(pfe.onSchedule(runnable));
            moeVar.setFuture(((ScheduledExecutorService) this.f90299d).scheduleAtFixedRate(moeVar, j, j2, timeUnit));
            return moeVar;
        } catch (RejectedExecutionException e) {
            pfe.onError(e);
            return c05.INSTANCE;
        }
    }

    @Override // p000.voe
    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = pfe.onSchedule(runnable);
        if (this.f90299d instanceof ScheduledExecutorService) {
            try {
                ooe ooeVar = new ooe(runnableOnSchedule);
                ooeVar.setFuture(((ScheduledExecutorService) this.f90299d).schedule(ooeVar, j, timeUnit));
                return ooeVar;
            } catch (RejectedExecutionException e) {
                pfe.onError(e);
                return c05.INSTANCE;
            }
        }
        RunnableC13937b runnableC13937b = new RunnableC13937b(runnableOnSchedule);
        runnableC13937b.f90302a.replace(f90297e.scheduleDirect(new RunnableC13936a(runnableC13937b), j, timeUnit));
        return runnableC13937b;
    }

    /* JADX INFO: renamed from: v85$c */
    public static final class RunnableC13938c extends voe.AbstractC14185c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final boolean f90304a;

        /* JADX INFO: renamed from: b */
        public final Executor f90305b;

        /* JADX INFO: renamed from: d */
        public volatile boolean f90307d;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f90308e = new AtomicInteger();

        /* JADX INFO: renamed from: f */
        public final nm2 f90309f = new nm2();

        /* JADX INFO: renamed from: c */
        public final s1b<Runnable> f90306c = new s1b<>();

        /* JADX INFO: renamed from: v85$c$a */
        public static final class a extends AtomicBoolean implements Runnable, mf4 {
            private static final long serialVersionUID = -2421395018820541164L;

            /* JADX INFO: renamed from: a */
            public final Runnable f90310a;

            public a(Runnable runnable) {
                this.f90310a = runnable;
            }

            @Override // p000.mf4
            public void dispose() {
                lazySet(true);
            }

            @Override // p000.mf4
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f90310a.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        /* JADX INFO: renamed from: v85$c$b */
        public static final class b extends AtomicInteger implements Runnable, mf4 {

            /* JADX INFO: renamed from: C */
            public static final int f90311C = 4;

            /* JADX INFO: renamed from: d */
            public static final int f90312d = 0;

            /* JADX INFO: renamed from: e */
            public static final int f90313e = 1;

            /* JADX INFO: renamed from: f */
            public static final int f90314f = 2;

            /* JADX INFO: renamed from: m */
            public static final int f90315m = 3;
            private static final long serialVersionUID = -3603436687413320876L;

            /* JADX INFO: renamed from: a */
            public final Runnable f90316a;

            /* JADX INFO: renamed from: b */
            public final tf4 f90317b;

            /* JADX INFO: renamed from: c */
            public volatile Thread f90318c;

            public b(Runnable runnable, tf4 tf4Var) {
                this.f90316a = runnable;
                this.f90317b = tf4Var;
            }

            /* JADX INFO: renamed from: a */
            public void m23870a() {
                tf4 tf4Var = this.f90317b;
                if (tf4Var != null) {
                    tf4Var.delete(this);
                }
            }

            @Override // p000.mf4
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            m23870a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f90318c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f90318c = null;
                        }
                        set(4);
                        m23870a();
                        return;
                    }
                }
            }

            @Override // p000.mf4
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f90318c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f90318c = null;
                        return;
                    }
                    try {
                        this.f90316a.run();
                        this.f90318c = null;
                        if (compareAndSet(1, 2)) {
                            m23870a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th) {
                        this.f90318c = null;
                        if (compareAndSet(1, 2)) {
                            m23870a();
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: v85$c$c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final b0f f90319a;

            /* JADX INFO: renamed from: b */
            public final Runnable f90320b;

            public c(b0f b0fVar, Runnable runnable) {
                this.f90319a = b0fVar;
                this.f90320b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f90319a.replace(RunnableC13938c.this.schedule(this.f90320b));
            }
        }

        public RunnableC13938c(Executor executor, boolean z) {
            this.f90305b = executor;
            this.f90304a = z;
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f90307d) {
                return;
            }
            this.f90307d = true;
            this.f90309f.dispose();
            if (this.f90308e.getAndIncrement() == 0) {
                this.f90306c.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f90307d;
        }

        @Override // java.lang.Runnable
        public void run() {
            s1b<Runnable> s1bVar = this.f90306c;
            int iAddAndGet = 1;
            while (!this.f90307d) {
                do {
                    Runnable runnablePoll = s1bVar.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    } else if (this.f90307d) {
                        s1bVar.clear();
                        return;
                    } else {
                        iAddAndGet = this.f90308e.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.f90307d);
                s1bVar.clear();
                return;
            }
            s1bVar.clear();
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable) {
            mf4 aVar;
            if (this.f90307d) {
                return c05.INSTANCE;
            }
            Runnable runnableOnSchedule = pfe.onSchedule(runnable);
            if (this.f90304a) {
                aVar = new b(runnableOnSchedule, this.f90309f);
                this.f90309f.add(aVar);
            } else {
                aVar = new a(runnableOnSchedule);
            }
            this.f90306c.offer(aVar);
            if (this.f90308e.getAndIncrement() == 0) {
                try {
                    this.f90305b.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f90307d = true;
                    this.f90306c.clear();
                    pfe.onError(e);
                    return c05.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(runnable);
            }
            if (this.f90307d) {
                return c05.INSTANCE;
            }
            b0f b0fVar = new b0f();
            b0f b0fVar2 = new b0f(b0fVar);
            qoe qoeVar = new qoe(new c(b0fVar2, pfe.onSchedule(runnable)), this.f90309f);
            this.f90309f.add(qoeVar);
            Executor executor = this.f90305b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    qoeVar.setFuture(((ScheduledExecutorService) executor).schedule((Callable) qoeVar, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f90307d = true;
                    pfe.onError(e);
                    return c05.INSTANCE;
                }
            } else {
                qoeVar.setFuture(new sg4(v85.f90297e.scheduleDirect(qoeVar, j, timeUnit)));
            }
            b0fVar.replace(qoeVar);
            return b0fVar2;
        }
    }
}
