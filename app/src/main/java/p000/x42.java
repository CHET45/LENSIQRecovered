package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class x42 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14915a f96262b = new C14915a(null);

    /* JADX INFO: renamed from: c */
    public static final int f96263c = m33206constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f96264d = m33206constructorimpl(1);

    /* JADX INFO: renamed from: a */
    public final int f96265a;

    /* JADX INFO: renamed from: x42$a */
    public static final class C14915a {
        public /* synthetic */ C14915a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m33212getDifferencertfAjoo() {
            return x42.f96263c;
        }

        /* JADX INFO: renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m33213getIntersectrtfAjoo() {
            return x42.f96264d;
        }

        private C14915a() {
        }
    }

    private /* synthetic */ x42(int i) {
        this.f96265a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x42 m33205boximpl(int i) {
        return new x42(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m33206constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33207equalsimpl(int i, Object obj) {
        return (obj instanceof x42) && i == ((x42) obj).m33211unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33208equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33209hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33210toStringimpl(int i) {
        return m33208equalsimpl0(i, f96263c) ? "Difference" : m33208equalsimpl0(i, f96264d) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m33207equalsimpl(this.f96265a, obj);
    }

    public int hashCode() {
        return m33209hashCodeimpl(this.f96265a);
    }

    @yfb
    public String toString() {
        return m33210toStringimpl(this.f96265a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33211unboximpl() {
        return this.f96265a;
    }
}
