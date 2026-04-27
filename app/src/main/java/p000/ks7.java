package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class ks7 implements jo5<js7> {

    /* JADX INFO: renamed from: a */
    public final hid<ow1> f55227a;

    public ks7(hid<ow1> hidVar) {
        this.f55227a = hidVar;
    }

    public static ks7 create(hid<ow1> hidVar) {
        return new ks7(hidVar);
    }

    public static js7 newInstance(ow1 ow1Var) {
        return new js7(ow1Var);
    }

    @Override // p000.hid
    public js7 get() {
        return newInstance(this.f55227a.get());
    }
}
