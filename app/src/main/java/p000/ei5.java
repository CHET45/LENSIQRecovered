package p000;

import java.io.Serializable;
import java.util.List;
import p000.s7c;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class ei5<T> extends s7c<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public final ox7<T, Integer> f33064c;

    public ei5(List<T> valuesInOrder) {
        this(tt9.m22795p(valuesInOrder));
    }

    private int rank(T value) {
        Integer num = this.f33064c.get(value);
        if (num != null) {
            return num.intValue();
        }
        throw new s7c.C12483c(value);
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(T left, T right) {
        return rank(left) - rank(right);
    }

    @Override // java.util.Comparator
    public boolean equals(@wx1 Object object) {
        if (object instanceof ei5) {
            return this.f33064c.equals(((ei5) object).f33064c);
        }
        return false;
    }

    public int hashCode() {
        return this.f33064c.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.f33064c.keySet() + c0b.f15434d;
    }

    public ei5(ox7<T, Integer> rankMap) {
        this.f33064c = rankMap;
    }
}
