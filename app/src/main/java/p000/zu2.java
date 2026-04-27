package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zu2<T> extends AtomicReference<mf4> implements inf<T>, mf4, vt8 {
    private static final long serialVersionUID = -7012088219455310787L;

    /* JADX INFO: renamed from: a */
    public final tu2<? super T> f106099a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f106100b;

    public zu2(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2) {
        this.f106099a = tu2Var;
        this.f106100b = tu2Var2;
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    @Override // p000.vt8
    public boolean hasCustomOnError() {
        return this.f106100b != q07.f72644f;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == ag4.DISPOSED;
    }

    @Override // p000.inf
    public void onError(Throwable th) {
        lazySet(ag4.DISPOSED);
        try {
            this.f106100b.accept(th);
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
        lazySet(ag4.DISPOSED);
        try {
            this.f106099a.accept(t);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }
}
