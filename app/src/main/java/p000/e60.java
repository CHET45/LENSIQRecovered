package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.4")
@dwf({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:665\n476#1,53:718\n37#2:661\n36#2,3:662\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:665,53\n473#1:718,53\n46#1:661\n46#1:662,3\n*E\n"})
public final class e60<E> extends AbstractC5568f3<E> {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C5135a f31883d = new C5135a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final Object[] f31884e = new Object[0];

    /* JADX INFO: renamed from: f */
    public static final int f31885f = 10;

    /* JADX INFO: renamed from: a */
    public int f31886a;

    /* JADX INFO: renamed from: b */
    @yfb
    public Object[] f31887b;

    /* JADX INFO: renamed from: c */
    public int f31888c;

    /* JADX INFO: renamed from: e60$a */
    public static final class C5135a {
        public /* synthetic */ C5135a(jt3 jt3Var) {
            this();
        }

        private C5135a() {
        }
    }

    public e60(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f31884e;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i);
            }
            objArr = new Object[i];
        }
        this.f31887b = objArr;
    }

    private final void copyCollectionElements(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f31887b.length;
        while (i < length && it.hasNext()) {
            this.f31887b[i] = it.next();
            i++;
        }
        int i2 = this.f31886a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f31887b[i3] = it.next();
        }
        this.f31888c = size() + collection.size();
    }

    private final void copyElements(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f31887b;
        u70.copyInto(objArr2, objArr, 0, this.f31886a, objArr2.length);
        Object[] objArr3 = this.f31887b;
        int length = objArr3.length;
        int i2 = this.f31886a;
        u70.copyInto(objArr3, objArr, length - i2, 0, i2);
        this.f31886a = 0;
        this.f31887b = objArr;
    }

    private final int decremented(int i) {
        return i == 0 ? e80.getLastIndex(this.f31887b) : i - 1;
    }

    private final void ensureCapacity(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f31887b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f31884e) {
            this.f31887b = new Object[kpd.coerceAtLeast(i, 10)];
        } else {
            copyElements(AbstractC7110i2.Companion.newCapacity$kotlin_stdlib(objArr.length, i));
        }
    }

    private final boolean filterInPlace(qy6<? super E, Boolean> qy6Var) {
        int iPositiveMod;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f31887b.length != 0) {
            int iPositiveMod2 = positiveMod(this.f31886a + size());
            int i = this.f31886a;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.f31887b[i];
                    if (qy6Var.invoke(obj).booleanValue()) {
                        this.f31887b[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                u70.fill(this.f31887b, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.f31887b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f31887b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (qy6Var.invoke(obj2).booleanValue()) {
                        this.f31887b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                    Object[] objArr2 = this.f31887b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (qy6Var.invoke(obj3).booleanValue()) {
                        this.f31887b[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f31888c = negativeMod(iPositiveMod - this.f31886a);
            }
        }
        return z;
    }

    private final int incremented(int i) {
        if (i == e80.getLastIndex(this.f31887b)) {
            return 0;
        }
        return i + 1;
    }

    @t28
    private final E internalGet(int i) {
        return (E) this.f31887b[i];
    }

    @t28
    private final int internalIndex(int i) {
        return positiveMod(this.f31886a + i);
    }

    private final int negativeMod(int i) {
        return i < 0 ? i + this.f31887b.length : i;
    }

    private final void nullifyNonEmpty(int i, int i2) {
        if (i < i2) {
            u70.fill(this.f31887b, (Object) null, i, i2);
            return;
        }
        Object[] objArr = this.f31887b;
        u70.fill(objArr, (Object) null, i, objArr.length);
        u70.fill(this.f31887b, (Object) null, 0, i2);
    }

    private final int positiveMod(int i) {
        Object[] objArr = this.f31887b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    private final void removeRangeShiftPreceding(int i, int i2) {
        int iPositiveMod = positiveMod(this.f31886a + (i - 1));
        int iPositiveMod2 = positiveMod(this.f31886a + (i2 - 1));
        while (i > 0) {
            int i3 = iPositiveMod + 1;
            int iMin = Math.min(i, Math.min(i3, iPositiveMod2 + 1));
            Object[] objArr = this.f31887b;
            int i4 = iPositiveMod2 - iMin;
            int i5 = iPositiveMod - iMin;
            u70.copyInto(objArr, objArr, i4 + 1, i5 + 1, i3);
            iPositiveMod = negativeMod(i5);
            iPositiveMod2 = negativeMod(i4);
            i -= iMin;
        }
    }

    private final void removeRangeShiftSucceeding(int i, int i2) {
        int iPositiveMod = positiveMod(this.f31886a + i2);
        int iPositiveMod2 = positiveMod(this.f31886a + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f31887b;
            i2 = Math.min(size, Math.min(objArr.length - iPositiveMod, objArr.length - iPositiveMod2));
            Object[] objArr2 = this.f31887b;
            int i3 = iPositiveMod + i2;
            u70.copyInto(objArr2, objArr2, iPositiveMod2, iPositiveMod, i3);
            iPositiveMod = positiveMod(i3);
            iPositiveMod2 = positiveMod(iPositiveMod2 + i2);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(size() + collection.size());
        copyCollectionElements(positiveMod(this.f31886a + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        registerModification();
        ensureCapacity(size() + 1);
        int iDecremented = decremented(this.f31886a);
        this.f31886a = iDecremented;
        this.f31887b[iDecremented] = e;
        this.f31888c = size() + 1;
    }

    public final void addLast(E e) {
        registerModification();
        ensureCapacity(size() + 1);
        this.f31887b[positiveMod(this.f31886a + size())] = e;
        this.f31888c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.f31886a, positiveMod(this.f31886a + size()));
        }
        this.f31886a = 0;
        this.f31888c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f31887b[this.f31886a];
    }

    @gib
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f31887b[this.f31886a];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return (E) this.f31887b[positiveMod(this.f31886a + i)];
    }

    @Override // p000.AbstractC5568f3
    public int getSize() {
        return this.f31888c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int iPositiveMod = positiveMod(this.f31886a + size());
        int length = this.f31886a;
        if (length < iPositiveMod) {
            while (length < iPositiveMod) {
                if (md8.areEqual(obj, this.f31887b[length])) {
                    i = this.f31886a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iPositiveMod) {
            return -1;
        }
        int length2 = this.f31887b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iPositiveMod; i2++) {
                    if (md8.areEqual(obj, this.f31887b[i2])) {
                        length = i2 + this.f31887b.length;
                        i = this.f31886a;
                    }
                }
                return -1;
            }
            if (md8.areEqual(obj, this.f31887b[length])) {
                i = this.f31886a;
                break;
            }
            length++;
        }
        return length - i;
    }

    public final void internalStructure$kotlin_stdlib(@yfb gz6<? super Integer, ? super Object[], bth> gz6Var) {
        int i;
        md8.checkNotNullParameter(gz6Var, "structure");
        gz6Var.invoke(Integer.valueOf((isEmpty() || (i = this.f31886a) < positiveMod(this.f31886a + size())) ? this.f31886a : i - this.f31887b.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f31887b[positiveMod(this.f31886a + l82.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i;
        int iPositiveMod = positiveMod(this.f31886a + size());
        int i2 = this.f31886a;
        if (i2 < iPositiveMod) {
            lastIndex = iPositiveMod - 1;
            if (i2 <= lastIndex) {
                while (!md8.areEqual(obj, this.f31887b[lastIndex])) {
                    if (lastIndex != i2) {
                        lastIndex--;
                    }
                }
                i = this.f31886a;
                return lastIndex - i;
            }
            return -1;
        }
        if (i2 > iPositiveMod) {
            int i3 = iPositiveMod - 1;
            while (true) {
                if (-1 >= i3) {
                    lastIndex = e80.getLastIndex(this.f31887b);
                    int i4 = this.f31886a;
                    if (i4 <= lastIndex) {
                        while (!md8.areEqual(obj, this.f31887b[lastIndex])) {
                            if (lastIndex != i4) {
                                lastIndex--;
                            }
                        }
                        i = this.f31886a;
                    }
                } else {
                    if (md8.areEqual(obj, this.f31887b[i3])) {
                        lastIndex = i3 + this.f31887b.length;
                        i = this.f31886a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @gib
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f31887b[positiveMod(this.f31886a + l82.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        int iPositiveMod;
        md8.checkNotNullParameter(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f31887b.length != 0) {
            int iPositiveMod2 = positiveMod(this.f31886a + size());
            int i = this.f31886a;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.f31887b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f31887b[iPositiveMod] = obj;
                        iPositiveMod++;
                    }
                    i++;
                }
                u70.fill(this.f31887b, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.f31887b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f31887b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f31887b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                    Object[] objArr2 = this.f31887b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f31887b[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f31888c = negativeMod(iPositiveMod - this.f31886a);
            }
        }
        return z;
    }

    @Override // p000.AbstractC5568f3
    public E removeAt(int i) {
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, size());
        if (i == l82.getLastIndex(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int iPositiveMod = positiveMod(this.f31886a + i);
        E e = (E) this.f31887b[iPositiveMod];
        if (i < (size() >> 1)) {
            int i2 = this.f31886a;
            if (iPositiveMod >= i2) {
                Object[] objArr = this.f31887b;
                u70.copyInto(objArr, objArr, i2 + 1, i2, iPositiveMod);
            } else {
                Object[] objArr2 = this.f31887b;
                u70.copyInto(objArr2, objArr2, 1, 0, iPositiveMod);
                Object[] objArr3 = this.f31887b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f31886a;
                u70.copyInto(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f31887b;
            int i4 = this.f31886a;
            objArr4[i4] = null;
            this.f31886a = incremented(i4);
        } else {
            int iPositiveMod2 = positiveMod(this.f31886a + l82.getLastIndex(this));
            if (iPositiveMod <= iPositiveMod2) {
                Object[] objArr5 = this.f31887b;
                u70.copyInto(objArr5, objArr5, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                Object[] objArr6 = this.f31887b;
                u70.copyInto(objArr6, objArr6, iPositiveMod, iPositiveMod + 1, objArr6.length);
                Object[] objArr7 = this.f31887b;
                objArr7[objArr7.length - 1] = objArr7[0];
                u70.copyInto(objArr7, objArr7, 0, 1, iPositiveMod2 + 1);
            }
            this.f31887b[iPositiveMod2] = null;
        }
        this.f31888c = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        Object[] objArr = this.f31887b;
        int i = this.f31886a;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.f31886a = incremented(i);
        this.f31888c = size() - 1;
        return e;
    }

    @gib
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int iPositiveMod = positiveMod(this.f31886a + l82.getLastIndex(this));
        Object[] objArr = this.f31887b;
        E e = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.f31888c = size() - 1;
        return e;
    }

    @gib
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        registerModification();
        if (i < size() - i2) {
            removeRangeShiftPreceding(i, i2);
            int iPositiveMod = positiveMod(this.f31886a + i3);
            nullifyNonEmpty(this.f31886a, iPositiveMod);
            this.f31886a = iPositiveMod;
        } else {
            removeRangeShiftSucceeding(i, i2);
            int iPositiveMod2 = positiveMod(this.f31886a + size());
            nullifyNonEmpty(negativeMod(iPositiveMod2 - i3), iPositiveMod2);
        }
        this.f31888c = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        int iPositiveMod;
        md8.checkNotNullParameter(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f31887b.length != 0) {
            int iPositiveMod2 = positiveMod(this.f31886a + size());
            int i = this.f31886a;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.f31887b[i];
                    if (collection.contains(obj)) {
                        this.f31887b[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                u70.fill(this.f31887b, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.f31887b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f31887b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f31887b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                    Object[] objArr2 = this.f31887b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f31887b[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f31888c = negativeMod(iPositiveMod - this.f31886a);
            }
        }
        return z;
    }

    @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, size());
        int iPositiveMod = positiveMod(this.f31886a + i);
        Object[] objArr = this.f31887b;
        E e2 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = e;
        return e2;
    }

    public final void testRemoveRange$kotlin_stdlib(int i, int i2) {
        removeRange(i, i2);
    }

    @yfb
    public final <T> T[] testToArray$kotlin_stdlib(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        return (T[]) toArray(tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @yfb
    public <T> T[] toArray(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) s70.arrayOfNulls(tArr, size());
        }
        int iPositiveMod = positiveMod(this.f31886a + size());
        int i = this.f31886a;
        if (i < iPositiveMod) {
            u70.copyInto$default(this.f31887b, tArr, 0, i, iPositiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f31887b;
            u70.copyInto(objArr, tArr, 0, this.f31886a, objArr.length);
            Object[] objArr2 = this.f31887b;
            u70.copyInto(objArr2, tArr, objArr2.length - this.f31886a, 0, iPositiveMod);
        }
        return (T[]) k82.terminateCollectionToArray(size(), tArr);
    }

    @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (i == size()) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        registerModification();
        ensureCapacity(size() + 1);
        int iPositiveMod = positiveMod(this.f31886a + i);
        if (i < ((size() + 1) >> 1)) {
            int iDecremented = decremented(iPositiveMod);
            int iDecremented2 = decremented(this.f31886a);
            int i2 = this.f31886a;
            if (iDecremented >= i2) {
                Object[] objArr = this.f31887b;
                objArr[iDecremented2] = objArr[i2];
                u70.copyInto(objArr, objArr, i2, i2 + 1, iDecremented + 1);
            } else {
                Object[] objArr2 = this.f31887b;
                u70.copyInto(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.f31887b;
                objArr3[objArr3.length - 1] = objArr3[0];
                u70.copyInto(objArr3, objArr3, 0, 1, iDecremented + 1);
            }
            this.f31887b[iDecremented] = e;
            this.f31886a = iDecremented2;
        } else {
            int iPositiveMod2 = positiveMod(this.f31886a + size());
            if (iPositiveMod < iPositiveMod2) {
                Object[] objArr4 = this.f31887b;
                u70.copyInto(objArr4, objArr4, iPositiveMod + 1, iPositiveMod, iPositiveMod2);
            } else {
                Object[] objArr5 = this.f31887b;
                u70.copyInto(objArr5, objArr5, 1, 0, iPositiveMod2);
                Object[] objArr6 = this.f31887b;
                objArr6[0] = objArr6[objArr6.length - 1];
                u70.copyInto(objArr6, objArr6, iPositiveMod + 1, iPositiveMod, objArr6.length - 1);
            }
            this.f31887b[iPositiveMod] = e;
        }
        this.f31888c = size() + 1;
    }

    @yfb
    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        AbstractC7110i2.Companion.checkPositionIndex$kotlin_stdlib(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        registerModification();
        ensureCapacity(size() + collection.size());
        int iPositiveMod = positiveMod(this.f31886a + size());
        int iPositiveMod2 = positiveMod(this.f31886a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f31886a;
            int length = i2 - size;
            if (iPositiveMod2 < i2) {
                Object[] objArr = this.f31887b;
                u70.copyInto(objArr, objArr, length, i2, objArr.length);
                if (size >= iPositiveMod2) {
                    Object[] objArr2 = this.f31887b;
                    u70.copyInto(objArr2, objArr2, objArr2.length - size, 0, iPositiveMod2);
                } else {
                    Object[] objArr3 = this.f31887b;
                    u70.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f31887b;
                    u70.copyInto(objArr4, objArr4, 0, size, iPositiveMod2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f31887b;
                u70.copyInto(objArr5, objArr5, length, i2, iPositiveMod2);
            } else {
                Object[] objArr6 = this.f31887b;
                length += objArr6.length;
                int i3 = iPositiveMod2 - i2;
                int length2 = objArr6.length - length;
                if (length2 >= i3) {
                    u70.copyInto(objArr6, objArr6, length, i2, iPositiveMod2);
                } else {
                    u70.copyInto(objArr6, objArr6, length, i2, i2 + length2);
                    Object[] objArr7 = this.f31887b;
                    u70.copyInto(objArr7, objArr7, 0, this.f31886a + length2, iPositiveMod2);
                }
            }
            this.f31886a = length;
            copyCollectionElements(negativeMod(iPositiveMod2 - size), collection);
        } else {
            int i4 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i5 = size + iPositiveMod;
                Object[] objArr8 = this.f31887b;
                if (i5 <= objArr8.length) {
                    u70.copyInto(objArr8, objArr8, i4, iPositiveMod2, iPositiveMod);
                } else if (i4 >= objArr8.length) {
                    u70.copyInto(objArr8, objArr8, i4 - objArr8.length, iPositiveMod2, iPositiveMod);
                } else {
                    int length3 = iPositiveMod - (i5 - objArr8.length);
                    u70.copyInto(objArr8, objArr8, 0, length3, iPositiveMod);
                    Object[] objArr9 = this.f31887b;
                    u70.copyInto(objArr9, objArr9, i4, iPositiveMod2, length3);
                }
            } else {
                Object[] objArr10 = this.f31887b;
                u70.copyInto(objArr10, objArr10, size, 0, iPositiveMod);
                Object[] objArr11 = this.f31887b;
                if (i4 >= objArr11.length) {
                    u70.copyInto(objArr11, objArr11, i4 - objArr11.length, iPositiveMod2, objArr11.length);
                } else {
                    u70.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f31887b;
                    u70.copyInto(objArr12, objArr12, i4, iPositiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(iPositiveMod2, collection);
        }
        return true;
    }

    public e60() {
        this.f31887b = f31884e;
    }

    public e60(@yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        this.f31887b = array;
        this.f31888c = array.length;
        if (array.length == 0) {
            this.f31887b = f31884e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @yfb
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
