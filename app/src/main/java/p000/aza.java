package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,243:1\n72#2:244\n86#2:246\n22#3:245\n22#3:247\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n47#1:244\n49#1:246\n47#1:245\n49#1:247\n*E\n"})
public final class aza {

    /* JADX INFO: renamed from: a */
    public final long f12286a;

    private /* synthetic */ aza(long j) {
        this.f12286a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ aza m27910boximpl(long j) {
        return new aza(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m27911constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-XB9eQnU, reason: not valid java name */
    public static final long m27912copyXB9eQnU(long j, float f, float f2) {
        return lzf.Motion(f, f2);
    }

    /* JADX INFO: renamed from: copy-XB9eQnU$default, reason: not valid java name */
    public static /* synthetic */ long m27913copyXB9eQnU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m27916getValueimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m27917getVelocityimpl(j);
        }
        return m27912copyXB9eQnU(j, f, f2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m27914equalsimpl(long j, Object obj) {
        return (obj instanceof aza) && j == ((aza) obj).m27920unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27915equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m27916getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m27917getVelocityimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m27918hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m27919toStringimpl(long j) {
        return "Motion(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m27914equalsimpl(this.f12286a, obj);
    }

    public final long getPackedValue() {
        return this.f12286a;
    }

    public int hashCode() {
        return m27918hashCodeimpl(this.f12286a);
    }

    public String toString() {
        return m27919toStringimpl(this.f12286a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27920unboximpl() {
        return this.f12286a;
    }
}
