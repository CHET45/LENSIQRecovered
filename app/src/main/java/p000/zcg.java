package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zcg<T> implements dh2, fdg {

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f104806a;

    /* JADX INFO: renamed from: b */
    public mf4 f104807b;

    public zcg(ycg<? super T> ycgVar) {
        this.f104806a = ycgVar;
    }

    @Override // p000.fdg
    public void cancel() {
        this.f104807b.dispose();
    }

    @Override // p000.dh2
    public void onComplete() {
        this.f104806a.onComplete();
    }

    @Override // p000.dh2
    public void onError(Throwable th) {
        this.f104806a.onError(th);
    }

    @Override // p000.dh2
    public void onSubscribe(mf4 mf4Var) {
        if (ag4.validate(this.f104807b, mf4Var)) {
            this.f104807b = mf4Var;
            this.f104806a.onSubscribe(this);
        }
    }

    @Override // p000.fdg
    public void request(long j) {
    }
}
