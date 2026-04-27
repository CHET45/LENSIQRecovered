package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xpb<T> extends vkb<T> implements nfg<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends T> f98872a;

    public xpb(nfg<? extends T> supplier) {
        this.f98872a = supplier;
    }

    @Override // p000.nfg
    public T get() throws Throwable {
        return (T) k75.nullCheck(this.f98872a.get(), "The supplier returned a null value.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        d34 d34Var = new d34(observer);
        observer.onSubscribe(d34Var);
        if (d34Var.isDisposed()) {
            return;
        }
        try {
            d34Var.complete(k75.nullCheck(this.f98872a.get(), "Supplier returned a null value."));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (d34Var.isDisposed()) {
                ofe.onError(th);
            } else {
                observer.onError(th);
            }
        }
    }
}
