package p000;

import androidx.mediarouter.media.C1340j;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,246:1\n1223#2,6:247\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:247,6\n*E\n"})
public final class jw0 {
    @f0g
    @ah5
    @yfb
    public static final kw0 BasicTooltipState(boolean z, boolean z2, @yfb x7b x7bVar) {
        return new lw0(z, z2, x7bVar);
    }

    public static /* synthetic */ kw0 BasicTooltipState$default(boolean z, boolean z2, x7b x7bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            x7bVar = iw0.f48640a.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z, z2, x7bVar);
    }

    @ah5
    @yfb
    @hk2
    public static final kw0 rememberBasicTooltipState(boolean z, boolean z2, @gib x7b x7bVar, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            x7bVar = iw0.f48640a.getGlobalMutatorMutex();
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1123859613, i, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:82)");
        }
        boolean z3 = ((((i & 112) ^ 48) > 32 && zl2Var.changed(z2)) || (i & 48) == 32) | ((((i & C1340j.f10444b) ^ 384) > 256 && zl2Var.changed(x7bVar)) || (i & 384) == 256);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z3 || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new lw0(z, z2, x7bVar);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        lw0 lw0Var = (lw0) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return lw0Var;
    }
}
