package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class se6<T> extends l86<T> implements lme<T> {

    /* JADX INFO: renamed from: b */
    public final T f81516b;

    public se6(final T value) {
        this.f81516b = value;
    }

    @Override // p000.lme, p000.nfg
    public T get() {
        return this.f81516b;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        s.onSubscribe(new jme(s, this.f81516b));
    }
}
