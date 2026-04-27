package p000;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import p000.wg8;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class wg8 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$a */
    public class C14578a<T> extends quh<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Enumeration f94171a;

        public C14578a(final Enumeration val$enumeration) {
            this.f94171a = val$enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94171a.hasMoreElements();
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            return (T) this.f94171a.nextElement();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$b */
    public class C14579b<T> implements Enumeration<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f94172a;

        public C14579b(final Iterator val$iterator) {
            this.f94172a = val$iterator;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f94172a.hasNext();
        }

        @Override // java.util.Enumeration
        @dgc
        public T nextElement() {
            return (T) this.f94172a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$c */
    public class C14580c<T> extends quh<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f94173a;

        public C14580c(final Iterator val$iterator) {
            this.f94173a = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94173a.hasNext();
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            return (T) this.f94173a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$d */
    public class C14581d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public Iterator<T> f94174a = wg8.m24513g();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterable f94175b;

        public C14581d(final Iterable val$iterable) {
            this.f94175b = val$iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94174a.hasNext() || this.f94175b.iterator().hasNext();
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            if (!this.f94174a.hasNext()) {
                Iterator<T> it = this.f94175b.iterator();
                this.f94174a = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f94174a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f94174a.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: wg8$e */
    public class C14582e<I> extends quh<I> {

        /* JADX INFO: renamed from: a */
        public int f94176a = 0;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator[] f94177b;

        public C14582e(final Iterator[] val$elements) {
            this.f94177b = val$elements;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94176a < this.f94177b.length;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TI; */
        @Override // java.util.Iterator
        public Iterator next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f94177b[this.f94176a];
            Objects.requireNonNull(it);
            Iterator it2 = it;
            Iterator[] itArr = this.f94177b;
            int i = this.f94176a;
            itArr[i] = null;
            this.f94176a = i + 1;
            return it2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$f */
    public class C14583f<T> extends quh<List<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f94178a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f94179b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f94180c;

        public C14583f(final Iterator val$iterator, final int val$size, final boolean val$pad) {
            this.f94178a = val$iterator;
            this.f94179b = val$size;
            this.f94180c = val$pad;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94178a.hasNext();
        }

        @Override // java.util.Iterator
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f94179b];
            int i = 0;
            while (i < this.f94179b && this.f94178a.hasNext()) {
                objArr[i] = this.f94178a.next();
                i++;
            }
            for (int i2 = i; i2 < this.f94179b; i2++) {
                objArr[i2] = null;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f94180c || i == this.f94179b) ? listUnmodifiableList : listUnmodifiableList.subList(0, i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$g */
    public class C14584g<T> extends AbstractC0012a2<T> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f94181c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ l8d f94182d;

        public C14584g(final Iterator val$unfiltered, final l8d val$retainIfTrue) {
            this.f94181c = val$unfiltered;
            this.f94182d = val$retainIfTrue;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.AbstractC0012a2
        @wx1
        public T computeNext() {
            while (this.f94181c.hasNext()) {
                T t = (T) this.f94181c.next();
                if (this.f94182d.apply(t)) {
                    return t;
                }
            }
            return m25a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* JADX INFO: renamed from: wg8$h */
    public class C14585h<F, T> extends geh<F, T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ lz6 f94183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14585h(Iterator backingIterator, final lz6 val$function) {
            super(backingIterator);
            this.f94183b = val$function;
        }

        @Override // p000.geh
        @dgc
        /* JADX INFO: renamed from: a */
        public T mo2935a(@dgc F f) {
            return (T) this.f94183b.apply(f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$i */
    public class C14586i<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f94184a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f94185b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f94186c;

        public C14586i(final int val$limitSize, final Iterator val$iterator) {
            this.f94185b = val$limitSize;
            this.f94186c = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94184a < this.f94185b && this.f94186c.hasNext();
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f94184a++;
            return (T) this.f94186c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f94186c.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$j */
    public class C14587j<T> extends quh<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f94187a;

        public C14587j(final Iterator val$iterator) {
            this.f94187a = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94187a.hasNext();
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            T t = (T) this.f94187a.next();
            this.f94187a.remove();
            return t;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: wg8$k */
    public class C14588k<T> extends quh<T> {

        /* JADX INFO: renamed from: a */
        public boolean f94188a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f94189b;

        public C14588k(final Object val$value) {
            this.f94189b = val$value;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f94188a;
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            if (this.f94188a) {
                throw new NoSuchElementException();
            }
            this.f94188a = true;
            return (T) this.f94189b;
        }
    }

    /* JADX INFO: renamed from: wg8$l */
    public static final class C14589l<T> extends AbstractC14867x1<T> {

        /* JADX INFO: renamed from: e */
        public static final tuh<Object> f94190e = new C14589l(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: c */
        public final T[] f94191c;

        /* JADX INFO: renamed from: d */
        public final int f94192d;

        public C14589l(T[] array, int offset, int length, int index) {
            super(length, index);
            this.f94191c = array;
            this.f94192d = offset;
        }

        @Override // p000.AbstractC14867x1
        @dgc
        public T get(int index) {
            return this.f94191c[this.f94192d + index];
        }
    }

    /* JADX INFO: renamed from: wg8$m */
    public static class C14590m<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        @wx1
        public Iterator<? extends T> f94193a;

        /* JADX INFO: renamed from: b */
        public Iterator<? extends T> f94194b = wg8.m24511e();

        /* JADX INFO: renamed from: c */
        @wx1
        public Iterator<? extends Iterator<? extends T>> f94195c;

        /* JADX INFO: renamed from: d */
        @wx1
        public Deque<Iterator<? extends Iterator<? extends T>>> f94196d;

        public C14590m(Iterator<? extends Iterator<? extends T>> metaIterator) {
            this.f94195c = (Iterator) v7d.checkNotNull(metaIterator);
        }

        @wx1
        private Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f94195c;
                if (it != null && it.hasNext()) {
                    return this.f94195c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f94196d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f94195c = this.f94196d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) v7d.checkNotNull(this.f94194b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.f94195c = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                Iterator<? extends T> next = topMetaIterator.next();
                this.f94194b = next;
                if (next instanceof C14590m) {
                    C14590m c14590m = (C14590m) next;
                    this.f94194b = c14590m.f94194b;
                    if (this.f94196d == null) {
                        this.f94196d = new ArrayDeque();
                    }
                    this.f94196d.addFirst(this.f94195c);
                    if (c14590m.f94196d != null) {
                        while (!c14590m.f94196d.isEmpty()) {
                            this.f94196d.addFirst(c14590m.f94196d.removeLast());
                        }
                    }
                    this.f94195c = c14590m.f94195c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f94194b;
            this.f94193a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f94193a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f94193a = null;
        }
    }

    /* JADX INFO: renamed from: wg8$n */
    public enum EnumC14591n implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            s72.m21768e(false);
        }
    }

    /* JADX INFO: renamed from: wg8$o */
    public static class C14592o<T> extends quh<T> {

        /* JADX INFO: renamed from: a */
        public final Queue<gmc<T>> f94199a;

        public C14592o(Iterable<? extends Iterator<? extends T>> iterators, final Comparator<? super T> itemComparator) {
            this.f94199a = new PriorityQueue(2, new Comparator() { // from class: xg8
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return wg8.C14592o.lambda$new$0(itemComparator, (gmc) obj, (gmc) obj2);
                }
            });
            for (Iterator<? extends T> it : iterators) {
                if (it.hasNext()) {
                    this.f94199a.add(wg8.peekingIterator(it));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int lambda$new$0(Comparator comparator, gmc gmcVar, gmc gmcVar2) {
            return comparator.compare(gmcVar.peek(), gmcVar2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f94199a.isEmpty();
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            gmc<T> gmcVarRemove = this.f94199a.remove();
            T next = gmcVarRemove.next();
            if (gmcVarRemove.hasNext()) {
                this.f94199a.add(gmcVarRemove);
            }
            return next;
        }
    }

    /* JADX INFO: renamed from: wg8$p */
    public static class C14593p<E> implements gmc<E> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends E> f94200a;

        /* JADX INFO: renamed from: b */
        public boolean f94201b;

        /* JADX INFO: renamed from: c */
        @wx1
        public E f94202c;

        public C14593p(Iterator<? extends E> iterator) {
            this.f94200a = (Iterator) v7d.checkNotNull(iterator);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94201b || this.f94200a.hasNext();
        }

        @Override // p000.gmc, java.util.Iterator
        @dgc
        public E next() {
            if (!this.f94201b) {
                return this.f94200a.next();
            }
            E e = (E) sib.m22018a(this.f94202c);
            this.f94201b = false;
            this.f94202c = null;
            return e;
        }

        @Override // p000.gmc
        @dgc
        public E peek() {
            if (!this.f94201b) {
                this.f94202c = this.f94200a.next();
                this.f94201b = true;
            }
            return (E) sib.m22018a(this.f94202c);
        }

        @Override // p000.gmc, java.util.Iterator
        public void remove() {
            v7d.checkState(!this.f94201b, "Can't remove after you've peeked at next");
            this.f94200a.remove();
        }
    }

    private wg8() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> ListIterator<T> m24507a(Iterator<T> iterator) {
        return (ListIterator) iterator;
    }

    @op1
    public static <T> boolean addAll(Collection<T> addTo, Iterator<? extends T> iterator) {
        v7d.checkNotNull(addTo);
        v7d.checkNotNull(iterator);
        boolean zAdd = false;
        while (iterator.hasNext()) {
            zAdd |= addTo.add(iterator.next());
        }
        return zAdd;
    }

    @op1
    public static int advance(Iterator<?> iterator, int numberToAdvance) {
        v7d.checkNotNull(iterator);
        int i = 0;
        v7d.checkArgument(numberToAdvance >= 0, "numberToAdvance must be nonnegative");
        while (i < numberToAdvance && iterator.hasNext()) {
            iterator.next();
            i++;
        }
        return i;
    }

    public static <T> boolean all(Iterator<T> iterator, l8d<? super T> predicate) {
        v7d.checkNotNull(predicate);
        while (iterator.hasNext()) {
            if (!predicate.apply(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> iterator, l8d<? super T> predicate) {
        return indexOf(iterator, predicate) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> iterator) {
        v7d.checkNotNull(iterator);
        return new C14579b(iterator);
    }

    /* JADX INFO: renamed from: b */
    public static void m24508b(int position) {
        if (position >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + position + ") must not be negative");
    }

    /* JADX INFO: renamed from: c */
    public static void m24509c(Iterator<?> iterator) {
        v7d.checkNotNull(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a, Iterator<? extends T> b) {
        v7d.checkNotNull(a);
        v7d.checkNotNull(b);
        return concat(consumingForArray(a, b));
    }

    private static <I extends Iterator<?>> Iterator<I> consumingForArray(I... elements) {
        return new C14582e(elements);
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> iterator) {
        v7d.checkNotNull(iterator);
        return new C14587j(iterator);
    }

    public static boolean contains(Iterator<?> iterator, @wx1 Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
        v7d.checkNotNull(iterable);
        return new C14581d(iterable);
    }

    /* JADX INFO: renamed from: d */
    public static <T> Iterator<T> m24510d(Iterator<? extends T>... inputs) {
        for (Iterator it : (Iterator[]) v7d.checkNotNull(inputs)) {
            v7d.checkNotNull(it);
        }
        return concat(consumingForArray(inputs));
    }

    /* JADX INFO: renamed from: e */
    public static <T> quh<T> m24511e() {
        return m24512f();
    }

    public static boolean elementsEqual(Iterator<?> iterator1, Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !okb.equal(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    /* JADX INFO: renamed from: f */
    public static <T> tuh<T> m24512f() {
        return (tuh<T>) C14589l.f94190e;
    }

    public static <T> quh<T> filter(Iterator<T> unfiltered, l8d<? super T> retainIfTrue) {
        v7d.checkNotNull(unfiltered);
        v7d.checkNotNull(retainIfTrue);
        return new C14584g(unfiltered, retainIfTrue);
    }

    @dgc
    public static <T> T find(Iterator<T> iterator, l8d<? super T> predicate) {
        v7d.checkNotNull(iterator);
        v7d.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> quh<T> forArray(T... array) {
        return m24514h(array, 0, array.length, 0);
    }

    public static <T> quh<T> forEnumeration(Enumeration<T> enumeration) {
        v7d.checkNotNull(enumeration);
        return new C14578a(enumeration);
    }

    public static int frequency(Iterator<?> iterator, @wx1 Object element) {
        int i = 0;
        while (contains(iterator, element)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static <T> Iterator<T> m24513g() {
        return EnumC14591n.INSTANCE;
    }

    @dgc
    public static <T> T get(Iterator<T> iterator, int position) {
        m24508b(position);
        int iAdvance = advance(iterator, position);
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new IndexOutOfBoundsException("position (" + position + ") must be less than the number of elements that remained (" + iAdvance + c0b.f15434d);
    }

    @dgc
    public static <T> T getLast(Iterator<T> iterator) {
        T next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }

    @dgc
    public static <T> T getNext(Iterator<? extends T> iterator, @dgc T defaultValue) {
        return iterator.hasNext() ? iterator.next() : defaultValue;
    }

    @dgc
    public static <T> T getOnlyElement(Iterator<T> iterator) {
        T next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && iterator.hasNext(); i++) {
            sb.append(", ");
            sb.append(iterator.next());
        }
        if (iterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public static <T> tuh<T> m24514h(T[] array, int offset, int length, int index) {
        v7d.checkArgument(length >= 0);
        v7d.checkPositionIndexes(offset, offset + length, array.length);
        v7d.checkPositionIndex(index, length);
        return length == 0 ? m24512f() : new C14589l(array, offset, length, index);
    }

    @wx1
    /* JADX INFO: renamed from: i */
    public static <T> T m24515i(Iterator<T> iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        T next = iterator.next();
        iterator.remove();
        return next;
    }

    public static <T> int indexOf(Iterator<T> iterator, l8d<? super T> predicate) {
        v7d.checkNotNull(predicate, "predicate");
        int i = 0;
        while (iterator.hasNext()) {
            if (predicate.apply(iterator.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> Iterator<T> limit(Iterator<T> iterator, int limitSize) {
        v7d.checkNotNull(iterator);
        v7d.checkArgument(limitSize >= 0, "limit is negative");
        return new C14586i(limitSize, iterator);
    }

    public static <T> quh<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterators, Comparator<? super T> comparator) {
        v7d.checkNotNull(iterators, "iterators");
        v7d.checkNotNull(comparator, "comparator");
        return new C14592o(iterators, comparator);
    }

    public static <T> quh<List<T>> paddedPartition(Iterator<T> iterator, int size) {
        return partitionImpl(iterator, size, true);
    }

    public static <T> quh<List<T>> partition(Iterator<T> iterator, int size) {
        return partitionImpl(iterator, size, false);
    }

    private static <T> quh<List<T>> partitionImpl(Iterator<T> iterator, int size, boolean pad) {
        v7d.checkNotNull(iterator);
        v7d.checkArgument(size > 0);
        return new C14583f(iterator, size, pad);
    }

    public static <T> gmc<T> peekingIterator(Iterator<? extends T> iterator) {
        return iterator instanceof C14593p ? (C14593p) iterator : new C14593p(iterator);
    }

    @op1
    public static boolean removeAll(Iterator<?> removeFrom, Collection<?> elementsToRemove) {
        v7d.checkNotNull(elementsToRemove);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (elementsToRemove.contains(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    @op1
    public static <T> boolean removeIf(Iterator<T> removeFrom, l8d<? super T> predicate) {
        v7d.checkNotNull(predicate);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (predicate.apply(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    @op1
    public static boolean retainAll(Iterator<?> removeFrom, Collection<?> elementsToRetain) {
        v7d.checkNotNull(elementsToRetain);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (!elementsToRetain.contains(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> quh<T> singletonIterator(@dgc T value) {
        return new C14588k(value);
    }

    public static int size(Iterator<?> iterator) {
        long j = 0;
        while (iterator.hasNext()) {
            iterator.next();
            j++;
        }
        return rd8.saturatedCast(j);
    }

    @jd7
    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) vg8.toArray(eb9.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> iterator) {
        StringBuilder sb = new StringBuilder();
        sb.append(C4584d2.f28242k);
        boolean z = true;
        while (iterator.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iterator.next());
            z = false;
        }
        sb.append(C4584d2.f28243l);
        return sb.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> fromIterator, lz6<? super F, ? extends T> function) {
        v7d.checkNotNull(function);
        return new C14585h(fromIterator, function);
    }

    public static <T> z6c<T> tryFind(Iterator<T> iterator, l8d<? super T> predicate) {
        v7d.checkNotNull(iterator);
        v7d.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return z6c.m26593of(next);
            }
        }
        return z6c.absent();
    }

    public static <T> quh<T> unmodifiableIterator(Iterator<? extends T> iterator) {
        v7d.checkNotNull(iterator);
        return iterator instanceof quh ? (quh) iterator : new C14580c(iterator);
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... elements) {
        return cycle(eb9.newArrayList(elements));
    }

    @dgc
    public static <T> T getLast(Iterator<? extends T> it, @dgc T t) {
        return it.hasNext() ? (T) getLast(it) : t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a, Iterator<? extends T> b, Iterator<? extends T> c) {
        v7d.checkNotNull(a);
        v7d.checkNotNull(b);
        v7d.checkNotNull(c);
        return concat(consumingForArray(a, b, c));
    }

    @jd7
    public static <T> quh<T> filter(Iterator<?> unfiltered, Class<T> desiredType) {
        return filter(unfiltered, p8d.instanceOf(desiredType));
    }

    @Deprecated
    public static <T> gmc<T> peekingIterator(gmc<T> iterator) {
        return (gmc) v7d.checkNotNull(iterator);
    }

    @Deprecated
    public static <T> quh<T> unmodifiableIterator(quh<T> iterator) {
        return (quh) v7d.checkNotNull(iterator);
    }

    @dgc
    public static <T> T get(Iterator<? extends T> it, int i, @dgc T t) {
        m24508b(i);
        advance(it, i);
        return (T) getNext(it, t);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @wx1
    public static <T> T find(Iterator<? extends T> it, l8d<? super T> l8dVar, @wx1 T t) {
        v7d.checkNotNull(it);
        v7d.checkNotNull(l8dVar);
        while (it.hasNext()) {
            T next = it.next();
            if (l8dVar.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a, Iterator<? extends T> b, Iterator<? extends T> c, Iterator<? extends T> d) {
        v7d.checkNotNull(a);
        v7d.checkNotNull(b);
        v7d.checkNotNull(c);
        v7d.checkNotNull(d);
        return concat(consumingForArray(a, b, c, d));
    }

    @dgc
    public static <T> T getOnlyElement(Iterator<? extends T> it, @dgc T t) {
        return it.hasNext() ? (T) getOnlyElement(it) : t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... inputs) {
        return m24510d((Iterator[]) Arrays.copyOf(inputs, inputs.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> inputs) {
        return new C14590m(inputs);
    }
}
