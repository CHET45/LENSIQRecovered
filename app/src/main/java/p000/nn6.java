package p000;

import androidx.compose.p002ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
public final class nn6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final pn6 getFocusTransactionManager(FocusTargetNode focusTargetNode) {
        lw8 layoutNode;
        z9c owner$ui_release;
        zm6 focusOwner;
        heb coordinator$ui_release = focusTargetNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release == null || (layoutNode = coordinator$ui_release.getLayoutNode()) == null || (owner$ui_release = layoutNode.getOwner$ui_release()) == null || (focusOwner = owner$ui_release.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void invalidateFocusTarget(@yfb FocusTargetNode focusTargetNode) {
        w34.requireOwner(focusTargetNode).getFocusOwner().scheduleInvalidation(focusTargetNode);
    }

    @yfb
    public static final pn6 requireTransactionManager(@yfb FocusTargetNode focusTargetNode) {
        return w34.requireOwner(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
