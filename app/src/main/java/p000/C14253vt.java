package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: vt */
/* JADX INFO: loaded from: classes.dex */
public final class C14253vt implements icc {

    /* JADX INFO: renamed from: a */
    @yfb
    public Paint f92192a;

    /* JADX INFO: renamed from: b */
    public int f92193b;

    /* JADX INFO: renamed from: c */
    @gib
    public Shader f92194c;

    /* JADX INFO: renamed from: d */
    @gib
    public b92 f92195d;

    /* JADX INFO: renamed from: e */
    @gib
    public ajc f92196e;

    public C14253vt(@yfb Paint paint) {
        this.f92192a = paint;
        this.f92193b = q51.f73234b.m31928getSrcOver0nO6VwU();
    }

    @Override // p000.icc
    @yfb
    public Paint asFrameworkPaint() {
        return this.f92192a;
    }

    @Override // p000.icc
    public float getAlpha() {
        return C14793wt.getNativeAlpha(this.f92192a);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo30192getBlendMode0nO6VwU() {
        return this.f92193b;
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public long mo30193getColor0d7_KjU() {
        return C14793wt.getNativeColor(this.f92192a);
    }

    @Override // p000.icc
    @gib
    public b92 getColorFilter() {
        return this.f92195d;
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I */
    public int mo30194getFilterQualityfv9h1I() {
        return C14793wt.getNativeFilterQuality(this.f92192a);
    }

    @Override // p000.icc
    @gib
    public ajc getPathEffect() {
        return this.f92196e;
    }

    @Override // p000.icc
    @gib
    public Shader getShader() {
        return this.f92194c;
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: getStrokeCap-KaPHkGw */
    public int mo30195getStrokeCapKaPHkGw() {
        return C14793wt.getNativeStrokeCap(this.f92192a);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: getStrokeJoin-LxFBmk8 */
    public int mo30196getStrokeJoinLxFBmk8() {
        return C14793wt.getNativeStrokeJoin(this.f92192a);
    }

    @Override // p000.icc
    public float getStrokeMiterLimit() {
        return C14793wt.getNativeStrokeMiterLimit(this.f92192a);
    }

    @Override // p000.icc
    public float getStrokeWidth() {
        return C14793wt.getNativeStrokeWidth(this.f92192a);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: getStyle-TiuSbCo */
    public int mo30197getStyleTiuSbCo() {
        return C14793wt.getNativeStyle(this.f92192a);
    }

    @Override // p000.icc
    public boolean isAntiAlias() {
        return C14793wt.getNativeAntiAlias(this.f92192a);
    }

    @Override // p000.icc
    public void setAlpha(float f) {
        C14793wt.setNativeAlpha(this.f92192a, f);
    }

    @Override // p000.icc
    public void setAntiAlias(boolean z) {
        C14793wt.setNativeAntiAlias(this.f92192a, z);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo30198setBlendModes9anfk8(int i) {
        if (q51.m31897equalsimpl0(this.f92193b, i)) {
            return;
        }
        this.f92193b = i;
        C14793wt.m33114setNativeBlendModeGB0RdKg(this.f92192a, i);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: setColor-8_81llA */
    public void mo30199setColor8_81llA(long j) {
        C14793wt.m33115setNativeColor4WTKRHQ(this.f92192a, j);
    }

    @Override // p000.icc
    public void setColorFilter(@gib b92 b92Var) {
        this.f92195d = b92Var;
        C14793wt.setNativeColorFilter(this.f92192a, b92Var);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo */
    public void mo30200setFilterQualityvDHp3xo(int i) {
        C14793wt.m33116setNativeFilterQuality50PEsBU(this.f92192a, i);
    }

    @Override // p000.icc
    public void setPathEffect(@gib ajc ajcVar) {
        C14793wt.setNativePathEffect(this.f92192a, ajcVar);
        this.f92196e = ajcVar;
    }

    @Override // p000.icc
    public void setShader(@gib Shader shader) {
        this.f92194c = shader;
        C14793wt.setNativeShader(this.f92192a, shader);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: setStrokeCap-BeK7IIE */
    public void mo30201setStrokeCapBeK7IIE(int i) {
        C14793wt.m33117setNativeStrokeCapCSYIeUk(this.f92192a, i);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: setStrokeJoin-Ww9F2mQ */
    public void mo30202setStrokeJoinWw9F2mQ(int i) {
        C14793wt.m33118setNativeStrokeJoinkLtJ_vA(this.f92192a, i);
    }

    @Override // p000.icc
    public void setStrokeMiterLimit(float f) {
        C14793wt.setNativeStrokeMiterLimit(this.f92192a, f);
    }

    @Override // p000.icc
    public void setStrokeWidth(float f) {
        C14793wt.setNativeStrokeWidth(this.f92192a, f);
    }

    @Override // p000.icc
    /* JADX INFO: renamed from: setStyle-k9PVt8s */
    public void mo30203setStylek9PVt8s(int i) {
        C14793wt.m33119setNativeStyle5YerkU(this.f92192a, i);
    }

    public C14253vt() {
        this(C14793wt.makeNativePaint());
    }
}
