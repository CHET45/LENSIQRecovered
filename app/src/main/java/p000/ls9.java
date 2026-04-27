package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentHashMapContentIterators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentIterators.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
@e0g(parameters = 3)
public class ls9<K, V> implements Map.Entry<K, V>, uo8 {

    /* JADX INFO: renamed from: c */
    public static final int f58611c = 0;

    /* JADX INFO: renamed from: a */
    public final K f58612a;

    /* JADX INFO: renamed from: b */
    public final V f58613b;

    public ls9(K k, V v) {
        this.f58612a = k;
        this.f58613b = v;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@gib Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && md8.areEqual(entry.getKey(), getKey()) && md8.areEqual(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f58612a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f58613b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
