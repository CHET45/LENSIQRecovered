package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.kkg;
import p000.kx7;
import p000.nlg;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class ty7<R, C, V> extends AbstractC1739b5<R, C, V> implements Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ty7$a */
    @jh4
    public static final class C13286a<R, C, V> {

        /* JADX INFO: renamed from: a */
        public final List<kkg.InterfaceC8439a<R, C, V>> f86330a = eb9.newArrayList();

        /* JADX INFO: renamed from: b */
        @wx1
        public Comparator<? super R> f86331b;

        /* JADX INFO: renamed from: c */
        @wx1
        public Comparator<? super C> f86332c;

        @op1
        /* JADX INFO: renamed from: a */
        public C13286a<R, C, V> m22922a(C13286a<R, C, V> other) {
            this.f86330a.addAll(other.f86330a);
            return this;
        }

        public ty7<R, C, V> build() {
            return buildOrThrow();
        }

        public ty7<R, C, V> buildOrThrow() {
            int size = this.f86330a.size();
            return size != 0 ? size != 1 ? sxd.m22287n(this.f86330a, this.f86331b, this.f86332c) : new upf((kkg.InterfaceC8439a) vg8.getOnlyElement(this.f86330a)) : ty7.m22919of();
        }

        @op1
        public C13286a<R, C, V> orderColumnsBy(Comparator<? super C> columnComparator) {
            this.f86332c = (Comparator) v7d.checkNotNull(columnComparator, "columnComparator");
            return this;
        }

        @op1
        public C13286a<R, C, V> orderRowsBy(Comparator<? super R> rowComparator) {
            this.f86331b = (Comparator) v7d.checkNotNull(rowComparator, "rowComparator");
            return this;
        }

        @op1
        public C13286a<R, C, V> put(R rowKey, C columnKey, V value) {
            this.f86330a.add(ty7.m22917f(rowKey, columnKey, value));
            return this;
        }

        @op1
        public C13286a<R, C, V> putAll(kkg<? extends R, ? extends C, ? extends V> table) {
            Iterator<kkg.InterfaceC8439a<? extends R, ? extends C, ? extends V>> it = table.cellSet().iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        @op1
        public C13286a<R, C, V> put(kkg.InterfaceC8439a<? extends R, ? extends C, ? extends V> cell) {
            if (cell instanceof nlg.C9930c) {
                v7d.checkNotNull(cell.getRowKey(), "row");
                v7d.checkNotNull(cell.getColumnKey(), "column");
                v7d.checkNotNull(cell.getValue(), "value");
                this.f86330a.add(cell);
            } else {
                put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: ty7$b */
    public static final class C13287b implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Object[] f86333a;

        /* JADX INFO: renamed from: b */
        public final Object[] f86334b;

        /* JADX INFO: renamed from: c */
        public final Object[] f86335c;

        /* JADX INFO: renamed from: d */
        public final int[] f86336d;

        /* JADX INFO: renamed from: e */
        public final int[] f86337e;

        private C13287b(Object[] rowKeys, Object[] columnKeys, Object[] cellValues, int[] cellRowIndices, int[] cellColumnIndices) {
            this.f86333a = rowKeys;
            this.f86334b = columnKeys;
            this.f86335c = cellValues;
            this.f86336d = cellRowIndices;
            this.f86337e = cellColumnIndices;
        }

        /* JADX INFO: renamed from: a */
        public static C13287b m22923a(ty7<?, ?, ?> table, int[] cellRowIndices, int[] cellColumnIndices) {
            return new C13287b(table.rowKeySet().toArray(), table.columnKeySet().toArray(), table.values().toArray(), cellRowIndices, cellColumnIndices);
        }

        public Object readResolve() {
            Object[] objArr = this.f86335c;
            if (objArr.length == 0) {
                return ty7.m22919of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ty7.m22920of(this.f86333a[0], this.f86334b[0], objArr[0]);
            }
            kx7.C8541a c8541a = new kx7.C8541a(objArr.length);
            while (true) {
                Object[] objArr2 = this.f86335c;
                if (i >= objArr2.length) {
                    return sxd.m22288o(c8541a.build(), dy7.copyOf(this.f86333a), dy7.copyOf(this.f86334b));
                }
                c8541a.add(ty7.m22917f(this.f86333a[this.f86336d[i]], this.f86334b[this.f86337e[i]], objArr2[i]));
                i++;
            }
        }
    }

    public static <R, C, V> C13286a<R, C, V> builder() {
        return new C13286a<>();
    }

    public static <R, C, V> ty7<R, C, V> copyOf(kkg<? extends R, ? extends C, ? extends V> table) {
        return table instanceof ty7 ? (ty7) table : m22918g(table.cellSet());
    }

    /* JADX INFO: renamed from: f */
    public static <R, C, V> kkg.InterfaceC8439a<R, C, V> m22917f(R rowKey, C columnKey, V value) {
        return nlg.immutableCell(v7d.checkNotNull(rowKey, "rowKey"), v7d.checkNotNull(columnKey, "columnKey"), v7d.checkNotNull(value, "value"));
    }

    /* JADX INFO: renamed from: g */
    public static <R, C, V> ty7<R, C, V> m22918g(Iterable<? extends kkg.InterfaceC8439a<? extends R, ? extends C, ? extends V>> cells) {
        C13286a c13286aBuilder = builder();
        Iterator<? extends kkg.InterfaceC8439a<? extends R, ? extends C, ? extends V>> it = cells.iterator();
        while (it.hasNext()) {
            c13286aBuilder.put(it.next());
        }
        return c13286aBuilder.build();
    }

    /* JADX INFO: renamed from: of */
    public static <R, C, V> ty7<R, C, V> m22919of() {
        return (ty7<R, C, V>) rxf.f80073m;
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.kkg
    public abstract ox7<C, Map<R, V>> columnMap();

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
        return get(rowKey, columnKey) != null;
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean containsColumn(@wx1 Object columnKey) {
        return super.containsColumn(columnKey);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean containsRow(@wx1 Object rowKey) {
        return super.containsRow(rowKey);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public boolean containsValue(@wx1 Object value) {
        return values().contains(value);
    }

    @Override // p000.AbstractC1739b5
    /* JADX INFO: renamed from: d */
    public final Iterator<V> mo2934d() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.AbstractC1739b5
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final quh<kkg.InterfaceC8439a<R, C, V>> mo2931a() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object obj) {
        return super.equals(obj);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @wx1
    public /* bridge */ /* synthetic */ Object get(@wx1 Object rowKey, @wx1 Object columnKey) {
        return super.get(rowKey, columnKey);
    }

    @Override // p000.AbstractC1739b5
    /* JADX INFO: renamed from: h */
    public abstract dy7<kkg.InterfaceC8439a<R, C, V>> mo2932b();

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public abstract C13287b mo2952i();

    @Override // p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // p000.AbstractC1739b5
    /* JADX INFO: renamed from: j */
    public abstract ax7<V> mo2933c();

    @Override // p000.AbstractC1739b5, p000.kkg
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final V put(R rowKey, C columnKey, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(kkg<? extends R, ? extends C, ? extends V> table) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final V remove(@wx1 Object rowKey, @wx1 Object columnKey) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.kkg
    public abstract ox7<R, Map<C, V>> rowMap();

    @Override // p000.AbstractC1739b5
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final Object writeReplace() {
        return mo2952i();
    }

    /* JADX INFO: renamed from: of */
    public static <R, C, V> ty7<R, C, V> m22920of(R rowKey, C columnKey, V value) {
        return new upf(rowKey, columnKey, value);
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public dy7<kkg.InterfaceC8439a<R, C, V>> cellSet() {
        return (dy7) super.cellSet();
    }

    @Override // p000.kkg
    public ox7<R, V> column(C columnKey) {
        v7d.checkNotNull(columnKey, "columnKey");
        return (ox7) yya.firstNonNull((ox7) columnMap().get(columnKey), ox7.m19076of());
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public dy7<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // p000.kkg
    public ox7<C, V> row(R rowKey) {
        v7d.checkNotNull(rowKey, "rowKey");
        return (ox7) yya.firstNonNull((ox7) rowMap().get(rowKey), ox7.m19076of());
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public dy7<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // p000.AbstractC1739b5, p000.kkg
    public ax7<V> values() {
        return (ax7) super.values();
    }
}
