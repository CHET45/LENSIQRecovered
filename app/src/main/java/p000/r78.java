package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,146:1\n107#2:147\n114#2:148\n107#2:149\n114#2:150\n100#2:151\n107#2:152\n114#2:153\n100#2:154\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:147\n53#1:148\n67#1:149\n68#1:150\n66#1:151\n78#1:152\n79#1:153\n77#1:154\n*E\n"})
@vw7
public final class r78 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C11932a f77324b = new C11932a(null);

    /* JADX INFO: renamed from: c */
    public static final long f77325c = m32082constructorimpl(0);

    /* JADX INFO: renamed from: a */
    public final long f77326a;

    /* JADX INFO: renamed from: r78$a */
    public static final class C11932a {
        public /* synthetic */ C11932a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m32092getZeroYbymL2g() {
            return r78.f77325c;
        }

        private C11932a() {
        }
    }

    private /* synthetic */ r78(long j) {
        this.f77326a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r78 m32079boximpl(long j) {
        return new r78(j);
    }

    @f0g
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m32080component1impl(long j) {
        return m32087getWidthimpl(j);
    }

    @f0g
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m32081component2impl(long j) {
        return m32086getHeightimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m32082constructorimpl(long j) {
        return j;
    }

    @f0g
    /* JADX INFO: renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m32083divYEO4UFw(long j, int i) {
        return m32082constructorimpl((((long) (((int) (j >> 32)) / i)) << 32) | (((long) (((int) (j & 4294967295L)) / i)) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32084equalsimpl(long j, Object obj) {
        return (obj instanceof r78) && j == ((r78) obj).m32091unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32085equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @f0g
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final int m32086getHeightimpl(long j) {
        return (int) (j & 4294967295L);
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @f0g
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final int m32087getWidthimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32088hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m32089timesYEO4UFw(long j, int i) {
        return m32082constructorimpl((((long) (((int) (j >> 32)) * i)) << 32) | (((long) (((int) (j & 4294967295L)) * i)) & 4294967295L));
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32090toStringimpl(long j) {
        return m32087getWidthimpl(j) + " x " + m32086getHeightimpl(j);
    }

    public boolean equals(Object obj) {
        return m32084equalsimpl(this.f77326a, obj);
    }

    public int hashCode() {
        return m32088hashCodeimpl(this.f77326a);
    }

    @f0g
    @yfb
    public String toString() {
        return m32090toStringimpl(this.f77326a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32091unboximpl() {
        return this.f77326a;
    }
}
