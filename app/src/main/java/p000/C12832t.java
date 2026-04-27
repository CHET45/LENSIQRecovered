package p000;

import p000.n8c;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C12832t extends s03 {

    /* JADX INFO: renamed from: f */
    public static final int f83291f = 0;

    public C12832t(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        super(y03Var, y03Var2, y03Var3, y03Var4);
    }

    @Override // p000.s03
    @yfb
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public n8c mo30509createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @yfb ov8 ov8Var) {
        if (f + f2 + f4 + f3 == 0.0f) {
            return new n8c.C9742b(eqf.m28845toRectuvyYCjk(j));
        }
        vic vicVarPath = C8522ku.Path();
        vicVarPath.moveTo(0.0f, f);
        vicVarPath.lineTo(f, 0.0f);
        vicVarPath.lineTo(wpf.m33069getWidthimpl(j) - f2, 0.0f);
        vicVarPath.lineTo(wpf.m33069getWidthimpl(j), f2);
        vicVarPath.lineTo(wpf.m33069getWidthimpl(j), wpf.m33066getHeightimpl(j) - f3);
        vicVarPath.lineTo(wpf.m33069getWidthimpl(j) - f3, wpf.m33066getHeightimpl(j));
        vicVarPath.lineTo(f4, wpf.m33066getHeightimpl(j));
        vicVarPath.lineTo(0.0f, wpf.m33066getHeightimpl(j) - f4);
        vicVarPath.close();
        return new n8c.C9741a(vicVarPath);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12832t)) {
            return false;
        }
        C12832t c12832t = (C12832t) obj;
        return md8.areEqual(getTopStart(), c12832t.getTopStart()) && md8.areEqual(getTopEnd(), c12832t.getTopEnd()) && md8.areEqual(getBottomEnd(), c12832t.getBottomEnd()) && md8.areEqual(getBottomStart(), c12832t.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @yfb
    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // p000.s03
    @yfb
    public C12832t copy(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        return new C12832t(y03Var, y03Var2, y03Var3, y03Var4);
    }
}
