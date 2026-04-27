package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.cv5;
import p000.d4b;
import p000.e4b;
import p000.tt9;
import p000.x3b;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public class cv5<K, V> extends AbstractC2173c3<K, V> implements iv5<K, V> {

    /* JADX INFO: renamed from: f */
    public final u3b<K, V> f27749f;

    /* JADX INFO: renamed from: m */
    public final l8d<? super Map.Entry<K, V>> f27750m;

    /* JADX INFO: renamed from: cv5$a */
    public class C4521a extends tt9.AbstractC13223r0<K, Collection<V>> {

        /* JADX INFO: renamed from: cv5$a$a */
        public class a extends tt9.AbstractC13224s<K, Collection<V>> {

            /* JADX INFO: renamed from: cv5$a$a$a, reason: collision with other inner class name */
            public class C16426a extends AbstractC0012a2<Map.Entry<K, Collection<V>>> {

                /* JADX INFO: renamed from: c */
                public final Iterator<Map.Entry<K, Collection<V>>> f27753c;

                public C16426a() {
                    this.f27753c = cv5.this.f27749f.asMap().entrySet().iterator();
                }

                @Override // p000.AbstractC0012a2
                @wx1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> computeNext() {
                    while (this.f27753c.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.f27753c.next();
                        K key = next.getKey();
                        Collection collectionM8718i = cv5.m8718i(next.getValue(), new C4523c(key));
                        if (!collectionM8718i.isEmpty()) {
                            return tt9.immutableEntry(key, collectionM8718i);
                        }
                    }
                    return m25a();
                }
            }

            public a() {
            }

            @Override // p000.tt9.AbstractC13224s
            /* JADX INFO: renamed from: a */
            public Map<K, Collection<V>> mo8722a() {
                return C4521a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C16426a();
            }

            @Override // p000.tt9.AbstractC13224s, p000.t6f.AbstractC12934k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c) {
                return cv5.this.m8719j(p8d.m19339in(c));
            }

            @Override // p000.tt9.AbstractC13224s, p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c) {
                return cv5.this.m8719j(p8d.not(p8d.m19339in(c)));
            }

            @Override // p000.tt9.AbstractC13224s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return wg8.size(iterator());
            }
        }

        /* JADX INFO: renamed from: cv5$a$b */
        public class b extends tt9.C13191b0<K, Collection<V>> {
            public b() {
                super(C4521a.this);
            }

            @Override // p000.tt9.C13191b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@wx1 Object o) {
                return C4521a.this.remove(o) != null;
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c) {
                return cv5.this.m8719j(tt9.m22799t(p8d.m19339in(c)));
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c) {
                return cv5.this.m8719j(tt9.m22799t(p8d.not(p8d.m19339in(c))));
            }
        }

        /* JADX INFO: renamed from: cv5$a$c */
        public class c extends tt9.C13221q0<K, Collection<V>> {
            public c() {
                super(C4521a.this);
            }

            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@wx1 Object o) {
                if (!(o instanceof Collection)) {
                    return false;
                }
                Collection collection = (Collection) o;
                Iterator<Map.Entry<K, Collection<V>>> it = cv5.this.f27749f.asMap().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<K, Collection<V>> next = it.next();
                    Collection collectionM8718i = cv5.m8718i(next.getValue(), new C4523c(next.getKey()));
                    if (!collectionM8718i.isEmpty() && collection.equals(collectionM8718i)) {
                        if (collectionM8718i.size() == next.getValue().size()) {
                            it.remove();
                            return true;
                        }
                        collectionM8718i.clear();
                        return true;
                    }
                }
                return false;
            }

            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> c) {
                return cv5.this.m8719j(tt9.m22779I(p8d.m19339in(c)));
            }

            @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> c) {
                return cv5.this.m8719j(tt9.m22779I(p8d.not(p8d.m19339in(c))));
            }
        }

        public C4521a() {
        }

        @Override // p000.tt9.AbstractC13223r0
        /* JADX INFO: renamed from: a */
        public Collection<Collection<V>> mo8721a() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            cv5.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return get(key) != null;
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
            return new a();
        }

        @Override // p000.tt9.AbstractC13223r0
        public Set<K> createKeySet() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Collection<V> get(@wx1 Object key) {
            Collection<V> collection = cv5.this.f27749f.asMap().get(key);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionM8718i = cv5.m8718i(collection, new C4523c(key));
            if (collectionM8718i.isEmpty()) {
                return null;
            }
            return collectionM8718i;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public Collection<V> remove(@wx1 Object key) {
            Collection<V> collection = cv5.this.f27749f.asMap().get(key);
            if (collection == null) {
                return null;
            }
            ArrayList arrayListNewArrayList = eb9.newArrayList();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (cv5.this.satisfies(key, next)) {
                    it.remove();
                    arrayListNewArrayList.add(next);
                }
            }
            if (arrayListNewArrayList.isEmpty()) {
                return null;
            }
            return cv5.this.f27749f instanceof p6f ? Collections.unmodifiableSet(t6f.newLinkedHashSet(arrayListNewArrayList)) : Collections.unmodifiableList(arrayListNewArrayList);
        }
    }

    /* JADX INFO: renamed from: cv5$b */
    public class C4522b extends x3b.C14901g<K, V> {

        /* JADX INFO: renamed from: cv5$b$a */
        public class a extends e4b.AbstractC5107i<K> {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ boolean lambda$removeEntriesIf$0(l8d l8dVar, Map.Entry entry) {
                return l8dVar.apply(e4b.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size()));
            }

            private boolean removeEntriesIf(final l8d<? super d4b.InterfaceC4612a<K>> predicate) {
                return cv5.this.m8719j(new l8d() { // from class: dv5
                    @Override // p000.l8d
                    public final boolean apply(Object obj) {
                        return cv5.C4522b.a.lambda$removeEntriesIf$0(predicate, (Map.Entry) obj);
                    }
                });
            }

            @Override // p000.e4b.AbstractC5107i
            /* JADX INFO: renamed from: a */
            public d4b<K> mo8725a() {
                return C4522b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<d4b.InterfaceC4612a<K>> iterator() {
                return C4522b.this.mo2919d();
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c) {
                return removeEntriesIf(p8d.m19339in(c));
            }

            @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c) {
                return removeEntriesIf(p8d.not(p8d.m19339in(c)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return cv5.this.keySet().size();
            }
        }

        public C4522b() {
            super(cv5.this);
        }

        @Override // p000.AbstractC4593d3, p000.d4b
        public Set<d4b.InterfaceC4612a<K>> entrySet() {
            return new a();
        }

        @Override // p000.x3b.C14901g, p000.AbstractC4593d3, p000.d4b
        public int remove(@wx1 Object key, int occurrences) {
            s72.m21765b(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(key);
            }
            Collection<V> collection = cv5.this.f27749f.asMap().get(key);
            int i = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (cv5.this.satisfies(key, it.next()) && (i = i + 1) <= occurrences) {
                    it.remove();
                }
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: cv5$c */
    public final class C4523c implements l8d<V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f27759a;

        public C4523c(@dgc K key) {
            this.f27759a = key;
        }

        @Override // p000.l8d
        public boolean apply(@dgc V value) {
            return cv5.this.satisfies(this.f27759a, value);
        }
    }

    public cv5(u3b<K, V> unfiltered, l8d<? super Map.Entry<K, V>> predicate) {
        this.f27749f = (u3b) v7d.checkNotNull(unfiltered);
        this.f27750m = (l8d) v7d.checkNotNull(predicate);
    }

    /* JADX INFO: renamed from: i */
    public static <E> Collection<E> m8718i(Collection<E> collection, l8d<? super E> predicate) {
        return collection instanceof Set ? t6f.filter((Set) collection, predicate) : h82.filter(collection, predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean satisfies(@dgc K key, @dgc V value) {
        return this.f27750m.apply(tt9.immutableEntry(key, value));
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: a */
    public Map<K, Collection<V>> mo3677a() {
        return new C4521a();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: b */
    public Collection<Map.Entry<K, V>> mo3678b() {
        return m8718i(this.f27749f.entries(), this.f27750m);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: c */
    public Set<K> mo3679c() {
        return asMap().keySet();
    }

    @Override // p000.u3b
    public void clear() {
        entries().clear();
    }

    @Override // p000.u3b
    public boolean containsKey(@wx1 Object key) {
        return asMap().get(key) != null;
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: d */
    public d4b<K> mo3680d() {
        return new C4522b();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: e */
    public Collection<V> mo3681e() {
        return new jv5(this);
    }

    @Override // p000.iv5
    public l8d<? super Map.Entry<K, V>> entryPredicate() {
        return this.f27750m;
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: f */
    public Iterator<Map.Entry<K, V>> mo3682f() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.u3b
    public Collection<V> get(@dgc K key) {
        return m8718i(this.f27749f.get(key), new C4523c(key));
    }

    /* JADX INFO: renamed from: j */
    public boolean m8719j(l8d<? super Map.Entry<K, Collection<V>>> predicate) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f27749f.asMap().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection collectionM8718i = m8718i(next.getValue(), new C4523c(key));
            if (!collectionM8718i.isEmpty() && predicate.apply(tt9.immutableEntry(key, collectionM8718i))) {
                if (collectionM8718i.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionM8718i.clear();
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public Collection<V> m8720k() {
        return this.f27749f instanceof p6f ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // p000.u3b
    public Collection<V> removeAll(@wx1 Object key) {
        return (Collection) yya.firstNonNull(asMap().remove(key), m8720k());
    }

    @Override // p000.u3b
    public int size() {
        return entries().size();
    }

    @Override // p000.iv5
    public u3b<K, V> unfiltered() {
        return this.f27749f;
    }
}
