package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class geh<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public final Iterator<? extends F> f39649a;

    public geh(Iterator<? extends F> backingIterator) {
        this.f39649a = (Iterator) v7d.checkNotNull(backingIterator);
    }

    @dgc
    /* JADX INFO: renamed from: a */
    public abstract T mo2935a(@dgc F from);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39649a.hasNext();
    }

    @Override // java.util.Iterator
    @dgc
    public final T next() {
        return mo2935a(this.f39649a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f39649a.remove();
    }
}
