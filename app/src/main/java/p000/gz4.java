package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class gz4 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C6662a f41853b = new C6662a(null);

    /* JADX INFO: renamed from: c */
    public static final int f41854c = m29880constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f41855d = m29880constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f41856e = m29880constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f41857a;

    /* JADX INFO: renamed from: gz4$a */
    public static final class C6662a {
        public /* synthetic */ C6662a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m29886getAll_3YsG6Y() {
            return gz4.f41856e;
        }

        /* JADX INFO: renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m29887getDefault_3YsG6Y() {
            return gz4.f41854c;
        }

        /* JADX INFO: renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m29888getNone_3YsG6Y() {
            return gz4.f41855d;
        }

        private C6662a() {
        }
    }

    private /* synthetic */ gz4(int i) {
        this.f41857a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ gz4 m29879boximpl(int i) {
        return new gz4(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m29880constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29881equalsimpl(int i, Object obj) {
        return (obj instanceof gz4) && i == ((gz4) obj).m29885unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29882equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29883hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29884toStringimpl(int i) {
        if (i == f41854c) {
            return "EmojiSupportMatch.Default";
        }
        if (i == f41855d) {
            return "EmojiSupportMatch.None";
        }
        if (i == f41856e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m29881equalsimpl(this.f41857a, obj);
    }

    public int hashCode() {
        return m29883hashCodeimpl(this.f41857a);
    }

    @yfb
    public String toString() {
        return m29884toStringimpl(this.f41857a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m29885unboximpl() {
        return this.f41857a;
    }
}
