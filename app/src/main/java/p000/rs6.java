package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class rs6<K, V> extends zs6 implements Map.Entry<K, V> {
    @Override // p000.zs6
    /* JADX INFO: renamed from: a */
    public abstract Map.Entry<K, V> mo8967m();

    /* JADX INFO: renamed from: b */
    public boolean m21506b(@wx1 Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        return okb.equal(getKey(), entry.getKey()) && okb.equal(getValue(), entry.getValue());
    }

    /* JADX INFO: renamed from: c */
    public int m21507c() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    /* JADX INFO: renamed from: d */
    public String m21508d() {
        return getKey() + "=" + getValue();
    }

    public boolean equals(@wx1 Object object) {
        return mo8967m().equals(object);
    }

    @Override // java.util.Map.Entry
    @dgc
    public K getKey() {
        return mo8967m().getKey();
    }

    @Override // java.util.Map.Entry
    @dgc
    public V getValue() {
        return mo8967m().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return mo8967m().hashCode();
    }

    @dgc
    public V setValue(@dgc V value) {
        return mo8967m().setValue(value);
    }
}
