package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n1223#2,6:50\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n*L\n27#1:50,6\n*E\n"})
public final class v19 {
    @yfb
    @hk2
    public static final oz8 rememberLazyStaggeredGridBeyondBoundsState(@yfb z29 z29Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-363070453, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridBeyondBoundsState (LazyStaggeredGridBeyondBoundsModifier.kt:25)");
        }
        boolean zChanged = zl2Var.changed(z29Var);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new w19(z29Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        w19 w19Var = (w19) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return w19Var;
    }
}
