package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class r0g {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C11837a f76724b = new C11837a(null);

    /* JADX INFO: renamed from: c */
    public static final int f76725c = m32062constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f76726d = m32062constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f76727e = m32062constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f76728a;

    /* JADX INFO: renamed from: r0g$a */
    public static final class C11837a {
        public /* synthetic */ C11837a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m32068getMorphYpspkwk() {
            return r0g.f76727e;
        }

        /* JADX INFO: renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m32069getRotateYpspkwk() {
            return r0g.f76726d;
        }

        /* JADX INFO: renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m32070getTranslateYpspkwk() {
            return r0g.f76725c;
        }

        private C11837a() {
        }
    }

    private /* synthetic */ r0g(int i) {
        this.f76728a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r0g m32061boximpl(int i) {
        return new r0g(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m32062constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32063equalsimpl(int i, Object obj) {
        return (obj instanceof r0g) && i == ((r0g) obj).m32067unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32064equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32065hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32066toStringimpl(int i) {
        return m32064equalsimpl0(i, f76725c) ? "Translate" : m32064equalsimpl0(i, f76726d) ? "Rotate" : m32064equalsimpl0(i, f76727e) ? "Morph" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m32063equalsimpl(this.f76728a, obj);
    }

    public int hashCode() {
        return m32065hashCodeimpl(this.f76728a);
    }

    @yfb
    public String toString() {
        return m32066toStringimpl(this.f76728a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32067unboximpl() {
        return this.f76728a;
    }
}
