package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class s1d {

    /* JADX INFO: renamed from: a */
    public final int f80387a;

    private /* synthetic */ s1d(int i) {
        this.f80387a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ s1d m32237boximpl(int i) {
        return new s1d(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m32238constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m32239equalsimpl(int i, Object obj) {
        return (obj instanceof s1d) && i == ((s1d) obj).m32243unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32240equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m32241hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32242toStringimpl(int i) {
        return "PointerButtons(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m32239equalsimpl(this.f80387a, obj);
    }

    public int hashCode() {
        return m32241hashCodeimpl(this.f80387a);
    }

    public String toString() {
        return m32242toStringimpl(this.f80387a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32243unboximpl() {
        return this.f80387a;
    }
}
