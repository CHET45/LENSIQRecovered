package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class gne implements jo5<fne> {

    /* JADX INFO: renamed from: a */
    public final hid<hee> f40364a;

    /* JADX INFO: renamed from: b */
    public final hid<ah9> f40365b;

    public gne(hid<hee> hidVar, hid<ah9> hidVar2) {
        this.f40364a = hidVar;
        this.f40365b = hidVar2;
    }

    public static gne create(hid<hee> hidVar, hid<ah9> hidVar2) {
        return new gne(hidVar, hidVar2);
    }

    public static fne newInstance(hee heeVar, ah9 ah9Var) {
        return new fne(heeVar, ah9Var);
    }

    @Override // p000.hid
    public fne get() {
        return newInstance(this.f40364a.get(), this.f40365b.get());
    }
}
