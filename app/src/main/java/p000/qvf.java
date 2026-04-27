package p000;

import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p000.d4b;
import p000.e4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class qvf {

    /* JADX INFO: renamed from: qvf$a */
    public static class C11716a<E> extends e4b.AbstractC5106h<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: a */
        @Weak
        public final ovf<E> f75927a;

        public C11716a(ovf<E> multiset) {
            this.f75927a = multiset;
        }

        @Override // p000.e4b.AbstractC5106h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ovf<E> mo8866a() {
            return this.f75927a;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return mo8866a().comparator();
        }

        @Override // java.util.SortedSet
        @dgc
        public E first() {
            return (E) qvf.getElementOrThrow(mo8866a().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@dgc E toElement) {
            return mo8866a().headMultiset(toElement, hc1.OPEN).elementSet();
        }

        @Override // p000.e4b.AbstractC5106h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return e4b.m9659c(mo8866a().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @dgc
        public E last() {
            return (E) qvf.getElementOrThrow(mo8866a().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@dgc E fromElement, @dgc E toElement) {
            return mo8866a().subMultiset(fromElement, hc1.CLOSED, toElement, hc1.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@dgc E fromElement) {
            return mo8866a().tailMultiset(fromElement, hc1.CLOSED).elementSet();
        }
    }

    /* JADX INFO: renamed from: qvf$b */
    @jd7
    public static class C11717b<E> extends C11716a<E> implements NavigableSet<E> {
        public C11717b(ovf<E> multiset) {
            super(multiset);
        }

        @Override // java.util.NavigableSet
        @wx1
        public E ceiling(@dgc E e) {
            return (E) qvf.getElementOrNull(mo8866a().tailMultiset(e, hc1.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new C11717b(mo8866a().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        @wx1
        public E floor(@dgc E e) {
            return (E) qvf.getElementOrNull(mo8866a().headMultiset(e, hc1.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@dgc E toElement, boolean inclusive) {
            return new C11717b(mo8866a().headMultiset(toElement, hc1.m12308a(inclusive)));
        }

        @Override // java.util.NavigableSet
        @wx1
        public E higher(@dgc E e) {
            return (E) qvf.getElementOrNull(mo8866a().tailMultiset(e, hc1.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        @wx1
        public E lower(@dgc E e) {
            return (E) qvf.getElementOrNull(mo8866a().headMultiset(e, hc1.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @wx1
        public E pollFirst() {
            return (E) qvf.getElementOrNull(mo8866a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @wx1
        public E pollLast() {
            return (E) qvf.getElementOrNull(mo8866a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@dgc E fromElement, boolean fromInclusive, @dgc E toElement, boolean toInclusive) {
            return new C11717b(mo8866a().subMultiset(fromElement, hc1.m12308a(fromInclusive), toElement, hc1.m12308a(toInclusive)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@dgc E fromElement, boolean inclusive) {
            return new C11717b(mo8866a().tailMultiset(fromElement, hc1.m12308a(inclusive)));
        }
    }

    private qvf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wx1
    public static <E> E getElementOrNull(@wx1 d4b.InterfaceC4612a<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E getElementOrThrow(@wx1 d4b.InterfaceC4612a<E> entry) {
        if (entry != null) {
            return entry.getElement();
        }
        throw new NoSuchElementException();
    }
}
