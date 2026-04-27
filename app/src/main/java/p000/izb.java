package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,311:1\n72#2:312\n86#2:314\n63#2,3:316\n72#2:319\n86#2:321\n72#2:322\n86#2:324\n72#2:326\n86#2:328\n72#2:330\n86#2:332\n63#2,3:334\n72#2:337\n86#2:339\n63#2,3:341\n72#2:344\n86#2:346\n63#2,3:348\n72#2:351\n86#2:353\n63#2,3:355\n72#2:358\n86#2:360\n63#2,3:362\n22#3:313\n22#3:315\n22#3:320\n22#3:323\n22#3:325\n22#3:327\n22#3:329\n22#3:331\n22#3:333\n22#3:338\n22#3:340\n22#3:345\n22#3:347\n22#3:352\n22#3:354\n22#3:359\n22#3:361\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n64#1:312\n67#1:314\n80#1:316,3\n79#1:319\n79#1:321\n129#1:322\n130#1:324\n141#1:326\n142#1:328\n170#1:330\n171#1:332\n169#1:334,3\n187#1:337\n188#1:339\n186#1:341,3\n204#1:344\n205#1:346\n203#1:348,3\n221#1:351\n222#1:353\n220#1:355,3\n238#1:358\n239#1:360\n237#1:362,3\n64#1:313\n67#1:315\n79#1:320\n129#1:323\n130#1:325\n141#1:327\n142#1:329\n170#1:331\n171#1:333\n187#1:338\n188#1:340\n204#1:345\n205#1:347\n221#1:352\n222#1:354\n238#1:359\n239#1:361\n*E\n"})
@vw7
public final class izb {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C7673a f49009b = new C7673a(null);

    /* JADX INFO: renamed from: c */
    public static final long f49010c = m30421constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final long f49011d = m30421constructorimpl(j28.f49421c);

    /* JADX INFO: renamed from: e */
    public static final long f49012e = m30421constructorimpl(j28.f49422d);

    /* JADX INFO: renamed from: a */
    public final long f49013a;

    /* JADX INFO: renamed from: izb$a */
    public static final class C7673a {
        public /* synthetic */ C7673a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m30440getInfiniteF1C5BW0$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m30441getUnspecifiedF1C5BW0$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m30442getZeroF1C5BW0$annotations() {
        }

        /* JADX INFO: renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m30443getInfiniteF1C5BW0() {
            return izb.f49011d;
        }

        /* JADX INFO: renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m30444getUnspecifiedF1C5BW0() {
            return izb.f49012e;
        }

        /* JADX INFO: renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m30445getZeroF1C5BW0() {
            return izb.f49010c;
        }

        private C7673a() {
        }
    }

    private /* synthetic */ izb(long j) {
        this.f49013a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ izb m30418boximpl(long j) {
        return new izb(j);
    }

    @f0g
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m30419component1impl(long j) {
        return m30429getXimpl(j);
    }

    @f0g
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m30420component2impl(long j) {
        return m30430getYimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30421constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m30422copydBAh8RU(long j, float f, float f2) {
        return m30421constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m30423copydBAh8RU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m30422copydBAh8RU(j, f, f2);
    }

    @f0g
    /* JADX INFO: renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m30424divtuRUvjQ(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m30421constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30425equalsimpl(long j, Object obj) {
        return (obj instanceof izb) && j == ((izb) obj).m30439unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30426equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @f0g
    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m30427getDistanceimpl(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    @f0g
    /* JADX INFO: renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m30428getDistanceSquaredimpl(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    @f0g
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m30429getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @f0g
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m30430getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30431hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m30432isValidimpl(long j) {
        long j2 = j & j28.f49419a;
        return (((~j2) & (j2 - j28.f49426h)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    @f0g
    /* JADX INFO: renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m30433minusMKHz9U(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m30421constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m30434plusMKHz9U(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m30421constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m30435remtuRUvjQ(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) % f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) % f;
        return m30421constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m30436timestuRUvjQ(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m30421constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30437toStringimpl(long j) {
        if (!mzb.m31100isSpecifiedk4lQ0M(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + f37.toStringAsFixed(m30429getXimpl(j), 1) + ", " + f37.toStringAsFixed(m30430getYimpl(j), 1) + ')';
    }

    @f0g
    /* JADX INFO: renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m30438unaryMinusF1C5BW0(long j) {
        return m30421constructorimpl(j ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m30425equalsimpl(this.f49013a, obj);
    }

    public int hashCode() {
        return m30431hashCodeimpl(this.f49013a);
    }

    @yfb
    public String toString() {
        return m30437toStringimpl(this.f49013a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30439unboximpl() {
        return this.f49013a;
    }
}
