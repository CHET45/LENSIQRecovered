package p000;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2202c5 {
    public abstract long currentTimeMillis();

    public abstract long nanoTime();

    public abstract void parkNanos(@yfb Object obj, long j);

    public abstract void registerTimeLoopThread();

    public abstract void trackTask();

    public abstract void unTrackTask();

    public abstract void unpark(@yfb Thread thread);

    public abstract void unregisterTimeLoopThread();

    @yfb
    public abstract Runnable wrapTask(@yfb Runnable runnable);
}
