package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class u6a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final Throwable f86882a;

    public u6a(Throwable th) {
        this.f86882a = th;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        l9aVar.onSubscribe(pg4.disposed());
        l9aVar.onError(this.f86882a);
    }
}
