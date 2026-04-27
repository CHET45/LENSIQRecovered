package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class rk9 extends AbstractC13839v3<Long> implements w98.InterfaceC14503j, RandomAccess, kbd {

    /* JADX INFO: renamed from: e */
    public static final rk9 f78557e = new rk9(new long[0], 0, false);

    /* JADX INFO: renamed from: c */
    public long[] f78558c;

    /* JADX INFO: renamed from: d */
    public int f78559d;

    public rk9() {
        this(new long[10], 0, true);
    }

    public static rk9 emptyList() {
        return f78557e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f78559d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f78559d;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m23762a();
        w98.m24432a(collection);
        if (!(collection instanceof rk9)) {
            return super.addAll(collection);
        }
        rk9 rk9Var = (rk9) collection;
        int i = rk9Var.f78559d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f78559d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f78558c;
        if (i3 > jArr.length) {
            this.f78558c = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(rk9Var.f78558c, 0, this.f78558c, this.f78559d, rk9Var.f78559d);
        this.f78559d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.w98.InterfaceC14503j
    public void addLong(long element) {
        m23762a();
        int i = this.f78559d;
        long[] jArr = this.f78558c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f78558c = jArr2;
        }
        long[] jArr3 = this.f78558c;
        int i2 = this.f78559d;
        this.f78559d = i2 + 1;
        jArr3[i2] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rk9)) {
            return super.equals(o);
        }
        rk9 rk9Var = (rk9) o;
        if (this.f78559d != rk9Var.f78559d) {
            return false;
        }
        long[] jArr = rk9Var.f78558c;
        for (int i = 0; i < this.f78559d; i++) {
            if (this.f78558c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.w98.InterfaceC14503j
    public long getLong(int index) {
        ensureIndexInRange(index);
        return this.f78558c[index];
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.f78559d; i++) {
            iHashLong = (iHashLong * 31) + w98.hashLong(this.f78558c[i]);
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
            if (this.f78558c[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        m23762a();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f78558c;
        System.arraycopy(jArr, toIndex, jArr, fromIndex, this.f78559d - toIndex);
        this.f78559d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.w98.InterfaceC14503j
    public long setLong(int index, long element) {
        m23762a();
        ensureIndexInRange(index);
        long[] jArr = this.f78558c;
        long j = jArr[index];
        jArr[index] = element;
        return j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f78559d;
    }

    private rk9(long[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f78558c = other;
        this.f78559d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int index) {
        return Long.valueOf(getLong(index));
    }

    @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public w98.InterfaceC14504k<Long> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f78559d) {
            return new rk9(Arrays.copyOf(this.f78558c, capacity), this.f78559d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Long remove(int index) {
        m23762a();
        ensureIndexInRange(index);
        long[] jArr = this.f78558c;
        long j = jArr[index];
        if (index < this.f78559d - 1) {
            System.arraycopy(jArr, index + 1, jArr, index, (r3 - index) - 1);
        }
        this.f78559d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Long set(int index, Long element) {
        return Long.valueOf(setLong(index, element.longValue()));
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long element) {
        addLong(element.longValue());
        return true;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public void add(int index, Long element) {
        addLong(index, element.longValue());
    }

    private void addLong(int index, long element) {
        int i;
        m23762a();
        if (index >= 0 && index <= (i = this.f78559d)) {
            long[] jArr = this.f78558c;
            if (i < jArr.length) {
                System.arraycopy(jArr, index, jArr, index + 1, i - index);
            } else {
                long[] jArr2 = new long[((i * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, index);
                System.arraycopy(this.f78558c, index, jArr2, index + 1, this.f78559d - index);
                this.f78558c = jArr2;
            }
            this.f78558c[index] = element;
            this.f78559d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
