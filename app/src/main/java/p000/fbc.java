package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPagerBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n1223#2,6:53\n*S KotlinDebug\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n*L\n27#1:53,6\n*E\n"})
public final class fbc {
    @yfb
    @hk2
    public static final oz8 rememberPagerBeyondBoundsState(@yfb dcc dccVar, int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(373558254, i2, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && zl2Var.changed(dccVar)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && zl2Var.changed(i)) || (i2 & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new gbc(dccVar, i);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        gbc gbcVar = (gbc) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return gbcVar;
    }
}
