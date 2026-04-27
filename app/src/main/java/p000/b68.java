package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class b68 extends AbstractC13839v3<Integer> implements w98.InterfaceC14501h, RandomAccess, kbd {

    /* JADX INFO: renamed from: e */
    public static final b68 f12785e = new b68(new int[0], 0, false);

    /* JADX INFO: renamed from: c */
    public int[] f12786c;

    /* JADX INFO: renamed from: d */
    public int f12787d;

    public b68() {
        this(new int[10], 0, true);
    }

    public static b68 emptyList() {
        return f12785e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f12787d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f12787d;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m23762a();
        w98.m24432a(collection);
        if (!(collection instanceof b68)) {
            return super.addAll(collection);
        }
        b68 b68Var = (b68) collection;
        int i = b68Var.f12787d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12787d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f12786c;
        if (i3 > iArr.length) {
            this.f12786c = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(b68Var.f12786c, 0, this.f12786c, this.f12787d, b68Var.f12787d);
        this.f12787d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.w98.InterfaceC14501h
    public void addInt(int element) {
        m23762a();
        int i = this.f12787d;
        int[] iArr = this.f12786c;
        if (i == iArr.length) {
            int[] iArr2 = new int[((i * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f12786c = iArr2;
        }
        int[] iArr3 = this.f12786c;
        int i2 = this.f12787d;
        this.f12787d = i2 + 1;
        iArr3[i2] = element;
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
        if (!(o instanceof b68)) {
            return super.equals(o);
        }
        b68 b68Var = (b68) o;
        if (this.f12787d != b68Var.f12787d) {
            return false;
        }
        int[] iArr = b68Var.f12786c;
        for (int i = 0; i < this.f12787d; i++) {
            if (this.f12786c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.w98.InterfaceC14501h
    public int getInt(int index) {
        ensureIndexInRange(index);
        return this.f12786c[index];
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12787d; i2++) {
            i = (i * 31) + this.f12786c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) element).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f12786c[i] == iIntValue) {
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
        int[] iArr = this.f12786c;
        System.arraycopy(iArr, toIndex, iArr, fromIndex, this.f12787d - toIndex);
        this.f12787d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.w98.InterfaceC14501h
    public int setInt(int index, int element) {
        m23762a();
        ensureIndexInRange(index);
        int[] iArr = this.f12786c;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12787d;
    }

    private b68(int[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f12786c = other;
        this.f12787d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int index) {
        return Integer.valueOf(getInt(index));
    }

    @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public w98.InterfaceC14504k<Integer> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f12787d) {
            return new b68(Arrays.copyOf(this.f12786c, capacity), this.f12787d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Integer remove(int index) {
        m23762a();
        ensureIndexInRange(index);
        int[] iArr = this.f12786c;
        int i = iArr[index];
        if (index < this.f12787d - 1) {
            System.arraycopy(iArr, index + 1, iArr, index, (r2 - index) - 1);
        }
        this.f12787d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Integer set(int index, Integer element) {
        return Integer.valueOf(setInt(index, element.intValue()));
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer element) {
        addInt(element.intValue());
        return true;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public void add(int index, Integer element) {
        addInt(index, element.intValue());
    }

    private void addInt(int index, int element) {
        int i;
        m23762a();
        if (index >= 0 && index <= (i = this.f12787d)) {
            int[] iArr = this.f12786c;
            if (i < iArr.length) {
                System.arraycopy(iArr, index, iArr, index + 1, i - index);
            } else {
                int[] iArr2 = new int[((i * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, index);
                System.arraycopy(this.f12786c, index, iArr2, index + 1, this.f12787d - index);
                this.f12786c = iArr2;
            }
            this.f12786c[index] = element;
            this.f12787d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
