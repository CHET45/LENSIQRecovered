package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class itg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C7613a f48257b = new C7613a(null);

    /* JADX INFO: renamed from: c */
    public static final int f48258c = m30394constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f48259d = m30394constructorimpl(1);

    /* JADX INFO: renamed from: a */
    public final int f48260a;

    /* JADX INFO: renamed from: itg$a */
    public static final class C7613a {
        public /* synthetic */ C7613a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getHandwritingDeletePreview-s-xJuwY, reason: not valid java name */
        public final int m30400getHandwritingDeletePreviewsxJuwY() {
            return itg.f48259d;
        }

        /* JADX INFO: renamed from: getHandwritingSelectPreview-s-xJuwY, reason: not valid java name */
        public final int m30401getHandwritingSelectPreviewsxJuwY() {
            return itg.f48258c;
        }

        private C7613a() {
        }
    }

    private /* synthetic */ itg(int i) {
        this.f48260a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ itg m30393boximpl(int i) {
        return new itg(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m30394constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30395equalsimpl(int i, Object obj) {
        return (obj instanceof itg) && i == ((itg) obj).m30399unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30396equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30397hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30398toStringimpl(int i) {
        return "TextHighlightType(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m30395equalsimpl(this.f48260a, obj);
    }

    public int hashCode() {
        return m30397hashCodeimpl(this.f48260a);
    }

    public String toString() {
        return m30398toStringimpl(this.f48260a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30399unboximpl() {
        return this.f48260a;
    }
}
