package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,347:1\n72#2:348\n114#2:350\n22#3:349\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n326#1:348\n329#1:350\n326#1:349\n*E\n"})
public final class ug4 {

    /* JADX INFO: renamed from: a */
    public final long f87959a;

    private /* synthetic */ ug4(long j) {
        this.f87959a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ug4 m32601boximpl(long j) {
        return new ug4(j);
    }

    /* JADX INFO: renamed from: compareTo-S_HNhKs, reason: not valid java name */
    public static final int m32602compareToS_HNhKs(long j, long j2) {
        boolean zM32608isInLayerimpl = m32608isInLayerimpl(j);
        return zM32608isInLayerimpl != m32608isInLayerimpl(j2) ? zM32608isInLayerimpl ? -1 : 1 : (int) Math.signum(m32606getDistanceimpl(j) - m32606getDistanceimpl(j2));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m32603constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32604equalsimpl(long j, Object obj) {
        return (obj instanceof ug4) && j == ((ug4) obj).m32610unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32605equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m32606getDistanceimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32607hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m32608isInLayerimpl(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32609toStringimpl(long j) {
        return "DistanceAndInLayer(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m32604equalsimpl(this.f87959a, obj);
    }

    public final long getPackedValue() {
        return this.f87959a;
    }

    public int hashCode() {
        return m32607hashCodeimpl(this.f87959a);
    }

    public String toString() {
        return m32609toStringimpl(this.f87959a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32610unboximpl() {
        return this.f87959a;
    }
}
