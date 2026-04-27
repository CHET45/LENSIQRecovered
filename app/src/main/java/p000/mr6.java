package p000;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class mr6<K, V> extends qs6<K, V> implements ConcurrentMap<K, V> {
    @Override // p000.qs6, p000.zs6
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> mo8967m();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    @wx1
    public V putIfAbsent(K key, V value) {
        return mo8967m().putIfAbsent(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    public boolean remove(@wx1 Object key, @wx1 Object value) {
        return mo8967m().remove(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    @wx1
    public V replace(K key, V value) {
        return mo8967m().replace(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @op1
    public boolean replace(K key, V oldValue, V newValue) {
        return mo8967m().replace(key, oldValue, newValue);
    }
}
