package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class vg8 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$a */
    public class C14047a<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91059b;

        public C14047a(final Iterable val$iterable) {
            this.f91059b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.cycle(this.f91059b);
        }

        @Override // p000.em6
        public String toString() {
            return this.f91059b.toString() + " (cycled)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$b */
    public class C14048b<T> extends em6<List<T>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91060b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f91061c;

        public C14048b(final Iterable val$iterable, final int val$size) {
            this.f91060b = val$iterable;
            this.f91061c = val$size;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return wg8.partition(this.f91060b.iterator(), this.f91061c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$c */
    public class C14049c<T> extends em6<List<T>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91062b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f91063c;

        public C14049c(final Iterable val$iterable, final int val$size) {
            this.f91062b = val$iterable;
            this.f91063c = val$size;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return wg8.paddedPartition(this.f91062b.iterator(), this.f91063c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$d */
    public class C14050d<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91064b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ l8d f91065c;

        public C14050d(final Iterable val$unfiltered, final l8d val$retainIfTrue) {
            this.f91064b = val$unfiltered;
            this.f91065c = val$retainIfTrue;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.filter(this.f91064b.iterator(), this.f91065c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$e */
    public class C14051e<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91066b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ lz6 f91067c;

        public C14051e(final Iterable val$fromIterable, final lz6 val$function) {
            this.f91066b = val$fromIterable;
            this.f91067c = val$function;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.transform(this.f91066b.iterator(), this.f91067c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$f */
    public class C14052f<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91068b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f91069c;

        /* JADX INFO: renamed from: vg8$f$a */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public boolean f91070a = true;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Iterator f91071b;

            public a(final C14052f this$0, final Iterator val$iterator) {
                this.f91071b = val$iterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f91071b.hasNext();
            }

            @Override // java.util.Iterator
            @dgc
            public T next() {
                T t = (T) this.f91071b.next();
                this.f91070a = false;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                s72.m21768e(!this.f91070a);
                this.f91071b.remove();
            }
        }

        public C14052f(final Iterable val$iterable, final int val$numberToSkip) {
            this.f91068b = val$iterable;
            this.f91069c = val$numberToSkip;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f91068b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f91069c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            wg8.advance(it, this.f91069c);
            return new a(this, it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$g */
    public class C14053g<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91072b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f91073c;

        public C14053g(final Iterable val$iterable, final int val$limitSize) {
            this.f91072b = val$iterable;
            this.f91073c = val$limitSize;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.limit(this.f91072b.iterator(), this.f91073c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$h */
    public class C14054h<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91074b;

        public C14054h(final Iterable val$iterable) {
            this.f91074b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f91074b;
            return iterable instanceof Queue ? new av2((Queue) iterable) : wg8.consumingIterator(iterable.iterator());
        }

        @Override // p000.em6
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vg8$i */
    public class C14055i<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f91075b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Comparator f91076c;

        public C14055i(final Iterable val$iterables, final Comparator val$comparator) {
            this.f91075b = val$iterables;
            this.f91076c = val$comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.mergeSorted(vg8.transform(this.f91075b, new fm6()), this.f91076c);
        }
    }

    /* JADX INFO: renamed from: vg8$j */
    public static final class C14056j<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final Iterable<? extends T> f91077b;

        public /* synthetic */ C14056j(Iterable iterable, C14047a c14047a) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.unmodifiableIterator(this.f91077b.iterator());
        }

        @Override // p000.em6
        public String toString() {
            return this.f91077b.toString();
        }

        private C14056j(Iterable<? extends T> iterable) {
            this.f91077b = iterable;
        }
    }

    private vg8() {
    }

    @wx1
    /* JADX INFO: renamed from: a */
    public static <T> T m23935a(Iterable<T> removeFrom, l8d<? super T> predicate) {
        v7d.checkNotNull(predicate);
        Iterator<T> it = removeFrom.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @op1
    public static <T> boolean addAll(Collection<T> addTo, Iterable<? extends T> elementsToAdd) {
        return elementsToAdd instanceof Collection ? addTo.addAll((Collection) elementsToAdd) : wg8.addAll(addTo, ((Iterable) v7d.checkNotNull(elementsToAdd)).iterator());
    }

    public static <T> boolean all(Iterable<T> iterable, l8d<? super T> predicate) {
        return wg8.all(iterable.iterator(), predicate);
    }

    public static <T> boolean any(Iterable<T> iterable, l8d<? super T> predicate) {
        return wg8.any(iterable.iterator(), predicate);
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m23936b(Iterable<?> iterable) {
        return castOrCopyToCollection(iterable).toArray();
    }

    /* JADX INFO: renamed from: c */
    public static <T> T[] m23937c(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) castOrCopyToCollection(iterable).toArray(tArr);
    }

    private static <E> Collection<E> castOrCopyToCollection(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : eb9.newArrayList(iterable.iterator());
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a, Iterable<? extends T> b) {
        return em6.concat(a, b);
    }

    public static <T> Iterable<T> consumingIterable(final Iterable<T> iterable) {
        v7d.checkNotNull(iterable);
        return new C14054h(iterable);
    }

    public static boolean contains(Iterable<? extends Object> iterable, @wx1 Object element) {
        return iterable instanceof Collection ? h82.m12263d((Collection) iterable, element) : wg8.contains(iterable.iterator(), element);
    }

    public static <T> Iterable<T> cycle(final Iterable<T> iterable) {
        v7d.checkNotNull(iterable);
        return new C14047a(iterable);
    }

    public static boolean elementsEqual(Iterable<?> iterable1, Iterable<?> iterable2) {
        if ((iterable1 instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable1).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return wg8.elementsEqual(iterable1.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> filter(final Iterable<T> unfiltered, final l8d<? super T> retainIfTrue) {
        v7d.checkNotNull(unfiltered);
        v7d.checkNotNull(retainIfTrue);
        return new C14050d(unfiltered, retainIfTrue);
    }

    @dgc
    public static <T> T find(Iterable<T> iterable, l8d<? super T> l8dVar) {
        return (T) wg8.find(iterable.iterator(), l8dVar);
    }

    public static int frequency(Iterable<?> iterable, @wx1 Object obj) {
        return iterable instanceof d4b ? ((d4b) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : wg8.frequency(iterable.iterator(), obj);
    }

    @dgc
    public static <T> T get(Iterable<T> iterable, int i) {
        v7d.checkNotNull(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i) : (T) wg8.get(iterable.iterator(), i);
    }

    @dgc
    public static <T> T getFirst(Iterable<? extends T> iterable, @dgc T t) {
        return (T) wg8.getNext(iterable.iterator(), t);
    }

    @dgc
    public static <T> T getLast(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) wg8.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) getLastInNonemptyList(list);
    }

    @dgc
    private static <T> T getLastInNonemptyList(List<T> list) {
        return list.get(list.size() - 1);
    }

    @dgc
    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) wg8.getOnlyElement(iterable.iterator());
    }

    public static <T> int indexOf(Iterable<T> iterable, l8d<? super T> predicate) {
        return wg8.indexOf(iterable.iterator(), predicate);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> limit(final Iterable<T> iterable, final int limitSize) {
        v7d.checkNotNull(iterable);
        v7d.checkArgument(limitSize >= 0, "limit is negative");
        return new C14053g(iterable, limitSize);
    }

    public static <T> Iterable<T> mergeSorted(final Iterable<? extends Iterable<? extends T>> iterables, final Comparator<? super T> comparator) {
        v7d.checkNotNull(iterables, "iterables");
        v7d.checkNotNull(comparator, "comparator");
        return new C14056j(new C14055i(iterables, comparator), null);
    }

    public static <T> Iterable<List<T>> paddedPartition(final Iterable<T> iterable, final int size) {
        v7d.checkNotNull(iterable);
        v7d.checkArgument(size > 0);
        return new C14049c(iterable, size);
    }

    public static <T> Iterable<List<T>> partition(final Iterable<T> iterable, final int size) {
        v7d.checkNotNull(iterable);
        v7d.checkArgument(size > 0);
        return new C14048b(iterable, size);
    }

    @op1
    public static boolean removeAll(Iterable<?> removeFrom, Collection<?> elementsToRemove) {
        return removeFrom instanceof Collection ? ((Collection) removeFrom).removeAll((Collection) v7d.checkNotNull(elementsToRemove)) : wg8.removeAll(removeFrom.iterator(), elementsToRemove);
    }

    @op1
    public static <T> boolean removeIf(Iterable<T> removeFrom, l8d<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? removeIfFromRandomAccessList((List) removeFrom, (l8d) v7d.checkNotNull(predicate)) : wg8.removeIf(removeFrom.iterator(), predicate);
    }

    private static <T> boolean removeIfFromRandomAccessList(List<T> list, l8d<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!predicate.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    @op1
    public static boolean retainAll(Iterable<?> removeFrom, Collection<?> elementsToRetain) {
        return removeFrom instanceof Collection ? ((Collection) removeFrom).retainAll((Collection) v7d.checkNotNull(elementsToRetain)) : wg8.retainAll(removeFrom.iterator(), elementsToRetain);
    }

    public static int size(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : wg8.size(iterable.iterator());
    }

    public static <T> Iterable<T> skip(final Iterable<T> iterable, final int numberToSkip) {
        v7d.checkNotNull(iterable);
        v7d.checkArgument(numberToSkip >= 0, "number to skip cannot be negative");
        return new C14052f(iterable, numberToSkip);
    }

    private static <T> void slowRemoveIfForRemainingElements(List<T> list, l8d<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i = from - 1; i >= to; i--) {
            list.remove(i);
        }
    }

    @jd7
    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) m23937c(iterable, pjb.newArray(cls, 0));
    }

    public static String toString(Iterable<?> iterable) {
        return wg8.toString(iterable.iterator());
    }

    public static <F, T> Iterable<T> transform(final Iterable<F> fromIterable, final lz6<? super F, ? extends T> function) {
        v7d.checkNotNull(fromIterable);
        v7d.checkNotNull(function);
        return new C14051e(fromIterable, function);
    }

    public static <T> z6c<T> tryFind(Iterable<T> iterable, l8d<? super T> predicate) {
        return wg8.tryFind(iterable.iterator(), predicate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(final Iterable<? extends T> iterable) {
        v7d.checkNotNull(iterable);
        return ((iterable instanceof C14056j) || (iterable instanceof ax7)) ? iterable : new C14056j(iterable, null);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a, Iterable<? extends T> b, Iterable<? extends T> c) {
        return em6.concat(a, b, c);
    }

    @wx1
    public static <T> T find(Iterable<? extends T> iterable, l8d<? super T> l8dVar, @wx1 T t) {
        return (T) wg8.find(iterable.iterator(), l8dVar, t);
    }

    @dgc
    public static <T> T getOnlyElement(Iterable<? extends T> iterable, @dgc T t) {
        return (T) wg8.getOnlyElement(iterable.iterator(), t);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a, Iterable<? extends T> b, Iterable<? extends T> c, Iterable<? extends T> d) {
        return em6.concat(a, b, c, d);
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... elements) {
        return cycle(eb9.newArrayList(elements));
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... inputs) {
        return em6.concat(inputs);
    }

    @jd7
    public static <T> Iterable<T> filter(final Iterable<?> unfiltered, final Class<T> desiredType) {
        v7d.checkNotNull(unfiltered);
        v7d.checkNotNull(desiredType);
        return filter(unfiltered, p8d.instanceOf(desiredType));
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(ax7<E> iterable) {
        return (Iterable) v7d.checkNotNull(iterable);
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> inputs) {
        return em6.concat(inputs);
    }

    @dgc
    public static <T> T get(Iterable<? extends T> iterable, int i, @dgc T t) {
        v7d.checkNotNull(iterable);
        wg8.m24508b(i);
        if (iterable instanceof List) {
            List listM9844b = eb9.m9844b(iterable);
            return i < listM9844b.size() ? (T) listM9844b.get(i) : t;
        }
        Iterator<? extends T> it = iterable.iterator();
        wg8.advance(it, i);
        return (T) wg8.getNext(it, t);
    }

    @dgc
    public static <T> T getLast(Iterable<? extends T> iterable, @dgc T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) getLastInNonemptyList(eb9.m9844b(iterable));
            }
        }
        return (T) wg8.getLast(iterable.iterator(), t);
    }
}
