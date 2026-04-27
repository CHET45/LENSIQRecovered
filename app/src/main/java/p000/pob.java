package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class pob<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends Throwable> f71550a;

    public pob(nfg<? extends Throwable> errorSupplier) {
        this.f71550a = errorSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        try {
            th = (Throwable) k75.nullCheck(this.f71550a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            o75.throwIfFatal(th);
        }
        b05.error(th, observer);
    }
}
