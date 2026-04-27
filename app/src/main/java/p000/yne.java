package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class yne implements jo5<xne> {

    /* JADX INFO: renamed from: a */
    public final hid<hee> f102351a;

    /* JADX INFO: renamed from: b */
    public final hid<lb8> f102352b;

    /* JADX INFO: renamed from: c */
    public final hid<rne> f102353c;

    /* JADX INFO: renamed from: d */
    public final hid<C15808yu> f102354d;

    public yne(hid<hee> hidVar, hid<lb8> hidVar2, hid<rne> hidVar3, hid<C15808yu> hidVar4) {
        this.f102351a = hidVar;
        this.f102352b = hidVar2;
        this.f102353c = hidVar3;
        this.f102354d = hidVar4;
    }

    public static yne create(hid<hee> hidVar, hid<lb8> hidVar2, hid<rne> hidVar3, hid<C15808yu> hidVar4) {
        return new yne(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static xne newInstance(hee heeVar, lb8 lb8Var, rne rneVar, C15808yu c15808yu) {
        return new xne(heeVar, lb8Var, rneVar, c15808yu);
    }

    @Override // p000.hid
    public xne get() {
        return newInstance(this.f102351a.get(), this.f102352b.get(), this.f102353c.get(), this.f102354d.get());
    }
}
