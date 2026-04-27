package p000;

import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class ct6<E> extends lr6<E> implements Queue<E> {
    @Override // java.util.Queue
    @dgc
    public E element() {
        return mo8967m().element();
    }

    @Override // p000.lr6, p000.zs6
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract Queue<E> mo8967m();

    /* JADX INFO: renamed from: n */
    public boolean m8681n(@dgc E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @wx1
    /* JADX INFO: renamed from: o */
    public E m8682o() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @Override // java.util.Queue
    @op1
    public boolean offer(@dgc E o) {
        return mo8967m().offer(o);
    }

    @wx1
    /* JADX INFO: renamed from: p */
    public E m8683p() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @Override // java.util.Queue
    @wx1
    public E peek() {
        return mo8967m().peek();
    }

    @Override // java.util.Queue
    @op1
    @wx1
    public E poll() {
        return mo8967m().poll();
    }

    @Override // java.util.Queue
    @op1
    @dgc
    public E remove() {
        return mo8967m().remove();
    }
}
