package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class wzd {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14850a f95863b = new C14850a(null);

    /* JADX INFO: renamed from: c */
    public static final int f95864c = m33138constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f95865d = m33138constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f95866e = m33138constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f95867f = m33138constructorimpl(3);

    /* JADX INFO: renamed from: a */
    public final int f95868a;

    /* JADX INFO: renamed from: wzd$a */
    public static final class C14850a {
        public /* synthetic */ C14850a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m33144getAbsoluteuksYyKA() {
            return wzd.f95867f;
        }

        /* JADX INFO: renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m33145getPerceptualuksYyKA() {
            return wzd.f95864c;
        }

        /* JADX INFO: renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m33146getRelativeuksYyKA() {
            return wzd.f95865d;
        }

        /* JADX INFO: renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m33147getSaturationuksYyKA() {
            return wzd.f95866e;
        }

        private C14850a() {
        }
    }

    private /* synthetic */ wzd(int i) {
        this.f95868a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ wzd m33137boximpl(int i) {
        return new wzd(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m33138constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33139equalsimpl(int i, Object obj) {
        return (obj instanceof wzd) && i == ((wzd) obj).m33143unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33140equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33141hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33142toStringimpl(int i) {
        return m33140equalsimpl0(i, f95864c) ? "Perceptual" : m33140equalsimpl0(i, f95865d) ? "Relative" : m33140equalsimpl0(i, f95866e) ? k95.f53184l1 : m33140equalsimpl0(i, f95867f) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m33139equalsimpl(this.f95868a, obj);
    }

    public int hashCode() {
        return m33141hashCodeimpl(this.f95868a);
    }

    @yfb
    public String toString() {
        return m33142toStringimpl(this.f95868a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33143unboximpl() {
        return this.f95868a;
    }
}
