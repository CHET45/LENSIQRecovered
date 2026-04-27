package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class moe extends AbstractC15362y0 implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public moe(Runnable runnable) {
        super(runnable);
    }

    @Override // p000.AbstractC15362y0, p000.epe
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99811b = Thread.currentThread();
        try {
            this.f99810a.run();
            this.f99811b = null;
        } catch (Throwable th) {
            this.f99811b = null;
            lazySet(AbstractC15362y0.f99808c);
            pfe.onError(th);
        }
    }
}
