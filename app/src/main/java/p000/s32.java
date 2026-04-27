package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class s32 implements jo5<vkb<Boolean>> {

    /* JADX INFO: renamed from: a */
    public final hid<Integer> f80488a;

    /* JADX INFO: renamed from: b */
    public final hid<xg9> f80489b;

    public s32(hid<Integer> hidVar, hid<xg9> hidVar2) {
        this.f80488a = hidVar;
        this.f80489b = hidVar2;
    }

    public static s32 create(hid<Integer> hidVar, hid<xg9> hidVar2) {
        return new s32(hidVar, hidVar2);
    }

    public static vkb<Boolean> provideLocationServicesOkObservable(int i, xg9 xg9Var) {
        return (vkb) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m111w(i, xg9Var));
    }

    @Override // p000.hid
    public vkb<Boolean> get() {
        return provideLocationServicesOkObservable(this.f80488a.get().intValue(), this.f80489b.get());
    }
}
