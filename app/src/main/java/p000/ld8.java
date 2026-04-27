package p000;

import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public final class ld8 extends jd8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public id8 f57244X;

    /* JADX INFO: renamed from: Y */
    public boolean f57245Y;

    public ld8(@yfb id8 id8Var, boolean z) {
        this.f57244X = id8Var;
        this.f57245Y = z;
    }

    @Override // p000.jd8
    /* JADX INFO: renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo28642calculateContentConstraintsl58MMJ0(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        int iMinIntrinsicWidth = this.f57244X == id8.Min ? rbaVar.minIntrinsicWidth(ku2.m30762getMaxHeightimpl(j)) : rbaVar.maxIntrinsicWidth(ku2.m30762getMaxHeightimpl(j));
        if (iMinIntrinsicWidth < 0) {
            iMinIntrinsicWidth = 0;
        }
        return ku2.f55323b.m30775fixedWidthOenEA2s(iMinIntrinsicWidth);
    }

    @Override // p000.jd8
    public boolean getEnforceIncoming() {
        return this.f57245Y;
    }

    @yfb
    public final id8 getWidth() {
        return this.f57244X;
    }

    @Override // p000.jd8, p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return this.f57244X == id8.Min ? ed8Var.minIntrinsicWidth(i) : ed8Var.maxIntrinsicWidth(i);
    }

    @Override // p000.jd8, p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return this.f57244X == id8.Min ? ed8Var.minIntrinsicWidth(i) : ed8Var.maxIntrinsicWidth(i);
    }

    public void setEnforceIncoming(boolean z) {
        this.f57245Y = z;
    }

    public final void setWidth(@yfb id8 id8Var) {
        this.f57244X = id8Var;
    }
}
