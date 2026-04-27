package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class fag {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C5708a f35949b = new C5708a(null);

    /* JADX INFO: renamed from: c */
    public static final int f35950c = m28898constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f35951d = m28898constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f35952e = m28898constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f35953a;

    /* JADX INFO: renamed from: fag$a */
    public static final class C5708a {
        public /* synthetic */ C5708a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m28904getButtKaPHkGw() {
            return fag.f35950c;
        }

        /* JADX INFO: renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m28905getRoundKaPHkGw() {
            return fag.f35951d;
        }

        /* JADX INFO: renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m28906getSquareKaPHkGw() {
            return fag.f35952e;
        }

        private C5708a() {
        }
    }

    private /* synthetic */ fag(int i) {
        this.f35953a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ fag m28897boximpl(int i) {
        return new fag(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m28898constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28899equalsimpl(int i, Object obj) {
        return (obj instanceof fag) && i == ((fag) obj).m28903unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28900equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28901hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28902toStringimpl(int i) {
        return m28900equalsimpl0(i, f35950c) ? "Butt" : m28900equalsimpl0(i, f35951d) ? "Round" : m28900equalsimpl0(i, f35952e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m28899equalsimpl(this.f35953a, obj);
    }

    public int hashCode() {
        return m28901hashCodeimpl(this.f35953a);
    }

    @yfb
    public String toString() {
        return m28902toStringimpl(this.f35953a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28903unboximpl() {
        return this.f35953a;
    }
}
