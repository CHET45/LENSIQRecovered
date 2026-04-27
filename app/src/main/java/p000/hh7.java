package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public class hh7<R, C, V> extends i1g<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: hh7$a */
    public static class C6854a<C, V> implements lfg<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final int f43643a;

        public C6854a(int expectedSize) {
            this.f43643a = expectedSize;
        }

        @Override // p000.lfg
        public Map<C, V> get() {
            return tt9.newLinkedHashMapWithExpectedSize(this.f43643a);
        }
    }

    public hh7(Map<R, Map<C, V>> backingMap, C6854a<C, V> factory) {
        super(backingMap, factory);
    }

    public static <R, C, V> hh7<R, C, V> create() {
        return new hh7<>(new LinkedHashMap(), new C6854a(0));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.i1g, p000.kkg
    public /* bridge */ /* synthetic */ Map row(Object rowKey) {
        return super.row(rowKey);
    }

    @Override // p000.i1g, p000.AbstractC1739b5, p000.kkg
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    @Override // p000.i1g, p000.kkg
    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
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

    public static <R, C, V> hh7<R, C, V> create(int expectedRows, int expectedCellsPerRow) {
        s72.m21765b(expectedCellsPerRow, "expectedCellsPerRow");
        return new hh7<>(tt9.newLinkedHashMapWithExpectedSize(expectedRows), new C6854a(expectedCellsPerRow));
    }

    public static <R, C, V> hh7<R, C, V> create(kkg<? extends R, ? extends C, ? extends V> table) {
        hh7<R, C, V> hh7VarCreate = create();
        hh7VarCreate.putAll(table);
        return hh7VarCreate;
    }
}
