package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;

/* JADX INFO: loaded from: classes.dex */
public interface l94 {
    void discardDisplayList();

    void drawInto(@yfb Canvas canvas);

    @yfb
    m94 dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI */
    int mo27180getCompositingStrategyNrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(@yfb Matrix matrix);

    int getLeft();

    void getMatrix(@yfb Matrix matrix);

    float getPivotX();

    float getPivotY();

    @gib
    ozd getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i);

    void offsetTopAndBottom(int i);

    void record(@yfb pr1 pr1Var, @gib vic vicVar, @yfb qy6<? super vq1, bth> qy6Var);

    void setAlpha(float f);

    void setAmbientShadowColor(int i);

    void setCameraDistance(float f);

    void setClipToBounds(boolean z);

    void setClipToOutline(boolean z);

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    void mo27181setCompositingStrategyaDBOjCE(int i);

    void setElevation(float f);

    boolean setHasOverlappingRendering(boolean z);

    void setOutline(@gib Outline outline);

    void setPivotX(float f);

    void setPivotY(float f);

    boolean setPosition(int i, int i2, int i3, int i4);

    void setRenderEffect(@gib ozd ozdVar);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setSpotShadowColor(int i);

    void setTranslationX(float f);

    void setTranslationY(float f);
}
