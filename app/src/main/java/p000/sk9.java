package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class sk9 extends AbstractC14369w3<Long> implements v98.InterfaceC13954j, RandomAccess, lbd {

    /* JADX INFO: renamed from: e */
    public static final sk9 f82125e = new sk9(new long[0], 0, false);

    /* JADX INFO: renamed from: c */
    public long[] f82126c;

    /* JADX INFO: renamed from: d */
    public int f82127d;

    public sk9() {
        this(new long[10], 0, true);
    }

    public static sk9 emptyList() {
        return f82125e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f82127d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f82127d;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m24324a();
        v98.m23881a(collection);
        if (!(collection instanceof sk9)) {
            return super.addAll(collection);
        }
        sk9 sk9Var = (sk9) collection;
        int i = sk9Var.f82127d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f82127d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f82126c;
        if (i3 > jArr.length) {
            this.f82126c = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(sk9Var.f82126c, 0, this.f82126c, this.f82127d, sk9Var.f82127d);
        this.f82127d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.v98.InterfaceC13954j
    public void addLong(long element) {
        m24324a();
        int i = this.f82127d;
        long[] jArr = this.f82126c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f82126c = jArr2;
        }
        long[] jArr3 = this.f82126c;
        int i2 = this.f82127d;
        this.f82127d = i2 + 1;
        jArr3[i2] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof sk9)) {
            return super.equals(o);
        }
        sk9 sk9Var = (sk9) o;
        if (this.f82127d != sk9Var.f82127d) {
            return false;
        }
        long[] jArr = sk9Var.f82126c;
        for (int i = 0; i < this.f82127d; i++) {
            if (this.f82126c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.v98.InterfaceC13954j
    public long getLong(int index) {
        ensureIndexInRange(index);
        return this.f82126c[index];
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.f82127d; i++) {
            iHashLong = (iHashLong * 31) + v98.hashLong(this.f82126c[i]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) element).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f82126c[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        m24324a();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f82126c;
        System.arraycopy(jArr, toIndex, jArr, fromIndex, this.f82127d - toIndex);
        this.f82127d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.v98.InterfaceC13954j
    public long setLong(int index, long element) {
        m24324a();
        ensureIndexInRange(index);
        long[] jArr = this.f82126c;
        long j = jArr[index];
        jArr[index] = element;
        return j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f82127d;
    }

    private sk9(long[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f82126c = other;
        this.f82127d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int index) {
        return Long.valueOf(getLong(index));
    }

    @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public v98.InterfaceC13956l<Long> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f82127d) {
            return new sk9(Arrays.copyOf(this.f82126c, capacity), this.f82127d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Long remove(int index) {
        m24324a();
        ensureIndexInRange(index);
        long[] jArr = this.f82126c;
        long j = jArr[index];
        if (index < this.f82127d - 1) {
            System.arraycopy(jArr, index + 1, jArr, index, (r3 - index) - 1);
        }
        this.f82127d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Long set(int index, Long element) {
        return Long.valueOf(setLong(index, element.longValue()));
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long element) {
        addLong(element.longValue());
        return true;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public void add(int index, Long element) {
        addLong(index, element.longValue());
    }

    private void addLong(int index, long element) {
        int i;
        m24324a();
        if (index >= 0 && index <= (i = this.f82127d)) {
            long[] jArr = this.f82126c;
            if (i < jArr.length) {
                System.arraycopy(jArr, index, jArr, index + 1, i - index);
            } else {
                long[] jArr2 = new long[((i * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, index);
                System.arraycopy(this.f82126c, index, jArr2, index + 1, this.f82127d - index);
                this.f82126c = jArr2;
            }
            this.f82126c[index] = element;
            this.f82127d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
