package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lv0<T, R> implements pxb<T>, tmd<R> {

    /* JADX INFO: renamed from: a */
    public final pxb<? super R> f58858a;

    /* JADX INFO: renamed from: b */
    public lf4 f58859b;

    /* JADX INFO: renamed from: c */
    public tmd<T> f58860c;

    /* JADX INFO: renamed from: d */
    public boolean f58861d;

    /* JADX INFO: renamed from: e */
    public int f58862e;

    public lv0(pxb<? super R> downstream) {
        this.f58858a = downstream;
    }

    /* JADX INFO: renamed from: a */
    public void m16390a() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m16391b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m16392c(Throwable t) {
        o75.throwIfFatal(t);
        this.f58859b.dispose();
        onError(t);
    }

    @Override // p000.zif
    public void clear() {
        this.f58860c.clear();
    }

    /* JADX INFO: renamed from: d */
    public final int m16393d(int mode) {
        tmd<T> tmdVar = this.f58860c;
        if (tmdVar == null || (mode & 4) != 0) {
            return 0;
        }
        int iRequestFusion = tmdVar.requestFusion(mode);
        if (iRequestFusion != 0) {
            this.f58862e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p000.lf4
    public void dispose() {
        this.f58859b.dispose();
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f58859b.isDisposed();
    }

    @Override // p000.zif
    public boolean isEmpty() {
        return this.f58860c.isEmpty();
    }

    @Override // p000.zif
    public final boolean offer(R e) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.pxb
    public void onComplete() {
        if (this.f58861d) {
            return;
        }
        this.f58861d = true;
        this.f58858a.onComplete();
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        if (this.f58861d) {
            ofe.onError(t);
        } else {
            this.f58861d = true;
            this.f58858a.onError(t);
        }
    }

    @Override // p000.pxb
    public final void onSubscribe(lf4 d) {
        if (zf4.validate(this.f58859b, d)) {
            this.f58859b = d;
            if (d instanceof tmd) {
                this.f58860c = (tmd) d;
            }
            if (m16391b()) {
                this.f58858a.onSubscribe(this);
                m16390a();
            }
        }
    }

    @Override // p000.zif
    public final boolean offer(R v1, R v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
