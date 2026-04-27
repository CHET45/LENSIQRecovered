package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class ky1 implements jo5<jy1> {

    /* JADX INFO: renamed from: a */
    public final hid<oy1> f55616a;

    /* JADX INFO: renamed from: b */
    public final hid<String[][]> f55617b;

    public ky1(hid<oy1> hidVar, hid<String[][]> hidVar2) {
        this.f55616a = hidVar;
        this.f55617b = hidVar2;
    }

    public static ky1 create(hid<oy1> hidVar, hid<String[][]> hidVar2) {
        return new ky1(hidVar, hidVar2);
    }

    public static jy1 newInstance(oy1 oy1Var, String[][] strArr) {
        return new jy1(oy1Var, strArr);
    }

    @Override // p000.hid
    public jy1 get() {
        return newInstance(this.f55616a.get(), this.f55617b.get());
    }
}
