package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 0)
public final class sdh {

    /* JADX INFO: renamed from: e */
    public static final int f81499e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final u42 f81500a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final w42 f81501b;

    /* JADX INFO: renamed from: c */
    public final int f81502c;

    /* JADX INFO: renamed from: d */
    @gib
    public final byc f81503d;

    /* JADX INFO: renamed from: sdh$a */
    @vn8
    @ah5
    public static final class C12541a {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f81504b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f81505c = m32301constructorimpl(0);

        /* JADX INFO: renamed from: d */
        public static final int f81506d = m32301constructorimpl(1);

        /* JADX INFO: renamed from: e */
        public static final int f81507e = m32301constructorimpl(2);

        /* JADX INFO: renamed from: a */
        public final int f81508a;

        /* JADX INFO: renamed from: sdh$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: renamed from: getClipboard-kB6V9T0, reason: not valid java name */
            public final int m32307getClipboardkB6V9T0() {
                return C12541a.f81507e;
            }

            /* JADX INFO: renamed from: getDragAndDrop-kB6V9T0, reason: not valid java name */
            public final int m32308getDragAndDropkB6V9T0() {
                return C12541a.f81506d;
            }

            /* JADX INFO: renamed from: getKeyboard-kB6V9T0, reason: not valid java name */
            public final int m32309getKeyboardkB6V9T0() {
                return C12541a.f81505c;
            }

            private a() {
            }
        }

        private /* synthetic */ C12541a(int i) {
            this.f81508a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C12541a m32300boximpl(int i) {
            return new C12541a(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m32301constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m32302equalsimpl(int i, Object obj) {
            return (obj instanceof C12541a) && i == ((C12541a) obj).m32306unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m32303equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m32304hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @yfb
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m32305toStringimpl(int i) {
            if (m32303equalsimpl0(i, f81505c)) {
                return "Source.Keyboard";
            }
            if (m32303equalsimpl0(i, f81506d)) {
                return "Source.DragAndDrop";
            }
            if (m32303equalsimpl0(i, f81507e)) {
                return "Source.Clipboard";
            }
            return "Invalid (" + i + ')';
        }

        public boolean equals(Object obj) {
            return m32302equalsimpl(this.f81508a, obj);
        }

        public int hashCode() {
            return m32304hashCodeimpl(this.f81508a);
        }

        @yfb
        public String toString() {
            return m32305toStringimpl(this.f81508a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m32306unboximpl() {
            return this.f81508a;
        }
    }

    public /* synthetic */ sdh(u42 u42Var, w42 w42Var, int i, byc bycVar, jt3 jt3Var) {
        this(u42Var, w42Var, i, bycVar);
    }

    @yfb
    public final u42 getClipEntry() {
        return this.f81500a;
    }

    @yfb
    public final w42 getClipMetadata() {
        return this.f81501b;
    }

    @gib
    public final byc getPlatformTransferableContent() {
        return this.f81503d;
    }

    /* JADX INFO: renamed from: getSource-kB6V9T0, reason: not valid java name */
    public final int m32299getSourcekB6V9T0() {
        return this.f81502c;
    }

    private sdh(u42 u42Var, w42 w42Var, int i, byc bycVar) {
        this.f81500a = u42Var;
        this.f81501b = w42Var;
        this.f81502c = i;
        this.f81503d = bycVar;
    }

    public /* synthetic */ sdh(u42 u42Var, w42 w42Var, int i, byc bycVar, int i2, jt3 jt3Var) {
        this(u42Var, w42Var, i, (i2 & 8) != 0 ? null : bycVar, null);
    }
}
