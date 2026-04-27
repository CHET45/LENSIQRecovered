package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class oo6 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10484a f68233b = new C10484a(null);

    /* JADX INFO: renamed from: c */
    public static final int f68234c = m31517constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f68235d = m31517constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f68236e = m31517constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f68237a;

    /* JADX INFO: renamed from: oo6$a */
    public static final class C10484a {
        public /* synthetic */ C10484a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m31523getAsyncPKNRLFQ() {
            return oo6.f68236e;
        }

        /* JADX INFO: renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m31524getBlockingPKNRLFQ() {
            return oo6.f68234c;
        }

        /* JADX INFO: renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m31525getOptionalLocalPKNRLFQ() {
            return oo6.f68235d;
        }

        private C10484a() {
        }
    }

    private /* synthetic */ oo6(int i) {
        this.f68237a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ oo6 m31516boximpl(int i) {
        return new oo6(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m31517constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31518equalsimpl(int i, Object obj) {
        return (obj instanceof oo6) && i == ((oo6) obj).m31522unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31519equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31520hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31521toStringimpl(int i) {
        if (m31519equalsimpl0(i, f68234c)) {
            return "Blocking";
        }
        if (m31519equalsimpl0(i, f68235d)) {
            return "Optional";
        }
        if (m31519equalsimpl0(i, f68236e)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m31518equalsimpl(this.f68237a, obj);
    }

    public final int getValue() {
        return this.f68237a;
    }

    public int hashCode() {
        return m31520hashCodeimpl(this.f68237a);
    }

    @yfb
    public String toString() {
        return m31521toStringimpl(this.f68237a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31522unboximpl() {
        return this.f68237a;
    }
}
