package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,979:1\n1223#2,6:980\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n573#1:980,6\n*E\n"})
@e0g(parameters = 1)
public final class yre {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final yre f102788a = new yre();

    /* JADX INFO: renamed from: b */
    public static final int f102789b = 0;

    private yre() {
    }

    @ah5
    @yfb
    @q64(message = "This has been replaced by composition locals LocalBringIntoViewSpec", replaceWith = @i2e(expression = "LocalBringIntoView.current", imports = {"androidx.compose.foundation.gestures.LocalBringIntoViewSpec"}))
    public final sd1 bringIntoViewSpec() {
        return sd1.f81248a.getDefaultBringIntoViewSpec$foundation_release();
    }

    @yfb
    @hk2
    public final s36 flingBehavior(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        vk3 vk3VarRememberSplineBasedDecay = vyf.rememberSplineBasedDecay(zl2Var, 0);
        boolean zChanged = zl2Var.changed(vk3VarRememberSplineBasedDecay);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new fv3(vk3VarRememberSplineBasedDecay, null, 2, 0 == true ? 1 : 0);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        fv3 fv3Var = (fv3) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return fv3Var;
    }

    @ah5
    @yfb
    @hk2
    public final w9c overscrollEffect(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        w9c w9cVarRememberOverscrollEffect = C13696ut.rememberOverscrollEffect(zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return w9cVarRememberOverscrollEffect;
    }

    public final boolean reverseDirection(@yfb ov8 ov8Var, @yfb t7c t7cVar, boolean z) {
        return (ov8Var != ov8.Rtl || t7cVar == t7c.Vertical) ? !z : z;
    }
}
