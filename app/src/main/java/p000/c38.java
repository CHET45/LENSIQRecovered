package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class c38<T> extends AtomicReference<lf4> implements pxb<T>, lf4 {
    private static final long serialVersionUID = -5417183359794346637L;

    /* JADX INFO: renamed from: a */
    public final e38<T> f15681a;

    /* JADX INFO: renamed from: b */
    public final int f15682b;

    /* JADX INFO: renamed from: c */
    public zif<T> f15683c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f15684d;

    /* JADX INFO: renamed from: e */
    public int f15685e;

    public c38(e38<T> parent, int prefetch) {
        this.f15681a = parent;
        this.f15682b = prefetch;
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return zf4.isDisposed(get());
    }

    public boolean isDone() {
        return this.f15684d;
    }

    @Override // p000.pxb
    public void onComplete() {
        this.f15681a.innerComplete(this);
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        this.f15681a.innerError(this, t);
    }

    @Override // p000.pxb
    public void onNext(T t) {
        if (this.f15685e == 0) {
            this.f15681a.innerNext(this, t);
        } else {
            this.f15681a.drain();
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (zf4.setOnce(this, d)) {
            if (d instanceof tmd) {
                tmd tmdVar = (tmd) d;
                int iRequestFusion = tmdVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f15685e = iRequestFusion;
                    this.f15683c = tmdVar;
                    this.f15684d = true;
                    this.f15681a.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f15685e = iRequestFusion;
                    this.f15683c = tmdVar;
                    return;
                }
            }
            this.f15683c = xmd.createQueue(-this.f15682b);
        }
    }

    public zif<T> queue() {
        return this.f15683c;
    }

    public void setDone() {
        this.f15684d = true;
    }
}
