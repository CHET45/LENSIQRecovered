package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class f18<T> implements InterfaceC11178py<T> {

    /* JADX INFO: renamed from: d */
    public static final int f34663d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ct4<T> f34664a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final x1e f34665b;

    /* JADX INFO: renamed from: c */
    public final long f34666c;

    public /* synthetic */ f18(ct4 ct4Var, x1e x1eVar, long j, jt3 jt3Var) {
        this(ct4Var, x1eVar, j);
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof f18)) {
            return false;
        }
        f18 f18Var = (f18) obj;
        return md8.areEqual(f18Var.f34664a, this.f34664a) && f18Var.f34665b == this.f34665b && s1g.m32249equalsimpl0(f18Var.f34666c, this.f34666c);
    }

    @yfb
    public final ct4<T> getAnimation() {
        return this.f34664a;
    }

    /* JADX INFO: renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m28879getInitialStartOffsetRmkjzm4() {
        return this.f34666c;
    }

    @yfb
    public final x1e getRepeatMode() {
        return this.f34665b;
    }

    public int hashCode() {
        return (((this.f34664a.hashCode() * 31) + this.f34665b.hashCode()) * 31) + s1g.m32252hashCodeimpl(this.f34666c);
    }

    @Override // p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> t3i<V> vectorize(@yfb alh<T, V> alhVar) {
        return new a4i(this.f34664a.vectorize((alh) alhVar), this.f34665b, this.f34666c, (jt3) null);
    }

    private f18(ct4<T> ct4Var, x1e x1eVar, long j) {
        this.f34664a = ct4Var;
        this.f34665b = x1eVar;
        this.f34666c = j;
    }

    public /* synthetic */ f18(ct4 ct4Var, x1e x1eVar, long j, int i, jt3 jt3Var) {
        this(ct4Var, (i & 2) != 0 ? x1e.Restart : x1eVar, (i & 4) != 0 ? s1g.m32247constructorimpl$default(0, 0, 2, null) : j, (jt3) null);
    }

    public /* synthetic */ f18(ct4 ct4Var, x1e x1eVar, int i, jt3 jt3Var) {
        this(ct4Var, (i & 2) != 0 ? x1e.Restart : x1eVar);
    }

    @q64(level = u64.f86867c, message = "This constructor has been deprecated")
    public /* synthetic */ f18(ct4 ct4Var, x1e x1eVar) {
        this(ct4Var, x1eVar, s1g.m32247constructorimpl$default(0, 0, 2, null), (jt3) null);
    }
}
