package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@jg5
public final class w40 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14375a f93186b = new C14375a(null);

    /* JADX INFO: renamed from: c */
    public static final int f93187c = m32868constructorimpl(5);

    /* JADX INFO: renamed from: d */
    public static final int f93188d = m32868constructorimpl(4);

    /* JADX INFO: renamed from: e */
    public static final int f93189e = m32868constructorimpl(0);

    /* JADX INFO: renamed from: a */
    public final int f93190a;

    /* JADX INFO: renamed from: w40$a */
    public static final class C14375a {
        public /* synthetic */ C14375a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getArcAbove--9T-Mq4, reason: not valid java name */
        public final int m32874getArcAbove9TMq4() {
            return w40.f93187c;
        }

        /* JADX INFO: renamed from: getArcBelow--9T-Mq4, reason: not valid java name */
        public final int m32875getArcBelow9TMq4() {
            return w40.f93188d;
        }

        /* JADX INFO: renamed from: getArcLinear--9T-Mq4, reason: not valid java name */
        public final int m32876getArcLinear9TMq4() {
            return w40.f93189e;
        }

        private C14375a() {
        }
    }

    private /* synthetic */ w40(int i) {
        this.f93190a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ w40 m32867boximpl(int i) {
        return new w40(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m32868constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32869equalsimpl(int i, Object obj) {
        return (obj instanceof w40) && i == ((w40) obj).m32873unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32870equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32871hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32872toStringimpl(int i) {
        return "ArcMode(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m32869equalsimpl(this.f93190a, obj);
    }

    public int hashCode() {
        return m32871hashCodeimpl(this.f93190a);
    }

    public String toString() {
        return m32872toStringimpl(this.f93190a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32873unboximpl() {
        return this.f93190a;
    }
}
