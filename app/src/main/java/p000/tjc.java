package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class tjc {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C13074a f85067b = new C13074a(null);

    /* JADX INFO: renamed from: c */
    public static final int f85068c = m32401constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f85069d = m32401constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f85070e = m32401constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f85071f = m32401constructorimpl(3);

    /* JADX INFO: renamed from: g */
    public static final int f85072g = m32401constructorimpl(4);

    /* JADX INFO: renamed from: a */
    public final int f85073a;

    /* JADX INFO: renamed from: tjc$a */
    public static final class C13074a {
        public /* synthetic */ C13074a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m32407getDifferenceb3I0S0c() {
            return tjc.f85068c;
        }

        /* JADX INFO: renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m32408getIntersectb3I0S0c() {
            return tjc.f85069d;
        }

        /* JADX INFO: renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m32409getReverseDifferenceb3I0S0c() {
            return tjc.f85072g;
        }

        /* JADX INFO: renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m32410getUnionb3I0S0c() {
            return tjc.f85070e;
        }

        /* JADX INFO: renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m32411getXorb3I0S0c() {
            return tjc.f85071f;
        }

        private C13074a() {
        }
    }

    private /* synthetic */ tjc(int i) {
        this.f85073a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ tjc m32400boximpl(int i) {
        return new tjc(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m32401constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32402equalsimpl(int i, Object obj) {
        return (obj instanceof tjc) && i == ((tjc) obj).m32406unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32403equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32404hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32405toStringimpl(int i) {
        return m32403equalsimpl0(i, f85068c) ? "Difference" : m32403equalsimpl0(i, f85069d) ? "Intersect" : m32403equalsimpl0(i, f85070e) ? "Union" : m32403equalsimpl0(i, f85071f) ? "Xor" : m32403equalsimpl0(i, f85072g) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m32402equalsimpl(this.f85073a, obj);
    }

    public int hashCode() {
        return m32404hashCodeimpl(this.f85073a);
    }

    @yfb
    public String toString() {
        return m32405toStringimpl(this.f85073a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32406unboximpl() {
        return this.f85073a;
    }
}
