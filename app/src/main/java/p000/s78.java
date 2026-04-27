package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,146:1\n100#2:147\n100#2:148\n100#2:151\n26#3:149\n26#3:150\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n33#1:147\n133#1:148\n141#1:151\n142#1:149\n143#1:150\n*E\n"})
public final class s78 {
    @f0g
    public static final long IntSize(int i, int i2) {
        return r78.m32082constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* JADX INFO: renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m32282getCenterozmzZPI(long j) {
        return a78.m27195constructorimpl((((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m32283getCenterozmzZPI$annotations(long j) {
    }

    @f0g
    /* JADX INFO: renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m32284roundToIntSizeuvyYCjk(long j) {
        int iRound = Math.round(wpf.m33069getWidthimpl(j));
        return r78.m32082constructorimpl((((long) Math.round(wpf.m33066getHeightimpl(j))) & 4294967295L) | (((long) iRound) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m32285timesO0kMr_c(int i, long j) {
        return r78.m32089timesYEO4UFw(j, i);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final l78 m32286toIntRectozmzZPI(long j) {
        return m78.m30967IntRectVbeCjmY(a78.f545b.m27211getZeronOccac(), j);
    }

    @f0g
    /* JADX INFO: renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m32287toIntSizeuvyYCjk(long j) {
        int iM33069getWidthimpl = (int) wpf.m33069getWidthimpl(j);
        return r78.m32082constructorimpl((((long) ((int) wpf.m33066getHeightimpl(j))) & 4294967295L) | (((long) iM33069getWidthimpl) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m32288toSizeozmzZPI(long j) {
        return eqf.Size(r78.m32087getWidthimpl(j), r78.m32086getHeightimpl(j));
    }
}
