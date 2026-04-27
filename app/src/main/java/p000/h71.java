package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class h71<T> extends z61<T> {
    @Override // p000.oxb
    public void onError(Throwable th) {
        if (this.f104276a == null) {
            this.f104277b = th;
        }
        countDown();
    }

    @Override // p000.oxb
    public void onNext(T t) {
        if (this.f104276a == null) {
            this.f104276a = t;
            this.f104278c.dispose();
            countDown();
        }
    }
}
