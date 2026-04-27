package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class es9<K, V> extends AbstractC13320u2<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final cs9<K, V> f33964a;

    public es9(@yfb cs9<K, V> cs9Var) {
        md8.checkNotNullParameter(cs9Var, "backing");
        this.f33964a = cs9Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@yfb Collection<? extends Map.Entry<K, V>> collection) {
        md8.checkNotNullParameter(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f33964a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        return this.f33964a.containsAllEntries$kotlin_stdlib(collection);
    }

    @Override // p000.AbstractC13320u2
    public boolean containsEntry(@yfb Map.Entry<? extends K, ? extends V> entry) {
        md8.checkNotNullParameter(entry, "element");
        return this.f33964a.containsEntry$kotlin_stdlib(entry);
    }

    @yfb
    public final cs9<K, V> getBacking() {
        return this.f33964a;
    }

    @Override // p000.AbstractC6688h3
    public int getSize() {
        return this.f33964a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f33964a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f33964a.entriesIterator$kotlin_stdlib();
    }

    @Override // p000.AbstractC13320u2
    public boolean remove(@yfb Map.Entry entry) {
        md8.checkNotNullParameter(entry, "element");
        return this.f33964a.removeEntry$kotlin_stdlib(entry);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        this.f33964a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        this.f33964a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC6688h3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@yfb Map.Entry<K, V> entry) {
        md8.checkNotNullParameter(entry, "element");
        throw new UnsupportedOperationException();
    }
}
