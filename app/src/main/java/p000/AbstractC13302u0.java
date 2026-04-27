package p000;

import p000.e13;

/* JADX INFO: renamed from: u0 */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public abstract class AbstractC13302u0 implements e13.InterfaceC5040b {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13.InterfaceC5041c<?> f86457a;

    public AbstractC13302u0(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        md8.checkNotNullParameter(interfaceC5041c, "key");
        this.f86457a = interfaceC5041c;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) e13.InterfaceC5040b.a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) e13.InterfaceC5040b.a.get(this, interfaceC5041c);
    }

    @Override // p000.e13.InterfaceC5040b
    @yfb
    public e13.InterfaceC5041c<?> getKey() {
        return this.f86457a;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return e13.InterfaceC5040b.a.minusKey(this, interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return e13.InterfaceC5040b.a.plus(this, e13Var);
    }
}
