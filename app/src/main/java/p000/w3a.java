package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class w3a {
    public static final int addExactOrElse(int i, int i2, @yfb ny6<Integer> ny6Var) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? ny6Var.invoke().intValue() : i3;
    }

    /* JADX INFO: renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m32865distanceSquaredToClosestCornerFromOutside3MmeM6k(long j, rud rudVar) {
        if (axe.m27906containsInclusiveUv8p0NA(rudVar, j)) {
            return 0.0f;
        }
        float fM30428getDistanceSquaredimpl = izb.m30428getDistanceSquaredimpl(izb.m30433minusMKHz9U(rudVar.m32208getTopLeftF1C5BW0(), j));
        if (fM30428getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM30428getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM30428getDistanceSquaredimpl2 = izb.m30428getDistanceSquaredimpl(izb.m30433minusMKHz9U(rudVar.m32209getTopRightF1C5BW0(), j));
        if (fM30428getDistanceSquaredimpl2 < fM30428getDistanceSquaredimpl) {
            fM30428getDistanceSquaredimpl = fM30428getDistanceSquaredimpl2;
        }
        float fM30428getDistanceSquaredimpl3 = izb.m30428getDistanceSquaredimpl(izb.m30433minusMKHz9U(rudVar.m32201getBottomLeftF1C5BW0(), j));
        if (fM30428getDistanceSquaredimpl3 < fM30428getDistanceSquaredimpl) {
            fM30428getDistanceSquaredimpl = fM30428getDistanceSquaredimpl3;
        }
        float fM30428getDistanceSquaredimpl4 = izb.m30428getDistanceSquaredimpl(izb.m30433minusMKHz9U(rudVar.m32202getBottomRightF1C5BW0(), j));
        return fM30428getDistanceSquaredimpl4 < fM30428getDistanceSquaredimpl ? fM30428getDistanceSquaredimpl4 : fM30428getDistanceSquaredimpl;
    }

    /* JADX INFO: renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m32866findClosestRect9KIMszo(long j, @yfb rud rudVar, @yfb rud rudVar2) {
        float fM32865distanceSquaredToClosestCornerFromOutside3MmeM6k = m32865distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rudVar);
        float fM32865distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m32865distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rudVar2);
        if (fM32865distanceSquaredToClosestCornerFromOutside3MmeM6k == fM32865distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM32865distanceSquaredToClosestCornerFromOutside3MmeM6k < fM32865distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i, int i2, @yfb ny6<Integer> ny6Var) {
        int i3 = i - i2;
        return ((i ^ i3) & (i2 ^ i)) < 0 ? ny6Var.invoke().intValue() : i3;
    }
}
