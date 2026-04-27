package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class dgi<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;

    /* JADX INFO: renamed from: a */
    public final ArrayList<T> f29611a;

    public dgi() {
        this.f29611a = new ArrayList<>();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T e) {
        boolean zAdd = this.f29611a.add(e);
        lazySet(this.f29611a.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@cfb Collection<? extends T> c) {
        boolean zAddAll = this.f29611a.addAll(c);
        lazySet(this.f29611a.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f29611a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object o) {
        return this.f29611a.contains(o);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@cfb Collection<?> c) {
        return this.f29611a.containsAll(c);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof dgi ? this.f29611a.equals(((dgi) obj).f29611a) : this.f29611a.equals(obj);
    }

    @Override // java.util.List
    public T get(int index) {
        return this.f29611a.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f29611a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object o) {
        return this.f29611a.indexOf(o);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f29611a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object o) {
        return this.f29611a.lastIndexOf(o);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f29611a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object o) {
        boolean zRemove = this.f29611a.remove(o);
        lazySet(this.f29611a.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@cfb Collection<?> c) {
        boolean zRemoveAll = this.f29611a.removeAll(c);
        lazySet(this.f29611a.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@cfb Collection<?> c) {
        boolean zRetainAll = this.f29611a.retainAll(c);
        lazySet(this.f29611a.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        return this.f29611a.set(index, element);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        return this.f29611a.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f29611a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f29611a.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return this.f29611a.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(@cfb E[] eArr) {
        return (E[]) this.f29611a.toArray(eArr);
    }

    public dgi(int initialCapacity) {
        this.f29611a = new ArrayList<>(initialCapacity);
    }

    @Override // java.util.List
    public void add(int index, T element) {
        this.f29611a.add(index, element);
        lazySet(this.f29611a.size());
    }

    @Override // java.util.List
    public boolean addAll(int index, @cfb Collection<? extends T> c) {
        boolean zAddAll = this.f29611a.addAll(index, c);
        lazySet(this.f29611a.size());
        return zAddAll;
    }

    @Override // java.util.List
    public T remove(int index) {
        T tRemove = this.f29611a.remove(index);
        lazySet(this.f29611a.size());
        return tRemove;
    }
}
