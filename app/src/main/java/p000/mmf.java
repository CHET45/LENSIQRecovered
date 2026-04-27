package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mmf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f61514a;

    public mmf(oof<T> source) {
        this.f61514a = source;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f61514a.subscribe(observer);
    }
}
