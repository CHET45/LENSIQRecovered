package p000;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class gs6<E> extends es6<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    public void add(@dgc E element) {
        mo22402p().add(element);
    }

    @Override // p000.es6, p000.zs6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator<E> mo22402p();

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return mo22402p().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return mo22402p().nextIndex();
    }

    @Override // java.util.ListIterator
    @op1
    @dgc
    public E previous() {
        return mo22402p().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return mo22402p().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@dgc E element) {
        mo22402p().set(element);
    }
}
