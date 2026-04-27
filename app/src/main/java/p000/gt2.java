package p000;

import p000.rr2;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class gt2 implements jo5<ft2> {

    /* JADX INFO: renamed from: a */
    public final hid<g42> f40970a;

    /* JADX INFO: renamed from: b */
    public final hid<rr2.InterfaceC12211a> f40971b;

    /* JADX INFO: renamed from: c */
    public final hid<woe> f40972c;

    public gt2(hid<g42> hidVar, hid<rr2.InterfaceC12211a> hidVar2, hid<woe> hidVar3) {
        this.f40970a = hidVar;
        this.f40971b = hidVar2;
        this.f40972c = hidVar3;
    }

    public static gt2 create(hid<g42> hidVar, hid<rr2.InterfaceC12211a> hidVar2, hid<woe> hidVar3) {
        return new gt2(hidVar, hidVar2, hidVar3);
    }

    public static ft2 newInstance(g42 g42Var, rr2.InterfaceC12211a interfaceC12211a, woe woeVar) {
        return new ft2(g42Var, interfaceC12211a, woeVar);
    }

    @Override // p000.hid
    public ft2 get() {
        return newInstance(this.f40970a.get(), this.f40971b.get(), this.f40972c.get());
    }
}
