package p000;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p000.t6f;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public abstract class xs6<E> extends tt6<E> implements NavigableSet<E> {

    /* JADX INFO: renamed from: xs6$a */
    public class C15268a extends t6f.C12930g<E> {
        public C15268a(final xs6 this$0) {
            super(this$0);
        }
    }

    @wx1
    /* JADX INFO: renamed from: A */
    public E m25431A() {
        return (E) wg8.m24515i(descendingIterator());
    }

    /* JADX INFO: renamed from: B */
    public NavigableSet<E> m25432B(@dgc E fromElement, boolean fromInclusive, @dgc E toElement, boolean toInclusive) {
        return tailSet(fromElement, fromInclusive).headSet(toElement, toInclusive);
    }

    /* JADX INFO: renamed from: C */
    public SortedSet<E> m25433C(@dgc E fromElement) {
        return tailSet(fromElement, true);
    }

    @wx1
    public E ceiling(@dgc E e) {
        return mo8967m().ceiling(e);
    }

    public Iterator<E> descendingIterator() {
        return mo8967m().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return mo8967m().descendingSet();
    }

    @wx1
    public E floor(@dgc E e) {
        return mo8967m().floor(e);
    }

    public NavigableSet<E> headSet(@dgc E toElement, boolean inclusive) {
        return mo8967m().headSet(toElement, inclusive);
    }

    @wx1
    public E higher(@dgc E e) {
        return mo8967m().higher(e);
    }

    @wx1
    public E lower(@dgc E e) {
        return mo8967m().lower(e);
    }

    @wx1
    public E pollFirst() {
        return mo8967m().pollFirst();
    }

    @wx1
    public E pollLast() {
        return mo8967m().pollLast();
    }

    @Override // p000.tt6
    /* JADX INFO: renamed from: q */
    public SortedSet<E> mo22770q(@dgc E fromElement, @dgc E toElement) {
        return subSet(fromElement, true, toElement, false);
    }

    @Override // p000.tt6
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract NavigableSet<E> mo8967m();

    @wx1
    /* JADX INFO: renamed from: s */
    public E m25434s(@dgc E e) {
        return (E) wg8.getNext(tailSet(e, true).iterator(), null);
    }

    public NavigableSet<E> subSet(@dgc E fromElement, boolean fromInclusive, @dgc E toElement, boolean toInclusive) {
        return mo8967m().subSet(fromElement, fromInclusive, toElement, toInclusive);
    }

    @dgc
    /* JADX INFO: renamed from: t */
    public E m25435t() {
        return iterator().next();
    }

    public NavigableSet<E> tailSet(@dgc E fromElement, boolean inclusive) {
        return mo8967m().tailSet(fromElement, inclusive);
    }

    @wx1
    /* JADX INFO: renamed from: u */
    public E m25436u(@dgc E e) {
        return (E) wg8.getNext(headSet(e, true).descendingIterator(), null);
    }

    /* JADX INFO: renamed from: v */
    public SortedSet<E> m25437v(@dgc E toElement) {
        return headSet(toElement, false);
    }

    @wx1
    /* JADX INFO: renamed from: w */
    public E m25438w(@dgc E e) {
        return (E) wg8.getNext(tailSet(e, false).iterator(), null);
    }

    @dgc
    /* JADX INFO: renamed from: x */
    public E m25439x() {
        return descendingIterator().next();
    }

    @wx1
    /* JADX INFO: renamed from: y */
    public E m25440y(@dgc E e) {
        return (E) wg8.getNext(headSet(e, false).descendingIterator(), null);
    }

    @wx1
    /* JADX INFO: renamed from: z */
    public E m25441z() {
        return (E) wg8.m24515i(iterator());
    }
}
