package p000;

import java.lang.Comparable;
import java.util.Iterator;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public abstract class AbstractC14889x3<C extends Comparable> implements gpd<C> {
    @Override // p000.gpd
    public void add(bpd<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.gpd
    public void addAll(gpd<C> other) {
        addAll(other.asRanges());
    }

    @Override // p000.gpd
    public void clear() {
        remove(bpd.all());
    }

    @Override // p000.gpd
    public boolean contains(C value) {
        return rangeContaining(value) != null;
    }

    @Override // p000.gpd
    public abstract boolean encloses(bpd<C> otherRange);

    @Override // p000.gpd
    public boolean enclosesAll(gpd<C> other) {
        return enclosesAll(other.asRanges());
    }

    @Override // p000.gpd
    public boolean equals(@wx1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpd) {
            return asRanges().equals(((gpd) obj).asRanges());
        }
        return false;
    }

    @Override // p000.gpd
    public final int hashCode() {
        return asRanges().hashCode();
    }

    @Override // p000.gpd
    public boolean intersects(bpd<C> otherRange) {
        return !subRangeSet(otherRange).isEmpty();
    }

    @Override // p000.gpd
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @Override // p000.gpd
    @wx1
    public abstract bpd<C> rangeContaining(C value);

    @Override // p000.gpd
    public void remove(bpd<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.gpd
    public void removeAll(gpd<C> other) {
        removeAll(other.asRanges());
    }

    @Override // p000.gpd
    public final String toString() {
        return asRanges().toString();
    }

    @Override // p000.gpd
    public void addAll(Iterable<bpd<C>> ranges) {
        Iterator<bpd<C>> it = ranges.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // p000.gpd
    public boolean enclosesAll(Iterable<bpd<C>> ranges) {
        Iterator<bpd<C>> it = ranges.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.gpd
    public void removeAll(Iterable<bpd<C>> ranges) {
        Iterator<bpd<C>> it = ranges.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }
}
