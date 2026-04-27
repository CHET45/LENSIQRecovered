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
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class af8 extends woe {

    /* JADX INFO: renamed from: C */
    public static final rfe f1303C;

    /* JADX INFO: renamed from: H */
    public static final long f1305H = 60;

    /* JADX INFO: renamed from: N */
    public static final C0206c f1308N;

    /* JADX INFO: renamed from: Q */
    public static final String f1309Q = "rx3.io-priority";

    /* JADX INFO: renamed from: X */
    public static final String f1310X = "rx3.io-scheduled-release";

    /* JADX INFO: renamed from: Y */
    public static boolean f1311Y = false;

    /* JADX INFO: renamed from: Z */
    public static final RunnableC0204a f1312Z;

    /* JADX INFO: renamed from: e */
    public static final String f1313e = "RxCachedThreadScheduler";

    /* JADX INFO: renamed from: f */
    public static final rfe f1314f;

    /* JADX INFO: renamed from: m */
    public static final String f1315m = "RxCachedWorkerPoolEvictor";

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f1316c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<RunnableC0204a> f1317d;

    /* JADX INFO: renamed from: M */
    public static final TimeUnit f1307M = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: F */
    public static final String f1304F = "rx3.io-keep-alive-time";

    /* JADX INFO: renamed from: L */
    public static final long f1306L = Long.getLong(f1304F, 60).longValue();

    /* JADX INFO: renamed from: af8$a */
    public static final class RunnableC0204a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final long f1318a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentLinkedQueue<C0206c> f1319b;

        /* JADX INFO: renamed from: c */
        public final mm2 f1320c;

        /* JADX INFO: renamed from: d */
        public final ScheduledExecutorService f1321d;

        /* JADX INFO: renamed from: e */
        public final Future<?> f1322e;

        /* JADX INFO: renamed from: f */
        public final ThreadFactory f1323f;

        public RunnableC0204a(long keepAliveTime, TimeUnit unit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = unit != null ? unit.toNanos(keepAliveTime) : 0L;
            this.f1318a = nanos;
            this.f1319b = new ConcurrentLinkedQueue<>();
            this.f1320c = new mm2();
            this.f1323f = threadFactory;
            if (unit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, af8.f1303C);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f1321d = scheduledExecutorServiceNewScheduledThreadPool;
            this.f1322e = scheduledFutureScheduleWithFixedDelay;
        }

        /* JADX INFO: renamed from: a */
        public static void m481a(ConcurrentLinkedQueue<C0206c> expiringWorkerQueue, mm2 allWorkers) {
            if (expiringWorkerQueue.isEmpty()) {
                return;
            }
            long jM482c = m482c();
            for (C0206c c0206c : expiringWorkerQueue) {
                if (c0206c.getExpirationTime() > jM482c) {
                    return;
                }
                if (expiringWorkerQueue.remove(c0206c)) {
                    allWorkers.remove(c0206c);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static long m482c() {
            return System.nanoTime();
        }

        /* JADX INFO: renamed from: b */
        public C0206c m483b() {
            if (this.f1320c.isDisposed()) {
                return af8.f1308N;
            }
            while (!this.f1319b.isEmpty()) {
                C0206c c0206cPoll = this.f1319b.poll();
                if (c0206cPoll != null) {
                    return c0206cPoll;
                }
            }
            C0206c c0206c = new C0206c(this.f1323f);
            this.f1320c.add(c0206c);
            return c0206c;
        }

        /* JADX INFO: renamed from: d */
        public void m484d(C0206c threadWorker) {
            threadWorker.setExpirationTime(m482c() + this.f1318a);
            this.f1319b.offer(threadWorker);
        }

        /* JADX INFO: renamed from: e */
        public void m485e() {
            this.f1320c.dispose();
            Future<?> future = this.f1322e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f1321d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m481a(this.f1319b, this.f1320c);
        }
    }

    /* JADX INFO: renamed from: af8$b */
    public static final class RunnableC0205b extends woe.AbstractC14729c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final RunnableC0204a f1325b;

        /* JADX INFO: renamed from: c */
        public final C0206c f1326c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f1327d = new AtomicBoolean();

        /* JADX INFO: renamed from: a */
        public final mm2 f1324a = new mm2();

        public RunnableC0205b(RunnableC0204a pool) {
            this.f1325b = pool;
            this.f1326c = pool.m483b();
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f1327d.compareAndSet(false, true)) {
                this.f1324a.dispose();
                if (af8.f1311Y) {
                    this.f1326c.scheduleActual(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f1325b.m484d(this.f1326c);
                }
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f1327d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1325b.m484d(this.f1326c);
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable action, long delayTime, @cfb TimeUnit unit) {
            return this.f1324a.isDisposed() ? b05.INSTANCE : this.f1326c.scheduleActual(action, delayTime, unit, this.f1324a);
        }
    }

    /* JADX INFO: renamed from: af8$c */
    public static final class C0206c extends wcb {

        /* JADX INFO: renamed from: c */
        public long f1328c;

        public C0206c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f1328c = 0L;
        }

        public long getExpirationTime() {
            return this.f1328c;
        }

        public void setExpirationTime(long expirationTime) {
            this.f1328c = expirationTime;
        }
    }

    static {
        C0206c c0206c = new C0206c(new rfe("RxCachedThreadSchedulerShutdown"));
        f1308N = c0206c;
        c0206c.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger(f1309Q, 5).intValue()));
        rfe rfeVar = new rfe("RxCachedThreadScheduler", iMax);
        f1314f = rfeVar;
        f1303C = new rfe("RxCachedWorkerPoolEvictor", iMax);
        f1311Y = Boolean.getBoolean(f1310X);
        RunnableC0204a runnableC0204a = new RunnableC0204a(0L, null, rfeVar);
        f1312Z = runnableC0204a;
        runnableC0204a.m485e();
    }

    public af8() {
        this(f1314f);
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        return new RunnableC0205b(this.f1317d.get());
    }

    @Override // p000.woe
    public void shutdown() {
        AtomicReference<RunnableC0204a> atomicReference = this.f1317d;
        RunnableC0204a runnableC0204a = f1312Z;
        RunnableC0204a andSet = atomicReference.getAndSet(runnableC0204a);
        if (andSet != runnableC0204a) {
            andSet.m485e();
        }
    }

    public int size() {
        return this.f1317d.get().f1320c.size();
    }

    @Override // p000.woe
    public void start() {
        RunnableC0204a runnableC0204a = new RunnableC0204a(f1306L, f1307M, this.f1316c);
        if (v7b.m23844a(this.f1317d, f1312Z, runnableC0204a)) {
            return;
        }
        runnableC0204a.m485e();
    }

    public af8(ThreadFactory threadFactory) {
        this.f1316c = threadFactory;
        this.f1317d = new AtomicReference<>(f1312Z);
        start();
    }
}
