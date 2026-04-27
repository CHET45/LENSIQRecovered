package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public class q82 extends p82 {
    public static <T> boolean addAll(@yfb Collection<? super T> collection, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @yfb
    public static <T> Collection<T> convertToListIfNotCollection(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = v82.toList(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable<? extends T> iterable, qy6<? super T, Boolean> qy6Var, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (qy6Var.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @t28
    private static final <T> void minusAssign(Collection<? super T> collection, T t) {
        md8.checkNotNullParameter(collection, "<this>");
        collection.remove(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <T> void plusAssign(Collection<? super T> collection, T t) {
        md8.checkNotNullParameter(collection, "<this>");
        collection.add(t);
    }

    @t28
    private static final <T> boolean remove(Collection<? extends T> collection, T t) {
        md8.checkNotNullParameter(collection, "<this>");
        return qlh.asMutableCollection(collection).remove(t);
    }

    @t28
    private static final <T> boolean removeAll(Collection<? extends T> collection, Collection<? extends T> collection2) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(collection2, "elements");
        return qlh.asMutableCollection(collection).removeAll(collection2);
    }

    @jjf(version = "1.4")
    public static <T> T removeFirst(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @gib
    @jjf(version = "1.4")
    public static final <T> T removeFirstOrNull(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @jjf(version = "1.4")
    public static <T> T removeLast(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(l82.getLastIndex(list));
    }

    @gib
    @jjf(version = "1.4")
    public static <T> T removeLastOrNull(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(l82.getLastIndex(list));
    }

    @t28
    private static final <T> boolean retainAll(Collection<? extends T> collection, Collection<? extends T> collection2) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(collection2, "elements");
        return qlh.asMutableCollection(collection).retainAll(collection2);
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    @t28
    private static final <T> void minusAssign(Collection<? super T> collection, Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        removeAll(collection, iterable);
    }

    @t28
    private static final <T> void plusAssign(Collection<? super T> collection, Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        addAll(collection, iterable);
    }

    @t28
    @q64(level = u64.f86866b, message = "Use removeAt(index) instead.", replaceWith = @i2e(expression = "removeAt(index)", imports = {}))
    private static final <T> T remove(List<T> list, int i) {
        md8.checkNotNullParameter(list, "<this>");
        return list.remove(i);
    }

    public static <T> boolean removeAll(@yfb Collection<? super T> collection, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        return collection.removeAll(convertToListIfNotCollection(iterable));
    }

    public static <T> boolean retainAll(@yfb Collection<? super T> collection, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        return collection.retainAll(convertToListIfNotCollection(iterable));
    }

    @t28
    private static final <T> void minusAssign(Collection<? super T> collection, T[] tArr) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        removeAll(collection, tArr);
    }

    @t28
    private static final <T> void plusAssign(Collection<? super T> collection, T[] tArr) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        addAll(collection, tArr);
    }

    public static <T> boolean removeAll(@yfb Collection<? super T> collection, @yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        List list = vze.toList(vyeVar);
        return !list.isEmpty() && collection.removeAll(list);
    }

    public static final <T> boolean retainAll(@yfb Collection<? super T> collection, @yfb T[] tArr) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        if (!(tArr.length == 0)) {
            return collection.retainAll(u70.asList(tArr));
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    public static <T> boolean addAll(@yfb Collection<? super T> collection, @yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        Iterator<? extends T> it = vyeVar.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @t28
    private static final <T> void minusAssign(Collection<? super T> collection, vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        removeAll(collection, vyeVar);
    }

    @t28
    private static final <T> void plusAssign(Collection<? super T> collection, vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        addAll(collection, vyeVar);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List<T> list, qy6<? super T, Boolean> qy6Var, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            md8.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return filterInPlace$CollectionsKt__MutableCollectionsKt(qlh.asMutableIterable(list), qy6Var, z);
        }
        int lastIndex = l82.getLastIndex(list);
        if (lastIndex >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (qy6Var.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int lastIndex2 = l82.getLastIndex(list);
        if (i > lastIndex2) {
            return true;
        }
        while (true) {
            list.remove(lastIndex2);
            if (lastIndex2 == i) {
                return true;
            }
            lastIndex2--;
        }
    }

    public static <T> boolean removeAll(@yfb Collection<? super T> collection, @yfb T[] tArr) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        return !(tArr.length == 0) && collection.removeAll(u70.asList(tArr));
    }

    public static <T> boolean addAll(@yfb Collection<? super T> collection, @yfb T[] tArr) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        return collection.addAll(u70.asList(tArr));
    }

    public static <T> boolean removeAll(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable) iterable, (qy6) qy6Var, true);
    }

    public static final <T> boolean retainAll(@yfb Collection<? super T> collection, @yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(collection, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        List list = vze.toList(vyeVar);
        if (!list.isEmpty()) {
            return collection.retainAll(list);
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    public static <T> boolean removeAll(@yfb List<T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((List) list, (qy6) qy6Var, true);
    }

    public static <T> boolean retainAll(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable) iterable, (qy6) qy6Var, false);
    }

    public static final <T> boolean retainAll(@yfb List<T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        md8.checkNotNullParameter(list, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((List) list, (qy6) qy6Var, false);
    }
}
