package p000;

import androidx.compose.foundation.gestures.C0608g;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScrollingContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollingContainer.kt\nandroidx/compose/foundation/ScrollingContainerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,61:1\n77#2:62\n*S KotlinDebug\n*F\n+ 1 ScrollingContainer.kt\nandroidx/compose/foundation/ScrollingContainerKt\n*L\n49#1:62\n*E\n"})
public final class dse {
    @ah5
    @yfb
    @hk2
    public static final InterfaceC0701e scrollingContainer(@yfb InterfaceC0701e interfaceC0701e, @yfb ase aseVar, @yfb t7c t7cVar, boolean z, boolean z2, @gib s36 s36Var, @gib l5b l5bVar, @gib sd1 sd1Var, @gib zl2 zl2Var, int i, int i2) {
        sd1 sd1Var2 = (i2 & 64) != 0 ? null : sd1Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1677817431, i, -1, "androidx.compose.foundation.scrollingContainer (ScrollingContainer.kt:40)");
        }
        yre yreVar = yre.f102788a;
        w9c w9cVarOverscrollEffect = yreVar.overscrollEffect(zl2Var, 6);
        InterfaceC0701e interfaceC0701eScrollable = C0608g.scrollable(x9c.overscroll(y42.clipScrollableContainer(interfaceC0701e, t7cVar), w9cVarOverscrollEffect), aseVar, t7cVar, w9cVarOverscrollEffect, z, yreVar.reverseDirection((ov8) zl2Var.consume(sn2.getLocalLayoutDirection()), t7cVar, z2), s36Var, l5bVar, sd1Var2);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return interfaceC0701eScrollable;
    }
}
