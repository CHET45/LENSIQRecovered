package p000;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class m9e<T> extends s7c<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public final s7c<? super T> f60296c;

    public m9e(s7c<? super T> forwardOrder) {
        this.f60296c = (s7c) v7d.checkNotNull(forwardOrder);
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(@dgc T a, @dgc T b) {
        return this.f60296c.compare(b, a);
    }

    @Override // java.util.Comparator
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof m9e) {
            return this.f60296c.equals(((m9e) object).f60296c);
        }
        return false;
    }

    public int hashCode() {
        return -this.f60296c.hashCode();
    }

    @Override // p000.s7c
    public <E extends T> E max(@dgc E e, @dgc E e2) {
        return (E) this.f60296c.min(e, e2);
    }

    @Override // p000.s7c
    public <E extends T> E min(@dgc E e, @dgc E e2) {
        return (E) this.f60296c.max(e, e2);
    }

    @Override // p000.s7c
    public <S extends T> s7c<S> reverse() {
        return this.f60296c;
    }

    public String toString() {
        return this.f60296c + ".reverse()";
    }

    @Override // p000.s7c
    public <E extends T> E max(@dgc E e, @dgc E e2, @dgc E e3, E... eArr) {
        return (E) this.f60296c.min(e, e2, e3, eArr);
    }

    @Override // p000.s7c
    public <E extends T> E min(@dgc E e, @dgc E e2, @dgc E e3, E... eArr) {
        return (E) this.f60296c.max(e, e2, e3, eArr);
    }

    @Override // p000.s7c
    public <E extends T> E max(Iterator<E> it) {
        return (E) this.f60296c.min(it);
    }

    @Override // p000.s7c
    public <E extends T> E min(Iterator<E> it) {
        return (E) this.f60296c.max(it);
    }

    @Override // p000.s7c
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) this.f60296c.min(iterable);
    }

    @Override // p000.s7c
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) this.f60296c.max(iterable);
    }
}
