package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vz4 extends AtomicReference<lf4> implements ch2, lf4, ut8 {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.ut8
    public boolean hasCustomOnError() {
        return false;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == zf4.DISPOSED;
    }

    @Override // p000.ch2, p000.k9a
    public void onComplete() {
        lazySet(zf4.DISPOSED);
    }

    @Override // p000.ch2
    public void onError(Throwable e) {
        lazySet(zf4.DISPOSED);
        ofe.onError(new p2c(e));
    }

    @Override // p000.ch2
    public void onSubscribe(lf4 d) {
        zf4.setOnce(this, d);
    }
}
