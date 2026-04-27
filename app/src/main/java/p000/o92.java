package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,91:1\n107#2:92\n100#2:93\n100#2:94\n100#2:95\n100#2:96\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n49#1:92\n58#1:93\n65#1:94\n72#1:95\n80#1:96\n*E\n"})
@vw7
public final class o92 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10258a f66827b = new C10258a(null);

    /* JADX INFO: renamed from: c */
    public static final long f66828c;

    /* JADX INFO: renamed from: d */
    public static final long f66829d;

    /* JADX INFO: renamed from: e */
    public static final long f66830e;

    /* JADX INFO: renamed from: f */
    public static final long f66831f;

    /* JADX INFO: renamed from: a */
    public final long f66832a;

    /* JADX INFO: renamed from: o92$a */
    public static final class C10258a {
        public /* synthetic */ C10258a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m31301getCmykxdoWZVw() {
            return o92.f66831f;
        }

        /* JADX INFO: renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m31302getLabxdoWZVw() {
            return o92.f66830e;
        }

        /* JADX INFO: renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m31303getRgbxdoWZVw() {
            return o92.f66828c;
        }

        /* JADX INFO: renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m31304getXyzxdoWZVw() {
            return o92.f66829d;
        }

        private C10258a() {
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        f66828c = m31294constructorimpl((((long) 0) & 4294967295L) | j2);
        f66829d = m31294constructorimpl((((long) 1) & 4294967295L) | j2);
        f66830e = m31294constructorimpl(j2 | (((long) 2) & 4294967295L));
        f66831f = m31294constructorimpl((j & 4294967295L) | (((long) 4) << 32));
    }

    private /* synthetic */ o92(long j) {
        this.f66832a = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o92 m31293boximpl(long j) {
        return new o92(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m31294constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31295equalsimpl(long j, Object obj) {
        return (obj instanceof o92) && j == ((o92) obj).m31300unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31296equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @f0g
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    @h78(from = 1, m12174to = 4)
    /* JADX INFO: renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m31297getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31298hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31299toStringimpl(long j) {
        return m31296equalsimpl0(j, f66828c) ? "Rgb" : m31296equalsimpl0(j, f66829d) ? "Xyz" : m31296equalsimpl0(j, f66830e) ? "Lab" : m31296equalsimpl0(j, f66831f) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31295equalsimpl(this.f66832a, obj);
    }

    public int hashCode() {
        return m31298hashCodeimpl(this.f66832a);
    }

    @yfb
    public String toString() {
        return m31299toStringimpl(this.f66832a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m31300unboximpl() {
        return this.f66832a;
    }
}
