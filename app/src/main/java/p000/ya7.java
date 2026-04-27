package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.p002ui.graphics.layer.InterfaceC0742a;
import p000.bn2;
import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
@dwf({"SMAP\nGraphicsLayerV29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,293:1\n1#2:294\n47#3,5:295\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n*L\n237#1:295,5\n*E\n"})
public final class ya7 implements InterfaceC0742a {

    /* JADX INFO: renamed from: A */
    public boolean f100941A;

    /* JADX INFO: renamed from: B */
    @gib
    public ozd f100942B;

    /* JADX INFO: renamed from: C */
    public int f100943C;

    /* JADX INFO: renamed from: D */
    public boolean f100944D;

    /* JADX INFO: renamed from: b */
    public final long f100945b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final pr1 f100946c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final nr1 f100947d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final RenderNode f100948e;

    /* JADX INFO: renamed from: f */
    public long f100949f;

    /* JADX INFO: renamed from: g */
    @gib
    public Paint f100950g;

    /* JADX INFO: renamed from: h */
    @gib
    public Matrix f100951h;

    /* JADX INFO: renamed from: i */
    public boolean f100952i;

    /* JADX INFO: renamed from: j */
    public float f100953j;

    /* JADX INFO: renamed from: k */
    public int f100954k;

    /* JADX INFO: renamed from: l */
    @gib
    public b92 f100955l;

    /* JADX INFO: renamed from: m */
    public long f100956m;

    /* JADX INFO: renamed from: n */
    public float f100957n;

    /* JADX INFO: renamed from: o */
    public float f100958o;

    /* JADX INFO: renamed from: p */
    public float f100959p;

    /* JADX INFO: renamed from: q */
    public float f100960q;

    /* JADX INFO: renamed from: r */
    public float f100961r;

    /* JADX INFO: renamed from: s */
    public long f100962s;

    /* JADX INFO: renamed from: t */
    public long f100963t;

    /* JADX INFO: renamed from: u */
    public float f100964u;

    /* JADX INFO: renamed from: v */
    public float f100965v;

    /* JADX INFO: renamed from: w */
    public float f100966w;

    /* JADX INFO: renamed from: x */
    public float f100967x;

    /* JADX INFO: renamed from: y */
    public boolean f100968y;

    /* JADX INFO: renamed from: z */
    public boolean f100969z;

    public ya7(long j, @yfb pr1 pr1Var, @yfb nr1 nr1Var) {
        this.f100945b = j;
        this.f100946c = pr1Var;
        this.f100947d = nr1Var;
        RenderNode renderNodeM19675a = pp4.m19675a("graphicsLayer");
        this.f100948e = renderNodeM19675a;
        this.f100949f = wpf.f95046b.m33078getZeroNHjbRc();
        renderNodeM19675a.setClipToBounds(false);
        bn2.C1953a c1953a = bn2.f14169b;
        m33376applyCompositingStrategyZ1X6vPc(renderNodeM19675a, c1953a.m28016getAutoke2Ky5w());
        this.f100953j = 1.0f;
        this.f100954k = q51.f73234b.m31928getSrcOver0nO6VwU();
        this.f100956m = izb.f49009b.m30444getUnspecifiedF1C5BW0();
        this.f100957n = 1.0f;
        this.f100958o = 1.0f;
        w82.C14471a c14471a = w82.f93556b;
        this.f100962s = c14471a.m32977getBlack0d7_KjU();
        this.f100963t = c14471a.m32977getBlack0d7_KjU();
        this.f100967x = 8.0f;
        this.f100943C = c1953a.m28016getAutoke2Ky5w();
        this.f100944D = true;
    }

    private final void applyClip() {
        boolean z = false;
        boolean z2 = getClip() && !this.f100952i;
        if (getClip() && this.f100952i) {
            z = true;
        }
        if (z2 != this.f100969z) {
            this.f100969z = z2;
            this.f100948e.setClipToBounds(z2);
        }
        if (z != this.f100941A) {
            this.f100941A = z;
            this.f100948e.setClipToOutline(z);
        }
    }

    /* JADX INFO: renamed from: applyCompositingStrategy-Z1X6vPc, reason: not valid java name */
    private final void m33376applyCompositingStrategyZ1X6vPc(RenderNode renderNode, int i) {
        bn2.C1953a c1953a = bn2.f14169b;
        if (bn2.m28012equalsimpl0(i, c1953a.m28018getOffscreenke2Ky5w())) {
            renderNode.setUseCompositingLayer(true, this.f100950g);
            renderNode.setHasOverlappingRendering(true);
        } else if (bn2.m28012equalsimpl0(i, c1953a.m28017getModulateAlphake2Ky5w())) {
            renderNode.setUseCompositingLayer(false, this.f100950g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f100950g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.f100950g;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f100950g = paint2;
        return paint2;
    }

    private final boolean requiresCompositingLayer() {
        return bn2.m28012equalsimpl0(mo27669getCompositingStrategyke2Ky5w(), bn2.f14169b.m28018getOffscreenke2Ky5w()) || requiresLayerPaint() || getRenderEffect() != null;
    }

    private final boolean requiresLayerPaint() {
        return (q51.m31897equalsimpl0(mo27668getBlendMode0nO6VwU(), q51.f73234b.m31928getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m33376applyCompositingStrategyZ1X6vPc(this.f100948e, bn2.f14169b.m28018getOffscreenke2Ky5w());
        } else {
            m33376applyCompositingStrategyZ1X6vPc(this.f100948e, mo27669getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @yfb
    public Matrix calculateMatrix() {
        Matrix matrix = this.f100951h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f100951h = matrix;
        }
        this.f100948e.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void discardDisplayList() {
        this.f100948e.discardDisplayList();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void draw(@yfb vq1 vq1Var) {
        C5437eq.getNativeCanvas(vq1Var).drawRenderNode(this.f100948e);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getAlpha() {
        return this.f100953j;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo27667getAmbientShadowColor0d7_KjU() {
        return this.f100962s;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo27668getBlendMode0nO6VwU() {
        return this.f100954k;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getCameraDistance() {
        return this.f100967x;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public boolean getClip() {
        return this.f100968y;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @gib
    public b92 getColorFilter() {
        return this.f100955l;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo27669getCompositingStrategyke2Ky5w() {
        return this.f100943C;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public boolean getHasDisplayList() {
        return this.f100948e.hasDisplayList();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public long getLayerId() {
        return this.f100948e.getUniqueId();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public long getOwnerId() {
        return this.f100945b;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    public long mo27670getPivotOffsetF1C5BW0() {
        return this.f100956m;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    @gib
    public ozd getRenderEffect() {
        return this.f100942B;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationX() {
        return this.f100964u;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationY() {
        return this.f100965v;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getRotationZ() {
        return this.f100966w;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getScaleX() {
        return this.f100957n;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getScaleY() {
        return this.f100958o;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getShadowElevation() {
        return this.f100961r;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public long mo27671getSpotShadowColor0d7_KjU() {
        return this.f100963t;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getTranslationX() {
        return this.f100959p;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public float getTranslationY() {
        return this.f100960q;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public boolean isInvalidated() {
        return this.f100944D;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void record(@yfb c64 c64Var, @yfb ov8 ov8Var, @yfb u97 u97Var, @yfb qy6<? super ip4, bth> qy6Var) {
        RecordingCanvas recordingCanvasBeginRecording = this.f100948e.beginRecording();
        try {
            pr1 pr1Var = this.f100946c;
            Canvas internalCanvas = pr1Var.getAndroidCanvas().getInternalCanvas();
            pr1Var.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
            C4905dq androidCanvas = pr1Var.getAndroidCanvas();
            bp4 drawContext = this.f100947d.getDrawContext();
            drawContext.setDensity(c64Var);
            drawContext.setLayoutDirection(ov8Var);
            drawContext.setGraphicsLayer(u97Var);
            drawContext.mo28020setSizeuvyYCjk(this.f100949f);
            drawContext.setCanvas(androidCanvas);
            qy6Var.invoke(this.f100947d);
            pr1Var.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.f100948e.endRecording();
            setInvalidated(false);
        } catch (Throwable th) {
            this.f100948e.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setAlpha(float f) {
        this.f100953j = f;
        this.f100948e.setAlpha(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public void mo27672setAmbientShadowColor8_81llA(long j) {
        this.f100962s = j;
        this.f100948e.setAmbientShadowColor(j92.m30490toArgb8_81llA(j));
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo27673setBlendModes9anfk8(int i) {
        this.f100954k = i;
        obtainLayerPaint().setBlendMode(C1995bq.m28032toAndroidBlendModes9anfk8(i));
        updateLayerProperties();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setCameraDistance(float f) {
        this.f100967x = f;
        this.f100948e.setCameraDistance(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setClip(boolean z) {
        this.f100968y = z;
        applyClip();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setColorFilter(@gib b92 b92Var) {
        this.f100955l = b92Var;
        obtainLayerPaint().setColorFilter(b92Var != null ? C8936lq.asAndroidColorFilter(b92Var) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    public void mo27674setCompositingStrategyWpw9cng(int i) {
        this.f100943C = i;
        updateLayerProperties();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setInvalidated(boolean z) {
        this.f100944D = z;
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setOutline(@gib Outline outline) {
        this.f100948e.setOutline(outline);
        this.f100952i = outline != null;
        applyClip();
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public void mo27675setPivotOffsetk4lQ0M(long j) {
        this.f100956m = j;
        if (mzb.m31102isUnspecifiedk4lQ0M(j)) {
            this.f100948e.resetPivot();
        } else {
            this.f100948e.setPivotX(izb.m30429getXimpl(j));
            this.f100948e.setPivotY(izb.m30430getYimpl(j));
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo27676setPositionH0pRuoY(int i, int i2, long j) {
        this.f100948e.setPosition(i, i2, r78.m32087getWidthimpl(j) + i, r78.m32086getHeightimpl(j) + i2);
        this.f100949f = s78.m32288toSizeozmzZPI(j);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRenderEffect(@gib ozd ozdVar) {
        this.f100942B = ozdVar;
        if (Build.VERSION.SDK_INT >= 31) {
            k1e.f52387a.setRenderEffect(this.f100948e, ozdVar);
        }
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationX(float f) {
        this.f100964u = f;
        this.f100948e.setRotationX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationY(float f) {
        this.f100965v = f;
        this.f100948e.setRotationY(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setRotationZ(float f) {
        this.f100966w = f;
        this.f100948e.setRotationZ(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setScaleX(float f) {
        this.f100957n = f;
        this.f100948e.setScaleX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setScaleY(float f) {
        this.f100958o = f;
        this.f100948e.setScaleY(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setShadowElevation(float f) {
        this.f100961r = f;
        this.f100948e.setElevation(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo27677setSpotShadowColor8_81llA(long j) {
        this.f100963t = j;
        this.f100948e.setSpotShadowColor(j92.m30490toArgb8_81llA(j));
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setTranslationX(float f) {
        this.f100959p = f;
        this.f100948e.setTranslationX(f);
    }

    @Override // androidx.compose.p002ui.graphics.layer.InterfaceC0742a
    public void setTranslationY(float f) {
        this.f100960q = f;
        this.f100948e.setTranslationY(f);
    }

    public /* synthetic */ ya7(long j, pr1 pr1Var, nr1 nr1Var, int i, jt3 jt3Var) {
        this(j, (i & 2) != 0 ? new pr1() : pr1Var, (i & 4) != 0 ? new nr1() : nr1Var);
    }
}
