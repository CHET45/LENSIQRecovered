package p000;

import java.util.Map;

/* JADX INFO: renamed from: v2 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC13818v2<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(@wx1 Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        return okb.equal(getKey(), entry.getKey()) && okb.equal(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    @dgc
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @dgc
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    @dgc
    public V setValue(@dgc V value) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
