package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class gdd {

    /* JADX INFO: renamed from: a */
    public final int f39546a;

    private /* synthetic */ gdd(int i) {
        this.f39546a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ gdd m29711boximpl(int i) {
        return new gdd(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m29712constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29713equalsimpl(int i, Object obj) {
        return (obj instanceof gdd) && i == ((gdd) obj).m29719unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29714equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m29715getAnyMovementConsumedimpl(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m29716getDispatchedToAPointerInputModifierimpl(int i) {
        return (i & 1) != 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29717hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29718toStringimpl(int i) {
        return "ProcessResult(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m29713equalsimpl(this.f39546a, obj);
    }

    public int hashCode() {
        return m29717hashCodeimpl(this.f39546a);
    }

    public String toString() {
        return m29718toStringimpl(this.f39546a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m29719unboximpl() {
        return this.f39546a;
    }
}
