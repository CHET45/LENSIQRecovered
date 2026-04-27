package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class i71<T> extends a71<T> {
    @Override // p000.ycg
    public void onError(Throwable t) {
        if (this.f521a == null) {
            this.f522b = t;
        } else {
            ofe.onError(t);
        }
        countDown();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f521a == null) {
            this.f521a = t;
            this.f523c.cancel();
            countDown();
        }
    }
}
