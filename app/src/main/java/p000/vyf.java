package p000;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSplineBasedFloatDecayAnimationSpec.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n77#2:50\n1223#3,6:51\n*S KotlinDebug\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n*L\n44#1:50\n45#1:51,6\n*E\n"})
public final class vyf {

    /* JADX INFO: renamed from: a */
    public static final float f92747a = ViewConfiguration.getScrollFriction();

    public static final float getPlatformFlingScrollFriction() {
        return f92747a;
    }

    @yfb
    @hk2
    public static final <T> vk3<T> rememberSplineBasedDecay(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(904445851, i, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        c64 c64Var = (c64) zl2Var.consume(sn2.getLocalDensity());
        boolean zChanged = zl2Var.changed(c64Var.getDensity());
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = xk3.generateDecayAnimationSpec(new uyf(c64Var));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        vk3<T> vk3Var = (vk3) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return vk3Var;
    }
}
