package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public class xhh<R, C, V> extends g1g<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    public final Comparator<? super C> f97884C;

    /* JADX INFO: renamed from: xhh$a */
    public class C15108a extends AbstractC0012a2<C> {

        /* JADX INFO: renamed from: c */
        @wx1
        public C f97885c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Iterator f97886d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Comparator f97887e;

        public C15108a(final xhh this$0, final Iterator val$merged, final Comparator val$comparator) {
            this.f97886d = val$merged;
            this.f97887e = val$comparator;
        }

        @Override // p000.AbstractC0012a2
        @wx1
        public C computeNext() {
            while (this.f97886d.hasNext()) {
                C c = (C) this.f97886d.next();
                C c2 = this.f97885c;
                if (c2 == null || this.f97887e.compare(c, c2) != 0) {
                    this.f97885c = c;
                    return c;
                }
            }
            this.f97885c = null;
            return m25a();
        }
    }

    /* JADX INFO: renamed from: xhh$b */
    public static class C15109b<C, V> implements lfg<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Comparator<? super C> f97888a;

        public C15109b(Comparator<? super C> comparator) {
            this.f97888a = comparator;
        }

        @Override // p000.lfg
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.f97888a);
        }
    }

    /* JADX INFO: renamed from: xhh$c */
    public class C15110c extends i1g<R, C, V>.C7107g implements SortedMap<C, V> {

        /* JADX INFO: renamed from: d */
        @wx1
        public final C f97889d;

        /* JADX INFO: renamed from: e */
        @wx1
        public final C f97890e;

        /* JADX INFO: renamed from: f */
        @wx1
        public transient SortedMap<C, V> f97891f;

        public C15110c(final xhh this$0, R rowKey) {
            this(rowKey, null, null);
        }

        @Override // p000.i1g.C7107g
        /* JADX INFO: renamed from: c */
        public void mo12726c() {
            m25202i();
            SortedMap<C, V> sortedMap = this.f97891f;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            xhh.this.f45450c.remove(this.f45477a);
            this.f97891f = null;
            this.f45478b = null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return xhh.this.columnComparator();
        }

        @Override // p000.i1g.C7107g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return m25201h(key) && super.containsKey(key);
        }

        /* JADX INFO: renamed from: f */
        public int m25199f(Object a, Object b) {
            return comparator().compare(a, b);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            m12727d();
            Map<C, V> map = this.f45478b;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // p000.i1g.C7107g
        @wx1
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> mo12725b() {
            m25202i();
            SortedMap<C, V> sortedMapTailMap = this.f97891f;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c = this.f97889d;
            if (c != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c);
            }
            C c2 = this.f97890e;
            return c2 != null ? sortedMapTailMap.headMap(c2) : sortedMapTailMap;
        }

        /* JADX INFO: renamed from: h */
        public boolean m25201h(@wx1 Object o) {
            C c;
            C c2;
            return o != null && ((c = this.f97889d) == null || m25199f(c, o) <= 0) && ((c2 = this.f97890e) == null || m25199f(c2, o) > 0);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C toKey) {
            v7d.checkArgument(m25201h(v7d.checkNotNull(toKey)));
            return new C15110c(this.f45477a, this.f97889d, toKey);
        }

        /* JADX INFO: renamed from: i */
        public void m25202i() {
            SortedMap<C, V> sortedMap = this.f97891f;
            if (sortedMap == null || (sortedMap.isEmpty() && xhh.this.f45450c.containsKey(this.f45477a))) {
                this.f97891f = (SortedMap) xhh.this.f45450c.get(this.f45477a);
            }
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            m12727d();
            Map<C, V> map = this.f45478b;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // p000.i1g.C7107g, java.util.AbstractMap, java.util.Map
        @wx1
        public V put(C c, V v) {
            v7d.checkArgument(m25201h(v7d.checkNotNull(c)));
            return (V) super.put(c, v);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C fromKey, C toKey) {
            v7d.checkArgument(m25201h(v7d.checkNotNull(fromKey)) && m25201h(v7d.checkNotNull(toKey)));
            return new C15110c(this.f45477a, fromKey, toKey);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C fromKey) {
            v7d.checkArgument(m25201h(v7d.checkNotNull(fromKey)));
            return new C15110c(this.f45477a, fromKey, this.f97890e);
        }

        public C15110c(R rowKey, @wx1 C lowerBound, @wx1 C upperBound) {
            super(rowKey);
            this.f97889d = lowerBound;
            this.f97890e = upperBound;
            v7d.checkArgument(lowerBound == null || upperBound == null || m25199f(lowerBound, upperBound) <= 0);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<C> keySet() {
            return new tt9.C13201g0(this);
        }
    }

    public xhh(Comparator<? super R> rowComparator, Comparator<? super C> columnComparator) {
        super(new TreeMap(rowComparator), new C15109b(columnComparator));
        this.f97884C = columnComparator;
    }

    public static <R extends Comparable, C extends Comparable, V> xhh<R, C, V> create() {
        return new xhh<>(s7c.natural(), s7c.natural());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$createColumnKeyIterator$0(Map map) {
        return map.keySet().iterator();
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.i1g, p000.kkg
    public /* bridge */ /* synthetic */ Map column(Object columnKey) {
        return super.column(columnKey);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.f97884C;
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // p000.i1g, p000.kkg
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
        return super.contains(rowKey, columnKey);
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean containsColumn(@wx1 Object columnKey) {
        return super.containsColumn(columnKey);
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean containsRow(@wx1 Object rowKey) {
        return super.containsRow(rowKey);
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean containsValue(@wx1 Object value) {
        return super.containsValue(value);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object obj) {
        return super.equals(obj);
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    @wx1
    public /* bridge */ /* synthetic */ Object get(@wx1 Object rowKey, @wx1 Object columnKey) {
        return super.get(rowKey, columnKey);
    }

    @Override // p000.i1g
    /* JADX INFO: renamed from: h */
    public Iterator<C> mo12722h() {
        Comparator<? super C> comparatorColumnComparator = columnComparator();
        return new C15108a(this, wg8.mergeSorted(vg8.transform(this.f45450c.values(), new lz6() { // from class: whh
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return xhh.lambda$createColumnKeyIterator$0((Map) obj);
            }
        }), comparatorColumnComparator), comparatorColumnComparator);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    @op1
    @wx1
    public /* bridge */ /* synthetic */ Object put(Object rowKey, Object columnKey, Object value) {
        return super.put(rowKey, columnKey, value);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ void putAll(kkg table) {
        super.putAll(table);
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    @op1
    @wx1
    public /* bridge */ /* synthetic */ Object remove(@wx1 Object rowKey, @wx1 Object columnKey) {
        return super.remove(rowKey, columnKey);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        Comparator<? super R> comparator = rowKeySet().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // p000.i1g, p000.kkg
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // p000.AbstractC1739b5
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> xhh<R, C, V> create(Comparator<? super R> rowComparator, Comparator<? super C> columnComparator) {
        v7d.checkNotNull(rowComparator);
        v7d.checkNotNull(columnComparator);
        return new xhh<>(rowComparator, columnComparator);
    }

    @Override // p000.i1g, p000.kkg
    public SortedMap<C, V> row(R rowKey) {
        return new C15110c(this, rowKey);
    }

    @Override // p000.g1g, p000.i1g, p000.AbstractC1739b5, p000.kkg
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // p000.g1g, p000.i1g, p000.kkg
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> xhh<R, C, V> create(xhh<R, C, ? extends V> table) {
        xhh<R, C, V> xhhVar = new xhh<>(table.rowComparator(), table.columnComparator());
        xhhVar.putAll(table);
        return xhhVar;
    }
}
