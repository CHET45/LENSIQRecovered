package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class p3i extends m3i {

    /* JADX INFO: renamed from: Y */
    public static final int f69589Y = 0;

    /* JADX INFO: renamed from: C */
    public final float f69590C;

    /* JADX INFO: renamed from: F */
    public final float f69591F;

    /* JADX INFO: renamed from: H */
    public final int f69592H;

    /* JADX INFO: renamed from: L */
    public final int f69593L;

    /* JADX INFO: renamed from: M */
    public final float f69594M;

    /* JADX INFO: renamed from: N */
    public final float f69595N;

    /* JADX INFO: renamed from: Q */
    public final float f69596Q;

    /* JADX INFO: renamed from: X */
    public final float f69597X;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f69598b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<qjc> f69599c;

    /* JADX INFO: renamed from: d */
    public final int f69600d;

    /* JADX INFO: renamed from: e */
    @gib
    public final he1 f69601e;

    /* JADX INFO: renamed from: f */
    public final float f69602f;

    /* JADX INFO: renamed from: m */
    @gib
    public final he1 f69603m;

    public /* synthetic */ p3i(String str, List list, int i, he1 he1Var, float f, he1 he1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, jt3 jt3Var) {
        this(str, list, i, he1Var, f, he1Var2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p3i.class == obj.getClass()) {
            p3i p3iVar = (p3i) obj;
            return md8.areEqual(this.f69598b, p3iVar.f69598b) && md8.areEqual(this.f69601e, p3iVar.f69601e) && this.f69602f == p3iVar.f69602f && md8.areEqual(this.f69603m, p3iVar.f69603m) && this.f69590C == p3iVar.f69590C && this.f69591F == p3iVar.f69591F && fag.m28900equalsimpl0(this.f69592H, p3iVar.f69592H) && hag.m29980equalsimpl0(this.f69593L, p3iVar.f69593L) && this.f69594M == p3iVar.f69594M && this.f69595N == p3iVar.f69595N && this.f69596Q == p3iVar.f69596Q && this.f69597X == p3iVar.f69597X && bjc.m28000equalsimpl0(this.f69600d, p3iVar.f69600d) && md8.areEqual(this.f69599c, p3iVar.f69599c);
        }
        return false;
    }

    @gib
    public final he1 getFill() {
        return this.f69601e;
    }

    public final float getFillAlpha() {
        return this.f69602f;
    }

    @yfb
    public final String getName() {
        return this.f69598b;
    }

    @yfb
    public final List<qjc> getPathData() {
        return this.f69599c;
    }

    /* JADX INFO: renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m31719getPathFillTypeRgk1Os() {
        return this.f69600d;
    }

    @gib
    public final he1 getStroke() {
        return this.f69603m;
    }

    public final float getStrokeAlpha() {
        return this.f69590C;
    }

    /* JADX INFO: renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m31720getStrokeLineCapKaPHkGw() {
        return this.f69592H;
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m31721getStrokeLineJoinLxFBmk8() {
        return this.f69593L;
    }

    public final float getStrokeLineMiter() {
        return this.f69594M;
    }

    public final float getStrokeLineWidth() {
        return this.f69591F;
    }

    public final float getTrimPathEnd() {
        return this.f69596Q;
    }

    public final float getTrimPathOffset() {
        return this.f69597X;
    }

    public final float getTrimPathStart() {
        return this.f69595N;
    }

    public int hashCode() {
        int iHashCode = ((this.f69598b.hashCode() * 31) + this.f69599c.hashCode()) * 31;
        he1 he1Var = this.f69601e;
        int iHashCode2 = (((iHashCode + (he1Var != null ? he1Var.hashCode() : 0)) * 31) + Float.hashCode(this.f69602f)) * 31;
        he1 he1Var2 = this.f69603m;
        return ((((((((((((((((((iHashCode2 + (he1Var2 != null ? he1Var2.hashCode() : 0)) * 31) + Float.hashCode(this.f69590C)) * 31) + Float.hashCode(this.f69591F)) * 31) + fag.m28901hashCodeimpl(this.f69592H)) * 31) + hag.m29981hashCodeimpl(this.f69593L)) * 31) + Float.hashCode(this.f69594M)) * 31) + Float.hashCode(this.f69595N)) * 31) + Float.hashCode(this.f69596Q)) * 31) + Float.hashCode(this.f69597X)) * 31) + bjc.m28001hashCodeimpl(this.f69600d);
    }

    public /* synthetic */ p3i(String str, List list, int i, he1 he1Var, float f, he1 he1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? "" : str, list, i, (i4 & 8) != 0 ? null : he1Var, (i4 & 16) != 0 ? 1.0f : f, (i4 & 32) != 0 ? null : he1Var2, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? 0.0f : f3, (i4 & 256) != 0 ? l3i.getDefaultStrokeLineCap() : i2, (i4 & 512) != 0 ? l3i.getDefaultStrokeLineJoin() : i3, (i4 & 1024) != 0 ? 4.0f : f4, (i4 & 2048) != 0 ? 0.0f : f5, (i4 & 4096) != 0 ? 1.0f : f6, (i4 & 8192) != 0 ? 0.0f : f7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private p3i(String str, List<? extends qjc> list, int i, he1 he1Var, float f, he1 he1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.f69598b = str;
        this.f69599c = list;
        this.f69600d = i;
        this.f69601e = he1Var;
        this.f69602f = f;
        this.f69603m = he1Var2;
        this.f69590C = f2;
        this.f69591F = f3;
        this.f69592H = i2;
        this.f69593L = i3;
        this.f69594M = f4;
        this.f69595N = f5;
        this.f69596Q = f6;
        this.f69597X = f7;
    }
}
