package p000;

import java.lang.Comparable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use ImmutableRangeMap or TreeRangeMap")
@jd7
@tx4
public interface fpd<K extends Comparable, V> {
    Map<bpd<K>, V> asDescendingMapOfRanges();

    Map<bpd<K>, V> asMapOfRanges();

    void clear();

    boolean equals(@wx1 Object o);

    @wx1
    V get(K key);

    @wx1
    Map.Entry<bpd<K>, V> getEntry(K key);

    int hashCode();

    void put(bpd<K> range, V value);

    void putAll(fpd<K, ? extends V> rangeMap);

    void putCoalescing(bpd<K> range, V value);

    void remove(bpd<K> range);

    bpd<K> span();

    fpd<K, V> subRangeMap(bpd<K> range);

    String toString();
}
