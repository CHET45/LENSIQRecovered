package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.p002ui.graphics.layer.InterfaceC0742a;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.bn2;
import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@c5e(23)
@dwf({"SMAP\nGraphicsLayerV23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,418:1\n1#2:419\n47#3,3:420\n50#3,2:449\n329#4,26:423\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n*L\n315#1:420,3\n315#1:449,2\n316#1:423,26\n*E\n"})
public final class z97 implements InterfaceC0742a {

    /* JADX INFO: renamed from: H */
    public static boolean f104465H;

    /* JADX INFO: renamed from: A */
    public boolean f104467A;

    /* JADX INFO: renamed from: B */
    public boolean f104468B;

    /* JADX INFO: renamed from: C */
    public boolean f104469C;

    /* JADX INFO: renamed from: D */
    @gib
    public ozd f104470D;

    /* JADX INFO: renamed from: E */
    public boolean f104471E;

    /* JADX INFO: renamed from: F */
    public final long f104472F;

    /* JADX INFO: renamed from: b */
    public final long f104473b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final pr1 f104474c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final nr1 f104475d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final RenderNode f104476e;

    /* JADX INFO: renamed from: f */
    public long f104477f;

    /* JADX INFO: renamed from: g */
    @gib
    public Paint f104478g;

    /* JADX INFO: renamed from: h */
    @gib
    public Matrix f104479h;

    /* JADX INFO: renamed from: i */
    public boolean f104480i;

    /* JADX INFO: renamed from: j */
    public int f104481j;

    /* JADX INFO: renamed from: k */
    public int f104482k;

    /* JADX INFO: renamed from: l */
    @gib
    public b92 f104483l;

    /* JADX INFO: renamed from: m */
    public float f104484m;

    /* JADX INFO: renamed from: n */
    public boolean f104485n;

    /* JADX INFO: renamed from: o */
    public long f104486o;

    /* JADX INFO: renamed from: p */
    public float f104487p;

    /* JADX INFO: renamed from: q */
    public float f104488q;

    /* JADX INFO: renamed from: r */
    public float f104489r;

    /* JADX INFO: renamed from: s */
    public float f104490s;

    /* JADX INFO: renamed from: t */
    public float f104491t;

    /* JADX INFO: renamed from: u */
    public long f104492u;

    /* JADX INFO: renamed from: v */
    public long f104493v;

    /* JADX INFO: renamed from: w */
    public float f104494w;

    /* JADX INFO: renamed from: x */
    public float f104495x;

    /* JADX INFO: renamed from: y */
    public float f104496y;

    /* JADX INFO: renamed from: z */
    public float f104497z;

    /* JADX INFO: renamed from: G */
    @yfb
    public static final C16041a f104464G = new C16041a(null);

    /* JADX INFO: renamed from: I */
    @yfb
    public static final AtomicBoolean f104466I = new AtomicBoolean(true);

    /* JADX INFO: renamed from: z97$a */
    public static final class C16041a {
        public /* synthetic */ C16041a(jt3 jt3Var) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_graphics_release() {
            return z97.f104465H;
        }

        public final void setTestFailCreateRenderNode$ui_graphics_release(boolean z) {
            z97.f104465H = z;
        }

        private C16041a() {
        }
    }

    public z97(@yfb View view, long j, @yfb pr1 pr1Var, @yfb nr1 nr1Var) {
        this.f104473b = j;
        this.f104474c = pr1Var;
        this.f104475d = nr1Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.f104476e = renderNodeCreate;
        this.f104477f = r78.f77324b.m32092getZeroYbymL2g();
        if (f104466I.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            verifyShadowColorProperties(renderNodeCreate);
            discardDisplayListInternal$ui_graphics_release();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f104465H) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        bn2.C1953a c1953a = bn2.f14169b;
        m33501applyCompositingStrategyWpw9cng(c1953a.m28016getAutoke2Ky5w());
        this.f104481j = c1953a.m28016getAutoke2Ky5w();
        this.f104482k = q51.f73234b.m31928getSrcOver0nO6VwU();
        this.f104484m = 1.0f;
        this.f104486o = izb.f49009b.m30444getUnspecifiedF1C5BW0();
        this.f104487p = 1.0f;
        this.f104488q = 1.0f;
        w82.C14471a c14471a = w82.f93556b;
        this.f104492u = c14471a.m32977getBlack0d7_KjU();
        this.f104493v = c14471a.m32977getBlack0d7_KjU();
        this.f104497z = 8.0f;
        this.f104471E = true;
    }

    private final void applyClip() {
        boolean z = false;
        boolean z2 = getClip() && !this.f104480i;
        if (getClip() && this.f104480i) {
            z = true;
        }
        if (z2 != this.f104468B) {
            this.f104468B = z2;
            this.f104476e.setClipToBounds(z2);
        }
        if (z != this.f104469C) {
            this.f104469C = z;
            this.f104476e.setClipToOutline(z);
        }
    }

    /* JADX INFO: renamed from: applyCompositingStrategy-Wpw9cng, reason: not valid java name */
    private final void m33501applyCompositingStrategyWpw9cng(int i) {
        RenderNode renderNode = this.f104476e;
        bn2.C1953a c1953a = bn2.f14169b;
        if (bn2.m28012equalsimpl0(i, c1953a.m28018getOffscreenke2Ky5w())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f104478g);
            renderNode.setHasOverlappingRendering(true);
        } else if (bn2.m28012equalsimpl0(i, c1953a.m28017getModulateAlphake2Ky5w())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f104478g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f104478g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.f104478g;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f104478g = paint2;
        return paint2;
    }

    private final boolean requiresCompositingLayer() {
        return (!bn2.m28012equalsimpl0(mo27669getCompositingStrategyke2Ky5w(), bn2.f14169b.m28018getOffscreenke2Ky5w()) && q51.m31897equalsimpl0(mo27668getBlendMode0nO6VwU(), q51.f73234b.m31928getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m33501applyCompositingStrategyWpw9cng(bn2.f14169b.m28018getOffscreenke2Ky5w());
        } else {
            m33501applyCompositingStrategyWpw9cng(mo27669getCompositingStrategyke2Ky5w());
        }
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            j1e j1eVar = j1e.f49359a;
            j1eVar.setAmbientShadowColor(renderNode, j1eVar.getAmbientShadowColor(renderNode));
            j1eVar.setSpotShadowColor(renderNode, j1eVar.getSpotShadowColor(renderNode));
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @yfb
    public Matrix calculateMatrix() {
        Matrix matrix = this.f104479h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f104479h = matrix;
        }
        this.f104476e.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void discardDisplayList() {
        discardDisplayListInternal$ui_graphics_release();
    }

    public final void discardDisplayListInternal$ui_graphics_release() {
        h1e.f42013a.discardDisplayList(this.f104476e);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void draw(@yfb vq1 vq1Var) {
        DisplayListCanvas nativeCanvas = C5437eq.getNativeCanvas(vq1Var);
        md8.checkNotNull(nativeCanvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        nativeCanvas.drawRenderNode(this.f104476e);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getAlpha() {
        return this.f104484m;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo27667getAmbientShadowColor0d7_KjU() {
        return this.f104492u;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo27668getBlendMode0nO6VwU() {
        return this.f104482k;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getCameraDistance() {
        return this.f104497z;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public boolean getClip() {
        return this.f104467A;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @gib
    public b92 getColorFilter() {
        return this.f104483l;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo27669getCompositingStrategyke2Ky5w() {
        return this.f104481j;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public boolean getHasDisplayList() {
        return this.f104476e.isValid();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public long getLayerId() {
        return this.f104472F;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public long getOwnerId() {
        return this.f104473b;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    public long mo27670getPivotOffsetF1C5BW0() {
        return this.f104486o;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @gib
    public ozd getRenderEffect() {
        return this.f104470D;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationX() {
        return this.f104494w;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationY() {
        return this.f104495x;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationZ() {
        return this.f104496y;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getScaleX() {
        return this.f104487p;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getScaleY() {
        return this.f104488q;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getShadowElevation() {
        return this.f104491t;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public long mo27671getSpotShadowColor0d7_KjU() {
        return this.f104493v;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getTranslationX() {
        return this.f104489r;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getTranslationY() {
        return this.f104490s;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public boolean isInvalidated() {
        return this.f104471E;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void record(@yfb c64 c64Var, @yfb ov8 ov8Var, @yfb u97 u97Var, @yfb qy6<? super ip4, bth> qy6Var) {
        Canvas canvasStart = this.f104476e.start(r78.m32087getWidthimpl(this.f104477f), r78.m32086getHeightimpl(this.f104477f));
        try {
            pr1 pr1Var = this.f104474c;
            Canvas internalCanvas = pr1Var.getAndroidCanvas().getInternalCanvas();
            pr1Var.getAndroidCanvas().setInternalCanvas(canvasStart);
            C4905dq androidCanvas = pr1Var.getAndroidCanvas();
            nr1 nr1Var = this.f104475d;
            long jM32288toSizeozmzZPI = s78.m32288toSizeozmzZPI(this.f104477f);
            c64 density = nr1Var.getDrawContext().getDensity();
            ov8 layoutDirection = nr1Var.getDrawContext().getLayoutDirection();
            vq1 canvas = nr1Var.getDrawContext().getCanvas();
            long jMo28019getSizeNHjbRc = nr1Var.getDrawContext().mo28019getSizeNHjbRc();
            u97 graphicsLayer = nr1Var.getDrawContext().getGraphicsLayer();
            bp4 drawContext = nr1Var.getDrawContext();
            drawContext.setDensity(c64Var);
            drawContext.setLayoutDirection(ov8Var);
            drawContext.setCanvas(androidCanvas);
            drawContext.mo28020setSizeuvyYCjk(jM32288toSizeozmzZPI);
            drawContext.setGraphicsLayer(u97Var);
            androidCanvas.save();
            try {
                qy6Var.invoke(nr1Var);
                androidCanvas.restore();
                bp4 drawContext2 = nr1Var.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection);
                drawContext2.setCanvas(canvas);
                drawContext2.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                pr1Var.getAndroidCanvas().setInternalCanvas(internalCanvas);
                this.f104476e.end(canvasStart);
                setInvalidated(false);
            } catch (Throwable th) {
                androidCanvas.restore();
                bp4 drawContext3 = nr1Var.getDrawContext();
                drawContext3.setDensity(density);
                drawContext3.setLayoutDirection(layoutDirection);
                drawContext3.setCanvas(canvas);
                drawContext3.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                drawContext3.setGraphicsLayer(graphicsLayer);
                throw th;
            }
        } catch (Throwable th2) {
            this.f104476e.end(canvasStart);
            throw th2;
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setAlpha(float f) {
        this.f104484m = f;
        this.f104476e.setAlpha(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public void mo27672setAmbientShadowColor8_81llA(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f104492u = j;
            j1e.f49359a.setAmbientShadowColor(this.f104476e, j92.m30490toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo27673setBlendModes9anfk8(int i) {
        if (q51.m31897equalsimpl0(this.f104482k, i)) {
            return;
        }
        this.f104482k = i;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(C1995bq.m28033toPorterDuffModes9anfk8(i)));
        updateLayerProperties();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setCameraDistance(float f) {
        this.f104497z = f;
        this.f104476e.setCameraDistance(-f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setClip(boolean z) {
        this.f104467A = z;
        applyClip();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setColorFilter(@gib b92 b92Var) {
        this.f104483l = b92Var;
        if (b92Var == null) {
            updateLayerProperties();
            return;
        }
        m33501applyCompositingStrategyWpw9cng(bn2.f14169b.m28018getOffscreenke2Ky5w());
        RenderNode renderNode = this.f104476e;
        Paint paintObtainLayerPaint = obtainLayerPaint();
        paintObtainLayerPaint.setColorFilter(C8936lq.asAndroidColorFilter(b92Var));
        renderNode.setLayerPaint(paintObtainLayerPaint);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    public void mo27674setCompositingStrategyWpw9cng(int i) {
        this.f104481j = i;
        updateLayerProperties();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setInvalidated(boolean z) {
        this.f104471E = z;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setOutline(@gib Outline outline) {
        this.f104476e.setOutline(outline);
        this.f104480i = outline != null;
        applyClip();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public void mo27675setPivotOffsetk4lQ0M(long j) {
        this.f104486o = j;
        if (mzb.m31102isUnspecifiedk4lQ0M(j)) {
            this.f104485n = true;
            this.f104476e.setPivotX(r78.m32087getWidthimpl(this.f104477f) / 2.0f);
            this.f104476e.setPivotY(r78.m32086getHeightimpl(this.f104477f) / 2.0f);
        } else {
            this.f104485n = false;
            this.f104476e.setPivotX(izb.m30429getXimpl(j));
            this.f104476e.setPivotY(izb.m30430getYimpl(j));
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo27676setPositionH0pRuoY(int i, int i2, long j) {
        this.f104476e.setLeftTopRightBottom(i, i2, r78.m32087getWidthimpl(j) + i, r78.m32086getHeightimpl(j) + i2);
        if (r78.m32085equalsimpl0(this.f104477f, j)) {
            return;
        }
        if (this.f104485n) {
            this.f104476e.setPivotX(r78.m32087getWidthimpl(j) / 2.0f);
            this.f104476e.setPivotY(r78.m32086getHeightimpl(j) / 2.0f);
        }
        this.f104477f = j;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRenderEffect(@gib ozd ozdVar) {
        this.f104470D = ozdVar;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationX(float f) {
        this.f104494w = f;
        this.f104476e.setRotationX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationY(float f) {
        this.f104495x = f;
        this.f104476e.setRotationY(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationZ(float f) {
        this.f104496y = f;
        this.f104476e.setRotation(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setScaleX(float f) {
        this.f104487p = f;
        this.f104476e.setScaleX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setScaleY(float f) {
        this.f104488q = f;
        this.f104476e.setScaleY(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setShadowElevation(float f) {
        this.f104491t = f;
        this.f104476e.setElevation(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo27677setSpotShadowColor8_81llA(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f104493v = j;
            j1e.f49359a.setSpotShadowColor(this.f104476e, j92.m30490toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setTranslationX(float f) {
        this.f104489r = f;
        this.f104476e.setTranslationX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setTranslationY(float f) {
        this.f104490s = f;
        this.f104476e.setTranslationY(f);
    }

    public /* synthetic */ z97(View view, long j, pr1 pr1Var, nr1 nr1Var, int i, jt3 jt3Var) {
        this(view, j, (i & 4) != 0 ? new pr1() : pr1Var, (i & 8) != 0 ? new nr1() : nr1Var);
    }
}
