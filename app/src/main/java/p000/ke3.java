package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,199:1\n148#2:200\n148#2:201\n148#2:202\n148#2:203\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n*L\n146#1:200\n147#1:201\n148#1:202\n149#1:203\n*E\n"})
public final class ke3 {
    @yfb
    public static final je3 CutCornerShape(@yfb y03 y03Var) {
        return new je3(y03Var, y03Var, y03Var, y03Var);
    }

    public static /* synthetic */ je3 CutCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return CutCornerShape(f, f2, f3, f4);
    }

    @yfb
    /* JADX INFO: renamed from: CutCornerShape-0680j_4, reason: not valid java name */
    public static final je3 m30683CutCornerShape0680j_4(float f) {
        return CutCornerShape(z03.m33462CornerSize0680j_4(f));
    }

    @yfb
    /* JADX INFO: renamed from: CutCornerShape-a9UjIt4, reason: not valid java name */
    public static final je3 m30684CutCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new je3(z03.m33462CornerSize0680j_4(f), z03.m33462CornerSize0680j_4(f2), z03.m33462CornerSize0680j_4(f3), z03.m33462CornerSize0680j_4(f4));
    }

    /* JADX INFO: renamed from: CutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ je3 m30685CutCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m30684CutCornerShapea9UjIt4(f, f2, f3, f4);
    }

    @yfb
    public static final je3 CutCornerShape(float f) {
        return CutCornerShape(z03.CornerSize(f));
    }

    public static /* synthetic */ je3 CutCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
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
        return CutCornerShape(i, i2, i3, i4);
    }

    @yfb
    public static final je3 CutCornerShape(int i) {
        return CutCornerShape(z03.CornerSize(i));
    }

    @yfb
    public static final je3 CutCornerShape(float f, float f2, float f3, float f4) {
        return new je3(z03.CornerSize(f), z03.CornerSize(f2), z03.CornerSize(f3), z03.CornerSize(f4));
    }

    @yfb
    public static final je3 CutCornerShape(@h78(from = 0, m12174to = 100) int i, @h78(from = 0, m12174to = 100) int i2, @h78(from = 0, m12174to = 100) int i3, @h78(from = 0, m12174to = 100) int i4) {
        return new je3(z03.CornerSize(i), z03.CornerSize(i2), z03.CornerSize(i3), z03.CornerSize(i4));
    }
}
