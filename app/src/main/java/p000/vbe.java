package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,201:1\n148#2:202\n148#2:203\n148#2:204\n148#2:205\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n148#1:202\n149#1:203\n150#1:204\n151#1:205\n*E\n"})
public final class vbe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ube f90567a = RoundedCornerShape(50);

    @yfb
    public static final ube RoundedCornerShape(@yfb y03 y03Var) {
        return new ube(y03Var, y03Var, y03Var, y03Var);
    }

    public static /* synthetic */ ube RoundedCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return RoundedCornerShape(f, f2, f3, f4);
    }

    @yfb
    /* JADX INFO: renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final ube m32757RoundedCornerShape0680j_4(float f) {
        return RoundedCornerShape(z03.m33462CornerSize0680j_4(f));
    }

    @yfb
    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final ube m32758RoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new ube(z03.m33462CornerSize0680j_4(f), z03.m33462CornerSize0680j_4(f2), z03.m33462CornerSize0680j_4(f3), z03.m33462CornerSize0680j_4(f4));
    }

    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ ube m32759RoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m32758RoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }

    @yfb
    public static final ube getCircleShape() {
        return f90567a;
    }

    @yfb
    public static final ube RoundedCornerShape(float f) {
        return RoundedCornerShape(z03.CornerSize(f));
    }

    public static /* synthetic */ ube RoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
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
        return RoundedCornerShape(i, i2, i3, i4);
    }

    @yfb
    public static final ube RoundedCornerShape(int i) {
        return RoundedCornerShape(z03.CornerSize(i));
    }

    @yfb
    public static final ube RoundedCornerShape(float f, float f2, float f3, float f4) {
        return new ube(z03.CornerSize(f), z03.CornerSize(f2), z03.CornerSize(f3), z03.CornerSize(f4));
    }

    @yfb
    public static final ube RoundedCornerShape(@h78(from = 0, m12174to = 100) int i, @h78(from = 0, m12174to = 100) int i2, @h78(from = 0, m12174to = 100) int i3, @h78(from = 0, m12174to = 100) int i4) {
        return new ube(z03.CornerSize(i), z03.CornerSize(i2), z03.CornerSize(i3), z03.CornerSize(i4));
    }
}
