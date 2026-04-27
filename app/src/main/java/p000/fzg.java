package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class fzg implements jo5<ezg> {

    /* JADX INFO: renamed from: a */
    public final hid<js7> f38087a;

    public fzg(hid<js7> hidVar) {
        this.f38087a = hidVar;
    }

    public static fzg create(hid<js7> hidVar) {
        return new fzg(hidVar);
    }

    public static ezg newInstance(js7 js7Var) {
        return new ezg(js7Var);
    }

    @Override // p000.hid
    public ezg get() {
        return newInstance(this.f38087a.get());
    }
}
