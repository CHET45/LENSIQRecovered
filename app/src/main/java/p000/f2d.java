package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class f2d {

    /* JADX INFO: renamed from: a */
    public final long f34879a;

    private /* synthetic */ f2d(long j) {
        this.f34879a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ f2d m28880boximpl(long j) {
        return new f2d(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m28881constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28882equalsimpl(long j, Object obj) {
        return (obj instanceof f2d) && j == ((f2d) obj).m28886unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28883equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28884hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28885toStringimpl(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m28882equalsimpl(this.f34879a, obj);
    }

    public final long getValue() {
        return this.f34879a;
    }

    public int hashCode() {
        return m28884hashCodeimpl(this.f34879a);
    }

    public String toString() {
        return m28885toStringimpl(this.f34879a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m28886unboximpl() {
        return this.f34879a;
    }
}
