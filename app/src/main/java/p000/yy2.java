package p000;

import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;
import p000.py7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class yy2<C extends Comparable> extends py7<C> {

    /* JADX INFO: renamed from: C */
    public final ke4<C> f103301C;

    public yy2(ke4<C> domain) {
        super(s7c.natural());
        this.f103301C = domain;
    }

    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> py7.C11183a<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static yy2<Integer> closed(int lower, int upper) {
        return create(bpd.closed(Integer.valueOf(lower), Integer.valueOf(upper)), ke4.integers());
    }

    public static yy2<Integer> closedOpen(int lower, int upper) {
        return create(bpd.closedOpen(Integer.valueOf(lower), Integer.valueOf(upper)), ke4.integers());
    }

    public static <C extends Comparable> yy2<C> create(bpd<C> range, ke4<C> domain) {
        v7d.checkNotNull(range);
        v7d.checkNotNull(domain);
        try {
            bpd<C> bpdVarIntersection = !range.hasLowerBound() ? range.intersection(bpd.atLeast(domain.minValue())) : range;
            if (!range.hasUpperBound()) {
                bpdVarIntersection = bpdVarIntersection.intersection(bpd.atMost(domain.maxValue()));
            }
            if (!bpdVarIntersection.isEmpty()) {
                Comparable comparableMo12924k = range.f14409a.mo12924k(domain);
                Objects.requireNonNull(comparableMo12924k);
                Comparable comparableMo12922i = range.f14410b.mo12922i(domain);
                Objects.requireNonNull(comparableMo12922i);
                if (bpd.m3328a(comparableMo12924k, comparableMo12922i) <= 0) {
                    return new ixd(bpdVarIntersection, domain);
                }
            }
            return new zz4(domain);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract yy2<C> intersection(yy2<C> other);

    @Override // p000.py7
    @jd7
    /* JADX INFO: renamed from: k */
    public py7<C> mo8784k() {
        return new e74(this);
    }

    @Override // p000.py7
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract yy2<C> mo8785m(C toElement, boolean inclusive);

    public abstract bpd<C> range();

    public abstract bpd<C> range(hc1 lowerBoundType, hc1 upperBoundType);

    @Override // p000.py7
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract yy2<C> mo8786n(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive);

    @Override // p000.py7
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract yy2<C> mo8787o(C fromElement, boolean inclusive);

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    public static yy2<Long> closed(long lower, long upper) {
        return create(bpd.closed(Long.valueOf(lower), Long.valueOf(upper)), ke4.longs());
    }

    public static yy2<Long> closedOpen(long lower, long upper) {
        return create(bpd.closedOpen(Long.valueOf(lower), Long.valueOf(upper)), ke4.longs());
    }

    @Override // p000.py7, java.util.NavigableSet, java.util.SortedSet
    public yy2<C> headSet(C toElement) {
        return mo8785m((Comparable) v7d.checkNotNull(toElement), false);
    }

    @Override // p000.py7, java.util.NavigableSet, java.util.SortedSet
    public yy2<C> subSet(C fromElement, C toElement) {
        v7d.checkNotNull(fromElement);
        v7d.checkNotNull(toElement);
        v7d.checkArgument(comparator().compare(fromElement, toElement) <= 0);
        return mo8786n(fromElement, true, toElement, false);
    }

    @Override // p000.py7, java.util.NavigableSet, java.util.SortedSet
    public yy2<C> tailSet(C fromElement) {
        return mo8787o((Comparable) v7d.checkNotNull(fromElement), true);
    }

    @Override // p000.py7, java.util.NavigableSet
    @jd7
    public yy2<C> headSet(C toElement, boolean inclusive) {
        return mo8785m((Comparable) v7d.checkNotNull(toElement), inclusive);
    }

    @Override // p000.py7, java.util.NavigableSet
    @jd7
    public yy2<C> tailSet(C fromElement, boolean inclusive) {
        return mo8787o((Comparable) v7d.checkNotNull(fromElement), inclusive);
    }

    @Override // p000.py7, java.util.NavigableSet
    @jd7
    public yy2<C> subSet(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        v7d.checkNotNull(fromElement);
        v7d.checkNotNull(toElement);
        v7d.checkArgument(comparator().compare(fromElement, toElement) <= 0);
        return mo8786n(fromElement, fromInclusive, toElement, toInclusive);
    }
}
