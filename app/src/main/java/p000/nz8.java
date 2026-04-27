package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.mediarouter.media.C1340j;
import androidx.profileinstaller.C1360d;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyLayoutBeyondBoundsModifierLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsModifierLocal.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n1223#2,6:177\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsModifierLocal.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt\n*L\n55#1:177,6\n*E\n"})
public final class nz8 {
    @yfb
    @hk2
    public static final InterfaceC0701e lazyLayoutBeyondBoundsModifier(@yfb InterfaceC0701e interfaceC0701e, @yfb oz8 oz8Var, @yfb lz8 lz8Var, boolean z, @yfb ov8 ov8Var, @yfb t7c t7cVar, boolean z2, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1331498025, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z2) {
            zl2Var.startReplaceGroup(-1890632411);
            boolean z3 = ((((i & 112) ^ 48) > 32 && zl2Var.changed(oz8Var)) || (i & 48) == 32) | ((((i & C1340j.f10444b) ^ 384) > 256 && zl2Var.changed(lz8Var)) || (i & 384) == 256) | ((((i & 7168) ^ kw1.f55470l) > 2048 && zl2Var.changed(z)) || (i & kw1.f55470l) == 2048) | ((((57344 & i) ^ CpioConstants.C_ISBLK) > 16384 && zl2Var.changed(ov8Var)) || (i & CpioConstants.C_ISBLK) == 16384) | ((((458752 & i) ^ C1360d.c.f10660k) > 131072 && zl2Var.changed(t7cVar)) || (i & C1360d.c.f10660k) == 131072);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (z3 || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new mz8(oz8Var, lz8Var, z, ov8Var, t7cVar);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            interfaceC0701e = interfaceC0701e.then((mz8) objRememberedValue);
            zl2Var.endReplaceGroup();
        } else {
            zl2Var.startReplaceGroup(-1890658823);
            zl2Var.endReplaceGroup();
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return interfaceC0701e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void unsupportedDirection() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
