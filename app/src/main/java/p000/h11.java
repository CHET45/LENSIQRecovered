package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class h11<T> extends AtomicReference<mf4> implements inf<T>, mf4 {
    private static final long serialVersionUID = 4943102778943297569L;

    /* JADX INFO: renamed from: a */
    public final f11<? super T, ? super Throwable> f41972a;

    public h11(f11<? super T, ? super Throwable> f11Var) {
        this.f41972a = f11Var;
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == ag4.DISPOSED;
    }

    @Override // p000.inf
    public void onError(Throwable th) {
        try {
            lazySet(ag4.DISPOSED);
            this.f41972a.accept(null, th);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(th, th2));
        }
    }

    @Override // p000.inf
    public void onSubscribe(mf4 mf4Var) {
        ag4.setOnce(this, mf4Var);
    }

    @Override // p000.inf
    public void onSuccess(T t) {
        try {
            lazySet(ag4.DISPOSED);
            this.f41972a.accept(t, null);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }
}
