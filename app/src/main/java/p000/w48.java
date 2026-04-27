package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class w48 implements vac {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vli f93223a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final c64 f93224b;

    public w48(@yfb vli vliVar, @yfb c64 c64Var) {
        this.f93223a = vliVar;
        this.f93224b = c64Var;
    }

    @Override // p000.vac
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo32749calculateBottomPaddingD9Ej5fM() {
        c64 c64Var = this.f93224b;
        return c64Var.mo27170toDpu2uoSUM(this.f93223a.getBottom(c64Var));
    }

    @Override // p000.vac
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public float mo32750calculateLeftPaddingu2uoSUM(@yfb ov8 ov8Var) {
        c64 c64Var = this.f93224b;
        return c64Var.mo27170toDpu2uoSUM(this.f93223a.getLeft(c64Var, ov8Var));
    }

    @Override // p000.vac
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public float mo32751calculateRightPaddingu2uoSUM(@yfb ov8 ov8Var) {
        c64 c64Var = this.f93224b;
        return c64Var.mo27170toDpu2uoSUM(this.f93223a.getRight(c64Var, ov8Var));
    }

    @Override // p000.vac
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public float mo32752calculateTopPaddingD9Ej5fM() {
        c64 c64Var = this.f93224b;
        return c64Var.mo27170toDpu2uoSUM(this.f93223a.getTop(c64Var));
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w48)) {
            return false;
        }
        w48 w48Var = (w48) obj;
        return md8.areEqual(this.f93223a, w48Var.f93223a) && md8.areEqual(this.f93224b, w48Var.f93224b);
    }

    @yfb
    public final vli getInsets() {
        return this.f93223a;
    }

    public int hashCode() {
        return (this.f93223a.hashCode() * 31) + this.f93224b.hashCode();
    }

    @yfb
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f93223a + ", density=" + this.f93224b + ')';
    }
}
