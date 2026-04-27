package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.compose.p002ui.graphics.C0737d;
import androidx.compose.p002ui.graphics.C0739f;
import androidx.compose.p002ui.platform.AndroidComposeView;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@c5e(23)
@dwf({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1#2:411\n*E\n"})
@e0g(parameters = 0)
public final class c1e implements y9c, r97 {

    /* JADX INFO: renamed from: Q */
    @yfb
    public static final C2158b f15532Q = new C2158b(null);

    /* JADX INFO: renamed from: X */
    public static final int f15533X = 8;

    /* JADX INFO: renamed from: Y */
    @yfb
    public static final gz6<l94, Matrix, bth> f15534Y = C2157a.f15548a;

    /* JADX INFO: renamed from: C */
    @gib
    public icc f15535C;

    /* JADX INFO: renamed from: M */
    @yfb
    public final l94 f15539M;

    /* JADX INFO: renamed from: N */
    public int f15540N;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AndroidComposeView f15541a;

    /* JADX INFO: renamed from: b */
    @gib
    public gz6<? super vq1, ? super u97, bth> f15542b;

    /* JADX INFO: renamed from: c */
    @gib
    public ny6<bth> f15543c;

    /* JADX INFO: renamed from: d */
    public boolean f15544d;

    /* JADX INFO: renamed from: f */
    public boolean f15546f;

    /* JADX INFO: renamed from: m */
    public boolean f15547m;

    /* JADX INFO: renamed from: e */
    @yfb
    public final p8c f15545e = new p8c();

    /* JADX INFO: renamed from: F */
    @yfb
    public final xu8<l94> f15536F = new xu8<>(f15534Y);

    /* JADX INFO: renamed from: H */
    @yfb
    public final pr1 f15537H = new pr1();

    /* JADX INFO: renamed from: L */
    public long f15538L = C0739f.f5349b.m27666getCenterSzJe1aQ();

    /* JADX INFO: renamed from: c1e$a */
    public static final class C2157a extends tt8 implements gz6<l94, Matrix, bth> {

        /* JADX INFO: renamed from: a */
        public static final C2157a f15548a = new C2157a();

        public C2157a() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(l94 l94Var, Matrix matrix) {
            invoke2(l94Var, matrix);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb l94 l94Var, @yfb Matrix matrix) {
            l94Var.getMatrix(matrix);
        }
    }

    /* JADX INFO: renamed from: c1e$b */
    public static final class C2158b {
        public /* synthetic */ C2158b(jt3 jt3Var) {
            this();
        }

        private C2158b() {
        }
    }

    /* JADX INFO: renamed from: c1e$c */
    @c5e(29)
    public static final class C2159c {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C2159c f15549a = new C2159c();

        private C2159c() {
        }

        @do8
        @ih4
        public static final long getUniqueDrawingId(@yfb View view) {
            return view.getUniqueDrawingId();
        }
    }

    /* JADX INFO: renamed from: c1e$d */
    public static final class C2160d extends tt8 implements qy6<vq1, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<vq1, u97, bth> f15550a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2160d(gz6<? super vq1, ? super u97, bth> gz6Var) {
            super(1);
            this.f15550a = gz6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(vq1 vq1Var) {
            invoke2(vq1Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb vq1 vq1Var) {
            this.f15550a.invoke(vq1Var, null);
        }
    }

    public c1e(@yfb AndroidComposeView androidComposeView, @yfb gz6<? super vq1, ? super u97, bth> gz6Var, @yfb ny6<bth> ny6Var) {
        this.f15541a = androidComposeView;
        this.f15542b = gz6Var;
        this.f15543c = ny6Var;
        l94 a1eVar = Build.VERSION.SDK_INT >= 29 ? new a1e(androidComposeView) : new yzd(androidComposeView);
        a1eVar.setHasOverlappingRendering(true);
        a1eVar.setClipToBounds(false);
        this.f15539M = a1eVar;
    }

    private final void clipRenderNode(vq1 vq1Var) {
        if (this.f15539M.getClipToOutline() || this.f15539M.getClipToBounds()) {
            this.f15545e.clipToOutline(vq1Var);
        }
    }

    private final void setDirty(boolean z) {
        if (z != this.f15544d) {
            this.f15544d = z;
            this.f15541a.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void triggerRepaint() {
        iri.f48111a.onDescendantInvalidated(this.f15541a);
    }

    @Override // p000.y9c
    public void destroy() {
        if (this.f15539M.getHasDisplayList()) {
            this.f15539M.discardDisplayList();
        }
        this.f15542b = null;
        this.f15543c = null;
        this.f15546f = true;
        setDirty(false);
        this.f15541a.requestClearInvalidObservations();
        this.f15541a.recycle$ui_release(this);
    }

    @Override // p000.y9c
    public void drawLayer(@yfb vq1 vq1Var, @gib u97 u97Var) {
        Canvas nativeCanvas = C5437eq.getNativeCanvas(vq1Var);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z = this.f15539M.getElevation() > 0.0f;
            this.f15547m = z;
            if (z) {
                vq1Var.enableZ();
            }
            this.f15539M.drawInto(nativeCanvas);
            if (this.f15547m) {
                vq1Var.disableZ();
                return;
            }
            return;
        }
        float left = this.f15539M.getLeft();
        float top = this.f15539M.getTop();
        float right = this.f15539M.getRight();
        float bottom = this.f15539M.getBottom();
        if (this.f15539M.getAlpha() < 1.0f) {
            icc iccVarPaint = this.f15535C;
            if (iccVarPaint == null) {
                iccVarPaint = C14793wt.Paint();
                this.f15535C = iccVarPaint;
            }
            iccVarPaint.setAlpha(this.f15539M.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, iccVarPaint.asFrameworkPaint());
        } else {
            vq1Var.save();
        }
        vq1Var.translate(left, top);
        vq1Var.mo28668concat58bKbWc(this.f15536F.m33300calculateMatrixGrdbGEg(this.f15539M));
        clipRenderNode(vq1Var);
        gz6<? super vq1, ? super u97, bth> gz6Var = this.f15542b;
        if (gz6Var != null) {
            gz6Var.invoke(vq1Var, null);
        }
        vq1Var.restore();
        setDirty(false);
    }

    @Override // p000.r97
    public long getLayerId() {
        return this.f15539M.getUniqueId();
    }

    @yfb
    public final AndroidComposeView getOwnerView() {
        return this.f15541a;
    }

    @Override // p000.r97
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C2159c.getUniqueDrawingId(this.f15541a);
        }
        return -1L;
    }

    @Override // p000.y9c
    public void invalidate() {
        if (this.f15544d || this.f15546f) {
            return;
        }
        this.f15541a.invalidate();
        setDirty(true);
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo27753inverseTransform58bKbWc(@yfb float[] fArr) {
        float[] fArrM33299calculateInverseMatrixbWbORWo = this.f15536F.m33299calculateInverseMatrixbWbORWo(this.f15539M);
        if (fArrM33299calculateInverseMatrixbWbORWo != null) {
            x3a.m33200timesAssign58bKbWc(fArr, fArrM33299calculateInverseMatrixbWbORWo);
        }
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo27754isInLayerk4lQ0M(long j) {
        float fM30429getXimpl = izb.m30429getXimpl(j);
        float fM30430getYimpl = izb.m30430getYimpl(j);
        if (this.f15539M.getClipToBounds()) {
            return 0.0f <= fM30429getXimpl && fM30429getXimpl < ((float) this.f15539M.getWidth()) && 0.0f <= fM30430getYimpl && fM30430getYimpl < ((float) this.f15539M.getHeight());
        }
        if (this.f15539M.getClipToOutline()) {
            return this.f15545e.m31733isInOutlinek4lQ0M(j);
        }
        return true;
    }

    @Override // p000.y9c
    public void mapBounds(@yfb q6b q6bVar, boolean z) {
        if (!z) {
            x3a.m33191mapimpl(this.f15536F.m33300calculateMatrixGrdbGEg(this.f15539M), q6bVar);
            return;
        }
        float[] fArrM33299calculateInverseMatrixbWbORWo = this.f15536F.m33299calculateInverseMatrixbWbORWo(this.f15539M);
        if (fArrM33299calculateInverseMatrixbWbORWo == null) {
            q6bVar.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            x3a.m33191mapimpl(fArrM33299calculateInverseMatrixbWbORWo, q6bVar);
        }
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo27755mapOffset8S9VItk(long j, boolean z) {
        if (!z) {
            return x3a.m33189mapMKHz9U(this.f15536F.m33300calculateMatrixGrdbGEg(this.f15539M), j);
        }
        float[] fArrM33299calculateInverseMatrixbWbORWo = this.f15536F.m33299calculateInverseMatrixbWbORWo(this.f15539M);
        return fArrM33299calculateInverseMatrixbWbORWo != null ? x3a.m33189mapMKHz9U(fArrM33299calculateInverseMatrixbWbORWo, j) : izb.f49009b.m30443getInfiniteF1C5BW0();
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo27756movegyyYBs(long j) {
        int left = this.f15539M.getLeft();
        int top = this.f15539M.getTop();
        int iM27201getXimpl = a78.m27201getXimpl(j);
        int iM27202getYimpl = a78.m27202getYimpl(j);
        if (left == iM27201getXimpl && top == iM27202getYimpl) {
            return;
        }
        if (left != iM27201getXimpl) {
            this.f15539M.offsetLeftAndRight(iM27201getXimpl - left);
        }
        if (top != iM27202getYimpl) {
            this.f15539M.offsetTopAndBottom(iM27202getYimpl - top);
        }
        triggerRepaint();
        this.f15536F.invalidate();
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo27757resizeozmzZPI(long j) {
        int iM32087getWidthimpl = r78.m32087getWidthimpl(j);
        int iM32086getHeightimpl = r78.m32086getHeightimpl(j);
        this.f15539M.setPivotX(C0739f.m27661getPivotFractionXimpl(this.f15538L) * iM32087getWidthimpl);
        this.f15539M.setPivotY(C0739f.m27662getPivotFractionYimpl(this.f15538L) * iM32086getHeightimpl);
        l94 l94Var = this.f15539M;
        if (l94Var.setPosition(l94Var.getLeft(), this.f15539M.getTop(), this.f15539M.getLeft() + iM32087getWidthimpl, this.f15539M.getTop() + iM32086getHeightimpl)) {
            this.f15539M.setOutline(this.f15545e.getAndroidOutline());
            invalidate();
            this.f15536F.invalidate();
        }
    }

    @Override // p000.y9c
    public void reuseLayer(@yfb gz6<? super vq1, ? super u97, bth> gz6Var, @yfb ny6<bth> ny6Var) {
        setDirty(false);
        this.f15546f = false;
        this.f15547m = false;
        this.f15538L = C0739f.f5349b.m27666getCenterSzJe1aQ();
        this.f15542b = gz6Var;
        this.f15543c = ny6Var;
    }

    @Override // p000.y9c
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo27758transform58bKbWc(@yfb float[] fArr) {
        x3a.m33200timesAssign58bKbWc(fArr, this.f15536F.m33300calculateMatrixGrdbGEg(this.f15539M));
    }

    @Override // p000.y9c
    public void updateDisplayList() {
        if (this.f15544d || !this.f15539M.getHasDisplayList()) {
            vic clipPath = (!this.f15539M.getClipToOutline() || this.f15545e.getOutlineClipSupported()) ? null : this.f15545e.getClipPath();
            gz6<? super vq1, ? super u97, bth> gz6Var = this.f15542b;
            if (gz6Var != null) {
                this.f15539M.record(this.f15537H, clipPath, new C2160d(gz6Var));
            }
            setDirty(false);
        }
    }

    @Override // p000.y9c
    public void updateLayerProperties(@yfb C0737d c0737d) {
        ny6<bth> ny6Var;
        int mutatedFields$ui_release = c0737d.getMutatedFields$ui_release() | this.f15540N;
        int i = mutatedFields$ui_release & 4096;
        if (i != 0) {
            this.f15538L = c0737d.mo27620getTransformOriginSzJe1aQ();
        }
        boolean z = false;
        boolean z2 = this.f15539M.getClipToOutline() && !this.f15545e.getOutlineClipSupported();
        if ((mutatedFields$ui_release & 1) != 0) {
            this.f15539M.setScaleX(c0737d.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.f15539M.setScaleY(c0737d.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.f15539M.setAlpha(c0737d.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.f15539M.setTranslationX(c0737d.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.f15539M.setTranslationY(c0737d.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.f15539M.setElevation(c0737d.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.f15539M.setAmbientShadowColor(j92.m30490toArgb8_81llA(c0737d.mo27616getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.f15539M.setSpotShadowColor(j92.m30490toArgb8_81llA(c0737d.mo27619getSpotShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.f15539M.setRotationZ(c0737d.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            this.f15539M.setRotationX(c0737d.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.f15539M.setRotationY(c0737d.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.f15539M.setCameraDistance(c0737d.getCameraDistance());
        }
        if (i != 0) {
            this.f15539M.setPivotX(C0739f.m27661getPivotFractionXimpl(this.f15538L) * this.f15539M.getWidth());
            this.f15539M.setPivotY(C0739f.m27662getPivotFractionYimpl(this.f15538L) * this.f15539M.getHeight());
        }
        boolean z3 = c0737d.getClip() && c0737d.getShape() != cvd.getRectangleShape();
        if ((mutatedFields$ui_release & CpioConstants.C_ISBLK) != 0) {
            this.f15539M.setClipToOutline(z3);
            this.f15539M.setClipToBounds(c0737d.getClip() && c0737d.getShape() == cvd.getRectangleShape());
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.f15539M.setRenderEffect(c0737d.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            this.f15539M.mo27181setCompositingStrategyaDBOjCE(c0737d.mo27617getCompositingStrategyNrFUSI());
        }
        boolean zM31734updateS_szKao = this.f15545e.m31734updateS_szKao(c0737d.getOutline$ui_release(), c0737d.getAlpha(), z3, c0737d.getShadowElevation(), c0737d.mo27618getSizeNHjbRc());
        if (this.f15545e.getCacheIsDirty$ui_release()) {
            this.f15539M.setOutline(this.f15545e.getAndroidOutline());
        }
        if (z3 && !this.f15545e.getOutlineClipSupported()) {
            z = true;
        }
        if (z2 != z || (z && zM31734updateS_szKao)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.f15547m && this.f15539M.getElevation() > 0.0f && (ny6Var = this.f15543c) != null) {
            ny6Var.invoke();
        }
        if ((mutatedFields$ui_release & gs5.f40903s) != 0) {
            this.f15536F.invalidate();
        }
        this.f15540N = c0737d.getMutatedFields$ui_release();
    }
}
