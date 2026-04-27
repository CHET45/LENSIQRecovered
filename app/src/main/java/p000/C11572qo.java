package p000;

/* JADX INFO: renamed from: qo */
/* JADX INFO: loaded from: classes.dex */
public final class C11572qo {
    @yfb
    @hk2
    @q64(message = "Replace with rememberSplineBasedDecay<Float>")
    public static final vk3<Float> defaultDecayAnimationSpec(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1468328074, i, -1, "androidx.compose.animation.defaultDecayAnimationSpec (AndroidActualDefaultDecayAnimationSpec.android.kt:23)");
        }
        vk3<Float> vk3VarRememberSplineBasedDecay = vyf.rememberSplineBasedDecay(zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return vk3VarRememberSplineBasedDecay;
    }
}
