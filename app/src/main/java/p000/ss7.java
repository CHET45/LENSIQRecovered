package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class ss7 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C12765a f82741b = new C12765a(null);

    /* JADX INFO: renamed from: c */
    public static final int f82742c = m32320constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f82743d = m32320constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f82744e = m32320constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f82745f = m32320constructorimpl(3);

    /* JADX INFO: renamed from: g */
    public static final int f82746g = m32320constructorimpl(4);

    /* JADX INFO: renamed from: a */
    public final int f82747a;

    /* JADX INFO: renamed from: ss7$a */
    public static final class C12765a {
        public /* synthetic */ C12765a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m32326getAlpha8_sVssgQ() {
            return ss7.f82743d;
        }

        /* JADX INFO: renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m32327getArgb8888_sVssgQ() {
            return ss7.f82742c;
        }

        /* JADX INFO: renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m32328getF16_sVssgQ() {
            return ss7.f82745f;
        }

        /* JADX INFO: renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m32329getGpu_sVssgQ() {
            return ss7.f82746g;
        }

        /* JADX INFO: renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m32330getRgb565_sVssgQ() {
            return ss7.f82744e;
        }

        private C12765a() {
        }
    }

    private /* synthetic */ ss7(int i) {
        this.f82747a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ss7 m32319boximpl(int i) {
        return new ss7(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m32320constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32321equalsimpl(int i, Object obj) {
        return (obj instanceof ss7) && i == ((ss7) obj).m32325unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32322equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32323hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32324toStringimpl(int i) {
        return m32322equalsimpl0(i, f82742c) ? "Argb8888" : m32322equalsimpl0(i, f82743d) ? "Alpha8" : m32322equalsimpl0(i, f82744e) ? "Rgb565" : m32322equalsimpl0(i, f82745f) ? "F16" : m32322equalsimpl0(i, f82746g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m32321equalsimpl(this.f82747a, obj);
    }

    public final int getValue() {
        return this.f82747a;
    }

    public int hashCode() {
        return m32323hashCodeimpl(this.f82747a);
    }

    @yfb
    public String toString() {
        return m32324toStringimpl(this.f82747a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32325unboximpl() {
        return this.f82747a;
    }
}
