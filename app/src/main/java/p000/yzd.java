package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.p002ui.graphics.C0734a;
import androidx.compose.p002ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
@c5e(23)
@dwf({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
@e0g(parameters = 0)
public final class yzd implements l94 {

    /* JADX INFO: renamed from: l */
    public static boolean f103542l;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AndroidComposeView f103544a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final RenderNode f103545b;

    /* JADX INFO: renamed from: c */
    public int f103546c;

    /* JADX INFO: renamed from: d */
    public int f103547d;

    /* JADX INFO: renamed from: e */
    public int f103548e;

    /* JADX INFO: renamed from: f */
    public int f103549f;

    /* JADX INFO: renamed from: g */
    public int f103550g;

    /* JADX INFO: renamed from: h */
    @gib
    public ozd f103551h;

    /* JADX INFO: renamed from: i */
    public boolean f103552i;

    /* JADX INFO: renamed from: j */
    @yfb
    public static final C15903a f103540j = new C15903a(null);

    /* JADX INFO: renamed from: k */
    public static final int f103541k = 8;

    /* JADX INFO: renamed from: m */
    public static boolean f103543m = true;

    /* JADX INFO: renamed from: yzd$a */
    public static final class C15903a {
        public /* synthetic */ C15903a(jt3 jt3Var) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return yzd.f103542l;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z) {
            yzd.f103542l = z;
        }

        private C15903a() {
        }
    }

    public yzd(@yfb AndroidComposeView androidComposeView) {
        this.f103544a = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f103545b = renderNodeCreate;
        this.f103546c = C0734a.f5300b.m27586getAutoNrFUSI();
        if (f103543m) {
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
            discardDisplayListInternal();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f103543m = false;
        }
        if (f103542l) {
            throw new NoClassDefFoundError();
        }
    }

    private final void discardDisplayListInternal() {
        g1e.f38273a.discardDisplayList(this.f103545b);
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            i1e i1eVar = i1e.f45435a;
            i1eVar.setAmbientShadowColor(renderNode, i1eVar.getAmbientShadowColor(renderNode));
            i1eVar.setSpotShadowColor(renderNode, i1eVar.getSpotShadowColor(renderNode));
        }
    }

    @Override // p000.l94
    public void discardDisplayList() {
        discardDisplayListInternal();
    }

    @Override // p000.l94
    public void drawInto(@yfb Canvas canvas) {
        md8.checkNotNull(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f103545b);
    }

    @Override // p000.l94
    @yfb
    public m94 dumpRenderNodeData() {
        return new m94(0L, 0, 0, 0, 0, 0, 0, this.f103545b.getScaleX(), this.f103545b.getScaleY(), this.f103545b.getTranslationX(), this.f103545b.getTranslationY(), this.f103545b.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.f103545b.getRotation(), this.f103545b.getRotationX(), this.f103545b.getRotationY(), this.f103545b.getCameraDistance(), this.f103545b.getPivotX(), this.f103545b.getPivotY(), this.f103545b.getClipToOutline(), getClipToBounds(), this.f103545b.getAlpha(), getRenderEffect(), this.f103546c, null);
    }

    @Override // p000.l94
    public float getAlpha() {
        return this.f103545b.getAlpha();
    }

    @Override // p000.l94
    public int getAmbientShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return i1e.f45435a.getAmbientShadowColor(this.f103545b);
        }
        return -16777216;
    }

    @Override // p000.l94
    public int getBottom() {
        return this.f103550g;
    }

    @Override // p000.l94
    public float getCameraDistance() {
        return -this.f103545b.getCameraDistance();
    }

    @Override // p000.l94
    public boolean getClipToBounds() {
        return this.f103552i;
    }

    @Override // p000.l94
    public boolean getClipToOutline() {
        return this.f103545b.getClipToOutline();
    }

    @Override // p000.l94
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI */
    public int mo27180getCompositingStrategyNrFUSI() {
        return this.f103546c;
    }

    @Override // p000.l94
    public float getElevation() {
        return this.f103545b.getElevation();
    }

    @Override // p000.l94
    public boolean getHasDisplayList() {
        return this.f103545b.isValid();
    }

    @Override // p000.l94
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // p000.l94
    public void getInverseMatrix(@yfb Matrix matrix) {
        this.f103545b.getInverseMatrix(matrix);
    }

    public final int getLayerType$ui_release() {
        return C0734a.m27582equalsimpl0(this.f103546c, C0734a.f5300b.m27588getOffscreenNrFUSI()) ? 2 : 0;
    }

    @Override // p000.l94
    public int getLeft() {
        return this.f103547d;
    }

    @Override // p000.l94
    public void getMatrix(@yfb Matrix matrix) {
        this.f103545b.getMatrix(matrix);
    }

    @yfb
    public final AndroidComposeView getOwnerView() {
        return this.f103544a;
    }

    @Override // p000.l94
    public float getPivotX() {
        return this.f103545b.getPivotX();
    }

    @Override // p000.l94
    public float getPivotY() {
        return this.f103545b.getPivotY();
    }

    @Override // p000.l94
    @gib
    public ozd getRenderEffect() {
        return this.f103551h;
    }

    @Override // p000.l94
    public int getRight() {
        return this.f103549f;
    }

    @Override // p000.l94
    public float getRotationX() {
        return this.f103545b.getRotationX();
    }

    @Override // p000.l94
    public float getRotationY() {
        return this.f103545b.getRotationY();
    }

    @Override // p000.l94
    public float getRotationZ() {
        return this.f103545b.getRotation();
    }

    @Override // p000.l94
    public float getScaleX() {
        return this.f103545b.getScaleX();
    }

    @Override // p000.l94
    public float getScaleY() {
        return this.f103545b.getScaleY();
    }

    @Override // p000.l94
    public int getSpotShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return i1e.f45435a.getSpotShadowColor(this.f103545b);
        }
        return -16777216;
    }

    @Override // p000.l94
    public int getTop() {
        return this.f103548e;
    }

    @Override // p000.l94
    public float getTranslationX() {
        return this.f103545b.getTranslationX();
    }

    @Override // p000.l94
    public float getTranslationY() {
        return this.f103545b.getTranslationY();
    }

    @Override // p000.l94
    public long getUniqueId() {
        return 0L;
    }

    @Override // p000.l94
    public int getWidth() {
        return getRight() - getLeft();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.f103545b.hasOverlappingRendering();
    }

    @Override // p000.l94
    public void offsetLeftAndRight(int i) {
        setLeft(getLeft() + i);
        setRight(getRight() + i);
        this.f103545b.offsetLeftAndRight(i);
    }

    @Override // p000.l94
    public void offsetTopAndBottom(int i) {
        setTop(getTop() + i);
        setBottom(getBottom() + i);
        this.f103545b.offsetTopAndBottom(i);
    }

    @Override // p000.l94
    public void record(@yfb pr1 pr1Var, @gib vic vicVar, @yfb qy6<? super vq1, bth> qy6Var) {
        DisplayListCanvas displayListCanvasStart = this.f103545b.start(getWidth(), getHeight());
        Canvas internalCanvas = pr1Var.getAndroidCanvas().getInternalCanvas();
        pr1Var.getAndroidCanvas().setInternalCanvas((Canvas) displayListCanvasStart);
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
        this.f103545b.end(displayListCanvasStart);
    }

    @Override // p000.l94
    public void setAlpha(float f) {
        this.f103545b.setAlpha(f);
    }

    @Override // p000.l94
    public void setAmbientShadowColor(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            i1e.f45435a.setAmbientShadowColor(this.f103545b, i);
        }
    }

    public void setBottom(int i) {
        this.f103550g = i;
    }

    @Override // p000.l94
    public void setCameraDistance(float f) {
        this.f103545b.setCameraDistance(-f);
    }

    @Override // p000.l94
    public void setClipToBounds(boolean z) {
        this.f103552i = z;
        this.f103545b.setClipToBounds(z);
    }

    @Override // p000.l94
    public void setClipToOutline(boolean z) {
        this.f103545b.setClipToOutline(z);
    }

    @Override // p000.l94
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    public void mo27181setCompositingStrategyaDBOjCE(int i) {
        C0734a.a aVar = C0734a.f5300b;
        if (C0734a.m27582equalsimpl0(i, aVar.m27588getOffscreenNrFUSI())) {
            this.f103545b.setLayerType(2);
            this.f103545b.setHasOverlappingRendering(true);
        } else if (C0734a.m27582equalsimpl0(i, aVar.m27587getModulateAlphaNrFUSI())) {
            this.f103545b.setLayerType(0);
            this.f103545b.setHasOverlappingRendering(false);
        } else {
            this.f103545b.setLayerType(0);
            this.f103545b.setHasOverlappingRendering(true);
        }
        this.f103546c = i;
    }

    @Override // p000.l94
    public void setElevation(float f) {
        this.f103545b.setElevation(f);
    }

    @Override // p000.l94
    public boolean setHasOverlappingRendering(boolean z) {
        return this.f103545b.setHasOverlappingRendering(z);
    }

    public void setLeft(int i) {
        this.f103547d = i;
    }

    @Override // p000.l94
    public void setOutline(@gib Outline outline) {
        this.f103545b.setOutline(outline);
    }

    @Override // p000.l94
    public void setPivotX(float f) {
        this.f103545b.setPivotX(f);
    }

    @Override // p000.l94
    public void setPivotY(float f) {
        this.f103545b.setPivotY(f);
    }

    @Override // p000.l94
    public boolean setPosition(int i, int i2, int i3, int i4) {
        setLeft(i);
        setTop(i2);
        setRight(i3);
        setBottom(i4);
        return this.f103545b.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.l94
    public void setRenderEffect(@gib ozd ozdVar) {
        this.f103551h = ozdVar;
    }

    public void setRight(int i) {
        this.f103549f = i;
    }

    @Override // p000.l94
    public void setRotationX(float f) {
        this.f103545b.setRotationX(f);
    }

    @Override // p000.l94
    public void setRotationY(float f) {
        this.f103545b.setRotationY(f);
    }

    @Override // p000.l94
    public void setRotationZ(float f) {
        this.f103545b.setRotation(f);
    }

    @Override // p000.l94
    public void setScaleX(float f) {
        this.f103545b.setScaleX(f);
    }

    @Override // p000.l94
    public void setScaleY(float f) {
        this.f103545b.setScaleY(f);
    }

    @Override // p000.l94
    public void setSpotShadowColor(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            i1e.f45435a.setSpotShadowColor(this.f103545b, i);
        }
    }

    public void setTop(int i) {
        this.f103548e = i;
    }

    @Override // p000.l94
    public void setTranslationX(float f) {
        this.f103545b.setTranslationX(f);
    }

    @Override // p000.l94
    public void setTranslationY(float f) {
        this.f103545b.setTranslationY(f);
    }
}
