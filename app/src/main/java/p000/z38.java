package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class z38 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15972a f103982b = new C15972a(null);

    /* JADX INFO: renamed from: c */
    public static final int f103983c = m33479constructorimpl(1);

    /* JADX INFO: renamed from: d */
    public static final int f103984d = m33479constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f103985a;

    /* JADX INFO: renamed from: z38$a */
    public static final class C15972a {
        public /* synthetic */ C15972a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m33485getKeyboardaOaMEAU() {
            return z38.f103984d;
        }

        /* JADX INFO: renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m33486getTouchaOaMEAU() {
            return z38.f103983c;
        }

        private C15972a() {
        }
    }

    private /* synthetic */ z38(int i) {
        this.f103985a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ z38 m33478boximpl(int i) {
        return new z38(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m33479constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33480equalsimpl(int i, Object obj) {
        return (obj instanceof z38) && i == ((z38) obj).m33484unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33481equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33482hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33483toStringimpl(int i) {
        return m33481equalsimpl0(i, f103983c) ? "Touch" : m33481equalsimpl0(i, f103984d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m33480equalsimpl(this.f103985a, obj);
    }

    public int hashCode() {
        return m33482hashCodeimpl(this.f103985a);
    }

    @yfb
    public String toString() {
        return m33483toStringimpl(this.f103985a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33484unboximpl() {
        return this.f103985a;
    }
}
