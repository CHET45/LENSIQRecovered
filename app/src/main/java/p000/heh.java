package p000;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class heh<F, T> extends geh<F, T> implements ListIterator<T> {
    public heh(ListIterator<? extends F> backingIterator) {
        super(backingIterator);
    }

    private ListIterator<? extends F> backingIterator() {
        return wg8.m24507a(this.f39649a);
    }

    @Override // java.util.ListIterator
    public void add(@dgc T element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return backingIterator().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return backingIterator().nextIndex();
    }

    @Override // java.util.ListIterator
    @dgc
    public final T previous() {
        return mo2935a(backingIterator().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return backingIterator().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@dgc T element) {
        throw new UnsupportedOperationException();
    }
}
