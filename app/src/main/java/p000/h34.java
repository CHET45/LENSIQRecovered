package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h34<T, R> extends j34<R> implements kj6<T> {
    private static final long serialVersionUID = 2984505488220891551L;

    /* JADX INFO: renamed from: L */
    public fdg f42161L;

    /* JADX INFO: renamed from: M */
    public boolean f42162M;

    public h34(ycg<? super R> downstream) {
        super(downstream);
    }

    @Override // p000.j34, p000.fdg
    public void cancel() {
        super.cancel();
        this.f42161L.cancel();
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f42162M) {
            complete(this.f49484b);
        } else {
            this.f49483a.onComplete();
        }
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        this.f49484b = null;
        this.f49483a.onError(t);
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.validate(this.f42161L, s)) {
            this.f42161L = s;
            this.f49483a.onSubscribe(this);
            s.request(Long.MAX_VALUE);
        }
    }
}
