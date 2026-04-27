package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,135:1\n62#1,8:136\n62#1,8:144\n27#2:152\n27#2:154\n16#3:153\n16#3:155\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n44#1:136,8\n51#1:144,8\n75#1:152\n88#1:154\n75#1:153\n88#1:155\n*E\n"})
public final class b69 extends m13 implements o34 {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12788F = AtomicIntegerFieldUpdater.newUpdater(b69.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: C */
    @yfb
    public final Object f12789C;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o34 f12790c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final m13 f12791d;

    /* JADX INFO: renamed from: e */
    public final int f12792e;

    /* JADX INFO: renamed from: f */
    @gib
    public final String f12793f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final mh9<Runnable> f12794m;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: b69$a */
    public final class RunnableC1757a implements Runnable {

        /* JADX INFO: renamed from: a */
        @yfb
        public Runnable f12795a;

        public RunnableC1757a(@yfb Runnable runnable) {
            this.f12795a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.f12795a.run();
                } catch (Throwable th) {
                    q13.handleCoroutineException(a05.f2a, th);
                }
                Runnable runnableObtainTaskOrDeallocateWorker = b69.this.obtainTaskOrDeallocateWorker();
                if (runnableObtainTaskOrDeallocateWorker == null) {
                    return;
                }
                this.f12795a = runnableObtainTaskOrDeallocateWorker;
                i++;
                if (i >= 16 && b69.this.f12791d.isDispatchNeeded(b69.this)) {
                    b69.this.f12791d.mo29873dispatch(b69.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b69(@yfb m13 m13Var, int i, @gib String str) {
        o34 o34Var = m13Var instanceof o34 ? (o34) m13Var : null;
        this.f12790c = o34Var == null ? uu3.getDefaultDelay() : o34Var;
        this.f12791d = m13Var;
        this.f12792e = i;
        this.f12793f = str;
        this.f12794m = new mh9<>(false);
        this.f12789C = new Object();
    }

    private final void dispatchInternal(Runnable runnable, qy6<? super RunnableC1757a, bth> qy6Var) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.f12794m.addLast(runnable);
        if (f12788F.get(this) < this.f12792e && tryAllocateWorker() && (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            qy6Var.invoke(new RunnableC1757a(runnableObtainTaskOrDeallocateWorker));
        }
    }

    private final /* synthetic */ int getRunningWorkers$volatile() {
        return this.runningWorkers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            Runnable runnableRemoveFirstOrNull = this.f12794m.removeFirstOrNull();
            if (runnableRemoveFirstOrNull != null) {
                return runnableRemoveFirstOrNull;
            }
            synchronized (this.f12789C) {
                f12788F.decrementAndGet(this);
                if (this.f12794m.getSize() == 0) {
                    return null;
                }
                f12788F.incrementAndGet(this);
            }
        }
    }

    private final /* synthetic */ void setRunningWorkers$volatile(int i) {
        this.runningWorkers$volatile = i;
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.f12789C) {
            if (f12788F.get(this) >= this.f12792e) {
                return false;
            }
            f12788F.incrementAndGet(this);
            return true;
        }
    }

    @Override // p000.o34
    @gib
    @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j, @yfb zy2<? super bth> zy2Var) {
        return this.f12790c.delay(j, zy2Var);
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.f12794m.addLast(runnable);
        if (f12788F.get(this) >= this.f12792e || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.f12791d.mo29873dispatch(this, new RunnableC1757a(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // p000.m13
    @la8
    public void dispatchYield(@yfb e13 e13Var, @yfb Runnable runnable) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.f12794m.addLast(runnable);
        if (f12788F.get(this) >= this.f12792e || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.f12791d.dispatchYield(this, new RunnableC1757a(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // p000.o34
    @yfb
    public yf4 invokeOnTimeout(long j, @yfb Runnable runnable, @yfb e13 e13Var) {
        return this.f12790c.invokeOnTimeout(j, runnable, e13Var);
    }

    @Override // p000.m13
    @yfb
    public m13 limitedParallelism(int i, @gib String str) {
        c69.checkParallelism(i);
        return i >= this.f12792e ? c69.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    @Override // p000.o34
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo29874scheduleResumeAfterDelay(long j, @yfb dq1<? super bth> dq1Var) {
        this.f12790c.mo29874scheduleResumeAfterDelay(j, dq1Var);
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        String str = this.f12793f;
        if (str != null) {
            return str;
        }
        return this.f12791d + ".limitedParallelism(" + this.f12792e + ')';
    }
}
