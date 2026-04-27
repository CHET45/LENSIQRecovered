package p000;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class lvf {
    private lvf() {
    }

    public static <E> Comparator<? super E> comparator(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? s7c.natural() : comparator;
    }

    public static boolean hasSameComparator(Comparator<?> comparator, Iterable<?> elements) {
        Comparator comparator2;
        v7d.checkNotNull(comparator);
        v7d.checkNotNull(elements);
        if (elements instanceof SortedSet) {
            comparator2 = comparator((SortedSet) elements);
        } else {
            if (!(elements instanceof kvf)) {
                return false;
            }
            comparator2 = ((kvf) elements).comparator();
        }
        return comparator.equals(comparator2);
    }
}
