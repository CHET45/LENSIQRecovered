package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,576:1\n72#2:577\n86#2:580\n63#2,3:583\n63#2,3:588\n63#2,3:593\n22#3:578\n22#3:581\n168#4:579\n168#4:582\n324#4:596\n56#5:586\n56#5:587\n50#5:591\n50#5:592\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n260#1:577\n266#1:580\n272#1:583,3\n279#1:588,3\n290#1:593,3\n260#1:578\n266#1:581\n260#1:579\n266#1:582\n298#1:596\n280#1:586\n281#1:587\n291#1:591\n292#1:592\n*E\n"})
@vw7
public final class nn4 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9956a f65067b = new C9956a(null);

    /* JADX INFO: renamed from: c */
    public static final long f65068c = m31161constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final long f65069d = m31161constructorimpl(j28.f49422d);

    /* JADX INFO: renamed from: a */
    public final long f65070a;

    /* JADX INFO: renamed from: nn4$a */
    public static final class C9956a {
        public /* synthetic */ C9956a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m31175getUnspecifiedRKDOV3M() {
            return nn4.f65069d;
        }

        /* JADX INFO: renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m31176getZeroRKDOV3M() {
            return nn4.f65068c;
        }

        private C9956a() {
        }
    }

    private /* synthetic */ nn4(long j) {
        this.f65070a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ nn4 m31160boximpl(long j) {
        return new nn4(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m31161constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m31162copytPigGR8(long j, float f, float f2) {
        return m31161constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m31163copytPigGR8$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m31166getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m31168getYD9Ej5fM(j);
        }
        return m31162copytPigGR8(j, f, f2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31164equalsimpl(long j, Object obj) {
        return (obj instanceof nn4) && j == ((nn4) obj).m31174unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31165equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m31166getXD9Ej5fM(long j) {
        return kn4.m30705constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    @f0g
    /* JADX INFO: renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m31167getXD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m31168getYD9Ej5fM(long j) {
        return kn4.m30705constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @f0g
    /* JADX INFO: renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m31169getYD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31170hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m31171minusCBMgk4(long j, long j2) {
        float fM30705constructorimpl = kn4.m30705constructorimpl(m31166getXD9Ej5fM(j) - m31166getXD9Ej5fM(j2));
        float fM30705constructorimpl2 = kn4.m30705constructorimpl(m31168getYD9Ej5fM(j) - m31168getYD9Ej5fM(j2));
        return m31161constructorimpl((((long) Float.floatToRawIntBits(fM30705constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM30705constructorimpl2))));
    }

    @f0g
    /* JADX INFO: renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m31172plusCBMgk4(long j, long j2) {
        float fM30705constructorimpl = kn4.m30705constructorimpl(m31166getXD9Ej5fM(j) + m31166getXD9Ej5fM(j2));
        float fM30705constructorimpl2 = kn4.m30705constructorimpl(m31168getYD9Ej5fM(j) + m31168getYD9Ej5fM(j2));
        return m31161constructorimpl((((long) Float.floatToRawIntBits(fM30705constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM30705constructorimpl2))));
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31173toStringimpl(long j) {
        if (j == j28.f49422d) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) kn4.m30716toStringimpl(m31166getXD9Ej5fM(j))) + ", " + ((Object) kn4.m30716toStringimpl(m31168getYD9Ej5fM(j))) + ')';
    }

    public boolean equals(Object obj) {
        return m31164equalsimpl(this.f65070a, obj);
    }

    public int hashCode() {
        return m31170hashCodeimpl(this.f65070a);
    }

    @f0g
    @yfb
    public String toString() {
        return m31173toStringimpl(this.f65070a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m31174unboximpl() {
        return this.f65070a;
    }
}
