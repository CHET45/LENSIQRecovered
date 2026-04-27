package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class a46 extends AbstractC13839v3<Float> implements w98.InterfaceC14500g, RandomAccess, kbd {

    /* JADX INFO: renamed from: e */
    public static final a46 f359e = new a46(new float[0], 0, false);

    /* JADX INFO: renamed from: c */
    public float[] f360c;

    /* JADX INFO: renamed from: d */
    public int f361d;

    public a46() {
        this(new float[10], 0, true);
    }

    public static a46 emptyList() {
        return f359e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f361d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f361d;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m23762a();
        w98.m24432a(collection);
        if (!(collection instanceof a46)) {
            return super.addAll(collection);
        }
        a46 a46Var = (a46) collection;
        int i = a46Var.f361d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f361d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f360c;
        if (i3 > fArr.length) {
            this.f360c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(a46Var.f360c, 0, this.f360c, this.f361d, a46Var.f361d);
        this.f361d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.w98.InterfaceC14500g
    public void addFloat(float element) {
        m23762a();
        int i = this.f361d;
        float[] fArr = this.f360c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f360c = fArr2;
        }
        float[] fArr3 = this.f360c;
        int i2 = this.f361d;
        this.f361d = i2 + 1;
        fArr3[i2] = element;
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
        if (!(o instanceof a46)) {
            return super.equals(o);
        }
        a46 a46Var = (a46) o;
        if (this.f361d != a46Var.f361d) {
            return false;
        }
        float[] fArr = a46Var.f360c;
        for (int i = 0; i < this.f361d; i++) {
            if (Float.floatToIntBits(this.f360c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.w98.InterfaceC14500g
    public float getFloat(int index) {
        ensureIndexInRange(index);
        return this.f360c[index];
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f361d; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f360c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) element).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f360c[i] == fFloatValue) {
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
        float[] fArr = this.f360c;
        System.arraycopy(fArr, toIndex, fArr, fromIndex, this.f361d - toIndex);
        this.f361d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.w98.InterfaceC14500g
    public float setFloat(int index, float element) {
        m23762a();
        ensureIndexInRange(index);
        float[] fArr = this.f360c;
        float f = fArr[index];
        fArr[index] = element;
        return f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f361d;
    }

    private a46(float[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f360c = other;
        this.f361d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int index) {
        return Float.valueOf(getFloat(index));
    }

    @Override // p000.w98.InterfaceC14504k, p000.w98.InterfaceC14500g
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public w98.InterfaceC14504k<Float> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f361d) {
            return new a46(Arrays.copyOf(this.f360c, capacity), this.f361d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Float remove(int index) {
        m23762a();
        ensureIndexInRange(index);
        float[] fArr = this.f360c;
        float f = fArr[index];
        if (index < this.f361d - 1) {
            System.arraycopy(fArr, index + 1, fArr, index, (r2 - index) - 1);
        }
        this.f361d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public Float set(int index, Float element) {
        return Float.valueOf(setFloat(index, element.floatValue()));
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float element) {
        addFloat(element.floatValue());
        return true;
    }

    @Override // p000.AbstractC13839v3, java.util.AbstractList, java.util.List
    public void add(int index, Float element) {
        addFloat(index, element.floatValue());
    }

    private void addFloat(int index, float element) {
        int i;
        m23762a();
        if (index >= 0 && index <= (i = this.f361d)) {
            float[] fArr = this.f360c;
            if (i < fArr.length) {
                System.arraycopy(fArr, index, fArr, index + 1, i - index);
            } else {
                float[] fArr2 = new float[((i * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, index);
                System.arraycopy(this.f360c, index, fArr2, index + 1, this.f361d - index);
                this.f360c = fArr2;
            }
            this.f360c[index] = element;
            this.f361d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
