package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class fub<T> extends AbstractC9666n3<T, T> {
    public fub(vkb<T> upstream) {
        super(upstream);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new m1f(observer));
    }
}
