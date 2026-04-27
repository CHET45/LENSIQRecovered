package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class s7c<T> implements Comparator<T> {

    /* JADX INFO: renamed from: a */
    public static final int f80914a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f80915b = -1;

    /* JADX INFO: renamed from: s7c$a */
    @yg8
    @gdi
    public static class C12481a extends s7c<Object> {

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f80916c = new AtomicInteger(0);

        /* JADX INFO: renamed from: d */
        public final ConcurrentMap<Object, Integer> f80917d = swc.m22279l(new ft9()).makeMap();

        private Integer getUid(Object obj) {
            Integer num = this.f80917d.get(obj);
            if (num != null) {
                return num;
            }
            Integer numValueOf = Integer.valueOf(this.f80916c.getAndIncrement());
            Integer numPutIfAbsent = this.f80917d.putIfAbsent(obj, numValueOf);
            return numPutIfAbsent != null ? numPutIfAbsent : numValueOf;
        }

        /* JADX INFO: renamed from: b */
        public int m21771b(Object object) {
            return System.identityHashCode(object);
        }

        @Override // p000.s7c, java.util.Comparator
        public int compare(@wx1 Object left, @wx1 Object right) {
            if (left == right) {
                return 0;
            }
            if (left == null) {
                return -1;
            }
            if (right == null) {
                return 1;
            }
            int iM21771b = m21771b(left);
            int iM21771b2 = m21771b(right);
            if (iM21771b != iM21771b2) {
                return iM21771b < iM21771b2 ? -1 : 1;
            }
            int iCompareTo = getUid(left).compareTo(getUid(right));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* JADX INFO: renamed from: s7c$b */
    @yg8
    public static class C12482b {

        /* JADX INFO: renamed from: a */
        public static final s7c<Object> f80918a = new C12481a();

        private C12482b() {
        }
    }

    /* JADX INFO: renamed from: s7c$c */
    @gdi
    public static class C12483c extends ClassCastException {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Object f80919a;

        public C12483c(Object value) {
            super("Cannot compare value: " + value);
            this.f80919a = value;
        }
    }

    @gd7(serializable = true)
    public static s7c<Object> allEqual() {
        return C15194xm.f98484c;
    }

    @yg8
    public static s7c<Object> arbitrary() {
        return C12482b.f80918a;
    }

    @gd7(serializable = true)
    public static <T> s7c<T> explicit(List<T> valuesInOrder) {
        return new ei5(valuesInOrder);
    }

    @gd7(serializable = true)
    public static <T> s7c<T> from(Comparator<T> comparator) {
        return comparator instanceof s7c ? (s7c) comparator : new xc2(comparator);
    }

    @gd7(serializable = true)
    public static <C extends Comparable> s7c<C> natural() {
        return t9b.f84051e;
    }

    @gd7(serializable = true)
    public static s7c<Object> usingToString() {
        return izh.f49170c;
    }

    /* JADX INFO: renamed from: a */
    public <T2 extends T> s7c<Map.Entry<T2, ?>> m21770a() {
        return (s7c<Map.Entry<T2, ?>>) onResultOf(tt9.m22796q());
    }

    @Deprecated
    public int binarySearch(List<? extends T> sortedList, @dgc T key) {
        return Collections.binarySearch(sortedList, key, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(@dgc T left, @dgc T right);

    @gd7(serializable = true)
    public <U extends T> s7c<U> compound(Comparator<? super U> secondaryComparator) {
        return new do2(this, (Comparator) v7d.checkNotNull(secondaryComparator));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int k) {
        return reverse().leastOf(iterable, k);
    }

    public <E extends T> kx7<E> immutableSortedCopy(Iterable<E> elements) {
        return kx7.sortedCopyOf(this, elements);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int k) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) k) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > k) {
                    array = Arrays.copyOf(array, k);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), k);
    }

    @gd7(serializable = true)
    public <S extends T> s7c<Iterable<S>> lexicographical() {
        return new l49(this);
    }

    @dgc
    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    @dgc
    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    @gd7(serializable = true)
    public <S extends T> s7c<S> nullsFirst() {
        return new vib(this);
    }

    @gd7(serializable = true)
    public <S extends T> s7c<S> nullsLast() {
        return new wib(this);
    }

    @gd7(serializable = true)
    public <F> s7c<F> onResultOf(lz6<F, ? extends T> function) {
        return new xh1(function, this);
    }

    @gd7(serializable = true)
    public <S extends T> s7c<S> reverse() {
        return new m9e(this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> elements) {
        Object[] objArrM23936b = vg8.m23936b(elements);
        Arrays.sort(objArrM23936b, this);
        return eb9.newArrayList(Arrays.asList(objArrM23936b));
    }

    @gd7(serializable = true)
    public static <T> s7c<T> compound(Iterable<? extends Comparator<? super T>> comparators) {
        return new do2(comparators);
    }

    @gd7(serializable = true)
    public static <T> s7c<T> explicit(T leastValue, T... remainingValuesInOrder) {
        return explicit(eb9.asList(leastValue, remainingValuesInOrder));
    }

    public <E extends T> List<E> greatestOf(Iterator<E> iterator, int k) {
        return reverse().leastOf(iterator, k);
    }

    @gd7(serializable = true)
    @Deprecated
    public static <T> s7c<T> from(s7c<T> ordering) {
        return (s7c) v7d.checkNotNull(ordering);
    }

    @dgc
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    @dgc
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dgc
    public <E extends T> E max(@dgc E a, @dgc E b) {
        return compare(a, b) >= 0 ? a : b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dgc
    public <E extends T> E min(@dgc E a, @dgc E b) {
        return compare(a, b) <= 0 ? a : b;
    }

    @dgc
    public <E extends T> E max(@dgc E e, @dgc E e2, @dgc E e3, E... eArr) {
        E e4 = (E) max(max(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) max(e4, e5);
        }
        return e4;
    }

    @dgc
    public <E extends T> E min(@dgc E e, @dgc E e2, @dgc E e3, E... eArr) {
        E e4 = (E) min(min(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) min(e4, e5);
        }
        return e4;
    }

    public <E extends T> List<E> leastOf(Iterator<E> iterator, int k) {
        v7d.checkNotNull(iterator);
        s72.m21765b(k, "k");
        if (k == 0 || !iterator.hasNext()) {
            return Collections.emptyList();
        }
        if (k >= 1073741823) {
            ArrayList arrayListNewArrayList = eb9.newArrayList(iterator);
            Collections.sort(arrayListNewArrayList, this);
            if (arrayListNewArrayList.size() > k) {
                arrayListNewArrayList.subList(k, arrayListNewArrayList.size()).clear();
            }
            arrayListNewArrayList.trimToSize();
            return Collections.unmodifiableList(arrayListNewArrayList);
        }
        s4h s4hVarLeast = s4h.least(k, this);
        s4hVarLeast.offerAll(iterator);
        return s4hVarLeast.topK();
    }
}
