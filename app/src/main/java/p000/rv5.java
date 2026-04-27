package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class rv5 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C12314a f79730b = new C12314a(null);

    /* JADX INFO: renamed from: c */
    public static final int f79731c = m32212constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f79732d = m32212constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f79733e = m32212constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f79734a;

    /* JADX INFO: renamed from: rv5$a */
    public static final class C12314a {
        public /* synthetic */ C12314a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getClosestItem-bbeMdSM, reason: not valid java name */
        public final int m32218getClosestItembbeMdSM() {
            return rv5.f79731c;
        }

        /* JADX INFO: renamed from: getNextItem-bbeMdSM, reason: not valid java name */
        public final int m32219getNextItembbeMdSM() {
            return rv5.f79732d;
        }

        /* JADX INFO: renamed from: getPreviousItem-bbeMdSM, reason: not valid java name */
        public final int m32220getPreviousItembbeMdSM() {
            return rv5.f79733e;
        }

        private C12314a() {
        }
    }

    private /* synthetic */ rv5(int i) {
        this.f79734a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ rv5 m32211boximpl(int i) {
        return new rv5(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m32212constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32213equalsimpl(int i, Object obj) {
        return (obj instanceof rv5) && i == ((rv5) obj).m32217unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32214equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32215hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32216toStringimpl(int i) {
        return "FinalSnappingItem(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m32213equalsimpl(this.f79734a, obj);
    }

    public int hashCode() {
        return m32215hashCodeimpl(this.f79734a);
    }

    public String toString() {
        return m32216toStringimpl(this.f79734a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32217unboximpl() {
        return this.f79734a;
    }
}
