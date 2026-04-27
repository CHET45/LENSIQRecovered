package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDrawModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,44:1\n74#2:45\n*S KotlinDebug\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n*L\n41#1:45\n*E\n"})
public final class gp4 {
    public static final void invalidateDraw(@yfb fp4 fp4Var) {
        if (fp4Var.getNode().isAttached()) {
            w34.m32852requireCoordinator64DMado(fp4Var, keb.m30687constructorimpl(1)).invalidateLayer();
        }
    }
}
