package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public abstract class ws6<K, V> extends rt6<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: ws6$a */
    public class C14768a extends tt9.AbstractC13220q<K, V> {

        /* JADX INFO: renamed from: ws6$a$a */
        public class a implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a */
            @wx1
            public Map.Entry<K, V> f95283a = null;

            /* JADX INFO: renamed from: b */
            @wx1
            public Map.Entry<K, V> f95284b;

            public a() {
                this.f95284b = C14768a.this.mo12751m().lastEntry();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f95284b != null;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.f95283a == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                C14768a.this.mo12751m().remove(this.f95283a.getKey());
                this.f95283a = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry = this.f95284b;
                if (entry == null) {
                    throw new NoSuchElementException();
                }
                this.f95283a = entry;
                this.f95284b = C14768a.this.mo12751m().lowerEntry(this.f95284b.getKey());
                return entry;
            }
        }

        public C14768a() {
        }

        @Override // p000.tt9.AbstractC13220q
        /* JADX INFO: renamed from: l */
        public Iterator<Map.Entry<K, V>> mo12750l() {
            return new a();
        }

        @Override // p000.tt9.AbstractC13220q
        /* JADX INFO: renamed from: m */
        public NavigableMap<K, V> mo12751m() {
            return ws6.this;
        }
    }

    /* JADX INFO: renamed from: ws6$b */
    public class C14769b extends tt9.C13197e0<K, V> {
        public C14769b(final ws6 this$0) {
            super(this$0);
        }
    }

    @wx1
    /* JADX INFO: renamed from: A */
    public Map.Entry<K, V> m24784A(@dgc K key) {
        return headMap(key, false).lastEntry();
    }

    @wx1
    /* JADX INFO: renamed from: B */
    public K m24785B(@dgc K k) {
        return (K) tt9.m22798s(lowerEntry(k));
    }

    @wx1
    /* JADX INFO: renamed from: C */
    public Map.Entry<K, V> m24786C() {
        return (Map.Entry) wg8.m24515i(entrySet().iterator());
    }

    @wx1
    /* JADX INFO: renamed from: D */
    public Map.Entry<K, V> m24787D() {
        return (Map.Entry) wg8.m24515i(descendingMap().entrySet().iterator());
    }

    /* JADX INFO: renamed from: E */
    public SortedMap<K, V> m24788E(@dgc K fromKey) {
        return tailMap(fromKey, true);
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> ceilingEntry(@dgc K key) {
        return mo8967m().ceilingEntry(key);
    }

    @Override // java.util.NavigableMap
    @wx1
    public K ceilingKey(@dgc K key) {
        return mo8967m().ceilingKey(key);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return mo8967m().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return mo8967m().descendingMap();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> firstEntry() {
        return mo8967m().firstEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> floorEntry(@dgc K key) {
        return mo8967m().floorEntry(key);
    }

    @Override // java.util.NavigableMap
    @wx1
    public K floorKey(@dgc K key) {
        return mo8967m().floorKey(key);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@dgc K toKey, boolean inclusive) {
        return mo8967m().headMap(toKey, inclusive);
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> higherEntry(@dgc K key) {
        return mo8967m().higherEntry(key);
    }

    @Override // java.util.NavigableMap
    @wx1
    public K higherKey(@dgc K key) {
        return mo8967m().higherKey(key);
    }

    @Override // p000.rt6
    /* JADX INFO: renamed from: l */
    public SortedMap<K, V> mo21515l(@dgc K fromKey, @dgc K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> lastEntry() {
        return mo8967m().lastEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> lowerEntry(@dgc K key) {
        return mo8967m().lowerEntry(key);
    }

    @Override // java.util.NavigableMap
    @wx1
    public K lowerKey(@dgc K key) {
        return mo8967m().lowerKey(key);
    }

    @Override // p000.rt6
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract NavigableMap<K, V> mo8967m();

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return mo8967m().navigableKeySet();
    }

    @wx1
    /* JADX INFO: renamed from: o */
    public Map.Entry<K, V> m24790o(@dgc K key) {
        return tailMap(key, true).firstEntry();
    }

    @wx1
    /* JADX INFO: renamed from: p */
    public K m24791p(@dgc K k) {
        return (K) tt9.m22798s(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> pollFirstEntry() {
        return mo8967m().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> pollLastEntry() {
        return mo8967m().pollLastEntry();
    }

    /* JADX INFO: renamed from: q */
    public NavigableSet<K> m24792q() {
        return descendingMap().navigableKeySet();
    }

    @wx1
    /* JADX INFO: renamed from: r */
    public Map.Entry<K, V> m24793r() {
        return (Map.Entry) vg8.getFirst(entrySet(), null);
    }

    /* JADX INFO: renamed from: s */
    public K m24794s() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@dgc K fromKey, boolean fromInclusive, @dgc K toKey, boolean toInclusive) {
        return mo8967m().subMap(fromKey, fromInclusive, toKey, toInclusive);
    }

    @wx1
    /* JADX INFO: renamed from: t */
    public Map.Entry<K, V> m24795t(@dgc K key) {
        return headMap(key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@dgc K fromKey, boolean inclusive) {
        return mo8967m().tailMap(fromKey, inclusive);
    }

    @wx1
    /* JADX INFO: renamed from: u */
    public K m24796u(@dgc K k) {
        return (K) tt9.m22798s(floorEntry(k));
    }

    /* JADX INFO: renamed from: v */
    public SortedMap<K, V> m24797v(@dgc K toKey) {
        return headMap(toKey, false);
    }

    @wx1
    /* JADX INFO: renamed from: w */
    public Map.Entry<K, V> m24798w(@dgc K key) {
        return tailMap(key, false).firstEntry();
    }

    @wx1
    /* JADX INFO: renamed from: x */
    public K m24799x(@dgc K k) {
        return (K) tt9.m22798s(higherEntry(k));
    }

    @wx1
    /* JADX INFO: renamed from: y */
    public Map.Entry<K, V> m24800y() {
        return (Map.Entry) vg8.getFirst(descendingMap().entrySet(), null);
    }

    /* JADX INFO: renamed from: z */
    public K m24801z() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }
}
