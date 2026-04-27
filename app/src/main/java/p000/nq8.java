package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class nq8 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9988a f65270b = new C9988a(null);

    /* JADX INFO: renamed from: c */
    public static final int f65271c = m31180constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f65272d = m31180constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f65273e = m31180constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f65274a;

    /* JADX INFO: renamed from: nq8$a */
    public static final class C9988a {
        public /* synthetic */ C9988a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m31186getKeyDownCS__XNY() {
            return nq8.f65273e;
        }

        /* JADX INFO: renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m31187getKeyUpCS__XNY() {
            return nq8.f65272d;
        }

        /* JADX INFO: renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m31188getUnknownCS__XNY() {
            return nq8.f65271c;
        }

        private C9988a() {
        }
    }

    private /* synthetic */ nq8(int i) {
        this.f65274a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ nq8 m31179boximpl(int i) {
        return new nq8(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m31180constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31181equalsimpl(int i, Object obj) {
        return (obj instanceof nq8) && i == ((nq8) obj).m31185unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31182equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31183hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31184toStringimpl(int i) {
        return m31182equalsimpl0(i, f65272d) ? "KeyUp" : m31182equalsimpl0(i, f65273e) ? "KeyDown" : m31182equalsimpl0(i, f65271c) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m31181equalsimpl(this.f65274a, obj);
    }

    public int hashCode() {
        return m31183hashCodeimpl(this.f65274a);
    }

    @yfb
    public String toString() {
        return m31184toStringimpl(this.f65274a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31185unboximpl() {
        return this.f65274a;
    }
}
