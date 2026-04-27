package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class jsc<E> implements Iterator<E>, uo8 {

    /* JADX INFO: renamed from: d */
    public static final int f51728d = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public Object f51729a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<E, a89> f51730b;

    /* JADX INFO: renamed from: c */
    public int f51731c;

    public jsc(@gib Object obj, @yfb Map<E, a89> map) {
        this.f51729a = obj;
        this.f51730b = map;
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex$runtime_release() {
        return this.f51731c;
    }

    @yfb
    public final Map<E, a89> getMap$runtime_release() {
        return this.f51730b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f51731c < this.f51730b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        checkHasNext();
        E e = (E) this.f51729a;
        this.f51731c++;
        a89 a89Var = this.f51730b.get(e);
        if (a89Var != null) {
            this.f51729a = a89Var.getNext();
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i) {
        this.f51731c = i;
    }
}
