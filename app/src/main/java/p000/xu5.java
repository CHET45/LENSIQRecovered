package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class xu5 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15303a f99348b = new C15303a(null);

    /* JADX INFO: renamed from: c */
    public static final int f99349c = m33289constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f99350d = m33289constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f99351e = m33289constructorimpl(2);

    /* JADX INFO: renamed from: f */
    public static final int f99352f = m33289constructorimpl(3);

    /* JADX INFO: renamed from: a */
    public final int f99353a;

    /* JADX INFO: renamed from: xu5$a */
    public static final class C15303a {
        public /* synthetic */ C15303a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m33295getHighfv9h1I() {
            return xu5.f99352f;
        }

        /* JADX INFO: renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m33296getLowfv9h1I() {
            return xu5.f99350d;
        }

        /* JADX INFO: renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m33297getMediumfv9h1I() {
            return xu5.f99351e;
        }

        /* JADX INFO: renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m33298getNonefv9h1I() {
            return xu5.f99349c;
        }

        private C15303a() {
        }
    }

    private /* synthetic */ xu5(int i) {
        this.f99353a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ xu5 m33288boximpl(int i) {
        return new xu5(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m33289constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33290equalsimpl(int i, Object obj) {
        return (obj instanceof xu5) && i == ((xu5) obj).m33294unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33291equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33292hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33293toStringimpl(int i) {
        return m33291equalsimpl0(i, f99349c) ? "None" : m33291equalsimpl0(i, f99350d) ? "Low" : m33291equalsimpl0(i, f99351e) ? "Medium" : m33291equalsimpl0(i, f99352f) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m33290equalsimpl(this.f99353a, obj);
    }

    public final int getValue() {
        return this.f99353a;
    }

    public int hashCode() {
        return m33292hashCodeimpl(this.f99353a);
    }

    @yfb
    public String toString() {
        return m33293toStringimpl(this.f99353a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33294unboximpl() {
        return this.f99353a;
    }
}
