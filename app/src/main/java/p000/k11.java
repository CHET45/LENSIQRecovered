package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public interface k11<K, V> extends Map<K, V> {
    @op1
    @wx1
    V forcePut(@dgc K key, @dgc V value);

    k11<V, K> inverse();

    @op1
    @wx1
    V put(@dgc K key, @dgc V value);

    void putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map, p000.k11
    Set<V> values();
}
