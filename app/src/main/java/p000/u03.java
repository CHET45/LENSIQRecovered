package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,164:1\n72#2:165\n86#2:167\n22#3:166\n22#3:168\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:167\n49#1:166\n53#1:168\n*E\n"})
@vw7
public final class u03 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C13303a f86459b = new C13303a(null);

    /* JADX INFO: renamed from: c */
    public static final long f86460c = v03.CornerRadius$default(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: a */
    public final long f86461a;

    /* JADX INFO: renamed from: u03$a */
    public static final class C13303a {
        public /* synthetic */ C13303a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m32501getZerokKHJgLs$annotations() {
        }

        /* JADX INFO: renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m32502getZerokKHJgLs() {
            return u03.f86460c;
        }

        private C13303a() {
        }
    }

    private /* synthetic */ u03(long j) {
        this.f86461a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ u03 m32483boximpl(long j) {
        return new u03(j);
    }

    @f0g
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m32484component1impl(long j) {
        return m32492getXimpl(j);
    }

    @f0g
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m32485component2impl(long j) {
        return m32493getYimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m32486constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m32487copyOHQCggk(long j, float f, float f2) {
        return v03.CornerRadius(f, f2);
    }

    /* JADX INFO: renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m32488copyOHQCggk$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m32492getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m32493getYimpl(j);
        }
        return m32487copyOHQCggk(j, f, f2);
    }

    @f0g
    /* JADX INFO: renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m32489divBz7bX_o(long j, float f) {
        return v03.CornerRadius(m32492getXimpl(j) / f, m32493getYimpl(j) / f);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32490equalsimpl(long j, Object obj) {
        return (obj instanceof u03) && j == ((u03) obj).m32500unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32491equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @f0g
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m32492getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @f0g
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m32493getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32494hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m32495minusvF7bmM(long j, long j2) {
        return v03.CornerRadius(m32492getXimpl(j) - m32492getXimpl(j2), m32493getYimpl(j) - m32493getYimpl(j2));
    }

    @f0g
    /* JADX INFO: renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m32496plusvF7bmM(long j, long j2) {
        return v03.CornerRadius(m32492getXimpl(j) + m32492getXimpl(j2), m32493getYimpl(j) + m32493getYimpl(j2));
    }

    @f0g
    /* JADX INFO: renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m32497timesBz7bX_o(long j, float f) {
        return v03.CornerRadius(m32492getXimpl(j) * f, m32493getYimpl(j) * f);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32498toStringimpl(long j) {
        if (m32492getXimpl(j) == m32493getYimpl(j)) {
            return "CornerRadius.circular(" + f37.toStringAsFixed(m32492getXimpl(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + f37.toStringAsFixed(m32492getXimpl(j), 1) + ", " + f37.toStringAsFixed(m32493getYimpl(j), 1) + ')';
    }

    @f0g
    /* JADX INFO: renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m32499unaryMinuskKHJgLs(long j) {
        return v03.CornerRadius(-m32492getXimpl(j), -m32493getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m32490equalsimpl(this.f86461a, obj);
    }

    public int hashCode() {
        return m32494hashCodeimpl(this.f86461a);
    }

    @yfb
    public String toString() {
        return m32498toStringimpl(this.f86461a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32500unboximpl() {
        return this.f86461a;
    }
}
