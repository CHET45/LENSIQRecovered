package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class s1g {

    /* JADX INFO: renamed from: a */
    public final long f80395a;

    private /* synthetic */ s1g(long j) {
        this.f80395a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ s1g m32244boximpl(long j) {
        return new s1g(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m32246constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m32247constructorimpl$default(int i, int i2, int i3, jt3 jt3Var) {
        if ((i3 & 2) != 0) {
            i2 = x1g.f96037b.m33171getDelayEo1U57Q();
        }
        return m32245constructorimpl(i, i2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32248equalsimpl(long j, Object obj) {
        return (obj instanceof s1g) && j == ((s1g) obj).m32254unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32249equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m32250getOffsetMillisimpl(long j) {
        return Math.abs((int) j);
    }

    /* JADX INFO: renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m32251getOffsetTypeEo1U57Q(long j) {
        boolean z = j > 0;
        if (z) {
            return x1g.f96037b.m33172getFastForwardEo1U57Q();
        }
        if (z) {
            throw new ceb();
        }
        return x1g.f96037b.m33171getDelayEo1U57Q();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32252hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32253toStringimpl(long j) {
        return "StartOffset(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m32248equalsimpl(this.f80395a, obj);
    }

    public int hashCode() {
        return m32252hashCodeimpl(this.f80395a);
    }

    public String toString() {
        return m32253toStringimpl(this.f80395a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32254unboximpl() {
        return this.f80395a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m32245constructorimpl(int i, int i2) {
        return m32246constructorimpl(i * i2);
    }
}
