package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
@vn8
@dwf({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class n28<E> {

    /* JADX INFO: renamed from: a */
    @gib
    public final Object f63055a;

    private /* synthetic */ n28(Object obj) {
        this.f63055a = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ n28 m31106boximpl(Object obj) {
        return new n28(obj);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m31107constructorimpl(@gib Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m31108constructorimpl$default(Object obj, int i, jt3 jt3Var) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m31107constructorimpl(obj);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31109equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof n28) && md8.areEqual(obj, ((n28) obj2).m31115unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31110equalsimpl0(Object obj, Object obj2) {
        return md8.areEqual(obj, obj2);
    }

    /* JADX INFO: renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m31111forEachReversedimpl(Object obj, @yfb qy6<? super E, bth> qy6Var) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            qy6Var.invoke(obj);
            return;
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                qy6Var.invoke((Object) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31112hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @yfb
    /* JADX INFO: renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m31113plusFjFbRPM(Object obj, E e) {
        if (obj == null) {
            return m31107constructorimpl(e);
        }
        if (obj instanceof ArrayList) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(e);
            return m31107constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m31107constructorimpl(arrayList);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31114toStringimpl(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m31109equalsimpl(this.f63055a, obj);
    }

    public int hashCode() {
        return m31112hashCodeimpl(this.f63055a);
    }

    public String toString() {
        return m31114toStringimpl(this.f63055a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m31115unboximpl() {
        return this.f63055a;
    }
}
