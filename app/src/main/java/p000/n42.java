package p000;

import p000.fee;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class n42 implements jo5<m42> {

    /* JADX INFO: renamed from: a */
    public final hid<hee> f63235a;

    /* JADX INFO: renamed from: b */
    public final hid<vkb<fee.C5754b>> f63236b;

    /* JADX INFO: renamed from: c */
    public final hid<vkb<Boolean>> f63237c;

    /* JADX INFO: renamed from: d */
    public final hid<ah9> f63238d;

    /* JADX INFO: renamed from: e */
    public final hid<woe> f63239e;

    public n42(hid<hee> hidVar, hid<vkb<fee.C5754b>> hidVar2, hid<vkb<Boolean>> hidVar3, hid<ah9> hidVar4, hid<woe> hidVar5) {
        this.f63235a = hidVar;
        this.f63236b = hidVar2;
        this.f63237c = hidVar3;
        this.f63238d = hidVar4;
        this.f63239e = hidVar5;
    }

    public static n42 create(hid<hee> hidVar, hid<vkb<fee.C5754b>> hidVar2, hid<vkb<Boolean>> hidVar3, hid<ah9> hidVar4, hid<woe> hidVar5) {
        return new n42(hidVar, hidVar2, hidVar3, hidVar4, hidVar5);
    }

    public static m42 newInstance(hee heeVar, vkb<fee.C5754b> vkbVar, vkb<Boolean> vkbVar2, ah9 ah9Var, woe woeVar) {
        return new m42(heeVar, vkbVar, vkbVar2, ah9Var, woeVar);
    }

    @Override // p000.hid
    public m42 get() {
        return newInstance(this.f63235a.get(), this.f63236b.get(), this.f63237c.get(), this.f63238d.get(), this.f63239e.get());
    }
}
