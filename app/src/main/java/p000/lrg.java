package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,627:1\n702#2:628\n148#3:629\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n*L\n587#1:628\n581#1:629\n*E\n"})
public final class lrg {

    /* JADX INFO: renamed from: a */
    public static final float f58567a = kn4.m30705constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final rud getCursorRectInScroller(c64 c64Var, rud rudVar, boolean z, int i) {
        return rud.copy$default(rudVar, z ? i - rudVar.getRight() : rudVar.getLeft(), 0.0f, (z ? i - rudVar.getRight() : rudVar.getLeft()) + c64Var.mo27167roundToPx0680j_4(f58567a), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(he1 he1Var) {
        return ((he1Var instanceof bvf) && ((bvf) he1Var).m28160getValue0d7_KjU() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        return (float) (f > 0.0f ? Math.ceil(f) : Math.floor(f));
    }
}
