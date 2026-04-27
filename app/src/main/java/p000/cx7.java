package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class cx7<E> implements bx7<E>, Collection<E>, uo8 {

    /* JADX INFO: renamed from: b */
    public static final int f27995b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Collection<E> f27996a;

    /* JADX WARN: Multi-variable type inference failed */
    public cx7(@yfb Collection<? extends E> collection) {
        this.f27996a = collection;
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f27996a.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        return this.f27996a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@gib Object obj) {
        return this.f27996a.equals(obj);
    }

    public int getSize() {
        return this.f27996a.size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f27996a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f27996a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<E> iterator() {
        return this.f27996a.iterator();
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
    public boolean removeIf(Predicate<? super E> predicate) {
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
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @yfb
    public String toString() {
        return this.f27996a.toString();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }
}
