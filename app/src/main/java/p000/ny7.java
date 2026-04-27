package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p000.d4b;
import p000.kx7;
import p000.vx7;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public abstract class ny7<E> extends oy7<E> implements ovf<E> {

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient ny7<E> f66038d;

    /* JADX INFO: renamed from: ny7$a */
    public static class C10116a<E> extends vx7.C14287b<E> {

        /* JADX INFO: renamed from: e */
        public final Comparator<? super E> f66039e;

        /* JADX INFO: renamed from: f */
        @gdi
        public E[] f66040f;

        /* JADX INFO: renamed from: g */
        public int[] f66041g;

        /* JADX INFO: renamed from: h */
        public int f66042h;

        /* JADX INFO: renamed from: i */
        public boolean f66043i;

        public C10116a(Comparator<? super E> comparator) {
            super(true);
            this.f66039e = (Comparator) v7d.checkNotNull(comparator);
            this.f66040f = (E[]) new Object[4];
            this.f66041g = new int[4];
        }

        private void dedupAndCoalesce(boolean z) {
            int i = this.f66042h;
            if (i == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f66040f, i);
            Arrays.sort(objArr, this.f66039e);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.f66039e.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.f66042h, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.f66042h;
                if (i4 > i5 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, w68.saturatedAdd(i5, (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.f66042h; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.f66040f[i6], this.f66039e);
                int i7 = this.f66041g[i6];
                if (i7 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
                } else {
                    iArr[iBinarySearch] = ~i7;
                }
            }
            this.f66040f = (E[]) objArr;
            this.f66041g = iArr;
            this.f66042h = i2;
        }

        private void dedupAndCoalesceAndDeleteEmpty() {
            dedupAndCoalesce(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.f66042h;
                if (i >= i3) {
                    Arrays.fill(this.f66040f, i2, i3, (Object) null);
                    Arrays.fill(this.f66041g, i2, this.f66042h, 0);
                    this.f66042h = i2;
                    return;
                }
                int[] iArr = this.f66041g;
                int i4 = iArr[i];
                if (i4 > 0) {
                    E[] eArr = this.f66040f;
                    eArr[i2] = eArr[i];
                    iArr[i2] = i4;
                    i2++;
                }
                i++;
            }
        }

        private void maintenance() {
            int i = this.f66042h;
            E[] eArr = this.f66040f;
            if (i == eArr.length) {
                dedupAndCoalesce(true);
            } else if (this.f66043i) {
                this.f66040f = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f66043i = false;
        }

        @Override // p000.vx7.C14287b
        @op1
        public C10116a<E> addCopies(E element, int occurrences) {
            v7d.checkNotNull(element);
            s72.m21765b(occurrences, "occurrences");
            if (occurrences == 0) {
                return this;
            }
            maintenance();
            E[] eArr = this.f66040f;
            int i = this.f66042h;
            eArr[i] = element;
            this.f66041g[i] = occurrences;
            this.f66042h = i + 1;
            return this;
        }

        @Override // p000.vx7.C14287b
        @op1
        public C10116a<E> setCount(E element, int count) {
            v7d.checkNotNull(element);
            s72.m21765b(count, "count");
            maintenance();
            E[] eArr = this.f66040f;
            int i = this.f66042h;
            eArr[i] = element;
            this.f66041g[i] = ~count;
            this.f66042h = i + 1;
            return this;
        }

        @Override // p000.vx7.C14287b, p000.ax7.AbstractC1637b
        public ny7<E> build() {
            dedupAndCoalesceAndDeleteEmpty();
            int i = this.f66042h;
            if (i == 0) {
                return ny7.m18203g(this.f66039e);
            }
            qxd qxdVar = (qxd) py7.m19838j(this.f66039e, i, this.f66040f);
            long[] jArr = new long[this.f66042h + 1];
            int i2 = 0;
            while (i2 < this.f66042h) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + ((long) this.f66041g[i2]);
                i2 = i3;
            }
            this.f66043i = true;
            return new pxd(qxdVar, jArr, 0, this.f66042h);
        }

        @Override // p000.vx7.C14287b, p000.ax7.AbstractC1637b
        @op1
        public C10116a<E> add(E element) {
            return addCopies((Object) element, 1);
        }

        @Override // p000.vx7.C14287b, p000.ax7.AbstractC1637b
        @op1
        public C10116a<E> addAll(Iterable<? extends E> elements) {
            if (elements instanceof d4b) {
                for (d4b.InterfaceC4612a<E> interfaceC4612a : ((d4b) elements).entrySet()) {
                    addCopies((Object) interfaceC4612a.getElement(), interfaceC4612a.getCount());
                }
            } else {
                Iterator<? extends E> it = elements.iterator();
                while (it.hasNext()) {
                    add((Object) it.next());
                }
            }
            return this;
        }

        @Override // p000.vx7.C14287b, p000.ax7.AbstractC1637b
        @op1
        public C10116a<E> add(E... elements) {
            for (E e : elements) {
                add((Object) e);
            }
            return this;
        }

        @Override // p000.vx7.C14287b, p000.ax7.AbstractC1637b
        @op1
        public C10116a<E> addAll(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                add((Object) elements.next());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: ny7$b */
    @yg8
    public static final class C10117b<E> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Comparator<? super E> f66044a;

        /* JADX INFO: renamed from: b */
        public final E[] f66045b;

        /* JADX INFO: renamed from: c */
        public final int[] f66046c;

        public C10117b(ovf<E> ovfVar) {
            this.f66044a = ovfVar.comparator();
            int size = ovfVar.entrySet().size();
            this.f66045b = (E[]) new Object[size];
            this.f66046c = new int[size];
            int i = 0;
            for (d4b.InterfaceC4612a<E> interfaceC4612a : ovfVar.entrySet()) {
                this.f66045b[i] = interfaceC4612a.getElement();
                this.f66046c[i] = interfaceC4612a.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int length = this.f66045b.length;
            C10116a c10116a = new C10116a(this.f66044a);
            for (int i = 0; i < length; i++) {
                c10116a.addCopies((Object) this.f66045b[i], this.f66046c[i]);
            }
            return c10116a.build();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lny7<TE;>; */
    public static ny7 copyOf(Comparable[] elements) {
        return copyOf(s7c.natural(), Arrays.asList(elements));
    }

    public static <E> ny7<E> copyOfSorted(ovf<E> sortedMultiset) {
        return copyOfSortedEntries(sortedMultiset.comparator(), eb9.newArrayList(sortedMultiset.entrySet()));
    }

    private static <E> ny7<E> copyOfSortedEntries(Comparator<? super E> comparator, Collection<d4b.InterfaceC4612a<E>> entries) {
        if (entries.isEmpty()) {
            return m18203g(comparator);
        }
        kx7.C8541a c8541a = new kx7.C8541a(entries.size());
        long[] jArr = new long[entries.size() + 1];
        int i = 0;
        for (d4b.InterfaceC4612a<E> interfaceC4612a : entries) {
            c8541a.add((Object) interfaceC4612a.getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + ((long) interfaceC4612a.getCount());
            i = i2;
        }
        return new pxd(new qxd(c8541a.build(), comparator), jArr, 0, entries.size());
    }

    /* JADX INFO: renamed from: g */
    public static <E> ny7<E> m18203g(Comparator<? super E> comparator) {
        return s7c.natural().equals(comparator) ? (ny7<E>) pxd.f72466H : new pxd(comparator);
    }

    public static <E extends Comparable<?>> C10116a<E> naturalOrder() {
        return new C10116a<>(s7c.natural());
    }

    /* JADX INFO: renamed from: of */
    public static <E> ny7<E> m18204of() {
        return (ny7<E>) pxd.f72466H;
    }

    public static <E> C10116a<E> orderedBy(Comparator<E> comparator) {
        return new C10116a<>(comparator);
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> C10116a<E> reverseOrder() {
        return new C10116a<>(s7c.natural().reverse());
    }

    @Override // p000.ovf, p000.kvf
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // p000.vx7, p000.d4b
    public abstract py7<E> elementSet();

    public abstract ny7<E> headMultiset(E upperBound, hc1 boundType);

    @Override // p000.ovf
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final d4b.InterfaceC4612a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ovf
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final d4b.InterfaceC4612a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public abstract ny7<E> tailMultiset(E lowerBound, hc1 boundType);

    @Override // p000.vx7, p000.ax7
    @yg8
    public Object writeReplace() {
        return new C10117b(this);
    }

    public static <E> ny7<E> copyOf(Iterable<? extends E> elements) {
        return copyOf(s7c.natural(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lny7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ny7 m18205of(Comparable element) {
        return new pxd((qxd) py7.m19841of(element), new long[]{0, 1}, 0, 1);
    }

    public ny7<E> descendingMultiset() {
        ny7<E> ny7VarM18203g = this.f66038d;
        if (ny7VarM18203g == null) {
            ny7VarM18203g = isEmpty() ? m18203g(s7c.from(comparator()).reverse()) : new d74<>(this);
            this.f66038d = ny7VarM18203g;
        }
        return ny7VarM18203g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ovf
    public ny7<E> subMultiset(E lowerBound, hc1 lowerBoundType, E upperBound, hc1 upperBoundType) {
        v7d.checkArgument(comparator().compare(lowerBound, upperBound) <= 0, "Expected lowerBound <= upperBound but %s > %s", lowerBound, upperBound);
        return tailMultiset((Object) lowerBound, lowerBoundType).headMultiset((Object) upperBound, upperBoundType);
    }

    public static <E> ny7<E> copyOf(Iterator<? extends E> elements) {
        return copyOf(s7c.natural(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lny7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ny7 m18206of(Comparable e1, Comparable e2) {
        return copyOf(s7c.natural(), Arrays.asList(e1, e2));
    }

    public static <E> ny7<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> elements) {
        v7d.checkNotNull(comparator);
        return new C10116a(comparator).addAll((Iterator) elements).build();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lny7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ny7 m18207of(Comparable e1, Comparable e2, Comparable e3) {
        return copyOf(s7c.natural(), Arrays.asList(e1, e2, e3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lny7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ny7 m18208of(Comparable e1, Comparable e2, Comparable e3, Comparable e4) {
        return copyOf(s7c.natural(), Arrays.asList(e1, e2, e3, e4));
    }

    public static <E> ny7<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        if (elements instanceof ny7) {
            ny7<E> ny7Var = (ny7) elements;
            if (comparator.equals(ny7Var.comparator())) {
                return ny7Var.isPartialView() ? copyOfSortedEntries(comparator, ny7Var.entrySet().asList()) : ny7Var;
            }
        }
        return new C10116a(comparator).addAll((Iterable) elements).build();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lny7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ny7 m18209of(Comparable e1, Comparable e2, Comparable e3, Comparable e4, Comparable e5) {
        return copyOf(s7c.natural(), Arrays.asList(e1, e2, e3, e4, e5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lny7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static ny7 m18210of(Comparable e1, Comparable e2, Comparable e3, Comparable e4, Comparable e5, Comparable e6, Comparable... remaining) {
        ArrayList arrayListNewArrayListWithCapacity = eb9.newArrayListWithCapacity(remaining.length + 6);
        Collections.addAll(arrayListNewArrayListWithCapacity, e1, e2, e3, e4, e5, e6);
        Collections.addAll(arrayListNewArrayListWithCapacity, remaining);
        return copyOf(s7c.natural(), arrayListNewArrayListWithCapacity);
    }
}
