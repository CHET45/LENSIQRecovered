package p000;

import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public final class dd8 extends jd8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public id8 f29414X;

    /* JADX INFO: renamed from: Y */
    public boolean f29415Y;

    public dd8(@yfb id8 id8Var, boolean z) {
        this.f29414X = id8Var;
        this.f29415Y = z;
    }

    @Override // p000.jd8
    /* JADX INFO: renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    public long mo28642calculateContentConstraintsl58MMJ0(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        int iMinIntrinsicHeight = this.f29414X == id8.Min ? rbaVar.minIntrinsicHeight(ku2.m30763getMaxWidthimpl(j)) : rbaVar.maxIntrinsicHeight(ku2.m30763getMaxWidthimpl(j));
        if (iMinIntrinsicHeight < 0) {
            iMinIntrinsicHeight = 0;
        }
        return ku2.f55323b.m30774fixedHeightOenEA2s(iMinIntrinsicHeight);
    }

    @Override // p000.jd8
    public boolean getEnforceIncoming() {
        return this.f29415Y;
    }

    @yfb
    public final id8 getHeight() {
        return this.f29414X;
    }

    @Override // p000.jd8, p000.ew8
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return this.f29414X == id8.Min ? ed8Var.minIntrinsicHeight(i) : ed8Var.maxIntrinsicHeight(i);
    }

    @Override // p000.jd8, p000.ew8
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return this.f29414X == id8.Min ? ed8Var.minIntrinsicHeight(i) : ed8Var.maxIntrinsicHeight(i);
    }

    public void setEnforceIncoming(boolean z) {
        this.f29415Y = z;
    }

    public final void setHeight(@yfb id8 id8Var) {
        this.f29414X = id8Var;
    }
}
