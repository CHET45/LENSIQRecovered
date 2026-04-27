package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.p002ui.graphics.C0734a;
import androidx.compose.p002ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
@dwf({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
@e0g(parameters = 0)
public final class a1e implements l94 {

    /* JADX INFO: renamed from: e */
    public static final int f140e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AndroidComposeView f141a;

    /* JADX INFO: renamed from: c */
    @gib
    public ozd f143c;

    /* JADX INFO: renamed from: b */
    @yfb
    public final RenderNode f142b = pp4.m19675a("Compose");

    /* JADX INFO: renamed from: d */
    public int f144d = C0734a.f5300b.m27586getAutoNrFUSI();

    public a1e(@yfb AndroidComposeView androidComposeView) {
        this.f141a = androidComposeView;
    }

    @Override // p000.l94
    public void discardDisplayList() {
        this.f142b.discardDisplayList();
    }

    @Override // p000.l94
    public void drawInto(@yfb Canvas canvas) {
        canvas.drawRenderNode(this.f142b);
    }

    @Override // p000.l94
    @yfb
    public m94 dumpRenderNodeData() {
        return new m94(this.f142b.getUniqueId(), this.f142b.getLeft(), this.f142b.getTop(), this.f142b.getRight(), this.f142b.getBottom(), this.f142b.getWidth(), this.f142b.getHeight(), this.f142b.getScaleX(), this.f142b.getScaleY(), this.f142b.getTranslationX(), this.f142b.getTranslationY(), this.f142b.getElevation(), this.f142b.getAmbientShadowColor(), this.f142b.getSpotShadowColor(), this.f142b.getRotationZ(), this.f142b.getRotationX(), this.f142b.getRotationY(), this.f142b.getCameraDistance(), this.f142b.getPivotX(), this.f142b.getPivotY(), this.f142b.getClipToOutline(), this.f142b.getClipToBounds(), this.f142b.getAlpha(), this.f143c, this.f144d, null);
    }

    @Override // p000.l94
    public float getAlpha() {
        return this.f142b.getAlpha();
    }

    @Override // p000.l94
    public int getAmbientShadowColor() {
        return this.f142b.getAmbientShadowColor();
    }

    @Override // p000.l94
    public int getBottom() {
        return this.f142b.getBottom();
    }

    @Override // p000.l94
    public float getCameraDistance() {
        return this.f142b.getCameraDistance();
    }

    @Override // p000.l94
    public boolean getClipToBounds() {
        return this.f142b.getClipToBounds();
    }

    @Override // p000.l94
    public boolean getClipToOutline() {
        return this.f142b.getClipToOutline();
    }

    @Override // p000.l94
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public int mo27180getCompositingStrategyNrFUSI() {
        return this.f144d;
    }

    @Override // p000.l94
    public float getElevation() {
        return this.f142b.getElevation();
    }

    @Override // p000.l94
    public boolean getHasDisplayList() {
        return this.f142b.hasDisplayList();
    }

    @Override // p000.l94
    public int getHeight() {
        return this.f142b.getHeight();
    }

    @Override // p000.l94
    public void getInverseMatrix(@yfb Matrix matrix) {
        this.f142b.getInverseMatrix(matrix);
    }

    @Override // p000.l94
    public int getLeft() {
        return this.f142b.getLeft();
    }

    @Override // p000.l94
    public void getMatrix(@yfb Matrix matrix) {
        this.f142b.getMatrix(matrix);
    }

    @yfb
    public final AndroidComposeView getOwnerView() {
        return this.f141a;
    }

    @Override // p000.l94
    public float getPivotX() {
        return this.f142b.getPivotX();
    }

    @Override // p000.l94
    public float getPivotY() {
        return this.f142b.getPivotY();
    }

    @Override // p000.l94
    @gib
    public ozd getRenderEffect() {
        return this.f143c;
    }

    @Override // p000.l94
    public int getRight() {
        return this.f142b.getRight();
    }

    @Override // p000.l94
    public float getRotationX() {
        return this.f142b.getRotationX();
    }

    @Override // p000.l94
    public float getRotationY() {
        return this.f142b.getRotationY();
    }

    @Override // p000.l94
    public float getRotationZ() {
        return this.f142b.getRotationZ();
    }

    @Override // p000.l94
    public float getScaleX() {
        return this.f142b.getScaleX();
    }

    @Override // p000.l94
    public float getScaleY() {
        return this.f142b.getScaleY();
    }

    @Override // p000.l94
    public int getSpotShadowColor() {
        return this.f142b.getSpotShadowColor();
    }

    @Override // p000.l94
    public int getTop() {
        return this.f142b.getTop();
    }

    @Override // p000.l94
    public float getTranslationX() {
        return this.f142b.getTranslationX();
    }

    @Override // p000.l94
    public float getTranslationY() {
        return this.f142b.getTranslationY();
    }

    @Override // p000.l94
    public long getUniqueId() {
        return this.f142b.getUniqueId();
    }

    @Override // p000.l94
    public int getWidth() {
        return this.f142b.getWidth();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.f142b.hasOverlappingRendering();
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        return this.f142b.getUseCompositingLayer();
    }

    @Override // p000.l94
    public void offsetLeftAndRight(int i) {
        this.f142b.offsetLeftAndRight(i);
    }

    @Override // p000.l94
    public void offsetTopAndBottom(int i) {
        this.f142b.offsetTopAndBottom(i);
    }

    @Override // p000.l94
    public void record(@yfb pr1 pr1Var, @gib vic vicVar, @yfb qy6<? super vq1, bth> qy6Var) {
        RecordingCanvas recordingCanvasBeginRecording = this.f142b.beginRecording();
        Canvas internalCanvas = pr1Var.getAndroidCanvas().getInternalCanvas();
        pr1Var.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
        C4905dq androidCanvas = pr1Var.getAndroidCanvas();
        if (vicVar != null) {
            androidCanvas.save();
            vq1.m32779clipPathmtrdDE$default(androidCanvas, vicVar, 0, 2, null);
        }
        qy6Var.invoke(androidCanvas);
        if (vicVar != null) {
            androidCanvas.restore();
        }
        pr1Var.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.f142b.endRecording();
    }

    @Override // p000.l94
    public void setAlpha(float f) {
        this.f142b.setAlpha(f);
    }

    @Override // p000.l94
    public void setAmbientShadowColor(int i) {
        this.f142b.setAmbientShadowColor(i);
    }

    @Override // p000.l94
    public void setCameraDistance(float f) {
        this.f142b.setCameraDistance(f);
    }

    @Override // p000.l94
    public void setClipToBounds(boolean z) {
        this.f142b.setClipToBounds(z);
    }

    @Override // p000.l94
    public void setClipToOutline(boolean z) {
        this.f142b.setClipToOutline(z);
    }

    @Override // p000.l94
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public void mo27181setCompositingStrategyaDBOjCE(int i) {
        RenderNode renderNode = this.f142b;
        C0734a.a aVar = C0734a.f5300b;
        if (C0734a.m27582equalsimpl0(i, aVar.m27588getOffscreenNrFUSI())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (C0734a.m27582equalsimpl0(i, aVar.m27587getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f144d = i;
    }

    @Override // p000.l94
    public void setElevation(float f) {
        this.f142b.setElevation(f);
    }

    @Override // p000.l94
    public boolean setHasOverlappingRendering(boolean z) {
        return this.f142b.setHasOverlappingRendering(z);
    }

    @Override // p000.l94
    public void setOutline(@gib Outline outline) {
        this.f142b.setOutline(outline);
    }

    @Override // p000.l94
    public void setPivotX(float f) {
        this.f142b.setPivotX(f);
    }

    @Override // p000.l94
    public void setPivotY(float f) {
        this.f142b.setPivotY(f);
    }

    @Override // p000.l94
    public boolean setPosition(int i, int i2, int i3, int i4) {
        return this.f142b.setPosition(i, i2, i3, i4);
    }

    @Override // p000.l94
    public void setRenderEffect(@gib ozd ozdVar) {
        this.f143c = ozdVar;
        if (Build.VERSION.SDK_INT >= 31) {
            b1e.f12417a.setRenderEffect(this.f142b, ozdVar);
        }
    }

    @Override // p000.l94
    public void setRotationX(float f) {
        this.f142b.setRotationX(f);
    }

    @Override // p000.l94
    public void setRotationY(float f) {
        this.f142b.setRotationY(f);
    }

    @Override // p000.l94
    public void setRotationZ(float f) {
        this.f142b.setRotationZ(f);
    }

    @Override // p000.l94
    public void setScaleX(float f) {
        this.f142b.setScaleX(f);
    }

    @Override // p000.l94
    public void setScaleY(float f) {
        this.f142b.setScaleY(f);
    }

    @Override // p000.l94
    public void setSpotShadowColor(int i) {
        this.f142b.setSpotShadowColor(i);
    }

    @Override // p000.l94
    public void setTranslationX(float f) {
        this.f142b.setTranslationX(f);
    }

    @Override // p000.l94
    public void setTranslationY(float f) {
        this.f142b.setTranslationY(f);
    }
}
