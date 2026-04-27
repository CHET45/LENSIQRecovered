package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class wqg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14751a f95173b = new C14751a(null);

    /* JADX INFO: renamed from: c */
    public static final int f95174c = m33085constructorimpl(1);

    /* JADX INFO: renamed from: d */
    public static final int f95175d = m33085constructorimpl(2);

    /* JADX INFO: renamed from: e */
    public static final int f95176e = m33085constructorimpl(3);

    /* JADX INFO: renamed from: f */
    public static final int f95177f = m33085constructorimpl(4);

    /* JADX INFO: renamed from: g */
    public static final int f95178g = m33085constructorimpl(5);

    /* JADX INFO: renamed from: h */
    public static final int f95179h = m33085constructorimpl(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a */
    public final int f95180a;

    /* JADX INFO: renamed from: wqg$a */
    public static final class C14751a {
        public /* synthetic */ C14751a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m33091getContents_7Xco() {
            return wqg.f95176e;
        }

        /* JADX INFO: renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m33092getContentOrLtrs_7Xco() {
            return wqg.f95177f;
        }

        /* JADX INFO: renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m33093getContentOrRtls_7Xco() {
            return wqg.f95178g;
        }

        /* JADX INFO: renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m33094getLtrs_7Xco() {
            return wqg.f95174c;
        }

        /* JADX INFO: renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m33095getRtls_7Xco() {
            return wqg.f95175d;
        }

        /* JADX INFO: renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m33096getUnspecifieds_7Xco() {
            return wqg.f95179h;
        }

        private C14751a() {
        }
    }

    private /* synthetic */ wqg(int i) {
        this.f95180a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ wqg m33084boximpl(int i) {
        return new wqg(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m33085constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33086equalsimpl(int i, Object obj) {
        return (obj instanceof wqg) && i == ((wqg) obj).m33090unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33087equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33088hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33089toStringimpl(int i) {
        return m33087equalsimpl0(i, f95174c) ? "Ltr" : m33087equalsimpl0(i, f95175d) ? "Rtl" : m33087equalsimpl0(i, f95176e) ? "Content" : m33087equalsimpl0(i, f95177f) ? "ContentOrLtr" : m33087equalsimpl0(i, f95178g) ? "ContentOrRtl" : m33087equalsimpl0(i, f95179h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33086equalsimpl(this.f95180a, obj);
    }

    public int hashCode() {
        return m33088hashCodeimpl(this.f95180a);
    }

    @yfb
    public String toString() {
        return m33089toStringimpl(this.f95180a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33090unboximpl() {
        return this.f95180a;
    }
}
