package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class xug {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C15307a f99420c;

    /* JADX INFO: renamed from: d */
    public static final int f99421d = 0;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final xug f99422e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final xug f99423f;

    /* JADX INFO: renamed from: a */
    public final int f99424a;

    /* JADX INFO: renamed from: b */
    public final boolean f99425b;

    /* JADX INFO: renamed from: xug$a */
    public static final class C15307a {
        public /* synthetic */ C15307a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final xug getAnimated() {
            return xug.f99423f;
        }

        @yfb
        public final xug getStatic() {
            return xug.f99422e;
        }

        private C15307a() {
        }
    }

    /* JADX INFO: renamed from: xug$b */
    @vn8
    public static final class C15308b {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f99426b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f99427c = m33308constructorimpl(1);

        /* JADX INFO: renamed from: d */
        public static final int f99428d = m33308constructorimpl(2);

        /* JADX INFO: renamed from: e */
        public static final int f99429e = m33308constructorimpl(3);

        /* JADX INFO: renamed from: a */
        public final int f99430a;

        /* JADX INFO: renamed from: xug$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m33314getFontHinting4e0Vf04() {
                return C15308b.f99428d;
            }

            /* JADX INFO: renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m33315getLinear4e0Vf04() {
                return C15308b.f99427c;
            }

            /* JADX INFO: renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m33316getNone4e0Vf04() {
                return C15308b.f99429e;
            }

            private a() {
            }
        }

        private /* synthetic */ C15308b(int i) {
            this.f99430a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C15308b m33307boximpl(int i) {
            return new C15308b(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m33308constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m33309equalsimpl(int i, Object obj) {
            return (obj instanceof C15308b) && i == ((C15308b) obj).m33313unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33310equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m33311hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @yfb
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m33312toStringimpl(int i) {
            return m33310equalsimpl0(i, f99427c) ? "Linearity.Linear" : m33310equalsimpl0(i, f99428d) ? "Linearity.FontHinting" : m33310equalsimpl0(i, f99429e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m33309equalsimpl(this.f99430a, obj);
        }

        public int hashCode() {
            return m33311hashCodeimpl(this.f99430a);
        }

        @yfb
        public String toString() {
            return m33312toStringimpl(this.f99430a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m33313unboximpl() {
            return this.f99430a;
        }
    }

    static {
        jt3 jt3Var = null;
        f99420c = new C15307a(jt3Var);
        C15308b.a aVar = C15308b.f99426b;
        f99422e = new xug(aVar.m33314getFontHinting4e0Vf04(), false, jt3Var);
        f99423f = new xug(aVar.m33315getLinear4e0Vf04(), true, jt3Var);
    }

    public /* synthetic */ xug(int i, boolean z, jt3 jt3Var) {
        this(i, z);
    }

    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ xug m33304copyJdDtMQo$ui_text_release$default(xug xugVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = xugVar.f99424a;
        }
        if ((i2 & 2) != 0) {
            z = xugVar.f99425b;
        }
        return xugVar.m33305copyJdDtMQo$ui_text_release(i, z);
    }

    @yfb
    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final xug m33305copyJdDtMQo$ui_text_release(int i, boolean z) {
        return new xug(i, z, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xug)) {
            return false;
        }
        xug xugVar = (xug) obj;
        return C15308b.m33310equalsimpl0(this.f99424a, xugVar.f99424a) && this.f99425b == xugVar.f99425b;
    }

    /* JADX INFO: renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name */
    public final int m33306getLinearity4e0Vf04$ui_text_release() {
        return this.f99424a;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.f99425b;
    }

    public int hashCode() {
        return (C15308b.m33311hashCodeimpl(this.f99424a) * 31) + Boolean.hashCode(this.f99425b);
    }

    @yfb
    public String toString() {
        return md8.areEqual(this, f99422e) ? "TextMotion.Static" : md8.areEqual(this, f99423f) ? "TextMotion.Animated" : "Invalid";
    }

    private xug(int i, boolean z) {
        this.f99424a = i;
        this.f99425b = z;
    }
}
