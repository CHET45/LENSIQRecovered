package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class yu2<T> extends AtomicReference<lf4> implements hnf<T>, lf4, ut8 {
    private static final long serialVersionUID = -7012088219455310787L;

    /* JADX INFO: renamed from: a */
    public final uu2<? super T> f102980a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f102981b;

    public yu2(uu2<? super T> onSuccess, uu2<? super Throwable> onError) {
        this.f102980a = onSuccess;
        this.f102981b = onError;
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.ut8
    public boolean hasCustomOnError() {
        return this.f102981b != r07.f76642f;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == zf4.DISPOSED;
    }

    @Override // p000.hnf
    public void onError(Throwable e) {
        lazySet(zf4.DISPOSED);
        try {
            this.f102981b.accept(e);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(e, th));
        }
    }

    @Override // p000.hnf
    public void onSubscribe(lf4 d) {
        zf4.setOnce(this, d);
    }

    @Override // p000.hnf
    public void onSuccess(T value) {
        lazySet(zf4.DISPOSED);
        try {
            this.f102980a.accept(value);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }
}
