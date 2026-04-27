package p000;

import p000.n8c;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C13805v extends s03 {

    /* JADX INFO: renamed from: f */
    public static final int f89601f = 0;

    public C13805v(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        super(y03Var, y03Var2, y03Var3, y03Var4);
    }

    /* JADX INFO: renamed from: toRadius-Bz7bX_o, reason: not valid java name */
    private final long m32677toRadiusBz7bX_o(float f) {
        return v03.CornerRadius$default(f, 0.0f, 2, null);
    }

    @Override // p000.s03
    @yfb
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public n8c mo30509createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @yfb ov8 ov8Var) {
        return ((f + f2) + f3) + f4 == 0.0f ? new n8c.C9742b(eqf.m28845toRectuvyYCjk(j)) : new n8c.C9743c(pbe.m31773RoundRectZAM2FJo(eqf.m28845toRectuvyYCjk(j), v03.CornerRadius$default(f, 0.0f, 2, null), v03.CornerRadius$default(f2, 0.0f, 2, null), v03.CornerRadius$default(f3, 0.0f, 2, null), v03.CornerRadius$default(f4, 0.0f, 2, null)));
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13805v)) {
            return false;
        }
        C13805v c13805v = (C13805v) obj;
        return md8.areEqual(getTopStart(), c13805v.getTopStart()) && md8.areEqual(getTopEnd(), c13805v.getTopEnd()) && md8.areEqual(getBottomEnd(), c13805v.getBottomEnd()) && md8.areEqual(getBottomStart(), c13805v.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @yfb
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // p000.s03
    @yfb
    public C13805v copy(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        return new C13805v(y03Var, y03Var2, y03Var3, y03Var4);
    }
}
