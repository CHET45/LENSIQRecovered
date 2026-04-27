package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jv0<T, R> implements bq2<T>, bod<R> {

    /* JADX INFO: renamed from: a */
    public final bq2<? super R> f51988a;

    /* JADX INFO: renamed from: b */
    public fdg f51989b;

    /* JADX INFO: renamed from: c */
    public bod<T> f51990c;

    /* JADX INFO: renamed from: d */
    public boolean f51991d;

    /* JADX INFO: renamed from: e */
    public int f51992e;

    public jv0(bq2<? super R> downstream) {
        this.f51988a = downstream;
    }

    /* JADX INFO: renamed from: a */
    public void m14341a() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m14342b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m14343c(Throwable t) {
        o75.throwIfFatal(t);
        this.f51989b.cancel();
        onError(t);
    }

    @Override // p000.fdg
    public void cancel() {
        this.f51989b.cancel();
    }

    @Override // p000.zif
    public void clear() {
        this.f51990c.clear();
    }

    /* JADX INFO: renamed from: d */
    public final int m14344d(int mode) {
        bod<T> bodVar = this.f51990c;
        if (bodVar == null || (mode & 4) != 0) {
            return 0;
        }
        int iRequestFusion = bodVar.requestFusion(mode);
        if (iRequestFusion != 0) {
            this.f51992e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p000.zif
    public boolean isEmpty() {
        return this.f51990c.isEmpty();
    }

    @Override // p000.zif
    public final boolean offer(R e) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f51991d) {
            return;
        }
        this.f51991d = true;
        this.f51988a.onComplete();
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        if (this.f51991d) {
            ofe.onError(t);
        } else {
            this.f51991d = true;
            this.f51988a.onError(t);
        }
    }

    @Override // p000.kj6, p000.ycg
    public final void onSubscribe(fdg s) {
        if (ldg.validate(this.f51989b, s)) {
            this.f51989b = s;
            if (s instanceof bod) {
                this.f51990c = (bod) s;
            }
            if (m14342b()) {
                this.f51988a.onSubscribe(this);
                m14341a();
            }
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        this.f51989b.request(n);
    }

    @Override // p000.zif
    public final boolean offer(R v1, R v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
