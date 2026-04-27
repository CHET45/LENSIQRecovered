package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n350#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
public final class pt9<K, V> implements ot9<K, V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<K, V> f71988a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<K, V> f71989b;

    /* JADX WARN: Multi-variable type inference failed */
    public pt9(@yfb Map<K, ? extends V> map, @yfb qy6<? super K, ? extends V> qy6Var) {
        md8.checkNotNullParameter(map, "map");
        md8.checkNotNullParameter(qy6Var, "default");
        this.f71988a = map;
        this.f71989b = qy6Var;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@gib Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    @gib
    public V get(Object obj) {
        return getMap().get(obj);
    }

    @yfb
    public Set<Map.Entry<K, V>> getEntries() {
        return getMap().entrySet();
    }

    @yfb
    public Set<K> getKeys() {
        return getMap().keySet();
    }

    @Override // p000.ot9
    @yfb
    public Map<K, V> getMap() {
        return this.f71988a;
    }

    @Override // p000.ot9
    public V getOrImplicitDefault(K k) {
        Map<K, V> map = getMap();
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : this.f71989b.invoke(k);
    }

    public int getSize() {
        return getMap().size();
    }

    @yfb
    public Collection<V> getValues() {
        return getMap().values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
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
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @yfb
    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
