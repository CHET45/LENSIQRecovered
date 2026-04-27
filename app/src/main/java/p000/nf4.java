package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nf4<T> extends AbstractC0008a1 implements hnf<T>, k9a<T>, ch2 {
    private static final long serialVersionUID = 8924480688481408726L;

    /* JADX INFO: renamed from: d */
    public final uu2<? super T> f64234d;

    public nf4(sf4 composite, uu2<? super T> onSuccess, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete) {
        super(composite, onError, onComplete);
        this.f64234d = onSuccess;
    }

    @Override // p000.hnf
    public void onSuccess(T t) {
        lf4 lf4Var = get();
        zf4 zf4Var = zf4.DISPOSED;
        if (lf4Var != zf4Var) {
            lazySet(zf4Var);
            try {
                this.f64234d.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }
        m15a();
    }
}
