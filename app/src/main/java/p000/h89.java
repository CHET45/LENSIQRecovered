package p000;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
public final class h89<E> extends AbstractC5568f3<E> implements List<E>, RandomAccess, Serializable, yo8 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C6751b f42905d = new C6751b(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final h89 f42906e;

    /* JADX INFO: renamed from: a */
    @yfb
    public E[] f42907a;

    /* JADX INFO: renamed from: b */
    public int f42908b;

    /* JADX INFO: renamed from: c */
    public boolean f42909c;

    /* JADX INFO: renamed from: h89$a */
    public static final class C6750a<E> extends AbstractC5568f3<E> implements List<E>, RandomAccess, Serializable, yo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public E[] f42910a;

        /* JADX INFO: renamed from: b */
        public final int f42911b;

        /* JADX INFO: renamed from: c */
        public int f42912c;

        /* JADX INFO: renamed from: d */
        @gib
        public final C6750a<E> f42913d;

        /* JADX INFO: renamed from: e */
        @yfb
        public final h89<E> f42914e;

        /* JADX INFO: renamed from: h89$a$a */
        @dwf({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
        public static final class a<E> implements ListIterator<E>, zo8 {

            /* JADX INFO: renamed from: a */
            @yfb
            public final C6750a<E> f42915a;

            /* JADX INFO: renamed from: b */
            public int f42916b;

            /* JADX INFO: renamed from: c */
            public int f42917c;

            /* JADX INFO: renamed from: d */
            public int f42918d;

            public a(@yfb C6750a<E> c6750a, int i) {
                md8.checkNotNullParameter(c6750a, "list");
                this.f42915a = c6750a;
                this.f42916b = i;
                this.f42917c = -1;
                this.f42918d = ((AbstractList) c6750a).modCount;
            }

            private final void checkForComodification() {
                if (((AbstractList) this.f42915a.f42914e).modCount != this.f42918d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e) {
                checkForComodification();
                C6750a<E> c6750a = this.f42915a;
                int i = this.f42916b;
                this.f42916b = i + 1;
                c6750a.add(i, e);
                this.f42917c = -1;
                this.f42918d = ((AbstractList) this.f42915a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f42916b < this.f42915a.f42912c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f42916b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                checkForComodification();
                if (this.f42916b >= this.f42915a.f42912c) {
                    throw new NoSuchElementException();
                }
                int i = this.f42916b;
                this.f42916b = i + 1;
                this.f42917c = i;
                return (E) this.f42915a.f42910a[this.f42915a.f42911b + this.f42917c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f42916b;
            }

            @Override // java.util.ListIterator
            public E previous() {
                checkForComodification();
                int i = this.f42916b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f42916b = i2;
                this.f42917c = i2;
                return (E) this.f42915a.f42910a[this.f42915a.f42911b + this.f42917c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f42916b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                checkForComodification();
                int i = this.f42917c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f42915a.remove(i);
                this.f42916b = this.f42917c;
                this.f42917c = -1;
                this.f42918d = ((AbstractList) this.f42915a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E e) {
                checkForComodification();
                int i = this.f42917c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f42915a.set(i, e);
            }
        }

        public C6750a(@yfb E[] eArr, int i, int i2, @gib C6750a<E> c6750a, @yfb h89<E> h89Var) {
            md8.checkNotNullParameter(eArr, "backing");
            md8.checkNotNullParameter(h89Var, "root");
            this.f42910a = eArr;
            this.f42911b = i;
            this.f42912c = i2;
            this.f42913d = c6750a;
            this.f42914e = h89Var;
            ((AbstractList) this).modCount = ((AbstractList) h89Var).modCount;
        }

        private final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
            registerModification();
            C6750a<E> c6750a = this.f42913d;
            if (c6750a != null) {
                c6750a.addAllInternal(i, collection, i2);
            } else {
                this.f42914e.addAllInternal(i, collection, i2);
            }
            this.f42910a = (E[]) this.f42914e.f42907a;
            this.f42912c += i2;
        }

        private final void addAtInternal(int i, E e) {
            registerModification();
            C6750a<E> c6750a = this.f42913d;
            if (c6750a != null) {
                c6750a.addAtInternal(i, e);
            } else {
                this.f42914e.addAtInternal(i, e);
            }
            this.f42910a = (E[]) this.f42914e.f42907a;
            this.f42912c++;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.f42914e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void checkIsMutable() {
            if (isReadOnly()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean contentEquals(List<?> list) {
            return i89.subarrayContentEquals(this.f42910a, this.f42911b, this.f42912c, list);
        }

        private final boolean isReadOnly() {
            return this.f42914e.f42909c;
        }

        private final void registerModification() {
            ((AbstractList) this).modCount++;
        }

        private final E removeAtInternal(int i) {
            registerModification();
            C6750a<E> c6750a = this.f42913d;
            this.f42912c--;
            return c6750a != null ? c6750a.removeAtInternal(i) : (E) this.f42914e.removeAtInternal(i);
        }

        private final void removeRangeInternal(int i, int i2) {
            if (i2 > 0) {
                registerModification();
            }
            C6750a<E> c6750a = this.f42913d;
            if (c6750a != null) {
                c6750a.removeRangeInternal(i, i2);
            } else {
                this.f42914e.removeRangeInternal(i, i2);
            }
            this.f42912c -= i2;
        }

        private final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
            C6750a<E> c6750a = this.f42913d;
            int iRetainOrRemoveAllInternal = c6750a != null ? c6750a.retainOrRemoveAllInternal(i, i2, collection, z) : this.f42914e.retainOrRemoveAllInternal(i, i2, collection, z);
            if (iRetainOrRemoveAllInternal > 0) {
                registerModification();
            }
            this.f42912c -= iRetainOrRemoveAllInternal;
            return iRetainOrRemoveAllInternal;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (isReadOnly()) {
                return new j1f(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.f42911b + this.f42912c, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@yfb Collection<? extends E> collection) {
            md8.checkNotNullParameter(collection, "elements");
            checkIsMutable();
            checkForComodification();
            int size = collection.size();
            addAllInternal(this.f42911b + this.f42912c, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.f42911b, this.f42912c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@gib Object obj) {
            checkForComodification();
            return obj == this || ((obj instanceof List) && contentEquals((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            checkForComodification();
            AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f42912c);
            return this.f42910a[this.f42911b + i];
        }

        @Override // p000.AbstractC5568f3
        public int getSize() {
            checkForComodification();
            return this.f42912c;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            checkForComodification();
            return i89.subarrayContentHashCode(this.f42910a, this.f42911b, this.f42912c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            checkForComodification();
            for (int i = 0; i < this.f42912c; i++) {
                if (md8.areEqual(this.f42910a[this.f42911b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            return this.f42912c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @yfb
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            checkForComodification();
            for (int i = this.f42912c - 1; i >= 0; i--) {
                if (md8.areEqual(this.f42910a[this.f42911b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @yfb
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            checkIsMutable();
            checkForComodification();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.f42911b, this.f42912c, collection, false) > 0;
        }

        @Override // p000.AbstractC5568f3
        public E removeAt(int i) {
            checkIsMutable();
            checkForComodification();
            AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f42912c);
            return removeAtInternal(this.f42911b + i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@yfb Collection<? extends Object> collection) {
            md8.checkNotNullParameter(collection, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.f42911b, this.f42912c, collection, true) > 0;
        }

        @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            checkIsMutable();
            checkForComodification();
            AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f42912c);
            E[] eArr = this.f42910a;
            int i2 = this.f42911b;
            E e2 = eArr[i2 + i];
            eArr[i2 + i] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        @yfb
        public List<E> subList(int i, int i2) {
            AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.f42912c);
            return new C6750a(this.f42910a, this.f42911b + i, i2 - i, this, this.f42914e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @yfb
        public <T> T[] toArray(@yfb T[] tArr) {
            md8.checkNotNullParameter(tArr, "array");
            checkForComodification();
            int length = tArr.length;
            int i = this.f42912c;
            if (length >= i) {
                E[] eArr = this.f42910a;
                int i2 = this.f42911b;
                u70.copyInto(eArr, tArr, 0, i2, i + i2);
                return (T[]) k82.terminateCollectionToArray(this.f42912c, tArr);
            }
            E[] eArr2 = this.f42910a;
            int i3 = this.f42911b;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr2, i3, i + i3, tArr.getClass());
            md8.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
            return tArr2;
        }

        @Override // java.util.AbstractCollection
        @yfb
        public String toString() {
            checkForComodification();
            return i89.subarrayContentToString(this.f42910a, this.f42911b, this.f42912c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        @yfb
        public ListIterator<E> listIterator(int i) {
            checkForComodification();
            AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, this.f42912c);
            return new a(this, i);
        }

        @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            checkIsMutable();
            checkForComodification();
            AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, this.f42912c);
            addAtInternal(this.f42911b + i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, @yfb Collection<? extends E> collection) {
            md8.checkNotNullParameter(collection, "elements");
            checkIsMutable();
            checkForComodification();
            AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, this.f42912c);
            int size = collection.size();
            addAllInternal(this.f42911b + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @yfb
        public Object[] toArray() {
            checkForComodification();
            E[] eArr = this.f42910a;
            int i = this.f42911b;
            return u70.copyOfRange(eArr, i, this.f42912c + i);
        }
    }

    /* JADX INFO: renamed from: h89$b */
    public static final class C6751b {
        public /* synthetic */ C6751b(jt3 jt3Var) {
            this();
        }

        private C6751b() {
        }
    }

    /* JADX INFO: renamed from: h89$c */
    @dwf({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
    public static final class C6752c<E> implements ListIterator<E>, zo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final h89<E> f42919a;

        /* JADX INFO: renamed from: b */
        public int f42920b;

        /* JADX INFO: renamed from: c */
        public int f42921c;

        /* JADX INFO: renamed from: d */
        public int f42922d;

        public C6752c(@yfb h89<E> h89Var, int i) {
            md8.checkNotNullParameter(h89Var, "list");
            this.f42919a = h89Var;
            this.f42920b = i;
            this.f42921c = -1;
            this.f42922d = ((AbstractList) h89Var).modCount;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.f42919a).modCount != this.f42922d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            checkForComodification();
            h89<E> h89Var = this.f42919a;
            int i = this.f42920b;
            this.f42920b = i + 1;
            h89Var.add(i, e);
            this.f42921c = -1;
            this.f42922d = ((AbstractList) this.f42919a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f42920b < this.f42919a.f42908b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f42920b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            checkForComodification();
            if (this.f42920b >= this.f42919a.f42908b) {
                throw new NoSuchElementException();
            }
            int i = this.f42920b;
            this.f42920b = i + 1;
            this.f42921c = i;
            return (E) this.f42919a.f42907a[this.f42921c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f42920b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            checkForComodification();
            int i = this.f42920b;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.f42920b = i2;
            this.f42921c = i2;
            return (E) this.f42919a.f42907a[this.f42921c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f42920b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForComodification();
            int i = this.f42921c;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f42919a.remove(i);
            this.f42920b = this.f42921c;
            this.f42921c = -1;
            this.f42922d = ((AbstractList) this.f42919a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            checkForComodification();
            int i = this.f42921c;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f42919a.set(i, e);
        }
    }

    static {
        h89 h89Var = new h89(0);
        h89Var.f42909c = true;
        f42906e = h89Var;
    }

    public h89() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAllInternal(int i, Collection<? extends E> collection, int i2) {
        registerModification();
        insertAtInternal(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f42907a[i + i3] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAtInternal(int i, E e) {
        registerModification();
        insertAtInternal(i, 1);
        this.f42907a[i] = e;
    }

    private final void checkIsMutable() {
        if (this.f42909c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        return i89.subarrayContentEquals(this.f42907a, 0, this.f42908b, list);
    }

    private final void ensureCapacityInternal(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f42907a;
        if (i > eArr.length) {
            this.f42907a = (E[]) i89.copyOfUninitializedElements(this.f42907a, AbstractC7110i2.Companion.newCapacity$kotlin_stdlib(eArr.length, i));
        }
    }

    private final void ensureExtraCapacity(int i) {
        ensureCapacityInternal(this.f42908b + i);
    }

    private final void insertAtInternal(int i, int i2) {
        ensureExtraCapacity(i2);
        E[] eArr = this.f42907a;
        u70.copyInto(eArr, eArr, i + i2, i, this.f42908b);
        this.f42908b += i2;
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E removeAtInternal(int i) {
        registerModification();
        E[] eArr = this.f42907a;
        E e = eArr[i];
        u70.copyInto(eArr, eArr, i, i + 1, this.f42908b);
        i89.resetAt(this.f42907a, this.f42908b - 1);
        this.f42908b--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRangeInternal(int i, int i2) {
        if (i2 > 0) {
            registerModification();
        }
        E[] eArr = this.f42907a;
        u70.copyInto(eArr, eArr, i, i + i2, this.f42908b);
        E[] eArr2 = this.f42907a;
        int i3 = this.f42908b;
        i89.resetRange(eArr2, i3 - i2, i3);
        this.f42908b -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int retainOrRemoveAllInternal(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f42907a[i5]) == z) {
                E[] eArr = this.f42907a;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.f42907a;
        u70.copyInto(eArr2, eArr2, i + i4, i2 + i, this.f42908b);
        E[] eArr3 = this.f42907a;
        int i7 = this.f42908b;
        i89.resetRange(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            registerModification();
        }
        this.f42908b -= i6;
        return i6;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f42909c) {
            return new j1f(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        checkIsMutable();
        addAtInternal(this.f42908b, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        checkIsMutable();
        int size = collection.size();
        addAllInternal(this.f42908b, collection, size);
        return size > 0;
    }

    @yfb
    public final List<E> build() {
        checkIsMutable();
        this.f42909c = true;
        return this.f42908b > 0 ? this : f42906e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.f42908b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@gib Object obj) {
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f42908b);
        return this.f42907a[i];
    }

    @Override // p000.AbstractC5568f3
    public int getSize() {
        return this.f42908b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return i89.subarrayContentHashCode(this.f42907a, 0, this.f42908b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.f42908b; i++) {
            if (md8.areEqual(this.f42907a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f42908b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @yfb
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.f42908b - 1; i >= 0; i--) {
            if (md8.areEqual(this.f42907a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @yfb
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.f42908b, collection, false) > 0;
    }

    @Override // p000.AbstractC5568f3
    public E removeAt(int i) {
        checkIsMutable();
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f42908b);
        return removeAtInternal(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.f42908b, collection, true) > 0;
    }

    @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        checkIsMutable();
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, this.f42908b);
        E[] eArr = this.f42907a;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @yfb
    public List<E> subList(int i, int i2) {
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.f42908b);
        return new C6750a(this.f42907a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @yfb
    public <T> T[] toArray(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        int length = tArr.length;
        int i = this.f42908b;
        if (length >= i) {
            u70.copyInto(this.f42907a, tArr, 0, 0, i);
            return (T[]) k82.terminateCollectionToArray(this.f42908b, tArr);
        }
        T[] tArr2 = (T[]) Arrays.copyOfRange(this.f42907a, 0, i, tArr.getClass());
        md8.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @Override // java.util.AbstractCollection
    @yfb
    public String toString() {
        return i89.subarrayContentToString(this.f42907a, 0, this.f42908b, this);
    }

    public h89(int i) {
        this.f42907a = (E[]) i89.arrayOfUninitializedElements(i);
    }

    @Override // java.util.AbstractList, java.util.List
    @yfb
    public ListIterator<E> listIterator(int i) {
        AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, this.f42908b);
        return new C6752c(this, i);
    }

    @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        checkIsMutable();
        AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, this.f42908b);
        addAtInternal(i, e);
    }

    public /* synthetic */ h89(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        checkIsMutable();
        AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, this.f42908b);
        int size = collection.size();
        addAllInternal(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @yfb
    public Object[] toArray() {
        return u70.copyOfRange(this.f42907a, 0, this.f42908b);
    }
}
