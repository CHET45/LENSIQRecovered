package p000;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
@yg8
public abstract class qr6<E> extends ct6<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(@dgc E e) {
        mo8967m().addFirst(e);
    }

    @Override // java.util.Deque
    public void addLast(@dgc E e) {
        mo8967m().addLast(e);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return mo8967m().descendingIterator();
    }

    @Override // java.util.Deque
    @dgc
    public E getFirst() {
        return mo8967m().getFirst();
    }

    @Override // java.util.Deque
    @dgc
    public E getLast() {
        return mo8967m().getLast();
    }

    @Override // java.util.Deque
    @op1
    public boolean offerFirst(@dgc E e) {
        return mo8967m().offerFirst(e);
    }

    @Override // java.util.Deque
    @op1
    public boolean offerLast(@dgc E e) {
        return mo8967m().offerLast(e);
    }

    @Override // java.util.Deque
    @wx1
    public E peekFirst() {
        return mo8967m().peekFirst();
    }

    @Override // java.util.Deque
    @wx1
    public E peekLast() {
        return mo8967m().peekLast();
    }

    @Override // java.util.Deque
    @op1
    @wx1
    public E pollFirst() {
        return mo8967m().pollFirst();
    }

    @Override // java.util.Deque
    @op1
    @wx1
    public E pollLast() {
        return mo8967m().pollLast();
    }

    @Override // java.util.Deque
    @op1
    @dgc
    public E pop() {
        return mo8967m().pop();
    }

    @Override // java.util.Deque
    public void push(@dgc E e) {
        mo8967m().push(e);
    }

    @Override // p000.ct6
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract Deque<E> mo8967m();

    @Override // java.util.Deque
    @op1
    @dgc
    public E removeFirst() {
        return mo8967m().removeFirst();
    }

    @Override // java.util.Deque
    @op1
    public boolean removeFirstOccurrence(@wx1 Object o) {
        return mo8967m().removeFirstOccurrence(o);
    }

    @Override // java.util.Deque
    @op1
    @dgc
    public E removeLast() {
        return mo8967m().removeLast();
    }

    @Override // java.util.Deque
    @op1
    public boolean removeLastOccurrence(@wx1 Object o) {
        return mo8967m().removeLastOccurrence(o);
    }
}
