package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class em6<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final z6c<Iterable<E>> f33457a;

    /* JADX INFO: renamed from: em6$a */
    public class C5379a extends em6<E> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f33458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5379a(Iterable iterable, final Iterable val$iterable) {
            super(iterable);
            this.f33458b = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f33458b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: em6$b */
    public class C5380b<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f33459b;

        public C5380b(final Iterable val$inputs) {
            this.f33459b = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.concat(wg8.transform(this.f33459b.iterator(), new fm6()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: em6$c */
    public class C5381c<T> extends em6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable[] f33460b;

        /* JADX INFO: renamed from: em6$c$a */
        public class a extends AbstractC14867x1<Iterator<? extends T>> {
            public a(int size) {
                super(size);
            }

            @Override // p000.AbstractC14867x1
            public Iterator<? extends T> get(int i) {
                return C5381c.this.f33460b[i].iterator();
            }
        }

        public C5381c(final Iterable[] val$inputs) {
            this.f33460b = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return wg8.concat(new a(this.f33460b.length));
        }
    }

    /* JADX INFO: renamed from: em6$d */
    public static class C5382d<E> implements lz6<Iterable<E>, em6<E>> {
        private C5382d() {
        }

        @Override // p000.lz6
        public em6<E> apply(Iterable<E> fromObject) {
            return em6.from(fromObject);
        }
    }

    public em6() {
        this.f33457a = z6c.absent();
    }

    public static <T> em6<T> concat(Iterable<? extends T> a, Iterable<? extends T> b) {
        return concatNoDefensiveCopy(a, b);
    }

    private static <T> em6<T> concatNoDefensiveCopy(final Iterable<? extends T>... inputs) {
        for (Iterable<? extends T> iterable : inputs) {
            v7d.checkNotNull(iterable);
        }
        return new C5381c(inputs);
    }

    public static <E> em6<E> from(final Iterable<E> iterable) {
        return iterable instanceof em6 ? (em6) iterable : new C5379a(iterable, iterable);
    }

    private Iterable<E> getDelegate() {
        return this.f33457a.mo17830or(this);
    }

    /* JADX INFO: renamed from: of */
    public static <E> em6<E> m10122of() {
        return from(Collections.emptyList());
    }

    public final boolean allMatch(l8d<? super E> predicate) {
        return vg8.all(getDelegate(), predicate);
    }

    public final boolean anyMatch(l8d<? super E> predicate) {
        return vg8.any(getDelegate(), predicate);
    }

    public final em6<E> append(Iterable<? extends E> other) {
        return concat(getDelegate(), other);
    }

    public final boolean contains(@wx1 Object target) {
        return vg8.contains(getDelegate(), target);
    }

    @op1
    public final <C extends Collection<? super E>> C copyInto(C collection) {
        v7d.checkNotNull(collection);
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof Collection) {
            collection.addAll((Collection) delegate);
        } else {
            Iterator<E> it = delegate.iterator();
            while (it.hasNext()) {
                collection.add(it.next());
            }
        }
        return collection;
    }

    public final em6<E> cycle() {
        return from(vg8.cycle(getDelegate()));
    }

    public final em6<E> filter(l8d<? super E> predicate) {
        return from(vg8.filter(getDelegate(), predicate));
    }

    public final z6c<E> first() {
        Iterator<E> it = getDelegate().iterator();
        return it.hasNext() ? z6c.m26593of(it.next()) : z6c.absent();
    }

    public final z6c<E> firstMatch(l8d<? super E> predicate) {
        return vg8.tryFind(getDelegate(), predicate);
    }

    @dgc
    public final E get(int i) {
        return (E) vg8.get(getDelegate(), i);
    }

    public final <K> mx7<K, E> index(lz6<? super E, K> keyFunction) {
        return x3b.index(getDelegate(), keyFunction);
    }

    public final boolean isEmpty() {
        return !getDelegate().iterator().hasNext();
    }

    public final String join(xj8 joiner) {
        return joiner.join(this);
    }

    public final z6c<E> last() {
        E next;
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof List) {
            List list = (List) delegate;
            return list.isEmpty() ? z6c.absent() : z6c.m26593of(list.get(list.size() - 1));
        }
        Iterator<E> it = delegate.iterator();
        if (!it.hasNext()) {
            return z6c.absent();
        }
        if (delegate instanceof SortedSet) {
            return z6c.m26593of(((SortedSet) delegate).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return z6c.m26593of(next);
    }

    public final em6<E> limit(int maxSize) {
        return from(vg8.limit(getDelegate(), maxSize));
    }

    public final int size() {
        return vg8.size(getDelegate());
    }

    public final em6<E> skip(int numberToSkip) {
        return from(vg8.skip(getDelegate(), numberToSkip));
    }

    @jd7
    public final E[] toArray(Class<E> cls) {
        return (E[]) vg8.toArray(getDelegate(), cls);
    }

    public final kx7<E> toList() {
        return kx7.copyOf(getDelegate());
    }

    public final <V> ox7<E, V> toMap(lz6<? super E, V> valueFunction) {
        return tt9.toMap(getDelegate(), valueFunction);
    }

    public final vx7<E> toMultiset() {
        return vx7.copyOf(getDelegate());
    }

    public final dy7<E> toSet() {
        return dy7.copyOf(getDelegate());
    }

    public final kx7<E> toSortedList(Comparator<? super E> comparator) {
        return s7c.from(comparator).immutableSortedCopy(getDelegate());
    }

    public final py7<E> toSortedSet(Comparator<? super E> comparator) {
        return py7.copyOf(comparator, getDelegate());
    }

    public String toString() {
        return vg8.toString(getDelegate());
    }

    public final <T> em6<T> transform(lz6<? super E, T> function) {
        return from(vg8.transform(getDelegate(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> em6<T> transformAndConcat(lz6<? super E, ? extends Iterable<? extends T>> function) {
        return concat(transform(function));
    }

    public final <K> ox7<K, E> uniqueIndex(lz6<? super E, K> keyFunction) {
        return tt9.uniqueIndex(getDelegate(), keyFunction);
    }

    public static <T> em6<T> concat(Iterable<? extends T> a, Iterable<? extends T> b, Iterable<? extends T> c) {
        return concatNoDefensiveCopy(a, b, c);
    }

    /* JADX INFO: renamed from: of */
    public static <E> em6<E> m10123of(@dgc E element, E... elements) {
        return from(eb9.asList(element, elements));
    }

    public final em6<E> append(E... elements) {
        return concat(getDelegate(), Arrays.asList(elements));
    }

    @jd7
    public final <T> em6<T> filter(Class<T> type) {
        return from(vg8.filter((Iterable<?>) getDelegate(), (Class) type));
    }

    public em6(Iterable<E> iterable) {
        this.f33457a = z6c.m26593of(iterable);
    }

    public static <T> em6<T> concat(Iterable<? extends T> a, Iterable<? extends T> b, Iterable<? extends T> c, Iterable<? extends T> d) {
        return concatNoDefensiveCopy(a, b, c, d);
    }

    public static <T> em6<T> concat(Iterable<? extends T>... inputs) {
        return concatNoDefensiveCopy((Iterable[]) Arrays.copyOf(inputs, inputs.length));
    }

    public static <E> em6<E> from(E[] elements) {
        return from(Arrays.asList(elements));
    }

    public static <T> em6<T> concat(final Iterable<? extends Iterable<? extends T>> inputs) {
        v7d.checkNotNull(inputs);
        return new C5380b(inputs);
    }

    @Deprecated
    @p28(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    public static <E> em6<E> from(em6<E> iterable) {
        return (em6) v7d.checkNotNull(iterable);
    }
}
