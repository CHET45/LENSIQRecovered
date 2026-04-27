package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class gs9<V> extends AbstractC5064e3<V> implements Collection<V>, vo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final cs9<?, V> f40912a;

    public gs9(@yfb cs9<?, V> cs9Var) {
        md8.checkNotNullParameter(cs9Var, "backing");
        this.f40912a = cs9Var;
    }

    @Override // p000.AbstractC5064e3, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@yfb Collection<? extends V> collection) {
        md8.checkNotNullParameter(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f40912a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f40912a.containsValue(obj);
    }

    @yfb
    public final cs9<?, V> getBacking() {
        return this.f40912a;
    }

    @Override // p000.AbstractC5064e3
    public int getSize() {
        return this.f40912a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f40912a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<V> iterator() {
        return this.f40912a.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f40912a.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        this.f40912a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        this.f40912a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
