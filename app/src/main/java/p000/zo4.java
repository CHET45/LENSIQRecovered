package p000;

import p000.nr1;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,113:1\n546#2,17:114\n42#3,7:131\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n82#1:114,17\n98#1:131,7\n*E\n"})
@e0g(parameters = 0)
public final class zo4 {

    /* JADX INFO: renamed from: h */
    public static final int f105577h = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public rs7 f105578a;

    /* JADX INFO: renamed from: b */
    @gib
    public vq1 f105579b;

    /* JADX INFO: renamed from: c */
    @gib
    public c64 f105580c;

    /* JADX INFO: renamed from: d */
    @yfb
    public ov8 f105581d = ov8.Ltr;

    /* JADX INFO: renamed from: e */
    public long f105582e = r78.f77324b.m32092getZeroYbymL2g();

    /* JADX INFO: renamed from: f */
    public int f105583f = ss7.f82741b.m32327getArgb8888_sVssgQ();

    /* JADX INFO: renamed from: g */
    @yfb
    public final nr1 f105584g = new nr1();

    private final void clear(ip4 ip4Var) {
        ip4.m30248drawRectnJ9OG0$default(ip4Var, w82.f93556b.m32977getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, q51.f73234b.m31901getClear0nO6VwU(), 62, null);
    }

    public static /* synthetic */ void drawInto$default(zo4 zo4Var, ip4 ip4Var, float f, b92 b92Var, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            b92Var = null;
        }
        zo4Var.drawInto(ip4Var, f, b92Var);
    }

    @yjd
    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    /* JADX INFO: renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m33510drawCachedImageFqjB98A(int i, long j, @yfb c64 c64Var, @yfb ov8 ov8Var, @yfb qy6<? super ip4, bth> qy6Var) {
        this.f105580c = c64Var;
        this.f105581d = ov8Var;
        rs7 rs7VarM32437ImageBitmapx__hDU$default = this.f105578a;
        vq1 vq1VarCanvas = this.f105579b;
        if (rs7VarM32437ImageBitmapx__hDU$default == null || vq1VarCanvas == null || r78.m32087getWidthimpl(j) > rs7VarM32437ImageBitmapx__hDU$default.getWidth() || r78.m32086getHeightimpl(j) > rs7VarM32437ImageBitmapx__hDU$default.getHeight() || !ss7.m32322equalsimpl0(this.f105583f, i)) {
            rs7VarM32437ImageBitmapx__hDU$default = ts7.m32437ImageBitmapx__hDU$default(r78.m32087getWidthimpl(j), r78.m32086getHeightimpl(j), i, false, null, 24, null);
            vq1VarCanvas = rr1.Canvas(rs7VarM32437ImageBitmapx__hDU$default);
            this.f105578a = rs7VarM32437ImageBitmapx__hDU$default;
            this.f105579b = vq1VarCanvas;
            this.f105583f = i;
        }
        this.f105582e = j;
        nr1 nr1Var = this.f105584g;
        long jM32288toSizeozmzZPI = s78.m32288toSizeozmzZPI(j);
        nr1.C10018a drawParams = nr1Var.getDrawParams();
        c64 c64VarComponent1 = drawParams.component1();
        ov8 ov8VarComponent2 = drawParams.component2();
        vq1 vq1VarComponent3 = drawParams.component3();
        long jM31196component4NHjbRc = drawParams.m31196component4NHjbRc();
        nr1.C10018a drawParams2 = nr1Var.getDrawParams();
        drawParams2.setDensity(c64Var);
        drawParams2.setLayoutDirection(ov8Var);
        drawParams2.setCanvas(vq1VarCanvas);
        drawParams2.m31199setSizeuvyYCjk(jM32288toSizeozmzZPI);
        vq1VarCanvas.save();
        clear(nr1Var);
        qy6Var.invoke(nr1Var);
        vq1VarCanvas.restore();
        nr1.C10018a drawParams3 = nr1Var.getDrawParams();
        drawParams3.setDensity(c64VarComponent1);
        drawParams3.setLayoutDirection(ov8VarComponent2);
        drawParams3.setCanvas(vq1VarComponent3);
        drawParams3.m31199setSizeuvyYCjk(jM31196component4NHjbRc);
        rs7VarM32437ImageBitmapx__hDU$default.prepareToDraw();
    }

    public final void drawInto(@yfb ip4 ip4Var, float f, @gib b92 b92Var) {
        rs7 rs7Var = this.f105578a;
        if (!(rs7Var != null)) {
            g28.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        ip4.m30237drawImageAZ2fEMs$default(ip4Var, rs7Var, 0L, this.f105582e, 0L, 0L, f, null, b92Var, 0, 0, 858, null);
    }

    @gib
    public final rs7 getMCachedImage() {
        return this.f105578a;
    }

    public final void setMCachedImage(@gib rs7 rs7Var) {
        this.f105578a = rs7Var;
    }
}
