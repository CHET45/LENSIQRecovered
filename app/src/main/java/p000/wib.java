package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class wib<T> extends s7c<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public final s7c<? super T> f94358c;

    public wib(s7c<? super T> ordering) {
        this.f94358c = ordering;
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(@wx1 T left, @wx1 T right) {
        if (left == right) {
            return 0;
        }
        if (left == null) {
            return 1;
        }
        if (right == null) {
            return -1;
        }
        return this.f94358c.compare(left, right);
    }

    @Override // java.util.Comparator
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof wib) {
            return this.f94358c.equals(((wib) object).f94358c);
        }
        return false;
    }

    public int hashCode() {
        return this.f94358c.hashCode() ^ (-921210296);
    }

    @Override // p000.s7c
    public <S extends T> s7c<S> nullsFirst() {
        return this.f94358c.nullsFirst();
    }

    @Override // p000.s7c
    public <S extends T> s7c<S> nullsLast() {
        return this;
    }

    @Override // p000.s7c
    public <S extends T> s7c<S> reverse() {
        return this.f94358c.reverse().nullsFirst();
    }

    public String toString() {
        return this.f94358c + ".nullsLast()";
    }
}
