package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jih extends r22 {

    /* JADX INFO: renamed from: s2 */
    @yfb
    public o3h f50684s2;

    public /* synthetic */ jih(o3h o3hVar, l5b l5bVar, y08 y08Var, boolean z, jae jaeVar, ny6 ny6Var, jt3 jt3Var) {
        this(o3hVar, l5bVar, y08Var, z, jaeVar, ny6Var);
    }

    @Override // p000.AbstractC8563l0
    public void applyAdditionalSemantics(@yfb eye eyeVar) {
        bye.setToggleableState(eyeVar, this.f50684s2);
    }

    /* JADX INFO: renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m30526updateQzZPfjk(@yfb o3h o3hVar, @gib l5b l5bVar, @gib y08 y08Var, boolean z, @gib jae jaeVar, @yfb ny6<bth> ny6Var) {
        if (this.f50684s2 != o3hVar) {
            this.f50684s2 = o3hVar;
            sxe.invalidateSemantics(this);
        }
        super.m32072updateQzZPfjk(l5bVar, y08Var, z, (String) null, jaeVar, ny6Var);
    }

    private jih(o3h o3hVar, l5b l5bVar, y08 y08Var, boolean z, jae jaeVar, ny6<bth> ny6Var) {
        super(l5bVar, y08Var, z, null, jaeVar, ny6Var, null);
        this.f50684s2 = o3hVar;
    }
}
