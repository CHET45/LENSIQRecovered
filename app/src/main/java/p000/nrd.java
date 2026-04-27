package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class nrd {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10025a f65391b = new C10025a(null);

    /* JADX INFO: renamed from: a */
    public final int f65392a;

    /* JADX INFO: renamed from: nrd$a */
    public static final class C10025a {
        public /* synthetic */ C10025a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m31210getComposition6f8NoZ8() {
            return nrd.m31201constructorimpl(1);
        }

        /* JADX INFO: renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m31211getSnapshotFlow6f8NoZ8() {
            return nrd.m31201constructorimpl(4);
        }

        /* JADX INFO: renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m31212getSnapshotStateObserver6f8NoZ8() {
            return nrd.m31201constructorimpl(2);
        }

        private C10025a() {
        }
    }

    private /* synthetic */ nrd(int i) {
        this.f65392a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ nrd m31200boximpl(int i) {
        return new nrd(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m31201constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m31202constructorimpl$default(int i, int i2, jt3 jt3Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m31201constructorimpl(i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31203equalsimpl(int i, Object obj) {
        return (obj instanceof nrd) && i == ((nrd) obj).m31209unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31204equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31205hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m31206isReadInh_f27i8(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31207toStringimpl(int i) {
        return "ReaderKind(mask=" + i + ')';
    }

    /* JADX INFO: renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m31208withReadIn3QSx2Dw(int i, int i2) {
        return m31201constructorimpl(i | i2);
    }

    public boolean equals(Object obj) {
        return m31203equalsimpl(this.f65392a, obj);
    }

    public final int getMask() {
        return this.f65392a;
    }

    public int hashCode() {
        return m31205hashCodeimpl(this.f65392a);
    }

    public String toString() {
        return m31207toStringimpl(this.f65392a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31209unboximpl() {
        return this.f65392a;
    }
}
