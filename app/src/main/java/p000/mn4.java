package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,576:1\n124#1:577\n324#1:581\n482#1:588\n563#1:599\n569#1:601\n63#2,3:578\n63#2,3:582\n63#2,3:585\n63#2,3:591\n63#2,3:594\n68#3:589\n68#3:590\n56#3:597\n56#3:598\n56#3:600\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n138#1:577\n338#1:581\n496#1:588\n575#1:599\n575#1:601\n248#1:578,3\n354#1:582,3\n364#1:585,3\n505#1:591,3\n530#1:594,3\n506#1:589\n507#1:590\n563#1:597\n569#1:598\n575#1:600\n*E\n"})
public final class mn4 {
    @f0g
    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m30997DpOffsetYgX7TsA(float f, float f2) {
        return nn4.m31161constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m30998DpSizeYgX7TsA(float f, float f2) {
        return pn4.m31806constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m30999coerceAtLeastYgX7TsA(float f, float f2) {
        return kn4.m30705constructorimpl(kpd.coerceAtLeast(f, f2));
    }

    @f0g
    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m31000coerceAtMostYgX7TsA(float f, float f2) {
        return kn4.m30705constructorimpl(kpd.coerceAtMost(f, f2));
    }

    @f0g
    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m31001coerceIn2z7ARbQ(float f, float f2, float f3) {
        return kn4.m30705constructorimpl(kpd.coerceIn(f, f2, f3));
    }

    /* JADX INFO: renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m31002getCenterEaSLcWc(long j) {
        float fM30705constructorimpl = kn4.m30705constructorimpl(pn4.m31815getWidthD9Ej5fM(j) / 2.0f);
        return nn4.m31161constructorimpl((((long) Float.floatToRawIntBits(kn4.m30705constructorimpl(pn4.m31813getHeightD9Ej5fM(j) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fM30705constructorimpl) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m31003getCenterEaSLcWc$annotations(long j) {
    }

    public static final float getDp(int i) {
        return kn4.m30705constructorimpl(i);
    }

    @f0g
    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static final float getHeight(@yfb on4 on4Var) {
        return kn4.m30705constructorimpl(on4Var.m31506getBottomD9Ej5fM() - on4Var.m31509getTopD9Ej5fM());
    }

    @f0g
    public static /* synthetic */ void getHeight$annotations(on4 on4Var) {
    }

    public static final long getSize(@yfb on4 on4Var) {
        return m30998DpSizeYgX7TsA(kn4.m30705constructorimpl(on4Var.m31508getRightD9Ej5fM() - on4Var.m31507getLeftD9Ej5fM()), kn4.m30705constructorimpl(on4Var.m31506getBottomD9Ej5fM() - on4Var.m31509getTopD9Ej5fM()));
    }

    @f0g
    public static /* synthetic */ void getSize$annotations(on4 on4Var) {
    }

    public static final float getWidth(@yfb on4 on4Var) {
        return kn4.m30705constructorimpl(on4Var.m31508getRightD9Ej5fM() - on4Var.m31507getLeftD9Ej5fM());
    }

    @f0g
    public static /* synthetic */ void getWidth$annotations(on4 on4Var) {
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m31004isFinite0680j_4(float f) {
        return !(f == Float.POSITIVE_INFINITY);
    }

    @f0g
    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m31005isFinite0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m31006isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    @f0g
    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m31007isSpecified0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m31008isSpecifiedEaSLcWc(long j) {
        return j != j28.f49422d;
    }

    @f0g
    /* JADX INFO: renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m31009isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m31010isSpecifiedjoFl9I(long j) {
        return j != j28.f49422d;
    }

    @f0g
    /* JADX INFO: renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m31011isSpecifiedjoFl9I$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m31012isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    @f0g
    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m31013isUnspecified0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m31014isUnspecifiedEaSLcWc(long j) {
        return j == j28.f49422d;
    }

    @f0g
    /* JADX INFO: renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m31015isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m31016isUnspecifiedjoFl9I(long j) {
        return j == j28.f49422d;
    }

    @f0g
    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m31017isUnspecifiedjoFl9I$annotations(long j) {
    }

    @f0g
    /* JADX INFO: renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m31018lerpIDex15A(long j, long j2, float f) {
        float fM31019lerpMdfbLM = m31019lerpMdfbLM(pn4.m31815getWidthD9Ej5fM(j), pn4.m31815getWidthD9Ej5fM(j2), f);
        float fM31019lerpMdfbLM2 = m31019lerpMdfbLM(pn4.m31813getHeightD9Ej5fM(j), pn4.m31813getHeightD9Ej5fM(j2), f);
        return pn4.m31806constructorimpl((((long) Float.floatToRawIntBits(fM31019lerpMdfbLM)) << 32) | (((long) Float.floatToRawIntBits(fM31019lerpMdfbLM2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m31019lerpMdfbLM(float f, float f2, float f3) {
        return kn4.m30705constructorimpl(m3a.lerp(f, f2, f3));
    }

    @f0g
    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m31020lerpxhh869w(long j, long j2, float f) {
        float fLerp = m3a.lerp(nn4.m31166getXD9Ej5fM(j), nn4.m31166getXD9Ej5fM(j2), f);
        float fLerp2 = m3a.lerp(nn4.m31168getYD9Ej5fM(j), nn4.m31168getYD9Ej5fM(j2), f);
        return nn4.m31161constructorimpl((((long) Float.floatToRawIntBits(fLerp)) << 32) | (((long) Float.floatToRawIntBits(fLerp2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m31021maxYgX7TsA(float f, float f2) {
        return kn4.m30705constructorimpl(Math.max(f, f2));
    }

    @f0g
    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m31022minYgX7TsA(float f, float f2) {
        return kn4.m30705constructorimpl(Math.min(f, f2));
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m31023takeOrElseD5KLDUw(float f, @yfb ny6<kn4> ny6Var) {
        return !Float.isNaN(f) ? f : ny6Var.invoke().m30719unboximpl();
    }

    /* JADX INFO: renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m31024takeOrElsegVKV90s(long j, @yfb ny6<nn4> ny6Var) {
        return j != j28.f49422d ? j : ny6Var.invoke().m31174unboximpl();
    }

    /* JADX INFO: renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m31025takeOrElseitqla9I(long j, @yfb ny6<pn4> ny6Var) {
        return j != j28.f49422d ? j : ny6Var.invoke().m31823unboximpl();
    }

    @f0g
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m31027times3ABfNKs(float f, float f2) {
        return kn4.m30705constructorimpl(f * f2);
    }

    @f0g
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m31030times6HolHcs(int i, long j) {
        return pn4.m31821timesGh9hcWk(j, i);
    }

    public static final float getDp(double d) {
        return kn4.m30705constructorimpl((float) d);
    }

    @f0g
    public static /* synthetic */ void getDp$annotations(float f) {
    }

    @f0g
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m31026times3ABfNKs(double d, float f) {
        return kn4.m30705constructorimpl(((float) d) * f);
    }

    @f0g
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m31029times6HolHcs(float f, long j) {
        return pn4.m31820timesGh9hcWk(j, f);
    }

    public static final float getDp(float f) {
        return kn4.m30705constructorimpl(f);
    }

    @f0g
    public static /* synthetic */ void getDp$annotations(int i) {
    }

    @f0g
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m31028times3ABfNKs(int i, float f) {
        return kn4.m30705constructorimpl(i * f);
    }
}
