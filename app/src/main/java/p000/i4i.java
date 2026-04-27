package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,171:1\n72#2:172\n86#2:174\n63#2,3:176\n72#2:179\n86#2:181\n72#2:182\n86#2:184\n63#2,3:186\n72#2:189\n86#2:191\n63#2,3:193\n72#2:196\n86#2:198\n63#2,3:200\n72#2:203\n86#2:205\n63#2,3:207\n72#2:210\n86#2:212\n63#2,3:214\n22#3:173\n22#3:175\n22#3:180\n22#3:183\n22#3:185\n22#3:190\n22#3:192\n22#3:197\n22#3:199\n22#3:204\n22#3:206\n22#3:211\n22#3:213\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n46#1:172\n52#1:174\n71#1:176,3\n70#1:179\n70#1:181\n104#1:182\n105#1:184\n103#1:186,3\n119#1:189\n120#1:191\n118#1:193,3\n134#1:196\n135#1:198\n133#1:200,3\n149#1:203\n150#1:205\n148#1:207,3\n164#1:210\n165#1:212\n163#1:214,3\n46#1:173\n52#1:175\n70#1:180\n104#1:183\n105#1:185\n119#1:190\n120#1:192\n134#1:197\n135#1:199\n149#1:204\n150#1:206\n164#1:211\n165#1:213\n*E\n"})
@vw7
public final class i4i {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C7147a f45754b = new C7147a(null);

    /* JADX INFO: renamed from: c */
    public static final long f45755c = m30151constructorimpl(0);

    /* JADX INFO: renamed from: a */
    public final long f45756a;

    /* JADX INFO: renamed from: i4i$a */
    public static final class C7147a {
        public /* synthetic */ C7147a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m30167getZero9UxMQ8M$annotations() {
        }

        /* JADX INFO: renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m30168getZero9UxMQ8M() {
            return i4i.f45755c;
        }

        private C7147a() {
        }
    }

    private /* synthetic */ i4i(long j) {
        this.f45756a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ i4i m30148boximpl(long j) {
        return new i4i(j);
    }

    @f0g
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m30149component1impl(long j) {
        return m30157getXimpl(j);
    }

    @f0g
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m30150component2impl(long j) {
        return m30158getYimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30151constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m30152copyOhffZ5M(long j, float f, float f2) {
        return m30151constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m30153copyOhffZ5M$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m30152copyOhffZ5M(j, f, f2);
    }

    @f0g
    /* JADX INFO: renamed from: div-adjELrA, reason: not valid java name */
    public static final long m30154divadjELrA(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m30151constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30155equalsimpl(long j, Object obj) {
        return (obj instanceof i4i) && j == ((i4i) obj).m30166unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30156equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @f0g
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m30157getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @f0g
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m30158getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30159hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m30160minusAH228Gc(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m30151constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m30161plusAH228Gc(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m30151constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m30162remadjELrA(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) % f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) % f;
        return m30151constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: times-adjELrA, reason: not valid java name */
    public static final long m30163timesadjELrA(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m30151constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30164toStringimpl(long j) {
        return '(' + m30157getXimpl(j) + ", " + m30158getYimpl(j) + ") px/sec";
    }

    @f0g
    /* JADX INFO: renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m30165unaryMinus9UxMQ8M(long j) {
        return m30151constructorimpl(j ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m30155equalsimpl(this.f45756a, obj);
    }

    public int hashCode() {
        return m30159hashCodeimpl(this.f45756a);
    }

    @yfb
    public String toString() {
        return m30164toStringimpl(this.f45756a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30166unboximpl() {
        return this.f45756a;
    }
}
