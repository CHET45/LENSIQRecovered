package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class tzg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C13299a f86446b = new C13299a(null);

    /* JADX INFO: renamed from: c */
    public static final int f86447c = m32470constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f86448d = m32470constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f86449e = m32470constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f86450f = m32470constructorimpl(3);

    /* JADX INFO: renamed from: a */
    public final int f86451a;

    /* JADX INFO: renamed from: tzg$a */
    public static final class C13299a {
        public /* synthetic */ C13299a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m32476getClamp3opZhB0() {
            return tzg.f86447c;
        }

        /* JADX INFO: renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m32477getDecal3opZhB0() {
            return tzg.f86450f;
        }

        /* JADX INFO: renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m32478getMirror3opZhB0() {
            return tzg.f86449e;
        }

        /* JADX INFO: renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m32479getRepeated3opZhB0() {
            return tzg.f86448d;
        }

        private C13299a() {
        }
    }

    private /* synthetic */ tzg(int i) {
        this.f86451a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ tzg m32469boximpl(int i) {
        return new tzg(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m32470constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32471equalsimpl(int i, Object obj) {
        return (obj instanceof tzg) && i == ((tzg) obj).m32475unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32472equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32473hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32474toStringimpl(int i) {
        return m32472equalsimpl0(i, f86447c) ? "Clamp" : m32472equalsimpl0(i, f86448d) ? "Repeated" : m32472equalsimpl0(i, f86449e) ? "Mirror" : m32472equalsimpl0(i, f86450f) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m32471equalsimpl(this.f86451a, obj);
    }

    public int hashCode() {
        return m32473hashCodeimpl(this.f86451a);
    }

    @yfb
    public String toString() {
        return m32474toStringimpl(this.f86451a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32475unboximpl() {
        return this.f86451a;
    }
}
