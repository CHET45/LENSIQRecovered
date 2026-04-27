package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class nwc {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10093a f65903b = new C10093a(null);

    /* JADX INFO: renamed from: c */
    public static final int f65904c = m31269constructorimpl(1);

    /* JADX INFO: renamed from: d */
    public static final int f65905d = m31269constructorimpl(2);

    /* JADX INFO: renamed from: e */
    public static final int f65906e = m31269constructorimpl(3);

    /* JADX INFO: renamed from: f */
    public static final int f65907f = m31269constructorimpl(4);

    /* JADX INFO: renamed from: g */
    public static final int f65908g = m31269constructorimpl(5);

    /* JADX INFO: renamed from: h */
    public static final int f65909h = m31269constructorimpl(6);

    /* JADX INFO: renamed from: i */
    public static final int f65910i = m31269constructorimpl(7);

    /* JADX INFO: renamed from: a */
    public final int f65911a;

    /* JADX INFO: renamed from: nwc$a */
    public static final class C10093a {
        public /* synthetic */ C10093a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m31275getAboveBaselineJ6kI3mc() {
            return nwc.f65904c;
        }

        /* JADX INFO: renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m31276getBottomJ6kI3mc() {
            return nwc.f65906e;
        }

        /* JADX INFO: renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m31277getCenterJ6kI3mc() {
            return nwc.f65907f;
        }

        /* JADX INFO: renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m31278getTextBottomJ6kI3mc() {
            return nwc.f65909h;
        }

        /* JADX INFO: renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m31279getTextCenterJ6kI3mc() {
            return nwc.f65910i;
        }

        /* JADX INFO: renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m31280getTextTopJ6kI3mc() {
            return nwc.f65908g;
        }

        /* JADX INFO: renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m31281getTopJ6kI3mc() {
            return nwc.f65905d;
        }

        private C10093a() {
        }
    }

    private /* synthetic */ nwc(int i) {
        this.f65911a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ nwc m31268boximpl(int i) {
        return new nwc(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m31269constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31270equalsimpl(int i, Object obj) {
        return (obj instanceof nwc) && i == ((nwc) obj).m31274unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31271equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31272hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31273toStringimpl(int i) {
        return m31271equalsimpl0(i, f65904c) ? "AboveBaseline" : m31271equalsimpl0(i, f65905d) ? "Top" : m31271equalsimpl0(i, f65906e) ? "Bottom" : m31271equalsimpl0(i, f65907f) ? "Center" : m31271equalsimpl0(i, f65908g) ? "TextTop" : m31271equalsimpl0(i, f65909h) ? "TextBottom" : m31271equalsimpl0(i, f65910i) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m31270equalsimpl(this.f65911a, obj);
    }

    public int hashCode() {
        return m31272hashCodeimpl(this.f65911a);
    }

    @yfb
    public String toString() {
        return m31273toStringimpl(this.f65911a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31274unboximpl() {
        return this.f65911a;
    }
}
