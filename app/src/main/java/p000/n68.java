package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
public final class n68 {

    /* JADX INFO: renamed from: a */
    @un8
    public final long f63385a;

    private /* synthetic */ n68(long j) {
        this.f63385a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ n68 m31131boximpl(long j) {
        return new n68(j);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m31132component1impl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m31133component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m31135constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31136equalsimpl(long j, Object obj) {
        return (obj instanceof n68) && j == ((n68) obj).m31142unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31137equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final int m31138getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final int m31139getSecondimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31140hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31141toStringimpl(long j) {
        return '(' + m31138getFirstimpl(j) + ", " + m31139getSecondimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m31136equalsimpl(this.f63385a, obj);
    }

    public int hashCode() {
        return m31140hashCodeimpl(this.f63385a);
    }

    @yfb
    public String toString() {
        return m31141toStringimpl(this.f63385a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m31142unboximpl() {
        return this.f63385a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m31134constructorimpl(int i, int i2) {
        return m31135constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }
}
