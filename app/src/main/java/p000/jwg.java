package p000;

import p000.lwg;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,389:1\n22#2:390\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n243#1:390\n*E\n"})
@vw7
public final class jwg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C8129a f52146b = new C8129a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final lwg[] f52147c;

    /* JADX INFO: renamed from: d */
    public static final long f52148d;

    /* JADX INFO: renamed from: a */
    public final long f52149a;

    /* JADX INFO: renamed from: jwg$a */
    public static final class C8129a {
        public /* synthetic */ C8129a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m30623getUnspecifiedXSAIIZE$annotations() {
        }

        @yfb
        public final lwg[] getTextUnitTypes$ui_unit_release() {
            return jwg.f52147c;
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m30624getUnspecifiedXSAIIZE() {
            return jwg.f52148d;
        }

        private C8129a() {
        }
    }

    static {
        lwg.C9014a c9014a = lwg.f59101b;
        f52147c = new lwg[]{lwg.m30915boximpl(c9014a.m30924getUnspecifiedUIouoOA()), lwg.m30915boximpl(c9014a.m30923getSpUIouoOA()), lwg.m30915boximpl(c9014a.m30922getEmUIouoOA())};
        f52148d = kwg.pack(0L, Float.NaN);
    }

    private /* synthetic */ jwg(long j) {
        this.f52149a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ jwg m30603boximpl(long j) {
        return new jwg(j);
    }

    /* JADX INFO: renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m30604compareToR2X_6o(long j, long j2) {
        kwg.m30786checkArithmeticNB67dxo(j, j2);
        return Float.compare(m30613getValueimpl(j), m30613getValueimpl(j2));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m30605constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m30607divkPz2Gy4(long j, float f) {
        kwg.m30785checkArithmeticR2X_6o(j);
        return kwg.pack(m30611getRawTypeimpl(j), m30613getValueimpl(j) / f);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30609equalsimpl(long j, Object obj) {
        return (obj instanceof jwg) && j == ((jwg) obj).m30622unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30610equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @yjd
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* JADX INFO: renamed from: getRawType-impl, reason: not valid java name */
    public static final long m30611getRawTypeimpl(long j) {
        return j & kwg.f55525a;
    }

    /* JADX INFO: renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m30612getTypeUIouoOA(long j) {
        return f52147c[(int) (m30611getRawTypeimpl(j) >>> 32)].m30921unboximpl();
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m30613getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30614hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m30615isEmimpl(long j) {
        return m30611getRawTypeimpl(j) == 8589934592L;
    }

    /* JADX INFO: renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m30616isSpimpl(long j) {
        return m30611getRawTypeimpl(j) == 4294967296L;
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m30618timeskPz2Gy4(long j, float f) {
        kwg.m30785checkArithmeticR2X_6o(j);
        return kwg.pack(m30611getRawTypeimpl(j), m30613getValueimpl(j) * f);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30620toStringimpl(long j) {
        long jM30612getTypeUIouoOA = m30612getTypeUIouoOA(j);
        lwg.C9014a c9014a = lwg.f59101b;
        if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30924getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA())) {
            return m30613getValueimpl(j) + ".sp";
        }
        if (!lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30922getEmUIouoOA())) {
            return "Invalid";
        }
        return m30613getValueimpl(j) + ".em";
    }

    /* JADX INFO: renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m30621unaryMinusXSAIIZE(long j) {
        kwg.m30785checkArithmeticR2X_6o(j);
        return kwg.pack(m30611getRawTypeimpl(j), -m30613getValueimpl(j));
    }

    public boolean equals(Object obj) {
        return m30609equalsimpl(this.f52149a, obj);
    }

    public int hashCode() {
        return m30614hashCodeimpl(this.f52149a);
    }

    @yfb
    public String toString() {
        return m30620toStringimpl(this.f52149a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30622unboximpl() {
        return this.f52149a;
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m30606divkPz2Gy4(long j, double d) {
        kwg.m30785checkArithmeticR2X_6o(j);
        return kwg.pack(m30611getRawTypeimpl(j), (float) (((double) m30613getValueimpl(j)) / d));
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m30617timeskPz2Gy4(long j, double d) {
        kwg.m30785checkArithmeticR2X_6o(j);
        return kwg.pack(m30611getRawTypeimpl(j), (float) (((double) m30613getValueimpl(j)) * d));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m30608divkPz2Gy4(long j, int i) {
        kwg.m30785checkArithmeticR2X_6o(j);
        return kwg.pack(m30611getRawTypeimpl(j), m30613getValueimpl(j) / i);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m30619timeskPz2Gy4(long j, int i) {
        kwg.m30785checkArithmeticR2X_6o(j);
        return kwg.pack(m30611getRawTypeimpl(j), m30613getValueimpl(j) * i);
    }
}
