package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class es6<T> extends zs6 implements Iterator<T> {
    @Override // p000.zs6
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> mo22402p();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return mo22402p().hasNext();
    }

    @Override // java.util.Iterator
    @op1
    @dgc
    public T next() {
        return mo22402p().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        mo22402p().remove();
    }
}
