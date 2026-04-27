package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class sa1 extends AbstractC14369w3<Boolean> implements v98.InterfaceC13945a, RandomAccess, lbd {

    /* JADX INFO: renamed from: e */
    public static final sa1 f81025e = new sa1(new boolean[0], 0, false);

    /* JADX INFO: renamed from: c */
    public boolean[] f81026c;

    /* JADX INFO: renamed from: d */
    public int f81027d;

    public sa1() {
        this(new boolean[10], 0, true);
    }

    public static sa1 emptyList() {
        return f81025e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f81027d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f81027d;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m24324a();
        v98.m23881a(collection);
        if (!(collection instanceof sa1)) {
            return super.addAll(collection);
        }
        sa1 sa1Var = (sa1) collection;
        int i = sa1Var.f81027d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f81027d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f81026c;
        if (i3 > zArr.length) {
            this.f81026c = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(sa1Var.f81026c, 0, this.f81026c, this.f81027d, sa1Var.f81027d);
        this.f81027d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.v98.InterfaceC13945a
    public void addBoolean(boolean element) {
        m24324a();
        int i = this.f81027d;
        boolean[] zArr = this.f81026c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f81026c = zArr2;
        }
        boolean[] zArr3 = this.f81026c;
        int i2 = this.f81027d;
        this.f81027d = i2 + 1;
        zArr3[i2] = element;
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
        if (!(o instanceof sa1)) {
            return super.equals(o);
        }
        sa1 sa1Var = (sa1) o;
        if (this.f81027d != sa1Var.f81027d) {
            return false;
        }
        boolean[] zArr = sa1Var.f81026c;
        for (int i = 0; i < this.f81027d; i++) {
            if (this.f81026c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.v98.InterfaceC13945a
    public boolean getBoolean(int index) {
        ensureIndexInRange(index);
        return this.f81026c[index];
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i = 0; i < this.f81027d; i++) {
            iHashBoolean = (iHashBoolean * 31) + v98.hashBoolean(this.f81026c[i]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) element).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f81026c[i] == zBooleanValue) {
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
        boolean[] zArr = this.f81026c;
        System.arraycopy(zArr, toIndex, zArr, fromIndex, this.f81027d - toIndex);
        this.f81027d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.v98.InterfaceC13945a
    public boolean setBoolean(int index, boolean element) {
        m24324a();
        ensureIndexInRange(index);
        boolean[] zArr = this.f81026c;
        boolean z = zArr[index];
        zArr[index] = element;
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f81027d;
    }

    private sa1(boolean[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f81026c = other;
        this.f81027d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int index) {
        return Boolean.valueOf(getBoolean(index));
    }

    @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public v98.InterfaceC13956l<Boolean> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f81027d) {
            return new sa1(Arrays.copyOf(this.f81026c, capacity), this.f81027d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Boolean remove(int index) {
        m24324a();
        ensureIndexInRange(index);
        boolean[] zArr = this.f81026c;
        boolean z = zArr[index];
        if (index < this.f81027d - 1) {
            System.arraycopy(zArr, index + 1, zArr, index, (r2 - index) - 1);
        }
        this.f81027d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Boolean set(int index, Boolean element) {
        return Boolean.valueOf(setBoolean(index, element.booleanValue()));
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean element) {
        addBoolean(element.booleanValue());
        return true;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public void add(int index, Boolean element) {
        addBoolean(index, element.booleanValue());
    }

    private void addBoolean(int index, boolean element) {
        int i;
        m24324a();
        if (index >= 0 && index <= (i = this.f81027d)) {
            boolean[] zArr = this.f81026c;
            if (i < zArr.length) {
                System.arraycopy(zArr, index, zArr, index + 1, i - index);
            } else {
                boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, index);
                System.arraycopy(this.f81026c, index, zArr2, index + 1, this.f81027d - index);
                this.f81026c = zArr2;
            }
            this.f81026c[index] = element;
            this.f81027d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
