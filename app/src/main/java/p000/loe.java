package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class loe extends AbstractC14854x0 implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public loe(Runnable runnable, boolean interruptOnCancel) {
        super(runnable, interruptOnCancel);
    }

    @Override // p000.AbstractC14854x0, p000.fpe
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f95888c = Thread.currentThread();
        try {
            this.f95886a.run();
            this.f95888c = null;
        } catch (Throwable th) {
            dispose();
            this.f95888c = null;
            ofe.onError(th);
            throw th;
        }
    }

    @Override // p000.AbstractC14854x0, java.util.concurrent.atomic.AtomicReference
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
