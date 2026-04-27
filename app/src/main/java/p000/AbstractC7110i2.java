package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: i2 */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
@dwf({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n360#2,7:176\n388#2,7:183\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:176,7\n29#1:183,7\n*E\n"})
public abstract class AbstractC7110i2<E> extends AbstractC10126o0<E> implements List<E>, uo8 {

    @yfb
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* JADX INFO: renamed from: i2$a */
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
        }

        public final void checkElementIndex$kotlin_stdlib(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        public final int newCapacity$kotlin_stdlib(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }

        public final boolean orderedEquals$kotlin_stdlib(@yfb Collection<?> collection, @yfb Collection<?> collection2) {
            md8.checkNotNullParameter(collection, "c");
            md8.checkNotNullParameter(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!md8.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(@yfb Collection<?> collection) {
            md8.checkNotNullParameter(collection, "c");
            Iterator<?> it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: i2$b */
    public class b implements Iterator<E>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f45490a;

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final int m12729a() {
            return this.f45490a;
        }

        /* JADX INFO: renamed from: b */
        public final void m12730b(int i) {
            this.f45490a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45490a < AbstractC7110i2.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC7110i2<E> abstractC7110i2 = AbstractC7110i2.this;
            int i = this.f45490a;
            this.f45490a = i + 1;
            return abstractC7110i2.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: i2$c */
    public class c extends AbstractC7110i2<E>.b implements ListIterator<E>, uo8 {
        public c(int i) {
            super();
            AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, AbstractC7110i2.this.size());
            m12730b(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m12729a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m12729a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC7110i2<E> abstractC7110i2 = AbstractC7110i2.this;
            m12730b(m12729a() - 1);
            return abstractC7110i2.get(m12729a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m12729a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: i2$d */
    public static final class d<E> extends AbstractC7110i2<E> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        @yfb
        public final AbstractC7110i2<E> f45493a;

        /* JADX INFO: renamed from: b */
        public final int f45494b;

        /* JADX INFO: renamed from: c */
        public int f45495c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@yfb AbstractC7110i2<? extends E> abstractC7110i2, int i, int i2) {
            md8.checkNotNullParameter(abstractC7110i2, "list");
            this.f45493a = abstractC7110i2;
            this.f45494b = i;
            AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, abstractC7110i2.size());
            this.f45495c = i2 - i;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public E get(int i) {
            AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f45495c);
            return this.f45493a.get(this.f45494b + i);
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return this.f45495c;
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@gib Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.orderedEquals$kotlin_stdlib(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i);

    @Override // p000.AbstractC10126o0
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.orderedHashCode$kotlin_stdlib(this);
    }

    public int indexOf(E e) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (md8.areEqual(it.next(), e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (md8.areEqual(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @yfb
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @yfb
    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    @Override // java.util.List
    @yfb
    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
