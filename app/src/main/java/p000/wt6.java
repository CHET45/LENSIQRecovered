package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000.kkg;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class wt6<R, C, V> extends zs6 implements kkg<R, C, V> {
    @Override // p000.zs6
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract kkg<R, C, V> mo8967m();

    public Set<kkg.InterfaceC8439a<R, C, V>> cellSet() {
        return mo8967m().cellSet();
    }

    public void clear() {
        mo8967m().clear();
    }

    public Map<R, V> column(@dgc C columnKey) {
        return mo8967m().column(columnKey);
    }

    public Set<C> columnKeySet() {
        return mo8967m().columnKeySet();
    }

    public Map<C, Map<R, V>> columnMap() {
        return mo8967m().columnMap();
    }

    @Override // p000.kkg
    public boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
        return mo8967m().contains(rowKey, columnKey);
    }

    @Override // p000.kkg
    public boolean containsColumn(@wx1 Object columnKey) {
        return mo8967m().containsColumn(columnKey);
    }

    @Override // p000.kkg
    public boolean containsRow(@wx1 Object rowKey) {
        return mo8967m().containsRow(rowKey);
    }

    @Override // p000.kkg
    public boolean containsValue(@wx1 Object value) {
        return mo8967m().containsValue(value);
    }

    @Override // p000.kkg
    public boolean equals(@wx1 Object obj) {
        return obj == this || mo8967m().equals(obj);
    }

    @Override // p000.kkg
    @wx1
    public V get(@wx1 Object rowKey, @wx1 Object columnKey) {
        return mo8967m().get(rowKey, columnKey);
    }

    @Override // p000.kkg
    public int hashCode() {
        return mo8967m().hashCode();
    }

    @Override // p000.kkg
    public boolean isEmpty() {
        return mo8967m().isEmpty();
    }

    @op1
    @wx1
    public V put(@dgc R rowKey, @dgc C columnKey, @dgc V value) {
        return mo8967m().put(rowKey, columnKey, value);
    }

    public void putAll(kkg<? extends R, ? extends C, ? extends V> table) {
        mo8967m().putAll(table);
    }

    @op1
    @wx1
    public V remove(@wx1 Object rowKey, @wx1 Object columnKey) {
        return mo8967m().remove(rowKey, columnKey);
    }

    public Map<C, V> row(@dgc R rowKey) {
        return mo8967m().row(rowKey);
    }

    public Set<R> rowKeySet() {
        return mo8967m().rowKeySet();
    }

    public Map<R, Map<C, V>> rowMap() {
        return mo8967m().rowMap();
    }

    @Override // p000.kkg
    public int size() {
        return mo8967m().size();
    }

    public Collection<V> values() {
        return mo8967m().values();
    }
}
