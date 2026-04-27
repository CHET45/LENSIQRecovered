package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class g11<T> extends AtomicReference<lf4> implements hnf<T>, lf4 {
    private static final long serialVersionUID = 4943102778943297569L;

    /* JADX INFO: renamed from: a */
    public final e11<? super T, ? super Throwable> f38197a;

    public g11(e11<? super T, ? super Throwable> onCallback) {
        this.f38197a = onCallback;
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == zf4.DISPOSED;
    }

    @Override // p000.hnf
    public void onError(Throwable e) {
        try {
            lazySet(zf4.DISPOSED);
            this.f38197a.accept(null, e);
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
        try {
            lazySet(zf4.DISPOSED);
            this.f38197a.accept(value, null);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }
}
