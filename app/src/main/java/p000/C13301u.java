package p000;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAbsoluteCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,199:1\n148#2:200\n148#2:201\n148#2:202\n148#2:203\n*S KotlinDebug\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShapeKt\n*L\n146#1:200\n147#1:201\n148#1:202\n149#1:203\n*E\n"})
public final class C13301u {
    @yfb
    public static final C12832t AbsoluteCutCornerShape(@yfb y03 y03Var) {
        return new C12832t(y03Var, y03Var, y03Var, y03Var);
    }

    public static /* synthetic */ C12832t AbsoluteCutCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return AbsoluteCutCornerShape(f, f2, f3, f4);
    }

    @yfb
    /* JADX INFO: renamed from: AbsoluteCutCornerShape-0680j_4, reason: not valid java name */
    public static final C12832t m32480AbsoluteCutCornerShape0680j_4(float f) {
        return AbsoluteCutCornerShape(z03.m33462CornerSize0680j_4(f));
    }

    @yfb
    /* JADX INFO: renamed from: AbsoluteCutCornerShape-a9UjIt4, reason: not valid java name */
    public static final C12832t m32481AbsoluteCutCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new C12832t(z03.m33462CornerSize0680j_4(f), z03.m33462CornerSize0680j_4(f2), z03.m33462CornerSize0680j_4(f3), z03.m33462CornerSize0680j_4(f4));
    }

    /* JADX INFO: renamed from: AbsoluteCutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ C12832t m32482AbsoluteCutCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = kn4.m30705constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = kn4.m30705constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = kn4.m30705constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = kn4.m30705constructorimpl(0);
        }
        return m32481AbsoluteCutCornerShapea9UjIt4(f, f2, f3, f4);
    }

    @yfb
    public static final C12832t AbsoluteCutCornerShape(float f) {
        return AbsoluteCutCornerShape(z03.CornerSize(f));
    }

    public static /* synthetic */ C12832t AbsoluteCutCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return AbsoluteCutCornerShape(i, i2, i3, i4);
    }

    @yfb
    public static final C12832t AbsoluteCutCornerShape(int i) {
        return AbsoluteCutCornerShape(z03.CornerSize(i));
    }

    @yfb
    public static final C12832t AbsoluteCutCornerShape(float f, float f2, float f3, float f4) {
        return new C12832t(z03.CornerSize(f), z03.CornerSize(f2), z03.CornerSize(f3), z03.CornerSize(f4));
    }

    @yfb
    public static final C12832t AbsoluteCutCornerShape(@h78(from = 0, m12174to = 100) int i, @h78(from = 0, m12174to = 100) int i2, @h78(from = 0, m12174to = 100) int i3, @h78(from = 0, m12174to = 100) int i4) {
        return new C12832t(z03.CornerSize(i), z03.CornerSize(i2), z03.CornerSize(i3), z03.CornerSize(i4));
    }
}
