package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qp6<T> extends AtomicReference<lf4> implements pxb<T>, lf4 {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: a */
    public final n8d<? super T> f75065a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f75066b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f75067c;

    /* JADX INFO: renamed from: d */
    public boolean f75068d;

    public qp6(n8d<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete) {
        this.f75065a = onNext;
        this.f75066b = onError;
        this.f75067c = onComplete;
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return zf4.isDisposed(get());
    }

    @Override // p000.pxb
    public void onComplete() {
        if (this.f75068d) {
            return;
        }
        this.f75068d = true;
        try {
            this.f75067c.run();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        if (this.f75068d) {
            ofe.onError(t);
            return;
        }
        this.f75068d = true;
        try {
            this.f75066b.accept(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(t, th));
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        if (this.f75068d) {
            return;
        }
        try {
            if (this.f75065a.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            dispose();
            onError(th);
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        zf4.setOnce(this, d);
    }
}
