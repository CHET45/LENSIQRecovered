package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
public final class jn4 implements e13 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e13 f51285a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final Throwable f51286b;

    public jn4(@yfb Throwable th, @yfb e13 e13Var) {
        this.f51285a = e13Var;
        this.f51286b = th;
    }

    @Override // p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) this.f51285a.fold(r, gz6Var);
    }

    @Override // p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) this.f51285a.get(interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return this.f51285a.minusKey(interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return this.f51285a.plus(e13Var);
    }
}
