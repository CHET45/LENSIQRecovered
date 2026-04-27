package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class x2d {

    /* JADX INFO: renamed from: a */
    public final int f96104a;

    private /* synthetic */ x2d(int i) {
        this.f96104a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x2d m33174boximpl(int i) {
        return new x2d(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m33175constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33176equalsimpl(int i, Object obj) {
        return (obj instanceof x2d) && i == ((x2d) obj).m33180unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33177equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33178hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33179toStringimpl(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m33176equalsimpl(this.f96104a, obj);
    }

    public int hashCode() {
        return m33178hashCodeimpl(this.f96104a);
    }

    public String toString() {
        return m33179toStringimpl(this.f96104a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33180unboximpl() {
        return this.f96104a;
    }
}
