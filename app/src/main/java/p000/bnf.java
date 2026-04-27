package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bnf<T> extends kjf<jgb<T>> {

    /* JADX INFO: renamed from: a */
    public final kjf<T> f14226a;

    public bnf(kjf<T> source) {
        this.f14226a = source;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super jgb<T>> observer) {
        this.f14226a.subscribe(new k3a(observer));
    }
}
