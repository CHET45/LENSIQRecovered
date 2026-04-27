package p000;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.p002ui.graphics.layer.InterfaceC0742a;
import androidx.compose.p002ui.graphics.layer.ViewLayer;
import androidx.compose.p002ui.graphics.layer.view.DrawChildContainer;
import p000.bn2;
import p000.nr1;
import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,562:1\n1#2:563\n47#3,3:564\n50#3,2:584\n47#3,5:586\n546#4,17:567\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n*L\n425#1:564,3\n425#1:584,2\n437#1:586,5\n426#1:567,17\n*E\n"})
public final class za7 implements InterfaceC0742a {

    /* JADX INFO: renamed from: K */
    @yfb
    public static final C16056b f104579K = new C16056b(null);

    /* JADX INFO: renamed from: L */
    public static final boolean f104580L = !pgg.f70716a.isLockHardwareCanvasAvailable();

    /* JADX INFO: renamed from: M */
    @yfb
    public static final Canvas f104581M = new C16055a();

    /* JADX INFO: renamed from: A */
    public float f104582A;

    /* JADX INFO: renamed from: B */
    public float f104583B;

    /* JADX INFO: renamed from: C */
    public float f104584C;

    /* JADX INFO: renamed from: D */
    public float f104585D;

    /* JADX INFO: renamed from: E */
    public long f104586E;

    /* JADX INFO: renamed from: F */
    public long f104587F;

    /* JADX INFO: renamed from: G */
    public float f104588G;

    /* JADX INFO: renamed from: H */
    public float f104589H;

    /* JADX INFO: renamed from: I */
    public float f104590I;

    /* JADX INFO: renamed from: J */
    @gib
    public ozd f104591J;

    /* JADX INFO: renamed from: b */
    @yfb
    public final DrawChildContainer f104592b;

    /* JADX INFO: renamed from: c */
    public final long f104593c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final pr1 f104594d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ViewLayer f104595e;

    /* JADX INFO: renamed from: f */
    public final Resources f104596f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final Rect f104597g;

    /* JADX INFO: renamed from: h */
    @gib
    public Paint f104598h;

    /* JADX INFO: renamed from: i */
    @gib
    public final Picture f104599i;

    /* JADX INFO: renamed from: j */
    @gib
    public final nr1 f104600j;

    /* JADX INFO: renamed from: k */
    @gib
    public final pr1 f104601k;

    /* JADX INFO: renamed from: l */
    public int f104602l;

    /* JADX INFO: renamed from: m */
    public int f104603m;

    /* JADX INFO: renamed from: n */
    public long f104604n;

    /* JADX INFO: renamed from: o */
    public boolean f104605o;

    /* JADX INFO: renamed from: p */
    public boolean f104606p;

    /* JADX INFO: renamed from: q */
    public boolean f104607q;

    /* JADX INFO: renamed from: r */
    public boolean f104608r;

    /* JADX INFO: renamed from: s */
    public final long f104609s;

    /* JADX INFO: renamed from: t */
    public int f104610t;

    /* JADX INFO: renamed from: u */
    @gib
    public b92 f104611u;

    /* JADX INFO: renamed from: v */
    public int f104612v;

    /* JADX INFO: renamed from: w */
    public float f104613w;

    /* JADX INFO: renamed from: x */
    public boolean f104614x;

    /* JADX INFO: renamed from: y */
    public long f104615y;

    /* JADX INFO: renamed from: z */
    public float f104616z;

    /* JADX INFO: renamed from: za7$a */
    public static final class C16055a extends Canvas {
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    /* JADX INFO: renamed from: za7$b */
    public static final class C16056b {
        public /* synthetic */ C16056b(jt3 jt3Var) {
            this();
        }

        public final boolean getMayRenderInSoftware() {
            return za7.f104580L;
        }

        @yfb
        public final Canvas getPlaceholderCanvas() {
            return za7.f104581M;
        }

        private C16056b() {
        }
    }

    public za7(@yfb DrawChildContainer drawChildContainer, long j, @yfb pr1 pr1Var, @yfb nr1 nr1Var) {
        this.f104592b = drawChildContainer;
        this.f104593c = j;
        this.f104594d = pr1Var;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, pr1Var, nr1Var);
        this.f104595e = viewLayer;
        this.f104596f = drawChildContainer.getResources();
        this.f104597g = new Rect();
        boolean z = f104580L;
        this.f104599i = z ? new Picture() : null;
        this.f104600j = z ? new nr1() : null;
        this.f104601k = z ? new pr1() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.f104604n = r78.f77324b.m32092getZeroYbymL2g();
        this.f104606p = true;
        this.f104609s = View.generateViewId();
        this.f104610t = q51.f73234b.m31928getSrcOver0nO6VwU();
        this.f104612v = bn2.f14169b.m28016getAutoke2Ky5w();
        this.f104613w = 1.0f;
        this.f104615y = izb.f49009b.m30445getZeroF1C5BW0();
        this.f104616z = 1.0f;
        this.f104582A = 1.0f;
        w82.C14471a c14471a = w82.f93556b;
        this.f104586E = c14471a.m32977getBlack0d7_KjU();
        this.f104587F = c14471a.m32977getBlack0d7_KjU();
    }

    /* JADX INFO: renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m33504applyCompositingLayerWpw9cng(int i) {
        ViewLayer viewLayer = this.f104595e;
        bn2.C1953a c1953a = bn2.f14169b;
        boolean z = true;
        if (bn2.m28012equalsimpl0(i, c1953a.m28018getOffscreenke2Ky5w())) {
            this.f104595e.setLayerType(2, this.f104598h);
        } else if (bn2.m28012equalsimpl0(i, c1953a.m28017getModulateAlphake2Ky5w())) {
            this.f104595e.setLayerType(0, this.f104598h);
            z = false;
        } else {
            this.f104595e.setLayerType(0, this.f104598h);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.f104598h;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f104598h = paint2;
        return paint2;
    }

    private final void recordDrawingOperations() {
        try {
            pr1 pr1Var = this.f104594d;
            Canvas canvas = f104581M;
            Canvas internalCanvas = pr1Var.getAndroidCanvas().getInternalCanvas();
            pr1Var.getAndroidCanvas().setInternalCanvas(canvas);
            C4905dq androidCanvas = pr1Var.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.f104592b;
            ViewLayer viewLayer = this.f104595e;
            drawChildContainer.drawChild$ui_graphics_release(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            pr1Var.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    private final boolean requiresCompositingLayer() {
        return bn2.m28012equalsimpl0(mo27669getCompositingStrategyke2Ky5w(), bn2.f14169b.m28018getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (q51.m31897equalsimpl0(mo27668getBlendMode0nO6VwU(), q51.f73234b.m31928getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateClipBounds() {
        Rect rect;
        if (this.f104605o) {
            ViewLayer viewLayer = this.f104595e;
            if (!getClip() || this.f104607q) {
                rect = null;
            } else {
                rect = this.f104597g;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f104595e.getWidth();
                rect.bottom = this.f104595e.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m33504applyCompositingLayerWpw9cng(bn2.f14169b.m28018getOffscreenke2Ky5w());
        } else {
            m33504applyCompositingLayerWpw9cng(mo27669getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @yfb
    public Matrix calculateMatrix() {
        return this.f104595e.getMatrix();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void discardDisplayList() {
        this.f104592b.removeViewInLayout(this.f104595e);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void draw(@yfb vq1 vq1Var) {
        updateClipBounds();
        Canvas nativeCanvas = C5437eq.getNativeCanvas(vq1Var);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.f104592b;
            ViewLayer viewLayer = this.f104595e;
            drawChildContainer.drawChild$ui_graphics_release(vq1Var, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.f104599i;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getAlpha() {
        return this.f104613w;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo27667getAmbientShadowColor0d7_KjU() {
        return this.f104586E;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo27668getBlendMode0nO6VwU() {
        return this.f104610t;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getCameraDistance() {
        return this.f104595e.getCameraDistance() / this.f104596f.getDisplayMetrics().densityDpi;
    }

    @yfb
    public final pr1 getCanvasHolder() {
        return this.f104594d;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public boolean getClip() {
        return this.f104608r || this.f104595e.getClipToOutline();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @gib
    public b92 getColorFilter() {
        return this.f104611u;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo27669getCompositingStrategyke2Ky5w() {
        return this.f104612v;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public long getLayerId() {
        return this.f104609s;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public long getOwnerId() {
        return this.f104593c;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    public long mo27670getPivotOffsetF1C5BW0() {
        return this.f104615y;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @gib
    public ozd getRenderEffect() {
        return this.f104591J;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationX() {
        return this.f104588G;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationY() {
        return this.f104589H;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationZ() {
        return this.f104590I;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getScaleX() {
        return this.f104616z;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getScaleY() {
        return this.f104582A;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getShadowElevation() {
        return this.f104585D;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public long mo27671getSpotShadowColor0d7_KjU() {
        return this.f104587F;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getTranslationX() {
        return this.f104583B;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getTranslationY() {
        return this.f104584C;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public boolean isInvalidated() {
        return this.f104606p;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void record(@yfb c64 c64Var, @yfb ov8 ov8Var, @yfb u97 u97Var, @yfb qy6<? super ip4, bth> qy6Var) {
        pr1 pr1Var;
        Canvas canvas;
        if (this.f104595e.getParent() == null) {
            this.f104592b.addView(this.f104595e);
        }
        this.f104595e.setDrawParams(c64Var, ov8Var, u97Var, qy6Var);
        if (this.f104595e.isAttachedToWindow()) {
            this.f104595e.setVisibility(4);
            this.f104595e.setVisibility(0);
            recordDrawingOperations();
            Picture picture = this.f104599i;
            if (picture != null) {
                Canvas canvasBeginRecording = picture.beginRecording(r78.m32087getWidthimpl(this.f104604n), r78.m32086getHeightimpl(this.f104604n));
                try {
                    pr1 pr1Var2 = this.f104601k;
                    if (pr1Var2 != null) {
                        Canvas internalCanvas = pr1Var2.getAndroidCanvas().getInternalCanvas();
                        pr1Var2.getAndroidCanvas().setInternalCanvas(canvasBeginRecording);
                        C4905dq androidCanvas = pr1Var2.getAndroidCanvas();
                        nr1 nr1Var = this.f104600j;
                        if (nr1Var != null) {
                            long jM32288toSizeozmzZPI = s78.m32288toSizeozmzZPI(this.f104604n);
                            nr1.C10018a drawParams = nr1Var.getDrawParams();
                            c64 c64VarComponent1 = drawParams.component1();
                            ov8 ov8VarComponent2 = drawParams.component2();
                            vq1 vq1VarComponent3 = drawParams.component3();
                            pr1Var = pr1Var2;
                            canvas = internalCanvas;
                            long jM31196component4NHjbRc = drawParams.m31196component4NHjbRc();
                            nr1.C10018a drawParams2 = nr1Var.getDrawParams();
                            drawParams2.setDensity(c64Var);
                            drawParams2.setLayoutDirection(ov8Var);
                            drawParams2.setCanvas(androidCanvas);
                            drawParams2.m31199setSizeuvyYCjk(jM32288toSizeozmzZPI);
                            androidCanvas.save();
                            qy6Var.invoke(nr1Var);
                            androidCanvas.restore();
                            nr1.C10018a drawParams3 = nr1Var.getDrawParams();
                            drawParams3.setDensity(c64VarComponent1);
                            drawParams3.setLayoutDirection(ov8VarComponent2);
                            drawParams3.setCanvas(vq1VarComponent3);
                            drawParams3.m31199setSizeuvyYCjk(jM31196component4NHjbRc);
                        } else {
                            pr1Var = pr1Var2;
                            canvas = internalCanvas;
                        }
                        pr1Var.getAndroidCanvas().setInternalCanvas(canvas);
                        bth bthVar = bth.f14751a;
                    }
                    picture.endRecording();
                } catch (Throwable th) {
                    picture.endRecording();
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setAlpha(float f) {
        this.f104613w = f;
        this.f104595e.setAlpha(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public void mo27672setAmbientShadowColor8_81llA(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f104586E = j;
            y9i.f100896a.setOutlineAmbientShadowColor(this.f104595e, j92.m30490toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo27673setBlendModes9anfk8(int i) {
        this.f104610t = i;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(C1995bq.m28033toPorterDuffModes9anfk8(i)));
        updateLayerProperties();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setCameraDistance(float f) {
        this.f104595e.setCameraDistance(f * this.f104596f.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setClip(boolean z) {
        boolean z2 = false;
        this.f104608r = z && !this.f104607q;
        this.f104605o = true;
        ViewLayer viewLayer = this.f104595e;
        if (z && this.f104607q) {
            z2 = true;
        }
        viewLayer.setClipToOutline(z2);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setColorFilter(@gib b92 b92Var) {
        this.f104611u = b92Var;
        obtainLayerPaint().setColorFilter(b92Var != null ? C8936lq.asAndroidColorFilter(b92Var) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    public void mo27674setCompositingStrategyWpw9cng(int i) {
        this.f104612v = i;
        updateLayerProperties();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setInvalidated(boolean z) {
        this.f104606p = z;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setOutline(@gib Outline outline) {
        boolean layerOutline = this.f104595e.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.f104595e.setClipToOutline(true);
            if (this.f104608r) {
                this.f104608r = false;
                this.f104605o = true;
            }
        }
        this.f104607q = outline != null;
        if (layerOutline) {
            return;
        }
        this.f104595e.invalidate();
        recordDrawingOperations();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public void mo27675setPivotOffsetk4lQ0M(long j) {
        this.f104615y = j;
        if (!mzb.m31102isUnspecifiedk4lQ0M(j)) {
            this.f104614x = false;
            this.f104595e.setPivotX(izb.m30429getXimpl(j));
            this.f104595e.setPivotY(izb.m30430getYimpl(j));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                y9i.f100896a.resetPivot(this.f104595e);
                return;
            }
            this.f104614x = true;
            this.f104595e.setPivotX(r78.m32087getWidthimpl(this.f104604n) / 2.0f);
            this.f104595e.setPivotY(r78.m32086getHeightimpl(this.f104604n) / 2.0f);
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo27676setPositionH0pRuoY(int i, int i2, long j) {
        if (r78.m32085equalsimpl0(this.f104604n, j)) {
            int i3 = this.f104602l;
            if (i3 != i) {
                this.f104595e.offsetLeftAndRight(i - i3);
            }
            int i4 = this.f104603m;
            if (i4 != i2) {
                this.f104595e.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (getClip()) {
                this.f104605o = true;
            }
            this.f104595e.layout(i, i2, r78.m32087getWidthimpl(j) + i, r78.m32086getHeightimpl(j) + i2);
            this.f104604n = j;
            if (this.f104614x) {
                this.f104595e.setPivotX(r78.m32087getWidthimpl(j) / 2.0f);
                this.f104595e.setPivotY(r78.m32086getHeightimpl(j) / 2.0f);
            }
        }
        this.f104602l = i;
        this.f104603m = i2;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRenderEffect(@gib ozd ozdVar) {
        this.f104591J = ozdVar;
        if (Build.VERSION.SDK_INT >= 31) {
            bai.f13200a.setRenderEffect(this.f104595e, ozdVar);
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationX(float f) {
        this.f104588G = f;
        this.f104595e.setRotationX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationY(float f) {
        this.f104589H = f;
        this.f104595e.setRotationY(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationZ(float f) {
        this.f104590I = f;
        this.f104595e.setRotation(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setScaleX(float f) {
        this.f104616z = f;
        this.f104595e.setScaleX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setScaleY(float f) {
        this.f104582A = f;
        this.f104595e.setScaleY(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setShadowElevation(float f) {
        this.f104585D = f;
        this.f104595e.setElevation(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo27677setSpotShadowColor8_81llA(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f104587F = j;
            y9i.f100896a.setOutlineSpotShadowColor(this.f104595e, j92.m30490toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setTranslationX(float f) {
        this.f104583B = f;
        this.f104595e.setTranslationX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setTranslationY(float f) {
        this.f104584C = f;
        this.f104595e.setTranslationY(f);
    }

    public /* synthetic */ za7(DrawChildContainer drawChildContainer, long j, pr1 pr1Var, nr1 nr1Var, int i, jt3 jt3Var) {
        this(drawChildContainer, j, (i & 4) != 0 ? new pr1() : pr1Var, (i & 8) != 0 ? new nr1() : nr1Var);
    }
}
