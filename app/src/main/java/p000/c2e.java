package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class c2e<T> implements fw5<T> {

    /* JADX INFO: renamed from: e */
    public static final int f15593e = 0;

    /* JADX INFO: renamed from: a */
    public final int f15594a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ct4<T> f15595b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final x1e f15596c;

    /* JADX INFO: renamed from: d */
    public final long f15597d;

    public /* synthetic */ c2e(int i, ct4 ct4Var, x1e x1eVar, long j, jt3 jt3Var) {
        this(i, ct4Var, x1eVar, j);
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof c2e)) {
            return false;
        }
        c2e c2eVar = (c2e) obj;
        return c2eVar.f15594a == this.f15594a && md8.areEqual(c2eVar.f15595b, this.f15595b) && c2eVar.f15596c == this.f15596c && s1g.m32249equalsimpl0(c2eVar.f15597d, this.f15597d);
    }

    @yfb
    public final ct4<T> getAnimation() {
        return this.f15595b;
    }

    /* JADX INFO: renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m28188getInitialStartOffsetRmkjzm4() {
        return this.f15597d;
    }

    public final int getIterations() {
        return this.f15594a;
    }

    @yfb
    public final x1e getRepeatMode() {
        return this.f15596c;
    }

    public int hashCode() {
        return (((((this.f15594a * 31) + this.f15595b.hashCode()) * 31) + this.f15596c.hashCode()) * 31) + s1g.m32252hashCodeimpl(this.f15597d);
    }

    private c2e(int i, ct4<T> ct4Var, x1e x1eVar, long j) {
        this.f15594a = i;
        this.f15595b = ct4Var;
        this.f15596c = x1eVar;
        this.f15597d = j;
    }

    @Override // p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> x3i<V> vectorize(@yfb alh<T, V> alhVar) {
        return new e4i(this.f15594a, this.f15595b.vectorize((alh) alhVar), this.f15596c, this.f15597d, (jt3) null);
    }

    public /* synthetic */ c2e(int i, ct4 ct4Var, x1e x1eVar, long j, int i2, jt3 jt3Var) {
        this(i, ct4Var, (i2 & 4) != 0 ? x1e.Restart : x1eVar, (i2 & 8) != 0 ? s1g.m32247constructorimpl$default(0, 0, 2, null) : j, (jt3) null);
    }

    public /* synthetic */ c2e(int i, ct4 ct4Var, x1e x1eVar, int i2, jt3 jt3Var) {
        this(i, ct4Var, (i2 & 4) != 0 ? x1e.Restart : x1eVar);
    }

    @q64(level = u64.f86867c, message = "This constructor has been deprecated")
    public /* synthetic */ c2e(int i, ct4 ct4Var, x1e x1eVar) {
        this(i, ct4Var, x1eVar, s1g.m32247constructorimpl$default(0, 0, 2, null), (jt3) null);
    }
}
