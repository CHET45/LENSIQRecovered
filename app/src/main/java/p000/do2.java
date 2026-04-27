package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class do2<T> extends s7c<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    public final Comparator<? super T>[] f30243c;

    public do2(Comparator<? super T> primary, Comparator<? super T> secondary) {
        this.f30243c = new Comparator[]{primary, secondary};
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(@dgc T left, @dgc T right) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f30243c;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(left, right);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof do2) {
            return Arrays.equals(this.f30243c, ((do2) object).f30243c);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f30243c);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f30243c) + c0b.f15434d;
    }

    public do2(Iterable<? extends Comparator<? super T>> comparators) {
        this.f30243c = (Comparator[]) vg8.m23937c(comparators, new Comparator[0]);
    }
}
