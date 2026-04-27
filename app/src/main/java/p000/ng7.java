package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class ng7 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C9868a f64462b = new C9868a(null);

    /* JADX INFO: renamed from: a */
    public final int f64463a;

    /* JADX INFO: renamed from: ng7$a */
    public static final class C9868a {
        public /* synthetic */ C9868a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m31154getLongPress5zf0vsI() {
            return axc.f12156a.m27903getLongPress5zf0vsI();
        }

        /* JADX INFO: renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m31155getTextHandleMove5zf0vsI() {
            return axc.f12156a.m27904getTextHandleMove5zf0vsI();
        }

        @yfb
        public final List<ng7> values() {
            return l82.listOf((Object[]) new ng7[]{ng7.m31147boximpl(m31154getLongPress5zf0vsI()), ng7.m31147boximpl(m31155getTextHandleMove5zf0vsI())});
        }

        private C9868a() {
        }
    }

    private /* synthetic */ ng7(int i) {
        this.f64463a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ng7 m31147boximpl(int i) {
        return new ng7(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m31148constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31149equalsimpl(int i, Object obj) {
        return (obj instanceof ng7) && i == ((ng7) obj).m31153unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31150equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31151hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31152toStringimpl(int i) {
        C9868a c9868a = f64462b;
        return m31150equalsimpl0(i, c9868a.m31154getLongPress5zf0vsI()) ? "LongPress" : m31150equalsimpl0(i, c9868a.m31155getTextHandleMove5zf0vsI()) ? "TextHandleMove" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m31149equalsimpl(this.f64463a, obj);
    }

    public int hashCode() {
        return m31151hashCodeimpl(this.f64463a);
    }

    @yfb
    public String toString() {
        return m31152toStringimpl(this.f64463a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31153unboximpl() {
        return this.f64463a;
    }
}
