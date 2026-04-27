package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,85:1\n48#1:93\n54#1:95\n24#2,3:86\n22#3:89\n22#3:90\n22#3:91\n22#3:92\n22#3:94\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n83#1:93\n83#1:95\n42#1:86,3\n48#1:89\n54#1:90\n67#1:91\n81#1:92\n83#1:94\n*E\n"})
public final class j46 {

    /* JADX INFO: renamed from: a */
    @un8
    public final long f49506a;

    private /* synthetic */ j46(long j) {
        this.f49506a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ j46 m30448boximpl(long j) {
        return new j46(j);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m30449component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m30450component2impl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30452constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30453equalsimpl(long j, Object obj) {
        return (obj instanceof j46) && j == ((j46) obj).m30459unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30454equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m30455getFirstimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m30456getSecondimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30457hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30458toStringimpl(long j) {
        return '(' + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m30453equalsimpl(this.f49506a, obj);
    }

    public int hashCode() {
        return m30457hashCodeimpl(this.f49506a);
    }

    @yfb
    public String toString() {
        return m30458toStringimpl(this.f49506a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30459unboximpl() {
        return this.f49506a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30451constructorimpl(float f, float f2) {
        return m30452constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
