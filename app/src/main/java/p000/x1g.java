package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class x1g {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14874a f96037b = new C14874a(null);

    /* JADX INFO: renamed from: c */
    public static final int f96038c = m33165constructorimpl(-1);

    /* JADX INFO: renamed from: d */
    public static final int f96039d = m33165constructorimpl(1);

    /* JADX INFO: renamed from: a */
    public final int f96040a;

    /* JADX INFO: renamed from: x1g$a */
    public static final class C14874a {
        public /* synthetic */ C14874a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m33171getDelayEo1U57Q() {
            return x1g.f96038c;
        }

        /* JADX INFO: renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m33172getFastForwardEo1U57Q() {
            return x1g.f96039d;
        }

        private C14874a() {
        }
    }

    private /* synthetic */ x1g(int i) {
        this.f96040a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x1g m33164boximpl(int i) {
        return new x1g(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m33165constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33166equalsimpl(int i, Object obj) {
        return (obj instanceof x1g) && i == ((x1g) obj).m33170unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33167equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33168hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33169toStringimpl(int i) {
        return "StartOffsetType(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m33166equalsimpl(this.f96040a, obj);
    }

    public int hashCode() {
        return m33168hashCodeimpl(this.f96040a);
    }

    public String toString() {
        return m33169toStringimpl(this.f96040a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33170unboximpl() {
        return this.f96040a;
    }
}
