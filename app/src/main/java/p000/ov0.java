package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ov0<T, R> implements lj6<T>, cod<R> {

    /* JADX INFO: renamed from: a */
    public final ycg<? super R> f68845a;

    /* JADX INFO: renamed from: b */
    public fdg f68846b;

    /* JADX INFO: renamed from: c */
    public cod<T> f68847c;

    /* JADX INFO: renamed from: d */
    public boolean f68848d;

    /* JADX INFO: renamed from: e */
    public int f68849e;

    public ov0(ycg<? super R> ycgVar) {
        this.f68845a = ycgVar;
    }

    /* JADX INFO: renamed from: a */
    public void m19033a() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m19034b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m19035c(Throwable th) {
        n75.throwIfFatal(th);
        this.f68846b.cancel();
        onError(th);
    }

    @Override // p000.fdg
    public void cancel() {
        this.f68846b.cancel();
    }

    public void clear() {
        this.f68847c.clear();
    }

    /* JADX INFO: renamed from: d */
    public final int m19036d(int i) {
        cod<T> codVar = this.f68847c;
        if (codVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = codVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.f68849e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p000.ajf
    public boolean isEmpty() {
        return this.f68847c.isEmpty();
    }

    @Override // p000.ajf
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f68848d) {
            return;
        }
        this.f68848d = true;
        this.f68845a.onComplete();
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        if (this.f68848d) {
            pfe.onError(th);
        } else {
            this.f68848d = true;
            this.f68845a.onError(th);
        }
    }

    @Override // p000.lj6, p000.ycg
    public final void onSubscribe(fdg fdgVar) {
        if (mdg.validate(this.f68846b, fdgVar)) {
            this.f68846b = fdgVar;
            if (fdgVar instanceof cod) {
                this.f68847c = (cod) fdgVar;
            }
            if (m19034b()) {
                this.f68845a.onSubscribe(this);
                m19033a();
            }
        }
    }

    @Override // p000.fdg
    public void request(long j) {
        this.f68846b.request(j);
    }

    @Override // p000.ajf
    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
