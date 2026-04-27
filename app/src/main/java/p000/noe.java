package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class noe extends AbstractC14854x0 implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public noe(Runnable runnable, boolean interruptOnCancel) {
        super(runnable, interruptOnCancel);
    }

    @Override // p000.AbstractC14854x0, p000.fpe
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // p000.AbstractC14854x0, java.util.concurrent.atomic.AtomicReference
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.f95888c = Thread.currentThread();
        try {
            try {
                this.f95886a.run();
                return null;
            } finally {
                lazySet(AbstractC14854x0.f95884d);
                this.f95888c = null;
            }
        } catch (Throwable th) {
            ofe.onError(th);
            throw th;
        }
    }
}
