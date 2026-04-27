package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class w32 implements jo5<ene> {

    /* JADX INFO: renamed from: a */
    public final hid<Integer> f93147a;

    /* JADX INFO: renamed from: b */
    public final hid<fne> f93148b;

    /* JADX INFO: renamed from: c */
    public final hid<hne> f93149c;

    public w32(hid<Integer> hidVar, hid<fne> hidVar2, hid<hne> hidVar3) {
        this.f93147a = hidVar;
        this.f93148b = hidVar2;
        this.f93149c = hidVar3;
    }

    public static w32 create(hid<Integer> hidVar, hid<fne> hidVar2, hid<hne> hidVar3) {
        return new w32(hidVar, hidVar2, hidVar3);
    }

    public static ene provideScanPreconditionVerifier(int i, hid<fne> hidVar, hid<hne> hidVar2) {
        return (ene) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m91A(i, hidVar, hidVar2));
    }

    @Override // p000.hid
    public ene get() {
        return provideScanPreconditionVerifier(this.f93147a.get().intValue(), this.f93148b, this.f93149c);
    }
}
