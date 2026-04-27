package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class qxd<E> extends py7<E> {

    /* JADX INFO: renamed from: F */
    public static final qxd<Comparable> f76279F = new qxd<>(kx7.m15110of(), s7c.natural());

    /* JADX INFO: renamed from: C */
    @gdi
    public final transient kx7<E> f76280C;

    public qxd(kx7<E> elements, Comparator<? super E> comparator) {
        super(comparator);
        this.f76280C = elements;
    }

    private int unsafeBinarySearch(Object key) throws ClassCastException {
        return Collections.binarySearch(this.f76280C, key, m20709u());
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int offset) {
        return this.f76280C.mo2718a(dst, offset);
    }

    @Override // p000.dy7, p000.ax7
    public kx7<E> asList() {
        return this.f76280C;
    }

    @Override // p000.ax7
    @wx1
    /* JADX INFO: renamed from: b */
    public Object[] mo2719b() {
        return this.f76280C.mo2719b();
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: c */
    public int mo2720c() {
        return this.f76280C.mo2720c();
    }

    @Override // p000.py7, java.util.NavigableSet
    @wx1
    public E ceiling(E element) {
        int iM20708t = m20708t(element, true);
        if (iM20708t == size()) {
            return null;
        }
        return this.f76280C.get(iM20708t);
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object o) {
        if (o == null) {
            return false;
        }
        try {
            return unsafeBinarySearch(o) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> targets) {
        if (targets instanceof d4b) {
            targets = ((d4b) targets).elementSet();
        }
        if (!lvf.hasSameComparator(comparator(), targets) || targets.size() <= 1) {
            return super.containsAll(targets);
        }
        quh<E> it = iterator();
        Iterator<?> it2 = targets.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iM19848p = m19848p(next2, next);
                if (iM19848p < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iM19848p == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iM19848p > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: d */
    public int mo2721d() {
        return this.f76280C.mo2721d();
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!lvf.hasSameComparator(this.f72495f, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            quh<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || m19848p(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // p000.py7, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f76280C.get(0);
    }

    @Override // p000.py7, java.util.NavigableSet
    @wx1
    public E floor(E element) {
        int iM20707s = m20707s(element, true) - 1;
        if (iM20707s == -1) {
            return null;
        }
        return this.f76280C.get(iM20707s);
    }

    @Override // p000.py7, java.util.NavigableSet
    @wx1
    public E higher(E element) {
        int iM20708t = m20708t(element, false);
        if (iM20708t == size()) {
            return null;
        }
        return this.f76280C.get(iM20708t);
    }

    @Override // p000.py7
    public int indexOf(@wx1 Object target) {
        if (target == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.f76280C, target, m20709u());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return this.f76280C.isPartialView();
    }

    @Override // p000.py7
    /* JADX INFO: renamed from: k */
    public py7<E> mo8784k() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f72495f);
        return isEmpty() ? py7.m19839l(comparatorReverseOrder) : new qxd(this.f76280C.reverse(), comparatorReverseOrder);
    }

    @Override // p000.py7, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f76280C.get(size() - 1);
    }

    @Override // p000.py7, java.util.NavigableSet
    @wx1
    public E lower(E element) {
        int iM20707s = m20707s(element, false) - 1;
        if (iM20707s == -1) {
            return null;
        }
        return this.f76280C.get(iM20707s);
    }

    @Override // p000.py7
    /* JADX INFO: renamed from: m */
    public py7<E> mo8785m(E toElement, boolean inclusive) {
        return m20706r(0, m20707s(toElement, inclusive));
    }

    @Override // p000.py7
    /* JADX INFO: renamed from: n */
    public py7<E> mo8786n(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return mo8787o(fromElement, fromInclusive).mo8785m(toElement, toInclusive);
    }

    @Override // p000.py7
    /* JADX INFO: renamed from: o */
    public py7<E> mo8787o(E fromElement, boolean inclusive) {
        return m20706r(m20708t(fromElement, inclusive), size());
    }

    /* JADX INFO: renamed from: r */
    public qxd<E> m20706r(int newFromIndex, int newToIndex) {
        return (newFromIndex == 0 && newToIndex == size()) ? this : newFromIndex < newToIndex ? new qxd<>(this.f76280C.subList(newFromIndex, newToIndex), this.f72495f) : py7.m19839l(this.f72495f);
    }

    /* JADX INFO: renamed from: s */
    public int m20707s(E toElement, boolean inclusive) {
        int iBinarySearch = Collections.binarySearch(this.f76280C, v7d.checkNotNull(toElement), comparator());
        return iBinarySearch >= 0 ? inclusive ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76280C.size();
    }

    /* JADX INFO: renamed from: t */
    public int m20708t(E fromElement, boolean inclusive) {
        int iBinarySearch = Collections.binarySearch(this.f76280C, v7d.checkNotNull(fromElement), comparator());
        return iBinarySearch >= 0 ? inclusive ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    /* JADX INFO: renamed from: u */
    public Comparator<Object> m20709u() {
        return this.f72495f;
    }

    @Override // p000.py7, java.util.NavigableSet
    @jd7
    public quh<E> descendingIterator() {
        return this.f76280C.reverse().iterator();
    }

    @Override // p000.py7, p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<E> iterator() {
        return this.f76280C.iterator();
    }
}
