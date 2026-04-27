package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mv0<T, R> implements oxb<T>, umd<R> {

    /* JADX INFO: renamed from: a */
    public final oxb<? super R> f62352a;

    /* JADX INFO: renamed from: b */
    public mf4 f62353b;

    /* JADX INFO: renamed from: c */
    public umd<T> f62354c;

    /* JADX INFO: renamed from: d */
    public boolean f62355d;

    /* JADX INFO: renamed from: e */
    public int f62356e;

    public mv0(oxb<? super R> oxbVar) {
        this.f62352a = oxbVar;
    }

    /* JADX INFO: renamed from: a */
    public void m17579a() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m17580b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m17581c(Throwable th) {
        n75.throwIfFatal(th);
        this.f62353b.dispose();
        onError(th);
    }

    @Override // p000.ajf
    public void clear() {
        this.f62354c.clear();
    }

    /* JADX INFO: renamed from: d */
    public final int m17582d(int i) {
        umd<T> umdVar = this.f62354c;
        if (umdVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = umdVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.f62356e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p000.mf4
    public void dispose() {
        this.f62353b.dispose();
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f62353b.isDisposed();
    }

    @Override // p000.ajf
    public boolean isEmpty() {
        return this.f62354c.isEmpty();
    }

    @Override // p000.ajf
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.oxb
    public void onComplete() {
        if (this.f62355d) {
            return;
        }
        this.f62355d = true;
        this.f62352a.onComplete();
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        if (this.f62355d) {
            pfe.onError(th);
        } else {
            this.f62355d = true;
            this.f62352a.onError(th);
        }
    }

    @Override // p000.oxb
    public final void onSubscribe(mf4 mf4Var) {
        if (ag4.validate(this.f62353b, mf4Var)) {
            this.f62353b = mf4Var;
            if (mf4Var instanceof umd) {
                this.f62354c = (umd) mf4Var;
            }
            if (m17580b()) {
                this.f62352a.onSubscribe(this);
                m17579a();
            }
        }
    }

    @Override // p000.ajf
    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
