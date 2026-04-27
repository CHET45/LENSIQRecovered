package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ox4
public final class qk4 extends rk4 {

    /* JADX INFO: renamed from: a */
    public static final int f74733a = 8;

    /* JADX INFO: renamed from: b */
    @jd7
    @yg8
    public static final Pattern f74734b = fpPattern();

    /* JADX INFO: renamed from: qk4$a */
    @gd7
    public static class C11520a extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final double[] f74735a;

        /* JADX INFO: renamed from: b */
        public final int f74736b;

        /* JADX INFO: renamed from: c */
        public final int f74737c;

        public C11520a(double[] array) {
            this(array, 0, array.length);
        }

        /* JADX INFO: renamed from: a */
        public double[] m20412a() {
            return Arrays.copyOfRange(this.f74735a, this.f74736b, this.f74737c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return (target instanceof Double) && qk4.indexOf(this.f74735a, ((Double) target).doubleValue(), this.f74736b, this.f74737c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C11520a)) {
                return super.equals(object);
            }
            C11520a c11520a = (C11520a) object;
            int size = size();
            if (c11520a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f74735a[this.f74736b + i] != c11520a.f74735a[c11520a.f74736b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.f74736b; i < this.f74737c; i++) {
                iHashCode = (iHashCode * 31) + qk4.hashCode(this.f74735a[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            int iIndexOf;
            if (!(target instanceof Double) || (iIndexOf = qk4.indexOf(this.f74735a, ((Double) target).doubleValue(), this.f74736b, this.f74737c)) < 0) {
                return -1;
            }
            return iIndexOf - this.f74736b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            int iLastIndexOf;
            if (!(target instanceof Double) || (iLastIndexOf = qk4.lastIndexOf(this.f74735a, ((Double) target).doubleValue(), this.f74736b, this.f74737c)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.f74736b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f74737c - this.f74736b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            double[] dArr = this.f74735a;
            int i = this.f74736b;
            return new C11520a(dArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append(C4584d2.f28242k);
            sb.append(this.f74735a[this.f74736b]);
            int i = this.f74736b;
            while (true) {
                i++;
                if (i >= this.f74737c) {
                    sb.append(C4584d2.f28243l);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f74735a[i]);
            }
        }

        public C11520a(double[] array, int start, int end) {
            this.f74735a = array;
            this.f74736b = start;
            this.f74737c = end;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int index) {
            v7d.checkElementIndex(index, size());
            return Double.valueOf(this.f74735a[this.f74736b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Double set(int index, Double element) {
            v7d.checkElementIndex(index, size());
            double[] dArr = this.f74735a;
            int i = this.f74736b;
            double d = dArr[i + index];
            dArr[i + index] = ((Double) v7d.checkNotNull(element)).doubleValue();
            return Double.valueOf(d);
        }
    }

    /* JADX INFO: renamed from: qk4$b */
    public static final class C11521b extends wz2<String, Double> implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final C11521b f74738c = new C11521b();
        private static final long serialVersionUID = 1;

        private C11521b() {
        }

        private Object readResolve() {
            return f74738c;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo13178d(Double value) {
            return value.toString();
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Double mo13179e(String value) {
            return Double.valueOf(value);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    /* JADX INFO: renamed from: qk4$c */
    public enum EnumC11522c implements Comparator<double[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(double[] left, double[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Double.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    private qk4() {
    }

    public static List<Double> asList(double... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new C11520a(backingArray);
    }

    public static int compare(double a, double b) {
        return Double.compare(a, b);
    }

    public static double[] concat(double[]... arrays) {
        int length = 0;
        for (double[] dArr : arrays) {
            length += dArr.length;
        }
        double[] dArr2 = new double[length];
        int length2 = 0;
        for (double[] dArr3 : arrays) {
            System.arraycopy(dArr3, 0, dArr2, length2, dArr3.length);
            length2 += dArr3.length;
        }
        return dArr2;
    }

    public static double constrainToRange(double value, double min, double max) {
        if (min <= max) {
            return Math.min(Math.max(value, min), max);
        }
        throw new IllegalArgumentException(u8g.lenientFormat("min (%s) must be less than or equal to max (%s)", Double.valueOf(min), Double.valueOf(max)));
    }

    public static boolean contains(double[] array, double target) {
        for (double d : array) {
            if (d == target) {
                return true;
            }
        }
        return false;
    }

    public static double[] ensureCapacity(double[] array, int minLength, int padding) {
        v7d.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        v7d.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @jd7
    private static Pattern fpPattern() {
        return Pattern.compile(("[+-]?(?:NaN|Infinity|" + ("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?") + es7.f33958g + ("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?") + c0b.f15434d).replace("#", "+"));
    }

    public static int hashCode(double value) {
        return Double.valueOf(value).hashCode();
    }

    public static int indexOf(double[] array, double target) {
        return indexOf(array, target, 0, array.length);
    }

    public static boolean isFinite(double value) {
        return Double.NEGATIVE_INFINITY < value && value < Double.POSITIVE_INFINITY;
    }

    public static String join(String separator, double... array) {
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

    public static int lastIndexOf(double[] array, double target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static Comparator<double[]> lexicographicalComparator() {
        return EnumC11522c.INSTANCE;
    }

    @jd7("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double max(double... array) {
        v7d.checkArgument(array.length > 0);
        double dMax = array[0];
        for (int i = 1; i < array.length; i++) {
            dMax = Math.max(dMax, array[i]);
        }
        return dMax;
    }

    @jd7("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double min(double... array) {
        v7d.checkArgument(array.length > 0);
        double dMin = array[0];
        for (int i = 1; i < array.length; i++) {
            dMin = Math.min(dMin, array[i]);
        }
        return dMin;
    }

    public static void reverse(double[] array) {
        v7d.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void rotate(double[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void sortDescending(double[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static wz2<String, Double> stringConverter() {
        return C11521b.f74738c;
    }

    public static double[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof C11520a) {
            return ((C11520a) collection).m20412a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((Number) v7d.checkNotNull(array[i])).doubleValue();
        }
        return dArr;
    }

    @wx1
    @jd7
    @yg8
    public static Double tryParse(String string) {
        if (!f74734b.matcher(string).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(string));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(double[] array, double target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(double[] array, double target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotate(double[] array, int distance, int fromIndex, int toIndex) {
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
    public static int indexOf(double[] r7, double[] r8) {
        /*
            java.lang.String r0 = "array"
            p000.v7d.checkNotNull(r7, r0)
            java.lang.String r0 = "target"
            p000.v7d.checkNotNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qk4.indexOf(double[], double[]):int");
    }

    public static void reverse(double[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            double d = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = d;
            fromIndex++;
        }
    }

    public static void sortDescending(double[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }
}
