package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,405:1\n76#2:406\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n*L\n149#1:406\n*E\n"})
public final class hw8 {
    public static final void invalidateLayer(@yfb ew8 ew8Var) {
        w34.m32852requireCoordinator64DMado(ew8Var, keb.m30687constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidateMeasurement(@yfb ew8 ew8Var) {
        w34.requireLayoutNode(ew8Var).invalidateMeasurements$ui_release();
    }

    public static final void invalidatePlacement(@yfb ew8 ew8Var) {
        lw8.requestRelayout$ui_release$default(w34.requireLayoutNode(ew8Var), false, 1, null);
    }

    public static final void remeasureSync(@yfb ew8 ew8Var) {
        w34.requireLayoutNode(ew8Var).forceRemeasure();
    }

    public static final void requestRemeasure(@yfb ew8 ew8Var) {
        lw8.requestRemeasure$ui_release$default(w34.requireLayoutNode(ew8Var), false, false, false, 7, null);
    }
}
