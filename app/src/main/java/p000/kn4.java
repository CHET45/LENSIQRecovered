package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,576:1\n131#2:577\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n95#1:577\n*E\n"})
@vw7
public final class kn4 implements Comparable<kn4> {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C8460a f54774b = new C8460a(null);

    /* JADX INFO: renamed from: c */
    public static final float f54775c = m30705constructorimpl(0.0f);

    /* JADX INFO: renamed from: d */
    public static final float f54776d = m30705constructorimpl(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final float f54777e = m30705constructorimpl(Float.NaN);

    /* JADX INFO: renamed from: a */
    public final float f54778a;

    /* JADX INFO: renamed from: kn4$a */
    public static final class C8460a {
        public /* synthetic */ C8460a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m30720getHairlineD9Ej5fM$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m30721getInfinityD9Ej5fM$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m30722getUnspecifiedD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m30723getHairlineD9Ej5fM() {
            return kn4.f54775c;
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m30724getInfinityD9Ej5fM() {
            return kn4.f54776d;
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m30725getUnspecifiedD9Ej5fM() {
            return kn4.f54777e;
        }

        private C8460a() {
        }
    }

    private /* synthetic */ kn4(float f) {
        this.f54778a = f;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kn4 m30703boximpl(float f) {
        return new kn4(f);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float m30705constructorimpl(float f) {
        return f;
    }

    @f0g
    /* JADX INFO: renamed from: div-0680j_4, reason: not valid java name */
    public static final float m30706div0680j_4(float f, float f2) {
        return f / f2;
    }

    @f0g
    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m30707divu2uoSUM(float f, float f2) {
        return m30705constructorimpl(f / f2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30709equalsimpl(float f, Object obj) {
        return (obj instanceof kn4) && Float.compare(f, ((kn4) obj).m30719unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30710equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30711hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    @f0g
    /* JADX INFO: renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m30712minus5rwHm24(float f, float f2) {
        return m30705constructorimpl(f - f2);
    }

    @f0g
    /* JADX INFO: renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m30713plus5rwHm24(float f, float f2) {
        return m30705constructorimpl(f + f2);
    }

    @f0g
    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m30714timesu2uoSUM(float f, float f2) {
        return m30705constructorimpl(f * f2);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30716toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @f0g
    /* JADX INFO: renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m30717unaryMinusD9Ej5fM(float f) {
        return m30705constructorimpl(-f);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kn4 kn4Var) {
        return m30718compareTo0680j_4(kn4Var.m30719unboximpl());
    }

    @f0g
    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m30718compareTo0680j_4(float f) {
        return m30704compareTo0680j_4(this.f54778a, f);
    }

    public boolean equals(Object obj) {
        return m30709equalsimpl(this.f54778a, obj);
    }

    public final float getValue() {
        return this.f54778a;
    }

    public int hashCode() {
        return m30711hashCodeimpl(this.f54778a);
    }

    @f0g
    @yfb
    public String toString() {
        return m30716toStringimpl(this.f54778a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m30719unboximpl() {
        return this.f54778a;
    }

    @f0g
    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m30704compareTo0680j_4(float f, float f2) {
        return Float.compare(f, f2);
    }

    @f0g
    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m30708divu2uoSUM(float f, int i) {
        return m30705constructorimpl(f / i);
    }

    @f0g
    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m30715timesu2uoSUM(float f, int i) {
        return m30705constructorimpl(f * i);
    }
}
