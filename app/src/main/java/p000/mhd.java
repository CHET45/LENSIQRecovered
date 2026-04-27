package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class mhd<E> extends AbstractC13839v3<E> implements RandomAccess {

    /* JADX INFO: renamed from: e */
    public static final mhd<Object> f61025e = new mhd<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: c */
    public E[] f61026c;

    /* JADX INFO: renamed from: d */
    public int f61027d;

    public mhd() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> mhd<E> emptyList() {
        return (mhd<E>) f61025e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f61027d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f61027d;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m23762a();
        int i = this.f61027d;
        E[] eArr = this.f61026c;
        if (i == eArr.length) {
            this.f61026c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f61026c;
        int i2 = this.f61027d;
        this.f61027d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        ensureIndexInRange(index);
        return this.f61026c[index];
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public E remove(int index) {
        m23762a();
        ensureIndexInRange(index);
        E[] eArr = this.f61026c;
        E e = eArr[index];
        if (index < this.f61027d - 1) {
            System.arraycopy(eArr, index + 1, eArr, index, (r2 - index) - 1);
        }
        this.f61027d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        m23762a();
        ensureIndexInRange(index);
        E[] eArr = this.f61026c;
        E e = eArr[index];
        eArr[index] = element;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f61027d;
    }

    private mhd(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.f61026c = array;
        this.f61027d = size;
    }

    @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public mhd<E> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f61027d) {
            return new mhd<>(Arrays.copyOf(this.f61026c, capacity), this.f61027d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        m23762a();
        if (i >= 0 && i <= (i2 = this.f61027d)) {
            E[] eArr = this.f61026c;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) createArray(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f61026c, 0, eArr2, 0, i);
                System.arraycopy(this.f61026c, i, eArr2, i + 1, this.f61027d - i);
                this.f61026c = eArr2;
            }
            this.f61026c[i] = e;
            this.f61027d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
