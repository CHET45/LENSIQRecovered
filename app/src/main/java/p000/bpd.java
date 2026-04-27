package p000;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
@tw7(containerOf = {"C"})
public final class bpd<C extends Comparable> extends dpd implements l8d<C>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final bpd<Comparable> f14408c = new bpd<>(ie3.m12916c(), ie3.m12914a());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final ie3<C> f14409a;

    /* JADX INFO: renamed from: b */
    public final ie3<C> f14410b;

    /* JADX INFO: renamed from: bpd$a */
    public static /* synthetic */ class C1982a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14411a;

        static {
            int[] iArr = new int[hc1.values().length];
            f14411a = iArr;
            try {
                iArr[hc1.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14411a[hc1.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: bpd$b */
    public static class C1983b implements lz6<bpd, ie3> {

        /* JADX INFO: renamed from: a */
        public static final C1983b f14412a = new C1983b();

        @Override // p000.lz6
        public ie3 apply(bpd range) {
            return range.f14409a;
        }
    }

    /* JADX INFO: renamed from: bpd$c */
    public static class C1984c extends s7c<bpd<?>> implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final s7c<bpd<?>> f14413c = new C1984c();
        private static final long serialVersionUID = 0;

        private C1984c() {
        }

        @Override // p000.s7c, java.util.Comparator
        public int compare(bpd<?> left, bpd<?> right) {
            return bd2.start().compare(left.f14409a, right.f14409a).compare(left.f14410b, right.f14410b).result();
        }
    }

    /* JADX INFO: renamed from: bpd$d */
    public static class C1985d implements lz6<bpd, ie3> {

        /* JADX INFO: renamed from: a */
        public static final C1985d f14414a = new C1985d();

        @Override // p000.lz6
        public ie3 apply(bpd range) {
            return range.f14410b;
        }
    }

    private bpd(ie3<C> lowerBound, ie3<C> upperBound) {
        this.f14409a = (ie3) v7d.checkNotNull(lowerBound);
        this.f14410b = (ie3) v7d.checkNotNull(upperBound);
        if (lowerBound.compareTo((ie3) upperBound) > 0 || lowerBound == ie3.m12914a() || upperBound == ie3.m12916c()) {
            throw new IllegalArgumentException("Invalid range: " + toString(lowerBound, upperBound));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3328a(Comparable left, Comparable right) {
        return left.compareTo(right);
    }

    public static <C extends Comparable<?>> bpd<C> all() {
        return (bpd<C>) f14408c;
    }

    public static <C extends Comparable<?>> bpd<C> atLeast(C endpoint) {
        return m3329b(ie3.m12917d(endpoint), ie3.m12914a());
    }

    public static <C extends Comparable<?>> bpd<C> atMost(C endpoint) {
        return m3329b(ie3.m12916c(), ie3.m12915b(endpoint));
    }

    /* JADX INFO: renamed from: b */
    public static <C extends Comparable<?>> bpd<C> m3329b(ie3<C> lowerBound, ie3<C> upperBound) {
        return new bpd<>(lowerBound, upperBound);
    }

    /* JADX INFO: renamed from: c */
    public static <C extends Comparable<?>> lz6<bpd<C>, ie3<C>> m3330c() {
        return C1983b.f14412a;
    }

    public static <C extends Comparable<?>> bpd<C> closed(C lower, C upper) {
        return m3329b(ie3.m12917d(lower), ie3.m12915b(upper));
    }

    public static <C extends Comparable<?>> bpd<C> closedOpen(C lower, C upper) {
        return m3329b(ie3.m12917d(lower), ie3.m12917d(upper));
    }

    /* JADX INFO: renamed from: d */
    public static <C extends Comparable<?>> s7c<bpd<C>> m3331d() {
        return (s7c<bpd<C>>) C1984c.f14413c;
    }

    public static <C extends Comparable<?>> bpd<C> downTo(C endpoint, hc1 boundType) {
        int i = C1982a.f14411a[boundType.ordinal()];
        if (i == 1) {
            return greaterThan(endpoint);
        }
        if (i == 2) {
            return atLeast(endpoint);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: e */
    public static <C extends Comparable<?>> lz6<bpd<C>, ie3<C>> m3332e() {
        return C1985d.f14414a;
    }

    public static <C extends Comparable<?>> bpd<C> encloseAll(Iterable<C> values) {
        v7d.checkNotNull(values);
        if (values instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) values;
            Comparator comparator = sortedSet.comparator();
            if (s7c.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = values.iterator();
        Comparable comparable = (Comparable) v7d.checkNotNull(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) v7d.checkNotNull(it.next());
            comparable = (Comparable) s7c.natural().min(comparable, comparable3);
            comparable2 = (Comparable) s7c.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> bpd<C> greaterThan(C endpoint) {
        return m3329b(ie3.m12915b(endpoint), ie3.m12914a());
    }

    public static <C extends Comparable<?>> bpd<C> lessThan(C endpoint) {
        return m3329b(ie3.m12916c(), ie3.m12917d(endpoint));
    }

    public static <C extends Comparable<?>> bpd<C> open(C lower, C upper) {
        return m3329b(ie3.m12915b(lower), ie3.m12917d(upper));
    }

    public static <C extends Comparable<?>> bpd<C> openClosed(C lower, C upper) {
        return m3329b(ie3.m12915b(lower), ie3.m12915b(upper));
    }

    public static <C extends Comparable<?>> bpd<C> range(C lower, hc1 lowerType, C upper, hc1 upperType) {
        v7d.checkNotNull(lowerType);
        v7d.checkNotNull(upperType);
        hc1 hc1Var = hc1.OPEN;
        return m3329b(lowerType == hc1Var ? ie3.m12915b(lower) : ie3.m12917d(lower), upperType == hc1Var ? ie3.m12917d(upper) : ie3.m12915b(upper));
    }

    public static <C extends Comparable<?>> bpd<C> singleton(C value) {
        return closed(value, value);
    }

    public static <C extends Comparable<?>> bpd<C> upTo(C endpoint, hc1 boundType) {
        int i = C1982a.f14411a[boundType.ordinal()];
        if (i == 1) {
            return lessThan(endpoint);
        }
        if (i == 2) {
            return atMost(endpoint);
        }
        throw new AssertionError();
    }

    public bpd<C> canonical(ke4<C> domain) {
        v7d.checkNotNull(domain);
        ie3<C> ie3VarMo12918e = this.f14409a.mo12918e(domain);
        ie3<C> ie3VarMo12918e2 = this.f14410b.mo12918e(domain);
        return (ie3VarMo12918e == this.f14409a && ie3VarMo12918e2 == this.f14410b) ? this : m3329b(ie3VarMo12918e, ie3VarMo12918e2);
    }

    public boolean contains(C value) {
        v7d.checkNotNull(value);
        return this.f14409a.mo12923j(value) && !this.f14410b.mo12923j(value);
    }

    public boolean containsAll(Iterable<? extends C> values) {
        if (vg8.isEmpty(values)) {
            return true;
        }
        if (values instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) values;
            Comparator comparator = sortedSet.comparator();
            if (s7c.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = values.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(bpd<C> other) {
        return this.f14409a.compareTo((ie3) other.f14409a) <= 0 && this.f14410b.compareTo((ie3) other.f14410b) >= 0;
    }

    @Override // p000.l8d
    public boolean equals(@wx1 Object object) {
        if (!(object instanceof bpd)) {
            return false;
        }
        bpd bpdVar = (bpd) object;
        return this.f14409a.equals(bpdVar.f14409a) && this.f14410b.equals(bpdVar.f14410b);
    }

    public bpd<C> gap(bpd<C> otherRange) {
        if (this.f14409a.compareTo((ie3) otherRange.f14410b) >= 0 || otherRange.f14409a.compareTo((ie3) this.f14410b) >= 0) {
            boolean z = this.f14409a.compareTo((ie3) otherRange.f14409a) < 0;
            bpd<C> bpdVar = z ? this : otherRange;
            if (!z) {
                otherRange = this;
            }
            return m3329b(bpdVar.f14410b, otherRange.f14409a);
        }
        throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + otherRange);
    }

    public boolean hasLowerBound() {
        return this.f14409a != ie3.m12916c();
    }

    public boolean hasUpperBound() {
        return this.f14410b != ie3.m12914a();
    }

    public int hashCode() {
        return (this.f14409a.hashCode() * 31) + this.f14410b.hashCode();
    }

    public bpd<C> intersection(bpd<C> connectedRange) {
        int iCompareTo = this.f14409a.compareTo((ie3) connectedRange.f14409a);
        int iCompareTo2 = this.f14410b.compareTo((ie3) connectedRange.f14410b);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return connectedRange;
        }
        ie3<C> ie3Var = iCompareTo >= 0 ? this.f14409a : connectedRange.f14409a;
        ie3<C> ie3Var2 = iCompareTo2 <= 0 ? this.f14410b : connectedRange.f14410b;
        v7d.checkArgument(ie3Var.compareTo((ie3) ie3Var2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, connectedRange);
        return m3329b(ie3Var, ie3Var2);
    }

    public boolean isConnected(bpd<C> other) {
        return this.f14409a.compareTo((ie3) other.f14410b) <= 0 && other.f14409a.compareTo((ie3) this.f14410b) <= 0;
    }

    public boolean isEmpty() {
        return this.f14409a.equals(this.f14410b);
    }

    public hc1 lowerBoundType() {
        return this.f14409a.mo12925l();
    }

    public C lowerEndpoint() {
        return (C) this.f14409a.mo12921h();
    }

    public Object readResolve() {
        return equals(f14408c) ? all() : this;
    }

    public bpd<C> span(bpd<C> other) {
        int iCompareTo = this.f14409a.compareTo((ie3) other.f14409a);
        int iCompareTo2 = this.f14410b.compareTo((ie3) other.f14410b);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return m3329b(iCompareTo <= 0 ? this.f14409a : other.f14409a, iCompareTo2 >= 0 ? this.f14410b : other.f14410b);
        }
        return other;
    }

    public String toString() {
        return toString(this.f14409a, this.f14410b);
    }

    public hc1 upperBoundType() {
        return this.f14410b.mo12926m();
    }

    public C upperEndpoint() {
        return (C) this.f14410b.mo12921h();
    }

    private static String toString(ie3<?> lowerBound, ie3<?> upperBound) {
        StringBuilder sb = new StringBuilder(16);
        lowerBound.mo12919f(sb);
        sb.append("..");
        upperBound.mo12920g(sb);
        return sb.toString();
    }

    @Override // p000.l8d
    @Deprecated
    public boolean apply(C input) {
        return contains(input);
    }
}
