package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,491:1\n42#2,7:492\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n341#1:492,7\n*E\n"})
public final class mm9 {

    /* JADX INFO: renamed from: a */
    public static final int f61492a = 16777215;

    /* JADX INFO: renamed from: b */
    public static final int f61493b = -16777216;

    public static final void checkMeasuredSize(int i, int i2) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return;
        }
        g28.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
    }
}
