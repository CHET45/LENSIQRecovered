package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class x1d {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14873a f96025b = new C14873a(null);

    /* JADX INFO: renamed from: c */
    public static final int f96026c = m33151constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f96027d = m33151constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f96028e = m33151constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f96029f = m33151constructorimpl(3);

    /* JADX INFO: renamed from: g */
    public static final int f96030g = m33151constructorimpl(4);

    /* JADX INFO: renamed from: h */
    public static final int f96031h = m33151constructorimpl(5);

    /* JADX INFO: renamed from: i */
    public static final int f96032i = m33151constructorimpl(6);

    /* JADX INFO: renamed from: a */
    public final int f96033a;

    /* JADX INFO: renamed from: x1d$a */
    public static final class C14873a {
        public /* synthetic */ C14873a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m33157getEnter7fucELk() {
            return x1d.f96030g;
        }

        /* JADX INFO: renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m33158getExit7fucELk() {
            return x1d.f96031h;
        }

        /* JADX INFO: renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m33159getMove7fucELk() {
            return x1d.f96029f;
        }

        /* JADX INFO: renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m33160getPress7fucELk() {
            return x1d.f96027d;
        }

        /* JADX INFO: renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m33161getRelease7fucELk() {
            return x1d.f96028e;
        }

        /* JADX INFO: renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m33162getScroll7fucELk() {
            return x1d.f96032i;
        }

        /* JADX INFO: renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m33163getUnknown7fucELk() {
            return x1d.f96026c;
        }

        private C14873a() {
        }
    }

    private /* synthetic */ x1d(int i) {
        this.f96033a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x1d m33150boximpl(int i) {
        return new x1d(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m33151constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33152equalsimpl(int i, Object obj) {
        return (obj instanceof x1d) && i == ((x1d) obj).m33156unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33153equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33154hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33155toStringimpl(int i) {
        return m33153equalsimpl0(i, f96027d) ? "Press" : m33153equalsimpl0(i, f96028e) ? "Release" : m33153equalsimpl0(i, f96029f) ? "Move" : m33153equalsimpl0(i, f96030g) ? "Enter" : m33153equalsimpl0(i, f96031h) ? "Exit" : m33153equalsimpl0(i, f96032i) ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m33152equalsimpl(this.f96033a, obj);
    }

    public int hashCode() {
        return m33154hashCodeimpl(this.f96033a);
    }

    @yfb
    public String toString() {
        return m33155toStringimpl(this.f96033a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33156unboximpl() {
        return this.f96033a;
    }
}
