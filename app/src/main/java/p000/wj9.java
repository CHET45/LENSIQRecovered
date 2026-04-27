package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class wj9 implements jo5<vj9> {

    /* JADX INFO: renamed from: a */
    public final hid<js7> f94428a;

    public wj9(hid<js7> hidVar) {
        this.f94428a = hidVar;
    }

    public static wj9 create(hid<js7> hidVar) {
        return new wj9(hidVar);
    }

    public static vj9 newInstance(js7 js7Var) {
        return new vj9(js7Var);
    }

    @Override // p000.hid
    public vj9 get() {
        return newInstance(this.f94428a.get());
    }
}
