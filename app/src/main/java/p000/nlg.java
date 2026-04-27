package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p000.kkg;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class nlg {

    /* JADX INFO: renamed from: a */
    public static final lz6<? extends Map<?, ?>, ? extends Map<?, ?>> f64915a = new C9928a();

    /* JADX INFO: renamed from: nlg$a */
    public class C9928a implements lz6<Map<Object, Object>, Map<Object, Object>> {
        @Override // p000.lz6
        public Map<Object, Object> apply(Map<Object, Object> input) {
            return Collections.unmodifiableMap(input);
        }
    }

    /* JADX INFO: renamed from: nlg$b */
    public static abstract class AbstractC9929b<R, C, V> implements kkg.InterfaceC8439a<R, C, V> {
        @Override // p000.kkg.InterfaceC8439a
        public boolean equals(@wx1 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof kkg.InterfaceC8439a)) {
                return false;
            }
            kkg.InterfaceC8439a interfaceC8439a = (kkg.InterfaceC8439a) obj;
            return okb.equal(getRowKey(), interfaceC8439a.getRowKey()) && okb.equal(getColumnKey(), interfaceC8439a.getColumnKey()) && okb.equal(getValue(), interfaceC8439a.getValue());
        }

        @Override // p000.kkg.InterfaceC8439a
        public int hashCode() {
            return okb.hashCode(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            return c0b.f15433c + getRowKey() + "," + getColumnKey() + ")=" + getValue();
        }
    }

    /* JADX INFO: renamed from: nlg$c */
    public static final class C9930c<R, C, V> extends AbstractC9929b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @dgc
        public final R f64916a;

        /* JADX INFO: renamed from: b */
        @dgc
        public final C f64917b;

        /* JADX INFO: renamed from: c */
        @dgc
        public final V f64918c;

        public C9930c(@dgc R rowKey, @dgc C columnKey, @dgc V value) {
            this.f64916a = rowKey;
            this.f64917b = columnKey;
            this.f64918c = value;
        }

        @Override // p000.kkg.InterfaceC8439a
        @dgc
        public C getColumnKey() {
            return this.f64917b;
        }

        @Override // p000.kkg.InterfaceC8439a
        @dgc
        public R getRowKey() {
            return this.f64916a;
        }

        @Override // p000.kkg.InterfaceC8439a
        @dgc
        public V getValue() {
            return this.f64918c;
        }
    }

    /* JADX INFO: renamed from: nlg$d */
    public static class C9931d<R, C, V1, V2> extends AbstractC1739b5<R, C, V2> {

        /* JADX INFO: renamed from: c */
        public final kkg<R, C, V1> f64919c;

        /* JADX INFO: renamed from: d */
        public final lz6<? super V1, V2> f64920d;

        /* JADX INFO: renamed from: nlg$d$a */
        public class a implements lz6<kkg.InterfaceC8439a<R, C, V1>, kkg.InterfaceC8439a<R, C, V2>> {
            public a() {
            }

            @Override // p000.lz6
            public kkg.InterfaceC8439a<R, C, V2> apply(kkg.InterfaceC8439a<R, C, V1> cell) {
                return nlg.immutableCell(cell.getRowKey(), cell.getColumnKey(), C9931d.this.f64920d.apply(cell.getValue()));
            }
        }

        /* JADX INFO: renamed from: nlg$d$b */
        public class b implements lz6<Map<C, V1>, Map<C, V2>> {
            public b() {
            }

            @Override // p000.lz6
            public Map<C, V2> apply(Map<C, V1> row) {
                return tt9.transformValues(row, C9931d.this.f64920d);
            }
        }

        /* JADX INFO: renamed from: nlg$d$c */
        public class c implements lz6<Map<R, V1>, Map<R, V2>> {
            public c() {
            }

            @Override // p000.lz6
            public Map<R, V2> apply(Map<R, V1> column) {
                return tt9.transformValues(column, C9931d.this.f64920d);
            }
        }

        public C9931d(kkg<R, C, V1> fromTable, lz6<? super V1, V2> function) {
            this.f64919c = (kkg) v7d.checkNotNull(fromTable);
            this.f64920d = (lz6) v7d.checkNotNull(function);
        }

        @Override // p000.AbstractC1739b5
        /* JADX INFO: renamed from: a */
        public Iterator<kkg.InterfaceC8439a<R, C, V2>> mo2931a() {
            return wg8.transform(this.f64919c.cellSet().iterator(), m17995e());
        }

        @Override // p000.AbstractC1739b5
        /* JADX INFO: renamed from: c */
        public Collection<V2> mo2933c() {
            return h82.transform(this.f64919c.values(), this.f64920d);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public void clear() {
            this.f64919c.clear();
        }

        @Override // p000.kkg
        public Map<R, V2> column(@dgc C columnKey) {
            return tt9.transformValues(this.f64919c.column(columnKey), this.f64920d);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public Set<C> columnKeySet() {
            return this.f64919c.columnKeySet();
        }

        @Override // p000.kkg
        public Map<C, Map<R, V2>> columnMap() {
            return tt9.transformValues(this.f64919c.columnMap(), new c());
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
            return this.f64919c.contains(rowKey, columnKey);
        }

        /* JADX INFO: renamed from: e */
        public lz6<kkg.InterfaceC8439a<R, C, V1>, kkg.InterfaceC8439a<R, C, V2>> m17995e() {
            return new a();
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        @wx1
        public V2 get(@wx1 Object obj, @wx1 Object obj2) {
            if (contains(obj, obj2)) {
                return this.f64920d.apply((Object) sib.m22018a(this.f64919c.get(obj, obj2)));
            }
            return null;
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        @wx1
        public V2 put(@dgc R rowKey, @dgc C columnKey, @dgc V2 value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public void putAll(kkg<? extends R, ? extends C, ? extends V2> table) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        @wx1
        public V2 remove(@wx1 Object obj, @wx1 Object obj2) {
            if (contains(obj, obj2)) {
                return this.f64920d.apply((Object) sib.m22018a(this.f64919c.remove(obj, obj2)));
            }
            return null;
        }

        @Override // p000.kkg
        public Map<C, V2> row(@dgc R rowKey) {
            return tt9.transformValues(this.f64919c.row(rowKey), this.f64920d);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public Set<R> rowKeySet() {
            return this.f64919c.rowKeySet();
        }

        @Override // p000.kkg
        public Map<R, Map<C, V2>> rowMap() {
            return tt9.transformValues(this.f64919c.rowMap(), new b());
        }

        @Override // p000.kkg
        public int size() {
            return this.f64919c.size();
        }
    }

    /* JADX INFO: renamed from: nlg$e */
    public static class C9932e<C, R, V> extends AbstractC1739b5<C, R, V> {

        /* JADX INFO: renamed from: d */
        public static final lz6 f64924d = new a();

        /* JADX INFO: renamed from: c */
        public final kkg<R, C, V> f64925c;

        /* JADX INFO: renamed from: nlg$e$a */
        public class a implements lz6<kkg.InterfaceC8439a<?, ?, ?>, kkg.InterfaceC8439a<?, ?, ?>> {
            @Override // p000.lz6
            public kkg.InterfaceC8439a<?, ?, ?> apply(kkg.InterfaceC8439a<?, ?, ?> cell) {
                return nlg.immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
            }
        }

        public C9932e(kkg<R, C, V> original) {
            this.f64925c = (kkg) v7d.checkNotNull(original);
        }

        @Override // p000.AbstractC1739b5
        /* JADX INFO: renamed from: a */
        public Iterator<kkg.InterfaceC8439a<C, R, V>> mo2931a() {
            return wg8.transform(this.f64925c.cellSet().iterator(), f64924d);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public void clear() {
            this.f64925c.clear();
        }

        @Override // p000.kkg
        public Map<C, V> column(@dgc R columnKey) {
            return this.f64925c.row(columnKey);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public Set<R> columnKeySet() {
            return this.f64925c.rowKeySet();
        }

        @Override // p000.kkg
        public Map<R, Map<C, V>> columnMap() {
            return this.f64925c.rowMap();
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
            return this.f64925c.contains(columnKey, rowKey);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public boolean containsColumn(@wx1 Object columnKey) {
            return this.f64925c.containsRow(columnKey);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public boolean containsRow(@wx1 Object rowKey) {
            return this.f64925c.containsColumn(rowKey);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public boolean containsValue(@wx1 Object value) {
            return this.f64925c.containsValue(value);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        @wx1
        public V get(@wx1 Object rowKey, @wx1 Object columnKey) {
            return this.f64925c.get(columnKey, rowKey);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        @wx1
        public V put(@dgc C rowKey, @dgc R columnKey, @dgc V value) {
            return this.f64925c.put(columnKey, rowKey, value);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public void putAll(kkg<? extends C, ? extends R, ? extends V> table) {
            this.f64925c.putAll(nlg.transpose(table));
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        @wx1
        public V remove(@wx1 Object rowKey, @wx1 Object columnKey) {
            return this.f64925c.remove(columnKey, rowKey);
        }

        @Override // p000.kkg
        public Map<R, V> row(@dgc C rowKey) {
            return this.f64925c.column(rowKey);
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public Set<C> rowKeySet() {
            return this.f64925c.columnKeySet();
        }

        @Override // p000.kkg
        public Map<C, Map<R, V>> rowMap() {
            return this.f64925c.columnMap();
        }

        @Override // p000.kkg
        public int size() {
            return this.f64925c.size();
        }

        @Override // p000.AbstractC1739b5, p000.kkg
        public Collection<V> values() {
            return this.f64925c.values();
        }
    }

    /* JADX INFO: renamed from: nlg$f */
    public static final class C9933f<R, C, V> extends C9934g<R, C, V> implements ice<R, C, V> {
        private static final long serialVersionUID = 0;

        public C9933f(ice<R, ? extends C, ? extends V> delegate) {
            super(delegate);
        }

        @Override // p000.nlg.C9934g, p000.wt6, p000.zs6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ice<R, C, V> mo8967m() {
            return (ice) super.mo8967m();
        }

        @Override // p000.nlg.C9934g, p000.wt6, p000.kkg
        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(mo8967m().rowKeySet());
        }

        @Override // p000.nlg.C9934g, p000.wt6, p000.kkg
        public SortedMap<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableSortedMap(tt9.transformValues((SortedMap) mo8967m().rowMap(), nlg.unmodifiableWrapper()));
        }
    }

    /* JADX INFO: renamed from: nlg$g */
    public static class C9934g<R, C, V> extends wt6<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final kkg<? extends R, ? extends C, ? extends V> f64926a;

        public C9934g(kkg<? extends R, ? extends C, ? extends V> delegate) {
            this.f64926a = (kkg) v7d.checkNotNull(delegate);
        }

        @Override // p000.wt6, p000.zs6
        /* JADX INFO: renamed from: a */
        public kkg<R, C, V> mo8967m() {
            return this.f64926a;
        }

        @Override // p000.wt6, p000.kkg
        public Set<kkg.InterfaceC8439a<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        @Override // p000.wt6, p000.kkg
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.wt6, p000.kkg
        public Map<R, V> column(@dgc C columnKey) {
            return Collections.unmodifiableMap(super.column(columnKey));
        }

        @Override // p000.wt6, p000.kkg
        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // p000.wt6, p000.kkg
        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(tt9.transformValues(super.columnMap(), nlg.unmodifiableWrapper()));
        }

        @Override // p000.wt6, p000.kkg
        @wx1
        public V put(@dgc R rowKey, @dgc C columnKey, @dgc V value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.wt6, p000.kkg
        public void putAll(kkg<? extends R, ? extends C, ? extends V> table) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.wt6, p000.kkg
        @wx1
        public V remove(@wx1 Object rowKey, @wx1 Object columnKey) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.wt6, p000.kkg
        public Map<C, V> row(@dgc R rowKey) {
            return Collections.unmodifiableMap(super.row(rowKey));
        }

        @Override // p000.wt6, p000.kkg
        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // p000.wt6, p000.kkg
        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(tt9.transformValues(super.rowMap(), nlg.unmodifiableWrapper()));
        }

        @Override // p000.wt6, p000.kkg
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }
    }

    private nlg() {
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17994b(kkg<?, ?, ?> table, @wx1 Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof kkg) {
            return table.cellSet().equals(((kkg) obj).cellSet());
        }
        return false;
    }

    public static <R, C, V> kkg.InterfaceC8439a<R, C, V> immutableCell(@dgc R rowKey, @dgc C columnKey, @dgc V value) {
        return new C9930c(rowKey, columnKey, value);
    }

    public static <R, C, V> kkg<R, C, V> newCustomTable(Map<R, Map<C, V>> backingMap, lfg<? extends Map<C, V>> factory) {
        v7d.checkArgument(backingMap.isEmpty());
        v7d.checkNotNull(factory);
        return new i1g(backingMap, factory);
    }

    public static <R, C, V> kkg<R, C, V> synchronizedTable(kkg<R, C, V> table) {
        return xhg.m25176v(table, null);
    }

    public static <R, C, V1, V2> kkg<R, C, V2> transformValues(kkg<R, C, V1> fromTable, lz6<? super V1, V2> function) {
        return new C9931d(fromTable, function);
    }

    public static <R, C, V> kkg<C, R, V> transpose(kkg<R, C, V> kkgVar) {
        return kkgVar instanceof C9932e ? ((C9932e) kkgVar).f64925c : new C9932e(kkgVar);
    }

    public static <R, C, V> ice<R, C, V> unmodifiableRowSortedTable(ice<R, ? extends C, ? extends V> table) {
        return new C9933f(table);
    }

    public static <R, C, V> kkg<R, C, V> unmodifiableTable(kkg<? extends R, ? extends C, ? extends V> table) {
        return new C9934g(table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> lz6<Map<K, V>, Map<K, V>> unmodifiableWrapper() {
        return (lz6<Map<K, V>, Map<K, V>>) f64915a;
    }
}
