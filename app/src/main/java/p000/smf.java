package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class smf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final T f82252a;

    public smf(T value) {
        this.f82252a = value;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> hnfVar) {
        hnfVar.onSubscribe(lf4.disposed());
        hnfVar.onSuccess(this.f82252a);
    }
}
