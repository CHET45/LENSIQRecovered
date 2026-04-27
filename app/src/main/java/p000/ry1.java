package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class ry1 implements jo5<qy1> {

    /* JADX INFO: renamed from: a */
    public final hid<oy1> f80096a;

    /* JADX INFO: renamed from: b */
    public final hid<String[][]> f80097b;

    public ry1(hid<oy1> hidVar, hid<String[][]> hidVar2) {
        this.f80096a = hidVar;
        this.f80097b = hidVar2;
    }

    public static ry1 create(hid<oy1> hidVar, hid<String[][]> hidVar2) {
        return new ry1(hidVar, hidVar2);
    }

    public static qy1 newInstance(oy1 oy1Var, String[][] strArr) {
        return new qy1(oy1Var, strArr);
    }

    @Override // p000.hid
    public qy1 get() {
        return newInstance(this.f80096a.get(), this.f80097b.get());
    }
}
