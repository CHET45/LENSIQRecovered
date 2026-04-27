package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,285:1\n198#1:289\n63#2,3:286\n72#2:290\n86#2:292\n63#2,3:294\n72#2:297\n86#2:299\n22#3:291\n22#3:293\n22#3:298\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n212#1:289\n34#1:286,3\n239#1:290\n240#1:292\n238#1:294,3\n283#1:297\n283#1:299\n239#1:291\n240#1:293\n283#1:298\n*E\n"})
public final class eqf {
    @f0g
    public static final long Size(float f, float f2) {
        return wpf.m33060constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m28834getCenteruvyYCjk(long j) {
        if (j == j28.f49422d) {
            j28.throwIllegalStateException("Size is unspecified");
        }
        return mzb.Offset(Float.intBitsToFloat((int) (j >> 32)) / 2.0f, Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f);
    }

    @f0g
    /* JADX INFO: renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m28835getCenteruvyYCjk$annotations(long j) {
    }

    /* JADX INFO: renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m28836isSpecifieduvyYCjk(long j) {
        return j != j28.f49422d;
    }

    @f0g
    /* JADX INFO: renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m28837isSpecifieduvyYCjk$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m28838isUnspecifieduvyYCjk(long j) {
        return j == j28.f49422d;
    }

    @f0g
    /* JADX INFO: renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m28839isUnspecifieduvyYCjk$annotations(long j) {
    }

    @f0g
    /* JADX INFO: renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m28840lerpVgWVRYQ(long j, long j2, float f) {
        if (j == j28.f49422d || j2 == j28.f49422d) {
            j28.throwIllegalStateException("Offset is unspecified");
        }
        float fLerp = m3a.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fLerp2 = m3a.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return wpf.m33060constructorimpl((((long) Float.floatToRawIntBits(fLerp)) << 32) | (((long) Float.floatToRawIntBits(fLerp2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m28841takeOrElseTmRCtEA(long j, @yfb ny6<wpf> ny6Var) {
        return j != j28.f49422d ? j : ny6Var.invoke().m33074unboximpl();
    }

    @f0g
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m28844timesd16Qtg0(int i, long j) {
        return wpf.m33072times7Ah8Wj8(j, i);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final rud m28845toRectuvyYCjk(long j) {
        return xud.m33303Recttz77jQw(izb.f49009b.m30445getZeroF1C5BW0(), j);
    }

    @f0g
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m28842timesd16Qtg0(double d, long j) {
        return wpf.m33072times7Ah8Wj8(j, (float) d);
    }

    @f0g
    /* JADX INFO: renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m28843timesd16Qtg0(float f, long j) {
        return wpf.m33072times7Ah8Wj8(j, f);
    }
}
