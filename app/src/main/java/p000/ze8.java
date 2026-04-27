package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class ze8 extends voe {

    /* JADX INFO: renamed from: C */
    public static final qfe f104900C;

    /* JADX INFO: renamed from: H */
    public static final long f104902H = 60;

    /* JADX INFO: renamed from: N */
    public static final C16105c f104905N;

    /* JADX INFO: renamed from: Q */
    public static final String f104906Q = "rx2.io-priority";

    /* JADX INFO: renamed from: X */
    public static final String f104907X = "rx2.io-scheduled-release";

    /* JADX INFO: renamed from: Y */
    public static boolean f104908Y = false;

    /* JADX INFO: renamed from: Z */
    public static final RunnableC16103a f104909Z;

    /* JADX INFO: renamed from: e */
    public static final String f104910e = "RxCachedThreadScheduler";

    /* JADX INFO: renamed from: f */
    public static final qfe f104911f;

    /* JADX INFO: renamed from: m */
    public static final String f104912m = "RxCachedWorkerPoolEvictor";

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f104913c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<RunnableC16103a> f104914d;

    /* JADX INFO: renamed from: M */
    public static final TimeUnit f104904M = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: F */
    public static final String f104901F = "rx2.io-keep-alive-time";

    /* JADX INFO: renamed from: L */
    public static final long f104903L = Long.getLong(f104901F, 60).longValue();

    /* JADX INFO: renamed from: ze8$a */
    public static final class RunnableC16103a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final long f104915a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentLinkedQueue<C16105c> f104916b;

        /* JADX INFO: renamed from: c */
        public final nm2 f104917c;

        /* JADX INFO: renamed from: d */
        public final ScheduledExecutorService f104918d;

        /* JADX INFO: renamed from: e */
        public final Future<?> f104919e;

        /* JADX INFO: renamed from: f */
        public final ThreadFactory f104920f;

        public RunnableC16103a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f104915a = nanos;
            this.f104916b = new ConcurrentLinkedQueue<>();
            this.f104917c = new nm2();
            this.f104920f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, ze8.f104900C);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f104918d = scheduledExecutorServiceNewScheduledThreadPool;
            this.f104919e = scheduledFutureScheduleWithFixedDelay;
        }

        /* JADX INFO: renamed from: a */
        public void m26678a() {
            if (this.f104916b.isEmpty()) {
                return;
            }
            long jM26680c = m26680c();
            for (C16105c c16105c : this.f104916b) {
                if (c16105c.getExpirationTime() > jM26680c) {
                    return;
                }
                if (this.f104916b.remove(c16105c)) {
                    this.f104917c.remove(c16105c);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public C16105c m26679b() {
            if (this.f104917c.isDisposed()) {
                return ze8.f104905N;
            }
            while (!this.f104916b.isEmpty()) {
                C16105c c16105cPoll = this.f104916b.poll();
                if (c16105cPoll != null) {
                    return c16105cPoll;
                }
            }
            C16105c c16105c = new C16105c(this.f104920f);
            this.f104917c.add(c16105c);
            return c16105c;
        }

        /* JADX INFO: renamed from: c */
        public long m26680c() {
            return System.nanoTime();
        }

        /* JADX INFO: renamed from: d */
        public void m26681d(C16105c c16105c) {
            c16105c.setExpirationTime(m26680c() + this.f104915a);
            this.f104916b.offer(c16105c);
        }

        /* JADX INFO: renamed from: e */
        public void m26682e() {
            this.f104917c.dispose();
            Future<?> future = this.f104919e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f104918d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m26678a();
        }
    }

    /* JADX INFO: renamed from: ze8$b */
    public static final class RunnableC16104b extends voe.AbstractC14185c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final RunnableC16103a f104922b;

        /* JADX INFO: renamed from: c */
        public final C16105c f104923c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f104924d = new AtomicBoolean();

        /* JADX INFO: renamed from: a */
        public final nm2 f104921a = new nm2();

        public RunnableC16104b(RunnableC16103a runnableC16103a) {
            this.f104922b = runnableC16103a;
            this.f104923c = runnableC16103a.m26679b();
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f104924d.compareAndSet(false, true)) {
                this.f104921a.dispose();
                if (ze8.f104908Y) {
                    this.f104923c.scheduleActual(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f104922b.m26681d(this.f104923c);
                }
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f104924d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f104922b.m26681d(this.f104923c);
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
            return this.f104921a.isDisposed() ? c05.INSTANCE : this.f104923c.scheduleActual(runnable, j, timeUnit, this.f104921a);
        }
    }

    /* JADX INFO: renamed from: ze8$c */
    public static final class C16105c extends xcb {

        /* JADX INFO: renamed from: c */
        public long f104925c;

        public C16105c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f104925c = 0L;
        }

        public long getExpirationTime() {
            return this.f104925c;
        }

        public void setExpirationTime(long j) {
            this.f104925c = j;
        }
    }

    static {
        C16105c c16105c = new C16105c(new qfe("RxCachedThreadSchedulerShutdown"));
        f104905N = c16105c;
        c16105c.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger(f104906Q, 5).intValue()));
        qfe qfeVar = new qfe("RxCachedThreadScheduler", iMax);
        f104911f = qfeVar;
        f104900C = new qfe("RxCachedWorkerPoolEvictor", iMax);
        f104908Y = Boolean.getBoolean(f104907X);
        RunnableC16103a runnableC16103a = new RunnableC16103a(0L, null, qfeVar);
        f104909Z = runnableC16103a;
        runnableC16103a.m26682e();
    }

    public ze8() {
        this(f104911f);
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        return new RunnableC16104b(this.f104914d.get());
    }

    @Override // p000.voe
    public void shutdown() {
        RunnableC16103a runnableC16103a;
        RunnableC16103a runnableC16103a2;
        do {
            runnableC16103a = this.f104914d.get();
            runnableC16103a2 = f104909Z;
            if (runnableC16103a == runnableC16103a2) {
                return;
            }
        } while (!v7b.m23844a(this.f104914d, runnableC16103a, runnableC16103a2));
        runnableC16103a.m26682e();
    }

    public int size() {
        return this.f104914d.get().f104917c.size();
    }

    @Override // p000.voe
    public void start() {
        RunnableC16103a runnableC16103a = new RunnableC16103a(f104903L, f104904M, this.f104913c);
        if (v7b.m23844a(this.f104914d, f104909Z, runnableC16103a)) {
            return;
        }
        runnableC16103a.m26682e();
    }

    public ze8(ThreadFactory threadFactory) {
        this.f104913c = threadFactory;
        this.f104914d = new AtomicReference<>(f104909Z);
        start();
    }
}
