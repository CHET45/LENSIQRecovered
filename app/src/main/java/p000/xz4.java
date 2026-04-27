package p000;

/* JADX INFO: loaded from: classes7.dex */
public enum xz4 implements kj6<Object>, pxb<Object>, k9a<Object>, hnf<Object>, ch2, fdg, lf4 {
    INSTANCE;

    public static <T> pxb<T> asObserver() {
        return INSTANCE;
    }

    public static <T> ycg<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // p000.fdg
    public void cancel() {
    }

    @Override // p000.lf4
    public void dispose() {
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return true;
    }

    @Override // p000.ycg
    public void onComplete() {
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        ofe.onError(t);
    }

    @Override // p000.ycg
    public void onNext(Object t) {
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        d.dispose();
    }

    @Override // p000.k9a
    public void onSuccess(Object value) {
    }

    @Override // p000.fdg
    public void request(long n) {
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        s.cancel();
    }
}
