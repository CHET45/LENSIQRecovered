package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class y71<T> extends a71<T> {
    @Override // p000.ycg
    public void onError(Throwable t) {
        this.f521a = null;
        this.f522b = t;
        countDown();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        this.f521a = t;
    }
}
