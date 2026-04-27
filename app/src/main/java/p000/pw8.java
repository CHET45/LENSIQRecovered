package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1554:1\n66#2,9:1555\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n*L\n1540#1:1555,9\n*E\n"})
public final class pw8 {

    /* JADX INFO: renamed from: a */
    public static final boolean f72266a = false;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final c64 f72267b = e64.Density$default(1.0f, 0.0f, 2, null);

    public static final void add(@yfb lw8 lw8Var, @yfb lw8 lw8Var2) {
        lw8Var.insertAt$ui_release(lw8Var.getChildren$ui_release().size(), lw8Var2);
    }

    @yfb
    public static final z9c requireOwner(@yfb lw8 lw8Var) {
        z9c owner$ui_release = lw8Var.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        g28.throwIllegalStateExceptionForNullCheck("LayoutNode should be attached to an owner");
        throw new us8();
    }
}
