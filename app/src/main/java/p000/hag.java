package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class hag {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C6778a f43019b = new C6778a(null);

    /* JADX INFO: renamed from: c */
    public static final int f43020c = m29978constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f43021d = m29978constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f43022e = m29978constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f43023a;

    /* JADX INFO: renamed from: hag$a */
    public static final class C6778a {
        public /* synthetic */ C6778a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m29984getBevelLxFBmk8() {
            return hag.f43022e;
        }

        /* JADX INFO: renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m29985getMiterLxFBmk8() {
            return hag.f43020c;
        }

        /* JADX INFO: renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m29986getRoundLxFBmk8() {
            return hag.f43021d;
        }

        private C6778a() {
        }
    }

    private /* synthetic */ hag(int i) {
        this.f43023a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ hag m29977boximpl(int i) {
        return new hag(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m29978constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29979equalsimpl(int i, Object obj) {
        return (obj instanceof hag) && i == ((hag) obj).m29983unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29980equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29981hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29982toStringimpl(int i) {
        return m29980equalsimpl0(i, f43020c) ? "Miter" : m29980equalsimpl0(i, f43021d) ? "Round" : m29980equalsimpl0(i, f43022e) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m29979equalsimpl(this.f43023a, obj);
    }

    public int hashCode() {
        return m29981hashCodeimpl(this.f43023a);
    }

    @yfb
    public String toString() {
        return m29982toStringimpl(this.f43023a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m29983unboximpl() {
        return this.f43023a;
    }
}
