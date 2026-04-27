package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class yb9 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15602a f101040b = new C15602a(null);

    /* JADX INFO: renamed from: c */
    public static final int f101041c = m33378constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f101042d = m33378constructorimpl(1);

    /* JADX INFO: renamed from: a */
    public final int f101043a;

    /* JADX INFO: renamed from: yb9$a */
    public static final class C15602a {
        public /* synthetic */ C15602a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m33384getAssertive0phEisY() {
            return yb9.f101042d;
        }

        /* JADX INFO: renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m33385getPolite0phEisY() {
            return yb9.f101041c;
        }

        private C15602a() {
        }
    }

    private /* synthetic */ yb9(int i) {
        this.f101043a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ yb9 m33377boximpl(int i) {
        return new yb9(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m33378constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33379equalsimpl(int i, Object obj) {
        return (obj instanceof yb9) && i == ((yb9) obj).m33383unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33380equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33381hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33382toStringimpl(int i) {
        return m33380equalsimpl0(i, f101041c) ? "Polite" : m33380equalsimpl0(i, f101042d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m33379equalsimpl(this.f101043a, obj);
    }

    public int hashCode() {
        return m33381hashCodeimpl(this.f101043a);
    }

    @yfb
    public String toString() {
        return m33382toStringimpl(this.f101043a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33383unboximpl() {
        return this.f101043a;
    }
}
