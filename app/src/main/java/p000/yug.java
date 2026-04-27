package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class yug {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15815a f103009b = new C15815a(null);

    /* JADX INFO: renamed from: c */
    public static final int f103010c = m33405constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f103011d = m33405constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f103012e = m33405constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f103013a;

    /* JADX INFO: renamed from: yug$a */
    public static final class C15815a {
        public /* synthetic */ C15815a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m33411getHiddenvTwcZD0() {
            return yug.f103012e;
        }

        /* JADX INFO: renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m33412getRevealLastTypedvTwcZD0() {
            return yug.f103011d;
        }

        /* JADX INFO: renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m33413getVisiblevTwcZD0() {
            return yug.f103010c;
        }

        private C15815a() {
        }
    }

    private /* synthetic */ yug(int i) {
        this.f103013a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ yug m33404boximpl(int i) {
        return new yug(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m33405constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33406equalsimpl(int i, Object obj) {
        return (obj instanceof yug) && i == ((yug) obj).m33410unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33407equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33408hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33409toStringimpl(int i) {
        return "TextObfuscationMode(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m33406equalsimpl(this.f103013a, obj);
    }

    public final int getValue() {
        return this.f103013a;
    }

    public int hashCode() {
        return m33408hashCodeimpl(this.f103013a);
    }

    public String toString() {
        return m33409toStringimpl(this.f103013a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33410unboximpl() {
        return this.f103013a;
    }
}
