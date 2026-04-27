package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,50:1\n63#2,3:51\n72#2:54\n86#2:56\n22#3:55\n22#3:57\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n32#1:51,3\n37#1:54\n40#1:56\n37#1:55\n40#1:57\n*E\n"})
public final class m28 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9105a f59731b = new C9105a(null);

    /* JADX INFO: renamed from: c */
    public static final long f59732c = m30931constructorimpl(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a */
    public final long f59733a;

    /* JADX INFO: renamed from: m28$a */
    public static final class C9105a {
        public /* synthetic */ C9105a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m30941getUnspecifiedL26CHvs() {
            return m28.f59732c;
        }

        private C9105a() {
        }
    }

    private /* synthetic */ m28(long j) {
        this.f59733a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ m28 m30930boximpl(long j) {
        return new m28(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m30932constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30934equalsimpl(long j, Object obj) {
        return (obj instanceof m28) && j == ((m28) obj).m30940unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30935equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getDensity-impl, reason: not valid java name */
    public static final float m30936getDensityimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m30937getFontScaleimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30938hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30939toStringimpl(long j) {
        return "InlineDensity(density=" + m30936getDensityimpl(j) + ", fontScale=" + m30937getFontScaleimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m30934equalsimpl(this.f59733a, obj);
    }

    public int hashCode() {
        return m30938hashCodeimpl(this.f59733a);
    }

    @yfb
    public String toString() {
        return m30939toStringimpl(this.f59733a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30940unboximpl() {
        return this.f59733a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30933constructorimpl(@yfb c64 c64Var) {
        return m30931constructorimpl(c64Var.getDensity(), c64Var.getFontScale());
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30931constructorimpl(float f, float f2) {
        return m30932constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
