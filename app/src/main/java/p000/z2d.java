package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class z2d {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15956a f103875b = new C15956a(null);

    /* JADX INFO: renamed from: c */
    public static final int f103876c = m33467constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f103877d = m33467constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f103878e = m33467constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f103879f = m33467constructorimpl(3);

    /* JADX INFO: renamed from: g */
    public static final int f103880g = m33467constructorimpl(4);

    /* JADX INFO: renamed from: a */
    public final int f103881a;

    /* JADX INFO: renamed from: z2d$a */
    public static final class C15956a {
        public /* synthetic */ C15956a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m33473getEraserT8wyACA() {
            return z2d.f103880g;
        }

        /* JADX INFO: renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m33474getMouseT8wyACA() {
            return z2d.f103878e;
        }

        /* JADX INFO: renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m33475getStylusT8wyACA() {
            return z2d.f103879f;
        }

        /* JADX INFO: renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m33476getTouchT8wyACA() {
            return z2d.f103877d;
        }

        /* JADX INFO: renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m33477getUnknownT8wyACA() {
            return z2d.f103876c;
        }

        private C15956a() {
        }
    }

    private /* synthetic */ z2d(int i) {
        this.f103881a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ z2d m33466boximpl(int i) {
        return new z2d(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m33467constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33468equalsimpl(int i, Object obj) {
        return (obj instanceof z2d) && i == ((z2d) obj).m33472unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33469equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33470hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33471toStringimpl(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m33468equalsimpl(this.f103881a, obj);
    }

    public int hashCode() {
        return m33470hashCodeimpl(this.f103881a);
    }

    @yfb
    public String toString() {
        return m33471toStringimpl(this.f103881a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33472unboximpl() {
        return this.f103881a;
    }
}
