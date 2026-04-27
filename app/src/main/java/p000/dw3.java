package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dw3 implements rba {

    /* JADX INFO: renamed from: d */
    public static final int f31155d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ed8 f31156a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final hd8 f31157b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final kd8 f31158c;

    public dw3(@yfb ed8 ed8Var, @yfb hd8 hd8Var, @yfb kd8 kd8Var) {
        this.f31156a = ed8Var;
        this.f31157b = hd8Var;
        this.f31158c = kd8Var;
    }

    @yfb
    public final ed8 getMeasurable() {
        return this.f31156a;
    }

    @Override // p000.ed8
    @gib
    public Object getParentData() {
        return this.f31156a.getParentData();
    }

    @Override // p000.ed8
    public int maxIntrinsicHeight(int i) {
        return this.f31156a.maxIntrinsicHeight(i);
    }

    @Override // p000.ed8
    public int maxIntrinsicWidth(int i) {
        return this.f31156a.maxIntrinsicWidth(i);
    }

    @Override // p000.rba
    @yfb
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public AbstractC0767t mo27949measureBRTryo0(long j) {
        if (this.f31158c == kd8.Width) {
            return new i26(this.f31157b == hd8.Max ? this.f31156a.maxIntrinsicWidth(ku2.m30762getMaxHeightimpl(j)) : this.f31156a.minIntrinsicWidth(ku2.m30762getMaxHeightimpl(j)), ku2.m30758getHasBoundedHeightimpl(j) ? ku2.m30762getMaxHeightimpl(j) : 32767);
        }
        return new i26(ku2.m30759getHasBoundedWidthimpl(j) ? ku2.m30763getMaxWidthimpl(j) : 32767, this.f31157b == hd8.Max ? this.f31156a.maxIntrinsicHeight(ku2.m30763getMaxWidthimpl(j)) : this.f31156a.minIntrinsicHeight(ku2.m30763getMaxWidthimpl(j)));
    }

    @Override // p000.ed8
    public int minIntrinsicHeight(int i) {
        return this.f31156a.minIntrinsicHeight(i);
    }

    @Override // p000.ed8
    public int minIntrinsicWidth(int i) {
        return this.f31156a.minIntrinsicWidth(i);
    }
}
