package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class kof extends voe {

    /* JADX INFO: renamed from: C */
    public static final ScheduledExecutorService f54865C;

    /* JADX INFO: renamed from: e */
    public static final String f54866e = "rx2.single-priority";

    /* JADX INFO: renamed from: f */
    public static final String f54867f = "RxSingleScheduler";

    /* JADX INFO: renamed from: m */
    public static final qfe f54868m;

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f54869c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<ScheduledExecutorService> f54870d;

    /* JADX INFO: renamed from: kof$a */
    public static final class C8478a extends voe.AbstractC14185c {

        /* JADX INFO: renamed from: a */
        public final ScheduledExecutorService f54871a;

        /* JADX INFO: renamed from: b */
        public final nm2 f54872b = new nm2();

        /* JADX INFO: renamed from: c */
        public volatile boolean f54873c;

        public C8478a(ScheduledExecutorService scheduledExecutorService) {
            this.f54871a = scheduledExecutorService;
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f54873c) {
                return;
            }
            this.f54873c = true;
            this.f54872b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f54873c;
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
            if (this.f54873c) {
                return c05.INSTANCE;
            }
            qoe qoeVar = new qoe(pfe.onSchedule(runnable), this.f54872b);
            this.f54872b.add(qoeVar);
            try {
                qoeVar.setFuture(j <= 0 ? this.f54871a.submit((Callable) qoeVar) : this.f54871a.schedule((Callable) qoeVar, j, timeUnit));
                return qoeVar;
            } catch (RejectedExecutionException e) {
                dispose();
                pfe.onError(e);
                return c05.INSTANCE;
            }
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f54865C = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f54868m = new qfe("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger(f54866e, 5).intValue())), true);
    }

    public kof() {
        this(f54868m);
    }

    /* JADX INFO: renamed from: b */
    public static ScheduledExecutorService m14880b(ThreadFactory threadFactory) {
        return cpe.create(threadFactory);
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        return new C8478a(this.f54870d.get());
    }

    @Override // p000.voe
    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable, long j, TimeUnit timeUnit) {
        ooe ooeVar = new ooe(pfe.onSchedule(runnable));
        try {
            ooeVar.setFuture(j <= 0 ? this.f54870d.get().submit(ooeVar) : this.f54870d.get().schedule(ooeVar, j, timeUnit));
            return ooeVar;
        } catch (RejectedExecutionException e) {
            pfe.onError(e);
            return c05.INSTANCE;
        }
    }

    @Override // p000.voe
    @bfb
    public mf4 schedulePeriodicallyDirect(@bfb Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = pfe.onSchedule(runnable);
        if (j2 > 0) {
            moe moeVar = new moe(runnableOnSchedule);
            try {
                moeVar.setFuture(this.f54870d.get().scheduleAtFixedRate(moeVar, j, j2, timeUnit));
                return moeVar;
            } catch (RejectedExecutionException e) {
                pfe.onError(e);
                return c05.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f54870d.get();
        r58 r58Var = new r58(runnableOnSchedule, scheduledExecutorService);
        try {
            r58Var.m21021a(j <= 0 ? scheduledExecutorService.submit(r58Var) : scheduledExecutorService.schedule(r58Var, j, timeUnit));
            return r58Var;
        } catch (RejectedExecutionException e2) {
            pfe.onError(e2);
            return c05.INSTANCE;
        }
    }

    @Override // p000.voe
    public void shutdown() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.f54870d.get();
        ScheduledExecutorService scheduledExecutorService2 = f54865C;
        if (scheduledExecutorService == scheduledExecutorService2 || (andSet = this.f54870d.getAndSet(scheduledExecutorService2)) == scheduledExecutorService2) {
            return;
        }
        andSet.shutdownNow();
    }

    @Override // p000.voe
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceM14880b = null;
        do {
            scheduledExecutorService = this.f54870d.get();
            if (scheduledExecutorService != f54865C) {
                if (scheduledExecutorServiceM14880b != null) {
                    scheduledExecutorServiceM14880b.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceM14880b == null) {
                scheduledExecutorServiceM14880b = m14880b(this.f54869c);
            }
        } while (!v7b.m23844a(this.f54870d, scheduledExecutorService, scheduledExecutorServiceM14880b));
    }

    public kof(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f54870d = atomicReference;
        this.f54869c = threadFactory;
        atomicReference.lazySet(m14880b(threadFactory));
    }
}
