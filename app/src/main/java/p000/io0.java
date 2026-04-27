package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class io0 implements jo5<ho0> {

    /* JADX INFO: renamed from: a */
    public final hid<hee> f47760a;

    /* JADX INFO: renamed from: b */
    public final hid<C15808yu> f47761b;

    /* JADX INFO: renamed from: c */
    public final hid<lb8> f47762c;

    /* JADX INFO: renamed from: d */
    public final hid<wb8> f47763d;

    public io0(hid<hee> hidVar, hid<C15808yu> hidVar2, hid<lb8> hidVar3, hid<wb8> hidVar4) {
        this.f47760a = hidVar;
        this.f47761b = hidVar2;
        this.f47762c = hidVar3;
        this.f47763d = hidVar4;
    }

    public static io0 create(hid<hee> hidVar, hid<C15808yu> hidVar2, hid<lb8> hidVar3, hid<wb8> hidVar4) {
        return new io0(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static ho0 newInstance(hee heeVar, C15808yu c15808yu, lb8 lb8Var, wb8 wb8Var) {
        return new ho0(heeVar, c15808yu, lb8Var, wb8Var);
    }

    @Override // p000.hid
    public ho0 get() {
        return newInstance(this.f47760a.get(), this.f47761b.get(), this.f47762c.get(), this.f47763d.get());
    }
}
