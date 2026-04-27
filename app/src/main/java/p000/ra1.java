package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class ra1 extends AbstractC13839v3<Boolean> implements w98.InterfaceC14495b, RandomAccess, kbd {

    /* JADX INFO: renamed from: e */
    public static final ra1 f77519e = new ra1(new boolean[0], 0, false);

    /* JADX INFO: renamed from: c */
    public boolean[] f77520c;

    /* JADX INFO: renamed from: d */
    public int f77521d;

    public ra1() {
        this(new boolean[10], 0, true);
    }

    public static ra1 emptyList() {
        return f77519e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f77521d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f77521d;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m23762a();
        w98.m24432a(collection);
        if (!(collection instanceof ra1)) {
            return super.addAll(collection);
        }
        ra1 ra1Var = (ra1) collection;
        int i = ra1Var.f77521d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f77521d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f77520c;
        if (i3 > zArr.length) {
            this.f77520c = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(ra1Var.f77520c, 0, this.f77520c, this.f77521d, ra1Var.f77521d);
        this.f77521d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.w98.InterfaceC14495b
    public void addBoolean(boolean element) {
        m23762a();
        int i = this.f77521d;
        boolean[] zArr = this.f77520c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f77520c = zArr2;
        }
        boolean[] zArr3 = this.f77520c;
        int i2 = this.f77521d;
        this.f77521d = i2 + 1;
        zArr3[i2] = element;
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
        if (!(o instanceof ra1)) {
            return super.equals(o);
        }
        ra1 ra1Var = (ra1) o;
        if (this.f77521d != ra1Var.f77521d) {
            return false;
        }
        boolean[] zArr = ra1Var.f77520c;
        for (int i = 0; i < this.f77521d; i++) {
            if (this.f77520c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.w98.InterfaceC14495b
    public boolean getBoolean(int index) {
        ensureIndexInRange(index);
        return this.f77520c[index];
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i = 0; i < this.f77521d; i++) {
            iHashBoolean = (iHashBoolean * 31) + w98.hashBoolean(this.f77520c[i]);
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
            if (this.f77520c[i] == zBooleanValue) {
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
        boolean[] zArr = this.f77520c;
        System.arraycopy(zArr, toIndex, zArr, fromIndex, this.f77521d - toIndex);
        this.f77521d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.w98.InterfaceC14495b
    public boolean setBoolean(int index, boolean element) {
        m23762a();
        ensureIndexInRange(index);
        boolean[] zArr = this.f77520c;
        boolean z = zArr[index];
        zArr[index] = element;
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f77521d;
    }

    private ra1(boolean[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f77520c = other;
        this.f77521d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int index) {
        return Boolean.valueOf(getBoolean(index));
    }

    @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public w98.InterfaceC14504k<Boolean> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f77521d) {
            return new ra1(Arrays.copyOf(this.f77520c, capacity), this.f77521d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Boolean remove(int index) {
        m23762a();
        ensureIndexInRange(index);
        boolean[] zArr = this.f77520c;
        boolean z = zArr[index];
        if (index < this.f77521d - 1) {
            System.arraycopy(zArr, index + 1, zArr, index, (r2 - index) - 1);
        }
        this.f77521d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Boolean set(int index, Boolean element) {
        return Boolean.valueOf(setBoolean(index, element.booleanValue()));
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean element) {
        addBoolean(element.booleanValue());
        return true;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public void add(int index, Boolean element) {
        addBoolean(index, element.booleanValue());
    }

    private void addBoolean(int index, boolean element) {
        int i;
        m23762a();
        if (index >= 0 && index <= (i = this.f77521d)) {
            boolean[] zArr = this.f77520c;
            if (i < zArr.length) {
                System.arraycopy(zArr, index, zArr, index + 1, i - index);
            } else {
                boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, index);
                System.arraycopy(this.f77520c, index, zArr2, index + 1, this.f77521d - index);
                this.f77520c = zArr2;
            }
            this.f77520c[index] = element;
            this.f77521d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
