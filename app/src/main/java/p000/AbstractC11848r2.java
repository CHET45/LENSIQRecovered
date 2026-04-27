package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p000.AbstractC2173c3;
import p000.tt9;
import p000.x3b;

/* JADX INFO: renamed from: r2 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC11848r2<K, V> extends AbstractC2173c3<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: f */
    public transient Map<K, Collection<V>> f76790f;

    /* JADX INFO: renamed from: m */
    public transient int f76791m;

    /* JADX INFO: renamed from: r2$a */
    public class a extends AbstractC11848r2<K, V>.d<V> {
        public a(final AbstractC11848r2 this$0) {
            super();
        }

        @Override // p000.AbstractC11848r2.d
        @dgc
        /* JADX INFO: renamed from: a */
        public V mo20773a(@dgc K key, @dgc V value) {
            return value;
        }
    }

    /* JADX INFO: renamed from: r2$b */
    public class b extends AbstractC11848r2<K, V>.d<Map.Entry<K, V>> {
        public b(final AbstractC11848r2 this$0) {
            super();
        }

        @Override // p000.AbstractC11848r2.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo20773a(@dgc K key, @dgc V value) {
            return tt9.immutableEntry(key, value);
        }
    }

    /* JADX INFO: renamed from: r2$c */
    public class c extends tt9.AbstractC13223r0<K, Collection<V>> {

        /* JADX INFO: renamed from: d */
        public final transient Map<K, Collection<V>> f76792d;

        /* JADX INFO: renamed from: r2$c$a */
        public class a extends tt9.AbstractC13224s<K, Collection<V>> {
            public a() {
            }

            @Override // p000.tt9.AbstractC13224s
            /* JADX INFO: renamed from: a */
            public Map<K, Collection<V>> mo8722a() {
                return c.this;
            }

            @Override // p000.tt9.AbstractC13224s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@wx1 Object o) {
                return h82.m12263d(c.this.f76792d.entrySet(), o);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // p000.tt9.AbstractC13224s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@wx1 Object o) {
                if (!contains(o)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o;
                Objects.requireNonNull(entry);
                AbstractC11848r2.this.removeValuesForKey(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: r2$c$b */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<K, Collection<V>>> f76795a;

            /* JADX INFO: renamed from: b */
            @wx1
            public Collection<V> f76796b;

            public b() {
                this.f76795a = c.this.f76792d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f76795a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                v7d.checkState(this.f76796b != null, "no calls to next() since the last call to remove()");
                this.f76795a.remove();
                AbstractC11848r2.m20767m(AbstractC11848r2.this, this.f76796b.size());
                this.f76796b.clear();
                this.f76796b = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f76795a.next();
                this.f76796b = next.getValue();
                return c.this.m20775b(next);
            }
        }

        public c(Map<K, Collection<V>> submap) {
            this.f76792d = submap;
        }

        /* JADX INFO: renamed from: b */
        public Map.Entry<K, Collection<V>> m20775b(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return tt9.immutableEntry(key, AbstractC11848r2.this.mo13709w(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f76792d == AbstractC11848r2.this.f76790f) {
                AbstractC11848r2.this.clear();
            } else {
                wg8.m24509c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return tt9.m22803x(this.f76792d, key);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@wx1 Object object) {
            return this == object || this.f76792d.equals(object);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f76792d.hashCode();
        }

        @Override // p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return AbstractC11848r2.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f76792d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f76792d.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Collection<V> get(@wx1 Object key) {
            Collection<V> collection = (Collection) tt9.m22804y(this.f76792d, key);
            if (collection == null) {
                return null;
            }
            return AbstractC11848r2.this.mo13709w(key, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Collection<V> remove(@wx1 Object key) {
            Collection<V> collectionRemove = this.f76792d.remove(key);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionMo9181p = AbstractC11848r2.this.mo9181p();
            collectionMo9181p.addAll(collectionRemove);
            AbstractC11848r2.m20767m(AbstractC11848r2.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionMo9181p;
        }
    }

    /* JADX INFO: renamed from: r2$d */
    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, Collection<V>>> f76798a;

        /* JADX INFO: renamed from: b */
        @wx1
        public K f76799b = null;

        /* JADX INFO: renamed from: c */
        @wx1
        public Collection<V> f76800c = null;

        /* JADX INFO: renamed from: d */
        public Iterator<V> f76801d = wg8.m24513g();

        public d() {
            this.f76798a = AbstractC11848r2.this.f76790f.entrySet().iterator();
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo20773a(@dgc K key, @dgc V value);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f76798a.hasNext() || this.f76801d.hasNext();
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            if (!this.f76801d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f76798a.next();
                this.f76799b = next.getKey();
                Collection<V> value = next.getValue();
                this.f76800c = value;
                this.f76801d = value.iterator();
            }
            return mo20773a(sib.m22018a(this.f76799b), this.f76801d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f76801d.remove();
            Collection<V> collection = this.f76800c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f76798a.remove();
            }
            AbstractC11848r2.m20765k(AbstractC11848r2.this);
        }
    }

    /* JADX INFO: renamed from: r2$e */
    public class e extends tt9.C13191b0<K, Collection<V>> {

        /* JADX INFO: renamed from: r2$e$a */
        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: a */
            @wx1
            public Map.Entry<K, Collection<V>> f76804a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Iterator f76805b;

            public a(final Iterator val$entryIterator) {
                this.f76805b = val$entryIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f76805b.hasNext();
            }

            @Override // java.util.Iterator
            @dgc
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f76805b.next();
                this.f76804a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                v7d.checkState(this.f76804a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f76804a.getValue();
                this.f76805b.remove();
                AbstractC11848r2.m20767m(AbstractC11848r2.this, value.size());
                value.clear();
                this.f76804a = null;
            }
        }

        public e(final Map<K, Collection<V>> subMap) {
            super(subMap);
        }

        @Override // p000.tt9.C13191b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            wg8.m24509c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c) {
            return mo22808b().keySet().containsAll(c);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object object) {
            return this == object || mo22808b().keySet().equals(object);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return mo22808b().keySet().hashCode();
        }

        @Override // p000.tt9.C13191b0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(mo22808b().entrySet().iterator());
        }

        @Override // p000.tt9.C13191b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object key) {
            int size;
            Collection<V> collectionRemove = mo22808b().remove(key);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                AbstractC11848r2.m20767m(AbstractC11848r2.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: r2$f */
    public class f extends AbstractC11848r2<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> submap) {
            super(submap);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, Collection<V>> ceilingEntry(@dgc K key) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = mo20777d().ceilingEntry(key);
            if (entryCeilingEntry == null) {
                return null;
            }
            return m20775b(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        @wx1
        public K ceilingKey(@dgc K key) {
            return mo20777d().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(mo20777d().descendingMap());
        }

        @Override // p000.AbstractC11848r2.i, p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> createKeySet() {
            return new g(mo20777d());
        }

        @wx1
        /* JADX INFO: renamed from: f */
        public Map.Entry<K, Collection<V>> m20779f(Iterator<Map.Entry<K, Collection<V>>> entryIterator) {
            if (!entryIterator.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = entryIterator.next();
            Collection<V> collectionMo9181p = AbstractC11848r2.this.mo9181p();
            collectionMo9181p.addAll(next.getValue());
            entryIterator.remove();
            return tt9.immutableEntry(next.getKey(), AbstractC11848r2.this.mo13708v(collectionMo9181p));
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = mo20777d().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return m20775b(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, Collection<V>> floorEntry(@dgc K key) {
            Map.Entry<K, Collection<V>> entryFloorEntry = mo20777d().floorEntry(key);
            if (entryFloorEntry == null) {
                return null;
            }
            return m20775b(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        @wx1
        public K floorKey(@dgc K key) {
            return mo20777d().floorKey(key);
        }

        @Override // p000.AbstractC11848r2.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo20777d() {
            return (NavigableMap) super.mo20777d();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, Collection<V>> higherEntry(@dgc K key) {
            Map.Entry<K, Collection<V>> entryHigherEntry = mo20777d().higherEntry(key);
            if (entryHigherEntry == null) {
                return null;
            }
            return m20775b(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        @wx1
        public K higherKey(@dgc K key) {
            return mo20777d().higherKey(key);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = mo20777d().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return m20775b(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, Collection<V>> lowerEntry(@dgc K key) {
            Map.Entry<K, Collection<V>> entryLowerEntry = mo20777d().lowerEntry(key);
            if (entryLowerEntry == null) {
                return null;
            }
            return m20775b(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        @wx1
        public K lowerKey(@dgc K key) {
            return mo20777d().lowerKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m20779f(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @wx1
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m20779f(descendingMap().entrySet().iterator());
        }

        @Override // p000.AbstractC11848r2.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@dgc K toKey) {
            return headMap(toKey, false);
        }

        @Override // p000.AbstractC11848r2.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@dgc K fromKey, @dgc K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // p000.AbstractC11848r2.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@dgc K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@dgc K toKey, boolean inclusive) {
            return new f(mo20777d().headMap(toKey, inclusive));
        }

        @Override // p000.AbstractC11848r2.i, p000.AbstractC11848r2.c, p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@dgc K fromKey, boolean fromInclusive, @dgc K toKey, boolean toInclusive) {
            return new f(mo20777d().subMap(fromKey, fromInclusive, toKey, toInclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@dgc K fromKey, boolean inclusive) {
            return new f(mo20777d().tailMap(fromKey, inclusive));
        }
    }

    /* JADX INFO: renamed from: r2$g */
    public class g extends AbstractC11848r2<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> subMap) {
            super(subMap);
        }

        @Override // p000.AbstractC11848r2.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo20781b() {
            return (NavigableMap) super.mo20781b();
        }

        @Override // java.util.NavigableSet
        @wx1
        public K ceiling(@dgc K k) {
            return mo20781b().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(mo20781b().descendingMap());
        }

        @Override // java.util.NavigableSet
        @wx1
        public K floor(@dgc K k) {
            return mo20781b().floorKey(k);
        }

        @Override // java.util.NavigableSet
        @wx1
        public K higher(@dgc K k) {
            return mo20781b().higherKey(k);
        }

        @Override // java.util.NavigableSet
        @wx1
        public K lower(@dgc K k) {
            return mo20781b().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        @wx1
        public K pollFirst() {
            return (K) wg8.m24515i(iterator());
        }

        @Override // java.util.NavigableSet
        @wx1
        public K pollLast() {
            return (K) wg8.m24515i(descendingIterator());
        }

        @Override // p000.AbstractC11848r2.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> headSet(@dgc K toElement) {
            return headSet(toElement, false);
        }

        @Override // p000.AbstractC11848r2.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> subSet(@dgc K fromElement, @dgc K toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // p000.AbstractC11848r2.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> tailSet(@dgc K fromElement) {
            return tailSet(fromElement, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@dgc K toElement, boolean inclusive) {
            return new g(mo20781b().headMap(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@dgc K fromElement, boolean fromInclusive, @dgc K toElement, boolean toInclusive) {
            return new g(mo20781b().subMap(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@dgc K fromElement, boolean inclusive) {
            return new g(mo20781b().tailMap(fromElement, inclusive));
        }
    }

    /* JADX INFO: renamed from: r2$h */
    public class h extends AbstractC11848r2<K, V>.l implements RandomAccess {
        public h(@dgc final AbstractC11848r2 this$0, K key, @wx1 List<V> delegate, AbstractC11848r2<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }
    }

    /* JADX INFO: renamed from: r2$i */
    public class i extends AbstractC11848r2<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f */
        @wx1
        public SortedSet<K> f76809f;

        public i(SortedMap<K, Collection<V>> submap) {
            super(submap);
        }

        @Override // p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: c */
        public SortedSet<K> createKeySet() {
            return new j(mo20777d());
        }

        @Override // java.util.SortedMap
        @wx1
        public Comparator<? super K> comparator() {
            return mo20777d().comparator();
        }

        /* JADX INFO: renamed from: d */
        public SortedMap<K, Collection<V>> mo20777d() {
            return (SortedMap) this.f76792d;
        }

        @Override // java.util.SortedMap
        @dgc
        public K firstKey() {
            return mo20777d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(@dgc K toKey) {
            return new i(mo20777d().headMap(toKey));
        }

        @Override // java.util.SortedMap
        @dgc
        public K lastKey() {
            return mo20777d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@dgc K fromKey, @dgc K toKey) {
            return new i(mo20777d().subMap(fromKey, toKey));
        }

        public SortedMap<K, Collection<V>> tailMap(@dgc K fromKey) {
            return new i(mo20777d().tailMap(fromKey));
        }

        @Override // p000.AbstractC11848r2.c, p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f76809f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetCreateKeySet = createKeySet();
            this.f76809f = sortedSetCreateKeySet;
            return sortedSetCreateKeySet;
        }
    }

    /* JADX INFO: renamed from: r2$j */
    public class j extends AbstractC11848r2<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> subMap) {
            super(subMap);
        }

        /* JADX INFO: renamed from: b */
        public SortedMap<K, Collection<V>> mo20781b() {
            return (SortedMap) super.mo22808b();
        }

        @Override // java.util.SortedSet
        @wx1
        public Comparator<? super K> comparator() {
            return mo20781b().comparator();
        }

        @Override // java.util.SortedSet
        @dgc
        public K first() {
            return mo20781b().firstKey();
        }

        public SortedSet<K> headSet(@dgc K toElement) {
            return new j(mo20781b().headMap(toElement));
        }

        @Override // java.util.SortedSet
        @dgc
        public K last() {
            return mo20781b().lastKey();
        }

        public SortedSet<K> subSet(@dgc K fromElement, @dgc K toElement) {
            return new j(mo20781b().subMap(fromElement, toElement));
        }

        public SortedSet<K> tailSet(@dgc K fromElement) {
            return new j(mo20781b().tailMap(fromElement));
        }
    }

    /* JADX INFO: renamed from: r2$m */
    public class m extends AbstractC11848r2<K, V>.o implements NavigableSet<V> {
        public m(@dgc K key, NavigableSet<V> delegate, @wx1 AbstractC11848r2<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        private NavigableSet<V> wrap(NavigableSet<V> wrapped) {
            return new m(this.f76812a, wrapped, m20784b() == null ? this : m20784b());
        }

        @Override // java.util.NavigableSet
        @wx1
        public V ceiling(@dgc V v) {
            return mo20792g().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(mo20792g().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return wrap(mo20792g().descendingSet());
        }

        @Override // java.util.NavigableSet
        @wx1
        public V floor(@dgc V v) {
            return mo20792g().floor(v);
        }

        @Override // p000.AbstractC11848r2.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> mo20792g() {
            return (NavigableSet) super.mo20792g();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@dgc V toElement, boolean inclusive) {
            return wrap(mo20792g().headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        @wx1
        public V higher(@dgc V v) {
            return mo20792g().higher(v);
        }

        @Override // java.util.NavigableSet
        @wx1
        public V lower(@dgc V v) {
            return mo20792g().lower(v);
        }

        @Override // java.util.NavigableSet
        @wx1
        public V pollFirst() {
            return (V) wg8.m24515i(iterator());
        }

        @Override // java.util.NavigableSet
        @wx1
        public V pollLast() {
            return (V) wg8.m24515i(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@dgc V fromElement, boolean fromInclusive, @dgc V toElement, boolean toInclusive) {
            return wrap(mo20792g().subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@dgc V fromElement, boolean inclusive) {
            return wrap(mo20792g().tailSet(fromElement, inclusive));
        }
    }

    /* JADX INFO: renamed from: r2$n */
    public class n extends AbstractC11848r2<K, V>.k implements Set<V> {
        public n(@dgc K key, Set<V> delegate) {
            super(key, delegate, null);
        }

        @Override // p000.AbstractC11848r2.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c) {
            if (c.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zM22398c = t6f.m22398c((Set) this.f76813b, c);
            if (zM22398c) {
                AbstractC11848r2.m20766l(AbstractC11848r2.this, this.f76813b.size() - size);
                m20788f();
            }
            return zM22398c;
        }
    }

    /* JADX INFO: renamed from: r2$o */
    public class o extends AbstractC11848r2<K, V>.k implements SortedSet<V> {
        public o(@dgc K key, SortedSet<V> delegate, @wx1 AbstractC11848r2<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        @Override // java.util.SortedSet
        @wx1
        public Comparator<? super V> comparator() {
            return mo20792g().comparator();
        }

        @Override // java.util.SortedSet
        @dgc
        public V first() {
            m20787e();
            return mo20792g().first();
        }

        /* JADX INFO: renamed from: g */
        public SortedSet<V> mo20792g() {
            return (SortedSet) m20785c();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@dgc V toElement) {
            m20787e();
            return new o(m20786d(), mo20792g().headSet(toElement), m20784b() == null ? this : m20784b());
        }

        @Override // java.util.SortedSet
        @dgc
        public V last() {
            m20787e();
            return mo20792g().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@dgc V fromElement, @dgc V toElement) {
            m20787e();
            return new o(m20786d(), mo20792g().subSet(fromElement, toElement), m20784b() == null ? this : m20784b());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@dgc V fromElement) {
            m20787e();
            return new o(m20786d(), mo20792g().tailSet(fromElement), m20784b() == null ? this : m20784b());
        }
    }

    public AbstractC11848r2(Map<K, Collection<V>> map) {
        v7d.checkArgument(map.isEmpty());
        this.f76790f = map;
    }

    private Collection<V> getOrCreateCollection(@dgc K key) {
        Collection<V> collection = this.f76790f.get(key);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionMo9182q = mo9182q(key);
        this.f76790f.put(key, collectionMo9182q);
        return collectionMo9182q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m20764j(AbstractC11848r2 abstractC11848r2) {
        int i2 = abstractC11848r2.f76791m;
        abstractC11848r2.f76791m = i2 + 1;
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m20765k(AbstractC11848r2 abstractC11848r2) {
        int i2 = abstractC11848r2.f76791m;
        abstractC11848r2.f76791m = i2 - 1;
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m20766l(AbstractC11848r2 abstractC11848r2, int i2) {
        int i3 = abstractC11848r2.f76791m + i2;
        abstractC11848r2.f76791m = i3;
        return i3;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m20767m(AbstractC11848r2 abstractC11848r2, int i2) {
        int i3 = abstractC11848r2.f76791m - i2;
        abstractC11848r2.f76791m = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValuesForKey(@wx1 Object key) {
        Collection collection = (Collection) tt9.m22805z(this.f76790f, key);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f76791m -= size;
        }
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: a */
    public Map<K, Collection<V>> mo3677a() {
        return new c(this.f76790f);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: b */
    public Collection<Map.Entry<K, V>> mo3678b() {
        return this instanceof p6f ? new AbstractC2173c3.b(this) : new AbstractC2173c3.a();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: c */
    public Set<K> mo3679c() {
        return new e(this.f76790f);
    }

    @Override // p000.u3b
    public void clear() {
        Iterator<Collection<V>> it = this.f76790f.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f76790f.clear();
        this.f76791m = 0;
    }

    @Override // p000.u3b
    public boolean containsKey(@wx1 Object key) {
        return this.f76790f.containsKey(key);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: d */
    public d4b<K> mo3680d() {
        return new x3b.C14901g(this);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: e */
    public Collection<V> mo3681e() {
        return new AbstractC2173c3.c();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: f */
    public Iterator<Map.Entry<K, V>> mo3682f() {
        return new b(this);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: g */
    public Iterator<V> mo3683g() {
        return new a(this);
    }

    @Override // p000.u3b
    public Collection<V> get(@dgc K key) {
        Collection<V> collectionMo9182q = this.f76790f.get(key);
        if (collectionMo9182q == null) {
            collectionMo9182q = mo9182q(key);
        }
        return mo13709w(key, collectionMo9182q);
    }

    /* JADX INFO: renamed from: o */
    public Map<K, Collection<V>> mo17770o() {
        return this.f76790f;
    }

    /* JADX INFO: renamed from: p */
    public abstract Collection<V> mo9181p();

    @Override // p000.AbstractC2173c3, p000.u3b
    public boolean put(@dgc K key, @dgc V value) {
        Collection<V> collection = this.f76790f.get(key);
        if (collection != null) {
            if (!collection.add(value)) {
                return false;
            }
            this.f76791m++;
            return true;
        }
        Collection<V> collectionMo9182q = mo9182q(key);
        if (!collectionMo9182q.add(value)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f76791m++;
        this.f76790f.put(key, collectionMo9182q);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public Collection<V> mo9182q(@dgc K key) {
        return mo9181p();
    }

    /* JADX INFO: renamed from: r */
    public final Map<K, Collection<V>> m20769r() {
        Map<K, Collection<V>> map = this.f76790f;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f76790f) : map instanceof SortedMap ? new i((SortedMap) this.f76790f) : new c(this.f76790f);
    }

    @Override // p000.u3b
    public Collection<V> removeAll(@wx1 Object obj) {
        Collection<V> collectionRemove = this.f76790f.remove(obj);
        if (collectionRemove == null) {
            return mo13707t();
        }
        Collection collectionMo9181p = mo9181p();
        collectionMo9181p.addAll(collectionRemove);
        this.f76791m -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) mo13708v(collectionMo9181p);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Collection<V> replaceValues(@dgc K k2, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k2);
        }
        Collection<V> orCreateCollection = getOrCreateCollection(k2);
        Collection<V> collectionMo9181p = mo9181p();
        collectionMo9181p.addAll(orCreateCollection);
        this.f76791m -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.f76791m++;
            }
        }
        return (Collection<V>) mo13708v(collectionMo9181p);
    }

    /* JADX INFO: renamed from: s */
    public final Set<K> m20770s() {
        Map<K, Collection<V>> map = this.f76790f;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f76790f) : map instanceof SortedMap ? new j((SortedMap) this.f76790f) : new e(this.f76790f);
    }

    @Override // p000.u3b
    public int size() {
        return this.f76791m;
    }

    /* JADX INFO: renamed from: t */
    public Collection<V> mo13707t() {
        return (Collection<V>) mo13708v(mo9181p());
    }

    /* JADX INFO: renamed from: u */
    public final void m20771u(Map<K, Collection<V>> map) {
        this.f76790f = map;
        this.f76791m = 0;
        for (Collection<V> collection : map.values()) {
            v7d.checkArgument(!collection.isEmpty());
            this.f76791m += collection.size();
        }
    }

    /* JADX INFO: renamed from: v */
    public <E> Collection<E> mo13708v(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Collection<V> values() {
        return super.values();
    }

    /* JADX INFO: renamed from: w */
    public Collection<V> mo13709w(@dgc K key, Collection<V> collection) {
        return new k(key, collection, null);
    }

    /* JADX INFO: renamed from: x */
    public final List<V> m20772x(@dgc K key, List<V> list, @wx1 AbstractC11848r2<K, V>.k ancestor) {
        return list instanceof RandomAccess ? new h(this, key, list, ancestor) : new l(key, list, ancestor);
    }

    /* JADX INFO: renamed from: r2$k */
    public class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f76812a;

        /* JADX INFO: renamed from: b */
        public Collection<V> f76813b;

        /* JADX INFO: renamed from: c */
        @wx1
        public final AbstractC11848r2<K, V>.k f76814c;

        /* JADX INFO: renamed from: d */
        @wx1
        public final Collection<V> f76815d;

        public k(@dgc K key, Collection<V> delegate, @wx1 AbstractC11848r2<K, V>.k ancestor) {
            this.f76812a = key;
            this.f76813b = delegate;
            this.f76814c = ancestor;
            this.f76815d = ancestor == null ? null : ancestor.m20785c();
        }

        /* JADX INFO: renamed from: a */
        public void m20783a() {
            AbstractC11848r2<K, V>.k kVar = this.f76814c;
            if (kVar != null) {
                kVar.m20783a();
            } else {
                AbstractC11848r2.this.f76790f.put(this.f76812a, this.f76813b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@dgc V value) {
            m20787e();
            boolean zIsEmpty = this.f76813b.isEmpty();
            boolean zAdd = this.f76813b.add(value);
            if (zAdd) {
                AbstractC11848r2.m20764j(AbstractC11848r2.this);
                if (zIsEmpty) {
                    m20783a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f76813b.addAll(collection);
            if (zAddAll) {
                AbstractC11848r2.m20766l(AbstractC11848r2.this, this.f76813b.size() - size);
                if (size == 0) {
                    m20783a();
                }
            }
            return zAddAll;
        }

        @wx1
        /* JADX INFO: renamed from: b */
        public AbstractC11848r2<K, V>.k m20784b() {
            return this.f76814c;
        }

        /* JADX INFO: renamed from: c */
        public Collection<V> m20785c() {
            return this.f76813b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f76813b.clear();
            AbstractC11848r2.m20767m(AbstractC11848r2.this, size);
            m20788f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object o) {
            m20787e();
            return this.f76813b.contains(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> c) {
            m20787e();
            return this.f76813b.containsAll(c);
        }

        @dgc
        /* JADX INFO: renamed from: d */
        public K m20786d() {
            return this.f76812a;
        }

        /* JADX INFO: renamed from: e */
        public void m20787e() {
            Collection<V> collection;
            AbstractC11848r2<K, V>.k kVar = this.f76814c;
            if (kVar != null) {
                kVar.m20787e();
                if (this.f76814c.m20785c() != this.f76815d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f76813b.isEmpty() || (collection = (Collection) AbstractC11848r2.this.f76790f.get(this.f76812a)) == null) {
                    return;
                }
                this.f76813b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            m20787e();
            return this.f76813b.equals(object);
        }

        /* JADX INFO: renamed from: f */
        public void m20788f() {
            AbstractC11848r2<K, V>.k kVar = this.f76814c;
            if (kVar != null) {
                kVar.m20788f();
            } else if (this.f76813b.isEmpty()) {
                AbstractC11848r2.this.f76790f.remove(this.f76812a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m20787e();
            return this.f76813b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m20787e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@wx1 Object o) {
            m20787e();
            boolean zRemove = this.f76813b.remove(o);
            if (zRemove) {
                AbstractC11848r2.m20765k(AbstractC11848r2.this);
                m20788f();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c) {
            if (c.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f76813b.removeAll(c);
            if (zRemoveAll) {
                AbstractC11848r2.m20766l(AbstractC11848r2.this, this.f76813b.size() - size);
                m20788f();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> c) {
            v7d.checkNotNull(c);
            int size = size();
            boolean zRetainAll = this.f76813b.retainAll(c);
            if (zRetainAll) {
                AbstractC11848r2.m20766l(AbstractC11848r2.this, this.f76813b.size() - size);
                m20788f();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m20787e();
            return this.f76813b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m20787e();
            return this.f76813b.toString();
        }

        /* JADX INFO: renamed from: r2$k$a */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a */
            public final Iterator<V> f76817a;

            /* JADX INFO: renamed from: b */
            public final Collection<V> f76818b;

            public a() {
                Collection<V> collection = k.this.f76813b;
                this.f76818b = collection;
                this.f76817a = AbstractC11848r2.iteratorOrListIterator(collection);
            }

            /* JADX INFO: renamed from: a */
            public Iterator<V> m20789a() {
                m20790b();
                return this.f76817a;
            }

            /* JADX INFO: renamed from: b */
            public void m20790b() {
                k.this.m20787e();
                if (k.this.f76813b != this.f76818b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m20790b();
                return this.f76817a.hasNext();
            }

            @Override // java.util.Iterator
            @dgc
            public V next() {
                m20790b();
                return this.f76817a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f76817a.remove();
                AbstractC11848r2.m20765k(AbstractC11848r2.this);
                k.this.m20788f();
            }

            public a(Iterator<V> delegateIterator) {
                this.f76818b = k.this.f76813b;
                this.f76817a = delegateIterator;
            }
        }
    }

    /* JADX INFO: renamed from: r2$l */
    public class l extends AbstractC11848r2<K, V>.k implements List<V> {

        /* JADX INFO: renamed from: r2$l$a */
        public class a extends AbstractC11848r2<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            private ListIterator<V> getDelegateListIterator() {
                return (ListIterator) m20789a();
            }

            @Override // java.util.ListIterator
            public void add(@dgc V value) {
                boolean zIsEmpty = l.this.isEmpty();
                getDelegateListIterator().add(value);
                AbstractC11848r2.m20764j(AbstractC11848r2.this);
                if (zIsEmpty) {
                    l.this.m20783a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return getDelegateListIterator().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return getDelegateListIterator().nextIndex();
            }

            @Override // java.util.ListIterator
            @dgc
            public V previous() {
                return getDelegateListIterator().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return getDelegateListIterator().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@dgc V value) {
                getDelegateListIterator().set(value);
            }

            public a(int index) {
                super(l.this.m20791g().listIterator(index));
            }
        }

        public l(@dgc K key, List<V> delegate, @wx1 AbstractC11848r2<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        @Override // java.util.List
        public void add(int index, @dgc V element) {
            m20787e();
            boolean zIsEmpty = m20785c().isEmpty();
            m20791g().add(index, element);
            AbstractC11848r2.m20764j(AbstractC11848r2.this);
            if (zIsEmpty) {
                m20783a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends V> c) {
            if (c.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = m20791g().addAll(index, c);
            if (zAddAll) {
                AbstractC11848r2.m20766l(AbstractC11848r2.this, m20785c().size() - size);
                if (size == 0) {
                    m20783a();
                }
            }
            return zAddAll;
        }

        /* JADX INFO: renamed from: g */
        public List<V> m20791g() {
            return (List) m20785c();
        }

        @Override // java.util.List
        @dgc
        public V get(int index) {
            m20787e();
            return m20791g().get(index);
        }

        @Override // java.util.List
        public int indexOf(@wx1 Object o) {
            m20787e();
            return m20791g().indexOf(o);
        }

        @Override // java.util.List
        public int lastIndexOf(@wx1 Object o) {
            m20787e();
            return m20791g().lastIndexOf(o);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m20787e();
            return new a();
        }

        @Override // java.util.List
        @dgc
        public V remove(int index) {
            m20787e();
            V vRemove = m20791g().remove(index);
            AbstractC11848r2.m20765k(AbstractC11848r2.this);
            m20788f();
            return vRemove;
        }

        @Override // java.util.List
        @dgc
        public V set(int index, @dgc V element) {
            m20787e();
            return m20791g().set(index, element);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int fromIndex, int toIndex) {
            m20787e();
            return AbstractC11848r2.this.m20772x(m20786d(), m20791g().subList(fromIndex, toIndex), m20784b() == null ? this : m20784b());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int index) {
            m20787e();
            return new a(index);
        }
    }
}
