package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1084:1\n1#2:1085\n*E\n"})
public final class eoe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final u6b<Object> f33730a = new u6b<>(0);

    @yfb
    public static final <E> doe<E> emptyScatterSet() {
        u6b<Object> u6bVar = f33730a;
        md8.checkNotNull(u6bVar, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return u6bVar;
    }

    @yfb
    public static final <E> u6b<E> mutableScatterSetOf() {
        return new u6b<>(0, 1, null);
    }

    @yfb
    public static final <E> doe<E> scatterSetOf() {
        u6b<Object> u6bVar = f33730a;
        md8.checkNotNull(u6bVar, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return u6bVar;
    }

    @yfb
    public static final <E> u6b<E> mutableScatterSetOf(E e) {
        u6b<E> u6bVar = new u6b<>(1);
        u6bVar.plusAssign(e);
        return u6bVar;
    }

    @yfb
    public static final <E> doe<E> scatterSetOf(E e) {
        return mutableScatterSetOf(e);
    }

    @yfb
    public static final <E> doe<E> scatterSetOf(E e, E e2) {
        return mutableScatterSetOf(e, e2);
    }

    @yfb
    public static final <E> u6b<E> mutableScatterSetOf(E e, E e2) {
        u6b<E> u6bVar = new u6b<>(2);
        u6bVar.plusAssign(e);
        u6bVar.plusAssign(e2);
        return u6bVar;
    }

    @yfb
    public static final <E> doe<E> scatterSetOf(E e, E e2, E e3) {
        return mutableScatterSetOf(e, e2, e3);
    }

    @yfb
    public static final <E> doe<E> scatterSetOf(@yfb E... eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        u6b u6bVar = new u6b(eArr.length);
        u6bVar.plusAssign((Object[]) eArr);
        return u6bVar;
    }

    @yfb
    public static final <E> u6b<E> mutableScatterSetOf(E e, E e2, E e3) {
        u6b<E> u6bVar = new u6b<>(3);
        u6bVar.plusAssign(e);
        u6bVar.plusAssign(e2);
        u6bVar.plusAssign(e3);
        return u6bVar;
    }

    @yfb
    public static final <E> u6b<E> mutableScatterSetOf(@yfb E... eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        u6b<E> u6bVar = new u6b<>(eArr.length);
        u6bVar.plusAssign((Object[]) eArr);
        return u6bVar;
    }
}
