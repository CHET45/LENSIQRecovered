package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class nhd<E> extends AbstractC14369w3<E> implements RandomAccess {

    /* JADX INFO: renamed from: e */
    public static final nhd<Object> f64554e = new nhd<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: c */
    public E[] f64555c;

    /* JADX INFO: renamed from: d */
    public int f64556d;

    public nhd() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> nhd<E> emptyList() {
        return (nhd<E>) f64554e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f64556d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f64556d;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m24324a();
        int i = this.f64556d;
        E[] eArr = this.f64555c;
        if (i == eArr.length) {
            this.f64555c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f64555c;
        int i2 = this.f64556d;
        this.f64556d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        ensureIndexInRange(index);
        return this.f64555c[index];
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public E remove(int index) {
        m24324a();
        ensureIndexInRange(index);
        E[] eArr = this.f64555c;
        E e = eArr[index];
        if (index < this.f64556d - 1) {
            System.arraycopy(eArr, index + 1, eArr, index, (r2 - index) - 1);
        }
        this.f64556d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        m24324a();
        ensureIndexInRange(index);
        E[] eArr = this.f64555c;
        E e = eArr[index];
        eArr[index] = element;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f64556d;
    }

    private nhd(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.f64555c = array;
        this.f64556d = size;
    }

    @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public nhd<E> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f64556d) {
            return new nhd<>(Arrays.copyOf(this.f64555c, capacity), this.f64556d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        m24324a();
        if (i >= 0 && i <= (i2 = this.f64556d)) {
            E[] eArr = this.f64555c;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) createArray(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f64555c, 0, eArr2, 0, i);
                System.arraycopy(this.f64555c, i, eArr2, i + 1, this.f64556d - i);
                this.f64555c = eArr2;
            }
            this.f64555c[i] = e;
            this.f64556d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
