package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.bpe;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class so2 extends woe implements bpe {

    /* JADX INFO: renamed from: C */
    public static final String f82417C = "rx3.computation-threads";

    /* JADX INFO: renamed from: F */
    public static final int f82418F = m22153c(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f82417C, 0).intValue());

    /* JADX INFO: renamed from: H */
    public static final C12711c f82419H;

    /* JADX INFO: renamed from: L */
    public static final String f82420L = "rx3.computation-priority";

    /* JADX INFO: renamed from: e */
    public static final C12710b f82421e;

    /* JADX INFO: renamed from: f */
    public static final String f82422f = "RxComputationThreadPool";

    /* JADX INFO: renamed from: m */
    public static final rfe f82423m;

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f82424c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C12710b> f82425d;

    /* JADX INFO: renamed from: so2$b */
    public static final class C12710b implements bpe {

        /* JADX INFO: renamed from: a */
        public final int f82431a;

        /* JADX INFO: renamed from: b */
        public final C12711c[] f82432b;

        /* JADX INFO: renamed from: c */
        public long f82433c;

        public C12710b(int maxThreads, ThreadFactory threadFactory) {
            this.f82431a = maxThreads;
            this.f82432b = new C12711c[maxThreads];
            for (int i = 0; i < maxThreads; i++) {
                this.f82432b[i] = new C12711c(threadFactory);
            }
        }

        @Override // p000.bpe
        public void createWorkers(int number, bpe.InterfaceC1986a callback) {
            int i = this.f82431a;
            if (i == 0) {
                for (int i2 = 0; i2 < number; i2++) {
                    callback.onWorker(i2, so2.f82419H);
                }
                return;
            }
            int i3 = ((int) this.f82433c) % i;
            for (int i4 = 0; i4 < number; i4++) {
                callback.onWorker(i4, new C12709a(this.f82432b[i3]));
                i3++;
                if (i3 == i) {
                    i3 = 0;
                }
            }
            this.f82433c = i3;
        }

        public C12711c getEventLoop() {
            int i = this.f82431a;
            if (i == 0) {
                return so2.f82419H;
            }
            C12711c[] c12711cArr = this.f82432b;
            long j = this.f82433c;
            this.f82433c = 1 + j;
            return c12711cArr[(int) (j % ((long) i))];
        }

        public void shutdown() {
            for (C12711c c12711c : this.f82432b) {
                c12711c.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: so2$c */
    public static final class C12711c extends wcb {
        public C12711c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C12711c c12711c = new C12711c(new rfe("RxComputationShutdown"));
        f82419H = c12711c;
        c12711c.dispose();
        rfe rfeVar = new rfe("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger(f82420L, 5).intValue())), true);
        f82423m = rfeVar;
        C12710b c12710b = new C12710b(0, rfeVar);
        f82421e = c12710b;
        c12710b.shutdown();
    }

    public so2() {
        this(f82423m);
    }

    /* JADX INFO: renamed from: c */
    public static int m22153c(int cpuCount, int paramThreads) {
        return (paramThreads <= 0 || paramThreads > cpuCount) ? cpuCount : paramThreads;
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        return new C12709a(this.f82425d.get().getEventLoop());
    }

    @Override // p000.bpe
    public void createWorkers(int number, bpe.InterfaceC1986a callback) {
        yjb.verifyPositive(number, "number > 0 required");
        this.f82425d.get().createWorkers(number, callback);
    }

    @Override // p000.woe
    @cfb
    public lf4 scheduleDirect(@cfb Runnable run, long delay, TimeUnit unit) {
        return this.f82425d.get().getEventLoop().scheduleDirect(run, delay, unit);
    }

    @Override // p000.woe
    @cfb
    public lf4 schedulePeriodicallyDirect(@cfb Runnable run, long initialDelay, long period, TimeUnit unit) {
        return this.f82425d.get().getEventLoop().schedulePeriodicallyDirect(run, initialDelay, period, unit);
    }

    @Override // p000.woe
    public void shutdown() {
        AtomicReference<C12710b> atomicReference = this.f82425d;
        C12710b c12710b = f82421e;
        C12710b andSet = atomicReference.getAndSet(c12710b);
        if (andSet != c12710b) {
            andSet.shutdown();
        }
    }

    @Override // p000.woe
    public void start() {
        C12710b c12710b = new C12710b(f82418F, this.f82424c);
        if (v7b.m23844a(this.f82425d, f82421e, c12710b)) {
            return;
        }
        c12710b.shutdown();
    }

    public so2(ThreadFactory threadFactory) {
        this.f82424c = threadFactory;
        this.f82425d = new AtomicReference<>(f82421e);
        start();
    }

    /* JADX INFO: renamed from: so2$a */
    public static final class C12709a extends woe.AbstractC14729c {

        /* JADX INFO: renamed from: a */
        public final s89 f82426a;

        /* JADX INFO: renamed from: b */
        public final mm2 f82427b;

        /* JADX INFO: renamed from: c */
        public final s89 f82428c;

        /* JADX INFO: renamed from: d */
        public final C12711c f82429d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f82430e;

        public C12709a(C12711c poolWorker) {
            this.f82429d = poolWorker;
            s89 s89Var = new s89();
            this.f82426a = s89Var;
            mm2 mm2Var = new mm2();
            this.f82427b = mm2Var;
            s89 s89Var2 = new s89();
            this.f82428c = s89Var2;
            s89Var2.add(s89Var);
            s89Var2.add(mm2Var);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f82430e) {
                return;
            }
            this.f82430e = true;
            this.f82428c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f82430e;
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable action) {
            return this.f82430e ? b05.INSTANCE : this.f82429d.scheduleActual(action, 0L, TimeUnit.MILLISECONDS, this.f82426a);
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable action, long delayTime, @cfb TimeUnit unit) {
            if (this.f82430e) {
                return b05.INSTANCE;
            }
            return this.f82429d.scheduleActual(action, delayTime, unit, this.f82427b);
        }
    }
}
