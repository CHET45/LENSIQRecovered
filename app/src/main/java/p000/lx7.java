package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class lx7<E> implements jx7<E>, List<E>, uo8 {

    /* JADX INFO: renamed from: b */
    public static final int f59140b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<E> f59141a;

    /* JADX WARN: Multi-variable type inference failed */
    public lx7(@yfb List<? extends E> list) {
        this.f59141a = list;
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f59141a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        return this.f59141a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@gib Object obj) {
        return this.f59141a.equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.f59141a.get(i);
    }

    public int getSize() {
        return this.f59141a.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f59141a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f59141a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f59141a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<E> iterator() {
        return this.f59141a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f59141a.lastIndexOf(obj);
    }

    @Override // java.util.List
    @yfb
    public ListIterator<E> listIterator() {
        return this.f59141a.listIterator();
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @yfb
    public String toString() {
        return this.f59141a.toString();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @yfb
    public ListIterator<E> listIterator(int i) {
        return this.f59141a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p000.jx7, java.util.List
    @yfb
    public jx7<E> subList(int i, int i2) {
        return new lx7(this.f59141a.subList(i, i2));
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }
}
