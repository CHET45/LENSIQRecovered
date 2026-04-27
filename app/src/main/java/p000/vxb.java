package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vxb<T> extends AtomicReference<lf4> implements pxb<T>, lf4 {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: a */
    public final pxb<? super T> f92559a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<lf4> f92560b = new AtomicReference<>();

    public vxb(pxb<? super T> downstream) {
        this.f92559a = downstream;
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this.f92560b);
        zf4.dispose(this);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f92560b.get() == zf4.DISPOSED;
    }

    @Override // p000.pxb
    public void onComplete() {
        dispose();
        this.f92559a.onComplete();
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        dispose();
        this.f92559a.onError(t);
    }

    @Override // p000.pxb
    public void onNext(T t) {
        this.f92559a.onNext(t);
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (zf4.setOnce(this.f92560b, d)) {
            this.f92559a.onSubscribe(this);
        }
    }

    public void setResource(lf4 resource) {
        zf4.set(this, resource);
    }
}
