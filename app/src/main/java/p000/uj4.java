package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class uj4 extends AbstractC13839v3<Double> implements w98.InterfaceC14496c, RandomAccess, kbd {

    /* JADX INFO: renamed from: e */
    public static final uj4 f88091e = new uj4(new double[0], 0, false);

    /* JADX INFO: renamed from: c */
    public double[] f88092c;

    /* JADX INFO: renamed from: d */
    public int f88093d;

    public uj4() {
        this(new double[10], 0, true);
    }

    public static uj4 emptyList() {
        return f88091e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f88093d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f88093d;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m23762a();
        w98.m24432a(collection);
        if (!(collection instanceof uj4)) {
            return super.addAll(collection);
        }
        uj4 uj4Var = (uj4) collection;
        int i = uj4Var.f88093d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f88093d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f88092c;
        if (i3 > dArr.length) {
            this.f88092c = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(uj4Var.f88092c, 0, this.f88092c, this.f88093d, uj4Var.f88093d);
        this.f88093d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.w98.InterfaceC14496c
    public void addDouble(double element) {
        m23762a();
        int i = this.f88093d;
        double[] dArr = this.f88092c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f88092c = dArr2;
        }
        double[] dArr3 = this.f88092c;
        int i2 = this.f88093d;
        this.f88093d = i2 + 1;
        dArr3[i2] = element;
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
        if (!(o instanceof uj4)) {
            return super.equals(o);
        }
        uj4 uj4Var = (uj4) o;
        if (this.f88093d != uj4Var.f88093d) {
            return false;
        }
        double[] dArr = uj4Var.f88092c;
        for (int i = 0; i < this.f88093d; i++) {
            if (Double.doubleToLongBits(this.f88092c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.w98.InterfaceC14496c
    public double getDouble(int index) {
        ensureIndexInRange(index);
        return this.f88092c[index];
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.f88093d; i++) {
            iHashLong = (iHashLong * 31) + w98.hashLong(Double.doubleToLongBits(this.f88092c[i]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) element).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f88092c[i] == dDoubleValue) {
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
        double[] dArr = this.f88092c;
        System.arraycopy(dArr, toIndex, dArr, fromIndex, this.f88093d - toIndex);
        this.f88093d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.w98.InterfaceC14496c
    public double setDouble(int index, double element) {
        m23762a();
        ensureIndexInRange(index);
        double[] dArr = this.f88092c;
        double d = dArr[index];
        dArr[index] = element;
        return d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f88093d;
    }

    private uj4(double[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f88092c = other;
        this.f88093d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int index) {
        return Double.valueOf(getDouble(index));
    }

    @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public w98.InterfaceC14504k<Double> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f88093d) {
            return new uj4(Arrays.copyOf(this.f88092c, capacity), this.f88093d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Double remove(int index) {
        m23762a();
        ensureIndexInRange(index);
        double[] dArr = this.f88092c;
        double d = dArr[index];
        if (index < this.f88093d - 1) {
            System.arraycopy(dArr, index + 1, dArr, index, (r3 - index) - 1);
        }
        this.f88093d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Double set(int index, Double element) {
        return Double.valueOf(setDouble(index, element.doubleValue()));
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double element) {
        addDouble(element.doubleValue());
        return true;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public void add(int index, Double element) {
        addDouble(index, element.doubleValue());
    }

    private void addDouble(int index, double element) {
        int i;
        m23762a();
        if (index >= 0 && index <= (i = this.f88093d)) {
            double[] dArr = this.f88092c;
            if (i < dArr.length) {
                System.arraycopy(dArr, index, dArr, index + 1, i - index);
            } else {
                double[] dArr2 = new double[((i * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, index);
                System.arraycopy(this.f88092c, index, dArr2, index + 1, this.f88093d - index);
                this.f88092c = dArr2;
            }
            this.f88092c[index] = element;
            this.f88093d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
