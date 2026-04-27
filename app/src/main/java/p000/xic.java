package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
@e0g(parameters = 0)
public final class xic extends u1i {

    /* JADX INFO: renamed from: x */
    public static final int f98089x = 8;

    /* JADX INFO: renamed from: c */
    @yfb
    public String f98090c;

    /* JADX INFO: renamed from: d */
    @gib
    public he1 f98091d;

    /* JADX INFO: renamed from: e */
    public float f98092e;

    /* JADX INFO: renamed from: f */
    @yfb
    public List<? extends qjc> f98093f;

    /* JADX INFO: renamed from: g */
    public int f98094g;

    /* JADX INFO: renamed from: h */
    public float f98095h;

    /* JADX INFO: renamed from: i */
    public float f98096i;

    /* JADX INFO: renamed from: j */
    @gib
    public he1 f98097j;

    /* JADX INFO: renamed from: k */
    public int f98098k;

    /* JADX INFO: renamed from: l */
    public int f98099l;

    /* JADX INFO: renamed from: m */
    public float f98100m;

    /* JADX INFO: renamed from: n */
    public float f98101n;

    /* JADX INFO: renamed from: o */
    public float f98102o;

    /* JADX INFO: renamed from: p */
    public float f98103p;

    /* JADX INFO: renamed from: q */
    public boolean f98104q;

    /* JADX INFO: renamed from: r */
    public boolean f98105r;

    /* JADX INFO: renamed from: s */
    public boolean f98106s;

    /* JADX INFO: renamed from: t */
    @gib
    public eag f98107t;

    /* JADX INFO: renamed from: u */
    @yfb
    public final vic f98108u;

    /* JADX INFO: renamed from: v */
    @yfb
    public vic f98109v;

    /* JADX INFO: renamed from: w */
    @yfb
    public final fx8 f98110w;

    /* JADX INFO: renamed from: xic$a */
    public static final class C15142a extends tt8 implements ny6<ojc> {

        /* JADX INFO: renamed from: a */
        public static final C15142a f98111a = new C15142a();

        public C15142a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final ojc invoke() {
            return C8083ju.PathMeasure();
        }
    }

    public xic() {
        super(null);
        this.f98090c = "";
        this.f98092e = 1.0f;
        this.f98093f = l3i.getEmptyPath();
        this.f98094g = l3i.getDefaultFillType();
        this.f98095h = 1.0f;
        this.f98098k = l3i.getDefaultStrokeLineCap();
        this.f98099l = l3i.getDefaultStrokeLineJoin();
        this.f98100m = 4.0f;
        this.f98102o = 1.0f;
        this.f98104q = true;
        this.f98105r = true;
        vic vicVarPath = C8522ku.Path();
        this.f98108u = vicVarPath;
        this.f98109v = vicVarPath;
        this.f98110w = hz8.lazy(g39.f38327c, (ny6) C15142a.f98111a);
    }

    private final ojc getPathMeasure() {
        return (ojc) this.f98110w.getValue();
    }

    private final void updatePath() {
        yjc.toPath(this.f98093f, this.f98108u);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        if (this.f98101n == 0.0f && this.f98102o == 1.0f) {
            this.f98109v = this.f98108u;
            return;
        }
        if (md8.areEqual(this.f98109v, this.f98108u)) {
            this.f98109v = C8522ku.Path();
        } else {
            int iMo28698getFillTypeRgk1Os = this.f98109v.mo28698getFillTypeRgk1Os();
            this.f98109v.rewind();
            this.f98109v.mo28700setFillTypeoQ8Xj4U(iMo28698getFillTypeRgk1Os);
        }
        getPathMeasure().setPath(this.f98108u, false);
        float length = getPathMeasure().getLength();
        float f = this.f98101n;
        float f2 = this.f98103p;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.f98102o + f2) % 1.0f) * length;
        if (f3 <= f4) {
            getPathMeasure().getSegment(f3, f4, this.f98109v, true);
        } else {
            getPathMeasure().getSegment(f3, length, this.f98109v, true);
            getPathMeasure().getSegment(0.0f, f4, this.f98109v, true);
        }
    }

    @Override // p000.u1i
    public void draw(@yfb ip4 ip4Var) {
        if (this.f98104q) {
            updatePath();
        } else if (this.f98106s) {
            updateRenderPath();
        }
        this.f98104q = false;
        this.f98106s = false;
        he1 he1Var = this.f98091d;
        if (he1Var != null) {
            ip4.m30243drawPathGBMwjPU$default(ip4Var, this.f98109v, he1Var, this.f98092e, null, null, 0, 56, null);
        }
        he1 he1Var2 = this.f98097j;
        if (he1Var2 != null) {
            eag eagVar = this.f98107t;
            if (this.f98105r || eagVar == null) {
                eagVar = new eag(this.f98096i, this.f98100m, this.f98098k, this.f98099l, null, 16, null);
                this.f98107t = eagVar;
                this.f98105r = false;
            }
            ip4.m30243drawPathGBMwjPU$default(ip4Var, this.f98109v, he1Var2, this.f98095h, eagVar, null, 0, 48, null);
        }
    }

    @gib
    public final he1 getFill() {
        return this.f98091d;
    }

    public final float getFillAlpha() {
        return this.f98092e;
    }

    @yfb
    public final String getName() {
        return this.f98090c;
    }

    @yfb
    public final List<qjc> getPathData() {
        return this.f98093f;
    }

    /* JADX INFO: renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m33227getPathFillTypeRgk1Os() {
        return this.f98094g;
    }

    @gib
    public final he1 getStroke() {
        return this.f98097j;
    }

    public final float getStrokeAlpha() {
        return this.f98095h;
    }

    /* JADX INFO: renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m33228getStrokeLineCapKaPHkGw() {
        return this.f98098k;
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m33229getStrokeLineJoinLxFBmk8() {
        return this.f98099l;
    }

    public final float getStrokeLineMiter() {
        return this.f98100m;
    }

    public final float getStrokeLineWidth() {
        return this.f98096i;
    }

    public final float getTrimPathEnd() {
        return this.f98102o;
    }

    public final float getTrimPathOffset() {
        return this.f98103p;
    }

    public final float getTrimPathStart() {
        return this.f98101n;
    }

    public final void setFill(@gib he1 he1Var) {
        this.f98091d = he1Var;
        invalidate();
    }

    public final void setFillAlpha(float f) {
        this.f98092e = f;
        invalidate();
    }

    public final void setName(@yfb String str) {
        this.f98090c = str;
        invalidate();
    }

    public final void setPathData(@yfb List<? extends qjc> list) {
        this.f98093f = list;
        this.f98104q = true;
        invalidate();
    }

    /* JADX INFO: renamed from: setPathFillType-oQ8Xj4U, reason: not valid java name */
    public final void m33230setPathFillTypeoQ8Xj4U(int i) {
        this.f98094g = i;
        this.f98109v.mo28700setFillTypeoQ8Xj4U(i);
        invalidate();
    }

    public final void setStroke(@gib he1 he1Var) {
        this.f98097j = he1Var;
        invalidate();
    }

    public final void setStrokeAlpha(float f) {
        this.f98095h = f;
        invalidate();
    }

    /* JADX INFO: renamed from: setStrokeLineCap-BeK7IIE, reason: not valid java name */
    public final void m33231setStrokeLineCapBeK7IIE(int i) {
        this.f98098k = i;
        this.f98105r = true;
        invalidate();
    }

    /* JADX INFO: renamed from: setStrokeLineJoin-Ww9F2mQ, reason: not valid java name */
    public final void m33232setStrokeLineJoinWw9F2mQ(int i) {
        this.f98099l = i;
        this.f98105r = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f) {
        this.f98100m = f;
        this.f98105r = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f) {
        this.f98096i = f;
        this.f98105r = true;
        invalidate();
    }

    public final void setTrimPathEnd(float f) {
        this.f98102o = f;
        this.f98106s = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f) {
        this.f98103p = f;
        this.f98106s = true;
        invalidate();
    }

    public final void setTrimPathStart(float f) {
        this.f98101n = f;
        this.f98106s = true;
        invalidate();
    }

    @yfb
    public String toString() {
        return this.f98108u.toString();
    }
}
