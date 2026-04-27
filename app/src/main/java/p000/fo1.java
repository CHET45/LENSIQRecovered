package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fo1 extends AtomicReference<mf4> implements dh2, mf4, tu2<Throwable>, vt8 {
    private static final long serialVersionUID = -4361286194466301354L;

    /* JADX INFO: renamed from: a */
    public final tu2<? super Throwable> f37213a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f37214b;

    public fo1(InterfaceC7178i8 interfaceC7178i8) {
        this.f37213a = this;
        this.f37214b = interfaceC7178i8;
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    @Override // p000.vt8
    public boolean hasCustomOnError() {
        return this.f37213a != this;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == ag4.DISPOSED;
    }

    @Override // p000.dh2
    public void onComplete() {
        try {
            this.f37214b.run();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
        lazySet(ag4.DISPOSED);
    }

    @Override // p000.dh2
    public void onError(Throwable th) {
        try {
            this.f37213a.accept(th);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(th2);
        }
        lazySet(ag4.DISPOSED);
    }

    @Override // p000.dh2
    public void onSubscribe(mf4 mf4Var) {
        ag4.setOnce(this, mf4Var);
    }

    @Override // p000.tu2
    public void accept(Throwable th) {
        pfe.onError(new q2c(th));
    }

    public fo1(tu2<? super Throwable> tu2Var, InterfaceC7178i8 interfaceC7178i8) {
        this.f37213a = tu2Var;
        this.f37214b = interfaceC7178i8;
    }
}
