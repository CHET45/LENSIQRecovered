package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class vib<T> extends s7c<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public final s7c<? super T> f91256c;

    public vib(s7c<? super T> ordering) {
        this.f91256c = ordering;
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(@wx1 T left, @wx1 T right) {
        if (left == right) {
            return 0;
        }
        if (left == null) {
            return -1;
        }
        if (right == null) {
            return 1;
        }
        return this.f91256c.compare(left, right);
    }

    @Override // java.util.Comparator
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof vib) {
            return this.f91256c.equals(((vib) object).f91256c);
        }
        return false;
    }

    public int hashCode() {
        return this.f91256c.hashCode() ^ 957692532;
    }

    @Override // p000.s7c
    public <S extends T> s7c<S> nullsFirst() {
        return this;
    }

    @Override // p000.s7c
    public <S extends T> s7c<S> nullsLast() {
        return this.f91256c.nullsLast();
    }

    @Override // p000.s7c
    public <S extends T> s7c<S> reverse() {
        return this.f91256c.reverse().nullsLast();
    }

    public String toString() {
        return this.f91256c + ".nullsFirst()";
    }
}
