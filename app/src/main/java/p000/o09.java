package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,54:1\n1223#2,6:55\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n28#1:55,6\n*E\n"})
public final class o09 {
    @yfb
    @hk2
    public static final oz8 rememberLazyListBeyondBoundsState(@yfb m19 m19Var, int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1877443446, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && zl2Var.changed(m19Var)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && zl2Var.changed(i)) || (i2 & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new p09(m19Var, i);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        p09 p09Var = (p09) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return p09Var;
    }
}
