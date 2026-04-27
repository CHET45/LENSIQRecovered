package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class u8a<T> extends r4a<T> implements lme<T> {

    /* JADX INFO: renamed from: a */
    public final T f87066a;

    public u8a(T value) {
        this.f87066a = value;
    }

    @Override // p000.lme, p000.nfg
    public T get() {
        return this.f87066a;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> k9aVar) {
        k9aVar.onSubscribe(lf4.disposed());
        k9aVar.onSuccess(this.f87066a);
    }
}
