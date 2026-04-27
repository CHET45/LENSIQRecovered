package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class bvg {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C2070a f14961b = new C2070a(null);

    /* JADX INFO: renamed from: c */
    public static final int f14962c = m28162constructorimpl(1);

    /* JADX INFO: renamed from: d */
    public static final int f14963d = m28162constructorimpl(2);

    /* JADX INFO: renamed from: e */
    public static final int f14964e = m28162constructorimpl(3);

    /* JADX INFO: renamed from: a */
    public final int f14965a;

    /* JADX INFO: renamed from: bvg$a */
    public static final class C2070a {
        public /* synthetic */ C2070a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m28168getClipgIe3tQ8$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m28169getEllipsisgIe3tQ8$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m28170getVisiblegIe3tQ8$annotations() {
        }

        /* JADX INFO: renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m28171getClipgIe3tQ8() {
            return bvg.f14962c;
        }

        /* JADX INFO: renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m28172getEllipsisgIe3tQ8() {
            return bvg.f14963d;
        }

        /* JADX INFO: renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m28173getVisiblegIe3tQ8() {
            return bvg.f14964e;
        }

        private C2070a() {
        }
    }

    private /* synthetic */ bvg(int i) {
        this.f14965a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ bvg m28161boximpl(int i) {
        return new bvg(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m28162constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28163equalsimpl(int i, Object obj) {
        return (obj instanceof bvg) && i == ((bvg) obj).m28167unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28164equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28165hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28166toStringimpl(int i) {
        return m28164equalsimpl0(i, f14962c) ? "Clip" : m28164equalsimpl0(i, f14963d) ? "Ellipsis" : m28164equalsimpl0(i, f14964e) ? "Visible" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m28163equalsimpl(this.f14965a, obj);
    }

    public int hashCode() {
        return m28165hashCodeimpl(this.f14965a);
    }

    @yfb
    public String toString() {
        return m28166toStringimpl(this.f14965a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28167unboximpl() {
        return this.f14965a;
    }
}
