package p000;

import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class je3 extends s03 {

    /* JADX INFO: renamed from: f */
    public static final int f50377f = 0;

    public je3(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        super(y03Var, y03Var2, y03Var3, y03Var4);
    }

    @Override // p000.s03
    @yfb
    /* JADX INFO: renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public n8c mo30509createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @yfb ov8 ov8Var) {
        if (f + f2 + f4 + f3 == 0.0f) {
            return new n8c.C9742b(eqf.m28845toRectuvyYCjk(j));
        }
        vic vicVarPath = C8522ku.Path();
        ov8 ov8Var2 = ov8.Ltr;
        float f5 = ov8Var == ov8Var2 ? f : f2;
        vicVarPath.moveTo(0.0f, f5);
        vicVarPath.lineTo(f5, 0.0f);
        if (ov8Var == ov8Var2) {
            f = f2;
        }
        vicVarPath.lineTo(wpf.m33069getWidthimpl(j) - f, 0.0f);
        vicVarPath.lineTo(wpf.m33069getWidthimpl(j), f);
        float f6 = ov8Var == ov8Var2 ? f3 : f4;
        vicVarPath.lineTo(wpf.m33069getWidthimpl(j), wpf.m33066getHeightimpl(j) - f6);
        vicVarPath.lineTo(wpf.m33069getWidthimpl(j) - f6, wpf.m33066getHeightimpl(j));
        if (ov8Var == ov8Var2) {
            f3 = f4;
        }
        vicVarPath.lineTo(f3, wpf.m33066getHeightimpl(j));
        vicVarPath.lineTo(0.0f, wpf.m33066getHeightimpl(j) - f3);
        vicVarPath.close();
        return new n8c.C9741a(vicVarPath);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je3)) {
            return false;
        }
        je3 je3Var = (je3) obj;
        return md8.areEqual(getTopStart(), je3Var.getTopStart()) && md8.areEqual(getTopEnd(), je3Var.getTopEnd()) && md8.areEqual(getBottomEnd(), je3Var.getBottomEnd()) && md8.areEqual(getBottomStart(), je3Var.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @yfb
    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // p000.s03
    @yfb
    public je3 copy(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        return new je3(y03Var, y03Var2, y03Var3, y03Var4);
    }
}
