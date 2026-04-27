package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mg2<T> extends kjf<jgb<T>> {

    /* JADX INFO: renamed from: a */
    public final xd2 f60931a;

    public mg2(xd2 source) {
        this.f60931a = source;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super jgb<T>> observer) {
        this.f60931a.subscribe(new k3a(observer));
    }
}
