package p000;

/* JADX INFO: loaded from: classes.dex */
public final class je1 extends occ {

    /* JADX INFO: renamed from: g */
    @yfb
    public final he1 f50360g;

    /* JADX INFO: renamed from: h */
    public float f50361h = 1.0f;

    /* JADX INFO: renamed from: i */
    @gib
    public b92 f50362i;

    public je1(@yfb he1 he1Var) {
        this.f50360g = he1Var;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: a */
    public boolean mo3755a(float f) {
        this.f50361h = f;
        return true;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: b */
    public boolean mo3756b(@gib b92 b92Var) {
        this.f50362i = b92Var;
        return true;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: d */
    public void mo3757d(@yfb ip4 ip4Var) {
        ip4.m30247drawRectAsUm42w$default(ip4Var, this.f50360g, 0L, 0L, this.f50361h, null, this.f50362i, 0, 86, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je1) && md8.areEqual(this.f50360g, ((je1) obj).f50360g);
    }

    @yfb
    public final he1 getBrush() {
        return this.f50360g;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo28196getIntrinsicSizeNHjbRc() {
        return this.f50360g.mo29991getIntrinsicSizeNHjbRc();
    }

    public int hashCode() {
        return this.f50360g.hashCode();
    }

    @yfb
    public String toString() {
        return "BrushPainter(brush=" + this.f50360g + ')';
    }
}
