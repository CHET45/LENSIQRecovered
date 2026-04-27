package p000;

import androidx.lifecycle.C1171x;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,526:1\n1734#2,3:527\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n62#1:527,3\n*E\n"})
public final class l50<T> implements Collection<T>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final T[] f56171a;

    /* JADX INFO: renamed from: b */
    public final boolean f56172b;

    public l50(@yfb T[] tArr, boolean z) {
        md8.checkNotNullParameter(tArr, C1171x.f7958g);
        this.f56171a = tArr;
        this.f56172b = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return e80.contains(this.f56171a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f56171a.length;
    }

    @yfb
    public final T[] getValues() {
        return this.f56171a;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f56171a.length == 0;
    }

    public final boolean isVarargs() {
        return this.f56172b;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<T> iterator() {
        return l60.iterator(this.f56171a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        return (T[]) f82.toArray(this, tArr);
    }

    @Override // java.util.Collection
    @yfb
    public final Object[] toArray() {
        return k82.copyToArrayOfAny(this.f56171a, this.f56172b);
    }
}
