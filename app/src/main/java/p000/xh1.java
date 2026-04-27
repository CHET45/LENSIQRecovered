package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class xh1<F, T> extends s7c<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public final lz6<F, ? extends T> f97778c;

    /* JADX INFO: renamed from: d */
    public final s7c<T> f97779d;

    public xh1(lz6<F, ? extends T> function, s7c<T> ordering) {
        this.f97778c = (lz6) v7d.checkNotNull(function);
        this.f97779d = (s7c) v7d.checkNotNull(ordering);
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(@dgc F f, @dgc F f2) {
        return this.f97779d.compare(this.f97778c.apply(f), this.f97778c.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof xh1)) {
            return false;
        }
        xh1 xh1Var = (xh1) object;
        return this.f97778c.equals(xh1Var.f97778c) && this.f97779d.equals(xh1Var.f97779d);
    }

    public int hashCode() {
        return okb.hashCode(this.f97778c, this.f97779d);
    }

    public String toString() {
        return this.f97779d + ".onResultOf(" + this.f97778c + c0b.f15434d;
    }
}
