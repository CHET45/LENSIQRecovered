package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class hs7 implements jo5<gs7> {

    /* JADX INFO: renamed from: a */
    public final hid<is7> f44687a;

    public hs7(hid<is7> hidVar) {
        this.f44687a = hidVar;
    }

    public static hs7 create(hid<is7> hidVar) {
        return new hs7(hidVar);
    }

    public static gs7 newInstance(is7 is7Var) {
        return new gs7(is7Var);
    }

    @Override // p000.hid
    public gs7 get() {
        return newInstance(this.f44687a.get());
    }
}
