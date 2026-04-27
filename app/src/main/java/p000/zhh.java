package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zhh<T> implements Iterator<T>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<T, Iterator<T>> f105102a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<Iterator<T>> f105103b = new ArrayList();

    /* JADX INFO: renamed from: c */
    @yfb
    public Iterator<? extends T> f105104c;

    /* JADX WARN: Multi-variable type inference failed */
    public zhh(@yfb Iterator<? extends T> it, @yfb qy6<? super T, ? extends Iterator<? extends T>> qy6Var) {
        this.f105102a = qy6Var;
        this.f105104c = it;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void prepareNextIterator(T t) {
        Iterator<T> itInvoke = this.f105102a.invoke(t);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.f105103b.add((Iterator<T>) this.f105104c);
            this.f105104c = itInvoke;
        } else {
            while (!this.f105104c.hasNext() && !this.f105103b.isEmpty()) {
                this.f105104c = (Iterator) v82.last((List) this.f105103b);
                q82.removeLast(this.f105103b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105104c.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.f105104c.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
