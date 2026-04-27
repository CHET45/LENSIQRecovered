package p000;

/* JADX INFO: loaded from: classes7.dex */
public enum yz4 implements lj6<Object>, oxb<Object>, l9a<Object>, inf<Object>, dh2, fdg, mf4 {
    INSTANCE;

    public static <T> oxb<T> asObserver() {
        return INSTANCE;
    }

    public static <T> ycg<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // p000.fdg
    public void cancel() {
    }

    @Override // p000.mf4
    public void dispose() {
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return true;
    }

    @Override // p000.ycg
    public void onComplete() {
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        pfe.onError(th);
    }

    @Override // p000.ycg
    public void onNext(Object obj) {
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        mf4Var.dispose();
    }

    @Override // p000.l9a
    public void onSuccess(Object obj) {
    }

    @Override // p000.fdg
    public void request(long j) {
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        fdgVar.cancel();
    }
}
