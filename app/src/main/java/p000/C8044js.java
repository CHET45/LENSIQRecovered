package p000;

/* JADX INFO: renamed from: js */
/* JADX INFO: loaded from: classes.dex */
@vn8
public final class C8044js {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final a f51641b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f51642c = m30570constructorimpl(0);

    /* JADX INFO: renamed from: d */
    public static final int f51643d = m30570constructorimpl(1);

    /* JADX INFO: renamed from: e */
    public static final int f51644e = m30570constructorimpl(2);

    /* JADX INFO: renamed from: a */
    public final int f51645a;

    /* JADX INFO: renamed from: js$a */
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getBehind-B_4ceCc, reason: not valid java name */
        public final int m30576getBehindB_4ceCc() {
            return C8044js.f51642c;
        }

        /* JADX INFO: renamed from: getMediaOverlay-B_4ceCc, reason: not valid java name */
        public final int m30577getMediaOverlayB_4ceCc() {
            return C8044js.f51643d;
        }

        /* JADX INFO: renamed from: getOnTop-B_4ceCc, reason: not valid java name */
        public final int m30578getOnTopB_4ceCc() {
            return C8044js.f51644e;
        }

        private a() {
        }
    }

    private /* synthetic */ C8044js(int i) {
        this.f51645a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C8044js m30569boximpl(int i) {
        return new C8044js(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m30570constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30571equalsimpl(int i, Object obj) {
        return (obj instanceof C8044js) && i == ((C8044js) obj).m30575unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30572equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30573hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30574toStringimpl(int i) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m30571equalsimpl(this.f51645a, obj);
    }

    public final int getZOrder() {
        return this.f51645a;
    }

    public int hashCode() {
        return m30573hashCodeimpl(this.f51645a);
    }

    public String toString() {
        return m30574toStringimpl(this.f51645a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30575unboximpl() {
        return this.f51645a;
    }
}
