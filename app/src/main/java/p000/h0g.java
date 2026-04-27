package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
@vn8
public final class h0g<T> {

    /* JADX INFO: renamed from: a */
    public final T f41933a;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ h0g(Object obj) {
        this.f41933a = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ h0g m29889boximpl(Object obj) {
        return new h0g(obj);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m29890constructorimpl(T t) {
        return t;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29891equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof h0g) && md8.areEqual(obj, ((h0g) obj2).m29895unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29892equalsimpl0(Object obj, Object obj2) {
        return md8.areEqual(obj, obj2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29893hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29894toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m29891equalsimpl(this.f41933a, obj);
    }

    public final T getValue() {
        return this.f41933a;
    }

    public int hashCode() {
        return m29893hashCodeimpl(this.f41933a);
    }

    public String toString() {
        return m29894toStringimpl(this.f41933a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m29895unboximpl() {
        return this.f41933a;
    }
}
