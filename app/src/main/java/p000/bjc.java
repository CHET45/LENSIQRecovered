package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class bjc {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C1921a f13877b = new C1921a(null);

    /* JADX INFO: renamed from: c */
    public static final int f13878c = m27998constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f13879d = m27998constructorimpl(1);

    /* JADX INFO: renamed from: a */
    public final int f13880a;

    /* JADX INFO: renamed from: bjc$a */
    public static final class C1921a {
        public /* synthetic */ C1921a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m28004getEvenOddRgk1Os() {
            return bjc.f13879d;
        }

        /* JADX INFO: renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m28005getNonZeroRgk1Os() {
            return bjc.f13878c;
        }

        private C1921a() {
        }
    }

    private /* synthetic */ bjc(int i) {
        this.f13880a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ bjc m27997boximpl(int i) {
        return new bjc(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m27998constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m27999equalsimpl(int i, Object obj) {
        return (obj instanceof bjc) && i == ((bjc) obj).m28003unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28000equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28001hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28002toStringimpl(int i) {
        return m28000equalsimpl0(i, f13878c) ? "NonZero" : m28000equalsimpl0(i, f13879d) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m27999equalsimpl(this.f13880a, obj);
    }

    public int hashCode() {
        return m28001hashCodeimpl(this.f13880a);
    }

    @yfb
    public String toString() {
        return m28002toStringimpl(this.f13880a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28003unboximpl() {
        return this.f13880a;
    }
}
