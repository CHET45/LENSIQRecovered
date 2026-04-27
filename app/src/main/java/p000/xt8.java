package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class xt8<T> extends AtomicReference<mf4> implements oxb<T>, mf4, vt8 {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a */
    public final tu2<? super T> f99227a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f99228b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f99229c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super mf4> f99230d;

    public xt8(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, tu2<? super mf4> tu2Var3) {
        this.f99227a = tu2Var;
        this.f99228b = tu2Var2;
        this.f99229c = interfaceC7178i8;
        this.f99230d = tu2Var3;
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    @Override // p000.vt8
    public boolean hasCustomOnError() {
        return this.f99228b != q07.f72644f;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == ag4.DISPOSED;
    }

    @Override // p000.oxb
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(ag4.DISPOSED);
        try {
            this.f99229c.run();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        if (isDisposed()) {
            pfe.onError(th);
            return;
        }
        lazySet(ag4.DISPOSED);
        try {
            this.f99228b.accept(th);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(th, th2));
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f99227a.accept(t);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (ag4.setOnce(this, mf4Var)) {
            try {
                this.f99230d.accept(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                mf4Var.dispose();
                onError(th);
            }
        }
    }
}
