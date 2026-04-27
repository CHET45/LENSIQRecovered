package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class j71<T> extends b71<T> {
    @Override // p000.ycg
    public void onError(Throwable th) {
        if (this.f12828a == null) {
            this.f12829b = th;
        } else {
            pfe.onError(th);
        }
        countDown();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f12828a == null) {
            this.f12828a = t;
            this.f12830c.cancel();
            countDown();
        }
    }
}
