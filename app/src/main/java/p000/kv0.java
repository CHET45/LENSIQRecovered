package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kv0<T, R> implements cq2<T>, cod<R> {

    /* JADX INFO: renamed from: a */
    public final cq2<? super R> f55426a;

    /* JADX INFO: renamed from: b */
    public fdg f55427b;

    /* JADX INFO: renamed from: c */
    public cod<T> f55428c;

    /* JADX INFO: renamed from: d */
    public boolean f55429d;

    /* JADX INFO: renamed from: e */
    public int f55430e;

    public kv0(cq2<? super R> cq2Var) {
        this.f55426a = cq2Var;
    }

    /* JADX INFO: renamed from: a */
    public void m15010a() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m15011b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m15012c(Throwable th) {
        n75.throwIfFatal(th);
        this.f55427b.cancel();
        onError(th);
    }

    @Override // p000.fdg
    public void cancel() {
        this.f55427b.cancel();
    }

    @Override // p000.ajf
    public void clear() {
        this.f55428c.clear();
    }

    /* JADX INFO: renamed from: d */
    public final int m15013d(int i) {
        cod<T> codVar = this.f55428c;
        if (codVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = codVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.f55430e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p000.ajf
    public boolean isEmpty() {
        return this.f55428c.isEmpty();
    }

    @Override // p000.ajf
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f55429d) {
            return;
        }
        this.f55429d = true;
        this.f55426a.onComplete();
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        if (this.f55429d) {
            pfe.onError(th);
        } else {
            this.f55429d = true;
            this.f55426a.onError(th);
        }
    }

    @Override // p000.lj6, p000.ycg
    public final void onSubscribe(fdg fdgVar) {
        if (mdg.validate(this.f55427b, fdgVar)) {
            this.f55427b = fdgVar;
            if (fdgVar instanceof cod) {
                this.f55428c = (cod) fdgVar;
            }
            if (m15011b()) {
                this.f55426a.onSubscribe(this);
                m15010a();
            }
        }
    }

    @Override // p000.fdg
    public void request(long j) {
        this.f55427b.request(j);
    }

    @Override // p000.ajf
    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
