package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class h82 {

    /* JADX INFO: renamed from: h82$a */
    public static class C6744a<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: a */
        public final Collection<E> f42883a;

        /* JADX INFO: renamed from: b */
        public final l8d<? super E> f42884b;

        public C6744a(Collection<E> unfiltered, l8d<? super E> predicate) {
            this.f42883a = unfiltered;
            this.f42884b = predicate;
        }

        /* JADX INFO: renamed from: a */
        public C6744a<E> m12266a(l8d<? super E> newPredicate) {
            return new C6744a<>(this.f42883a, p8d.and(this.f42884b, newPredicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@dgc E element) {
            v7d.checkArgument(this.f42884b.apply(element));
            return this.f42883a.add(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                v7d.checkArgument(this.f42884b.apply(it.next()));
            }
            return this.f42883a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            vg8.removeIf(this.f42883a, this.f42884b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object element) {
            if (h82.m12263d(this.f42883a, element)) {
                return this.f42884b.apply(element);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return h82.m12261b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !vg8.any(this.f42883a, this.f42884b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return wg8.filter(this.f42883a.iterator(), this.f42884b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@wx1 Object element) {
            return contains(element) && this.f42883a.remove(element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(final Collection<?> collection) {
            Iterator<E> it = this.f42883a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f42884b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(final Collection<?> collection) {
            Iterator<E> it = this.f42883a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f42884b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f42883a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f42884b.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return eb9.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) eb9.newArrayList(iterator()).toArray(tArr);
        }
    }

    /* JADX INFO: renamed from: h82$b */
    public static final class C6745b<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: a */
        public final kx7<E> f42885a;

        /* JADX INFO: renamed from: b */
        public final Comparator<? super E> f42886b;

        /* JADX INFO: renamed from: c */
        public final int f42887c;

        public C6745b(Iterable<E> input, Comparator<? super E> comparator) {
            kx7<E> kx7VarSortedCopyOf = kx7.sortedCopyOf(comparator, input);
            this.f42885a = kx7VarSortedCopyOf;
            this.f42886b = comparator;
            this.f42887c = calculateSize(kx7VarSortedCopyOf, comparator);
        }

        private static <E> int calculateSize(List<E> sortedInputList, Comparator<? super E> comparator) {
            int i = 1;
            int iSaturatedMultiply = 1;
            int i2 = 1;
            while (i < sortedInputList.size()) {
                if (comparator.compare(sortedInputList.get(i - 1), sortedInputList.get(i)) < 0) {
                    iSaturatedMultiply = w68.saturatedMultiply(iSaturatedMultiply, w68.binomial(i, i2));
                    if (iSaturatedMultiply == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i2 = 0;
                }
                i++;
                i2++;
            }
            return w68.saturatedMultiply(iSaturatedMultiply, w68.binomial(i, i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return h82.isPermutation(this.f42885a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new C6746c(this.f42885a, this.f42886b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f42887c;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f42885a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: h82$c */
    public static final class C6746c<E> extends AbstractC0012a2<List<E>> {

        /* JADX INFO: renamed from: c */
        @wx1
        public List<E> f42888c;

        /* JADX INFO: renamed from: d */
        public final Comparator<? super E> f42889d;

        public C6746c(List<E> list, Comparator<? super E> comparator) {
            this.f42888c = eb9.newArrayList(list);
            this.f42889d = comparator;
        }

        /* JADX INFO: renamed from: b */
        public void m12267b() {
            int iM12269d = m12269d();
            if (iM12269d == -1) {
                this.f42888c = null;
                return;
            }
            Objects.requireNonNull(this.f42888c);
            Collections.swap(this.f42888c, iM12269d, m12270e(iM12269d));
            Collections.reverse(this.f42888c.subList(iM12269d + 1, this.f42888c.size()));
        }

        @Override // p000.AbstractC0012a2
        @wx1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<E> computeNext() {
            List<E> list = this.f42888c;
            if (list == null) {
                return m25a();
            }
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) list);
            m12267b();
            return kx7VarCopyOf;
        }

        /* JADX INFO: renamed from: d */
        public int m12269d() {
            Objects.requireNonNull(this.f42888c);
            for (int size = this.f42888c.size() - 2; size >= 0; size--) {
                if (this.f42889d.compare(this.f42888c.get(size), this.f42888c.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: e */
        public int m12270e(int i) {
            Objects.requireNonNull(this.f42888c);
            E e = this.f42888c.get(i);
            for (int size = this.f42888c.size() - 1; size > i; size--) {
                if (this.f42889d.compare(e, this.f42888c.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* JADX INFO: renamed from: h82$d */
    public static final class C6747d<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: a */
        public final kx7<E> f42890a;

        public C6747d(kx7<E> input) {
            this.f42890a = input;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return h82.isPermutation(this.f42890a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new C6748e(this.f42890a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return w68.factorial(this.f42890a.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f42890a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: h82$e */
    public static class C6748e<E> extends AbstractC0012a2<List<E>> {

        /* JADX INFO: renamed from: c */
        public final List<E> f42891c;

        /* JADX INFO: renamed from: d */
        public final int[] f42892d;

        /* JADX INFO: renamed from: e */
        public final int[] f42893e;

        /* JADX INFO: renamed from: f */
        public int f42894f;

        public C6748e(List<E> list) {
            this.f42891c = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f42892d = iArr;
            int[] iArr2 = new int[size];
            this.f42893e = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f42894f = Integer.MAX_VALUE;
        }

        /* JADX INFO: renamed from: b */
        public void m12271b() {
            int size = this.f42891c.size() - 1;
            this.f42894f = size;
            if (size == -1) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f42892d;
                int i2 = this.f42894f;
                int i3 = iArr[i2];
                int i4 = this.f42893e[i2] + i3;
                if (i4 < 0) {
                    m12273d();
                } else if (i4 != i2 + 1) {
                    Collections.swap(this.f42891c, (i2 - i3) + i, (i2 - i4) + i);
                    this.f42892d[this.f42894f] = i4;
                    return;
                } else {
                    if (i2 == 0) {
                        return;
                    }
                    i++;
                    m12273d();
                }
            }
        }

        @Override // p000.AbstractC0012a2
        @wx1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<E> computeNext() {
            if (this.f42894f <= 0) {
                return m25a();
            }
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) this.f42891c);
            m12271b();
            return kx7VarCopyOf;
        }

        /* JADX INFO: renamed from: d */
        public void m12273d() {
            int[] iArr = this.f42893e;
            int i = this.f42894f;
            iArr[i] = -iArr[i];
            this.f42894f = i - 1;
        }
    }

    /* JADX INFO: renamed from: h82$f */
    public static class C6749f<F, T> extends AbstractCollection<T> {

        /* JADX INFO: renamed from: a */
        public final Collection<F> f42895a;

        /* JADX INFO: renamed from: b */
        public final lz6<? super F, ? extends T> f42896b;

        public C6749f(Collection<F> fromCollection, lz6<? super F, ? extends T> function) {
            this.f42895a = (Collection) v7d.checkNotNull(fromCollection);
            this.f42896b = (lz6) v7d.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f42895a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f42895a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.transform(this.f42895a.iterator(), this.f42896b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f42895a.size();
        }
    }

    private h82() {
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12261b(Collection<?> self, Collection<?> c) {
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            if (!self.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static StringBuilder m12262c(int size) {
        s72.m21765b(size, MediaInformation.KEY_SIZE);
        return new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
    }

    private static <E> qjb<E> counts(Collection<E> collection) {
        qjb<E> qjbVar = new qjb<>();
        for (E e : collection) {
            qjbVar.put(e, qjbVar.get(e) + 1);
        }
        return qjbVar;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12263d(Collection<?> collection, @wx1 Object object) {
        v7d.checkNotNull(collection);
        try {
            return collection.contains(object);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12264e(Collection<?> collection, @wx1 Object object) {
        v7d.checkNotNull(collection);
        try {
            return collection.remove(object);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m12265f(final Collection<?> collection) {
        StringBuilder sbM12262c = m12262c(collection.size());
        sbM12262c.append(C4584d2.f28242k);
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                sbM12262c.append(", ");
            }
            if (obj == collection) {
                sbM12262c.append("(this Collection)");
            } else {
                sbM12262c.append(obj);
            }
            z = false;
        }
        sbM12262c.append(C4584d2.f28243l);
        return sbM12262c.toString();
    }

    public static <E> Collection<E> filter(Collection<E> unfiltered, l8d<? super E> predicate) {
        return unfiltered instanceof C6744a ? ((C6744a) unfiltered).m12266a(predicate) : new C6744a((Collection) v7d.checkNotNull(unfiltered), (l8d) v7d.checkNotNull(predicate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPermutation(List<?> first, List<?> second) {
        if (first.size() != second.size()) {
            return false;
        }
        qjb qjbVarCounts = counts(first);
        qjb qjbVarCounts2 = counts(second);
        if (first.size() != second.size()) {
            return false;
        }
        for (int i = 0; i < first.size(); i++) {
            if (qjbVarCounts.m20391g(i) != qjbVarCounts2.get(qjbVarCounts.m20390f(i))) {
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> elements) {
        return orderedPermutations(elements, s7c.natural());
    }

    public static <E> Collection<List<E>> permutations(Collection<E> elements) {
        return new C6747d(kx7.copyOf((Collection) elements));
    }

    public static <F, T> Collection<T> transform(Collection<F> fromCollection, lz6<? super F, T> function) {
        return new C6749f(fromCollection, function);
    }

    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> elements, Comparator<? super E> comparator) {
        return new C6745b(elements, comparator);
    }
}
