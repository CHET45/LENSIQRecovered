package p000;

/* JADX INFO: loaded from: classes.dex */
public final class om9 {
    @yfb
    public static final lm9 getRootLookaheadDelegate(@yfb lm9 lm9Var) {
        lw8 layoutNode = lm9Var.getLayoutNode();
        while (true) {
            lw8 parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) == null) {
                lm9 lookaheadDelegate = layoutNode.getOuterCoordinator$ui_release().getLookaheadDelegate();
                md8.checkNotNull(lookaheadDelegate);
                return lookaheadDelegate;
            }
            lw8 parent$ui_release2 = layoutNode.getParent$ui_release();
            lw8 lookaheadRoot$ui_release = parent$ui_release2 != null ? parent$ui_release2.getLookaheadRoot$ui_release() : null;
            md8.checkNotNull(lookaheadRoot$ui_release);
            if (lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
                layoutNode = layoutNode.getParent$ui_release();
                md8.checkNotNull(layoutNode);
            } else {
                lw8 parent$ui_release3 = layoutNode.getParent$ui_release();
                md8.checkNotNull(parent$ui_release3);
                layoutNode = parent$ui_release3.getLookaheadRoot$ui_release();
                md8.checkNotNull(layoutNode);
            }
        }
    }
}
