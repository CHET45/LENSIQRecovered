package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class j8a<T> extends r4a<T> implements nfg<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends T> f49817a;

    public j8a(nfg<? extends T> supplier) {
        this.f49817a = supplier;
    }

    @Override // p000.nfg
    public T get() throws Throwable {
        return this.f49817a.get();
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> k9aVar) {
        lf4 lf4VarEmpty = lf4.empty();
        k9aVar.onSubscribe(lf4VarEmpty);
        if (lf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            T t = this.f49817a.get();
            if (lf4VarEmpty.isDisposed()) {
                return;
            }
            if (t == null) {
                k9aVar.onComplete();
            } else {
                k9aVar.onSuccess(t);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (lf4VarEmpty.isDisposed()) {
                ofe.onError(th);
            } else {
                k9aVar.onError(th);
            }
        }
    }
}
