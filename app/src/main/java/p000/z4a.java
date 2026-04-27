package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class z4a<T> extends AtomicReference<mf4> implements l9a<T>, mf4, vt8 {
    private static final long serialVersionUID = -6076952298809384986L;

    /* JADX INFO: renamed from: a */
    public final tu2<? super T> f104143a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f104144b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f104145c;

    public z4a(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8) {
        this.f104143a = tu2Var;
        this.f104144b = tu2Var2;
        this.f104145c = interfaceC7178i8;
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    @Override // p000.vt8
    public boolean hasCustomOnError() {
        return this.f104144b != q07.f72644f;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return ag4.isDisposed(get());
    }

    @Override // p000.l9a
    public void onComplete() {
        lazySet(ag4.DISPOSED);
        try {
            this.f104145c.run();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }

    @Override // p000.l9a
    public void onError(Throwable th) {
        lazySet(ag4.DISPOSED);
        try {
            this.f104144b.accept(th);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(th, th2));
        }
    }

    @Override // p000.l9a
    public void onSubscribe(mf4 mf4Var) {
        ag4.setOnce(this, mf4Var);
    }

    @Override // p000.l9a
    public void onSuccess(T t) {
        lazySet(ag4.DISPOSED);
        try {
            this.f104143a.accept(t);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }
}
