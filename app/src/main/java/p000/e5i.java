package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class e5i {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C5133a f31871b = new C5133a(null);

    /* JADX INFO: renamed from: c */
    public static final int f31872c = m28732constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f31873d = m28732constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f31874e = m28732constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f31875a;

    /* JADX INFO: renamed from: e5i$a */
    public static final class C5133a {
        public /* synthetic */ C5133a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m28738getTriangleFanc2xauaI() {
            return e5i.f31874e;
        }

        /* JADX INFO: renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m28739getTriangleStripc2xauaI() {
            return e5i.f31873d;
        }

        /* JADX INFO: renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m28740getTrianglesc2xauaI() {
            return e5i.f31872c;
        }

        private C5133a() {
        }
    }

    private /* synthetic */ e5i(int i) {
        this.f31875a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ e5i m28731boximpl(int i) {
        return new e5i(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m28732constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28733equalsimpl(int i, Object obj) {
        return (obj instanceof e5i) && i == ((e5i) obj).m28737unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28734equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28735hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28736toStringimpl(int i) {
        return m28734equalsimpl0(i, f31872c) ? "Triangles" : m28734equalsimpl0(i, f31873d) ? "TriangleStrip" : m28734equalsimpl0(i, f31874e) ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m28733equalsimpl(this.f31875a, obj);
    }

    public int hashCode() {
        return m28735hashCodeimpl(this.f31875a);
    }

    @yfb
    public String toString() {
        return m28736toStringimpl(this.f31875a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28737unboximpl() {
        return this.f31875a;
    }
}
