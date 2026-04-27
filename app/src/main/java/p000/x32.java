package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class x32 implements jo5<une> {

    /* JADX INFO: renamed from: a */
    public final hid<Integer> f96111a;

    /* JADX INFO: renamed from: b */
    public final hid<vne> f96112b;

    /* JADX INFO: renamed from: c */
    public final hid<xne> f96113c;

    /* JADX INFO: renamed from: d */
    public final hid<zne> f96114d;

    public x32(hid<Integer> hidVar, hid<vne> hidVar2, hid<xne> hidVar3, hid<zne> hidVar4) {
        this.f96111a = hidVar;
        this.f96112b = hidVar2;
        this.f96113c = hidVar3;
        this.f96114d = hidVar4;
    }

    public static x32 create(hid<Integer> hidVar, hid<vne> hidVar2, hid<xne> hidVar3, hid<zne> hidVar4) {
        return new x32(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static une provideScanSetupProvider(int i, hid<vne> hidVar, hid<xne> hidVar2, hid<zne> hidVar3) {
        return (une) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m92C(i, hidVar, hidVar2, hidVar3));
    }

    @Override // p000.hid
    public une get() {
        return provideScanSetupProvider(this.f96111a.get().intValue(), this.f96112b, this.f96113c, this.f96114d);
    }
}
