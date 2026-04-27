package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class wne implements jo5<vne> {

    /* JADX INFO: renamed from: a */
    public final hid<hee> f94847a;

    /* JADX INFO: renamed from: b */
    public final hid<lb8> f94848b;

    /* JADX INFO: renamed from: c */
    public final hid<rne> f94849c;

    public wne(hid<hee> hidVar, hid<lb8> hidVar2, hid<rne> hidVar3) {
        this.f94847a = hidVar;
        this.f94848b = hidVar2;
        this.f94849c = hidVar3;
    }

    public static wne create(hid<hee> hidVar, hid<lb8> hidVar2, hid<rne> hidVar3) {
        return new wne(hidVar, hidVar2, hidVar3);
    }

    public static vne newInstance(hee heeVar, lb8 lb8Var, rne rneVar) {
        return new vne(heeVar, lb8Var, rneVar);
    }

    @Override // p000.hid
    public vne get() {
        return newInstance(this.f94847a.get(), this.f94848b.get(), this.f94849c.get());
    }
}
