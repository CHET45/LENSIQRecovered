package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4613d5 {

    /* JADX INFO: renamed from: a */
    @gib
    public static AbstractC2202c5 f28447a;

    @t28
    private static final long currentTimeMillis() {
        AbstractC2202c5 abstractC2202c5 = f28447a;
        return abstractC2202c5 != null ? abstractC2202c5.currentTimeMillis() : System.currentTimeMillis();
    }

    public static final void mockTimeSource(@gib AbstractC2202c5 abstractC2202c5) {
        f28447a = abstractC2202c5;
    }

    @t28
    private static final long nanoTime() {
        AbstractC2202c5 abstractC2202c5 = f28447a;
        return abstractC2202c5 != null ? abstractC2202c5.nanoTime() : System.nanoTime();
    }

    @t28
    private static final void parkNanos(Object obj, long j) {
        AbstractC2202c5 abstractC2202c5 = f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.parkNanos(obj, j);
        } else {
            LockSupport.parkNanos(obj, j);
        }
    }

    @t28
    private static final void registerTimeLoopThread() {
        AbstractC2202c5 abstractC2202c5 = f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.registerTimeLoopThread();
        }
    }

    @t28
    private static final void trackTask() {
        AbstractC2202c5 abstractC2202c5 = f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.trackTask();
        }
    }

    @t28
    private static final void unTrackTask() {
        AbstractC2202c5 abstractC2202c5 = f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.unTrackTask();
        }
    }

    @t28
    private static final void unpark(Thread thread) {
        AbstractC2202c5 abstractC2202c5 = f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.unpark(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    @t28
    private static final void unregisterTimeLoopThread() {
        AbstractC2202c5 abstractC2202c5 = f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.unregisterTimeLoopThread();
        }
    }

    @t28
    private static final Runnable wrapTask(Runnable runnable) {
        Runnable runnableWrapTask;
        AbstractC2202c5 abstractC2202c5 = f28447a;
        return (abstractC2202c5 == null || (runnableWrapTask = abstractC2202c5.wrapTask(runnable)) == null) ? runnable : runnableWrapTask;
    }
}
