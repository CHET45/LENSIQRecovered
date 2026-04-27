package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,199:1\n42#2,7:200\n42#2,7:209\n72#3:207\n86#3:216\n22#4:208\n22#4:217\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n49#1:200,7\n63#1:209,7\n52#1:207\n66#1:216\n52#1:208\n66#1:217\n*E\n"})
@vw7
public final class pme {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C11027a f71405b = new C11027a(null);

    /* JADX INFO: renamed from: c */
    public static final long f71406c = qme.ScaleFactor(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a */
    public final long f71407a;

    /* JADX INFO: renamed from: pme$a */
    public static final class C11027a {
        public /* synthetic */ C11027a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m31801getUnspecified_hLwfpc$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m31802getUnspecified_hLwfpc() {
            return pme.f71406c;
        }

        private C11027a() {
        }
    }

    private /* synthetic */ pme(long j) {
        this.f71407a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ pme m31786boximpl(long j) {
        return new pme(j);
    }

    @f0g
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m31787component1impl(long j) {
        return m31795getScaleXimpl(j);
    }

    @f0g
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m31788component2impl(long j) {
        return m31796getScaleYimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m31789constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m31790copy8GGzs04(long j, float f, float f2) {
        return qme.ScaleFactor(f, f2);
    }

    /* JADX INFO: renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m31791copy8GGzs04$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m31795getScaleXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m31796getScaleYimpl(j);
        }
        return m31790copy8GGzs04(j, f, f2);
    }

    @f0g
    /* JADX INFO: renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m31792div44nBxM0(long j, float f) {
        return qme.ScaleFactor(m31795getScaleXimpl(j) / f, m31796getScaleYimpl(j) / f);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31793equalsimpl(long j, Object obj) {
        return (obj instanceof pme) && j == ((pme) obj).m31800unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31794equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @yjd
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @f0g
    public static /* synthetic */ void getScaleX$annotations() {
    }

    /* JADX INFO: renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m31795getScaleXimpl(long j) {
        if (!(j != f71406c)) {
            g28.throwIllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j >> 32));
    }

    @f0g
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* JADX INFO: renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m31796getScaleYimpl(long j) {
        if (!(j != f71406c)) {
            g28.throwIllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31797hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @f0g
    /* JADX INFO: renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m31798times44nBxM0(long j, float f) {
        return qme.ScaleFactor(m31795getScaleXimpl(j) * f, m31796getScaleYimpl(j) * f);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31799toStringimpl(long j) {
        return "ScaleFactor(" + qme.roundToTenths(m31795getScaleXimpl(j)) + ", " + qme.roundToTenths(m31796getScaleYimpl(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m31793equalsimpl(this.f71407a, obj);
    }

    public int hashCode() {
        return m31797hashCodeimpl(this.f71407a);
    }

    @yfb
    public String toString() {
        return m31799toStringimpl(this.f71407a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m31800unboximpl() {
        return this.f71407a;
    }
}
