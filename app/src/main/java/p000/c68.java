package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class c68 extends AbstractC14369w3<Integer> implements v98.InterfaceC13951g, RandomAccess, lbd {

    /* JADX INFO: renamed from: e */
    public static final c68 f15843e = new c68(new int[0], 0, false);

    /* JADX INFO: renamed from: c */
    public int[] f15844c;

    /* JADX INFO: renamed from: d */
    public int f15845d;

    public c68() {
        this(new int[10], 0, true);
    }

    public static c68 emptyList() {
        return f15843e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f15845d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f15845d;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m24324a();
        v98.m23881a(collection);
        if (!(collection instanceof c68)) {
            return super.addAll(collection);
        }
        c68 c68Var = (c68) collection;
        int i = c68Var.f15845d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15845d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f15844c;
        if (i3 > iArr.length) {
            this.f15844c = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c68Var.f15844c, 0, this.f15844c, this.f15845d, c68Var.f15845d);
        this.f15845d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.v98.InterfaceC13951g
    public void addInt(int element) {
        m24324a();
        int i = this.f15845d;
        int[] iArr = this.f15844c;
        if (i == iArr.length) {
            int[] iArr2 = new int[((i * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f15844c = iArr2;
        }
        int[] iArr3 = this.f15844c;
        int i2 = this.f15845d;
        this.f15845d = i2 + 1;
        iArr3[i2] = element;
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
        if (!(o instanceof c68)) {
            return super.equals(o);
        }
        c68 c68Var = (c68) o;
        if (this.f15845d != c68Var.f15845d) {
            return false;
        }
        int[] iArr = c68Var.f15844c;
        for (int i = 0; i < this.f15845d; i++) {
            if (this.f15844c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.v98.InterfaceC13951g
    public int getInt(int index) {
        ensureIndexInRange(index);
        return this.f15844c[index];
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15845d; i2++) {
            i = (i * 31) + this.f15844c[i2];
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
            if (this.f15844c[i] == iIntValue) {
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
        int[] iArr = this.f15844c;
        System.arraycopy(iArr, toIndex, iArr, fromIndex, this.f15845d - toIndex);
        this.f15845d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.v98.InterfaceC13951g
    public int setInt(int index, int element) {
        m24324a();
        ensureIndexInRange(index);
        int[] iArr = this.f15844c;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15845d;
    }

    private c68(int[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f15844c = other;
        this.f15845d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int index) {
        return Integer.valueOf(getInt(index));
    }

    @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public v98.InterfaceC13956l<Integer> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f15845d) {
            return new c68(Arrays.copyOf(this.f15844c, capacity), this.f15845d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Integer remove(int index) {
        m24324a();
        ensureIndexInRange(index);
        int[] iArr = this.f15844c;
        int i = iArr[index];
        if (index < this.f15845d - 1) {
            System.arraycopy(iArr, index + 1, iArr, index, (r2 - index) - 1);
        }
        this.f15845d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Integer set(int index, Integer element) {
        return Integer.valueOf(setInt(index, element.intValue()));
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer element) {
        addInt(element.intValue());
        return true;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public void add(int index, Integer element) {
        addInt(index, element.intValue());
    }

    private void addInt(int index, int element) {
        int i;
        m24324a();
        if (index >= 0 && index <= (i = this.f15845d)) {
            int[] iArr = this.f15844c;
            if (i < iArr.length) {
                System.arraycopy(iArr, index, iArr, index + 1, i - index);
            } else {
                int[] iArr2 = new int[((i * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, index);
                System.arraycopy(this.f15844c, index, iArr2, index + 1, this.f15845d - index);
                this.f15844c = iArr2;
            }
            this.f15844c[index] = element;
            this.f15845d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
