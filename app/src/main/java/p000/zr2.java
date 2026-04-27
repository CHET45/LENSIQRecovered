package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class zr2 implements jo5<is7> {

    /* JADX INFO: renamed from: a */
    public final hid<Boolean> f105797a;

    /* JADX INFO: renamed from: b */
    public final hid<vj9> f105798b;

    /* JADX INFO: renamed from: c */
    public final hid<ezg> f105799c;

    public zr2(hid<Boolean> hidVar, hid<vj9> hidVar2, hid<ezg> hidVar3) {
        this.f105797a = hidVar;
        this.f105798b = hidVar2;
        this.f105799c = hidVar3;
    }

    public static zr2 create(hid<Boolean> hidVar, hid<vj9> hidVar2, hid<ezg> hidVar3) {
        return new zr2(hidVar, hidVar2, hidVar3);
    }

    public static is7 provideIllegalOperationHandler(boolean z, hid<vj9> hidVar, hid<ezg> hidVar2) {
        return (is7) s7d.checkNotNullFromProvides(ur2.m23516o(z, hidVar, hidVar2));
    }

    @Override // p000.hid
    public is7 get() {
        return provideIllegalOperationHandler(this.f105797a.get().booleanValue(), this.f105798b, this.f105799c);
    }
}
