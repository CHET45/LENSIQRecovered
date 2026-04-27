package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class htg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C7018a f44857b = new C7018a(null);

    /* JADX INFO: renamed from: c */
    public static final int f44858c = m30119constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f44859d = m30119constructorimpl(1);

    /* JADX INFO: renamed from: a */
    public final int f44860a;

    /* JADX INFO: renamed from: htg$a */
    public static final class C7018a {
        public /* synthetic */ C7018a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getCharacter-DRrd7Zo, reason: not valid java name */
        public final int m30125getCharacterDRrd7Zo() {
            return htg.f44858c;
        }

        /* JADX INFO: renamed from: getWord-DRrd7Zo, reason: not valid java name */
        public final int m30126getWordDRrd7Zo() {
            return htg.f44859d;
        }

        private C7018a() {
        }
    }

    private /* synthetic */ htg(int i) {
        this.f44860a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ htg m30118boximpl(int i) {
        return new htg(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m30119constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30120equalsimpl(int i, Object obj) {
        return (obj instanceof htg) && i == ((htg) obj).m30124unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30121equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30122hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30123toStringimpl(int i) {
        return "TextGranularity(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m30120equalsimpl(this.f44860a, obj);
    }

    public int hashCode() {
        return m30122hashCodeimpl(this.f44860a);
    }

    public String toString() {
        return m30123toStringimpl(this.f44860a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30124unboximpl() {
        return this.f44860a;
    }
}
