package p000;

import p000.e13;
import p000.vsf;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@sg5
public final class wsf implements vsf, nxg<ssf> {

    /* JADX INFO: renamed from: b */
    public static final int f95445b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ssf f95446a;

    public wsf(@yfb ssf ssfVar) {
        this.f95446a = ssfVar;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) vsf.C14250a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) vsf.C14250a.get(this, interfaceC5041c);
    }

    @Override // p000.e13.InterfaceC5040b
    @yfb
    public e13.InterfaceC5041c<?> getKey() {
        return vsf.f92187a1;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return vsf.C14250a.minusKey(this, interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return vsf.C14250a.plus(this, e13Var);
    }

    @Override // p000.nxg
    public void restoreThreadContext(@yfb e13 e13Var, @gib ssf ssfVar) {
        this.f95446a.unsafeLeave(ssfVar);
    }

    @Override // p000.nxg
    @gib
    public ssf updateThreadContext(@yfb e13 e13Var) {
        return this.f95446a.unsafeEnter();
    }
}
