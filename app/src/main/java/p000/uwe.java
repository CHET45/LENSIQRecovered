package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,169:1\n148#2:170\n148#2:171\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n36#1:170\n37#1:171\n*E\n"})
public final class uwe {

    /* JADX INFO: renamed from: a */
    public static final float f89293a;

    /* JADX INFO: renamed from: b */
    public static final float f89294b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final dye<twe> f89295c = new dye<>("SelectionHandleInfo", null, 2, null);

    static {
        float f = 25;
        f89293a = kn4.m30705constructorimpl(f);
        f89294b = kn4.m30705constructorimpl(f);
    }

    /* JADX INFO: renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m32665getAdjustedCoordinatesk4lQ0M(long j) {
        return mzb.Offset(izb.m30429getXimpl(j), izb.m30430getYimpl(j) - 1.0f);
    }

    public static final float getHandleHeight() {
        return f89294b;
    }

    public static final float getHandleWidth() {
        return f89293a;
    }

    @yfb
    public static final dye<twe> getSelectionHandleInfoKey() {
        return f89295c;
    }

    public static final boolean isHandleLtrDirection(@yfb q5e q5eVar, boolean z) {
        return (q5eVar == q5e.Ltr && !z) || (q5eVar == q5e.Rtl && z);
    }

    public static final boolean isLeftSelectionHandle(boolean z, @yfb q5e q5eVar, boolean z2) {
        return z ? isHandleLtrDirection(q5eVar, z2) : !isHandleLtrDirection(q5eVar, z2);
    }
}
