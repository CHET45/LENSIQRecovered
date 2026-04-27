package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class eh9 implements jo5<dh9> {

    /* JADX INFO: renamed from: a */
    public final hid<my1> f33031a;

    /* JADX INFO: renamed from: b */
    public final hid<qy1> f33032b;

    /* JADX INFO: renamed from: c */
    public final hid<Integer> f33033c;

    /* JADX INFO: renamed from: d */
    public final hid<Integer> f33034d;

    /* JADX INFO: renamed from: e */
    public final hid<Boolean> f33035e;

    public eh9(hid<my1> hidVar, hid<qy1> hidVar2, hid<Integer> hidVar3, hid<Integer> hidVar4, hid<Boolean> hidVar5) {
        this.f33031a = hidVar;
        this.f33032b = hidVar2;
        this.f33033c = hidVar3;
        this.f33034d = hidVar4;
        this.f33035e = hidVar5;
    }

    public static eh9 create(hid<my1> hidVar, hid<qy1> hidVar2, hid<Integer> hidVar3, hid<Integer> hidVar4, hid<Boolean> hidVar5) {
        return new eh9(hidVar, hidVar2, hidVar3, hidVar4, hidVar5);
    }

    public static dh9 newInstance(my1 my1Var, qy1 qy1Var, int i, int i2, boolean z) {
        return new dh9(my1Var, qy1Var, i, i2, z);
    }

    @Override // p000.hid
    public dh9 get() {
        return newInstance(this.f33031a.get(), this.f33032b.get(), this.f33033c.get().intValue(), this.f33034d.get().intValue(), this.f33035e.get().booleanValue());
    }
}
