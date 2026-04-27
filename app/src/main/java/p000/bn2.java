package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class bn2 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C1953a f14169b = new C1953a(null);

    /* JADX INFO: renamed from: c */
    public static final int f14170c = m28010constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f14171d = m28010constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f14172e = m28010constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f14173a;

    /* JADX INFO: renamed from: bn2$a */
    public static final class C1953a {
        public /* synthetic */ C1953a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAuto-ke2Ky5w, reason: not valid java name */
        public final int m28016getAutoke2Ky5w() {
            return bn2.f14170c;
        }

        /* JADX INFO: renamed from: getModulateAlpha-ke2Ky5w, reason: not valid java name */
        public final int m28017getModulateAlphake2Ky5w() {
            return bn2.f14172e;
        }

        /* JADX INFO: renamed from: getOffscreen-ke2Ky5w, reason: not valid java name */
        public final int m28018getOffscreenke2Ky5w() {
            return bn2.f14171d;
        }

        private C1953a() {
        }
    }

    private /* synthetic */ bn2(int i) {
        this.f14173a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ bn2 m28009boximpl(int i) {
        return new bn2(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m28010constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28011equalsimpl(int i, Object obj) {
        return (obj instanceof bn2) && i == ((bn2) obj).m28015unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28012equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28013hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28014toStringimpl(int i) {
        return "CompositingStrategy(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m28011equalsimpl(this.f14173a, obj);
    }

    public int hashCode() {
        return m28013hashCodeimpl(this.f14173a);
    }

    public String toString() {
        return m28014toStringimpl(this.f14173a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28015unboximpl() {
        return this.f14173a;
    }
}
