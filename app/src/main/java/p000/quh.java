package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class quh<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
