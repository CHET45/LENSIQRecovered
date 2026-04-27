package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class x71<T> extends z61<T> {
    @Override // p000.oxb
    public void onError(Throwable th) {
        this.f104276a = null;
        this.f104277b = th;
        countDown();
    }

    @Override // p000.oxb
    public void onNext(T t) {
        this.f104276a = t;
    }
}
