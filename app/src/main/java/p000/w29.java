package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w29 implements zy8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<c64, ku2, x29> f93128a;

    /* JADX INFO: renamed from: b */
    public long f93129b = nu2.Constraints$default(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c */
    public float f93130c;

    /* JADX INFO: renamed from: d */
    @gib
    public x29 f93131d;

    /* JADX WARN: Multi-variable type inference failed */
    public w29(@yfb gz6<? super c64, ? super ku2, x29> gz6Var) {
        this.f93128a = gz6Var;
    }

    @Override // p000.zy8
    @yfb
    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
    public x29 mo32844invoke0kLqBqw(@yfb c64 c64Var, long j) {
        if (this.f93131d != null && ku2.m30756equalsimpl0(this.f93129b, j) && this.f93130c == c64Var.getDensity()) {
            x29 x29Var = this.f93131d;
            md8.checkNotNull(x29Var);
            return x29Var;
        }
        this.f93129b = j;
        this.f93130c = c64Var.getDensity();
        x29 x29VarInvoke = this.f93128a.invoke(c64Var, ku2.m30751boximpl(j));
        this.f93131d = x29VarInvoke;
        return x29VarInvoke;
    }
}
