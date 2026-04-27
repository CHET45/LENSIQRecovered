package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class rj9 implements jo5<qj9> {

    /* JADX INFO: renamed from: a */
    public final hid<ow1> f78456a;

    public rj9(hid<ow1> hidVar) {
        this.f78456a = hidVar;
    }

    public static rj9 create(hid<ow1> hidVar) {
        return new rj9(hidVar);
    }

    public static qj9 newInstance(ow1 ow1Var) {
        return new qj9(ow1Var);
    }

    @Override // p000.hid
    public qj9 get() {
        return newInstance(this.f78456a.get());
    }
}
