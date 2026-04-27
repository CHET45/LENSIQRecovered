package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,576:1\n72#2:577\n86#2:580\n63#2,3:583\n63#2,3:588\n63#2,3:593\n63#2,3:598\n63#2,3:603\n63#2,3:608\n63#2,3:613\n22#3:578\n22#3:581\n168#4:579\n168#4:582\n482#4:616\n56#5:586\n56#5:587\n50#5:591\n50#5:592\n86#5:596\n86#5:597\n83#5:601\n83#5:602\n71#5:606\n71#5:607\n68#5:611\n68#5:612\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n376#1:577\n382#1:580\n389#1:583,3\n398#1:588,3\n410#1:593,3\n424#1:598,3\n432#1:603,3\n440#1:608,3\n448#1:613,3\n376#1:578\n382#1:581\n376#1:579\n382#1:582\n456#1:616\n399#1:586\n400#1:587\n411#1:591\n412#1:592\n425#1:596\n426#1:597\n433#1:601\n434#1:602\n441#1:606\n442#1:607\n449#1:611\n450#1:612\n*E\n"})
@vw7
public final class pn4 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C11039a f71480b = new C11039a(null);

    /* JADX INFO: renamed from: c */
    public static final long f71481c = m31806constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final long f71482d = m31806constructorimpl(j28.f49422d);

    /* JADX INFO: renamed from: a */
    public final long f71483a;

    /* JADX INFO: renamed from: pn4$a */
    public static final class C11039a {
        public /* synthetic */ C11039a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m31824getUnspecifiedMYxV2XQ() {
            return pn4.f71482d;
        }

        /* JADX INFO: renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m31825getZeroMYxV2XQ() {
            return pn4.f71481c;
        }

        private C11039a() {
        }
    }

    private /* synthetic */ pn4(long j) {
        this.f71483a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ pn4 m31803boximpl(long j) {
        return new pn4(j);
    }

    @f0g
    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m31804component1D9Ej5fM(long j) {
        return m31815getWidthD9Ej5fM(j);
    }

    @f0g
    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m31805component2D9Ej5fM(long j) {
        return m31813getHeightD9Ej5fM(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m31806constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m31807copyDwJknco(long j, float f, float f2) {
        return m31806constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m31808copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m31815getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m31813getHeightD9Ej5fM(j);
        }
        return m31807copyDwJknco(j, f, f2);
    }

    @f0g
    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m31810divGh9hcWk(long j, int i) {
        float f = i;
        return m31806constructorimpl((((long) Float.floatToRawIntBits(kn4.m30705constructorimpl(m31815getWidthD9Ej5fM(j) / f))) << 32) | (((long) Float.floatToRawIntBits(kn4.m30705constructorimpl(m31813getHeightD9Ej5fM(j) / f))) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31811equalsimpl(long j, Object obj) {
        return (obj instanceof pn4) && j == ((pn4) obj).m31823unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31812equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m31813getHeightD9Ej5fM(long j) {
        return kn4.m30705constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @f0g
    /* JADX INFO: renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m31814getHeightD9Ej5fM$annotations() {
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m31815getWidthD9Ej5fM(long j) {
        return kn4.m30705constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    @f0g
    /* JADX INFO: renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m31816getWidthD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31817hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m31818minuse_xh8Ic(long j, long j2) {
        float fM30705constructorimpl = kn4.m30705constructorimpl(m31815getWidthD9Ej5fM(j) - m31815getWidthD9Ej5fM(j2));
        float fM30705constructorimpl2 = kn4.m30705constructorimpl(m31813getHeightD9Ej5fM(j) - m31813getHeightD9Ej5fM(j2));
        return m31806constructorimpl((((long) Float.floatToRawIntBits(fM30705constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM30705constructorimpl2))));
    }

    @f0g
    /* JADX INFO: renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m31819pluse_xh8Ic(long j, long j2) {
        float fM30705constructorimpl = kn4.m30705constructorimpl(m31815getWidthD9Ej5fM(j) + m31815getWidthD9Ej5fM(j2));
        float fM30705constructorimpl2 = kn4.m30705constructorimpl(m31813getHeightD9Ej5fM(j) + m31813getHeightD9Ej5fM(j2));
        return m31806constructorimpl((((long) Float.floatToRawIntBits(fM30705constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM30705constructorimpl2))));
    }

    @f0g
    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m31821timesGh9hcWk(long j, int i) {
        float f = i;
        return m31806constructorimpl((((long) Float.floatToRawIntBits(kn4.m30705constructorimpl(m31815getWidthD9Ej5fM(j) * f))) << 32) | (((long) Float.floatToRawIntBits(kn4.m30705constructorimpl(m31813getHeightD9Ej5fM(j) * f))) & 4294967295L));
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31822toStringimpl(long j) {
        if (j == j28.f49422d) {
            return "DpSize.Unspecified";
        }
        return ((Object) kn4.m30716toStringimpl(m31815getWidthD9Ej5fM(j))) + " x " + ((Object) kn4.m30716toStringimpl(m31813getHeightD9Ej5fM(j)));
    }

    public boolean equals(Object obj) {
        return m31811equalsimpl(this.f71483a, obj);
    }

    public int hashCode() {
        return m31817hashCodeimpl(this.f71483a);
    }

    @f0g
    @yfb
    public String toString() {
        return m31822toStringimpl(this.f71483a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m31823unboximpl() {
        return this.f71483a;
    }

    @f0g
    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m31809divGh9hcWk(long j, float f) {
        float fM30705constructorimpl = kn4.m30705constructorimpl(m31815getWidthD9Ej5fM(j) / f);
        float fM30705constructorimpl2 = kn4.m30705constructorimpl(m31813getHeightD9Ej5fM(j) / f);
        return m31806constructorimpl((((long) Float.floatToRawIntBits(fM30705constructorimpl)) << 32) | (((long) Float.floatToRawIntBits(fM30705constructorimpl2)) & 4294967295L));
    }

    @f0g
    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m31820timesGh9hcWk(long j, float f) {
        float fM30705constructorimpl = kn4.m30705constructorimpl(m31815getWidthD9Ej5fM(j) * f);
        float fM30705constructorimpl2 = kn4.m30705constructorimpl(m31813getHeightD9Ej5fM(j) * f);
        return m31806constructorimpl((((long) Float.floatToRawIntBits(fM30705constructorimpl)) << 32) | (((long) Float.floatToRawIntBits(fM30705constructorimpl2)) & 4294967295L));
    }
}
