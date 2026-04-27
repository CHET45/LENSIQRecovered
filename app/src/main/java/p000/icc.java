package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public interface icc {
    @yfb
    Paint asFrameworkPaint();

    float getAlpha();

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo30192getBlendMode0nO6VwU();

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    long mo30193getColor0d7_KjU();

    @gib
    b92 getColorFilter();

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    int mo30194getFilterQualityfv9h1I();

    @gib
    ajc getPathEffect();

    @gib
    Shader getShader();

    /* JADX INFO: renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    int mo30195getStrokeCapKaPHkGw();

    /* JADX INFO: renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    int mo30196getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* JADX INFO: renamed from: getStyle-TiuSbCo, reason: not valid java name */
    int mo30197getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f);

    void setAntiAlias(boolean z);

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo30198setBlendModes9anfk8(int i);

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    void mo30199setColor8_81llA(long j);

    void setColorFilter(@gib b92 b92Var);

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    void mo30200setFilterQualityvDHp3xo(int i);

    void setPathEffect(@gib ajc ajcVar);

    void setShader(@gib Shader shader);

    /* JADX INFO: renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    void mo30201setStrokeCapBeK7IIE(int i);

    /* JADX INFO: renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    void mo30202setStrokeJoinWw9F2mQ(int i);

    void setStrokeMiterLimit(float f);

    void setStrokeWidth(float f);

    /* JADX INFO: renamed from: setStyle-k9PVt8s, reason: not valid java name */
    void mo30203setStylek9PVt8s(int i);
}
