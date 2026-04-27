package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,133:1\n78#2:134\n76#2:135\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n119#1:134\n120#1:135\n*E\n"})
public final class ow8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0701e.d nextDrawNode(v34 v34Var) {
        int iM30687constructorimpl = keb.m30687constructorimpl(4);
        int iM30687constructorimpl2 = keb.m30687constructorimpl(2);
        InterfaceC0701e.d child$ui_release = v34Var.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) == 0) {
            return null;
        }
        while (child$ui_release != null && (child$ui_release.getKindSet$ui_release() & iM30687constructorimpl2) == 0) {
            if ((child$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}
