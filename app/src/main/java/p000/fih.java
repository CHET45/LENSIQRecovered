package p000;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public final class fih<K extends Comparable, V> implements fpd<K, V> {

    /* JADX INFO: renamed from: b */
    public static final fpd<Comparable<?>, Object> f36811b = new C5843a();

    /* JADX INFO: renamed from: a */
    public final NavigableMap<ie3<K>, C5845c<K, V>> f36812a = tt9.newTreeMap();

    /* JADX INFO: renamed from: fih$a */
    public class C5843a implements fpd<Comparable<?>, Object> {
        @Override // p000.fpd
        public Map<bpd<Comparable<?>>, Object> asDescendingMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // p000.fpd
        public Map<bpd<Comparable<?>>, Object> asMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // p000.fpd
        public void clear() {
        }

        @Override // p000.fpd
        @wx1
        public Object get(Comparable<?> key) {
            return null;
        }

        @Override // p000.fpd
        @wx1
        public Map.Entry<bpd<Comparable<?>>, Object> getEntry(Comparable<?> key) {
            return null;
        }

        @Override // p000.fpd
        public void put(bpd<Comparable<?>> range, Object value) {
            v7d.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // p000.fpd
        public void putAll(fpd<Comparable<?>, ? extends Object> rangeMap) {
            if (!rangeMap.asMapOfRanges().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // p000.fpd
        public void putCoalescing(bpd<Comparable<?>> range, Object value) {
            v7d.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // p000.fpd
        public void remove(bpd<Comparable<?>> range) {
            v7d.checkNotNull(range);
        }

        @Override // p000.fpd
        public bpd<Comparable<?>> span() {
            throw new NoSuchElementException();
        }

        @Override // p000.fpd
        public fpd<Comparable<?>, Object> subRangeMap(bpd<Comparable<?>> range) {
            v7d.checkNotNull(range);
            return this;
        }
    }

    /* JADX INFO: renamed from: fih$b */
    public final class C5844b extends tt9.AbstractC13189a0<bpd<K>, V> {

        /* JADX INFO: renamed from: a */
        public final Iterable<Map.Entry<bpd<K>, V>> f36813a;

        public C5844b(Iterable<C5845c<K, V>> entryIterable) {
            this.f36813a = entryIterable;
        }

        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<bpd<K>, V>> mo10935a() {
            return this.f36813a.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return get(key) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public V get(@wx1 Object obj) {
            if (!(obj instanceof bpd)) {
                return null;
            }
            bpd bpdVar = (bpd) obj;
            C5845c c5845c = (C5845c) fih.this.f36812a.get(bpdVar.f14409a);
            if (c5845c == null || !c5845c.getKey().equals(bpdVar)) {
                return null;
            }
            return (V) c5845c.getValue();
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return fih.this.f36812a.size();
        }
    }

    /* JADX INFO: renamed from: fih$c */
    public static final class C5845c<K extends Comparable, V> extends AbstractC13818v2<bpd<K>, V> {

        /* JADX INFO: renamed from: a */
        public final bpd<K> f36815a;

        /* JADX INFO: renamed from: b */
        public final V f36816b;

        public C5845c(ie3<K> lowerBound, ie3<K> upperBound, V value) {
            this(bpd.m3329b(lowerBound, upperBound), value);
        }

        /* JADX INFO: renamed from: a */
        public ie3<K> m10936a() {
            return (ie3<K>) this.f36815a.f14409a;
        }

        /* JADX INFO: renamed from: b */
        public ie3<K> m10937b() {
            return (ie3<K>) this.f36815a.f14410b;
        }

        public boolean contains(K value) {
            return this.f36815a.contains(value);
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        public V getValue() {
            return this.f36816b;
        }

        public C5845c(bpd<K> range, V value) {
            this.f36815a = range;
            this.f36816b = value;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        public bpd<K> getKey() {
            return this.f36815a;
        }
    }

    /* JADX INFO: renamed from: fih$d */
    public class C5846d implements fpd<K, V> {

        /* JADX INFO: renamed from: a */
        public final bpd<K> f36817a;

        /* JADX INFO: renamed from: fih$d$a */
        public class a extends fih<K, V>.C5846d.b {

            /* JADX INFO: renamed from: fih$d$a$a, reason: collision with other inner class name */
            public class C16444a extends AbstractC0012a2<Map.Entry<bpd<K>, V>> {

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Iterator f36820c;

                public C16444a(final Iterator val$backingItr) {
                    this.f36820c = val$backingItr;
                }

                @Override // p000.AbstractC0012a2
                @wx1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<bpd<K>, V> computeNext() {
                    if (!this.f36820c.hasNext()) {
                        return (Map.Entry) m25a();
                    }
                    C5845c c5845c = (C5845c) this.f36820c.next();
                    return c5845c.m10937b().compareTo((ie3) C5846d.this.f36817a.f14409a) <= 0 ? (Map.Entry) m25a() : tt9.immutableEntry(c5845c.getKey().intersection(C5846d.this.f36817a), c5845c.getValue());
                }
            }

            public a() {
                super();
            }

            @Override // p000.fih.C5846d.b
            /* JADX INFO: renamed from: b */
            public Iterator<Map.Entry<bpd<K>, V>> mo10939b() {
                return C5846d.this.f36817a.isEmpty() ? wg8.m24511e() : new C16444a(fih.this.f36812a.headMap(C5846d.this.f36817a.f14410b, false).descendingMap().values().iterator());
            }
        }

        /* JADX INFO: renamed from: fih$d$b */
        public class b extends AbstractMap<bpd<K>, V> {

            /* JADX INFO: renamed from: fih$d$b$a */
            public class a extends tt9.C13191b0<bpd<K>, V> {
                public a(Map map) {
                    super(map);
                }

                @Override // p000.tt9.C13191b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@wx1 Object o) {
                    return b.this.remove(o) != null;
                }

                @Override // p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> c) {
                    return b.this.removeEntryIf(p8d.compose(p8d.not(p8d.m19339in(c)), tt9.m22796q()));
                }
            }

            /* JADX INFO: renamed from: fih$d$b$b, reason: collision with other inner class name */
            public class C16445b extends tt9.AbstractC13224s<bpd<K>, V> {
                public C16445b() {
                }

                @Override // p000.tt9.AbstractC13224s
                /* JADX INFO: renamed from: a */
                public Map<bpd<K>, V> mo8722a() {
                    return b.this;
                }

                @Override // p000.tt9.AbstractC13224s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<bpd<K>, V>> iterator() {
                    return b.this.mo10939b();
                }

                @Override // p000.tt9.AbstractC13224s, p000.t6f.AbstractC12934k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> c) {
                    return b.this.removeEntryIf(p8d.not(p8d.m19339in(c)));
                }

                @Override // p000.tt9.AbstractC13224s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return wg8.size(iterator());
                }
            }

            /* JADX INFO: renamed from: fih$d$b$c */
            public class c extends AbstractC0012a2<Map.Entry<bpd<K>, V>> {

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Iterator f36825c;

                public c(final Iterator val$backingItr) {
                    this.f36825c = val$backingItr;
                }

                @Override // p000.AbstractC0012a2
                @wx1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<bpd<K>, V> computeNext() {
                    while (this.f36825c.hasNext()) {
                        C5845c c5845c = (C5845c) this.f36825c.next();
                        if (c5845c.m10936a().compareTo((ie3) C5846d.this.f36817a.f14410b) >= 0) {
                            return (Map.Entry) m25a();
                        }
                        if (c5845c.m10937b().compareTo((ie3) C5846d.this.f36817a.f14409a) > 0) {
                            return tt9.immutableEntry(c5845c.getKey().intersection(C5846d.this.f36817a), c5845c.getValue());
                        }
                    }
                    return (Map.Entry) m25a();
                }
            }

            /* JADX INFO: renamed from: fih$d$b$d */
            public class d extends tt9.C13221q0<bpd<K>, V> {
                public d(Map map) {
                    super(map);
                }

                @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> c) {
                    return b.this.removeEntryIf(p8d.compose(p8d.m19339in(c), tt9.m22776F()));
                }

                @Override // p000.tt9.C13221q0, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> c) {
                    return b.this.removeEntryIf(p8d.compose(p8d.not(p8d.m19339in(c)), tt9.m22776F()));
                }
            }

            public b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean removeEntryIf(l8d<? super Map.Entry<bpd<K>, V>> predicate) {
                ArrayList arrayListNewArrayList = eb9.newArrayList();
                for (Map.Entry<bpd<K>, V> entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        arrayListNewArrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayListNewArrayList.iterator();
                while (it.hasNext()) {
                    fih.this.remove((bpd) it.next());
                }
                return !arrayListNewArrayList.isEmpty();
            }

            /* JADX INFO: renamed from: b */
            public Iterator<Map.Entry<bpd<K>, V>> mo10939b() {
                if (C5846d.this.f36817a.isEmpty()) {
                    return wg8.m24511e();
                }
                return new c(fih.this.f36812a.tailMap((ie3) yya.firstNonNull((ie3) fih.this.f36812a.floorKey(C5846d.this.f36817a.f14409a), C5846d.this.f36817a.f14409a), true).values().iterator());
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                C5846d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(@wx1 Object key) {
                return get(key) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<bpd<K>, V>> entrySet() {
                return new C16445b();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.AbstractMap, java.util.Map
            @wx1
            public V get(@wx1 Object obj) {
                C5845c c5845c;
                try {
                    if (obj instanceof bpd) {
                        bpd bpdVar = (bpd) obj;
                        if (C5846d.this.f36817a.encloses(bpdVar) && !bpdVar.isEmpty()) {
                            if (bpdVar.f14409a.compareTo((ie3) C5846d.this.f36817a.f14409a) == 0) {
                                Map.Entry entryFloorEntry = fih.this.f36812a.floorEntry(bpdVar.f14409a);
                                c5845c = entryFloorEntry != null ? (C5845c) entryFloorEntry.getValue() : null;
                            } else {
                                c5845c = (C5845c) fih.this.f36812a.get(bpdVar.f14409a);
                            }
                            if (c5845c != null && c5845c.getKey().isConnected(C5846d.this.f36817a) && c5845c.getKey().intersection(C5846d.this.f36817a).equals(bpdVar)) {
                                return (V) c5845c.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<bpd<K>> keySet() {
                return new a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            @wx1
            public V remove(@wx1 Object obj) {
                V v = (V) get(obj);
                if (v == null) {
                    return null;
                }
                Objects.requireNonNull(obj);
                fih.this.remove((bpd) obj);
                return v;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new d(this);
            }
        }

        public C5846d(bpd<K> subRange) {
            this.f36817a = subRange;
        }

        @Override // p000.fpd
        public Map<bpd<K>, V> asDescendingMapOfRanges() {
            return new a();
        }

        @Override // p000.fpd
        public Map<bpd<K>, V> asMapOfRanges() {
            return new b();
        }

        @Override // p000.fpd
        public void clear() {
            fih.this.remove(this.f36817a);
        }

        @Override // p000.fpd
        public boolean equals(@wx1 Object o) {
            if (o instanceof fpd) {
                return asMapOfRanges().equals(((fpd) o).asMapOfRanges());
            }
            return false;
        }

        @Override // p000.fpd
        @wx1
        public V get(K k) {
            if (this.f36817a.contains(k)) {
                return (V) fih.this.get(k);
            }
            return null;
        }

        @Override // p000.fpd
        @wx1
        public Map.Entry<bpd<K>, V> getEntry(K k) {
            Map.Entry<bpd<K>, V> entry;
            if (!this.f36817a.contains(k) || (entry = fih.this.getEntry(k)) == null) {
                return null;
            }
            return tt9.immutableEntry(entry.getKey().intersection(this.f36817a), entry.getValue());
        }

        @Override // p000.fpd
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // p000.fpd
        public void put(bpd<K> range, V value) {
            v7d.checkArgument(this.f36817a.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, this.f36817a);
            fih.this.put(range, value);
        }

        @Override // p000.fpd
        public void putAll(fpd<K, ? extends V> rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            bpd<K> bpdVarSpan = rangeMap.span();
            v7d.checkArgument(this.f36817a.encloses(bpdVarSpan), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", bpdVarSpan, this.f36817a);
            fih.this.putAll(rangeMap);
        }

        @Override // p000.fpd
        public void putCoalescing(bpd<K> range, V value) {
            if (fih.this.f36812a.isEmpty() || !this.f36817a.encloses(range)) {
                put(range, value);
            } else {
                put(fih.this.coalescedRange(range, v7d.checkNotNull(value)).intersection(this.f36817a), value);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.fpd
        public void remove(bpd<K> bpdVar) {
            if (bpdVar.isConnected(this.f36817a)) {
                fih.this.remove(bpdVar.intersection(this.f36817a));
            }
        }

        @Override // p000.fpd
        public bpd<K> span() {
            ie3 ie3Var;
            Map.Entry entryFloorEntry = fih.this.f36812a.floorEntry(this.f36817a.f14409a);
            if (entryFloorEntry == null || ((C5845c) entryFloorEntry.getValue()).m10937b().compareTo((ie3) this.f36817a.f14409a) <= 0) {
                ie3Var = (ie3) fih.this.f36812a.ceilingKey(this.f36817a.f14409a);
                if (ie3Var == null || ie3Var.compareTo((ie3) this.f36817a.f14410b) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                ie3Var = this.f36817a.f14409a;
            }
            Map.Entry entryLowerEntry = fih.this.f36812a.lowerEntry(this.f36817a.f14410b);
            if (entryLowerEntry != null) {
                return bpd.m3329b(ie3Var, ((C5845c) entryLowerEntry.getValue()).m10937b().compareTo((ie3) this.f36817a.f14410b) >= 0 ? this.f36817a.f14410b : ((C5845c) entryLowerEntry.getValue()).m10937b());
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.fpd
        public fpd<K, V> subRangeMap(bpd<K> bpdVar) {
            return !bpdVar.isConnected(this.f36817a) ? fih.this.emptySubRangeMap() : fih.this.subRangeMap(bpdVar.intersection(this.f36817a));
        }

        @Override // p000.fpd
        public String toString() {
            return asMapOfRanges().toString();
        }
    }

    private fih() {
    }

    private static <K extends Comparable, V> bpd<K> coalesce(bpd<K> bpdVar, V v, @wx1 Map.Entry<ie3<K>, C5845c<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().isConnected(bpdVar) && entry.getValue().getValue().equals(v)) ? (bpd<K>) bpdVar.span(entry.getValue().getKey()) : bpdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public bpd<K> coalescedRange(bpd<K> bpdVar, V v) {
        return coalesce(coalesce(bpdVar, v, this.f36812a.lowerEntry((ie3<K>) bpdVar.f14409a)), v, this.f36812a.floorEntry((ie3<K>) bpdVar.f14410b));
    }

    public static <K extends Comparable, V> fih<K, V> create() {
        return new fih<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fpd<K, V> emptySubRangeMap() {
        return f36811b;
    }

    private void putRangeMapEntry(ie3<K> lowerBound, ie3<K> upperBound, V value) {
        this.f36812a.put(lowerBound, new C5845c<>(lowerBound, upperBound, value));
    }

    @Override // p000.fpd
    public Map<bpd<K>, V> asDescendingMapOfRanges() {
        return new C5844b(this.f36812a.descendingMap().values());
    }

    @Override // p000.fpd
    public Map<bpd<K>, V> asMapOfRanges() {
        return new C5844b(this.f36812a.values());
    }

    @Override // p000.fpd
    public void clear() {
        this.f36812a.clear();
    }

    @Override // p000.fpd
    public boolean equals(@wx1 Object o) {
        if (o instanceof fpd) {
            return asMapOfRanges().equals(((fpd) o).asMapOfRanges());
        }
        return false;
    }

    @Override // p000.fpd
    @wx1
    public V get(K key) {
        Map.Entry<bpd<K>, V> entry = getEntry(key);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // p000.fpd
    @wx1
    public Map.Entry<bpd<K>, V> getEntry(K key) {
        Map.Entry<ie3<K>, C5845c<K, V>> entryFloorEntry = this.f36812a.floorEntry(ie3.m12917d(key));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(key)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // p000.fpd
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.fpd
    public void put(bpd<K> bpdVar, V v) {
        if (bpdVar.isEmpty()) {
            return;
        }
        v7d.checkNotNull(v);
        remove(bpdVar);
        this.f36812a.put((ie3<K>) bpdVar.f14409a, new C5845c<>(bpdVar, v));
    }

    @Override // p000.fpd
    public void putAll(fpd<K, ? extends V> rangeMap) {
        for (Map.Entry<bpd<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.fpd
    public void putCoalescing(bpd<K> range, V value) {
        if (this.f36812a.isEmpty()) {
            put(range, value);
        } else {
            put(coalescedRange(range, v7d.checkNotNull(value)), value);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.fpd
    public void remove(bpd<K> bpdVar) {
        if (bpdVar.isEmpty()) {
            return;
        }
        Map.Entry<ie3<K>, C5845c<K, V>> entryLowerEntry = this.f36812a.lowerEntry((ie3<K>) bpdVar.f14409a);
        if (entryLowerEntry != null) {
            C5845c<K, V> value = entryLowerEntry.getValue();
            if (value.m10937b().compareTo((ie3) bpdVar.f14409a) > 0) {
                if (value.m10937b().compareTo((ie3) bpdVar.f14410b) > 0) {
                    putRangeMapEntry(bpdVar.f14410b, value.m10937b(), entryLowerEntry.getValue().getValue());
                }
                putRangeMapEntry(value.m10936a(), bpdVar.f14409a, entryLowerEntry.getValue().getValue());
            }
        }
        Map.Entry<ie3<K>, C5845c<K, V>> entryLowerEntry2 = this.f36812a.lowerEntry((ie3<K>) bpdVar.f14410b);
        if (entryLowerEntry2 != null) {
            C5845c<K, V> value2 = entryLowerEntry2.getValue();
            if (value2.m10937b().compareTo((ie3) bpdVar.f14410b) > 0) {
                putRangeMapEntry(bpdVar.f14410b, value2.m10937b(), entryLowerEntry2.getValue().getValue());
            }
        }
        this.f36812a.subMap((ie3<K>) bpdVar.f14409a, (ie3<K>) bpdVar.f14410b).clear();
    }

    @Override // p000.fpd
    public bpd<K> span() {
        Map.Entry<ie3<K>, C5845c<K, V>> entryFirstEntry = this.f36812a.firstEntry();
        Map.Entry<ie3<K>, C5845c<K, V>> entryLastEntry = this.f36812a.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return bpd.m3329b(entryFirstEntry.getValue().getKey().f14409a, entryLastEntry.getValue().getKey().f14410b);
    }

    @Override // p000.fpd
    public fpd<K, V> subRangeMap(bpd<K> subRange) {
        return subRange.equals(bpd.all()) ? this : new C5846d(subRange);
    }

    @Override // p000.fpd
    public String toString() {
        return this.f36812a.values().toString();
    }
}
