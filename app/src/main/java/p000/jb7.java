package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jb7 implements vy8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<c64, ku2, uy8> f50231a;

    /* JADX INFO: renamed from: b */
    public long f50232b = nu2.Constraints$default(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c */
    public float f50233c;

    /* JADX INFO: renamed from: d */
    @gib
    public uy8 f50234d;

    /* JADX WARN: Multi-variable type inference failed */
    public jb7(@yfb gz6<? super c64, ? super ku2, uy8> gz6Var) {
        this.f50231a = gz6Var;
    }

    @Override // p000.vy8
    @yfb
    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
    public uy8 mo30508invoke0kLqBqw(@yfb c64 c64Var, long j) {
        if (this.f50234d != null && ku2.m30756equalsimpl0(this.f50232b, j) && this.f50233c == c64Var.getDensity()) {
            uy8 uy8Var = this.f50234d;
            md8.checkNotNull(uy8Var);
            return uy8Var;
        }
        this.f50232b = j;
        this.f50233c = c64Var.getDensity();
        uy8 uy8VarInvoke = this.f50231a.invoke(c64Var, ku2.m30751boximpl(j));
        this.f50234d = uy8VarInvoke;
        return uy8VarInvoke;
    }
}
