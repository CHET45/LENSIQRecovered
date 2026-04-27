package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n107#2:130\n114#2:131\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:130\n50#1:131\n*E\n"})
@vw7
public final class jvg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C8123a f52112b = new C8123a(null);

    /* JADX INFO: renamed from: c */
    public static final long f52113c = kvg.TextRange(0);

    /* JADX INFO: renamed from: a */
    public final long f52114a;

    /* JADX INFO: renamed from: jvg$a */
    public static final class C8123a {
        public /* synthetic */ C8123a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m30598getZerod9O1mEE() {
            return jvg.f52113c;
        }

        private C8123a() {
        }
    }

    private /* synthetic */ jvg(long j) {
        this.f52114a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ jvg m30581boximpl(long j) {
        return new jvg(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30582constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m30583contains5zctL8(long j, long j2) {
        return m30591getMinimpl(j) <= m30591getMinimpl(j2) && m30590getMaximpl(j2) <= m30590getMaximpl(j);
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m30584containsimpl(long j, int i) {
        return i < m30590getMaximpl(j) && m30591getMinimpl(j) <= i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30585equalsimpl(long j, Object obj) {
        return (obj instanceof jvg) && j == ((jvg) obj).m30597unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30586equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m30587getCollapsedimpl(long j) {
        return m30593getStartimpl(j) == m30588getEndimpl(j);
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m30588getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: getLength-impl, reason: not valid java name */
    public static final int m30589getLengthimpl(long j) {
        return m30590getMaximpl(j) - m30591getMinimpl(j);
    }

    /* JADX INFO: renamed from: getMax-impl, reason: not valid java name */
    public static final int m30590getMaximpl(long j) {
        return m30593getStartimpl(j) > m30588getEndimpl(j) ? m30593getStartimpl(j) : m30588getEndimpl(j);
    }

    /* JADX INFO: renamed from: getMin-impl, reason: not valid java name */
    public static final int m30591getMinimpl(long j) {
        return m30593getStartimpl(j) > m30588getEndimpl(j) ? m30588getEndimpl(j) : m30593getStartimpl(j);
    }

    /* JADX INFO: renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m30592getReversedimpl(long j) {
        return m30593getStartimpl(j) > m30588getEndimpl(j);
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m30593getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30594hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m30595intersects5zctL8(long j, long j2) {
        return m30591getMinimpl(j) < m30590getMaximpl(j2) && m30591getMinimpl(j2) < m30590getMaximpl(j);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30596toStringimpl(long j) {
        return "TextRange(" + m30593getStartimpl(j) + ", " + m30588getEndimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m30585equalsimpl(this.f52114a, obj);
    }

    public int hashCode() {
        return m30594hashCodeimpl(this.f52114a);
    }

    @yfb
    public String toString() {
        return m30596toStringimpl(this.f52114a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30597unboximpl() {
        return this.f52114a;
    }
}
