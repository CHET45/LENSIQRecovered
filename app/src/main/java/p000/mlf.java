package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mlf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends Throwable> f61434a;

    public mlf(nfg<? extends Throwable> errorSupplier) {
        this.f61434a = errorSupplier;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        try {
            th = (Throwable) k75.nullCheck(this.f61434a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            o75.throwIfFatal(th);
        }
        b05.error(th, observer);
    }
}
