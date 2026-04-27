package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class gv0 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C6551a f41237b = new C6551a(null);

    /* JADX INFO: renamed from: c */
    public static final float f41238c = m29860constructorimpl(0.5f);

    /* JADX INFO: renamed from: d */
    public static final float f41239d = m29860constructorimpl(-0.5f);

    /* JADX INFO: renamed from: e */
    public static final float f41240e = m29860constructorimpl(0.0f);

    /* JADX INFO: renamed from: a */
    public final float f41241a;

    /* JADX INFO: renamed from: gv0$a */
    public static final class C6551a {
        public /* synthetic */ C6551a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m29866getNoney9eOQZs$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m29867getSubscripty9eOQZs$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m29868getSuperscripty9eOQZs$annotations() {
        }

        /* JADX INFO: renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m29869getNoney9eOQZs() {
            return gv0.f41240e;
        }

        /* JADX INFO: renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m29870getSubscripty9eOQZs() {
            return gv0.f41239d;
        }

        /* JADX INFO: renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m29871getSuperscripty9eOQZs() {
            return gv0.f41238c;
        }

        private C6551a() {
        }
    }

    private /* synthetic */ gv0(float f) {
        this.f41241a = f;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ gv0 m29859boximpl(float f) {
        return new gv0(f);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float m29860constructorimpl(float f) {
        return f;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29861equalsimpl(float f, Object obj) {
        return (obj instanceof gv0) && Float.compare(f, ((gv0) obj).m29865unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29862equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29863hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29864toStringimpl(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m29861equalsimpl(this.f41241a, obj);
    }

    public final float getMultiplier() {
        return this.f41241a;
    }

    public int hashCode() {
        return m29863hashCodeimpl(this.f41241a);
    }

    public String toString() {
        return m29864toStringimpl(this.f41241a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m29865unboximpl() {
        return this.f41241a;
    }
}
