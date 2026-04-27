package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1334:1\n1008#1:1338\n1007#1:1340\n100#2:1335\n107#2:1336\n114#2:1337\n114#2:1339\n107#2:1341\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n1009#1:1338\n1009#1:1340\n1005#1:1335\n1007#1:1336\n1008#1:1337\n1009#1:1339\n1009#1:1341\n*E\n"})
public final class rwf {

    /* JADX INFO: renamed from: a */
    public final long f80044a;

    private /* synthetic */ rwf(long j) {
        this.f80044a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ rwf m32225boximpl(long j) {
        return new rwf(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m32227constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32228equalsimpl(long j, Object obj) {
        return (obj instanceof rwf) && j == ((rwf) obj).m32235unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32229equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m32230getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m32231getSizeimpl(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32));
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m32232getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32233hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32234toStringimpl(long j) {
        return "SpanRange(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m32228equalsimpl(this.f80044a, obj);
    }

    public final long getPackedValue() {
        return this.f80044a;
    }

    public int hashCode() {
        return m32233hashCodeimpl(this.f80044a);
    }

    public String toString() {
        return m32234toStringimpl(this.f80044a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32235unboximpl() {
        return this.f80044a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m32226constructorimpl(int i, int i2) {
        return m32227constructorimpl((((long) (i2 + i)) & 4294967295L) | (((long) i) << 32));
    }
}
