package p000;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDelegatableNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,34:1\n42#2,7:35\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n*L\n29#1:35,7\n*E\n"})
public final class x34 {
    @yfb
    public static final View requireView(@yfb v34 v34Var) {
        if (!v34Var.getNode().isAttached()) {
            g28.throwIllegalStateException("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objRequireOwner = pw8.requireOwner(w34.requireLayoutNode(v34Var));
        md8.checkNotNull(objRequireOwner, "null cannot be cast to non-null type android.view.View");
        return (View) objRequireOwner;
    }
}
