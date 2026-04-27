package p000;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: y0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC15362y0 extends AtomicReference<Future<?>> implements mf4, epe {

    /* JADX INFO: renamed from: c */
    public static final FutureTask<Void> f99808c;

    /* JADX INFO: renamed from: d */
    public static final FutureTask<Void> f99809d;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: a */
    public final Runnable f99810a;

    /* JADX INFO: renamed from: b */
    public Thread f99811b;

    static {
        Runnable runnable = q07.f72640b;
        f99808c = new FutureTask<>(runnable, null);
        f99809d = new FutureTask<>(runnable, null);
    }

    public AbstractC15362y0(Runnable runnable) {
        this.f99810a = runnable;
    }

    @Override // p000.mf4
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f99808c || future == (futureTask = f99809d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f99811b != Thread.currentThread());
    }

    public Runnable getWrappedRunnable() {
        return this.f99810a;
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f99808c || future == f99809d;
    }

    public final void setFuture(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f99808c) {
                return;
            }
            if (future2 == f99809d) {
                future.cancel(this.f99811b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
