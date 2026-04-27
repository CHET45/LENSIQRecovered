package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class nv2 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10072a f65777b = new C10072a(null);

    /* JADX INFO: renamed from: c */
    public static final int f65778c = m31240constructorimpl(1);

    /* JADX INFO: renamed from: d */
    public static final int f65779d = m31240constructorimpl(3);

    /* JADX INFO: renamed from: e */
    public static final int f65780e = m31240constructorimpl(4);

    /* JADX INFO: renamed from: f */
    public static final int f65781f = m31240constructorimpl(2);

    /* JADX INFO: renamed from: g */
    public static final int f65782g = m31240constructorimpl(0);

    /* JADX INFO: renamed from: a */
    public final int f65783a;

    /* JADX INFO: renamed from: nv2$a */
    public static final class C10072a {
        public /* synthetic */ C10072a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: from-LGGHU18$ui_release, reason: not valid java name */
        public final int m31246fromLGGHU18$ui_release(int i) {
            if (i == 0) {
                return m31249getNoneA48pgw8();
            }
            if (i == 1) {
                return m31250getTextA48pgw8();
            }
            if (i == 2) {
                return m31251getToggleA48pgw8();
            }
            if (i == 3) {
                return m31248getListA48pgw8();
            }
            if (i == 4) {
                return m31247getDateA48pgw8();
            }
            throw new IllegalArgumentException("Invalid autofill type value: " + i);
        }

        /* JADX INFO: renamed from: getDate-A48pgw8, reason: not valid java name */
        public final int m31247getDateA48pgw8() {
            return nv2.f65780e;
        }

        /* JADX INFO: renamed from: getList-A48pgw8, reason: not valid java name */
        public final int m31248getListA48pgw8() {
            return nv2.f65779d;
        }

        /* JADX INFO: renamed from: getNone-A48pgw8, reason: not valid java name */
        public final int m31249getNoneA48pgw8() {
            return nv2.f65782g;
        }

        /* JADX INFO: renamed from: getText-A48pgw8, reason: not valid java name */
        public final int m31250getTextA48pgw8() {
            return nv2.f65778c;
        }

        /* JADX INFO: renamed from: getToggle-A48pgw8, reason: not valid java name */
        public final int m31251getToggleA48pgw8() {
            return nv2.f65781f;
        }

        private C10072a() {
        }
    }

    private /* synthetic */ nv2(int i) {
        this.f65783a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ nv2 m31239boximpl(int i) {
        return new nv2(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m31240constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31241equalsimpl(int i, Object obj) {
        return (obj instanceof nv2) && i == ((nv2) obj).m31245unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31242equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31243hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31244toStringimpl(int i) {
        return "ContentDataType(dataType=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m31241equalsimpl(this.f65783a, obj);
    }

    public final int getDataType() {
        return this.f65783a;
    }

    public int hashCode() {
        return m31243hashCodeimpl(this.f65783a);
    }

    public String toString() {
        return m31244toStringimpl(this.f65783a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31245unboximpl() {
        return this.f65783a;
    }
}
