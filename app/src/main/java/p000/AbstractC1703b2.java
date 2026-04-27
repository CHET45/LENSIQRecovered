package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: b2 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC1703b2<T> implements Iterator<T>, uo8 {

    /* JADX INFO: renamed from: a */
    public int f12433a;

    /* JADX INFO: renamed from: b */
    @gib
    public T f12434b;

    private final boolean tryToComputeNext() {
        this.f12433a = 3;
        mo2803a();
        return this.f12433a == 1;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2803a();

    /* JADX INFO: renamed from: b */
    public final void m2804b() {
        this.f12433a = 2;
    }

    /* JADX INFO: renamed from: c */
    public final void m2805c(T t) {
        this.f12434b = t;
        this.f12433a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.f12433a;
        if (i == 0) {
            return tryToComputeNext();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f12433a;
        if (i == 1) {
            this.f12433a = 0;
            return this.f12434b;
        }
        if (i == 2 || !tryToComputeNext()) {
            throw new NoSuchElementException();
        }
        this.f12433a = 0;
        return this.f12434b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
