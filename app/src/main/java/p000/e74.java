package p000;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public final class e74<E> extends py7<E> {

    /* JADX INFO: renamed from: C */
    public final py7<E> f32034C;

    public e74(py7<E> forward) {
        super(s7c.from(forward.comparator()).reverse());
        this.f32034C = forward;
    }

    @Override // p000.py7, java.util.NavigableSet
    @wx1
    public E ceiling(E element) {
        return this.f32034C.floor(element);
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        return this.f32034C.contains(object);
    }

    @Override // p000.py7, java.util.NavigableSet
    @wx1
    public E floor(E element) {
        return this.f32034C.ceiling(element);
    }

    @Override // p000.py7, java.util.NavigableSet
    @wx1
    public E higher(E element) {
        return this.f32034C.lower(element);
    }

    @Override // p000.py7
    public int indexOf(@wx1 Object target) {
        int iIndexOf = this.f32034C.indexOf(target);
        return iIndexOf == -1 ? iIndexOf : (size() - 1) - iIndexOf;
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return this.f32034C.isPartialView();
    }

    @Override // p000.py7
    @jd7("NavigableSet")
    /* JADX INFO: renamed from: k */
    public py7<E> mo8784k() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.py7, java.util.NavigableSet
    @wx1
    public E lower(E element) {
        return this.f32034C.higher(element);
    }

    @Override // p000.py7
    /* JADX INFO: renamed from: m */
    public py7<E> mo8785m(E toElement, boolean inclusive) {
        return this.f32034C.tailSet((Object) toElement, inclusive).descendingSet();
    }

    @Override // p000.py7
    /* JADX INFO: renamed from: n */
    public py7<E> mo8786n(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return this.f32034C.subSet((Object) toElement, toInclusive, (Object) fromElement, fromInclusive).descendingSet();
    }

    @Override // p000.py7
    /* JADX INFO: renamed from: o */
    public py7<E> mo8787o(E fromElement, boolean inclusive) {
        return this.f32034C.headSet((Object) fromElement, inclusive).descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f32034C.size();
    }

    @Override // p000.py7, java.util.NavigableSet
    @jd7("NavigableSet")
    public quh<E> descendingIterator() {
        return this.f32034C.iterator();
    }

    @Override // p000.py7, java.util.NavigableSet
    @jd7("NavigableSet")
    public py7<E> descendingSet() {
        return this.f32034C;
    }

    @Override // p000.py7, p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<E> iterator() {
        return this.f32034C.descendingIterator();
    }
}
