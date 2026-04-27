package p000;

/* JADX INFO: loaded from: classes7.dex */
@fg5
public final class l3a<T> implements inf<T>, l9a<T>, dh2, mf4 {

    /* JADX INFO: renamed from: a */
    public final inf<? super kgb<T>> f56105a;

    /* JADX INFO: renamed from: b */
    public mf4 f56106b;

    public l3a(inf<? super kgb<T>> infVar) {
        this.f56105a = infVar;
    }

    @Override // p000.mf4
    public void dispose() {
        this.f56106b.dispose();
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f56106b.isDisposed();
    }

    @Override // p000.l9a
    public void onComplete() {
        this.f56105a.onSuccess(kgb.createOnComplete());
    }

    @Override // p000.inf
    public void onError(Throwable th) {
        this.f56105a.onSuccess(kgb.createOnError(th));
    }

    @Override // p000.inf
    public void onSubscribe(mf4 mf4Var) {
        if (ag4.validate(this.f56106b, mf4Var)) {
            this.f56106b = mf4Var;
            this.f56105a.onSubscribe(this);
        }
    }

    @Override // p000.inf
    public void onSuccess(T t) {
        this.f56105a.onSuccess(kgb.createOnNext(t));
    }
}
