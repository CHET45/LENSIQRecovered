package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class c9a<T> extends kjf<jgb<T>> {

    /* JADX INFO: renamed from: a */
    public final r4a<T> f16038a;

    public c9a(r4a<T> source) {
        this.f16038a = source;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super jgb<T>> observer) {
        this.f16038a.subscribe(new k3a(observer));
    }
}
