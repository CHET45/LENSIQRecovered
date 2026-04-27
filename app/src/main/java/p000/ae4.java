package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class ae4 implements jo5<zd4> {

    /* JADX INFO: renamed from: a */
    public final hid<g42> f1210a;

    /* JADX INFO: renamed from: b */
    public final hid<de4> f1211b;

    public ae4(hid<g42> hidVar, hid<de4> hidVar2) {
        this.f1210a = hidVar;
        this.f1211b = hidVar2;
    }

    public static ae4 create(hid<g42> hidVar, hid<de4> hidVar2) {
        return new ae4(hidVar, hidVar2);
    }

    public static zd4 newInstance(g42 g42Var, de4 de4Var) {
        return new zd4(g42Var, de4Var);
    }

    @Override // p000.hid
    public zd4 get() {
        return newInstance(this.f1210a.get(), this.f1211b.get());
    }
}
