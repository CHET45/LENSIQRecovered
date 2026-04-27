package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p000.kx7;
import p000.mvf;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public final class cy7<C extends Comparable> extends AbstractC14889x3<C> implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final cy7<Comparable<?>> f28028c = new cy7<>(kx7.m15110of());

    /* JADX INFO: renamed from: d */
    public static final cy7<Comparable<?>> f28029d = new cy7<>(kx7.m15111of(bpd.all()));

    /* JADX INFO: renamed from: a */
    public final transient kx7<bpd<C>> f28030a;

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient cy7<C> f28031b;

    /* JADX INFO: renamed from: cy7$a */
    public class C4560a extends kx7<bpd<C>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28032c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f28033d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bpd f28034e;

        public C4560a(final int val$length, final int val$fromIndex, final bpd val$range) {
            this.f28032c = val$length;
            this.f28033d = val$fromIndex;
            this.f28034e = val$range;
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28032c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public bpd<C> get(int index) {
            v7d.checkElementIndex(index, this.f28032c);
            return (index == 0 || index == this.f28032c + (-1)) ? ((bpd) cy7.this.f28030a.get(index + this.f28033d)).intersection(this.f28034e) : (bpd) cy7.this.f28030a.get(index + this.f28033d);
        }
    }

    /* JADX INFO: renamed from: cy7$b */
    public final class C4561b extends py7<C> {

        /* JADX INFO: renamed from: C */
        public final ke4<C> f28036C;

        /* JADX INFO: renamed from: F */
        @wx1
        @ez8
        public transient Integer f28037F;

        /* JADX INFO: renamed from: cy7$b$a */
        public class a extends AbstractC0012a2<C> {

            /* JADX INFO: renamed from: c */
            public final Iterator<bpd<C>> f28039c;

            /* JADX INFO: renamed from: d */
            public Iterator<C> f28040d = wg8.m24511e();

            public a() {
                this.f28039c = cy7.this.f28030a.iterator();
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C computeNext() {
                while (!this.f28040d.hasNext()) {
                    if (!this.f28039c.hasNext()) {
                        return (C) m25a();
                    }
                    this.f28040d = yy2.create(this.f28039c.next(), C4561b.this.f28036C).iterator();
                }
                return this.f28040d.next();
            }
        }

        /* JADX INFO: renamed from: cy7$b$b */
        public class b extends AbstractC0012a2<C> {

            /* JADX INFO: renamed from: c */
            public final Iterator<bpd<C>> f28042c;

            /* JADX INFO: renamed from: d */
            public Iterator<C> f28043d = wg8.m24511e();

            public b() {
                this.f28042c = cy7.this.f28030a.reverse().iterator();
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C computeNext() {
                while (!this.f28043d.hasNext()) {
                    if (!this.f28042c.hasNext()) {
                        return (C) m25a();
                    }
                    this.f28043d = yy2.create(this.f28042c.next(), C4561b.this.f28036C).descendingIterator();
                }
                return this.f28043d.next();
            }
        }

        public C4561b(ke4<C> domain) {
            super(s7c.natural());
            this.f28036C = domain;
        }

        @yg8
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object o) {
            if (o == null) {
                return false;
            }
            try {
                return cy7.this.contains((Comparable) o);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.py7
        public int indexOf(@wx1 Object target) {
            if (!contains(target)) {
                return -1;
            }
            Objects.requireNonNull(target);
            Comparable comparable = (Comparable) target;
            quh it = cy7.this.f28030a.iterator();
            long size = 0;
            while (it.hasNext()) {
                bpd bpdVar = (bpd) it.next();
                if (bpdVar.contains(comparable)) {
                    return rd8.saturatedCast(size + ((long) yy2.create(bpdVar, this.f28036C).indexOf(comparable)));
                }
                size += (long) yy2.create(bpdVar, this.f28036C).size();
            }
            throw new AssertionError("impossible");
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return cy7.this.f28030a.isPartialView();
        }

        @Override // p000.py7
        /* JADX INFO: renamed from: k */
        public py7<C> mo8784k() {
            return new e74(this);
        }

        @Override // p000.py7
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public py7<C> mo8785m(C toElement, boolean inclusive) {
            return m8789t(bpd.upTo(toElement, hc1.m12308a(inclusive)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.f28037F;
            if (numValueOf == null) {
                quh it = cy7.this.f28030a.iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += (long) yy2.create((bpd) it.next(), this.f28036C).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(rd8.saturatedCast(size));
                this.f28037F = numValueOf;
            }
            return numValueOf.intValue();
        }

        /* JADX INFO: renamed from: t */
        public py7<C> m8789t(bpd<C> range) {
            return cy7.this.subRangeSet((bpd) range).asSet(this.f28036C);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return cy7.this.f28030a.toString();
        }

        @Override // p000.py7
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public py7<C> mo8786n(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
            return (fromInclusive || toInclusive || bpd.m3328a(fromElement, toElement) != 0) ? m8789t(bpd.range(fromElement, hc1.m12308a(fromInclusive), toElement, hc1.m12308a(toInclusive))) : py7.m19840of();
        }

        @Override // p000.py7
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public py7<C> mo8787o(C fromElement, boolean inclusive) {
            return m8789t(bpd.downTo(fromElement, hc1.m12308a(inclusive)));
        }

        @Override // p000.py7, p000.dy7, p000.ax7
        @yg8
        public Object writeReplace() {
            return new C4562c(cy7.this.f28030a, this.f28036C);
        }

        @Override // p000.py7, java.util.NavigableSet
        @jd7("NavigableSet")
        public quh<C> descendingIterator() {
            return new b();
        }

        @Override // p000.py7, p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public quh<C> iterator() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: cy7$c */
    public static class C4562c<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final kx7<bpd<C>> f28045a;

        /* JADX INFO: renamed from: b */
        public final ke4<C> f28046b;

        public C4562c(kx7<bpd<C>> ranges, ke4<C> domain) {
            this.f28045a = ranges;
            this.f28046b = domain;
        }

        public Object readResolve() {
            return new cy7(this.f28045a).asSet(this.f28046b);
        }
    }

    /* JADX INFO: renamed from: cy7$d */
    public static class C4563d<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a */
        public final List<bpd<C>> f28047a = eb9.newArrayList();

        @op1
        /* JADX INFO: renamed from: a */
        public C4563d<C> m8794a(C4563d<C> builder) {
            addAll(builder.f28047a);
            return this;
        }

        @op1
        public C4563d<C> add(bpd<C> range) {
            v7d.checkArgument(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.f28047a.add(range);
            return this;
        }

        @op1
        public C4563d<C> addAll(gpd<C> ranges) {
            return addAll(ranges.asRanges());
        }

        public cy7<C> build() {
            kx7.C8541a c8541a = new kx7.C8541a(this.f28047a.size());
            Collections.sort(this.f28047a, bpd.m3331d());
            gmc gmcVarPeekingIterator = wg8.peekingIterator(this.f28047a.iterator());
            while (gmcVarPeekingIterator.hasNext()) {
                bpd bpdVarSpan = (bpd) gmcVarPeekingIterator.next();
                while (gmcVarPeekingIterator.hasNext()) {
                    bpd<C> bpdVar = (bpd) gmcVarPeekingIterator.peek();
                    if (bpdVarSpan.isConnected(bpdVar)) {
                        v7d.checkArgument(bpdVarSpan.intersection(bpdVar).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", bpdVarSpan, bpdVar);
                        bpdVarSpan = bpdVarSpan.span((bpd) gmcVarPeekingIterator.next());
                    }
                }
                c8541a.add(bpdVarSpan);
            }
            kx7 kx7VarBuild = c8541a.build();
            return kx7VarBuild.isEmpty() ? cy7.m8780of() : (kx7VarBuild.size() == 1 && ((bpd) vg8.getOnlyElement(kx7VarBuild)).equals(bpd.all())) ? cy7.m8779b() : new cy7<>(kx7VarBuild);
        }

        @op1
        public C4563d<C> addAll(Iterable<bpd<C>> ranges) {
            Iterator<bpd<C>> it = ranges.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: cy7$e */
    public final class C4564e extends kx7<bpd<C>> {

        /* JADX INFO: renamed from: c */
        public final boolean f28048c;

        /* JADX INFO: renamed from: d */
        public final boolean f28049d;

        /* JADX INFO: renamed from: e */
        public final int f28050e;

        /* JADX WARN: Multi-variable type inference failed */
        public C4564e() {
            boolean zHasLowerBound = ((bpd) cy7.this.f28030a.get(0)).hasLowerBound();
            this.f28048c = zHasLowerBound;
            boolean zHasUpperBound = ((bpd) vg8.getLast(cy7.this.f28030a)).hasUpperBound();
            this.f28049d = zHasUpperBound;
            int size = cy7.this.f28030a.size();
            size = zHasLowerBound ? size : size - 1;
            this.f28050e = zHasUpperBound ? size + 1 : size;
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28050e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public bpd<C> get(int i) {
            v7d.checkElementIndex(i, this.f28050e);
            return bpd.m3329b(this.f28048c ? i == 0 ? ie3.m12916c() : ((bpd) cy7.this.f28030a.get(i - 1)).f14410b : ((bpd) cy7.this.f28030a.get(i)).f14410b, (this.f28049d && i == this.f28050e + (-1)) ? ie3.m12914a() : ((bpd) cy7.this.f28030a.get(i + (!this.f28048c ? 1 : 0))).f14409a);
        }
    }

    /* JADX INFO: renamed from: cy7$f */
    public static final class C4565f<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final kx7<bpd<C>> f28052a;

        public C4565f(kx7<bpd<C>> ranges) {
            this.f28052a = ranges;
        }

        public Object readResolve() {
            return this.f28052a.isEmpty() ? cy7.m8780of() : this.f28052a.equals(kx7.m15111of(bpd.all())) ? cy7.m8779b() : new cy7(this.f28052a);
        }
    }

    public cy7(kx7<bpd<C>> ranges) {
        this.f28030a = ranges;
    }

    /* JADX INFO: renamed from: b */
    public static <C extends Comparable> cy7<C> m8779b() {
        return f28029d;
    }

    public static <C extends Comparable<?>> C4563d<C> builder() {
        return new C4563d<>();
    }

    public static <C extends Comparable> cy7<C> copyOf(gpd<C> rangeSet) {
        v7d.checkNotNull(rangeSet);
        if (rangeSet.isEmpty()) {
            return m8780of();
        }
        if (rangeSet.encloses(bpd.all())) {
            return m8779b();
        }
        if (rangeSet instanceof cy7) {
            cy7<C> cy7Var = (cy7) rangeSet;
            if (!cy7Var.m8782c()) {
                return cy7Var;
            }
        }
        return new cy7<>(kx7.copyOf((Collection) rangeSet.asRanges()));
    }

    private kx7<bpd<C>> intersectRanges(final bpd<C> range) {
        if (this.f28030a.isEmpty() || range.isEmpty()) {
            return kx7.m15110of();
        }
        if (range.encloses(span())) {
            return this.f28030a;
        }
        int iBinarySearch = range.hasLowerBound() ? mvf.binarySearch(this.f28030a, (lz6<? super E, ie3<C>>) bpd.m3332e(), range.f14409a, mvf.EnumC9554c.f62402d, mvf.EnumC9553b.f62396b) : 0;
        int iBinarySearch2 = (range.hasUpperBound() ? mvf.binarySearch(this.f28030a, (lz6<? super E, ie3<C>>) bpd.m3330c(), range.f14410b, mvf.EnumC9554c.f62401c, mvf.EnumC9553b.f62396b) : this.f28030a.size()) - iBinarySearch;
        return iBinarySearch2 == 0 ? kx7.m15110of() : new C4560a(iBinarySearch2, iBinarySearch, range);
    }

    /* JADX INFO: renamed from: of */
    public static <C extends Comparable> cy7<C> m8780of() {
        return f28028c;
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <C extends Comparable<?>> cy7<C> unionOf(Iterable<bpd<C>> ranges) {
        return copyOf(gih.create(ranges));
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void add(bpd<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(gpd<C> other) {
        throw new UnsupportedOperationException();
    }

    public py7<C> asSet(ke4<C> domain) {
        v7d.checkNotNull(domain);
        if (isEmpty()) {
            return py7.m19840of();
        }
        bpd<C> bpdVarCanonical = span().canonical(domain);
        if (!bpdVarCanonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!bpdVarCanonical.hasUpperBound()) {
            try {
                domain.maxValue();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new C4561b(domain);
    }

    /* JADX INFO: renamed from: c */
    public boolean m8782c() {
        return this.f28030a.isPartialView();
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return super.contains(value);
    }

    public cy7<C> difference(gpd<C> other) {
        gih gihVarCreate = gih.create(this);
        gihVarCreate.removeAll(other);
        return copyOf(gihVarCreate);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public boolean encloses(bpd<C> otherRange) {
        int iBinarySearch = mvf.binarySearch(this.f28030a, bpd.m3330c(), otherRange.f14409a, s7c.natural(), mvf.EnumC9554c.f62399a, mvf.EnumC9553b.f62395a);
        return iBinarySearch != -1 && this.f28030a.get(iBinarySearch).encloses(otherRange);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean enclosesAll(gpd other) {
        return super.enclosesAll(other);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object obj) {
        return super.equals(obj);
    }

    public cy7<C> intersection(gpd<C> other) {
        gih gihVarCreate = gih.create(this);
        gihVarCreate.removeAll(other.complement());
        return copyOf(gihVarCreate);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public boolean intersects(bpd<C> otherRange) {
        int iBinarySearch = mvf.binarySearch(this.f28030a, bpd.m3330c(), otherRange.f14409a, s7c.natural(), mvf.EnumC9554c.f62399a, mvf.EnumC9553b.f62396b);
        if (iBinarySearch < this.f28030a.size() && this.f28030a.get(iBinarySearch).isConnected(otherRange) && !this.f28030a.get(iBinarySearch).intersection(otherRange).isEmpty()) {
            return true;
        }
        if (iBinarySearch > 0) {
            int i = iBinarySearch - 1;
            if (this.f28030a.get(i).isConnected(otherRange) && !this.f28030a.get(i).intersection(otherRange).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public boolean isEmpty() {
        return this.f28030a.isEmpty();
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    @wx1
    public bpd<C> rangeContaining(C value) {
        int iBinarySearch = mvf.binarySearch(this.f28030a, bpd.m3330c(), ie3.m12917d(value), s7c.natural(), mvf.EnumC9554c.f62399a, mvf.EnumC9553b.f62395a);
        if (iBinarySearch == -1) {
            return null;
        }
        bpd<C> bpdVar = this.f28030a.get(iBinarySearch);
        if (bpdVar.contains(value)) {
            return bpdVar;
        }
        return null;
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void remove(bpd<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(gpd<C> other) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.gpd
    public bpd<C> span() {
        if (this.f28030a.isEmpty()) {
            throw new NoSuchElementException();
        }
        return bpd.m3329b(this.f28030a.get(0).f14409a, this.f28030a.get(r1.size() - 1).f14410b);
    }

    public cy7<C> union(gpd<C> other) {
        return unionOf(vg8.concat(asRanges(), other.asRanges()));
    }

    @yg8
    public Object writeReplace() {
        return new C4565f(this.f28030a);
    }

    /* JADX INFO: renamed from: of */
    public static <C extends Comparable> cy7<C> m8781of(bpd<C> range) {
        v7d.checkNotNull(range);
        return range.isEmpty() ? m8780of() : range.equals(bpd.all()) ? m8779b() : new cy7<>(kx7.m15111of(range));
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(Iterable<bpd<C>> other) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.gpd
    public dy7<bpd<C>> asDescendingSetOfRanges() {
        return this.f28030a.isEmpty() ? dy7.m9575of() : new qxd(this.f28030a.reverse(), bpd.m3331d().reverse());
    }

    @Override // p000.gpd
    public dy7<bpd<C>> asRanges() {
        return this.f28030a.isEmpty() ? dy7.m9575of() : new qxd(this.f28030a, bpd.m3331d());
    }

    @Override // p000.gpd
    public cy7<C> complement() {
        cy7<C> cy7Var = this.f28031b;
        if (cy7Var != null) {
            return cy7Var;
        }
        if (this.f28030a.isEmpty()) {
            cy7<C> cy7VarM8779b = m8779b();
            this.f28031b = cy7VarM8779b;
            return cy7VarM8779b;
        }
        if (this.f28030a.size() == 1 && this.f28030a.get(0).equals(bpd.all())) {
            cy7<C> cy7VarM8780of = m8780of();
            this.f28031b = cy7VarM8780of;
            return cy7VarM8780of;
        }
        cy7<C> cy7Var2 = new cy7<>(new C4564e(), this);
        this.f28031b = cy7Var2;
        return cy7Var2;
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable ranges) {
        return super.enclosesAll(ranges);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(Iterable<bpd<C>> other) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.gpd
    public cy7<C> subRangeSet(bpd<C> range) {
        if (!isEmpty()) {
            bpd<C> bpdVarSpan = span();
            if (range.encloses(bpdVarSpan)) {
                return this;
            }
            if (range.isConnected(bpdVarSpan)) {
                return new cy7<>(intersectRanges(range));
            }
        }
        return m8780of();
    }

    private cy7(kx7<bpd<C>> ranges, cy7<C> complement) {
        this.f28030a = ranges;
        this.f28031b = complement;
    }

    public static <C extends Comparable<?>> cy7<C> copyOf(Iterable<bpd<C>> ranges) {
        return new C4563d().addAll(ranges).build();
    }
}
