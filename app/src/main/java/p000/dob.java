package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dob<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final uu2<? super lf4> f30275b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f30276c;

    public dob(vkb<T> upstream, uu2<? super lf4> onSubscribe, InterfaceC7776j8 onDispose) {
        super(upstream);
        this.f30275b = onSubscribe;
        this.f30276c = onDispose;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new bg4(observer, this.f30275b, this.f30276c));
    }
}
