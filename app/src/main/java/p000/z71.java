package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class z71<T> extends b71<T> {
    @Override // p000.ycg
    public void onError(Throwable th) {
        this.f12828a = null;
        this.f12829b = th;
        countDown();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        this.f12828a = t;
    }
}
