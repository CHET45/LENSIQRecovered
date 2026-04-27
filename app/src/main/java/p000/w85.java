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
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class w85 extends woe {

    /* JADX INFO: renamed from: c */
    public final boolean f93578c;

    /* JADX INFO: renamed from: d */
    public final boolean f93579d;

    /* JADX INFO: renamed from: e */
    @cfb
    public final Executor f93580e;

    /* JADX INFO: renamed from: w85$a */
    public final class RunnableC14472a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final RunnableC14473b f93581a;

        public RunnableC14472a(RunnableC14473b dr) {
            this.f93581a = dr;
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC14473b runnableC14473b = this.f93581a;
            runnableC14473b.f93584b.replace(w85.this.scheduleDirect(runnableC14473b));
        }
    }

    /* JADX INFO: renamed from: w85$b */
    public static final class RunnableC14473b extends AtomicReference<Runnable> implements Runnable, lf4, fpe {
        private static final long serialVersionUID = -4101336210206799084L;

        /* JADX INFO: renamed from: a */
        public final a0f f93583a;

        /* JADX INFO: renamed from: b */
        public final a0f f93584b;

        public RunnableC14473b(Runnable run) {
            super(run);
            this.f93583a = new a0f();
            this.f93584b = new a0f();
        }

        @Override // p000.lf4
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f93583a.dispose();
                this.f93584b.dispose();
            }
        }

        @Override // p000.fpe
        public Runnable getWrappedRunnable() {
            Runnable runnable = get();
            return runnable != null ? runnable : r07.f76638b;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    try {
                        runnable.run();
                        lazySet(null);
                        a0f a0fVar = this.f93583a;
                        zf4 zf4Var = zf4.DISPOSED;
                        a0fVar.lazySet(zf4Var);
                        this.f93584b.lazySet(zf4Var);
                    } catch (Throwable th) {
                        lazySet(null);
                        this.f93583a.lazySet(zf4.DISPOSED);
                        this.f93584b.lazySet(zf4.DISPOSED);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ofe.onError(th2);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: w85$d */
    public static final class C14475d {

        /* JADX INFO: renamed from: a */
        public static final woe f93604a = mpe.single();
    }

    public w85(@cfb Executor executor, boolean interruptibleWorker, boolean fair) {
        this.f93580e = executor;
        this.f93578c = interruptibleWorker;
        this.f93579d = fair;
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        return new RunnableC14474c(this.f93580e, this.f93578c, this.f93579d);
    }

    @Override // p000.woe
    @cfb
    public lf4 scheduleDirect(@cfb Runnable run) {
        Runnable runnableOnSchedule = ofe.onSchedule(run);
        try {
            if (this.f93580e instanceof ExecutorService) {
                noe noeVar = new noe(runnableOnSchedule, this.f93578c);
                noeVar.setFuture(((ExecutorService) this.f93580e).submit(noeVar));
                return noeVar;
            }
            if (this.f93578c) {
                RunnableC14474c.b bVar = new RunnableC14474c.b(runnableOnSchedule, null);
                this.f93580e.execute(bVar);
                return bVar;
            }
            RunnableC14474c.a aVar = new RunnableC14474c.a(runnableOnSchedule);
            this.f93580e.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e) {
            ofe.onError(e);
            return b05.INSTANCE;
        }
    }

    @Override // p000.woe
    @cfb
    public lf4 schedulePeriodicallyDirect(@cfb Runnable run, long initialDelay, long period, TimeUnit unit) {
        if (!(this.f93580e instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(run, initialDelay, period, unit);
        }
        try {
            loe loeVar = new loe(ofe.onSchedule(run), this.f93578c);
            loeVar.setFuture(((ScheduledExecutorService) this.f93580e).scheduleAtFixedRate(loeVar, initialDelay, period, unit));
            return loeVar;
        } catch (RejectedExecutionException e) {
            ofe.onError(e);
            return b05.INSTANCE;
        }
    }

    @Override // p000.woe
    @cfb
    public lf4 scheduleDirect(@cfb Runnable run, final long delay, final TimeUnit unit) {
        Runnable runnableOnSchedule = ofe.onSchedule(run);
        if (this.f93580e instanceof ScheduledExecutorService) {
            try {
                noe noeVar = new noe(runnableOnSchedule, this.f93578c);
                noeVar.setFuture(((ScheduledExecutorService) this.f93580e).schedule(noeVar, delay, unit));
                return noeVar;
            } catch (RejectedExecutionException e) {
                ofe.onError(e);
                return b05.INSTANCE;
            }
        }
        RunnableC14473b runnableC14473b = new RunnableC14473b(runnableOnSchedule);
        runnableC14473b.f93583a.replace(C14475d.f93604a.scheduleDirect(new RunnableC14472a(runnableC14473b), delay, unit));
        return runnableC14473b;
    }

    /* JADX INFO: renamed from: w85$c */
    public static final class RunnableC14474c extends woe.AbstractC14729c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final boolean f93585a;

        /* JADX INFO: renamed from: b */
        public final boolean f93586b;

        /* JADX INFO: renamed from: c */
        public final Executor f93587c;

        /* JADX INFO: renamed from: e */
        public volatile boolean f93589e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f93590f = new AtomicInteger();

        /* JADX INFO: renamed from: m */
        public final mm2 f93591m = new mm2();

        /* JADX INFO: renamed from: d */
        public final t1b<Runnable> f93588d = new t1b<>();

        /* JADX INFO: renamed from: w85$c$a */
        public static final class a extends AtomicBoolean implements Runnable, lf4 {
            private static final long serialVersionUID = -2421395018820541164L;

            /* JADX INFO: renamed from: a */
            public final Runnable f93592a;

            public a(Runnable actual) {
                this.f93592a = actual;
            }

            @Override // p000.lf4
            public void dispose() {
                lazySet(true);
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f93592a.run();
                } finally {
                }
            }
        }

        /* JADX INFO: renamed from: w85$c$b */
        public static final class b extends AtomicInteger implements Runnable, lf4 {

            /* JADX INFO: renamed from: C */
            public static final int f93593C = 4;

            /* JADX INFO: renamed from: d */
            public static final int f93594d = 0;

            /* JADX INFO: renamed from: e */
            public static final int f93595e = 1;

            /* JADX INFO: renamed from: f */
            public static final int f93596f = 2;

            /* JADX INFO: renamed from: m */
            public static final int f93597m = 3;
            private static final long serialVersionUID = -3603436687413320876L;

            /* JADX INFO: renamed from: a */
            public final Runnable f93598a;

            /* JADX INFO: renamed from: b */
            public final sf4 f93599b;

            /* JADX INFO: renamed from: c */
            public volatile Thread f93600c;

            public b(Runnable run, sf4 tasks) {
                this.f93598a = run;
                this.f93599b = tasks;
            }

            /* JADX INFO: renamed from: a */
            public void m24415a() {
                sf4 sf4Var = this.f93599b;
                if (sf4Var != null) {
                    sf4Var.delete(this);
                }
            }

            @Override // p000.lf4
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            m24415a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f93600c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f93600c = null;
                        }
                        set(4);
                        m24415a();
                        return;
                    }
                }
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f93600c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f93600c = null;
                        return;
                    }
                    try {
                        this.f93598a.run();
                        this.f93600c = null;
                        if (compareAndSet(1, 2)) {
                            m24415a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th) {
                        try {
                            ofe.onError(th);
                            throw th;
                        } catch (Throwable th2) {
                            this.f93600c = null;
                            if (compareAndSet(1, 2)) {
                                m24415a();
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th2;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: w85$c$c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final a0f f93601a;

            /* JADX INFO: renamed from: b */
            public final Runnable f93602b;

            public c(a0f mar, Runnable decoratedRun) {
                this.f93601a = mar;
                this.f93602b = decoratedRun;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f93601a.replace(RunnableC14474c.this.schedule(this.f93602b));
            }
        }

        public RunnableC14474c(Executor executor, boolean interruptibleWorker, boolean fair) {
            this.f93587c = executor;
            this.f93585a = interruptibleWorker;
            this.f93586b = fair;
        }

        /* JADX INFO: renamed from: a */
        public void m24413a() {
            t1b<Runnable> t1bVar = this.f93588d;
            int iAddAndGet = 1;
            while (!this.f93589e) {
                do {
                    Runnable runnablePoll = t1bVar.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    } else if (this.f93589e) {
                        t1bVar.clear();
                        return;
                    } else {
                        iAddAndGet = this.f93590f.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.f93589e);
                t1bVar.clear();
                return;
            }
            t1bVar.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m24414b() {
            t1b<Runnable> t1bVar = this.f93588d;
            if (this.f93589e) {
                t1bVar.clear();
                return;
            }
            t1bVar.poll().run();
            if (this.f93589e) {
                t1bVar.clear();
            } else if (this.f93590f.decrementAndGet() != 0) {
                this.f93587c.execute(this);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f93589e) {
                return;
            }
            this.f93589e = true;
            this.f93591m.dispose();
            if (this.f93590f.getAndIncrement() == 0) {
                this.f93588d.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f93589e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f93586b) {
                m24414b();
            } else {
                m24413a();
            }
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable run) {
            lf4 aVar;
            if (this.f93589e) {
                return b05.INSTANCE;
            }
            Runnable runnableOnSchedule = ofe.onSchedule(run);
            if (this.f93585a) {
                aVar = new b(runnableOnSchedule, this.f93591m);
                this.f93591m.add(aVar);
            } else {
                aVar = new a(runnableOnSchedule);
            }
            this.f93588d.offer(aVar);
            if (this.f93590f.getAndIncrement() == 0) {
                try {
                    this.f93587c.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f93589e = true;
                    this.f93588d.clear();
                    ofe.onError(e);
                    return b05.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable run, long delay, @cfb TimeUnit unit) {
            if (delay <= 0) {
                return schedule(run);
            }
            if (this.f93589e) {
                return b05.INSTANCE;
            }
            a0f a0fVar = new a0f();
            a0f a0fVar2 = new a0f(a0fVar);
            poe poeVar = new poe(new c(a0fVar2, ofe.onSchedule(run)), this.f93591m);
            this.f93591m.add(poeVar);
            Executor executor = this.f93587c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    poeVar.setFuture(((ScheduledExecutorService) executor).schedule((Callable) poeVar, delay, unit));
                } catch (RejectedExecutionException e) {
                    this.f93589e = true;
                    ofe.onError(e);
                    return b05.INSTANCE;
                }
            } else {
                poeVar.setFuture(new qg4(C14475d.f93604a.scheduleDirect(poeVar, delay, unit)));
            }
            a0fVar.replace(poeVar);
            return a0fVar2;
        }
    }
}
