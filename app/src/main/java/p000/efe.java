package p000;

import p000.d84;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class efe implements jo5<dfe> {

    /* JADX INFO: renamed from: a */
    public final hid<e84> f32920a;

    /* JADX INFO: renamed from: b */
    public final hid<d84.InterfaceC4665a> f32921b;

    public efe(hid<e84> hidVar, hid<d84.InterfaceC4665a> hidVar2) {
        this.f32920a = hidVar;
        this.f32921b = hidVar2;
    }

    public static efe create(hid<e84> hidVar, hid<d84.InterfaceC4665a> hidVar2) {
        return new efe(hidVar, hidVar2);
    }

    public static dfe newInstance(e84 e84Var, hid<d84.InterfaceC4665a> hidVar) {
        return new dfe(e84Var, hidVar);
    }

    @Override // p000.hid
    public dfe get() {
        return newInstance(this.f32920a.get(), this.f32921b);
    }
}
