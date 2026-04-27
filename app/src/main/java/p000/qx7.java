package p000;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class qx7<K, V> implements px7<K, V>, Map<K, V>, uo8 {

    /* JADX INFO: renamed from: e */
    public static final int f76267e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<K, V> f76268a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ey7<K> f76269b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final bx7<V> f76270c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ey7<Map.Entry<K, V>> f76271d;

    /* JADX WARN: Multi-variable type inference failed */
    public qx7(@yfb Map<K, ? extends V> map) {
        this.f76268a = map;
        this.f76269b = new fy7(map.keySet());
        this.f76270c = new cx7(map.values());
        this.f76271d = new fy7(map.entrySet());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f76268a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f76268a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ ey7<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@gib Object obj) {
        return this.f76268a.equals(obj);
    }

    @Override // java.util.Map
    @gib
    public V get(Object obj) {
        return this.f76268a.get(obj);
    }

    @Override // p000.px7
    @yfb
    public ey7<Map.Entry<K, V>> getEntries() {
        return this.f76271d;
    }

    @Override // p000.px7
    @yfb
    public ey7<K> getKeys() {
        return this.f76269b;
    }

    public int getSize() {
        return this.f76268a.size();
    }

    @Override // p000.px7
    @yfb
    public bx7<V> getValues() {
        return this.f76270c;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f76268a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f76268a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ ey7<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @yfb
    public String toString() {
        return this.f76268a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ bx7<V> values() {
        return getValues();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
