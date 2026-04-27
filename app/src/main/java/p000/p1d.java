package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class p1d {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10752a f69427b = new C10752a(null);

    /* JADX INFO: renamed from: c */
    public static final int f69428c = m31707constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f69429d = m31707constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f69430e = m31707constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f69431a;

    /* JADX INFO: renamed from: p1d$a */
    public static final class C10752a {
        public /* synthetic */ C10752a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m31713getLinesr_lszbg() {
            return p1d.f69429d;
        }

        /* JADX INFO: renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m31714getPointsr_lszbg() {
            return p1d.f69428c;
        }

        /* JADX INFO: renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m31715getPolygonr_lszbg() {
            return p1d.f69430e;
        }

        private C10752a() {
        }
    }

    private /* synthetic */ p1d(int i) {
        this.f69431a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ p1d m31706boximpl(int i) {
        return new p1d(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m31707constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31708equalsimpl(int i, Object obj) {
        return (obj instanceof p1d) && i == ((p1d) obj).m31712unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31709equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31710hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31711toStringimpl(int i) {
        return m31709equalsimpl0(i, f69428c) ? "Points" : m31709equalsimpl0(i, f69429d) ? "Lines" : m31709equalsimpl0(i, f69430e) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31708equalsimpl(this.f69431a, obj);
    }

    public int hashCode() {
        return m31710hashCodeimpl(this.f69431a);
    }

    @yfb
    public String toString() {
        return m31711toStringimpl(this.f69431a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31712unboximpl() {
        return this.f69431a;
    }
}
