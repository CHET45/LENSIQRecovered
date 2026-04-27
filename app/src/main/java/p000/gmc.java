package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use Iterators.peekingIterator")
@gd7
@tx4
public interface gmc<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @op1
    @dgc
    E next();

    @dgc
    E peek();

    @Override // java.util.Iterator
    void remove();
}
