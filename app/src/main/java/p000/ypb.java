package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ypb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f102615a;

    public ypb(wub<T> source) {
        this.f102615a = source;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f102615a.subscribe(observer);
    }
}
