package p000;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,875:1\n1#2:876\n*E\n"})
public final class yv4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f103097a;

    /* JADX INFO: renamed from: b */
    public final int f103098b;

    /* JADX INFO: renamed from: c */
    public long f103099c = r78.f77324b.m32092getZeroYbymL2g();

    /* JADX INFO: renamed from: d */
    @gib
    public EdgeEffect f103100d;

    /* JADX INFO: renamed from: e */
    @gib
    public EdgeEffect f103101e;

    /* JADX INFO: renamed from: f */
    @gib
    public EdgeEffect f103102f;

    /* JADX INFO: renamed from: g */
    @gib
    public EdgeEffect f103103g;

    /* JADX INFO: renamed from: h */
    @gib
    public EdgeEffect f103104h;

    /* JADX INFO: renamed from: i */
    @gib
    public EdgeEffect f103105i;

    /* JADX INFO: renamed from: j */
    @gib
    public EdgeEffect f103106j;

    /* JADX INFO: renamed from: k */
    @gib
    public EdgeEffect f103107k;

    public yv4(@yfb Context context, @g92 int i) {
        this.f103097a = context;
        this.f103098b = i;
    }

    private final EdgeEffect createEdgeEffect() {
        EdgeEffect edgeEffectCreate = xv4.f99437a.create(this.f103097a);
        edgeEffectCreate.setColor(this.f103098b);
        if (!r78.m32085equalsimpl0(this.f103099c, r78.f77324b.m32092getZeroYbymL2g())) {
            edgeEffectCreate.setSize(r78.m32087getWidthimpl(this.f103099c), r78.m32086getHeightimpl(this.f103099c));
        }
        return edgeEffectCreate;
    }

    private final boolean isAnimating(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean isStretched(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(xv4.f99437a.getDistanceCompat(edgeEffect) == 0.0f);
    }

    public final void forEachEffect(@yfb qy6<? super EdgeEffect, bth> qy6Var) {
        EdgeEffect edgeEffect = this.f103100d;
        if (edgeEffect != null) {
            qy6Var.invoke(edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.f103101e;
        if (edgeEffect2 != null) {
            qy6Var.invoke(edgeEffect2);
        }
        EdgeEffect edgeEffect3 = this.f103102f;
        if (edgeEffect3 != null) {
            qy6Var.invoke(edgeEffect3);
        }
        EdgeEffect edgeEffect4 = this.f103103g;
        if (edgeEffect4 != null) {
            qy6Var.invoke(edgeEffect4);
        }
    }

    @yfb
    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect edgeEffect = this.f103101e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.f103101e = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @yfb
    public final EdgeEffect getOrCreateBottomEffectNegation() {
        EdgeEffect edgeEffect = this.f103105i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.f103105i = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @yfb
    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect edgeEffect = this.f103102f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.f103102f = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @yfb
    public final EdgeEffect getOrCreateLeftEffectNegation() {
        EdgeEffect edgeEffect = this.f103106j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.f103106j = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @yfb
    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect edgeEffect = this.f103103g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.f103103g = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @yfb
    public final EdgeEffect getOrCreateRightEffectNegation() {
        EdgeEffect edgeEffect = this.f103107k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.f103107k = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @yfb
    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect edgeEffect = this.f103100d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.f103100d = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    @yfb
    public final EdgeEffect getOrCreateTopEffectNegation() {
        EdgeEffect edgeEffect = this.f103104h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = createEdgeEffect();
        this.f103104h = edgeEffectCreateEdgeEffect;
        return edgeEffectCreateEdgeEffect;
    }

    public final boolean isBottomAnimating() {
        return isAnimating(this.f103101e);
    }

    public final boolean isBottomNegationStretched() {
        return isStretched(this.f103105i);
    }

    public final boolean isBottomStretched() {
        return isStretched(this.f103101e);
    }

    public final boolean isLeftAnimating() {
        return isAnimating(this.f103102f);
    }

    public final boolean isLeftNegationStretched() {
        return isStretched(this.f103106j);
    }

    public final boolean isLeftStretched() {
        return isStretched(this.f103102f);
    }

    public final boolean isRightAnimating() {
        return isAnimating(this.f103103g);
    }

    public final boolean isRightNegationStretched() {
        return isStretched(this.f103107k);
    }

    public final boolean isRightStretched() {
        return isStretched(this.f103103g);
    }

    public final boolean isTopAnimating() {
        return isAnimating(this.f103100d);
    }

    public final boolean isTopNegationStretched() {
        return isStretched(this.f103104h);
    }

    public final boolean isTopStretched() {
        return isStretched(this.f103100d);
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI, reason: not valid java name */
    public final void m33414setSizeozmzZPI(long j) {
        this.f103099c = j;
        EdgeEffect edgeEffect = this.f103100d;
        if (edgeEffect != null) {
            edgeEffect.setSize(r78.m32087getWidthimpl(j), r78.m32086getHeightimpl(j));
        }
        EdgeEffect edgeEffect2 = this.f103101e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(r78.m32087getWidthimpl(j), r78.m32086getHeightimpl(j));
        }
        EdgeEffect edgeEffect3 = this.f103102f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(r78.m32086getHeightimpl(j), r78.m32087getWidthimpl(j));
        }
        EdgeEffect edgeEffect4 = this.f103103g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(r78.m32086getHeightimpl(j), r78.m32087getWidthimpl(j));
        }
        EdgeEffect edgeEffect5 = this.f103104h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(r78.m32087getWidthimpl(j), r78.m32086getHeightimpl(j));
        }
        EdgeEffect edgeEffect6 = this.f103105i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(r78.m32087getWidthimpl(j), r78.m32086getHeightimpl(j));
        }
        EdgeEffect edgeEffect7 = this.f103106j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(r78.m32086getHeightimpl(j), r78.m32087getWidthimpl(j));
        }
        EdgeEffect edgeEffect8 = this.f103107k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(r78.m32086getHeightimpl(j), r78.m32087getWidthimpl(j));
        }
    }
}
