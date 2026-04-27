package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,32:1\n1223#2,6:33\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:33,6\n*E\n"})
public final class k19 {
    @yfb
    @hk2
    public static final j09 rememberLazyListSemanticState(@yfb m19 m19Var, boolean z, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(596174919, i, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && zl2Var.changed(m19Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && zl2Var.changed(z)) || (i & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = l09.LazyLayoutSemanticState(m19Var, z);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        j09 j09Var = (j09) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return j09Var;
    }
}
