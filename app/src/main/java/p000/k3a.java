package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class k3a<T> implements hnf<T>, k9a<T>, ch2, lf4 {

    /* JADX INFO: renamed from: a */
    public final hnf<? super jgb<T>> f52524a;

    /* JADX INFO: renamed from: b */
    public lf4 f52525b;

    public k3a(hnf<? super jgb<T>> downstream) {
        this.f52524a = downstream;
    }

    @Override // p000.lf4
    public void dispose() {
        this.f52525b.dispose();
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f52525b.isDisposed();
    }

    @Override // p000.k9a
    public void onComplete() {
        this.f52524a.onSuccess(jgb.createOnComplete());
    }

    @Override // p000.hnf
    public void onError(Throwable e) {
        this.f52524a.onSuccess(jgb.createOnError(e));
    }

    @Override // p000.hnf
    public void onSubscribe(lf4 d) {
        if (zf4.validate(this.f52525b, d)) {
            this.f52525b = d;
            this.f52524a.onSubscribe(this);
        }
    }

    @Override // p000.hnf
    public void onSuccess(T t) {
        this.f52524a.onSuccess(jgb.createOnNext(t));
    }
}
