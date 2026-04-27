package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n865#2,2:141\n855#2,2:143\n1#3:145\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n29#1:141,2\n53#1:143,2\n*E\n"})
public class x6f extends w6f {
    @yfb
    public static final <T> Set<T> minus(@yfb Set<? extends T> set, T t) {
        md8.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(wt9.mapCapacity(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && md8.areEqual(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    @t28
    private static final <T> Set<T> minusElement(Set<? extends T> set, T t) {
        md8.checkNotNullParameter(set, "<this>");
        return minus(set, t);
    }

    @yfb
    public static final <T> Set<T> plus(@yfb Set<? extends T> set, T t) {
        md8.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(wt9.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @t28
    private static final <T> Set<T> plusElement(Set<? extends T> set, T t) {
        md8.checkNotNullParameter(set, "<this>");
        return plus(set, t);
    }

    @yfb
    public static final <T> Set<T> plus(@yfb Set<? extends T> set, @yfb T[] tArr) {
        md8.checkNotNullParameter(set, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(wt9.mapCapacity(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        q82.addAll(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @yfb
    public static final <T> Set<T> minus(@yfb Set<? extends T> set, @yfb T[] tArr) {
        md8.checkNotNullParameter(set, "<this>");
        md8.checkNotNullParameter(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        q82.removeAll(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @yfb
    public static <T> Set<T> plus(@yfb Set<? extends T> set, @yfb Iterable<? extends T> iterable) {
        int size;
        md8.checkNotNullParameter(set, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        Integer numCollectionSizeOrNull = m82.collectionSizeOrNull(iterable);
        if (numCollectionSizeOrNull != null) {
            size = set.size() + numCollectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(wt9.mapCapacity(size));
        linkedHashSet.addAll(set);
        q82.addAll(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @yfb
    public static final <T> Set<T> minus(@yfb Set<? extends T> set, @yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(set, "<this>");
        md8.checkNotNullParameter(iterable, "elements");
        Collection<?> collectionConvertToListIfNotCollection = q82.convertToListIfNotCollection(iterable);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return v82.toSet(set);
        }
        if (collectionConvertToListIfNotCollection instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!((Set) collectionConvertToListIfNotCollection).contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(collectionConvertToListIfNotCollection);
        return linkedHashSet2;
    }

    @yfb
    public static final <T> Set<T> plus(@yfb Set<? extends T> set, @yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(set, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(wt9.mapCapacity(set.size() * 2));
        linkedHashSet.addAll(set);
        q82.addAll(linkedHashSet, vyeVar);
        return linkedHashSet;
    }

    @yfb
    public static final <T> Set<T> minus(@yfb Set<? extends T> set, @yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(set, "<this>");
        md8.checkNotNullParameter(vyeVar, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        q82.removeAll(linkedHashSet, vyeVar);
        return linkedHashSet;
    }
}
