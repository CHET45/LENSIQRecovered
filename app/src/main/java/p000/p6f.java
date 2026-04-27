package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public interface p6f<K, V> extends u3b<K, V> {
    @Override // p000.u3b
    Map<K, Collection<V>> asMap();

    @Override // p000.u3b
    Set<Map.Entry<K, V>> entries();

    @Override // p000.u3b
    boolean equals(@wx1 Object obj);

    @Override // p000.u3b
    Set<V> get(@dgc K key);

    @Override // p000.u3b
    @op1
    Set<V> removeAll(@wx1 Object key);

    @Override // p000.u3b
    @op1
    Set<V> replaceValues(@dgc K key, Iterable<? extends V> values);
}
