package p000;

import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use ImmutableRangeSet or TreeRangeSet")
@jd7
@tx4
public interface gpd<C extends Comparable> {
    void add(bpd<C> range);

    void addAll(gpd<C> other);

    void addAll(Iterable<bpd<C>> ranges);

    Set<bpd<C>> asDescendingSetOfRanges();

    Set<bpd<C>> asRanges();

    void clear();

    gpd<C> complement();

    boolean contains(C value);

    boolean encloses(bpd<C> otherRange);

    boolean enclosesAll(gpd<C> other);

    boolean enclosesAll(Iterable<bpd<C>> other);

    boolean equals(@wx1 Object obj);

    int hashCode();

    boolean intersects(bpd<C> otherRange);

    boolean isEmpty();

    @wx1
    bpd<C> rangeContaining(C value);

    void remove(bpd<C> range);

    void removeAll(gpd<C> other);

    void removeAll(Iterable<bpd<C>> ranges);

    bpd<C> span();

    gpd<C> subRangeSet(bpd<C> view);

    String toString();
}
