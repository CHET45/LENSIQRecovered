package p000;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import p000.r0g;

/* JADX INFO: renamed from: fu */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,67:1\n38#2,5:68\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n53#1:68,5\n*E\n"})
public final class C5978fu {
    @yfb
    public static final ajc actualChainPathEffect(@yfb ajc ajcVar, @yfb ajc ajcVar2) {
        md8.checkNotNull(ajcVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        PathEffect nativePathEffect = ((C5468eu) ajcVar).getNativePathEffect();
        md8.checkNotNull(ajcVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new C5468eu(new ComposePathEffect(nativePathEffect, ((C5468eu) ajcVar2).getNativePathEffect()));
    }

    @yfb
    public static final ajc actualCornerPathEffect(float f) {
        return new C5468eu(new CornerPathEffect(f));
    }

    @yfb
    public static final ajc actualDashPathEffect(@yfb float[] fArr, float f) {
        return new C5468eu(new DashPathEffect(fArr, f));
    }

    @yfb
    /* JADX INFO: renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final ajc m29664actualStampedPathEffect7aD1DOk(@yfb vic vicVar, float f, float f2, int i) {
        if (vicVar instanceof C4947du) {
            return new C5468eu(new PathDashPathEffect(((C4947du) vicVar).getInternalPath(), f, f2, m29665toAndroidPathDashPathEffectStyleoQv6xUo(i)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @yfb
    public static final PathEffect asAndroidPathEffect(@yfb ajc ajcVar) {
        md8.checkNotNull(ajcVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((C5468eu) ajcVar).getNativePathEffect();
    }

    @yfb
    /* JADX INFO: renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final PathDashPathEffect.Style m29665toAndroidPathDashPathEffectStyleoQv6xUo(int i) {
        r0g.C11837a c11837a = r0g.f76724b;
        return r0g.m32064equalsimpl0(i, c11837a.m32068getMorphYpspkwk()) ? PathDashPathEffect.Style.MORPH : r0g.m32064equalsimpl0(i, c11837a.m32069getRotateYpspkwk()) ? PathDashPathEffect.Style.ROTATE : r0g.m32064equalsimpl0(i, c11837a.m32070getTranslateYpspkwk()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    @yfb
    public static final ajc toComposePathEffect(@yfb PathEffect pathEffect) {
        return new C5468eu(pathEffect);
    }
}
