package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class rcc {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C12018a f77828b = new C12018a(null);

    /* JADX INFO: renamed from: c */
    public static final int f77829c = m32108constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f77830d = m32108constructorimpl(1);

    /* JADX INFO: renamed from: a */
    public final int f77831a;

    /* JADX INFO: renamed from: rcc$a */
    public static final class C12018a {
        public /* synthetic */ C12018a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m32114getFillTiuSbCo() {
            return rcc.f77829c;
        }

        /* JADX INFO: renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m32115getStrokeTiuSbCo() {
            return rcc.f77830d;
        }

        private C12018a() {
        }
    }

    private /* synthetic */ rcc(int i) {
        this.f77831a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ rcc m32107boximpl(int i) {
        return new rcc(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m32108constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32109equalsimpl(int i, Object obj) {
        return (obj instanceof rcc) && i == ((rcc) obj).m32113unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32110equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32111hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32112toStringimpl(int i) {
        return m32110equalsimpl0(i, f77829c) ? "Fill" : m32110equalsimpl0(i, f77830d) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m32109equalsimpl(this.f77831a, obj);
    }

    public int hashCode() {
        return m32111hashCodeimpl(this.f77831a);
    }

    @yfb
    public String toString() {
        return m32112toStringimpl(this.f77831a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32113unboximpl() {
        return this.f77831a;
    }
}
