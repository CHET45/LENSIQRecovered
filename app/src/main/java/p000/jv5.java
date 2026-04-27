package p000;

import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class jv5<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: a */
    @Weak
    public final iv5<K, V> f51999a;

    public jv5(iv5<K, V> multimap) {
        this.f51999a = (iv5) v7d.checkNotNull(multimap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f51999a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object o) {
        return this.f51999a.containsValue(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return tt9.m22777G(this.f51999a.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@wx1 Object o) {
        l8d<? super Map.Entry<K, V>> l8dVarEntryPredicate = this.f51999a.entryPredicate();
        Iterator<Map.Entry<K, V>> it = this.f51999a.unfiltered().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (l8dVarEntryPredicate.apply(next) && okb.equal(next.getValue(), o)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> c) {
        return vg8.removeIf(this.f51999a.unfiltered().entries(), p8d.and(this.f51999a.entryPredicate(), tt9.m22779I(p8d.m19339in(c))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> c) {
        return vg8.removeIf(this.f51999a.unfiltered().entries(), p8d.and(this.f51999a.entryPredicate(), tt9.m22779I(p8d.not(p8d.m19339in(c)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f51999a.size();
    }
}
