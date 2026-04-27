package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,198:1\n107#2:199\n114#2:200\n100#2:201\n107#2,8:202\n107#2:210\n114#2:211\n100#2:212\n107#2:213\n114#2:214\n100#2:215\n107#2,8:216\n100#2:224\n107#2:225\n114#2:227\n100#2:229\n107#2:230\n114#2:232\n100#2:234\n107#2:235\n114#2:236\n100#2:237\n26#3:226\n26#3:228\n26#3:231\n26#3:233\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n47#1:199\n54#1:200\n67#1:201\n66#1:202,8\n76#1:210\n77#1:211\n75#1:212\n88#1:213\n89#1:214\n87#1:215\n96#1:216,8\n96#1:224\n108#1:225\n109#1:227\n107#1:229\n123#1:230\n124#1:232\n122#1:234\n138#1:235\n139#1:236\n137#1:237\n108#1:226\n109#1:228\n123#1:231\n124#1:233\n*E\n"})
@vw7
public final class a78 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C0078a f545b = new C0078a(null);

    /* JADX INFO: renamed from: c */
    public static final long f546c = m27195constructorimpl(0);

    /* JADX INFO: renamed from: a */
    public final long f547a;

    /* JADX INFO: renamed from: a78$a */
    public static final class C0078a {
        public /* synthetic */ C0078a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m27211getZeronOccac() {
            return a78.f546c;
        }

        private C0078a() {
        }
    }

    private /* synthetic */ a78(long j) {
        this.f547a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ a78 m27192boximpl(long j) {
        return new a78(j);
    }

    @f0g
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m27193component1impl(long j) {
        return m27201getXimpl(j);
    }

    @f0g
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m27194component2impl(long j) {
        return m27202getYimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m27195constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m27196copyiSbpLlY(long j, int i, int i2) {
        return m27195constructorimpl((((long) i) << 32) | (((long) i2) & 4294967295L));
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m27197copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (4294967295L & j);
        }
        return m27196copyiSbpLlY(j, i, i2);
    }

    @f0g
    /* JADX INFO: renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m27198divBjo55l4(long j, float f) {
        return m27195constructorimpl((((long) Math.round(((int) (j >> 32)) / f)) << 32) | (((long) Math.round(((int) (j & 4294967295L)) / f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m27199equalsimpl(long j, Object obj) {
        return (obj instanceof a78) && j == ((a78) obj).m27210unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27200equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @f0g
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m27201getXimpl(long j) {
        return (int) (j >> 32);
    }

    @f0g
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m27202getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m27203hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m27204minusqkQi6aY(long j, long j2) {
        return m27195constructorimpl((((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m27205plusqkQi6aY(long j, long j2) {
        return m27195constructorimpl((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m27206remBjo55l4(long j, int i) {
        return m27195constructorimpl((((long) (((int) (j >> 32)) % i)) << 32) | (((long) (((int) (j & 4294967295L)) % i)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m27207timesBjo55l4(long j, float f) {
        return m27195constructorimpl((((long) Math.round(((int) (j >> 32)) * f)) << 32) | (((long) Math.round(((int) (j & 4294967295L)) * f)) & 4294967295L));
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m27208toStringimpl(long j) {
        return '(' + m27201getXimpl(j) + ", " + m27202getYimpl(j) + ')';
    }

    @f0g
    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m27209unaryMinusnOccac(long j) {
        int i = -((int) (j >> 32));
        return m27195constructorimpl((((long) (-((int) (j & 4294967295L)))) & 4294967295L) | (((long) i) << 32));
    }

    public boolean equals(Object obj) {
        return m27199equalsimpl(this.f547a, obj);
    }

    public int hashCode() {
        return m27203hashCodeimpl(this.f547a);
    }

    @f0g
    @yfb
    public String toString() {
        return m27208toStringimpl(this.f547a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27210unboximpl() {
        return this.f547a;
    }
}
