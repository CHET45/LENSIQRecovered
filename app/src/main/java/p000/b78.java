package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,198:1\n100#2:199\n100#2:200\n100#2:202\n26#3:201\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n34#1:199\n165#1:200\n197#1:202\n197#1:201\n*E\n"})
public final class b78 {
    @f0g
    public static final long IntOffset(int i, int i2) {
        return a78.m27195constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m27955lerp81ZRxRo(long j, long j2, float f) {
        return a78.m27195constructorimpl((((long) m3a.lerp(a78.m27201getXimpl(j), a78.m27201getXimpl(j2), f)) << 32) | (((long) m3a.lerp(a78.m27202getYimpl(j), a78.m27202getYimpl(j2), f)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m27956minusNvtHpc(long j, long j2) {
        return mzb.Offset(izb.m30429getXimpl(j) - a78.m27201getXimpl(j2), izb.m30430getYimpl(j) - a78.m27202getYimpl(j2));
    }

    @f0g
    /* JADX INFO: renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m27957minusoCl6YwE(long j, long j2) {
        return mzb.Offset(a78.m27201getXimpl(j) - izb.m30429getXimpl(j2), a78.m27202getYimpl(j) - izb.m30430getYimpl(j2));
    }

    @f0g
    /* JADX INFO: renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m27958plusNvtHpc(long j, long j2) {
        return mzb.Offset(izb.m30429getXimpl(j) + a78.m27201getXimpl(j2), izb.m30430getYimpl(j) + a78.m27202getYimpl(j2));
    }

    @f0g
    /* JADX INFO: renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m27959plusoCl6YwE(long j, long j2) {
        return mzb.Offset(a78.m27201getXimpl(j) + izb.m30429getXimpl(j2), a78.m27202getYimpl(j) + izb.m30430getYimpl(j2));
    }

    @f0g
    /* JADX INFO: renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m27960roundk4lQ0M(long j) {
        int iRound = Math.round(izb.m30429getXimpl(j));
        return a78.m27195constructorimpl((((long) Math.round(izb.m30430getYimpl(j))) & 4294967295L) | (((long) iRound) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m27961toOffsetgyyYBs(long j) {
        return mzb.Offset(a78.m27201getXimpl(j), a78.m27202getYimpl(j));
    }
}
