package p000;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class xc2<T> extends s7c<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public final Comparator<T> f97501c;

    public xc2(Comparator<T> comparator) {
        this.f97501c = (Comparator) v7d.checkNotNull(comparator);
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(@dgc T a, @dgc T b) {
        return this.f97501c.compare(a, b);
    }

    @Override // java.util.Comparator
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof xc2) {
            return this.f97501c.equals(((xc2) object).f97501c);
        }
        return false;
    }

    public int hashCode() {
        return this.f97501c.hashCode();
    }

    public String toString() {
        return this.f97501c.toString();
    }
}
