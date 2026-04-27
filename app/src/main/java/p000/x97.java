package p000;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.p002ui.graphics.C0734a;
import androidx.compose.p002ui.graphics.C0737d;
import androidx.compose.p002ui.graphics.C0739f;
import androidx.compose.p002ui.platform.AndroidComposeView;
import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nGraphicsLayerOwnerLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n1#2:438\n*E\n"})
@e0g(parameters = 0)
public final class x97 implements y9c, r97 {

    /* JADX INFO: renamed from: a2 */
    public static final int f97268a2 = 8;

    /* JADX INFO: renamed from: F */
    @gib
    public float[] f97270F;

    /* JADX INFO: renamed from: H */
    public boolean f97271H;

    /* JADX INFO: renamed from: M1 */
    @gib
    public icc f97274M1;

    /* JADX INFO: renamed from: Q */
    public int f97276Q;

    /* JADX INFO: renamed from: V1 */
    public boolean f97277V1;

    /* JADX INFO: renamed from: Y */
    @gib
    public n8c f97279Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public vic f97280Z;

    /* JADX INFO: renamed from: a */
    @yfb
    public u97 f97282a;

    /* JADX INFO: renamed from: b */
    @gib
    public final s97 f97283b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final AndroidComposeView f97284c;

    /* JADX INFO: renamed from: d */
    @gib
    public gz6<? super vq1, ? super u97, bth> f97285d;

    /* JADX INFO: renamed from: e */
    @gib
    public ny6<bth> f97286e;

    /* JADX INFO: renamed from: m */
    public boolean f97288m;

    /* JADX INFO: renamed from: f */
    public long f97287f = s78.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: C */
    @yfb
    public final float[] f97269C = x3a.m33183constructorimpl$default(null, 1, null);

    /* JADX INFO: renamed from: L */
    @yfb
    public c64 f97272L = e64.Density$default(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: M */
    @yfb
    public ov8 f97273M = ov8.Ltr;

    /* JADX INFO: renamed from: N */
    @yfb
    public final nr1 f97275N = new nr1();

    /* JADX INFO: renamed from: X */
    public long f97278X = C0739f.f5349b.m27666getCenterSzJe1aQ();

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public final qy6<ip4, bth> f97281Z1 = new C15003a();

    /* JADX INFO: renamed from: x97$a */
    @dwf({"SMAP\nGraphicsLayerOwnerLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer$recordLambda$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n256#2:438\n1#3:439\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer$recordLambda$1\n*L\n290#1:438\n*E\n"})
    public static final class C15003a extends tt8 implements qy6<ip4, bth> {
        public C15003a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ip4 ip4Var) {
            invoke2(ip4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ip4 ip4Var) {
            x97 x97Var = x97.this;
            vq1 canvas = ip4Var.getDrawContext().getCanvas();
            gz6 gz6Var = x97Var.f97285d;
            if (gz6Var != null) {
                gz6Var.invoke(canvas, ip4Var.getDrawContext().getGraphicsLayer());
            }
        }
    }

    public x97(@yfb u97 u97Var, @gib s97 s97Var, @yfb AndroidComposeView androidComposeView, @yfb gz6<? super vq1, ? super u97, bth> gz6Var, @yfb ny6<bth> ny6Var) {
        this.f97282a = u97Var;
        this.f97283b = s97Var;
        this.f97284c = androidComposeView;
        this.f97285d = gz6Var;
        this.f97286e = ny6Var;
    }

    private final void clipManually(vq1 vq1Var) {
        if (this.f97282a.getClip()) {
            n8c outline = this.f97282a.getOutline();
            if (outline instanceof n8c.C9742b) {
                vq1.m32781clipRectmtrdDE$default(vq1Var, ((n8c.C9742b) outline).getRect(), 0, 2, null);
                return;
            }
            if (!(outline instanceof n8c.C9743c)) {
                if (outline instanceof n8c.C9741a) {
                    vq1.m32779clipPathmtrdDE$default(vq1Var, ((n8c.C9741a) outline).getPath(), 0, 2, null);
                    return;
                }
                return;
            }
            vic vicVarPath = this.f97280Z;
            if (vicVarPath == null) {
                vicVarPath = C8522ku.Path();
                this.f97280Z = vicVarPath;
            }
            vicVarPath.reset();
            vic.addRoundRect$default(vicVarPath, ((n8c.C9743c) outline).getRoundRect(), null, 2, null);
            vq1.m32779clipPathmtrdDE$default(vq1Var, vicVarPath, 0, 2, null);
        }
    }

    /* JADX INFO: renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m33217getInverseMatrix3i98HWw() {
        float[] fArrM33218getMatrixsQKQjiQ = m33218getMatrixsQKQjiQ();
        float[] fArrM33183constructorimpl$default = this.f97270F;
        if (fArrM33183constructorimpl$default == null) {
            fArrM33183constructorimpl$default = x3a.m33183constructorimpl$default(null, 1, null);
            this.f97270F = fArrM33183constructorimpl$default;
        }
        if (re8.m32116invertToJiSxe2E(fArrM33218getMatrixsQKQjiQ, fArrM33183constructorimpl$default)) {
            return fArrM33183constructorimpl$default;
        }
        return null;
    }

    /* JADX INFO: renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m33218getMatrixsQKQjiQ() {
        updateMatrix();
        return this.f97269C;
    }

    private final void setDirty(boolean z) {
        if (z != this.f97271H) {
            this.f97271H = z;
            this.f97284c.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void triggerRepaint() {
        iri.f48111a.onDescendantInvalidated(this.f97284c);
    }

    private final void updateMatrix() {
        u97 u97Var = this.f97282a;
        long jM28834getCenteruvyYCjk = mzb.m31102isUnspecifiedk4lQ0M(u97Var.m32569getPivotOffsetF1C5BW0()) ? eqf.m28834getCenteruvyYCjk(s78.m32288toSizeozmzZPI(this.f97287f)) : u97Var.m32569getPivotOffsetF1C5BW0();
        x3a.m33192resetimpl(this.f97269C);
        float[] fArr = this.f97269C;
        float[] fArrM33183constructorimpl$default = x3a.m33183constructorimpl$default(null, 1, null);
        x3a.m33203translateimpl$default(fArrM33183constructorimpl$default, -izb.m30429getXimpl(jM28834getCenteruvyYCjk), -izb.m30430getYimpl(jM28834getCenteruvyYCjk), 0.0f, 4, null);
        x3a.m33200timesAssign58bKbWc(fArr, fArrM33183constructorimpl$default);
        float[] fArr2 = this.f97269C;
        float[] fArrM33183constructorimpl$default2 = x3a.m33183constructorimpl$default(null, 1, null);
        x3a.m33203translateimpl$default(fArrM33183constructorimpl$default2, u97Var.getTranslationX(), u97Var.getTranslationY(), 0.0f, 4, null);
        x3a.m33193rotateXimpl(fArrM33183constructorimpl$default2, u97Var.getRotationX());
        x3a.m33194rotateYimpl(fArrM33183constructorimpl$default2, u97Var.getRotationY());
        x3a.m33195rotateZimpl(fArrM33183constructorimpl$default2, u97Var.getRotationZ());
        x3a.m33197scaleimpl$default(fArrM33183constructorimpl$default2, u97Var.getScaleX(), u97Var.getScaleY(), 0.0f, 4, null);
        x3a.m33200timesAssign58bKbWc(fArr2, fArrM33183constructorimpl$default2);
        float[] fArr3 = this.f97269C;
        float[] fArrM33183constructorimpl$default3 = x3a.m33183constructorimpl$default(null, 1, null);
        x3a.m33203translateimpl$default(fArrM33183constructorimpl$default3, izb.m30429getXimpl(jM28834getCenteruvyYCjk), izb.m30430getYimpl(jM28834getCenteruvyYCjk), 0.0f, 4, null);
        x3a.m33200timesAssign58bKbWc(fArr3, fArrM33183constructorimpl$default3);
    }

    private final void updateOutline() {
        ny6<bth> ny6Var;
        n8c n8cVar = this.f97279Y;
        if (n8cVar == null) {
            return;
        }
        w97.setOutline(this.f97282a, n8cVar);
        if (!(n8cVar instanceof n8c.C9741a) || Build.VERSION.SDK_INT >= 33 || (ny6Var = this.f97286e) == null) {
            return;
        }
        ny6Var.invoke();
    }

    @Override // p000.y9c
    public void destroy() {
        this.f97285d = null;
        this.f97286e = null;
        this.f97288m = true;
        setDirty(false);
        s97 s97Var = this.f97283b;
        if (s97Var != null) {
            s97Var.releaseGraphicsLayer(this.f97282a);
            this.f97284c.recycle$ui_release(this);
        }
    }

    @Override // p000.y9c
    public void drawLayer(@yfb vq1 vq1Var, @gib u97 u97Var) {
        Canvas nativeCanvas = C5437eq.getNativeCanvas(vq1Var);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            this.f97277V1 = this.f97282a.getShadowElevation() > 0.0f;
            bp4 drawContext = this.f97275N.getDrawContext();
            drawContext.setCanvas(vq1Var);
            drawContext.setGraphicsLayer(u97Var);
            w97.drawLayer(this.f97275N, this.f97282a);
            return;
        }
        float fM27201getXimpl = a78.m27201getXimpl(this.f97282a.m32572getTopLeftnOccac());
        float fM27202getYimpl = a78.m27202getYimpl(this.f97282a.m32572getTopLeftnOccac());
        float fM32087getWidthimpl = fM27201getXimpl + r78.m32087getWidthimpl(this.f97287f);
        float fM32086getHeightimpl = fM27202getYimpl + r78.m32086getHeightimpl(this.f97287f);
        if (this.f97282a.getAlpha() < 1.0f) {
            icc iccVarPaint = this.f97274M1;
            if (iccVarPaint == null) {
                iccVarPaint = C14793wt.Paint();
                this.f97274M1 = iccVarPaint;
            }
            iccVarPaint.setAlpha(this.f97282a.getAlpha());
            nativeCanvas.saveLayer(fM27201getXimpl, fM27202getYimpl, fM32087getWidthimpl, fM32086getHeightimpl, iccVarPaint.asFrameworkPaint());
        } else {
            vq1Var.save();
        }
        vq1Var.translate(fM27201getXimpl, fM27202getYimpl);
        vq1Var.mo28668concat58bKbWc(m33218getMatrixsQKQjiQ());
        if (this.f97282a.getClip()) {
            clipManually(vq1Var);
        }
        gz6<? super vq1, ? super u97, bth> gz6Var = this.f97285d;
        if (gz6Var != null) {
            gz6Var.invoke(vq1Var, null);
        }
        vq1Var.restore();
    }

    @Override // p000.r97
    public long getLayerId() {
        return this.f97282a.getLayerId();
    }

    @Override // p000.r97
    public long getOwnerViewId() {
        return this.f97282a.getOwnerViewId();
    }

    @Override // p000.y9c
    public void invalidate() {
        if (this.f97271H || this.f97288m) {
            return;
        }
        this.f97284c.invalidate();
        setDirty(true);
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo27753inverseTransform58bKbWc(@yfb float[] fArr) {
        float[] fArrM33217getInverseMatrix3i98HWw = m33217getInverseMatrix3i98HWw();
        if (fArrM33217getInverseMatrix3i98HWw != null) {
            x3a.m33200timesAssign58bKbWc(fArr, fArrM33217getInverseMatrix3i98HWw);
        }
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo27754isInLayerk4lQ0M(long j) {
        float fM30429getXimpl = izb.m30429getXimpl(j);
        float fM30430getYimpl = izb.m30430getYimpl(j);
        if (this.f97282a.getClip()) {
            return p8f.isInOutline$default(this.f97282a.getOutline(), fM30429getXimpl, fM30430getYimpl, null, null, 24, null);
        }
        return true;
    }

    @Override // p000.y9c
    public void mapBounds(@yfb q6b q6bVar, boolean z) {
        if (!z) {
            x3a.m33191mapimpl(m33218getMatrixsQKQjiQ(), q6bVar);
            return;
        }
        float[] fArrM33217getInverseMatrix3i98HWw = m33217getInverseMatrix3i98HWw();
        if (fArrM33217getInverseMatrix3i98HWw == null) {
            q6bVar.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            x3a.m33191mapimpl(fArrM33217getInverseMatrix3i98HWw, q6bVar);
        }
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo27755mapOffset8S9VItk(long j, boolean z) {
        if (!z) {
            return x3a.m33189mapMKHz9U(m33218getMatrixsQKQjiQ(), j);
        }
        float[] fArrM33217getInverseMatrix3i98HWw = m33217getInverseMatrix3i98HWw();
        return fArrM33217getInverseMatrix3i98HWw != null ? x3a.m33189mapMKHz9U(fArrM33217getInverseMatrix3i98HWw, j) : izb.f49009b.m30443getInfiniteF1C5BW0();
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo27756movegyyYBs(long j) {
        this.f97282a.m32581setTopLeftgyyYBs(j);
        triggerRepaint();
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo27757resizeozmzZPI(long j) {
        if (r78.m32085equalsimpl0(j, this.f97287f)) {
            return;
        }
        this.f97287f = j;
        invalidate();
    }

    @Override // p000.y9c
    public void reuseLayer(@yfb gz6<? super vq1, ? super u97, bth> gz6Var, @yfb ny6<bth> ny6Var) {
        s97 s97Var = this.f97283b;
        if (s97Var == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f97282a.isReleased()) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f97282a = s97Var.createGraphicsLayer();
        this.f97288m = false;
        this.f97285d = gz6Var;
        this.f97286e = ny6Var;
        this.f97278X = C0739f.f5349b.m27666getCenterSzJe1aQ();
        this.f97277V1 = false;
        this.f97287f = s78.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f97279Y = null;
        this.f97276Q = 0;
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo27758transform58bKbWc(@yfb float[] fArr) {
        x3a.m33200timesAssign58bKbWc(fArr, m33218getMatrixsQKQjiQ());
    }

    @Override // p000.y9c
    public void updateDisplayList() {
        if (this.f97271H) {
            if (!C0739f.m27660equalsimpl0(this.f97278X, C0739f.f5349b.m27666getCenterSzJe1aQ()) && !r78.m32085equalsimpl0(this.f97282a.m32570getSizeYbymL2g(), this.f97287f)) {
                this.f97282a.m32577setPivotOffsetk4lQ0M(mzb.Offset(C0739f.m27661getPivotFractionXimpl(this.f97278X) * r78.m32087getWidthimpl(this.f97287f), C0739f.m27662getPivotFractionYimpl(this.f97278X) * r78.m32086getHeightimpl(this.f97287f)));
            }
            this.f97282a.m32573recordmLhObY(this.f97272L, this.f97273M, this.f97287f, this.f97281Z1);
            setDirty(false);
        }
    }

    @Override // p000.y9c
    public void updateLayerProperties(@yfb C0737d c0737d) {
        boolean z;
        int iM28017getModulateAlphake2Ky5w;
        ny6<bth> ny6Var;
        int mutatedFields$ui_release = c0737d.getMutatedFields$ui_release() | this.f97276Q;
        this.f97273M = c0737d.getLayoutDirection$ui_release();
        this.f97272L = c0737d.getGraphicsDensity$ui_release();
        int i = mutatedFields$ui_release & 4096;
        if (i != 0) {
            this.f97278X = c0737d.mo27620getTransformOriginSzJe1aQ();
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            this.f97282a.setScaleX(c0737d.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.f97282a.setScaleY(c0737d.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.f97282a.setAlpha(c0737d.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.f97282a.setTranslationX(c0737d.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.f97282a.setTranslationY(c0737d.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.f97282a.setShadowElevation(c0737d.getShadowElevation());
            if (c0737d.getShadowElevation() > 0.0f && !this.f97277V1 && (ny6Var = this.f97286e) != null) {
                ny6Var.invoke();
            }
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.f97282a.m32574setAmbientShadowColor8_81llA(c0737d.mo27616getAmbientShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.f97282a.m32580setSpotShadowColor8_81llA(c0737d.mo27619getSpotShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.f97282a.setRotationZ(c0737d.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            this.f97282a.setRotationX(c0737d.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.f97282a.setRotationY(c0737d.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.f97282a.setCameraDistance(c0737d.getCameraDistance());
        }
        if (i != 0) {
            if (C0739f.m27660equalsimpl0(this.f97278X, C0739f.f5349b.m27666getCenterSzJe1aQ())) {
                this.f97282a.m32577setPivotOffsetk4lQ0M(izb.f49009b.m30444getUnspecifiedF1C5BW0());
            } else {
                this.f97282a.m32577setPivotOffsetk4lQ0M(mzb.Offset(C0739f.m27661getPivotFractionXimpl(this.f97278X) * r78.m32087getWidthimpl(this.f97287f), C0739f.m27662getPivotFractionYimpl(this.f97278X) * r78.m32086getHeightimpl(this.f97287f)));
            }
        }
        if ((mutatedFields$ui_release & 16384) != 0) {
            this.f97282a.setClip(c0737d.getClip());
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.f97282a.setRenderEffect(c0737d.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            u97 u97Var = this.f97282a;
            int iMo27617getCompositingStrategyNrFUSI = c0737d.mo27617getCompositingStrategyNrFUSI();
            C0734a.a aVar = C0734a.f5300b;
            if (C0734a.m27582equalsimpl0(iMo27617getCompositingStrategyNrFUSI, aVar.m27586getAutoNrFUSI())) {
                iM28017getModulateAlphake2Ky5w = bn2.f14169b.m28016getAutoke2Ky5w();
            } else if (C0734a.m27582equalsimpl0(iMo27617getCompositingStrategyNrFUSI, aVar.m27588getOffscreenNrFUSI())) {
                iM28017getModulateAlphake2Ky5w = bn2.f14169b.m28018getOffscreenke2Ky5w();
            } else {
                if (!C0734a.m27582equalsimpl0(iMo27617getCompositingStrategyNrFUSI, aVar.m27587getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iM28017getModulateAlphake2Ky5w = bn2.f14169b.m28017getModulateAlphake2Ky5w();
            }
            u97Var.m32576setCompositingStrategyWpw9cng(iM28017getModulateAlphake2Ky5w);
        }
        if (md8.areEqual(this.f97279Y, c0737d.getOutline$ui_release())) {
            z = false;
        } else {
            this.f97279Y = c0737d.getOutline$ui_release();
            updateOutline();
            z = true;
        }
        this.f97276Q = c0737d.getMutatedFields$ui_release();
        if (mutatedFields$ui_release != 0 || z) {
            triggerRepaint();
        }
    }
}
