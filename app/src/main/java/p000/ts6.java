package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class ts6<K, V> extends zs6 implements u3b<K, V> {
    @Override // p000.u3b
    public Map<K, Collection<V>> asMap() {
        return mo8967m().asMap();
    }

    @Override // p000.u3b
    public void clear() {
        mo8967m().clear();
    }

    @Override // p000.u3b
    public boolean containsEntry(@wx1 Object key, @wx1 Object value) {
        return mo8967m().containsEntry(key, value);
    }

    @Override // p000.u3b
    public boolean containsKey(@wx1 Object key) {
        return mo8967m().containsKey(key);
    }

    @Override // p000.u3b
    public boolean containsValue(@wx1 Object value) {
        return mo8967m().containsValue(value);
    }

    @Override // p000.zs6
    /* JADX INFO: renamed from: delegate */
    public abstract u3b<K, V> mo8967m();

    public Collection<Map.Entry<K, V>> entries() {
        return mo8967m().entries();
    }

    @Override // p000.u3b
    public boolean equals(@wx1 Object object) {
        return object == this || mo8967m().equals(object);
    }

    public Collection<V> get(@dgc K key) {
        return mo8967m().get(key);
    }

    @Override // p000.u3b
    public int hashCode() {
        return mo8967m().hashCode();
    }

    @Override // p000.u3b
    public boolean isEmpty() {
        return mo8967m().isEmpty();
    }

    @Override // p000.u3b
    public Set<K> keySet() {
        return mo8967m().keySet();
    }

    @Override // p000.u3b
    public d4b<K> keys() {
        return mo8967m().keys();
    }

    @Override // p000.u3b
    @op1
    public boolean put(@dgc K key, @dgc V value) {
        return mo8967m().put(key, value);
    }

    @Override // p000.u3b
    @op1
    public boolean putAll(@dgc K key, Iterable<? extends V> values) {
        return mo8967m().putAll(key, values);
    }

    @Override // p000.u3b
    @op1
    public boolean remove(@wx1 Object key, @wx1 Object value) {
        return mo8967m().remove(key, value);
    }

    @op1
    public Collection<V> removeAll(@wx1 Object key) {
        return mo8967m().removeAll(key);
    }

    @op1
    public Collection<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return mo8967m().replaceValues(key, values);
    }

    @Override // p000.u3b
    public int size() {
        return mo8967m().size();
    }

    @Override // p000.u3b
    public Collection<V> values() {
        return mo8967m().values();
    }

    @Override // p000.u3b
    @op1
    public boolean putAll(u3b<? extends K, ? extends V> multimap) {
        return mo8967m().putAll(multimap);
    }
}
