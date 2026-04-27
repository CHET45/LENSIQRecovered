package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1962:1\n205#2:1963\n476#3,11:1964\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1857#1:1963\n1857#1:1964,11\n*E\n"})
public final class rw8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f79933a = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean isOutMostLookaheadRoot(@yfb lw8 lw8Var) {
        if (lw8Var.getLookaheadRoot$ui_release() != null) {
            lw8 parent$ui_release = lw8Var.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) == null || lw8Var.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPass$ui_release()) {
                return true;
            }
        }
        return false;
    }

    private static final <T extends rba> void updateChildMeasurables(lw8 lw8Var, f7b<T> f7bVar, qy6<? super lw8, ? extends T> qy6Var) {
        f7b<lw8> f7bVar2 = lw8Var.get_children$ui_release();
        int size = f7bVar2.getSize();
        if (size > 0) {
            lw8[] content = f7bVar2.getContent();
            int i = 0;
            do {
                lw8 lw8Var2 = content[i];
                if (f7bVar.getSize() <= i) {
                    f7bVar.add(qy6Var.invoke(lw8Var2));
                } else {
                    f7bVar.set(i, qy6Var.invoke(lw8Var2));
                }
                i++;
            } while (i < size);
        }
        f7bVar.removeRange(lw8Var.getChildren$ui_release().size(), f7bVar.getSize());
    }
}
