package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,311:1\n63#2,3:312\n72#2:315\n86#2:317\n63#2,3:319\n22#3:316\n22#3:318\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:312,3\n272#1:315\n273#1:317\n271#1:319,3\n272#1:316\n273#1:318\n*E\n"})
public final class mzb {
    @f0g
    public static final long Offset(float f, float f2) {
        return izb.m30421constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m31098isFinitek4lQ0M(long j) {
        long j2 = (j & j28.f49421c) ^ j28.f49421c;
        return (((~j2) & (j2 - j28.f49425g)) & (-9223372034707292160L)) == 0;
    }

    @f0g
    /* JADX INFO: renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m31099isFinitek4lQ0M$annotations(long j) {
    }

    /* JADX INFO: renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m31100isSpecifiedk4lQ0M(long j) {
        return (j & j28.f49419a) != j28.f49422d;
    }

    @f0g
    /* JADX INFO: renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m31101isSpecifiedk4lQ0M$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m31102isUnspecifiedk4lQ0M(long j) {
        return (j & j28.f49419a) == j28.f49422d;
    }

    @f0g
    /* JADX INFO: renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m31103isUnspecifiedk4lQ0M$annotations(long j) {
    }

    @f0g
    /* JADX INFO: renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m31104lerpWko1d7g(long j, long j2, float f) {
        float fLerp = m3a.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fLerp2 = m3a.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return izb.m30421constructorimpl((((long) Float.floatToRawIntBits(fLerp)) << 32) | (((long) Float.floatToRawIntBits(fLerp2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m31105takeOrElse3MmeM6k(long j, @yfb ny6<izb> ny6Var) {
        return m31100isSpecifiedk4lQ0M(j) ? j : ny6Var.invoke().m30439unboximpl();
    }
}
