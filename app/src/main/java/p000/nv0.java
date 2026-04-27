package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class nv0<T, R> implements kj6<T>, bod<R> {

    /* JADX INFO: renamed from: a */
    public final ycg<? super R> f65771a;

    /* JADX INFO: renamed from: b */
    public fdg f65772b;

    /* JADX INFO: renamed from: c */
    public bod<T> f65773c;

    /* JADX INFO: renamed from: d */
    public boolean f65774d;

    /* JADX INFO: renamed from: e */
    public int f65775e;

    public nv0(ycg<? super R> downstream) {
        this.f65771a = downstream;
    }

    /* JADX INFO: renamed from: a */
    public void m18142a() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m18143b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m18144c(Throwable t) {
        o75.throwIfFatal(t);
        this.f65772b.cancel();
        onError(t);
    }

    @Override // p000.fdg
    public void cancel() {
        this.f65772b.cancel();
    }

    @Override // p000.zif
    public void clear() {
        this.f65773c.clear();
    }

    /* JADX INFO: renamed from: d */
    public final int m18145d(int mode) {
        bod<T> bodVar = this.f65773c;
        if (bodVar == null || (mode & 4) != 0) {
            return 0;
        }
        int iRequestFusion = bodVar.requestFusion(mode);
        if (iRequestFusion != 0) {
            this.f65775e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p000.zif
    public boolean isEmpty() {
        return this.f65773c.isEmpty();
    }

    @Override // p000.zif
    public final boolean offer(R e) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f65774d) {
            return;
        }
        this.f65774d = true;
        this.f65771a.onComplete();
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        if (this.f65774d) {
            ofe.onError(t);
        } else {
            this.f65774d = true;
            this.f65771a.onError(t);
        }
    }

    @Override // p000.kj6, p000.ycg
    public final void onSubscribe(fdg s) {
        if (ldg.validate(this.f65772b, s)) {
            this.f65772b = s;
            if (s instanceof bod) {
                this.f65773c = (bod) s;
            }
            if (m18143b()) {
                this.f65771a.onSubscribe(this);
                m18142a();
            }
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        this.f65772b.request(n);
    }

    @Override // p000.zif
    public final boolean offer(R v1, R v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
