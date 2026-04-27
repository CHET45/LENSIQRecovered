package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import p000.tt9;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public abstract class AbstractC7124i3<K, V> extends tt9.AbstractC13189a0<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: i3$b */
    public final class b extends tt9.AbstractC13220q<K, V> {
        private b() {
        }

        @Override // p000.tt9.AbstractC13220q
        /* JADX INFO: renamed from: l */
        public Iterator<Map.Entry<K, V>> mo12750l() {
            return AbstractC7124i3.this.mo11694b();
        }

        @Override // p000.tt9.AbstractC13220q
        /* JADX INFO: renamed from: m */
        public NavigableMap<K, V> mo12751m() {
            return AbstractC7124i3.this;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Iterator<Map.Entry<K, V>> mo11694b();

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> ceilingEntry(@dgc K key) {
        return tailMap(key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public K ceilingKey(@dgc K k) {
        return (K) tt9.m22798s(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) wg8.getNext(mo10935a(), null);
    }

    @Override // java.util.SortedMap
    @dgc
    public K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> floorEntry(@dgc K key) {
        return headMap(key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public K floorKey(@dgc K k) {
        return (K) tt9.m22798s(floorEntry(k));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @wx1
    public abstract V get(@wx1 Object key);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(@dgc K toKey) {
        return headMap(toKey, false);
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> higherEntry(@dgc K key) {
        return tailMap(key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public K higherKey(@dgc K k) {
        return (K) tt9.m22798s(higherEntry(k));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) wg8.getNext(mo11694b(), null);
    }

    @Override // java.util.SortedMap
    @dgc
    public K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> lowerEntry(@dgc K key) {
        return headMap(key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public K lowerKey(@dgc K k) {
        return (K) tt9.m22798s(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new tt9.C13197e0(this);
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) wg8.m24515i(mo10935a());
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) wg8.m24515i(mo11694b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(@dgc K fromKey, @dgc K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(@dgc K fromKey) {
        return tailMap(fromKey, true);
    }
}
