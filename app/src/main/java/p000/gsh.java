package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
public final class gsh implements e13.InterfaceC5040b, e13.InterfaceC5041c<gsh> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final gsh f40953a = new gsh();

    private gsh() {
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
        return this;
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
