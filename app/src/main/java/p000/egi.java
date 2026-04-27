package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class egi<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;

    /* JADX INFO: renamed from: a */
    public final ArrayList<T> f32955a;

    public egi() {
        this.f32955a = new ArrayList<>();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        boolean zAdd = this.f32955a.add(t);
        lazySet(this.f32955a.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean zAddAll = this.f32955a.addAll(collection);
        lazySet(this.f32955a.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f32955a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f32955a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f32955a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof egi ? this.f32955a.equals(((egi) obj).f32955a) : this.f32955a.equals(obj);
    }

    @Override // java.util.List
    public T get(int i) {
        return this.f32955a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f32955a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f32955a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f32955a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f32955a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f32955a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove = this.f32955a.remove(obj);
        lazySet(this.f32955a.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = this.f32955a.removeAll(collection);
        lazySet(this.f32955a.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = this.f32955a.retainAll(collection);
        lazySet(this.f32955a.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        return this.f32955a.set(i, t);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        return this.f32955a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f32955a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f32955a.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        return this.f32955a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.f32955a.toArray(eArr);
    }

    public egi(int i) {
        this.f32955a = new ArrayList<>(i);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        this.f32955a.add(i, t);
        lazySet(this.f32955a.size());
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean zAddAll = this.f32955a.addAll(i, collection);
        lazySet(this.f32955a.size());
        return zAddAll;
    }

    @Override // java.util.List
    public T remove(int i) {
        T tRemove = this.f32955a.remove(i);
        lazySet(this.f32955a.size());
        return tRemove;
    }
}
