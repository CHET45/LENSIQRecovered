package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
public final class dkb {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Object[] f29881a = new Object[0];

    /* JADX INFO: renamed from: b */
    @yfb
    public static final ckb<Object> f29882b = new f6b(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }

    @yfb
    public static final <E> ckb<E> emptyObjectList() {
        ckb<E> ckbVar = (ckb<E>) f29882b;
        md8.checkNotNull(ckbVar, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return ckbVar;
    }

    @yfb
    public static final <E> f6b<E> mutableObjectListOf() {
        return new f6b<>(0, 1, null);
    }

    @yfb
    public static final <E> ckb<E> objectListOf() {
        ckb<E> ckbVar = (ckb<E>) f29882b;
        md8.checkNotNull(ckbVar, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return ckbVar;
    }

    @yfb
    public static final <E> f6b<E> mutableObjectListOf(E e) {
        f6b<E> f6bVar = new f6b<>(1);
        f6bVar.add(e);
        return f6bVar;
    }

    @yfb
    public static final <E> ckb<E> objectListOf(E e) {
        return mutableObjectListOf(e);
    }

    @yfb
    public static final <E> ckb<E> objectListOf(E e, E e2) {
        return mutableObjectListOf(e, e2);
    }

    @yfb
    public static final <E> f6b<E> mutableObjectListOf(E e, E e2) {
        f6b<E> f6bVar = new f6b<>(2);
        f6bVar.add(e);
        f6bVar.add(e2);
        return f6bVar;
    }

    @yfb
    public static final <E> ckb<E> objectListOf(E e, E e2, E e3) {
        return mutableObjectListOf(e, e2, e3);
    }

    @yfb
    public static final <E> ckb<E> objectListOf(@yfb E... eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        f6b f6bVar = new f6b(eArr.length);
        f6bVar.plusAssign((Object[]) eArr);
        return f6bVar;
    }

    @yfb
    public static final <E> f6b<E> mutableObjectListOf(E e, E e2, E e3) {
        f6b<E> f6bVar = new f6b<>(3);
        f6bVar.add(e);
        f6bVar.add(e2);
        f6bVar.add(e3);
        return f6bVar;
    }

    @yfb
    public static final <E> f6b<E> mutableObjectListOf(@yfb E... eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        f6b<E> f6bVar = new f6b<>(eArr.length);
        f6bVar.plusAssign((Object[]) eArr);
        return f6bVar;
    }
}
