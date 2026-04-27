package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i34<T, R> extends k34<R> implements lj6<T> {
    private static final long serialVersionUID = 2984505488220891551L;

    /* JADX INFO: renamed from: L */
    public fdg f45572L;

    /* JADX INFO: renamed from: M */
    public boolean f45573M;

    public i34(ycg<? super R> ycgVar) {
        super(ycgVar);
    }

    @Override // p000.k34, p000.fdg
    public void cancel() {
        super.cancel();
        this.f45572L.cancel();
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f45573M) {
            complete(this.f52503b);
        } else {
            this.f52502a.onComplete();
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        this.f52503b = null;
        this.f52502a.onError(th);
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.validate(this.f45572L, fdgVar)) {
            this.f45572L = fdgVar;
            this.f52502a.onSubscribe(this);
            fdgVar.request(Long.MAX_VALUE);
        }
    }
}
