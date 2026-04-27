package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class vj4 extends AbstractC14369w3<Double> implements v98.InterfaceC13946b, RandomAccess, lbd {

    /* JADX INFO: renamed from: e */
    public static final vj4 f91364e = new vj4(new double[0], 0, false);

    /* JADX INFO: renamed from: c */
    public double[] f91365c;

    /* JADX INFO: renamed from: d */
    public int f91366d;

    public vj4() {
        this(new double[10], 0, true);
    }

    public static vj4 emptyList() {
        return f91364e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f91366d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f91366d;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m24324a();
        v98.m23881a(collection);
        if (!(collection instanceof vj4)) {
            return super.addAll(collection);
        }
        vj4 vj4Var = (vj4) collection;
        int i = vj4Var.f91366d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f91366d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f91365c;
        if (i3 > dArr.length) {
            this.f91365c = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(vj4Var.f91365c, 0, this.f91365c, this.f91366d, vj4Var.f91366d);
        this.f91366d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.v98.InterfaceC13946b
    public void addDouble(double element) {
        m24324a();
        int i = this.f91366d;
        double[] dArr = this.f91365c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f91365c = dArr2;
        }
        double[] dArr3 = this.f91365c;
        int i2 = this.f91366d;
        this.f91366d = i2 + 1;
        dArr3[i2] = element;
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
        if (!(o instanceof vj4)) {
            return super.equals(o);
        }
        vj4 vj4Var = (vj4) o;
        if (this.f91366d != vj4Var.f91366d) {
            return false;
        }
        double[] dArr = vj4Var.f91365c;
        for (int i = 0; i < this.f91366d; i++) {
            if (Double.doubleToLongBits(this.f91365c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.v98.InterfaceC13946b
    public double getDouble(int index) {
        ensureIndexInRange(index);
        return this.f91365c[index];
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.f91366d; i++) {
            iHashLong = (iHashLong * 31) + v98.hashLong(Double.doubleToLongBits(this.f91365c[i]));
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
            if (this.f91365c[i] == dDoubleValue) {
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
        double[] dArr = this.f91365c;
        System.arraycopy(dArr, toIndex, dArr, fromIndex, this.f91366d - toIndex);
        this.f91366d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.v98.InterfaceC13946b
    public double setDouble(int index, double element) {
        m24324a();
        ensureIndexInRange(index);
        double[] dArr = this.f91365c;
        double d = dArr[index];
        dArr[index] = element;
        return d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f91366d;
    }

    private vj4(double[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f91365c = other;
        this.f91366d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int index) {
        return Double.valueOf(getDouble(index));
    }

    @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public v98.InterfaceC13956l<Double> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f91366d) {
            return new vj4(Arrays.copyOf(this.f91365c, capacity), this.f91366d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Double remove(int index) {
        m24324a();
        ensureIndexInRange(index);
        double[] dArr = this.f91365c;
        double d = dArr[index];
        if (index < this.f91366d - 1) {
            System.arraycopy(dArr, index + 1, dArr, index, (r3 - index) - 1);
        }
        this.f91366d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Double set(int index, Double element) {
        return Double.valueOf(setDouble(index, element.doubleValue()));
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double element) {
        addDouble(element.doubleValue());
        return true;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public void add(int index, Double element) {
        addDouble(index, element.doubleValue());
    }

    private void addDouble(int index, double element) {
        int i;
        m24324a();
        if (index >= 0 && index <= (i = this.f91366d)) {
            double[] dArr = this.f91365c;
            if (i < dArr.length) {
                System.arraycopy(dArr, index, dArr, index + 1, i - index);
            } else {
                double[] dArr2 = new double[((i * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, index);
                System.arraycopy(this.f91365c, index, dArr2, index + 1, this.f91366d - index);
                this.f91365c = dArr2;
            }
            this.f91365c[index] = element;
            this.f91366d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
