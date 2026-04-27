package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class ooe extends AbstractC15362y0 implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public ooe(Runnable runnable) {
        super(runnable);
    }

    @Override // p000.AbstractC15362y0, p000.epe
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f99811b = Thread.currentThread();
        try {
            this.f99810a.run();
            return null;
        } finally {
            lazySet(AbstractC15362y0.f99808c);
            this.f99811b = null;
        }
    }
}
