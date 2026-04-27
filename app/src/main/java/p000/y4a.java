package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class y4a<T> extends AtomicReference<lf4> implements k9a<T>, lf4, ut8 {
    private static final long serialVersionUID = -6076952298809384986L;

    /* JADX INFO: renamed from: a */
    public final uu2<? super T> f100333a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f100334b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f100335c;

    public y4a(uu2<? super T> onSuccess, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete) {
        this.f100333a = onSuccess;
        this.f100334b = onError;
        this.f100335c = onComplete;
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.ut8
    public boolean hasCustomOnError() {
        return this.f100334b != r07.f76642f;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return zf4.isDisposed(get());
    }

    @Override // p000.k9a
    public void onComplete() {
        lazySet(zf4.DISPOSED);
        try {
            this.f100335c.run();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.k9a
    public void onError(Throwable e) {
        lazySet(zf4.DISPOSED);
        try {
            this.f100334b.accept(e);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(e, th));
        }
    }

    @Override // p000.k9a
    public void onSubscribe(lf4 d) {
        zf4.setOnce(this, d);
    }

    @Override // p000.k9a
    public void onSuccess(T value) {
        lazySet(zf4.DISPOSED);
        try {
            this.f100333a.accept(value);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }
}
