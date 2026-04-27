package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class gh9 implements jo5<fh9> {

    /* JADX INFO: renamed from: a */
    public final hid<my1> f39828a;

    /* JADX INFO: renamed from: b */
    public final hid<qy1> f39829b;

    /* JADX INFO: renamed from: c */
    public final hid<Boolean> f39830c;

    /* JADX INFO: renamed from: d */
    public final hid<Boolean> f39831d;

    public gh9(hid<my1> hidVar, hid<qy1> hidVar2, hid<Boolean> hidVar3, hid<Boolean> hidVar4) {
        this.f39828a = hidVar;
        this.f39829b = hidVar2;
        this.f39830c = hidVar3;
        this.f39831d = hidVar4;
    }

    public static gh9 create(hid<my1> hidVar, hid<qy1> hidVar2, hid<Boolean> hidVar3, hid<Boolean> hidVar4) {
        return new gh9(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static fh9 newInstance(my1 my1Var, qy1 qy1Var, boolean z, boolean z2) {
        return new fh9(my1Var, qy1Var, z, z2);
    }

    @Override // p000.hid
    public fh9 get() {
        return newInstance(this.f39828a.get(), this.f39829b.get(), this.f39830c.get().booleanValue(), this.f39831d.get().booleanValue());
    }
}
