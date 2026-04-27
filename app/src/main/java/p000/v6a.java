package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class v6a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends Throwable> f90103a;

    public v6a(nfg<? extends Throwable> errorSupplier) {
        this.f90103a = errorSupplier;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        observer.onSubscribe(lf4.disposed());
        try {
            th = (Throwable) k75.nullCheck(this.f90103a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            o75.throwIfFatal(th);
        }
        observer.onError(th);
    }
}
