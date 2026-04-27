package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class mw7 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9571a f62552b = new C9571a(null);

    /* JADX INFO: renamed from: c */
    public static final int f62553c = m31066constructorimpl(-1);

    /* JADX INFO: renamed from: d */
    public static final int f62554d = m31066constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f62555e = m31066constructorimpl(0);

    /* JADX INFO: renamed from: f */
    public static final int f62556f = m31066constructorimpl(2);

    /* JADX INFO: renamed from: g */
    public static final int f62557g = m31066constructorimpl(3);

    /* JADX INFO: renamed from: h */
    public static final int f62558h = m31066constructorimpl(4);

    /* JADX INFO: renamed from: i */
    public static final int f62559i = m31066constructorimpl(5);

    /* JADX INFO: renamed from: j */
    public static final int f62560j = m31066constructorimpl(6);

    /* JADX INFO: renamed from: k */
    public static final int f62561k = m31066constructorimpl(7);

    /* JADX INFO: renamed from: a */
    public final int f62562a;

    /* JADX INFO: renamed from: mw7$a */
    public static final class C9571a {
        public /* synthetic */ C9571a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31072getDefaulteUduSuo$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31073getDoneeUduSuo$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31074getGoeUduSuo$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31075getNexteUduSuo$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31076getNoneeUduSuo$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31077getPreviouseUduSuo$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31078getSearcheUduSuo$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31079getSendeUduSuo$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m31080getUnspecifiedeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m31081getDefaulteUduSuo() {
            return mw7.f62554d;
        }

        /* JADX INFO: renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m31082getDoneeUduSuo() {
            return mw7.f62561k;
        }

        /* JADX INFO: renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m31083getGoeUduSuo() {
            return mw7.f62556f;
        }

        /* JADX INFO: renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m31084getNexteUduSuo() {
            return mw7.f62560j;
        }

        /* JADX INFO: renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m31085getNoneeUduSuo() {
            return mw7.f62555e;
        }

        /* JADX INFO: renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m31086getPreviouseUduSuo() {
            return mw7.f62559i;
        }

        /* JADX INFO: renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m31087getSearcheUduSuo() {
            return mw7.f62557g;
        }

        /* JADX INFO: renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m31088getSendeUduSuo() {
            return mw7.f62558h;
        }

        /* JADX INFO: renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m31089getUnspecifiedeUduSuo() {
            return mw7.f62553c;
        }

        private C9571a() {
        }
    }

    private /* synthetic */ mw7(int i) {
        this.f62562a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ mw7 m31065boximpl(int i) {
        return new mw7(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m31066constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31067equalsimpl(int i, Object obj) {
        return (obj instanceof mw7) && i == ((mw7) obj).m31071unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31068equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31069hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31070toStringimpl(int i) {
        return m31068equalsimpl0(i, f62553c) ? "Unspecified" : m31068equalsimpl0(i, f62555e) ? "None" : m31068equalsimpl0(i, f62554d) ? "Default" : m31068equalsimpl0(i, f62556f) ? "Go" : m31068equalsimpl0(i, f62557g) ? "Search" : m31068equalsimpl0(i, f62558h) ? "Send" : m31068equalsimpl0(i, f62559i) ? "Previous" : m31068equalsimpl0(i, f62560j) ? "Next" : m31068equalsimpl0(i, f62561k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m31067equalsimpl(this.f62562a, obj);
    }

    public int hashCode() {
        return m31069hashCodeimpl(this.f62562a);
    }

    @yfb
    public String toString() {
        return m31070toStringimpl(this.f62562a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31071unboximpl() {
        return this.f62562a;
    }
}
