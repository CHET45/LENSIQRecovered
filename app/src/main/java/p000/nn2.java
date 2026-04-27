package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCompositionLocalConsumerModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalConsumerModifierNode.kt\nandroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,78:1\n42#2,7:79\n*S KotlinDebug\n*F\n+ 1 CompositionLocalConsumerModifierNode.kt\nandroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt\n*L\n73#1:79,7\n*E\n"})
public final class nn2 {
    public static final <T> T currentValueOf(@yfb mn2 mn2Var, @yfb kn2<T> kn2Var) {
        if (!mn2Var.getNode().isAttached()) {
            g28.throwIllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) w34.requireLayoutNode(mn2Var).getCompositionLocalMap().get(kn2Var);
    }
}
