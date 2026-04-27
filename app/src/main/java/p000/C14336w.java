package p000;

/* JADX INFO: renamed from: w */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,196:1\n148#2:197\n148#2:198\n148#2:199\n148#2:200\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n*L\n143#1:197\n144#1:198\n145#1:199\n146#1:200\n*E\n"})
public final class C14336w {
    @yfb
    public static final C13805v AbsoluteRoundedCornerShape(@yfb y03 y03Var) {
        return new C13805v(y03Var, y03Var, y03Var, y03Var);
    }

    public static /* synthetic */ C13805v AbsoluteRoundedCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return AbsoluteRoundedCornerShape(f, f2, f3, f4);
    }

    @yfb
    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final C13805v m32841AbsoluteRoundedCornerShape0680j_4(float f) {
        return AbsoluteRoundedCornerShape(z03.m33462CornerSize0680j_4(f));
    }

    @yfb
    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final C13805v m32842AbsoluteRoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new C13805v(z03.m33462CornerSize0680j_4(f), z03.m33462CornerSize0680j_4(f2), z03.m33462CornerSize0680j_4(f3), z03.m33462CornerSize0680j_4(f4));
    }

    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ C13805v m32843AbsoluteRoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m32842AbsoluteRoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }

    @yfb
    public static final C13805v AbsoluteRoundedCornerShape(float f) {
        return AbsoluteRoundedCornerShape(z03.CornerSize(f));
    }

    public static /* synthetic */ C13805v AbsoluteRoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
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
        return AbsoluteRoundedCornerShape(i, i2, i3, i4);
    }

    @yfb
    public static final C13805v AbsoluteRoundedCornerShape(int i) {
        return AbsoluteRoundedCornerShape(z03.CornerSize(i));
    }

    @yfb
    public static final C13805v AbsoluteRoundedCornerShape(float f, float f2, float f3, float f4) {
        return new C13805v(z03.CornerSize(f), z03.CornerSize(f2), z03.CornerSize(f3), z03.CornerSize(f4));
    }

    @yfb
    public static final C13805v AbsoluteRoundedCornerShape(@h78(from = 0, m12174to = 100) int i, @h78(from = 0, m12174to = 100) int i2, @h78(from = 0, m12174to = 100) int i3, @h78(from = 0, m12174to = 100) int i4) {
        return new C13805v(z03.CornerSize(i), z03.CornerSize(i2), z03.CornerSize(i3), z03.CornerSize(i4));
    }
}
