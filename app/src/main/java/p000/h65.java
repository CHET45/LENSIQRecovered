package p000;

import p000.v13;

/* JADX INFO: loaded from: classes7.dex */
public final class h65 {
    @yfb
    public static final e65 createEventLoop() {
        return new e71(Thread.currentThread());
    }

    @t54
    @la8
    @yjd
    public static final boolean isIoDispatcherThread(@yfb Thread thread) {
        if (thread instanceof v13.C13813c) {
            return ((v13.C13813c) thread).isIo();
        }
        return false;
    }

    public static final void platformAutoreleasePool(@yfb ny6<bth> ny6Var) {
        ny6Var.invoke();
    }

    @la8
    public static final long processNextEventInCurrentThread() {
        e65 e65VarCurrentOrNull$kotlinx_coroutines_core = xxg.f99642a.currentOrNull$kotlinx_coroutines_core();
        if (e65VarCurrentOrNull$kotlinx_coroutines_core != null) {
            return e65VarCurrentOrNull$kotlinx_coroutines_core.processNextEvent();
        }
        return Long.MAX_VALUE;
    }

    @t54
    @la8
    @yjd
    public static final long runSingleTaskFromCurrentSystemDispatcher() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof v13.C13813c) {
            return ((v13.C13813c) threadCurrentThread).runSingleTask();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + threadCurrentThread);
    }
}
