package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class h69 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C6725b f42479c;

    /* JADX INFO: renamed from: d */
    public static final int f42480d = 0;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final h69 f42481e;

    /* JADX INFO: renamed from: a */
    public final float f42482a;

    /* JADX INFO: renamed from: b */
    public final int f42483b;

    /* JADX INFO: renamed from: h69$a */
    @vn8
    public static final class C6724a {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f42484b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final float f42485c = m29928constructorimpl(0.0f);

        /* JADX INFO: renamed from: d */
        public static final float f42486d = m29928constructorimpl(0.5f);

        /* JADX INFO: renamed from: e */
        public static final float f42487e = m29928constructorimpl(-1.0f);

        /* JADX INFO: renamed from: f */
        public static final float f42488f = m29928constructorimpl(1.0f);

        /* JADX INFO: renamed from: a */
        public final float f42489a;

        /* JADX INFO: renamed from: h69$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m29934getBottomPIaL0Z0() {
                return C6724a.f42488f;
            }

            /* JADX INFO: renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m29935getCenterPIaL0Z0() {
                return C6724a.f42486d;
            }

            /* JADX INFO: renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m29936getProportionalPIaL0Z0() {
                return C6724a.f42487e;
            }

            /* JADX INFO: renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m29937getTopPIaL0Z0() {
                return C6724a.f42485c;
            }

            private a() {
            }
        }

        private /* synthetic */ C6724a(float f) {
            this.f42489a = f;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C6724a m29927boximpl(float f) {
            return new C6724a(f);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static float m29928constructorimpl(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m29929equalsimpl(float f, Object obj) {
            return (obj instanceof C6724a) && Float.compare(f, ((C6724a) obj).m29933unboximpl()) == 0;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m29930equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m29931hashCodeimpl(float f) {
            return Float.hashCode(f);
        }

        @yfb
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m29932toStringimpl(float f) {
            if (f == f42485c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == f42486d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == f42487e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == f42488f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public boolean equals(Object obj) {
            return m29929equalsimpl(this.f42489a, obj);
        }

        public int hashCode() {
            return m29931hashCodeimpl(this.f42489a);
        }

        @yfb
        public String toString() {
            return m29932toStringimpl(this.f42489a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m29933unboximpl() {
            return this.f42489a;
        }
    }

    /* JADX INFO: renamed from: h69$b */
    public static final class C6725b {
        public /* synthetic */ C6725b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final h69 getDefault() {
            return h69.f42481e;
        }

        private C6725b() {
        }
    }

    /* JADX INFO: renamed from: h69$c */
    @vn8
    public static final class C6726c {

        /* JADX INFO: renamed from: c */
        public static final int f42491c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f42492d = 16;

        /* JADX INFO: renamed from: a */
        public final int f42497a;

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f42490b = new a(null);

        /* JADX INFO: renamed from: e */
        public static final int f42493e = m29939constructorimpl(1);

        /* JADX INFO: renamed from: f */
        public static final int f42494f = m29939constructorimpl(16);

        /* JADX INFO: renamed from: g */
        public static final int f42495g = m29939constructorimpl(17);

        /* JADX INFO: renamed from: h */
        public static final int f42496h = m29939constructorimpl(0);

        /* JADX INFO: renamed from: h69$c$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m29947getBothEVpEnUU() {
                return C6726c.f42495g;
            }

            /* JADX INFO: renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m29948getFirstLineTopEVpEnUU() {
                return C6726c.f42493e;
            }

            /* JADX INFO: renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m29949getLastLineBottomEVpEnUU() {
                return C6726c.f42494f;
            }

            /* JADX INFO: renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m29950getNoneEVpEnUU() {
                return C6726c.f42496h;
            }

            private a() {
            }
        }

        private /* synthetic */ C6726c(int i) {
            this.f42497a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C6726c m29938boximpl(int i) {
            return new C6726c(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m29939constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m29940equalsimpl(int i, Object obj) {
            return (obj instanceof C6726c) && i == ((C6726c) obj).m29946unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m29941equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m29942hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m29943isTrimFirstLineTopimpl$ui_text_release(int i) {
            return (i & 1) > 0;
        }

        /* JADX INFO: renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m29944isTrimLastLineBottomimpl$ui_text_release(int i) {
            return (i & 16) > 0;
        }

        @yfb
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m29945toStringimpl(int i) {
            return i == f42493e ? "LineHeightStyle.Trim.FirstLineTop" : i == f42494f ? "LineHeightStyle.Trim.LastLineBottom" : i == f42495g ? "LineHeightStyle.Trim.Both" : i == f42496h ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m29940equalsimpl(this.f42497a, obj);
        }

        public int hashCode() {
            return m29942hashCodeimpl(this.f42497a);
        }

        @yfb
        public String toString() {
            return m29945toStringimpl(this.f42497a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m29946unboximpl() {
            return this.f42497a;
        }
    }

    static {
        jt3 jt3Var = null;
        f42479c = new C6725b(jt3Var);
        f42481e = new h69(C6724a.f42484b.m29936getProportionalPIaL0Z0(), C6726c.f42490b.m29947getBothEVpEnUU(), jt3Var);
    }

    public /* synthetic */ h69(float f, int i, jt3 jt3Var) {
        this(f, i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h69)) {
            return false;
        }
        h69 h69Var = (h69) obj;
        return C6724a.m29930equalsimpl0(this.f42482a, h69Var.f42482a) && C6726c.m29941equalsimpl0(this.f42483b, h69Var.f42483b);
    }

    /* JADX INFO: renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m29925getAlignmentPIaL0Z0() {
        return this.f42482a;
    }

    /* JADX INFO: renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m29926getTrimEVpEnUU() {
        return this.f42483b;
    }

    public int hashCode() {
        return (C6724a.m29931hashCodeimpl(this.f42482a) * 31) + C6726c.m29942hashCodeimpl(this.f42483b);
    }

    @yfb
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) C6724a.m29932toStringimpl(this.f42482a)) + ", trim=" + ((Object) C6726c.m29945toStringimpl(this.f42483b)) + ')';
    }

    private h69(float f, int i) {
        this.f42482a = f;
        this.f42483b = i;
    }
}
