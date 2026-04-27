package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wt8<T> extends AtomicReference<lf4> implements pxb<T>, lf4, ut8 {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a */
    public final uu2<? super T> f95485a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f95486b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f95487c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super lf4> f95488d;

    public wt8(uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, uu2<? super lf4> onSubscribe) {
        this.f95485a = onNext;
        this.f95486b = onError;
        this.f95487c = onComplete;
        this.f95488d = onSubscribe;
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.ut8
    public boolean hasCustomOnError() {
        return this.f95486b != r07.f76642f;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == zf4.DISPOSED;
    }

    @Override // p000.pxb
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(zf4.DISPOSED);
        try {
            this.f95487c.run();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        if (isDisposed()) {
            ofe.onError(t);
            return;
        }
        lazySet(zf4.DISPOSED);
        try {
            this.f95486b.accept(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(t, th));
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f95485a.accept(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (zf4.setOnce(this, d)) {
            try {
                this.f95488d.accept(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                d.dispose();
                onError(th);
            }
        }
    }
}
