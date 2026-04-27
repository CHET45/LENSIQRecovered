package p000;

import androidx.compose.animation.AbstractC0574g;
import androidx.compose.animation.AbstractC0575h;
import androidx.compose.animation.C0567a;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,899:1\n76#2:900\n109#2,2:901\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n201#1:900\n201#1:901,2\n*E\n"})
@e0g(parameters = 0)
public final class zw2 {

    /* JADX INFO: renamed from: e */
    public static final int f106176e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AbstractC0574g f106177a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final AbstractC0575h f106178b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final b5b f106179c;

    /* JADX INFO: renamed from: d */
    @gib
    public iqf f106180d;

    public zw2(@yfb AbstractC0574g abstractC0574g, @yfb AbstractC0575h abstractC0575h, float f, @gib iqf iqfVar) {
        this.f106177a = abstractC0574g;
        this.f106178b = abstractC0575h;
        this.f106179c = pbd.mutableFloatStateOf(f);
        this.f106180d = iqfVar;
    }

    @yfb
    public final AbstractC0575h getInitialContentExit() {
        return this.f106178b;
    }

    @gib
    public final iqf getSizeTransform() {
        return this.f106180d;
    }

    @yfb
    public final AbstractC0574g getTargetContentEnter() {
        return this.f106177a;
    }

    public final float getTargetContentZIndex() {
        return this.f106179c.getFloatValue();
    }

    public final void setSizeTransform$animation_release(@gib iqf iqfVar) {
        this.f106180d = iqfVar;
    }

    public final void setTargetContentZIndex(float f) {
        this.f106179c.setFloatValue(f);
    }

    public /* synthetic */ zw2(AbstractC0574g abstractC0574g, AbstractC0575h abstractC0575h, float f, iqf iqfVar, int i, jt3 jt3Var) {
        this(abstractC0574g, abstractC0575h, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? C0567a.SizeTransform$default(false, null, 3, null) : iqfVar);
    }
}
