package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tmf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final T f85331a;

    public tmf(T t) {
        this.f85331a = t;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        infVar.onSubscribe(pg4.disposed());
        infVar.onSuccess(this.f85331a);
    }
}
