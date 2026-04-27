package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lc6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final nfg<? extends Throwable> f57183b;

    public lc6(nfg<? extends Throwable> errorSupplier) {
        this.f57183b = errorSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        try {
            th = (Throwable) k75.nullCheck(this.f57183b.get(), "Callable returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            o75.throwIfFatal(th);
        }
        w05.error(th, s);
    }
}
