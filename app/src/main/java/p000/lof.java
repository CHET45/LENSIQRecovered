package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class lof extends woe {

    /* JADX INFO: renamed from: C */
    public static final ScheduledExecutorService f58366C;

    /* JADX INFO: renamed from: e */
    public static final String f58367e = "rx3.single-priority";

    /* JADX INFO: renamed from: f */
    public static final String f58368f = "RxSingleScheduler";

    /* JADX INFO: renamed from: m */
    public static final rfe f58369m;

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f58370c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<ScheduledExecutorService> f58371d;

    /* JADX INFO: renamed from: lof$a */
    public static final class C8922a extends woe.AbstractC14729c {

        /* JADX INFO: renamed from: a */
        public final ScheduledExecutorService f58372a;

        /* JADX INFO: renamed from: b */
        public final mm2 f58373b = new mm2();

        /* JADX INFO: renamed from: c */
        public volatile boolean f58374c;

        public C8922a(ScheduledExecutorService executor) {
            this.f58372a = executor;
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f58374c) {
                return;
            }
            this.f58374c = true;
            this.f58373b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f58374c;
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable run, long delay, @cfb TimeUnit unit) {
            if (this.f58374c) {
                return b05.INSTANCE;
            }
            poe poeVar = new poe(ofe.onSchedule(run), this.f58373b);
            this.f58373b.add(poeVar);
            try {
                poeVar.setFuture(delay <= 0 ? this.f58372a.submit((Callable) poeVar) : this.f58372a.schedule((Callable) poeVar, delay, unit));
                return poeVar;
            } catch (RejectedExecutionException e) {
                dispose();
                ofe.onError(e);
                return b05.INSTANCE;
            }
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f58366C = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f58369m = new rfe("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger(f58367e, 5).intValue())), true);
    }

    public lof() {
        this(f58369m);
    }

    /* JADX INFO: renamed from: c */
    public static ScheduledExecutorService m16293c(ThreadFactory threadFactory) {
        return dpe.create(threadFactory);
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        return new C8922a(this.f58371d.get());
    }

    @Override // p000.woe
    @cfb
    public lf4 scheduleDirect(@cfb Runnable run, long delay, TimeUnit unit) {
        noe noeVar = new noe(ofe.onSchedule(run), true);
        try {
            noeVar.setFuture(delay <= 0 ? this.f58371d.get().submit(noeVar) : this.f58371d.get().schedule(noeVar, delay, unit));
            return noeVar;
        } catch (RejectedExecutionException e) {
            ofe.onError(e);
            return b05.INSTANCE;
        }
    }

    @Override // p000.woe
    @cfb
    public lf4 schedulePeriodicallyDirect(@cfb Runnable run, long initialDelay, long period, TimeUnit unit) {
        Runnable runnableOnSchedule = ofe.onSchedule(run);
        if (period > 0) {
            loe loeVar = new loe(runnableOnSchedule, true);
            try {
                loeVar.setFuture(this.f58371d.get().scheduleAtFixedRate(loeVar, initialDelay, period, unit));
                return loeVar;
            } catch (RejectedExecutionException e) {
                ofe.onError(e);
                return b05.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f58371d.get();
        q58 q58Var = new q58(runnableOnSchedule, scheduledExecutorService);
        try {
            q58Var.m20072a(initialDelay <= 0 ? scheduledExecutorService.submit(q58Var) : scheduledExecutorService.schedule(q58Var, initialDelay, unit));
            return q58Var;
        } catch (RejectedExecutionException e2) {
            ofe.onError(e2);
            return b05.INSTANCE;
        }
    }

    @Override // p000.woe
    public void shutdown() {
        AtomicReference<ScheduledExecutorService> atomicReference = this.f58371d;
        ScheduledExecutorService scheduledExecutorService = f58366C;
        ScheduledExecutorService andSet = atomicReference.getAndSet(scheduledExecutorService);
        if (andSet != scheduledExecutorService) {
            andSet.shutdownNow();
        }
    }

    @Override // p000.woe
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceM16293c = null;
        do {
            scheduledExecutorService = this.f58371d.get();
            if (scheduledExecutorService != f58366C) {
                if (scheduledExecutorServiceM16293c != null) {
                    scheduledExecutorServiceM16293c.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceM16293c == null) {
                scheduledExecutorServiceM16293c = m16293c(this.f58370c);
            }
        } while (!v7b.m23844a(this.f58371d, scheduledExecutorService, scheduledExecutorServiceM16293c));
    }

    public lof(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f58371d = atomicReference;
        this.f58370c = threadFactory;
        atomicReference.lazySet(m16293c(threadFactory));
    }
}
