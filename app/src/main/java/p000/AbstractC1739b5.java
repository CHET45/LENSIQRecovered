package p000;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.kkg;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC1739b5<R, C, V> implements kkg<R, C, V> {

    /* JADX INFO: renamed from: a */
    @wx1
    @ez8
    public transient Set<kkg.InterfaceC8439a<R, C, V>> f12693a;

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient Collection<V> f12694b;

    /* JADX INFO: renamed from: b5$a */
    public class a extends geh<kkg.InterfaceC8439a<R, C, V>, V> {
        public a(final AbstractC1739b5 this$0, Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // p000.geh
        @dgc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V mo2935a(kkg.InterfaceC8439a<R, C, V> cell) {
            return cell.getValue();
        }
    }

    /* JADX INFO: renamed from: b5$b */
    public class b extends AbstractSet<kkg.InterfaceC8439a<R, C, V>> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC1739b5.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            if (!(o instanceof kkg.InterfaceC8439a)) {
                return false;
            }
            kkg.InterfaceC8439a interfaceC8439a = (kkg.InterfaceC8439a) o;
            Map map = (Map) tt9.m22804y(AbstractC1739b5.this.rowMap(), interfaceC8439a.getRowKey());
            return map != null && h82.m12263d(map.entrySet(), tt9.immutableEntry(interfaceC8439a.getColumnKey(), interfaceC8439a.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<kkg.InterfaceC8439a<R, C, V>> iterator() {
            return AbstractC1739b5.this.mo2931a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            if (!(o instanceof kkg.InterfaceC8439a)) {
                return false;
            }
            kkg.InterfaceC8439a interfaceC8439a = (kkg.InterfaceC8439a) o;
            Map map = (Map) tt9.m22804y(AbstractC1739b5.this.rowMap(), interfaceC8439a.getRowKey());
            return map != null && h82.m12264e(map.entrySet(), tt9.immutableEntry(interfaceC8439a.getColumnKey(), interfaceC8439a.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC1739b5.this.size();
        }
    }

    /* JADX INFO: renamed from: b5$c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC1739b5.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object o) {
            return AbstractC1739b5.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC1739b5.this.mo2934d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC1739b5.this.size();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Iterator<kkg.InterfaceC8439a<R, C, V>> mo2931a();

    /* JADX INFO: renamed from: b */
    public Set<kkg.InterfaceC8439a<R, C, V>> mo2932b() {
        return new b();
    }

    /* JADX INFO: renamed from: c */
    public Collection<V> mo2933c() {
        return new c();
    }

    @Override // p000.kkg
    public Set<kkg.InterfaceC8439a<R, C, V>> cellSet() {
        Set<kkg.InterfaceC8439a<R, C, V>> set = this.f12693a;
        if (set != null) {
            return set;
        }
        Set<kkg.InterfaceC8439a<R, C, V>> setMo2932b = mo2932b();
        this.f12693a = setMo2932b;
        return setMo2932b;
    }

    @Override // p000.kkg
    public void clear() {
        wg8.m24509c(cellSet().iterator());
    }

    @Override // p000.kkg
    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // p000.kkg
    public boolean contains(@wx1 Object rowKey, @wx1 Object columnKey) {
        Map map = (Map) tt9.m22804y(rowMap(), rowKey);
        return map != null && tt9.m22803x(map, columnKey);
    }

    @Override // p000.kkg
    public boolean containsColumn(@wx1 Object columnKey) {
        return tt9.m22803x(columnMap(), columnKey);
    }

    @Override // p000.kkg
    public boolean containsRow(@wx1 Object rowKey) {
        return tt9.m22803x(rowMap(), rowKey);
    }

    @Override // p000.kkg
    public boolean containsValue(@wx1 Object value) {
        Iterator<Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public Iterator<V> mo2934d() {
        return new a(this, cellSet().iterator());
    }

    @Override // p000.kkg
    public boolean equals(@wx1 Object obj) {
        return nlg.m17994b(this, obj);
    }

    @Override // p000.kkg
    @wx1
    public V get(@wx1 Object obj, @wx1 Object obj2) {
        Map map = (Map) tt9.m22804y(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) tt9.m22804y(map, obj2);
    }

    @Override // p000.kkg
    public int hashCode() {
        return cellSet().hashCode();
    }

    @Override // p000.kkg
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // p000.kkg
    @op1
    @wx1
    public V put(@dgc R rowKey, @dgc C columnKey, @dgc V value) {
        return row(rowKey).put(columnKey, value);
    }

    @Override // p000.kkg
    public void putAll(kkg<? extends R, ? extends C, ? extends V> table) {
        for (kkg.InterfaceC8439a<? extends R, ? extends C, ? extends V> interfaceC8439a : table.cellSet()) {
            put(interfaceC8439a.getRowKey(), interfaceC8439a.getColumnKey(), interfaceC8439a.getValue());
        }
    }

    @Override // p000.kkg
    @op1
    @wx1
    public V remove(@wx1 Object obj, @wx1 Object obj2) {
        Map map = (Map) tt9.m22804y(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) tt9.m22805z(map, obj2);
    }

    @Override // p000.kkg
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    @Override // p000.kkg
    public Collection<V> values() {
        Collection<V> collection = this.f12694b;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionMo2933c = mo2933c();
        this.f12694b = collectionMo2933c;
        return collectionMo2933c;
    }
}
