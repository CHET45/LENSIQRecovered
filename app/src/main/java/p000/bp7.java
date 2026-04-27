package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class bp7 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C1979a f14380b = new C1979a(null);

    /* JADX INFO: renamed from: c */
    public static final int f14381c = m28022constructorimpl(1);

    /* JADX INFO: renamed from: d */
    public static final int f14382d = m28022constructorimpl(2);

    /* JADX INFO: renamed from: e */
    public static final int f14383e = m28022constructorimpl(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a */
    public final int f14384a;

    /* JADX INFO: renamed from: bp7$a */
    public static final class C1979a {
        public /* synthetic */ C1979a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m28028getAutovmbZdU8() {
            return bp7.f14382d;
        }

        /* JADX INFO: renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m28029getNonevmbZdU8() {
            return bp7.f14381c;
        }

        /* JADX INFO: renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m28030getUnspecifiedvmbZdU8() {
            return bp7.f14383e;
        }

        private C1979a() {
        }
    }

    private /* synthetic */ bp7(int i) {
        this.f14384a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ bp7 m28021boximpl(int i) {
        return new bp7(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m28022constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28023equalsimpl(int i, Object obj) {
        return (obj instanceof bp7) && i == ((bp7) obj).m28027unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28024equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28025hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28026toStringimpl(int i) {
        return m28024equalsimpl0(i, f14381c) ? "Hyphens.None" : m28024equalsimpl0(i, f14382d) ? "Hyphens.Auto" : m28024equalsimpl0(i, f14383e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m28023equalsimpl(this.f14384a, obj);
    }

    public int hashCode() {
        return m28025hashCodeimpl(this.f14384a);
    }

    @yfb
    public String toString() {
        return m28026toStringimpl(this.f14384a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28027unboximpl() {
        return this.f14384a;
    }
}
