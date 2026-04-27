package p000;

import p000.sue;

/* JADX INFO: loaded from: classes7.dex */
@vn8
public final class ave<S extends sue<S>> {

    /* JADX INFO: renamed from: a */
    @gib
    public final Object f11943a;

    private /* synthetic */ ave(Object obj) {
        this.f11943a = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ave m27893boximpl(Object obj) {
        return new ave(obj);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <S extends sue<S>> Object m27894constructorimpl(@gib Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m27895equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ave) && md8.areEqual(obj, ((ave) obj2).m27901unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27896equalsimpl0(Object obj, Object obj2) {
        return md8.areEqual(obj, obj2);
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    @yfb
    /* JADX INFO: renamed from: getSegment-impl, reason: not valid java name */
    public static final S m27897getSegmentimpl(Object obj) {
        if (obj == op2.f68243b) {
            throw new IllegalStateException("Does not contain segment");
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m27898hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m27899isClosedimpl(Object obj) {
        return obj == op2.f68243b;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m27900toStringimpl(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m27895equalsimpl(this.f11943a, obj);
    }

    public int hashCode() {
        return m27898hashCodeimpl(this.f11943a);
    }

    public String toString() {
        return m27900toStringimpl(this.f11943a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m27901unboximpl() {
        return this.f11943a;
    }
}
