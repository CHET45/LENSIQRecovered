package p000;

import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class ube extends s03 {

    /* JADX INFO: renamed from: f */
    public static final int f87448f = 0;

    public ube(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        super(y03Var, y03Var2, y03Var3, y03Var4);
    }

    @Override // p000.s03
    @yfb
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public n8c mo30509createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @yfb ov8 ov8Var) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new n8c.C9742b(eqf.m28845toRectuvyYCjk(j));
        }
        rud rudVarM28845toRectuvyYCjk = eqf.m28845toRectuvyYCjk(j);
        ov8 ov8Var2 = ov8.Ltr;
        return new n8c.C9743c(pbe.m31773RoundRectZAM2FJo(rudVarM28845toRectuvyYCjk, v03.CornerRadius$default(ov8Var == ov8Var2 ? f : f2, 0.0f, 2, null), v03.CornerRadius$default(ov8Var == ov8Var2 ? f2 : f, 0.0f, 2, null), v03.CornerRadius$default(ov8Var == ov8Var2 ? f3 : f4, 0.0f, 2, null), v03.CornerRadius$default(ov8Var == ov8Var2 ? f4 : f3, 0.0f, 2, null)));
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ube)) {
            return false;
        }
        ube ubeVar = (ube) obj;
        return md8.areEqual(getTopStart(), ubeVar.getTopStart()) && md8.areEqual(getTopEnd(), ubeVar.getTopEnd()) && md8.areEqual(getBottomEnd(), ubeVar.getBottomEnd()) && md8.areEqual(getBottomStart(), ubeVar.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @yfb
    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // p000.s03
    @yfb
    public ube copy(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        return new ube(y03Var, y03Var2, y03Var3, y03Var4);
    }
}
