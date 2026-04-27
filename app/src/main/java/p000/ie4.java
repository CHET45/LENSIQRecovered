package p000;

import p000.fee;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class ie4 implements jo5<fe4> {

    /* JADX INFO: renamed from: a */
    public final hid<String> f46599a;

    /* JADX INFO: renamed from: b */
    public final hid<hee> f46600b;

    /* JADX INFO: renamed from: c */
    public final hid<vkb<fee.C5754b>> f46601c;

    public ie4(hid<String> hidVar, hid<hee> hidVar2, hid<vkb<fee.C5754b>> hidVar3) {
        this.f46599a = hidVar;
        this.f46600b = hidVar2;
        this.f46601c = hidVar3;
    }

    public static ie4 create(hid<String> hidVar, hid<hee> hidVar2, hid<vkb<fee.C5754b>> hidVar3) {
        return new ie4(hidVar, hidVar2, hidVar3);
    }

    public static fe4 newInstance(String str, hee heeVar, vkb<fee.C5754b> vkbVar) {
        return new fe4(str, heeVar, vkbVar);
    }

    @Override // p000.hid
    public fe4 get() {
        return newInstance(this.f46599a.get(), this.f46600b.get(), this.f46601c.get());
    }
}
