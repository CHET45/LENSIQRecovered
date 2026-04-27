package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class hm9 implements jo5<gm9> {

    /* JADX INFO: renamed from: a */
    public final hid<bs2> f44110a;

    /* JADX INFO: renamed from: b */
    public final hid<v1b> f44111b;

    /* JADX INFO: renamed from: c */
    public final hid<uee> f44112c;

    /* JADX INFO: renamed from: d */
    public final hid<m6c> f44113d;

    public hm9(hid<bs2> hidVar, hid<v1b> hidVar2, hid<uee> hidVar3, hid<m6c> hidVar4) {
        this.f44110a = hidVar;
        this.f44111b = hidVar2;
        this.f44112c = hidVar3;
        this.f44113d = hidVar4;
    }

    public static hm9 create(hid<bs2> hidVar, hid<v1b> hidVar2, hid<uee> hidVar3, hid<m6c> hidVar4) {
        return new hm9(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static gm9 newInstance(bs2 bs2Var, Object obj, uee ueeVar, m6c m6cVar) {
        return new gm9(bs2Var, (v1b) obj, ueeVar, m6cVar);
    }

    @Override // p000.hid
    public gm9 get() {
        return newInstance(this.f44110a.get(), this.f44111b.get(), this.f44112c.get(), this.f44113d.get());
    }
}
