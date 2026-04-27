package p000;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class tuh<E> extends quh<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(@dgc E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(@dgc E e) {
        throw new UnsupportedOperationException();
    }
}
