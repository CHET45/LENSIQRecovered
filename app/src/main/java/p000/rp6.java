package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rp6<T> extends AtomicReference<mf4> implements oxb<T>, mf4 {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: a */
    public final m8d<? super T> f78974a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f78975b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f78976c;

    /* JADX INFO: renamed from: d */
    public boolean f78977d;

    public rp6(m8d<? super T> m8dVar, tu2<? super Throwable> tu2Var, InterfaceC7178i8 interfaceC7178i8) {
        this.f78974a = m8dVar;
        this.f78975b = tu2Var;
        this.f78976c = interfaceC7178i8;
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return ag4.isDisposed(get());
    }

    @Override // p000.oxb
    public void onComplete() {
        if (this.f78977d) {
            return;
        }
        this.f78977d = true;
        try {
            this.f78976c.run();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        if (this.f78977d) {
            pfe.onError(th);
            return;
        }
        this.f78977d = true;
        try {
            this.f78975b.accept(th);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(th, th2));
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        if (this.f78977d) {
            return;
        }
        try {
            if (this.f78974a.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            dispose();
            onError(th);
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        ag4.setOnce(this, mf4Var);
    }
}
