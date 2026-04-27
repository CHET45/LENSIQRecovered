package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,47:1\n1223#2,6:48\n*S KotlinDebug\n*F\n+ 1 LazyGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt\n*L\n25#1:48,6\n*E\n"})
public final class sx8 {
    @yfb
    @hk2
    public static final oz8 rememberLazyGridBeyondBoundsState(@yfb az8 az8Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(2004349821, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:23)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && zl2Var.changed(az8Var)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new tx8(az8Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        tx8 tx8Var = (tx8) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return tx8Var;
    }
}
