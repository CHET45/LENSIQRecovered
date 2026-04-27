package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class vr8 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14227a f92051b = new C14227a(null);

    /* JADX INFO: renamed from: c */
    public static final int f92052c = m32796constructorimpl(-1);

    /* JADX INFO: renamed from: d */
    public static final int f92053d = m32796constructorimpl(0);

    /* JADX INFO: renamed from: e */
    public static final int f92054e = m32796constructorimpl(1);

    /* JADX INFO: renamed from: f */
    public static final int f92055f = m32796constructorimpl(2);

    /* JADX INFO: renamed from: g */
    public static final int f92056g = m32796constructorimpl(3);

    /* JADX INFO: renamed from: a */
    public final int f92057a;

    /* JADX INFO: renamed from: vr8$a */
    public static final class C14227a {
        public /* synthetic */ C14227a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m32802getCharactersIUNYP9k$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m32803getNoneIUNYP9k$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m32804getSentencesIUNYP9k$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m32805getUnspecifiedIUNYP9k$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m32806getWordsIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m32807getCharactersIUNYP9k() {
            return vr8.f92054e;
        }

        /* JADX INFO: renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m32808getNoneIUNYP9k() {
            return vr8.f92053d;
        }

        /* JADX INFO: renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m32809getSentencesIUNYP9k() {
            return vr8.f92056g;
        }

        /* JADX INFO: renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m32810getUnspecifiedIUNYP9k() {
            return vr8.f92052c;
        }

        /* JADX INFO: renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m32811getWordsIUNYP9k() {
            return vr8.f92055f;
        }

        private C14227a() {
        }
    }

    private /* synthetic */ vr8(int i) {
        this.f92057a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ vr8 m32795boximpl(int i) {
        return new vr8(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m32796constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32797equalsimpl(int i, Object obj) {
        return (obj instanceof vr8) && i == ((vr8) obj).m32801unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32798equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32799hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32800toStringimpl(int i) {
        return m32798equalsimpl0(i, f92052c) ? "Unspecified" : m32798equalsimpl0(i, f92053d) ? "None" : m32798equalsimpl0(i, f92054e) ? "Characters" : m32798equalsimpl0(i, f92055f) ? "Words" : m32798equalsimpl0(i, f92056g) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m32797equalsimpl(this.f92057a, obj);
    }

    public int hashCode() {
        return m32799hashCodeimpl(this.f92057a);
    }

    @yfb
    public String toString() {
        return m32800toStringimpl(this.f92057a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32801unboximpl() {
        return this.f92057a;
    }
}
