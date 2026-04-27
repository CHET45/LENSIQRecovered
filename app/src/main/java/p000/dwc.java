package p000;

import p000.cu2;

/* JADX INFO: loaded from: classes.dex */
public class dwc extends adi {
    @Override // p000.iu2
    public void addToSolver(v69 v69Var, boolean z) {
        super.addToSolver(v69Var, z);
        if (this.f74597B1 > 0) {
            iu2 iu2Var = this.f74596A1[0];
            iu2Var.resetAllConstraints();
            cu2.EnumC4503b enumC4503b = cu2.EnumC4503b.LEFT;
            iu2Var.connect(enumC4503b, this, enumC4503b);
            cu2.EnumC4503b enumC4503b2 = cu2.EnumC4503b.RIGHT;
            iu2Var.connect(enumC4503b2, this, enumC4503b2);
            cu2.EnumC4503b enumC4503b3 = cu2.EnumC4503b.TOP;
            iu2Var.connect(enumC4503b3, this, enumC4503b3);
            cu2.EnumC4503b enumC4503b4 = cu2.EnumC4503b.BOTTOM;
            iu2Var.connect(enumC4503b4, this, enumC4503b4);
        }
    }

    @Override // p000.adi
    public void measure(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f74597B1 > 0) {
            paddingLeft += this.f74596A1[0].getWidth();
            paddingTop += this.f74596A1[0].getHeight();
        }
        int iMax = Math.max(getMinWidth(), paddingLeft);
        int iMax2 = Math.max(getMinHeight(), paddingTop);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(iMax, i2) : i == 0 ? iMax : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(iMax2, i4) : i3 == 0 ? iMax2 : 0;
        }
        setMeasure(i2, i4);
        setWidth(i2);
        setHeight(i4);
        m434i(this.f74597B1 > 0);
    }
}
