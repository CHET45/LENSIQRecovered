package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,285:1\n72#2:286\n86#2:288\n63#2,3:290\n72#2:293\n86#2:295\n72#2:296\n86#2:298\n63#2,3:300\n72#2:303\n86#2:305\n63#2,3:307\n79#2:310\n93#2:312\n79#2:313\n93#2:315\n22#3:287\n22#3:289\n22#3:294\n22#3:297\n22#3:299\n22#3:304\n22#3:306\n22#3:311\n22#3:314\n198#4:316\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:286\n61#1:288\n77#1:290,3\n76#1:293\n76#1:295\n133#1:296\n134#1:298\n132#1:300,3\n153#1:303\n154#1:305\n152#1:307,3\n168#1:310\n168#1:312\n180#1:313\n180#1:315\n51#1:287\n61#1:289\n76#1:294\n133#1:297\n134#1:299\n153#1:304\n154#1:306\n168#1:311\n180#1:314\n184#1:316\n*E\n"})
@vw7
public final class wpf {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14740a f95046b = new C14740a(null);

    /* JADX INFO: renamed from: c */
    public static final long f95047c = m33060constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final long f95048d = m33060constructorimpl(j28.f49422d);

    /* JADX INFO: renamed from: a */
    public final long f95049a;

    /* JADX INFO: renamed from: wpf$a */
    public static final class C14740a {
        public /* synthetic */ C14740a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m33075getUnspecifiedNHjbRc$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m33076getZeroNHjbRc$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m33077getUnspecifiedNHjbRc() {
            return wpf.f95048d;
        }

        /* JADX INFO: renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m33078getZeroNHjbRc() {
            return wpf.f95047c;
        }

        private C14740a() {
        }
    }

    private /* synthetic */ wpf(long j) {
        this.f95049a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ wpf m33057boximpl(long j) {
        return new wpf(j);
    }

    @f0g
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m33058component1impl(long j) {
        return m33069getWidthimpl(j);
    }

    @f0g
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m33059component2impl(long j) {
        return m33066getHeightimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m33060constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m33061copyxjbvk4A(long j, float f, float f2) {
        return m33060constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m33062copyxjbvk4A$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m33061copyxjbvk4A(j, f, f2);
    }

    @f0g
    /* JADX INFO: renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m33063div7Ah8Wj8(long j, float f) {
        if (j == j28.f49422d) {
            j28.throwIllegalStateException("Size is unspecified");
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m33060constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33064equalsimpl(long j, Object obj) {
        return (obj instanceof wpf) && j == ((wpf) obj).m33074unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33065equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @f0g
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final float m33066getHeightimpl(long j) {
        if (j == j28.f49422d) {
            j28.throwIllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    @f0g
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* JADX INFO: renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m33067getMaxDimensionimpl(long j) {
        if (j == j28.f49422d) {
            j28.throwIllegalStateException("Size is unspecified");
        }
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    @f0g
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* JADX INFO: renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m33068getMinDimensionimpl(long j) {
        if (j == j28.f49422d) {
            j28.throwIllegalStateException("Size is unspecified");
        }
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @f0g
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final float m33069getWidthimpl(long j) {
        if (j == j28.f49422d) {
            j28.throwIllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33070hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m33071isEmptyimpl(long j) {
        if (j == j28.f49422d) {
            j28.throwIllegalStateException("Size is unspecified");
        }
        long j2 = j & (~((((-9223372034707292160L) & j) >>> 31) * ((long) (-1))));
        return ((j2 & 4294967295L) & (j2 >>> 32)) == 0;
    }

    @f0g
    /* JADX INFO: renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m33072times7Ah8Wj8(long j, float f) {
        if (j == j28.f49422d) {
            j28.throwIllegalStateException("Size is unspecified");
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m33060constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33073toStringimpl(long j) {
        if (j == j28.f49422d) {
            return "Size.Unspecified";
        }
        return "Size(" + f37.toStringAsFixed(m33069getWidthimpl(j), 1) + ", " + f37.toStringAsFixed(m33066getHeightimpl(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m33064equalsimpl(this.f95049a, obj);
    }

    public int hashCode() {
        return m33070hashCodeimpl(this.f95049a);
    }

    @yfb
    public String toString() {
        return m33073toStringimpl(this.f95049a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33074unboximpl() {
        return this.f95049a;
    }
}
