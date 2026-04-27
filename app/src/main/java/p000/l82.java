package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,526:1\n1#2:527\n*E\n"})
public class l82 extends k82 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l82$a */
    public static final class C8710a<T> implements qy6<T, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, K> f56745a;

        /* JADX INFO: Incorrect field signature: TK; */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparable f56746b;

        /* JADX WARN: Incorrect types in method signature: (Lqy6<-TT;+TK;>;TK;)V */
        public C8710a(qy6 qy6Var, Comparable comparable) {
            this.f56745a = qy6Var;
            this.f56746b = comparable;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        public final Integer invoke(T t) {
            return Integer.valueOf(md2.compareValues((Comparable) this.f56745a.invoke(t), this.f56746b));
        }
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> List<T> List(int i, qy6<? super Integer, ? extends T> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(qy6Var.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> List<T> MutableList(int i, qy6<? super Integer, ? extends T> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(qy6Var.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList<>();
    }

    @yfb
    public static final <T> Collection<T> asCollection(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        return new l50(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(@yfb List<? extends T> list, @gib T t, int i, int i2) {
        md8.checkNotNullParameter(list, "<this>");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iCompareValues = md2.compareValues(list.get(i4), t);
            if (iCompareValues < 0) {
                i = i4 + 1;
            } else {
                if (iCompareValues <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return binarySearch((List<? extends Comparable>) list, comparable, i, i2);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(@yfb List<? extends T> list, @gib K k, int i, int i2, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return binarySearch(list, i, i2, new C8710a(qy6Var, k));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i, int i2, qy6 qy6Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        return binarySearch(list, i, i2, new C8710a(qy6Var, comparable));
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final <E> List<E> buildList(@cg1 qy6<? super List<E>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        List listCreateListBuilder = k82.createListBuilder();
        qy6Var.invoke(listCreateListBuilder);
        return k82.build(listCreateListBuilder);
    }

    @yfb
    public static final Object[] collectionToArrayCommonImpl(@yfb Collection<?> collection) {
        md8.checkNotNullParameter(collection, "collection");
        int i = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @t28
    private static final <T> boolean containsAll(Collection<? extends T> collection, Collection<? extends T> collection2) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(collection2, "elements");
        return collection.containsAll(collection2);
    }

    @yfb
    public static <T> List<T> emptyList() {
        return h05.f41922a;
    }

    @yfb
    public static f78 getIndices(@yfb Collection<?> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        return new f78(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lny6<+TR;>;)TR; */
    @jjf(version = "1.3")
    @t28
    private static final Object ifEmpty(Collection collection, ny6 ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        return collection.isEmpty() ? ny6Var.invoke() : collection;
    }

    @t28
    private static final <T> boolean isNotEmpty(Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        return !collection.isEmpty();
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> boolean isNullOrEmpty(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @yfb
    public static <T> List<T> listOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return tArr.length > 0 ? u70.asList(tArr) : emptyList();
    }

    @yfb
    public static final <T> List<T> listOfNotNull(@gib T t) {
        return t != null ? k82.listOf(t) : emptyList();
    }

    @jjf(version = "1.1")
    @t28
    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T> List<T> optimizeReadOnlyList(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : k82.listOf(list.get(0)) : emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <T> Collection<T> orEmpty(Collection<? extends T> collection) {
        return collection == 0 ? emptyList() : collection;
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    @jjf(version = "1.3")
    @yfb
    public static final <T> List<T> shuffled(@yfb Iterable<? extends T> iterable, @yfb tod todVar) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        List<T> mutableList = v82.toMutableList(iterable);
        v82.shuffle(mutableList, todVar);
        return mutableList;
    }

    @jjf(version = "1.3")
    @yjd
    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @jjf(version = "1.3")
    @yjd
    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @yfb
    public static <T> ArrayList<T> arrayListOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new l50(tArr, true));
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return binarySearch(list, obj, comparator, i, i2);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final <E> List<E> buildList(int i, @cg1 qy6<? super List<E>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        List listCreateListBuilder = k82.createListBuilder(i);
        qy6Var.invoke(listCreateListBuilder);
        return k82.build(listCreateListBuilder);
    }

    @t28
    private static final <T> List<T> listOf() {
        return emptyList();
    }

    @yfb
    public static <T> List<T> listOfNotNull(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return e80.filterNotNull(tArr);
    }

    @yfb
    public static <T> List<T> mutableListOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new l50(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <T> List<T> orEmpty(List<? extends T> list) {
        return list == 0 ? emptyList() : list;
    }

    public static /* synthetic */ int binarySearch$default(List list, int i, int i2, qy6 qy6Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return binarySearch(list, i, i2, qy6Var);
    }

    public static final <T> int binarySearch(@yfb List<? extends T> list, T t, @yfb Comparator<? super T> comparator, int i, int i2) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iCompare = comparator.compare(list.get(i4), t);
            if (iCompare < 0) {
                i = i4 + 1;
            } else {
                if (iCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    @yfb
    public static final <T> T[] collectionToArrayCommonImpl(@yfb Collection<?> collection, @yfb T[] tArr) {
        md8.checkNotNullParameter(collection, "collection");
        md8.checkNotNullParameter(tArr, "array");
        int i = 0;
        if (collection.isEmpty()) {
            return (T[]) k82.terminateCollectionToArray(0, tArr);
        }
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < collection.size()) {
            objArr = (T[]) s70.arrayOfNulls(tArr, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return (T[]) k82.terminateCollectionToArray(collection.size(), objArr);
    }

    public static <T> int binarySearch(@yfb List<? extends T> list, int i, int i2, @yfb qy6<? super T, Integer> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "comparison");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iIntValue = qy6Var.invoke(list.get(i4)).intValue();
            if (iIntValue < 0) {
                i = i4 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }
}
