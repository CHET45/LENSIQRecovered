package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class gp6 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C6453a f40694b = new C6453a(null);

    /* JADX INFO: renamed from: c */
    public static final int f40695c = m29841constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f40696d = m29841constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f40697e = m29841constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f40698f = m29841constructorimpl(3);

    /* JADX INFO: renamed from: a */
    public final int f40699a;

    /* JADX INFO: renamed from: gp6$a */
    public static final class C6453a {
        public /* synthetic */ C6453a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m29849getAllGVVA2EU() {
            return gp6.f40696d;
        }

        /* JADX INFO: renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m29850getNoneGVVA2EU() {
            return gp6.f40695c;
        }

        /* JADX INFO: renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m29851getStyleGVVA2EU() {
            return gp6.f40698f;
        }

        /* JADX INFO: renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m29852getWeightGVVA2EU() {
            return gp6.f40697e;
        }

        private C6453a() {
        }
    }

    private /* synthetic */ gp6(int i) {
        this.f40699a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ gp6 m29840boximpl(int i) {
        return new gp6(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m29841constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29842equalsimpl(int i, Object obj) {
        return (obj instanceof gp6) && i == ((gp6) obj).m29848unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29843equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29844hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m29845isStyleOnimpl$ui_text_release(int i) {
        return m29843equalsimpl0(i, f40696d) || m29843equalsimpl0(i, f40698f);
    }

    /* JADX INFO: renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m29846isWeightOnimpl$ui_text_release(int i) {
        return m29843equalsimpl0(i, f40696d) || m29843equalsimpl0(i, f40697e);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29847toStringimpl(int i) {
        return m29843equalsimpl0(i, f40695c) ? "None" : m29843equalsimpl0(i, f40696d) ? "All" : m29843equalsimpl0(i, f40697e) ? "Weight" : m29843equalsimpl0(i, f40698f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m29842equalsimpl(this.f40699a, obj);
    }

    public int hashCode() {
        return m29844hashCodeimpl(this.f40699a);
    }

    @yfb
    public String toString() {
        return m29847toStringimpl(this.f40699a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m29848unboximpl() {
        return this.f40699a;
    }
}
