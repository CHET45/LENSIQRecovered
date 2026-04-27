package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j2 */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public abstract class AbstractC7718j2<E> implements ListIterator<E>, uo8 {

    /* JADX INFO: renamed from: c */
    public static final int f49375c = 8;

    /* JADX INFO: renamed from: a */
    public int f49376a;

    /* JADX INFO: renamed from: b */
    public int f49377b;

    public AbstractC7718j2(int i, int i2) {
        this.f49376a = i;
        this.f49377b = i2;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime_release() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void checkHasPrevious$runtime_release() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex() {
        return this.f49376a;
    }

    public final int getSize() {
        return this.f49377b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f49376a < this.f49377b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f49376a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f49376a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f49376a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.f49376a = i;
    }

    public final void setSize(int i) {
        this.f49377b = i;
    }
}
