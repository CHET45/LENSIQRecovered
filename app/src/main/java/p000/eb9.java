package p000;

import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class eb9 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: eb9$a */
    public class C5230a<E> extends C5236g<E> {

        /* JADX INFO: renamed from: b */
        @yg8
        public static final long f32513b = 0;

        public C5230a(List backingList) {
            super(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            return this.f32515a.listIterator(index);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: eb9$b */
    public class C5231b<E> extends C5232c<E> {

        /* JADX INFO: renamed from: b */
        @yg8
        public static final long f32514b = 0;

        public C5231b(List backingList) {
            super(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            return this.f32515a.listIterator(index);
        }
    }

    /* JADX INFO: renamed from: eb9$c */
    public static class C5232c<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: a */
        public final List<E> f32515a;

        public C5232c(List<E> backingList) {
            this.f32515a = (List) v7d.checkNotNull(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, @dgc E element) {
            this.f32515a.add(index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> c) {
            return this.f32515a.addAll(index, c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object o) {
            return this.f32515a.contains(o);
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public E get(int index) {
            return this.f32515a.get(index);
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public E remove(int index) {
            return this.f32515a.remove(index);
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public E set(int index, @dgc E element) {
            return this.f32515a.set(index, element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32515a.size();
        }
    }

    /* JADX INFO: renamed from: eb9$d */
    public static final class C5233d extends AbstractList<Character> {

        /* JADX INFO: renamed from: a */
        public final CharSequence f32516a;

        public C5233d(CharSequence sequence) {
            this.f32516a = sequence;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32516a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int index) {
            v7d.checkElementIndex(index, size());
            return Character.valueOf(this.f32516a.charAt(index));
        }
    }

    /* JADX INFO: renamed from: eb9$e */
    public static class C5234e<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @dgc
        public final E f32517a;

        /* JADX INFO: renamed from: b */
        public final E[] f32518b;

        public C5234e(@dgc E e, E[] eArr) {
            this.f32517a = e;
            this.f32518b = (E[]) ((Object[]) v7d.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public E get(int index) {
            v7d.checkElementIndex(index, size());
            return index == 0 ? this.f32517a : this.f32518b[index - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return w68.saturatedAdd(this.f32518b.length, 1);
        }
    }

    /* JADX INFO: renamed from: eb9$f */
    public static class C5235f<T> extends AbstractList<List<T>> {

        /* JADX INFO: renamed from: a */
        public final List<T> f32519a;

        /* JADX INFO: renamed from: b */
        public final int f32520b;

        public C5235f(List<T> list, int size) {
            this.f32519a = list;
            this.f32520b = size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f32519a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return w68.divide(this.f32519a.size(), this.f32520b, RoundingMode.CEILING);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int index) {
            v7d.checkElementIndex(index, size());
            int i = this.f32520b;
            int i2 = index * i;
            return this.f32519a.subList(i2, Math.min(i + i2, this.f32519a.size()));
        }
    }

    /* JADX INFO: renamed from: eb9$g */
    public static class C5236g<E> extends C5232c<E> implements RandomAccess {
        public C5236g(List<E> backingList) {
            super(backingList);
        }
    }

    /* JADX INFO: renamed from: eb9$h */
    public static class C5237h<T> extends C5235f<T> implements RandomAccess {
        public C5237h(List<T> list, int size) {
            super(list, size);
        }
    }

    /* JADX INFO: renamed from: eb9$i */
    public static class C5238i<T> extends C5239j<T> implements RandomAccess {
        public C5238i(List<T> forwardList) {
            super(forwardList);
        }
    }

    /* JADX INFO: renamed from: eb9$j */
    public static class C5239j<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a */
        public final List<T> f32521a;

        /* JADX INFO: renamed from: eb9$j$a */
        public class a implements ListIterator<T> {

            /* JADX INFO: renamed from: a */
            public boolean f32522a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListIterator f32523b;

            public a(final ListIterator val$forwardIterator) {
                this.f32523b = val$forwardIterator;
            }

            @Override // java.util.ListIterator
            public void add(@dgc T e) {
                this.f32523b.add(e);
                this.f32523b.previous();
                this.f32522a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f32523b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f32523b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            @dgc
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f32522a = true;
                return (T) this.f32523b.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return C5239j.this.reversePosition(this.f32523b.nextIndex());
            }

            @Override // java.util.ListIterator
            @dgc
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f32522a = true;
                return (T) this.f32523b.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                s72.m21768e(this.f32522a);
                this.f32523b.remove();
                this.f32522a = false;
            }

            @Override // java.util.ListIterator
            public void set(@dgc T e) {
                v7d.checkState(this.f32522a);
                this.f32523b.set(e);
            }
        }

        public C5239j(List<T> forwardList) {
            this.f32521a = (List) v7d.checkNotNull(forwardList);
        }

        private int reverseIndex(int index) {
            int size = size();
            v7d.checkElementIndex(index, size);
            return (size - 1) - index;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int reversePosition(int index) {
            int size = size();
            v7d.checkPositionIndex(index, size);
            return size - index;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, @dgc T element) {
            this.f32521a.add(reversePosition(index), element);
        }

        /* JADX INFO: renamed from: b */
        public List<T> m9853b() {
            return this.f32521a;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f32521a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public T get(int index) {
            return this.f32521a.get(reverseIndex(index));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this.f32521a.listIterator(reversePosition(index)));
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public T remove(int index) {
            return this.f32521a.remove(reverseIndex(index));
        }

        @Override // java.util.AbstractList
        public void removeRange(int fromIndex, int toIndex) {
            subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public T set(int index, @dgc T element) {
            return this.f32521a.set(reverseIndex(index), element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32521a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            return eb9.reverse(this.f32521a.subList(reversePosition(toIndex), reversePosition(fromIndex)));
        }
    }

    /* JADX INFO: renamed from: eb9$k */
    public static final class C5240k extends kx7<Character> {

        /* JADX INFO: renamed from: c */
        public final String f32525c;

        public C5240k(String string) {
            this.f32525c = string;
        }

        @Override // p000.kx7, java.util.List
        public int indexOf(@wx1 Object object) {
            if (object instanceof Character) {
                return this.f32525c.indexOf(((Character) object).charValue());
            }
            return -1;
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return false;
        }

        @Override // p000.kx7, java.util.List
        public int lastIndexOf(@wx1 Object object) {
            if (object instanceof Character) {
                return this.f32525c.lastIndexOf(((Character) object).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32525c.length();
        }

        @Override // java.util.List
        public Character get(int index) {
            v7d.checkElementIndex(index, size());
            return Character.valueOf(this.f32525c.charAt(index));
        }

        @Override // p000.kx7, java.util.List
        public kx7<Character> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            return eb9.charactersOf(this.f32525c.substring(fromIndex, toIndex));
        }
    }

    /* JADX INFO: renamed from: eb9$l */
    public static class C5241l<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final List<F> f32526a;

        /* JADX INFO: renamed from: b */
        public final lz6<? super F, ? extends T> f32527b;

        /* JADX INFO: renamed from: eb9$l$a */
        public class a extends heh<F, T> {
            public a(ListIterator backingIterator) {
                super(backingIterator);
            }

            @Override // p000.geh
            /* JADX INFO: renamed from: a */
            public T mo2935a(F from) {
                return C5241l.this.f32527b.apply(from);
            }
        }

        public C5241l(List<F> fromList, lz6<? super F, ? extends T> function) {
            this.f32526a = (List) v7d.checkNotNull(fromList);
            this.f32527b = (lz6) v7d.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public T get(int i) {
            return this.f32527b.apply(this.f32526a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f32526a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this.f32526a.listIterator(index));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.f32527b.apply(this.f32526a.remove(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int fromIndex, int toIndex) {
            this.f32526a.subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32526a.size();
        }
    }

    /* JADX INFO: renamed from: eb9$m */
    public static class C5242m<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final List<F> f32529a;

        /* JADX INFO: renamed from: b */
        public final lz6<? super F, ? extends T> f32530b;

        /* JADX INFO: renamed from: eb9$m$a */
        public class a extends heh<F, T> {
            public a(ListIterator backingIterator) {
                super(backingIterator);
            }

            @Override // p000.geh
            @dgc
            /* JADX INFO: renamed from: a */
            public T mo2935a(@dgc F from) {
                return C5242m.this.f32530b.apply(from);
            }
        }

        public C5242m(List<F> fromList, lz6<? super F, ? extends T> function) {
            this.f32529a = (List) v7d.checkNotNull(fromList);
            this.f32530b = (lz6) v7d.checkNotNull(function);
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(final int index) {
            return new a(this.f32529a.listIterator(index));
        }

        @Override // java.util.AbstractList
        public void removeRange(int fromIndex, int toIndex) {
            this.f32529a.subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32529a.size();
        }
    }

    /* JADX INFO: renamed from: eb9$n */
    public static class C5243n<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @dgc
        public final E f32532a;

        /* JADX INFO: renamed from: b */
        @dgc
        public final E f32533b;

        /* JADX INFO: renamed from: c */
        public final E[] f32534c;

        public C5243n(@dgc E e, @dgc E e2, E[] eArr) {
            this.f32532a = e;
            this.f32533b = e2;
            this.f32534c = (E[]) ((Object[]) v7d.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @dgc
        public E get(int index) {
            if (index == 0) {
                return this.f32532a;
            }
            if (index == 1) {
                return this.f32533b;
            }
            v7d.checkElementIndex(index, size());
            return this.f32534c[index - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return w68.saturatedAdd(this.f32534c.length, 2);
        }
    }

    private eb9() {
    }

    /* JADX INFO: renamed from: a */
    public static <E> boolean m9843a(List<E> list, int index, Iterable<? extends E> elements) {
        ListIterator<E> listIterator = list.listIterator(index);
        Iterator<? extends E> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z = true;
        }
        return z;
    }

    public static <E> List<E> asList(@dgc E first, E[] rest) {
        return new C5234e(first, rest);
    }

    /* JADX INFO: renamed from: b */
    public static <T> List<T> m9844b(Iterable<T> iterable) {
        return (List) iterable;
    }

    @gdi
    /* JADX INFO: renamed from: c */
    public static int m9845c(int arraySize) {
        s72.m21765b(arraySize, "arraySize");
        return rd8.saturatedCast(((long) arraySize) + 5 + ((long) (arraySize / 10)));
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> lists) {
        return ns1.m18105c(lists);
    }

    public static kx7<Character> charactersOf(String string) {
        return new C5240k((String) v7d.checkNotNull(string));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9846d(List<?> thisList, @wx1 Object other) {
        if (other == v7d.checkNotNull(thisList)) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        List list = (List) other;
        int size = thisList.size();
        if (size != list.size()) {
            return false;
        }
        if (!(thisList instanceof RandomAccess) || !(list instanceof RandomAccess)) {
            return wg8.elementsEqual(thisList.iterator(), list.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!okb.equal(thisList.get(i), list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static int m9847e(List<?> list) {
        Iterator<?> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~((i * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public static int m9848f(List<?> list, @wx1 Object element) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, element);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (okb.equal(element, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m9849g(List<?> list, @wx1 Object element) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, element);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (okb.equal(element, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static <E> ListIterator<E> m9850h(List<E> list, int index) {
        return new C5232c(list).listIterator(index);
    }

    /* JADX INFO: renamed from: i */
    public static <E> List<E> m9851i(final List<E> list, int fromIndex, int toIndex) {
        return (list instanceof RandomAccess ? new C5230a(list) : new C5231b(list)).subList(fromIndex, toIndex);
    }

    private static int indexOfRandomAccess(List<?> list, @wx1 Object element) {
        int size = list.size();
        int i = 0;
        if (element == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (element.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int lastIndexOfRandomAccess(List<?> list, @wx1 Object element) {
        if (element == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (element.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    @gd7(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    @gd7(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int initialArraySize) {
        s72.m21765b(initialArraySize, "initialArraySize");
        return new ArrayList<>(initialArraySize);
    }

    @gd7(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int estimatedSize) {
        return new ArrayList<>(m9845c(estimatedSize));
    }

    @jd7
    @yg8
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    @gd7(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int size) {
        v7d.checkNotNull(list);
        v7d.checkArgument(size > 0);
        return list instanceof RandomAccess ? new C5237h(list, size) : new C5235f(list, size);
    }

    public static <T> List<T> reverse(List<T> list) {
        return list instanceof kx7 ? ((kx7) list).reverse() : list instanceof C5239j ? ((C5239j) list).m9853b() : list instanceof RandomAccess ? new C5238i(list) : new C5239j(list);
    }

    public static <F, T> List<T> transform(List<F> fromList, lz6<? super F, ? extends T> function) {
        return fromList instanceof RandomAccess ? new C5241l(fromList, function) : new C5242m(fromList, function);
    }

    public static <E> List<E> asList(@dgc E first, @dgc E second, E[] rest) {
        return new C5243n(first, second, rest);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... lists) {
        return cartesianProduct(Arrays.asList(lists));
    }

    public static List<Character> charactersOf(CharSequence sequence) {
        return new C5233d((CharSequence) v7d.checkNotNull(sequence));
    }

    @SafeVarargs
    @gd7(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... elements) {
        v7d.checkNotNull(elements);
        ArrayList<E> arrayList = new ArrayList<>(m9845c(elements.length));
        Collections.addAll(arrayList, elements);
        return arrayList;
    }

    @jd7
    @yg8
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> elements) {
        return new CopyOnWriteArrayList<>(elements instanceof Collection ? (Collection) elements : newArrayList(elements));
    }

    @gd7(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> elements) {
        LinkedList<E> linkedListNewLinkedList = newLinkedList();
        vg8.addAll(linkedListNewLinkedList, elements);
        return linkedListNewLinkedList;
    }

    @gd7(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> elements) {
        v7d.checkNotNull(elements);
        if (elements instanceof Collection) {
            return new ArrayList<>((Collection) elements);
        }
        return newArrayList(elements.iterator());
    }

    @gd7(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> elements) {
        ArrayList<E> arrayListNewArrayList = newArrayList();
        wg8.addAll(arrayListNewArrayList, elements);
        return arrayListNewArrayList;
    }
}
