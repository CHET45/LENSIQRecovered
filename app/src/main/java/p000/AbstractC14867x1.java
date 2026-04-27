package p000;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: x1 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC14867x1<E> extends tuh<E> {

    /* JADX INFO: renamed from: a */
    public final int f95996a;

    /* JADX INFO: renamed from: b */
    public int f95997b;

    public AbstractC14867x1(int size) {
        this(size, 0);
    }

    @dgc
    public abstract E get(int index);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f95997b < this.f95996a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f95997b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @dgc
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f95997b;
        this.f95997b = i + 1;
        return get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f95997b;
    }

    @Override // java.util.ListIterator
    @dgc
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f95997b - 1;
        this.f95997b = i;
        return get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f95997b - 1;
    }

    public AbstractC14867x1(int size, int position) {
        v7d.checkPositionIndex(position, size);
        this.f95996a = size;
        this.f95997b = position;
    }
}
