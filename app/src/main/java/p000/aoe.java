package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class aoe implements jo5<zne> {

    /* JADX INFO: renamed from: a */
    public final hid<hee> f11460a;

    /* JADX INFO: renamed from: b */
    public final hid<lb8> f11461b;

    /* JADX INFO: renamed from: c */
    public final hid<rne> f11462c;

    /* JADX INFO: renamed from: d */
    public final hid<C15808yu> f11463d;

    public aoe(hid<hee> hidVar, hid<lb8> hidVar2, hid<rne> hidVar3, hid<C15808yu> hidVar4) {
        this.f11460a = hidVar;
        this.f11461b = hidVar2;
        this.f11462c = hidVar3;
        this.f11463d = hidVar4;
    }

    public static aoe create(hid<hee> hidVar, hid<lb8> hidVar2, hid<rne> hidVar3, hid<C15808yu> hidVar4) {
        return new aoe(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static zne newInstance(hee heeVar, lb8 lb8Var, rne rneVar, C15808yu c15808yu) {
        return new zne(heeVar, lb8Var, rneVar, c15808yu);
    }

    @Override // p000.hid
    public zne get() {
        return newInstance(this.f11460a.get(), this.f11461b.get(), this.f11462c.get(), this.f11463d.get());
    }
}
