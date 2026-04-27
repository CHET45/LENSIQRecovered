package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wz4 extends AtomicReference<mf4> implements dh2, mf4, vt8 {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    @Override // p000.vt8
    public boolean hasCustomOnError() {
        return false;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == ag4.DISPOSED;
    }

    @Override // p000.dh2
    public void onComplete() {
        lazySet(ag4.DISPOSED);
    }

    @Override // p000.dh2
    public void onError(Throwable th) {
        lazySet(ag4.DISPOSED);
        pfe.onError(new q2c(th));
    }

    @Override // p000.dh2
    public void onSubscribe(mf4 mf4Var) {
        ag4.setOnce(this, mf4Var);
    }
}
