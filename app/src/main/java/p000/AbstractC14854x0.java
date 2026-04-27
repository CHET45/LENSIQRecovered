package p000;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC14854x0 extends AtomicReference<Future<?>> implements lf4, fpe {

    /* JADX INFO: renamed from: d */
    public static final FutureTask<Void> f95884d;

    /* JADX INFO: renamed from: e */
    public static final FutureTask<Void> f95885e;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: a */
    public final Runnable f95886a;

    /* JADX INFO: renamed from: b */
    public final boolean f95887b;

    /* JADX INFO: renamed from: c */
    public Thread f95888c;

    static {
        Runnable runnable = r07.f76638b;
        f95884d = new FutureTask<>(runnable, null);
        f95885e = new FutureTask<>(runnable, null);
    }

    public AbstractC14854x0(Runnable runnable, boolean interruptOnCancel) {
        this.f95886a = runnable;
        this.f95887b = interruptOnCancel;
    }

    private void cancelFuture(Future<?> future) {
        if (this.f95888c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f95887b);
        }
    }

    @Override // p000.lf4
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f95884d || future == (futureTask = f95885e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        cancelFuture(future);
    }

    public Runnable getWrappedRunnable() {
        return this.f95886a;
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f95884d || future == f95885e;
    }

    public final void setFuture(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f95884d) {
                return;
            }
            if (future2 == f95885e) {
                cancelFuture(future);
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        String str;
        Future<?> future = get();
        if (future == f95884d) {
            str = "Finished";
        } else if (future == f95885e) {
            str = "Disposed";
        } else if (this.f95888c != null) {
            str = "Running on " + this.f95888c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
