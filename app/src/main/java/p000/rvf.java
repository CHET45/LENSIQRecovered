package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public interface rvf<K, V> extends p6f<K, V> {
    @Override // p000.p6f, p000.u3b
    Map<K, Collection<V>> asMap();

    @Override // p000.p6f, p000.u3b
    SortedSet<V> get(@dgc K key);

    @Override // p000.p6f, p000.u3b
    @op1
    SortedSet<V> removeAll(@wx1 Object key);

    @Override // p000.p6f, p000.u3b
    @op1
    SortedSet<V> replaceValues(@dgc K key, Iterable<? extends V> values);

    @wx1
    Comparator<? super V> valueComparator();
}
