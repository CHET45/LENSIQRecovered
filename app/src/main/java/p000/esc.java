package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class esc<K, V> implements Iterator<x79<V>>, uo8 {

    /* JADX INFO: renamed from: d */
    public static final int f33965d = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public Object f33966a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<K, x79<V>> f33967b;

    /* JADX INFO: renamed from: c */
    public int f33968c;

    public esc(@gib Object obj, @yfb Map<K, x79<V>> map) {
        this.f33966a = obj;
        this.f33967b = map;
    }

    public final int getIndex$runtime_release() {
        return this.f33968c;
    }

    @gib
    public final Object getNextKey$runtime_release() {
        return this.f33966a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f33968c < this.f33967b.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i) {
        this.f33968c = i;
    }

    public final void setNextKey$runtime_release(@gib Object obj) {
        this.f33966a = obj;
    }

    @Override // java.util.Iterator
    @yfb
    public x79<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        x79<V> x79Var = this.f33967b.get(this.f33966a);
        if (x79Var != null) {
            x79<V> x79Var2 = x79Var;
            this.f33968c++;
            this.f33966a = x79Var2.getNext();
            return x79Var2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f33966a + ") has changed after it was added to the persistent map.");
    }
}
