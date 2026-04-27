package p000;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
public final class uzd {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final uzd f89595a = new uzd();

    private uzd() {
    }

    @yfb
    @ih4
    /* JADX INFO: renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final RenderEffect m32674createBlurEffect8A3gB4(@gib ozd ozdVar, float f, float f2, int i) {
        return ozdVar == null ? RenderEffect.createBlurEffect(f, f2, C12798sv.m32336toAndroidTileMode0vamqd0(i)) : RenderEffect.createBlurEffect(f, f2, ozdVar.asAndroidRenderEffect(), C12798sv.m32336toAndroidTileMode0vamqd0(i));
    }

    @yfb
    @ih4
    /* JADX INFO: renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final RenderEffect m32675createOffsetEffectUv8p0NA(@gib ozd ozdVar, long j) {
        return ozdVar == null ? RenderEffect.createOffsetEffect(izb.m30429getXimpl(j), izb.m30430getYimpl(j)) : RenderEffect.createOffsetEffect(izb.m30429getXimpl(j), izb.m30430getYimpl(j), ozdVar.asAndroidRenderEffect());
    }
}
