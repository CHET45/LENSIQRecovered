package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p000.dy7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public abstract class py7<E> extends ry7<E> implements NavigableSet<E>, kvf<E> {

    /* JADX INFO: renamed from: f */
    public final transient Comparator<? super E> f72495f;

    /* JADX INFO: renamed from: m */
    @wx1
    @ez8
    @jd7
    public transient py7<E> f72496m;

    /* JADX INFO: renamed from: py7$b */
    @yg8
    public static class C11184b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Comparator<? super E> f72498a;

        /* JADX INFO: renamed from: b */
        public final Object[] f72499b;

        public C11184b(Comparator<? super E> comparator, Object[] elements) {
            this.f72498a = comparator;
            this.f72499b = elements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            return new C11183a(this.f72498a).add(this.f72499b).build();
        }
    }

    public py7(Comparator<? super E> comparator) {
        this.f72495f = comparator;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lpy7<TE;>; */
    public static py7 copyOf(Comparable[] elements) {
        return m19838j(s7c.natural(), elements.length, (Comparable[]) elements.clone());
    }

    public static <E> py7<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparator = lvf.comparator(sortedSet);
        kx7 kx7VarCopyOf = kx7.copyOf((Collection) sortedSet);
        return kx7VarCopyOf.isEmpty() ? m19839l(comparator) : new qxd(kx7VarCopyOf, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static <E> py7<E> m19838j(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return m19839l(comparator);
        }
        pjb.m19533c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            InterfaceC0000a interfaceC0000a = (Object) eArr[i3];
            if (comparator.compare(interfaceC0000a, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = interfaceC0000a;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new qxd(kx7.m15109f(eArr, i2), comparator);
    }

    /* JADX INFO: renamed from: l */
    public static <E> qxd<E> m19839l(Comparator<? super E> comparator) {
        return s7c.natural().equals(comparator) ? (qxd<E>) qxd.f76279F : new qxd<>(kx7.m15110of(), comparator);
    }

    public static <E extends Comparable<?>> C11183a<E> naturalOrder() {
        return new C11183a<>(s7c.natural());
    }

    /* JADX INFO: renamed from: of */
    public static <E> py7<E> m19840of() {
        return qxd.f76279F;
    }

    public static <E> C11183a<E> orderedBy(Comparator<E> comparator) {
        return new C11183a<>(comparator);
    }

    /* JADX INFO: renamed from: q */
    public static int m19847q(Comparator<?> comparator, Object a, @wx1 Object b) {
        return comparator.compare(a, b);
    }

    @yg8
    private void readObject(ObjectInputStream unused) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> C11183a<E> reverseOrder() {
        return new C11183a<>(Collections.reverseOrder());
    }

    @wx1
    public E ceiling(E e) {
        return (E) vg8.getFirst(tailSet((Object) e, true), null);
    }

    @Override // java.util.SortedSet, p000.kvf
    public Comparator<? super E> comparator() {
        return this.f72495f;
    }

    @Override // java.util.NavigableSet
    @jd7
    public abstract quh<E> descendingIterator();

    public E first() {
        return iterator().next();
    }

    @wx1
    public E floor(E e) {
        return (E) wg8.getNext(headSet((Object) e, true).descendingIterator(), null);
    }

    @wx1
    @jd7
    public E higher(E e) {
        return (E) vg8.getFirst(tailSet((Object) e, false), null);
    }

    public abstract int indexOf(@wx1 Object target);

    @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract quh<E> iterator();

    @jd7
    /* JADX INFO: renamed from: k */
    public abstract py7<E> mo8784k();

    public E last() {
        return descendingIterator().next();
    }

    @wx1
    @jd7
    public E lower(E e) {
        return (E) wg8.getNext(headSet((Object) e, false).descendingIterator(), null);
    }

    /* JADX INFO: renamed from: m */
    public abstract py7<E> mo8785m(E toElement, boolean inclusive);

    /* JADX INFO: renamed from: n */
    public abstract py7<E> mo8786n(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);

    /* JADX INFO: renamed from: o */
    public abstract py7<E> mo8787o(E fromElement, boolean inclusive);

    /* JADX INFO: renamed from: p */
    public int m19848p(Object a, @wx1 Object b) {
        return m19847q(this.f72495f, a, b);
    }

    @Override // java.util.NavigableSet
    @wx1
    @jd7
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @wx1
    @jd7
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.dy7, p000.ax7
    @yg8
    public Object writeReplace() {
        return new C11184b(this.f72495f, toArray());
    }

    /* JADX INFO: renamed from: py7$a */
    public static final class C11183a<E> extends dy7.C5007a<E> {

        /* JADX INFO: renamed from: g */
        public final Comparator<? super E> f72497g;

        public C11183a(Comparator<? super E> comparator) {
            this.f72497g = (Comparator) v7d.checkNotNull(comparator);
        }

        @Override // p000.dy7.C5007a
        @op1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C11183a<E> mo9584c(dy7.C5007a<E> builder) {
            super.mo9584c(builder);
            return this;
        }

        @Override // p000.dy7.C5007a, p000.ax7.AbstractC1637b
        public py7<E> build() {
            py7<E> py7VarM19838j = py7.m19838j(this.f72497g, this.f12101c, this.f12100b);
            this.f12101c = py7VarM19838j.size();
            this.f12102d = true;
            return py7VarM19838j;
        }

        @Override // p000.dy7.C5007a, p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C11183a<E> addAll(Iterable<? extends E> elements) {
            super.addAll((Iterable) elements);
            return this;
        }

        @Override // p000.dy7.C5007a, p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C11183a<E> add(E element) {
            super.add((Object) element);
            return this;
        }

        @Override // p000.dy7.C5007a, p000.ax7.AbstractC1637b
        @op1
        public C11183a<E> addAll(Iterator<? extends E> elements) {
            super.addAll((Iterator) elements);
            return this;
        }

        @Override // p000.dy7.C5007a, p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C11183a<E> add(E... elements) {
            super.add((Object[]) elements);
            return this;
        }
    }

    public static <E> py7<E> copyOf(Iterable<? extends E> elements) {
        return copyOf(s7c.natural(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lpy7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static py7 m19841of(Comparable element) {
        return new qxd(kx7.m15111of(element), s7c.natural());
    }

    @Override // java.util.NavigableSet
    @jd7
    public py7<E> descendingSet() {
        py7<E> py7Var = this.f72496m;
        if (py7Var != null) {
            return py7Var;
        }
        py7<E> py7VarMo8784k = mo8784k();
        this.f72496m = py7VarMo8784k;
        py7VarMo8784k.f72496m = this;
        return py7VarMo8784k;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lpy7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static py7 m19842of(Comparable e1, Comparable e2) {
        return m19838j(s7c.natural(), 2, e1, e2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public py7<E> headSet(E toElement) {
        return headSet((Object) toElement, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public py7<E> subSet(E fromElement, E toElement) {
        return subSet((Object) fromElement, true, (Object) toElement, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public py7<E> tailSet(E fromElement) {
        return tailSet((Object) fromElement, true);
    }

    public static <E> py7<E> copyOf(Collection<? extends E> elements) {
        return copyOf((Comparator) s7c.natural(), (Collection) elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lpy7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static py7 m19843of(Comparable e1, Comparable e2, Comparable e3) {
        return m19838j(s7c.natural(), 3, e1, e2, e3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public py7<E> headSet(E toElement, boolean inclusive) {
        return mo8785m(v7d.checkNotNull(toElement), inclusive);
    }

    @Override // java.util.NavigableSet
    @jd7
    public py7<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        v7d.checkNotNull(fromElement);
        v7d.checkNotNull(toElement);
        v7d.checkArgument(this.f72495f.compare(fromElement, toElement) <= 0);
        return mo8786n(fromElement, fromInclusive, toElement, toInclusive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public py7<E> tailSet(E fromElement, boolean inclusive) {
        return mo8787o(v7d.checkNotNull(fromElement), inclusive);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lpy7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static py7 m19844of(Comparable e1, Comparable e2, Comparable e3, Comparable e4) {
        return m19838j(s7c.natural(), 4, e1, e2, e3, e4);
    }

    public static <E> py7<E> copyOf(Iterator<? extends E> elements) {
        return copyOf(s7c.natural(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lpy7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static py7 m19845of(Comparable e1, Comparable e2, Comparable e3, Comparable e4, Comparable e5) {
        return m19838j(s7c.natural(), 5, e1, e2, e3, e4, e5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lpy7<TE;>; */
    /* JADX INFO: renamed from: of */
    public static py7 m19846of(Comparable e1, Comparable e2, Comparable e3, Comparable e4, Comparable e5, Comparable e6, Comparable... remaining) {
        int length = remaining.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e1;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(remaining, 0, comparableArr, 6, remaining.length);
        return m19838j(s7c.natural(), length, comparableArr);
    }

    public static <E> py7<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> elements) {
        return new C11183a(comparator).addAll((Iterator) elements).build();
    }

    public static <E> py7<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        v7d.checkNotNull(comparator);
        if (lvf.hasSameComparator(comparator, elements) && (elements instanceof py7)) {
            py7<E> py7Var = (py7) elements;
            if (!py7Var.isPartialView()) {
                return py7Var;
            }
        }
        Object[] objArrM23936b = vg8.m23936b(elements);
        return m19838j(comparator, objArrM23936b.length, objArrM23936b);
    }

    public static <E> py7<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> elements) {
        return copyOf((Comparator) comparator, (Iterable) elements);
    }
}
