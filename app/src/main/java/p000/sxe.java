package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,107:1\n80#2:108\n80#2:109\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n102#1:108\n105#1:109\n*E\n"})
public final class sxe {
    public static final boolean getUseMinimumTouchTarget(@yfb nxe nxeVar) {
        return oxe.getOrNull(nxeVar, mxe.f62738a.getOnClick()) != null;
    }

    public static final void invalidateSemantics(@yfb rxe rxeVar) {
        w34.requireLayoutNode(rxeVar).invalidateSemantics$ui_release();
    }

    @yfb
    public static final rud touchBoundsInRoot(@yfb InterfaceC0701e.d dVar, boolean z) {
        return !dVar.getNode().isAttached() ? rud.f79687e.getZero() : !z ? nv8.boundsInRoot(w34.m32852requireCoordinator64DMado(dVar, keb.m30687constructorimpl(8))) : w34.m32852requireCoordinator64DMado(dVar, keb.m30687constructorimpl(8)).touchBoundsInRoot();
    }
}
