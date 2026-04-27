package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class ixd<C extends Comparable> extends yy2<C> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: F */
    public final bpd<C> f48827F;

    /* JADX INFO: renamed from: ixd$a */
    public class C7658a extends AbstractC5586f4<C> {

        /* JADX INFO: renamed from: b */
        public final C f48828b;

        public C7658a(Comparable comparable) {
            super(comparable);
            this.f48828b = (C) ixd.this.last();
        }

        @Override // p000.AbstractC5586f4
        @wx1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C mo10501a(C c) {
            if (ixd.equalsOrThrow(c, this.f48828b)) {
                return null;
            }
            return (C) ixd.this.f103301C.next(c);
        }
    }

    /* JADX INFO: renamed from: ixd$b */
    public class C7659b extends AbstractC5586f4<C> {

        /* JADX INFO: renamed from: b */
        public final C f48830b;

        public C7659b(Comparable comparable) {
            super(comparable);
            this.f48830b = (C) ixd.this.first();
        }

        @Override // p000.AbstractC5586f4
        @wx1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C mo10501a(C c) {
            if (ixd.equalsOrThrow(c, this.f48830b)) {
                return null;
            }
            return (C) ixd.this.f103301C.previous(c);
        }
    }

    /* JADX INFO: renamed from: ixd$c */
    public class C7660c extends ww7<C> {
        public C7660c() {
        }

        @Override // p000.ww7
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public py7<C> mo13535h() {
            return ixd.this;
        }

        @Override // java.util.List
        public C get(int i) {
            v7d.checkElementIndex(i, size());
            ixd ixdVar = ixd.this;
            return (C) ixdVar.f103301C.mo14670a(ixdVar.first(), i);
        }
    }

    /* JADX INFO: renamed from: ixd$d */
    @jd7
    @yg8
    public static final class C7661d<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final bpd<C> f48833a;

        /* JADX INFO: renamed from: b */
        public final ke4<C> f48834b;

        public /* synthetic */ C7661d(bpd bpdVar, ke4 ke4Var, C7658a c7658a) {
            this(bpdVar, ke4Var);
        }

        private Object readResolve() {
            return new ixd(this.f48833a, this.f48834b);
        }

        private C7661d(bpd<C> range, ke4<C> domain) {
            this.f48833a = range;
            this.f48834b = domain;
        }
    }

    public ixd(bpd<C> range, ke4<C> domain) {
        super(domain);
        this.f48827F = range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsOrThrow(Comparable<?> left, @wx1 Comparable<?> right) {
        return right != null && bpd.m3328a(left, right) == 0;
    }

    private yy2<C> intersectionInCurrentDomain(bpd<C> other) {
        return this.f48827F.isConnected(other) ? yy2.create(this.f48827F.intersection(other), this.f103301C) : new zz4(this.f103301C);
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        if (object == null) {
            return false;
        }
        try {
            return this.f48827F.contains((Comparable) object);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> targets) {
        return h82.m12261b(this, targets);
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ixd) {
            ixd ixdVar = (ixd) object;
            if (this.f103301C.equals(ixdVar.f103301C)) {
                return first().equals(ixdVar.first()) && last().equals(ixdVar.last());
            }
        }
        return super.equals(object);
    }

    @Override // p000.dy7
    /* JADX INFO: renamed from: h */
    public kx7<C> mo9582h() {
        return this.f103301C.f53700a ? new C7660c() : super.mo9582h();
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public int hashCode() {
        return t6f.m22397b(this);
    }

    @Override // p000.py7
    @jd7
    public int indexOf(@wx1 Object target) {
        if (!contains(target)) {
            return -1;
        }
        ke4<C> ke4Var = this.f103301C;
        Comparable comparableFirst = first();
        Objects.requireNonNull(target);
        return (int) ke4Var.distance(comparableFirst, (Comparable) target);
    }

    @Override // p000.yy2
    public yy2<C> intersection(yy2<C> other) {
        v7d.checkNotNull(other);
        v7d.checkArgument(this.f103301C.equals(other.f103301C));
        if (other.isEmpty()) {
            return other;
        }
        Comparable comparable = (Comparable) s7c.natural().max(first(), other.first());
        Comparable comparable2 = (Comparable) s7c.natural().min(last(), other.last());
        return comparable.compareTo(comparable2) <= 0 ? yy2.create(bpd.closed(comparable, comparable2), this.f103301C) : new zz4(this.f103301C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return false;
    }

    @Override // p000.yy2, p000.py7
    /* JADX INFO: renamed from: r */
    public yy2<C> mo8785m(C toElement, boolean inclusive) {
        return intersectionInCurrentDomain(bpd.upTo(toElement, hc1.m12308a(inclusive)));
    }

    @Override // p000.yy2
    public bpd<C> range() {
        hc1 hc1Var = hc1.CLOSED;
        return range(hc1Var, hc1Var);
    }

    @Override // p000.yy2, p000.py7
    /* JADX INFO: renamed from: s */
    public yy2<C> mo8786n(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        return (fromElement.compareTo(toElement) != 0 || fromInclusive || toInclusive) ? intersectionInCurrentDomain(bpd.range(fromElement, hc1.m12308a(fromInclusive), toElement, hc1.m12308a(toInclusive))) : new zz4(this.f103301C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.f103301C.distance(first(), last());
        if (jDistance >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jDistance) + 1;
    }

    @Override // p000.yy2, p000.py7
    /* JADX INFO: renamed from: t */
    public yy2<C> mo8787o(C fromElement, boolean inclusive) {
        return intersectionInCurrentDomain(bpd.downTo(fromElement, hc1.m12308a(inclusive)));
    }

    @Override // p000.py7, p000.dy7, p000.ax7
    @jd7
    @yg8
    public Object writeReplace() {
        return new C7661d(this.f48827F, this.f103301C, null);
    }

    @Override // p000.py7, java.util.NavigableSet
    @jd7
    public quh<C> descendingIterator() {
        return new C7659b(last());
    }

    @Override // p000.py7, java.util.SortedSet
    public C first() {
        Comparable comparableMo12924k = this.f48827F.f14409a.mo12924k(this.f103301C);
        Objects.requireNonNull(comparableMo12924k);
        return (C) comparableMo12924k;
    }

    @Override // p000.py7, p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<C> iterator() {
        return new C7658a(first());
    }

    @Override // p000.py7, java.util.SortedSet
    public C last() {
        Comparable comparableMo12922i = this.f48827F.f14410b.mo12922i(this.f103301C);
        Objects.requireNonNull(comparableMo12922i);
        return (C) comparableMo12922i;
    }

    @Override // p000.yy2
    public bpd<C> range(hc1 lowerBoundType, hc1 upperBoundType) {
        return bpd.m3329b(this.f48827F.f14409a.mo12927n(lowerBoundType, this.f103301C), this.f48827F.f14410b.mo12928o(upperBoundType, this.f103301C));
    }
}
