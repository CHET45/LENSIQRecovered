package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class b46 extends AbstractC14369w3<Float> implements v98.InterfaceC13950f, RandomAccess, lbd {

    /* JADX INFO: renamed from: e */
    public static final b46 f12667e = new b46(new float[0], 0, false);

    /* JADX INFO: renamed from: c */
    public float[] f12668c;

    /* JADX INFO: renamed from: d */
    public int f12669d;

    public b46() {
        this(new float[10], 0, true);
    }

    public static b46 emptyList() {
        return f12667e;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.f12669d) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.f12669d;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m24324a();
        v98.m23881a(collection);
        if (!(collection instanceof b46)) {
            return super.addAll(collection);
        }
        b46 b46Var = (b46) collection;
        int i = b46Var.f12669d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12669d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f12668c;
        if (i3 > fArr.length) {
            this.f12668c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(b46Var.f12668c, 0, this.f12668c, this.f12669d, b46Var.f12669d);
        this.f12669d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.v98.InterfaceC13950f
    public void addFloat(float element) {
        m24324a();
        int i = this.f12669d;
        float[] fArr = this.f12668c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f12668c = fArr2;
        }
        float[] fArr3 = this.f12668c;
        int i2 = this.f12669d;
        this.f12669d = i2 + 1;
        fArr3[i2] = element;
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
        if (!(o instanceof b46)) {
            return super.equals(o);
        }
        b46 b46Var = (b46) o;
        if (this.f12669d != b46Var.f12669d) {
            return false;
        }
        float[] fArr = b46Var.f12668c;
        for (int i = 0; i < this.f12669d; i++) {
            if (Float.floatToIntBits(this.f12668c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.v98.InterfaceC13950f
    public float getFloat(int index) {
        ensureIndexInRange(index);
        return this.f12668c[index];
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f12669d; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f12668c[i]);
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
            if (this.f12668c[i] == fFloatValue) {
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
        float[] fArr = this.f12668c;
        System.arraycopy(fArr, toIndex, fArr, fromIndex, this.f12669d - toIndex);
        this.f12669d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.v98.InterfaceC13950f
    public float setFloat(int index, float element) {
        m24324a();
        ensureIndexInRange(index);
        float[] fArr = this.f12668c;
        float f = fArr[index];
        fArr[index] = element;
        return f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12669d;
    }

    private b46(float[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f12668c = other;
        this.f12669d = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int index) {
        return Float.valueOf(getFloat(index));
    }

    @Override // p000.v98.InterfaceC13956l, p000.v98.InterfaceC13950f
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public v98.InterfaceC13956l<Float> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.f12669d) {
            return new b46(Arrays.copyOf(this.f12668c, capacity), this.f12669d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Float remove(int index) {
        m24324a();
        ensureIndexInRange(index);
        float[] fArr = this.f12668c;
        float f = fArr[index];
        if (index < this.f12669d - 1) {
            System.arraycopy(fArr, index + 1, fArr, index, (r2 - index) - 1);
        }
        this.f12669d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public Float set(int index, Float element) {
        return Float.valueOf(setFloat(index, element.floatValue()));
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float element) {
        addFloat(element.floatValue());
        return true;
    }

    @Override // p000.AbstractC14369w3, java.util.AbstractList, java.util.List
    public void add(int index, Float element) {
        addFloat(index, element.floatValue());
    }

    private void addFloat(int index, float element) {
        int i;
        m24324a();
        if (index >= 0 && index <= (i = this.f12669d)) {
            float[] fArr = this.f12668c;
            if (i < fArr.length) {
                System.arraycopy(fArr, index, fArr, index + 1, i - index);
            } else {
                float[] fArr2 = new float[((i * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, index);
                System.arraycopy(this.f12668c, index, fArr2, index + 1, this.f12669d - index);
                this.f12668c = fArr2;
            }
            this.f12668c[index] = element;
            this.f12669d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
