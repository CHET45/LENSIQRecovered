package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use ImmutableMultimap, HashMultimap, or another implementation")
@gd7
@tx4
public interface u3b<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@wx1 @rd2("K") Object key, @wx1 @rd2(k95.f53074X4) Object value);

    boolean containsKey(@wx1 @rd2("K") Object key);

    boolean containsValue(@wx1 @rd2(k95.f53074X4) Object value);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(@wx1 Object obj);

    Collection<V> get(@dgc K key);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    d4b<K> keys();

    @op1
    boolean put(@dgc K key, @dgc V value);

    @op1
    boolean putAll(@dgc K key, Iterable<? extends V> values);

    @op1
    boolean putAll(u3b<? extends K, ? extends V> multimap);

    @op1
    boolean remove(@wx1 @rd2("K") Object key, @wx1 @rd2(k95.f53074X4) Object value);

    @op1
    Collection<V> removeAll(@wx1 @rd2("K") Object key);

    @op1
    Collection<V> replaceValues(@dgc K key, Iterable<? extends V> values);

    int size();

    Collection<V> values();
}
