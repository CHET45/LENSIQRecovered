package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ox4
public final class v56 extends w56 {

    /* JADX INFO: renamed from: a */
    public static final int f90006a = 4;

    /* JADX INFO: renamed from: v56$a */
    @gd7
    public static class C13872a extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final float[] f90007a;

        /* JADX INFO: renamed from: b */
        public final int f90008b;

        /* JADX INFO: renamed from: c */
        public final int f90009c;

        public C13872a(float[] array) {
            this(array, 0, array.length);
        }

        /* JADX INFO: renamed from: a */
        public float[] m23795a() {
            return Arrays.copyOfRange(this.f90007a, this.f90008b, this.f90009c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return (target instanceof Float) && v56.indexOf(this.f90007a, ((Float) target).floatValue(), this.f90008b, this.f90009c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C13872a)) {
                return super.equals(object);
            }
            C13872a c13872a = (C13872a) object;
            int size = size();
            if (c13872a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f90007a[this.f90008b + i] != c13872a.f90007a[c13872a.f90008b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.f90008b; i < this.f90009c; i++) {
                iHashCode = (iHashCode * 31) + v56.hashCode(this.f90007a[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            int iIndexOf;
            if (!(target instanceof Float) || (iIndexOf = v56.indexOf(this.f90007a, ((Float) target).floatValue(), this.f90008b, this.f90009c)) < 0) {
                return -1;
            }
            return iIndexOf - this.f90008b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            int iLastIndexOf;
            if (!(target instanceof Float) || (iLastIndexOf = v56.lastIndexOf(this.f90007a, ((Float) target).floatValue(), this.f90008b, this.f90009c)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.f90008b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f90009c - this.f90008b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            float[] fArr = this.f90007a;
            int i = this.f90008b;
            return new C13872a(fArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append(C4584d2.f28242k);
            sb.append(this.f90007a[this.f90008b]);
            int i = this.f90008b;
            while (true) {
                i++;
                if (i >= this.f90009c) {
                    sb.append(C4584d2.f28243l);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f90007a[i]);
            }
        }

        public C13872a(float[] array, int start, int end) {
            this.f90007a = array;
            this.f90008b = start;
            this.f90009c = end;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int index) {
            v7d.checkElementIndex(index, size());
            return Float.valueOf(this.f90007a[this.f90008b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int index, Float element) {
            v7d.checkElementIndex(index, size());
            float[] fArr = this.f90007a;
            int i = this.f90008b;
            float f = fArr[i + index];
            fArr[i + index] = ((Float) v7d.checkNotNull(element)).floatValue();
            return Float.valueOf(f);
        }
    }

    /* JADX INFO: renamed from: v56$b */
    public static final class C13873b extends wz2<String, Float> implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final C13873b f90010c = new C13873b();
        private static final long serialVersionUID = 1;

        private C13873b() {
        }

        private Object readResolve() {
            return f90010c;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo13178d(Float value) {
            return value.toString();
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Float mo13179e(String value) {
            return Float.valueOf(value);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    /* JADX INFO: renamed from: v56$c */
    public enum EnumC13874c implements Comparator<float[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(float[] left, float[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Float.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    private v56() {
    }

    public static List<Float> asList(float... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new C13872a(backingArray);
    }

    public static int compare(float a, float b) {
        return Float.compare(a, b);
    }

    public static float[] concat(float[]... arrays) {
        int length = 0;
        for (float[] fArr : arrays) {
            length += fArr.length;
        }
        float[] fArr2 = new float[length];
        int length2 = 0;
        for (float[] fArr3 : arrays) {
            System.arraycopy(fArr3, 0, fArr2, length2, fArr3.length);
            length2 += fArr3.length;
        }
        return fArr2;
    }

    public static float constrainToRange(float value, float min, float max) {
        if (min <= max) {
            return Math.min(Math.max(value, min), max);
        }
        throw new IllegalArgumentException(u8g.lenientFormat("min (%s) must be less than or equal to max (%s)", Float.valueOf(min), Float.valueOf(max)));
    }

    public static boolean contains(float[] array, float target) {
        for (float f : array) {
            if (f == target) {
                return true;
            }
        }
        return false;
    }

    public static float[] ensureCapacity(float[] array, int minLength, int padding) {
        v7d.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        v7d.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int hashCode(float value) {
        return Float.valueOf(value).hashCode();
    }

    public static int indexOf(float[] array, float target) {
        return indexOf(array, target, 0, array.length);
    }

    public static boolean isFinite(float value) {
        return Float.NEGATIVE_INFINITY < value && value < Float.POSITIVE_INFINITY;
    }

    public static String join(String separator, float... array) {
        v7d.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 12);
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(float[] array, float target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return EnumC13874c.INSTANCE;
    }

    @jd7("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float max(float... array) {
        v7d.checkArgument(array.length > 0);
        float fMax = array[0];
        for (int i = 1; i < array.length; i++) {
            fMax = Math.max(fMax, array[i]);
        }
        return fMax;
    }

    @jd7("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float min(float... array) {
        v7d.checkArgument(array.length > 0);
        float fMin = array[0];
        for (int i = 1; i < array.length; i++) {
            fMin = Math.min(fMin, array[i]);
        }
        return fMin;
    }

    public static void reverse(float[] array) {
        v7d.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void rotate(float[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void sortDescending(float[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static wz2<String, Float> stringConverter() {
        return C13873b.f90010c;
    }

    public static float[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof C13872a) {
            return ((C13872a) collection).m23795a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Number) v7d.checkNotNull(array[i])).floatValue();
        }
        return fArr;
    }

    @wx1
    @jd7
    @yg8
    public static Float tryParse(String string) {
        if (!qk4.f74734b.matcher(string).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(string));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(float[] array, float target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(float[] array, float target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotate(float[] array, int distance, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i = toIndex - fromIndex;
        int i2 = (-distance) % i;
        if (i2 < 0) {
            i2 += i;
        }
        int i3 = i2 + fromIndex;
        if (i3 == fromIndex) {
            return;
        }
        reverse(array, fromIndex, i3);
        reverse(array, i3, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(float[] r5, float[] r6) {
        /*
            java.lang.String r0 = "array"
            p000.v7d.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            p000.v7d.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v56.indexOf(float[], float[]):int");
    }

    public static void reverse(float[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            float f = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = f;
            fromIndex++;
        }
    }

    public static void sortDescending(float[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }
}
