package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public abstract class e65 extends m13 {

    /* JADX INFO: renamed from: c */
    public long f31896c;

    /* JADX INFO: renamed from: d */
    public boolean f31897d;

    /* JADX INFO: renamed from: e */
    @gib
    public e60<ye4<?>> f31898e;

    public static /* synthetic */ void decrementUseCount$default(e65 e65Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        e65Var.decrementUseCount(z);
    }

    private final long delta(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static /* synthetic */ void incrementUseCount$default(e65 e65Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        e65Var.incrementUseCount(z);
    }

    /* JADX INFO: renamed from: a */
    public long mo9713a() {
        e60<ye4<?>> e60Var = this.f31898e;
        return (e60Var == null || e60Var.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo9714b() {
        return isUnconfinedQueueEmpty();
    }

    public final void decrementUseCount(boolean z) {
        long jDelta = this.f31896c - delta(z);
        this.f31896c = jDelta;
        if (jDelta <= 0 && this.f31897d) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(@yfb ye4<?> ye4Var) {
        e60<ye4<?>> e60Var = this.f31898e;
        if (e60Var == null) {
            e60Var = new e60<>();
            this.f31898e = e60Var;
        }
        e60Var.addLast(ye4Var);
    }

    public final void incrementUseCount(boolean z) {
        this.f31896c += delta(z);
        if (z) {
            return;
        }
        this.f31897d = true;
    }

    public final boolean isActive() {
        return this.f31896c > 0;
    }

    public final boolean isUnconfinedLoopActive() {
        return this.f31896c >= delta(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        e60<ye4<?>> e60Var = this.f31898e;
        if (e60Var != null) {
            return e60Var.isEmpty();
        }
        return true;
    }

    @Override // p000.m13
    @yfb
    public final m13 limitedParallelism(int i, @gib String str) {
        c69.checkParallelism(i);
        return c69.namedOrThis(this, str);
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    public final boolean processUnconfinedEvent() {
        ye4<?> ye4VarRemoveFirstOrNull;
        e60<ye4<?>> e60Var = this.f31898e;
        if (e60Var == null || (ye4VarRemoveFirstOrNull = e60Var.removeFirstOrNull()) == null) {
            return false;
        }
        ye4VarRemoveFirstOrNull.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }
}
