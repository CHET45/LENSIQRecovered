package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,321:1\n42#2,7:322\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n*L\n299#1:322,7\n*E\n"})
public final class gw8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(km9 km9Var, AbstractC9938nm abstractC9938nm) {
        km9 child = km9Var.getChild();
        if (!(child != null)) {
            g28.throwIllegalStateException("Child of " + km9Var + " cannot be null when calculating alignment line");
        }
        if (km9Var.getMeasureResult$ui_release().getAlignmentLines().containsKey(abstractC9938nm)) {
            Integer num = km9Var.getMeasureResult$ui_release().getAlignmentLines().get(abstractC9938nm);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i = child.get(abstractC9938nm);
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        child.setShallowPlacing$ui_release(true);
        km9Var.setPlacingForAlignment$ui_release(true);
        km9Var.replace$ui_release();
        child.setShallowPlacing$ui_release(false);
        km9Var.setPlacingForAlignment$ui_release(false);
        return i + (abstractC9938nm instanceof kl7 ? a78.m27202getYimpl(child.mo30030getPositionnOccac()) : a78.m27201getXimpl(child.mo30030getPositionnOccac()));
    }
}
