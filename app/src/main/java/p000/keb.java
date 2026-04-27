package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class keb<T> {

    /* JADX INFO: renamed from: a */
    public final int f53781a;

    private /* synthetic */ keb(int i) {
        this.f53781a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ keb m30686boximpl(int i) {
        return new keb(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m30687constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30688equalsimpl(int i, Object obj) {
        return (obj instanceof keb) && i == ((keb) obj).m30694unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30689equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30690hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: or-H91voCI, reason: not valid java name */
    public static final int m30691orH91voCI(int i, int i2) {
        return i | i2;
    }

    /* JADX INFO: renamed from: or-impl, reason: not valid java name */
    public static final int m30692orimpl(int i, int i2) {
        return i | i2;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30693toStringimpl(int i) {
        return "NodeKind(mask=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m30688equalsimpl(this.f53781a, obj);
    }

    public final int getMask() {
        return this.f53781a;
    }

    public int hashCode() {
        return m30690hashCodeimpl(this.f53781a);
    }

    public String toString() {
        return m30693toStringimpl(this.f53781a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30694unboximpl() {
        return this.f53781a;
    }
}
