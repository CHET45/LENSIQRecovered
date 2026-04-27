package p000;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class l49<T> extends s7c<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public final Comparator<? super T> f56137c;

    public l49(Comparator<? super T> elementOrder) {
        this.f56137c = elementOrder;
    }

    @Override // java.util.Comparator
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof l49) {
            return this.f56137c.equals(((l49) object).f56137c);
        }
        return false;
    }

    public int hashCode() {
        return this.f56137c.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.f56137c + ".lexicographical()";
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(Iterable<T> leftIterable, Iterable<T> rightIterable) {
        Iterator<T> it = leftIterable.iterator();
        Iterator<T> it2 = rightIterable.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f56137c.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }
}
