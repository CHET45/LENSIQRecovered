package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.ax7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public abstract class kx7<E> extends ax7<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final tuh<Object> f55554b = new C8542b(lxd.f59164e, 0);

    /* JADX INFO: renamed from: kx7$a */
    public static final class C8541a<E> extends ax7.AbstractC1636a<E> {
        public C8541a() {
            this(4);
        }

        @op1
        /* JADX INFO: renamed from: c */
        public C8541a<E> m15124c(C8541a<E> other) {
            m2722b(other.f12100b, other.f12101c);
            return this;
        }

        public C8541a(int capacity) {
            super(capacity);
        }

        @Override // p000.ax7.AbstractC1637b
        public kx7<E> build() {
            this.f12102d = true;
            return kx7.m15109f(this.f12100b, this.f12101c);
        }

        @Override // p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C8541a<E> addAll(Iterable<? extends E> elements) {
            super.addAll((Iterable) elements);
            return this;
        }

        @Override // p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C8541a<E> add(E element) {
            super.add((Object) element);
            return this;
        }

        @Override // p000.ax7.AbstractC1637b
        @op1
        public C8541a<E> addAll(Iterator<? extends E> elements) {
            super.addAll((Iterator) elements);
            return this;
        }

        @Override // p000.ax7.AbstractC1636a, p000.ax7.AbstractC1637b
        @op1
        public C8541a<E> add(E... elements) {
            super.add((Object[]) elements);
            return this;
        }
    }

    /* JADX INFO: renamed from: kx7$b */
    public static class C8542b<E> extends AbstractC14867x1<E> {

        /* JADX INFO: renamed from: c */
        public final kx7<E> f55555c;

        public C8542b(kx7<E> list, int index) {
            super(list.size(), index);
            this.f55555c = list;
        }

        @Override // p000.AbstractC14867x1
        public E get(int index) {
            return this.f55555c.get(index);
        }
    }

    /* JADX INFO: renamed from: kx7$c */
    public static class C8543c<E> extends kx7<E> {

        /* JADX INFO: renamed from: c */
        public final transient kx7<E> f55556c;

        public C8543c(kx7<E> backingList) {
            this.f55556c = backingList;
        }

        private int reverseIndex(int index) {
            return (size() - 1) - index;
        }

        private int reversePosition(int index) {
            return size() - index;
        }

        @Override // p000.kx7, p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            return this.f55556c.contains(object);
        }

        @Override // java.util.List
        public E get(int index) {
            v7d.checkElementIndex(index, size());
            return this.f55556c.get(reverseIndex(index));
        }

        @Override // p000.kx7, java.util.List
        public int indexOf(@wx1 Object object) {
            int iLastIndexOf = this.f55556c.lastIndexOf(object);
            if (iLastIndexOf >= 0) {
                return reverseIndex(iLastIndexOf);
            }
            return -1;
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return this.f55556c.isPartialView();
        }

        @Override // p000.kx7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p000.kx7, java.util.List
        public int lastIndexOf(@wx1 Object object) {
            int iIndexOf = this.f55556c.indexOf(object);
            if (iIndexOf >= 0) {
                return reverseIndex(iIndexOf);
            }
            return -1;
        }

        @Override // p000.kx7, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // p000.kx7
        public kx7<E> reverse() {
            return this.f55556c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55556c.size();
        }

        @Override // p000.kx7, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }

        @Override // p000.kx7, java.util.List
        public kx7<E> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            return this.f55556c.subList(reversePosition(toIndex), reversePosition(fromIndex)).reverse();
        }
    }

    /* JADX INFO: renamed from: kx7$d */
    @yg8
    public static class C8544d implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Object[] f55557a;

        public C8544d(Object[] elements) {
            this.f55557a = elements;
        }

        public Object readResolve() {
            return kx7.copyOf(this.f55557a);
        }
    }

    /* JADX INFO: renamed from: kx7$e */
    public class C8545e extends kx7<E> {

        /* JADX INFO: renamed from: c */
        public final transient int f55558c;

        /* JADX INFO: renamed from: d */
        public final transient int f55559d;

        public C8545e(int offset, int length) {
            this.f55558c = offset;
            this.f55559d = length;
        }

        @Override // p000.ax7
        @wx1
        /* JADX INFO: renamed from: b */
        public Object[] mo2719b() {
            return kx7.this.mo2719b();
        }

        @Override // p000.ax7
        /* JADX INFO: renamed from: c */
        public int mo2720c() {
            return kx7.this.mo2721d() + this.f55558c + this.f55559d;
        }

        @Override // p000.ax7
        /* JADX INFO: renamed from: d */
        public int mo2721d() {
            return kx7.this.mo2721d() + this.f55558c;
        }

        @Override // java.util.List
        public E get(int index) {
            v7d.checkElementIndex(index, this.f55559d);
            return kx7.this.get(index + this.f55558c);
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // p000.kx7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p000.kx7, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55559d;
        }

        @Override // p000.kx7, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }

        @Override // p000.kx7, java.util.List
        public kx7<E> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, this.f55559d);
            kx7 kx7Var = kx7.this;
            int i = this.f55558c;
            return kx7Var.subList(fromIndex + i, toIndex + i);
        }
    }

    public static <E> C8541a<E> builder() {
        return new C8541a<>();
    }

    public static <E> C8541a<E> builderWithExpectedSize(int expectedSize) {
        s72.m21765b(expectedSize, "expectedSize");
        return new C8541a<>(expectedSize);
    }

    private static <E> kx7<E> construct(Object... elements) {
        return m15108e(pjb.m19532b(elements));
    }

    public static <E> kx7<E> copyOf(Iterable<? extends E> elements) {
        v7d.checkNotNull(elements);
        return elements instanceof Collection ? copyOf((Collection) elements) : copyOf(elements.iterator());
    }

    /* JADX INFO: renamed from: e */
    public static <E> kx7<E> m15108e(Object[] elements) {
        return m15109f(elements, elements.length);
    }

    /* JADX INFO: renamed from: f */
    public static <E> kx7<E> m15109f(Object[] elements, int length) {
        return length == 0 ? m15110of() : new lxd(elements, length);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15110of() {
        return (kx7<E>) lxd.f59164e;
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> kx7<E> sortedCopyOf(Iterable<? extends E> elements) {
        Comparable[] comparableArr = (Comparable[]) vg8.m23937c(elements, new Comparable[0]);
        pjb.m19532b(comparableArr);
        Arrays.sort(comparableArr);
        return m15108e(comparableArr);
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int offset) {
        int size = size();
        for (int i = 0; i < size; i++) {
            dst[offset + i] = get(i);
        }
        return offset + size;
    }

    @Override // java.util.List
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ax7
    @Deprecated
    @p28(replacement = "this")
    public final kx7<E> asList() {
        return this;
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        return indexOf(object) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@wx1 Object obj) {
        return eb9.m9846d(this, obj);
    }

    /* JADX INFO: renamed from: g */
    public kx7<E> m15123g(int fromIndex, int toIndex) {
        return new C8545e(fromIndex, toIndex - fromIndex);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(@wx1 Object object) {
        if (object == null) {
            return -1;
        }
        return eb9.m9848f(this, object);
    }

    public int lastIndexOf(@wx1 Object object) {
        if (object == null) {
            return -1;
        }
        return eb9.m9849g(this, object);
    }

    @Override // java.util.List
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    public kx7<E> reverse() {
        return size() <= 1 ? this : new C8543c(this);
    }

    @Override // java.util.List
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ax7
    @yg8
    public Object writeReplace() {
        return new C8544d(toArray());
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15111of(E element) {
        return construct(element);
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public kx7<E> subList(int fromIndex, int toIndex) {
        v7d.checkPositionIndexes(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        return i == size() ? this : i == 0 ? m15110of() : m15123g(fromIndex, toIndex);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15112of(E e1, E e2) {
        return construct(e1, e2);
    }

    @Override // java.util.List
    public tuh<E> listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15113of(E e1, E e2, E e3) {
        return construct(e1, e2, e3);
    }

    @Override // java.util.List
    public tuh<E> listIterator(int i) {
        v7d.checkPositionIndex(i, size());
        if (isEmpty()) {
            return (tuh<E>) f55554b;
        }
        return new C8542b(this, i);
    }

    public static <E> kx7<E> copyOf(Collection<? extends E> elements) {
        if (elements instanceof ax7) {
            kx7<E> kx7VarAsList = ((ax7) elements).asList();
            return kx7VarAsList.isPartialView() ? m15108e(kx7VarAsList.toArray()) : kx7VarAsList;
        }
        return construct(elements.toArray());
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15114of(E e1, E e2, E e3, E e4) {
        return construct(e1, e2, e3, e4);
    }

    public static <E> kx7<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        v7d.checkNotNull(comparator);
        Object[] objArrM23936b = vg8.m23936b(elements);
        pjb.m19532b(objArrM23936b);
        Arrays.sort(objArrM23936b, comparator);
        return m15108e(objArrM23936b);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15115of(E e1, E e2, E e3, E e4, E e5) {
        return construct(e1, e2, e3, e4, e5);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15116of(E e1, E e2, E e3, E e4, E e5, E e6) {
        return construct(e1, e2, e3, e4, e5, e6);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15117of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e1, e2, e3, e4, e5, e6, e7);
    }

    public static <E> kx7<E> copyOf(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return m15110of();
        }
        E next = elements.next();
        if (!elements.hasNext()) {
            return m15111of((Object) next);
        }
        return new C8541a().add((Object) next).addAll((Iterator) elements).build();
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15118of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15119of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15120of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15121of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <E> kx7<E> m15122of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... others) {
        v7d.checkArgument(others.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[others.length + 12];
        objArr[0] = e1;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(others, 0, objArr, 12, others.length);
        return construct(objArr);
    }

    public static <E> kx7<E> copyOf(E[] elements) {
        if (elements.length == 0) {
            return m15110of();
        }
        return construct((Object[]) elements.clone());
    }
}
