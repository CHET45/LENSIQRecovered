package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fwe extends r22 {

    /* JADX INFO: renamed from: s2 */
    public boolean f37891s2;

    public /* synthetic */ fwe(boolean z, l5b l5bVar, y08 y08Var, boolean z2, jae jaeVar, ny6 ny6Var, jt3 jt3Var) {
        this(z, l5bVar, y08Var, z2, jaeVar, ny6Var);
    }

    @Override // p000.AbstractC8563l0
    public void applyAdditionalSemantics(@yfb eye eyeVar) {
        bye.setSelected(eyeVar, this.f37891s2);
    }

    /* JADX INFO: renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m29676updateQzZPfjk(boolean z, @gib l5b l5bVar, @gib y08 y08Var, boolean z2, @gib jae jaeVar, @yfb ny6<bth> ny6Var) {
        if (this.f37891s2 != z) {
            this.f37891s2 = z;
            sxe.invalidateSemantics(this);
        }
        super.m32072updateQzZPfjk(l5bVar, y08Var, z2, (String) null, jaeVar, ny6Var);
    }

    private fwe(boolean z, l5b l5bVar, y08 y08Var, boolean z2, jae jaeVar, ny6<bth> ny6Var) {
        super(l5bVar, y08Var, z2, null, jaeVar, ny6Var, null);
        this.f37891s2 = z;
    }
}
