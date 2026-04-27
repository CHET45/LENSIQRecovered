package p000;

import java.util.List;
import p000.q51;

/* JADX INFO: loaded from: classes.dex */
public final class l3i {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f56112a = "";

    /* JADX INFO: renamed from: b */
    public static final float f56113b = 0.0f;

    /* JADX INFO: renamed from: c */
    public static final float f56114c = 0.0f;

    /* JADX INFO: renamed from: d */
    public static final float f56115d = 0.0f;

    /* JADX INFO: renamed from: e */
    public static final float f56116e = 1.0f;

    /* JADX INFO: renamed from: f */
    public static final float f56117f = 1.0f;

    /* JADX INFO: renamed from: g */
    public static final float f56118g = 0.0f;

    /* JADX INFO: renamed from: h */
    public static final float f56119h = 0.0f;

    /* JADX INFO: renamed from: j */
    @yfb
    public static final String f56121j = "";

    /* JADX INFO: renamed from: k */
    public static final float f56122k = 0.0f;

    /* JADX INFO: renamed from: l */
    public static final float f56123l = 4.0f;

    /* JADX INFO: renamed from: m */
    public static final float f56124m = 0.0f;

    /* JADX INFO: renamed from: n */
    public static final float f56125n = 1.0f;

    /* JADX INFO: renamed from: o */
    public static final float f56126o = 0.0f;

    /* JADX INFO: renamed from: i */
    @yfb
    public static final List<qjc> f56120i = l82.emptyList();

    /* JADX INFO: renamed from: p */
    public static final int f56127p = fag.f35949b.m28904getButtKaPHkGw();

    /* JADX INFO: renamed from: q */
    public static final int f56128q = hag.f43019b.m29985getMiterLxFBmk8();

    /* JADX INFO: renamed from: r */
    public static final int f56129r = q51.f73234b.m31926getSrcIn0nO6VwU();

    /* JADX INFO: renamed from: s */
    public static final long f56130s = w82.f93556b.m32986getTransparent0d7_KjU();

    /* JADX INFO: renamed from: t */
    public static final int f56131t = bjc.f13877b.m28005getNonZeroRgk1Os();

    @yfb
    public static final List<qjc> PathData(@yfb qy6<? super wic, bth> qy6Var) {
        wic wicVar = new wic();
        qy6Var.invoke(wicVar);
        return wicVar.getNodes();
    }

    @yfb
    public static final List<qjc> addPathNodes(@gib String str) {
        return str == null ? f56120i : new xjc().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return f56131t;
    }

    public static final int getDefaultStrokeLineCap() {
        return f56127p;
    }

    public static final int getDefaultStrokeLineJoin() {
        return f56128q;
    }

    public static final int getDefaultTintBlendMode() {
        return f56129r;
    }

    public static final long getDefaultTintColor() {
        return f56130s;
    }

    @yfb
    public static final List<qjc> getEmptyPath() {
        return f56120i;
    }

    /* JADX INFO: renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m30809rgbEqualOWjLjI(long j, long j2) {
        return w82.m32957getRedimpl(j) == w82.m32957getRedimpl(j2) && w82.m32956getGreenimpl(j) == w82.m32956getGreenimpl(j2) && w82.m32954getBlueimpl(j) == w82.m32954getBlueimpl(j2);
    }

    public static final boolean tintableWithAlphaMask(@gib b92 b92Var) {
        if (b92Var instanceof r51) {
            r51 r51Var = (r51) b92Var;
            int iM32077getBlendMode0nO6VwU = r51Var.m32077getBlendMode0nO6VwU();
            q51.C11309a c11309a = q51.f73234b;
            if (q51.m31897equalsimpl0(iM32077getBlendMode0nO6VwU, c11309a.m31926getSrcIn0nO6VwU()) || q51.m31897equalsimpl0(r51Var.m32077getBlendMode0nO6VwU(), c11309a.m31928getSrcOver0nO6VwU())) {
                return true;
            }
        } else if (b92Var == null) {
            return true;
        }
        return false;
    }
}
