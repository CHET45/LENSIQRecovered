package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class ib7 {

    /* JADX INFO: renamed from: a */
    public final long f46448a;

    private /* synthetic */ ib7(long j) {
        this.f46448a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ib7 m30182boximpl(long j) {
        return new ib7(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30183constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30184equalsimpl(long j, Object obj) {
        return (obj instanceof ib7) && j == ((ib7) obj).m30189unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30185equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m30186getCurrentLineSpanimpl(long j) {
        return (int) j;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30187hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30188toStringimpl(long j) {
        return "GridItemSpan(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m30184equalsimpl(this.f46448a, obj);
    }

    public int hashCode() {
        return m30187hashCodeimpl(this.f46448a);
    }

    public String toString() {
        return m30188toStringimpl(this.f46448a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30189unboximpl() {
        return this.f46448a;
    }
}
