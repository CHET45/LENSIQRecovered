package p000;

import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p000.AbstractC11848r2;
import p000.AbstractC2173c3;
import p000.d4b;
import p000.e4b;
import p000.mx7;
import p000.t6f;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class x3b {

    /* JADX INFO: renamed from: x3b$a */
    public static final class C14895a<K, V> extends tt9.AbstractC13223r0<K, Collection<V>> {

        /* JADX INFO: renamed from: d */
        @Weak
        public final u3b<K, V> f96140d;

        /* JADX INFO: renamed from: x3b$a$a */
        public class a extends tt9.AbstractC13224s<K, Collection<V>> {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ Collection lambda$iterator$0(Object obj) {
                return C14895a.this.f96140d.get(obj);
            }

            @Override // p000.tt9.AbstractC13224s
            /* JADX INFO: renamed from: a */
            public Map<K, Collection<V>> mo8722a() {
                return C14895a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return tt9.m22788i(C14895a.this.f96140d.keySet(), new lz6() { // from class: w3b
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return this.f93178a.lambda$iterator$0(obj);
                    }
                });
            }

            @Override // p000.tt9.AbstractC13224s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@wx1 Object o) {
                if (!contains(o)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o;
                Objects.requireNonNull(entry);
                C14895a.this.m24944c(entry.getKey());
                return true;
            }
        }

        public C14895a(u3b<K, V> multimap) {
            this.f96140d = (u3b) v7d.checkNotNull(multimap);
        }

        /* JADX INFO: renamed from: c */
        public void m24944c(@wx1 Object key) {
            this.f96140d.keySet().remove(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f96140d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return this.f96140d.containsKey(key);
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f96140d.isEmpty();
        }

        @Override // p000.tt9.AbstractC13223r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return this.f96140d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f96140d.keySet().size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Collection<V> get(@wx1 Object key) {
            if (containsKey(key)) {
                return this.f96140d.get(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Collection<V> remove(@wx1 Object key) {
            if (containsKey(key)) {
                return this.f96140d.removeAll(key);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: x3b$b */
    public static class C14896b<K, V> extends AbstractC8167k2<K, V> {

        @jd7
        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: C */
        public transient lfg<? extends List<V>> f96142C;

        public C14896b(Map<K, Collection<V>> map, lfg<? extends List<V>> factory) {
            super(map);
            this.f96142C = (lfg) v7d.checkNotNull(factory);
        }

        @jd7
        @yg8
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            this.f96142C = (lfg) object;
            Object object2 = stream.readObject();
            Objects.requireNonNull(object2);
            m20771u((Map) object2);
        }

        @jd7
        @yg8
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f96142C);
            stream.writeObject(mo17770o());
        }

        @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
        /* JADX INFO: renamed from: a */
        public Map<K, Collection<V>> mo3677a() {
            return m20769r();
        }

        @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
        /* JADX INFO: renamed from: c */
        public Set<K> mo3679c() {
            return m20770s();
        }

        @Override // p000.AbstractC8167k2, p000.AbstractC11848r2
        /* JADX INFO: renamed from: y */
        public List<V> mo9181p() {
            return this.f96142C.get();
        }
    }

    /* JADX INFO: renamed from: x3b$c */
    public static class C14897c<K, V> extends AbstractC11848r2<K, V> {

        @jd7
        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: C */
        public transient lfg<? extends Collection<V>> f96143C;

        public C14897c(Map<K, Collection<V>> map, lfg<? extends Collection<V>> factory) {
            super(map);
            this.f96143C = (lfg) v7d.checkNotNull(factory);
        }

        @jd7
        @yg8
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            this.f96143C = (lfg) object;
            Object object2 = stream.readObject();
            Objects.requireNonNull(object2);
            m20771u((Map) object2);
        }

        @jd7
        @yg8
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f96143C);
            stream.writeObject(mo17770o());
        }

        @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
        /* JADX INFO: renamed from: a */
        public Map<K, Collection<V>> mo3677a() {
            return m20769r();
        }

        @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
        /* JADX INFO: renamed from: c */
        public Set<K> mo3679c() {
            return m20770s();
        }

        @Override // p000.AbstractC11848r2
        /* JADX INFO: renamed from: p */
        public Collection<V> mo9181p() {
            return this.f96143C.get();
        }

        @Override // p000.AbstractC11848r2
        /* JADX INFO: renamed from: v */
        public <E> Collection<E> mo13708v(Collection<E> collection) {
            return collection instanceof NavigableSet ? t6f.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // p000.AbstractC11848r2
        /* JADX INFO: renamed from: w */
        public Collection<V> mo13709w(@dgc K key, Collection<V> collection) {
            return collection instanceof List ? m20772x(key, (List) collection, null) : collection instanceof NavigableSet ? new AbstractC11848r2.m(key, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractC11848r2.o(key, (SortedSet) collection, null) : collection instanceof Set ? new AbstractC11848r2.n(key, (Set) collection) : new AbstractC11848r2.k(key, collection, null);
        }
    }

    /* JADX INFO: renamed from: x3b$d */
    public static class C14898d<K, V> extends AbstractC7729j4<K, V> {

        @jd7
        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: C */
        public transient lfg<? extends Set<V>> f96144C;

        public C14898d(Map<K, Collection<V>> map, lfg<? extends Set<V>> factory) {
            super(map);
            this.f96144C = (lfg) v7d.checkNotNull(factory);
        }

        @jd7
        @yg8
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            this.f96144C = (lfg) object;
            Object object2 = stream.readObject();
            Objects.requireNonNull(object2);
            m20771u((Map) object2);
        }

        @jd7
        @yg8
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f96144C);
            stream.writeObject(mo17770o());
        }

        @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
        /* JADX INFO: renamed from: a */
        public Map<K, Collection<V>> mo3677a() {
            return m20769r();
        }

        @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
        /* JADX INFO: renamed from: c */
        public Set<K> mo3679c() {
            return m20770s();
        }

        @Override // p000.AbstractC7729j4, p000.AbstractC11848r2
        /* JADX INFO: renamed from: v */
        public <E> Collection<E> mo13708v(Collection<E> collection) {
            return collection instanceof NavigableSet ? t6f.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // p000.AbstractC7729j4, p000.AbstractC11848r2
        /* JADX INFO: renamed from: w */
        public Collection<V> mo13709w(@dgc K key, Collection<V> collection) {
            return collection instanceof NavigableSet ? new AbstractC11848r2.m(key, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractC11848r2.o(key, (SortedSet) collection, null) : new AbstractC11848r2.n(key, (Set) collection);
        }

        @Override // p000.AbstractC7729j4, p000.AbstractC11848r2
        /* JADX INFO: renamed from: y */
        public Set<V> mo9181p() {
            return this.f96144C.get();
        }
    }

    /* JADX INFO: renamed from: x3b$e */
    public static class C14899e<K, V> extends AbstractC10786p4<K, V> {

        @jd7
        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: C */
        public transient lfg<? extends SortedSet<V>> f96145C;

        /* JADX INFO: renamed from: F */
        @wx1
        public transient Comparator<? super V> f96146F;

        public C14899e(Map<K, Collection<V>> map, lfg<? extends SortedSet<V>> factory) {
            super(map);
            this.f96145C = (lfg) v7d.checkNotNull(factory);
            this.f96146F = factory.get().comparator();
        }

        @jd7
        @yg8
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            lfg<? extends SortedSet<V>> lfgVar = (lfg) object;
            this.f96145C = lfgVar;
            this.f96146F = lfgVar.get().comparator();
            Object object2 = stream.readObject();
            Objects.requireNonNull(object2);
            m20771u((Map) object2);
        }

        @jd7
        @yg8
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f96145C);
            stream.writeObject(mo17770o());
        }

        @Override // p000.AbstractC10786p4, p000.AbstractC7729j4
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> mo9181p() {
            return this.f96145C.get();
        }

        @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
        /* JADX INFO: renamed from: a */
        public Map<K, Collection<V>> mo3677a() {
            return m20769r();
        }

        @Override // p000.AbstractC11848r2, p000.AbstractC2173c3
        /* JADX INFO: renamed from: c */
        public Set<K> mo3679c() {
            return m20770s();
        }

        @Override // p000.rvf
        @wx1
        public Comparator<? super V> valueComparator() {
            return this.f96146F;
        }
    }

    /* JADX INFO: renamed from: x3b$f */
    public static abstract class AbstractC14900f<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* JADX INFO: renamed from: a */
        public abstract u3b<K, V> mo3684a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo3684a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            return mo3684a().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@wx1 Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            return mo3684a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo3684a().size();
        }
    }

    /* JADX INFO: renamed from: x3b$g */
    public static class C14901g<K, V> extends AbstractC4593d3<K> {

        /* JADX INFO: renamed from: c */
        @Weak
        public final u3b<K, V> f96147c;

        /* JADX INFO: renamed from: x3b$g$a */
        public class a extends geh<Map.Entry<K, Collection<V>>, d4b.InterfaceC4612a<K>> {

            /* JADX INFO: renamed from: x3b$g$a$a, reason: collision with other inner class name */
            public class C16551a extends e4b.AbstractC5104f<K> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f96148a;

                public C16551a(final a this$1, final Map.Entry val$backingEntry) {
                    this.f96148a = val$backingEntry;
                }

                @Override // p000.d4b.InterfaceC4612a
                public int getCount() {
                    return ((Collection) this.f96148a.getValue()).size();
                }

                @Override // p000.d4b.InterfaceC4612a
                @dgc
                public K getElement() {
                    return (K) this.f96148a.getKey();
                }
            }

            public a(final C14901g this$0, Iterator backingIterator) {
                super(backingIterator);
            }

            @Override // p000.geh
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d4b.InterfaceC4612a<K> mo2935a(final Map.Entry<K, Collection<V>> backingEntry) {
                return new C16551a(this, backingEntry);
            }
        }

        public C14901g(u3b<K, V> multimap) {
            this.f96147c = multimap;
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: b */
        public int mo2917b() {
            return this.f96147c.asMap().size();
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: c */
        public Iterator<K> mo2918c() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f96147c.clear();
        }

        @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection, p000.d4b
        public boolean contains(@wx1 Object element) {
            return this.f96147c.containsKey(element);
        }

        @Override // p000.d4b
        public int count(@wx1 Object element) {
            Collection collection = (Collection) tt9.m22804y(this.f96147c.asMap(), element);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // p000.AbstractC4593d3
        /* JADX INFO: renamed from: d */
        public Iterator<d4b.InterfaceC4612a<K>> mo2919d() {
            return new a(this, this.f96147c.asMap().entrySet().iterator());
        }

        @Override // p000.AbstractC4593d3, p000.d4b
        public Set<K> elementSet() {
            return this.f96147c.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.d4b
        public Iterator<K> iterator() {
            return tt9.m22797r(this.f96147c.entries().iterator());
        }

        @Override // p000.AbstractC4593d3, p000.d4b
        public int remove(@wx1 Object element, int occurrences) {
            s72.m21765b(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(element);
            }
            Collection collection = (Collection) tt9.m22804y(this.f96147c.asMap(), element);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (occurrences >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i = 0; i < occurrences; i++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
        public int size() {
            return this.f96147c.size();
        }
    }

    /* JADX INFO: renamed from: x3b$h */
    public static class C14902h<K, V> extends AbstractC2173c3<K, V> implements p6f<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;

        /* JADX INFO: renamed from: f */
        public final Map<K, V> f96149f;

        /* JADX INFO: renamed from: x3b$h$a */
        public class a extends t6f.AbstractC12934k<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f96150a;

            /* JADX INFO: renamed from: x3b$h$a$a, reason: collision with other inner class name */
            public class C16552a implements Iterator<V> {

                /* JADX INFO: renamed from: a */
                public int f96152a;

                public C16552a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f96152a == 0) {
                        a aVar = a.this;
                        if (C14902h.this.f96149f.containsKey(aVar.f96150a)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // java.util.Iterator
                @dgc
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f96152a++;
                    a aVar = a.this;
                    return (V) sib.m22018a(C14902h.this.f96149f.get(aVar.f96150a));
                }

                @Override // java.util.Iterator
                public void remove() {
                    s72.m21768e(this.f96152a == 1);
                    this.f96152a = -1;
                    a aVar = a.this;
                    C14902h.this.f96149f.remove(aVar.f96150a);
                }
            }

            public a(final Object val$key) {
                this.f96150a = val$key;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C16552a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C14902h.this.f96149f.containsKey(this.f96150a) ? 1 : 0;
            }
        }

        public C14902h(Map<K, V> map) {
            this.f96149f = (Map) v7d.checkNotNull(map);
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: a */
        public Map<K, Collection<V>> mo3677a() {
            return new C14895a(this);
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: b */
        public Collection<Map.Entry<K, V>> mo3678b() {
            throw new AssertionError("unreachable");
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: c */
        public Set<K> mo3679c() {
            return this.f96149f.keySet();
        }

        @Override // p000.u3b
        public void clear() {
            this.f96149f.clear();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean containsEntry(@wx1 Object key, @wx1 Object value) {
            return this.f96149f.entrySet().contains(tt9.immutableEntry(key, value));
        }

        @Override // p000.u3b
        public boolean containsKey(@wx1 Object key) {
            return this.f96149f.containsKey(key);
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean containsValue(@wx1 Object value) {
            return this.f96149f.containsValue(value);
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: d */
        public d4b<K> mo3680d() {
            return new C14901g(this);
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: e */
        public Collection<V> mo3681e() {
            return this.f96149f.values();
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: f */
        public Iterator<Map.Entry<K, V>> mo3682f() {
            return this.f96149f.entrySet().iterator();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public int hashCode() {
            return this.f96149f.hashCode();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean put(@dgc K key, @dgc V value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean putAll(@dgc K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean remove(@wx1 Object key, @wx1 Object value) {
            return this.f96149f.entrySet().remove(tt9.immutableEntry(key, value));
        }

        @Override // p000.u3b
        public int size() {
            return this.f96149f.size();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public Set<Map.Entry<K, V>> entries() {
            return this.f96149f.entrySet();
        }

        @Override // p000.u3b
        public Set<V> get(@dgc final K key) {
            return new a(key);
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean putAll(u3b<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.u3b
        public Set<V> removeAll(@wx1 Object key) {
            HashSet hashSet = new HashSet(2);
            if (!this.f96149f.containsKey(key)) {
                return hashSet;
            }
            hashSet.add(this.f96149f.remove(key));
            return hashSet;
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public Set<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: x3b$i */
    public static final class C14903i<K, V1, V2> extends C14904j<K, V1, V2> implements j99<K, V2> {
        public C14903i(j99<K, V1> fromMultimap, tt9.InterfaceC13225t<? super K, ? super V1, V2> transformer) {
            super(fromMultimap, transformer);
        }

        @Override // p000.x3b.C14904j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public List<V2> lambda$createAsMap$0(@dgc K key, Collection<V1> values) {
            return eb9.transform((List) values, tt9.m22789j(this.f96155m, key));
        }

        @Override // p000.x3b.C14904j, p000.u3b
        public List<V2> get(@dgc K key) {
            return mo24947i(key, this.f96154f.get(key));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.x3b.C14904j, p000.u3b
        public List<V2> removeAll(@wx1 Object key) {
            return mo24947i(key, this.f96154f.removeAll(key));
        }

        @Override // p000.x3b.C14904j, p000.AbstractC2173c3, p000.u3b
        public List<V2> replaceValues(@dgc K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: x3b$j */
    public static class C14904j<K, V1, V2> extends AbstractC2173c3<K, V2> {

        /* JADX INFO: renamed from: f */
        public final u3b<K, V1> f96154f;

        /* JADX INFO: renamed from: m */
        public final tt9.InterfaceC13225t<? super K, ? super V1, V2> f96155m;

        public C14904j(u3b<K, V1> fromMultimap, final tt9.InterfaceC13225t<? super K, ? super V1, V2> transformer) {
            this.f96154f = (u3b) v7d.checkNotNull(fromMultimap);
            this.f96155m = (tt9.InterfaceC13225t) v7d.checkNotNull(transformer);
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: a */
        public Map<K, Collection<V2>> mo3677a() {
            return tt9.transformEntries(this.f96154f.asMap(), new tt9.InterfaceC13225t() { // from class: y3b
                @Override // p000.tt9.InterfaceC13225t
                public final Object transformEntry(Object obj, Object obj2) {
                    return this.f100222a.lambda$createAsMap$0(obj, (Collection) obj2);
                }
            });
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: b */
        public Collection<Map.Entry<K, V2>> mo3678b() {
            return new AbstractC2173c3.a();
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: c */
        public Set<K> mo3679c() {
            return this.f96154f.keySet();
        }

        @Override // p000.u3b
        public void clear() {
            this.f96154f.clear();
        }

        @Override // p000.u3b
        public boolean containsKey(@wx1 Object key) {
            return this.f96154f.containsKey(key);
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: d */
        public d4b<K> mo3680d() {
            return this.f96154f.keys();
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: e */
        public Collection<V2> mo3681e() {
            return h82.transform(this.f96154f.entries(), tt9.m22786g(this.f96155m));
        }

        @Override // p000.AbstractC2173c3
        /* JADX INFO: renamed from: f */
        public Iterator<Map.Entry<K, V2>> mo3682f() {
            return wg8.transform(this.f96154f.entries().iterator(), tt9.m22785f(this.f96155m));
        }

        @Override // p000.u3b
        public Collection<V2> get(@dgc final K key) {
            return lambda$createAsMap$0(key, this.f96154f.get(key));
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Collection<V2> lambda$createAsMap$0(@dgc K key, Collection<V1> values) {
            lz6 lz6VarM22789j = tt9.m22789j(this.f96155m, key);
            return values instanceof List ? eb9.transform((List) values, lz6VarM22789j) : h82.transform(values, lz6VarM22789j);
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean isEmpty() {
            return this.f96154f.isEmpty();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean put(@dgc K key, @dgc V2 value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean putAll(@dgc K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean remove(@wx1 Object key, @wx1 Object value) {
            return get(key).remove(value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.u3b
        public Collection<V2> removeAll(@wx1 Object key) {
            return lambda$createAsMap$0(key, this.f96154f.removeAll(key));
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public Collection<V2> replaceValues(@dgc K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.u3b
        public int size() {
            return this.f96154f.size();
        }

        @Override // p000.AbstractC2173c3, p000.u3b
        public boolean putAll(u3b<? extends K, ? extends V2> multimap) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: x3b$k */
    public static class C14905k<K, V> extends C14906l<K, V> implements j99<K, V> {
        private static final long serialVersionUID = 0;

        public C14905k(j99<K, V> delegate) {
            super(delegate);
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.u3b
        public List<V> get(@dgc K key) {
            return Collections.unmodifiableList(mo8967m().get((Object) key));
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.u3b
        public List<V> removeAll(@wx1 Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.u3b
        public List<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.zs6
        /* JADX INFO: renamed from: delegate */
        public j99<K, V> mo8967m() {
            return (j99) super.mo8967m();
        }
    }

    /* JADX INFO: renamed from: x3b$l */
    public static class C14906l<K, V> extends ts6<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final u3b<K, V> f96156a;

        /* JADX INFO: renamed from: b */
        @wx1
        @ez8
        public transient Collection<Map.Entry<K, V>> f96157b;

        /* JADX INFO: renamed from: c */
        @wx1
        @ez8
        public transient d4b<K> f96158c;

        /* JADX INFO: renamed from: d */
        @wx1
        @ez8
        public transient Set<K> f96159d;

        /* JADX INFO: renamed from: e */
        @wx1
        @ez8
        public transient Collection<V> f96160e;

        /* JADX INFO: renamed from: f */
        @wx1
        @ez8
        public transient Map<K, Collection<V>> f96161f;

        public C14906l(final u3b<K, V> delegate) {
            this.f96156a = (u3b) v7d.checkNotNull(delegate);
        }

        @Override // p000.ts6, p000.u3b
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.f96161f;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = Collections.unmodifiableMap(tt9.transformValues(this.f96156a.asMap(), new lz6() { // from class: z3b
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return x3b.m24941b((Collection) obj);
                }
            }));
            this.f96161f = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // p000.ts6, p000.u3b
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.ts6, p000.u3b
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.f96157b;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionUnmodifiableEntries = x3b.unmodifiableEntries(this.f96156a.entries());
            this.f96157b = collectionUnmodifiableEntries;
            return collectionUnmodifiableEntries;
        }

        @Override // p000.ts6, p000.u3b
        public Collection<V> get(@dgc K key) {
            return x3b.unmodifiableValueCollection(this.f96156a.get(key));
        }

        @Override // p000.ts6, p000.u3b
        public Set<K> keySet() {
            Set<K> set = this.f96159d;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = Collections.unmodifiableSet(this.f96156a.keySet());
            this.f96159d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // p000.ts6, p000.u3b
        public d4b<K> keys() {
            d4b<K> d4bVar = this.f96158c;
            if (d4bVar != null) {
                return d4bVar;
            }
            d4b<K> d4bVarUnmodifiableMultiset = e4b.unmodifiableMultiset(this.f96156a.keys());
            this.f96158c = d4bVarUnmodifiableMultiset;
            return d4bVarUnmodifiableMultiset;
        }

        @Override // p000.ts6, p000.u3b
        public boolean put(@dgc K key, @dgc V value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.ts6, p000.u3b
        public boolean putAll(@dgc K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.ts6, p000.u3b
        public boolean remove(@wx1 Object key, @wx1 Object value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.ts6, p000.u3b
        public Collection<V> removeAll(@wx1 Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.ts6, p000.u3b
        public Collection<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.ts6, p000.u3b
        public Collection<V> values() {
            Collection<V> collection = this.f96160e;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f96156a.values());
            this.f96160e = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        @Override // p000.ts6, p000.zs6
        /* JADX INFO: renamed from: delegate */
        public u3b<K, V> mo8967m() {
            return this.f96156a;
        }

        @Override // p000.ts6, p000.u3b
        public boolean putAll(u3b<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: x3b$m */
    public static class C14907m<K, V> extends C14906l<K, V> implements p6f<K, V> {
        private static final long serialVersionUID = 0;

        public C14907m(p6f<K, V> delegate) {
            super(delegate);
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.u3b
        public Set<Map.Entry<K, V>> entries() {
            return tt9.m22775E(mo8967m().entries());
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.u3b
        public Set<V> get(@dgc K key) {
            return Collections.unmodifiableSet(mo8967m().get((Object) key));
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.u3b
        public Set<V> removeAll(@wx1 Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.u3b
        public Set<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.x3b.C14906l, p000.ts6, p000.zs6
        /* JADX INFO: renamed from: delegate */
        public p6f<K, V> mo8967m() {
            return (p6f) super.mo8967m();
        }
    }

    private x3b() {
    }

    public static <K, V> Map<K, List<V>> asMap(j99<K, V> j99Var) {
        return j99Var.asMap();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Collection m24941b(Collection collection) {
        return unmodifiableValueCollection(collection);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24942c(u3b<?, ?> multimap, @wx1 Object object) {
        if (object == multimap) {
            return true;
        }
        if (object instanceof u3b) {
            return multimap.asMap().equals(((u3b) object).asMap());
        }
        return false;
    }

    public static <K, V> u3b<K, V> filterEntries(u3b<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
        v7d.checkNotNull(entryPredicate);
        return unfiltered instanceof p6f ? filterEntries((p6f) unfiltered, (l8d) entryPredicate) : unfiltered instanceof iv5 ? filterFiltered((iv5) unfiltered, entryPredicate) : new cv5((u3b) v7d.checkNotNull(unfiltered), entryPredicate);
    }

    private static <K, V> u3b<K, V> filterFiltered(iv5<K, V> multimap, l8d<? super Map.Entry<K, V>> entryPredicate) {
        return new cv5(multimap.unfiltered(), p8d.and(multimap.entryPredicate(), entryPredicate));
    }

    public static <K, V> u3b<K, V> filterKeys(u3b<K, V> unfiltered, final l8d<? super K> keyPredicate) {
        if (unfiltered instanceof p6f) {
            return filterKeys((p6f) unfiltered, (l8d) keyPredicate);
        }
        if (unfiltered instanceof j99) {
            return filterKeys((j99) unfiltered, (l8d) keyPredicate);
        }
        if (!(unfiltered instanceof gv5)) {
            return unfiltered instanceof iv5 ? filterFiltered((iv5) unfiltered, tt9.m22799t(keyPredicate)) : new gv5(unfiltered, keyPredicate);
        }
        gv5 gv5Var = (gv5) unfiltered;
        return new gv5(gv5Var.f41457f, p8d.and(gv5Var.f41458m, keyPredicate));
    }

    public static <K, V> u3b<K, V> filterValues(u3b<K, V> unfiltered, final l8d<? super V> valuePredicate) {
        return filterEntries(unfiltered, tt9.m22779I(valuePredicate));
    }

    public static <K, V> p6f<K, V> forMap(Map<K, V> map) {
        return new C14902h(map);
    }

    public static <K, V> mx7<K, V> index(Iterable<V> values, lz6<? super V, K> keyFunction) {
        return index(values.iterator(), keyFunction);
    }

    @op1
    public static <K, V, M extends u3b<K, V>> M invertFrom(u3b<? extends V, ? extends K> source, M dest) {
        v7d.checkNotNull(dest);
        for (Map.Entry<? extends V, ? extends K> entry : source.entries()) {
            dest.put(entry.getValue(), entry.getKey());
        }
        return dest;
    }

    public static <K, V> j99<K, V> newListMultimap(Map<K, Collection<V>> map, final lfg<? extends List<V>> factory) {
        return new C14896b(map, factory);
    }

    public static <K, V> u3b<K, V> newMultimap(Map<K, Collection<V>> map, final lfg<? extends Collection<V>> factory) {
        return new C14897c(map, factory);
    }

    public static <K, V> p6f<K, V> newSetMultimap(Map<K, Collection<V>> map, final lfg<? extends Set<V>> factory) {
        return new C14898d(map, factory);
    }

    public static <K, V> rvf<K, V> newSortedSetMultimap(Map<K, Collection<V>> map, final lfg<? extends SortedSet<V>> factory) {
        return new C14899e(map, factory);
    }

    public static <K, V> j99<K, V> synchronizedListMultimap(j99<K, V> multimap) {
        return xhg.m25163i(multimap, null);
    }

    public static <K, V> u3b<K, V> synchronizedMultimap(u3b<K, V> multimap) {
        return xhg.m25165k(multimap, null);
    }

    public static <K, V> p6f<K, V> synchronizedSetMultimap(p6f<K, V> multimap) {
        return xhg.m25173s(multimap, null);
    }

    public static <K, V> rvf<K, V> synchronizedSortedSetMultimap(rvf<K, V> multimap) {
        return xhg.m25175u(multimap, null);
    }

    public static <K, V1, V2> u3b<K, V2> transformEntries(u3b<K, V1> fromMap, tt9.InterfaceC13225t<? super K, ? super V1, V2> transformer) {
        return new C14904j(fromMap, transformer);
    }

    public static <K, V1, V2> u3b<K, V2> transformValues(u3b<K, V1> fromMultimap, final lz6<? super V1, V2> function) {
        v7d.checkNotNull(function);
        return transformEntries(fromMultimap, tt9.m22787h(function));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Collection<Map.Entry<K, V>> unmodifiableEntries(Collection<Map.Entry<K, V>> entries) {
        return entries instanceof Set ? tt9.m22775E((Set) entries) : new tt9.C13213m0(Collections.unmodifiableCollection(entries));
    }

    public static <K, V> j99<K, V> unmodifiableListMultimap(j99<K, V> delegate) {
        return ((delegate instanceof C14905k) || (delegate instanceof mx7)) ? delegate : new C14905k(delegate);
    }

    public static <K, V> u3b<K, V> unmodifiableMultimap(u3b<K, V> delegate) {
        return ((delegate instanceof C14906l) || (delegate instanceof ux7)) ? delegate : new C14906l(delegate);
    }

    public static <K, V> p6f<K, V> unmodifiableSetMultimap(p6f<K, V> delegate) {
        return ((delegate instanceof C14907m) || (delegate instanceof gy7)) ? delegate : new C14907m(delegate);
    }

    public static <K, V> rvf<K, V> unmodifiableSortedSetMultimap(rvf<K, V> delegate) {
        return delegate instanceof C14908n ? delegate : new C14908n(delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> Collection<V> unmodifiableValueCollection(Collection<V> collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: x3b$n */
    public static class C14908n<K, V> extends C14907m<K, V> implements rvf<K, V> {
        private static final long serialVersionUID = 0;

        public C14908n(rvf<K, V> delegate) {
            super(delegate);
        }

        @Override // p000.rvf
        @wx1
        public Comparator<? super V> valueComparator() {
            return mo8967m().valueComparator();
        }

        @Override // p000.x3b.C14907m, p000.x3b.C14906l, p000.ts6, p000.u3b
        public SortedSet<V> get(@dgc K key) {
            return Collections.unmodifiableSortedSet(mo8967m().get((Object) key));
        }

        @Override // p000.x3b.C14907m, p000.x3b.C14906l, p000.ts6, p000.u3b
        public SortedSet<V> removeAll(@wx1 Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.x3b.C14907m, p000.x3b.C14906l, p000.ts6, p000.u3b
        public SortedSet<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.x3b.C14907m, p000.x3b.C14906l, p000.ts6, p000.zs6
        /* JADX INFO: renamed from: delegate */
        public rvf<K, V> mo8967m() {
            return (rvf) super.mo8967m();
        }
    }

    public static <K, V> Map<K, Set<V>> asMap(p6f<K, V> p6fVar) {
        return p6fVar.asMap();
    }

    public static <K, V> p6f<K, V> filterValues(p6f<K, V> unfiltered, final l8d<? super V> valuePredicate) {
        return filterEntries((p6f) unfiltered, tt9.m22779I(valuePredicate));
    }

    public static <K, V> mx7<K, V> index(Iterator<V> values, lz6<? super V, K> keyFunction) {
        v7d.checkNotNull(keyFunction);
        mx7.C9581a c9581aBuilder = mx7.builder();
        while (values.hasNext()) {
            V next = values.next();
            v7d.checkNotNull(next, values);
            c9581aBuilder.put((Object) keyFunction.apply(next), (Object) next);
        }
        return c9581aBuilder.build();
    }

    public static <K, V1, V2> j99<K, V2> transformEntries(j99<K, V1> fromMap, tt9.InterfaceC13225t<? super K, ? super V1, V2> transformer) {
        return new C14903i(fromMap, transformer);
    }

    public static <K, V> Map<K, SortedSet<V>> asMap(rvf<K, V> rvfVar) {
        return rvfVar.asMap();
    }

    private static <K, V> p6f<K, V> filterFiltered(kv5<K, V> multimap, l8d<? super Map.Entry<K, V>> entryPredicate) {
        return new ev5(multimap.unfiltered(), p8d.and(multimap.entryPredicate(), entryPredicate));
    }

    @Deprecated
    public static <K, V> j99<K, V> unmodifiableListMultimap(mx7<K, V> delegate) {
        return (j99) v7d.checkNotNull(delegate);
    }

    @Deprecated
    public static <K, V> u3b<K, V> unmodifiableMultimap(ux7<K, V> delegate) {
        return (u3b) v7d.checkNotNull(delegate);
    }

    @Deprecated
    public static <K, V> p6f<K, V> unmodifiableSetMultimap(gy7<K, V> delegate) {
        return (p6f) v7d.checkNotNull(delegate);
    }

    public static <K, V> Map<K, Collection<V>> asMap(u3b<K, V> multimap) {
        return multimap.asMap();
    }

    public static <K, V1, V2> j99<K, V2> transformValues(j99<K, V1> fromMultimap, final lz6<? super V1, V2> function) {
        v7d.checkNotNull(function);
        return transformEntries((j99) fromMultimap, tt9.m22787h(function));
    }

    public static <K, V> p6f<K, V> filterEntries(p6f<K, V> unfiltered, l8d<? super Map.Entry<K, V>> entryPredicate) {
        v7d.checkNotNull(entryPredicate);
        if (unfiltered instanceof kv5) {
            return filterFiltered((kv5) unfiltered, (l8d) entryPredicate);
        }
        return new ev5((p6f) v7d.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V> p6f<K, V> filterKeys(p6f<K, V> unfiltered, final l8d<? super K> keyPredicate) {
        if (unfiltered instanceof hv5) {
            hv5 hv5Var = (hv5) unfiltered;
            return new hv5(hv5Var.unfiltered(), p8d.and(hv5Var.f41458m, keyPredicate));
        }
        if (unfiltered instanceof kv5) {
            return filterFiltered((kv5) unfiltered, tt9.m22799t(keyPredicate));
        }
        return new hv5(unfiltered, keyPredicate);
    }

    public static <K, V> j99<K, V> filterKeys(j99<K, V> unfiltered, final l8d<? super K> keyPredicate) {
        if (unfiltered instanceof fv5) {
            fv5 fv5Var = (fv5) unfiltered;
            return new fv5(fv5Var.unfiltered(), p8d.and(fv5Var.f41458m, keyPredicate));
        }
        return new fv5(unfiltered, keyPredicate);
    }
}
