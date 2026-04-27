package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ms9<K, V> implements Map.Entry<K, V>, uo8 {

    /* JADX INFO: renamed from: a */
    public final K f61943a;

    /* JADX INFO: renamed from: b */
    public final V f61944b;

    public ms9(K k, V v) {
        this.f61943a = k;
        this.f61944b = v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f61943a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f61944b;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
