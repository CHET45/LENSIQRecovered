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
public final class rd8 extends sd8 {

    /* JADX INFO: renamed from: a */
    public static final int f77933a = 4;

    /* JADX INFO: renamed from: b */
    public static final int f77934b = 1073741824;

    /* JADX INFO: renamed from: rd8$a */
    @gd7
    public static class C12028a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final int[] f77935a;

        /* JADX INFO: renamed from: b */
        public final int f77936b;

        /* JADX INFO: renamed from: c */
        public final int f77937c;

        public C12028a(int[] array) {
            this(array, 0, array.length);
        }

        /* JADX INFO: renamed from: a */
        public int[] m21177a() {
            return Arrays.copyOfRange(this.f77935a, this.f77936b, this.f77937c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return (target instanceof Integer) && rd8.indexOf(this.f77935a, ((Integer) target).intValue(), this.f77936b, this.f77937c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C12028a)) {
                return super.equals(object);
            }
            C12028a c12028a = (C12028a) object;
            int size = size();
            if (c12028a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f77935a[this.f77936b + i] != c12028a.f77935a[c12028a.f77936b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.f77936b; i < this.f77937c; i++) {
                iHashCode = (iHashCode * 31) + rd8.hashCode(this.f77935a[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            int iIndexOf;
            if (!(target instanceof Integer) || (iIndexOf = rd8.indexOf(this.f77935a, ((Integer) target).intValue(), this.f77936b, this.f77937c)) < 0) {
                return -1;
            }
            return iIndexOf - this.f77936b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            int iLastIndexOf;
            if (!(target instanceof Integer) || (iLastIndexOf = rd8.lastIndexOf(this.f77935a, ((Integer) target).intValue(), this.f77936b, this.f77937c)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.f77936b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f77937c - this.f77936b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            int[] iArr = this.f77935a;
            int i = this.f77936b;
            return new C12028a(iArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append(C4584d2.f28242k);
            sb.append(this.f77935a[this.f77936b]);
            int i = this.f77936b;
            while (true) {
                i++;
                if (i >= this.f77937c) {
                    sb.append(C4584d2.f28243l);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f77935a[i]);
            }
        }

        public C12028a(int[] array, int start, int end) {
            this.f77935a = array;
            this.f77936b = start;
            this.f77937c = end;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int index) {
            v7d.checkElementIndex(index, size());
            return Integer.valueOf(this.f77935a[this.f77936b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int index, Integer element) {
            v7d.checkElementIndex(index, size());
            int[] iArr = this.f77935a;
            int i = this.f77936b;
            int i2 = iArr[i + index];
            iArr[i + index] = ((Integer) v7d.checkNotNull(element)).intValue();
            return Integer.valueOf(i2);
        }
    }

    /* JADX INFO: renamed from: rd8$b */
    public static final class C12029b extends wz2<String, Integer> implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final C12029b f77938c = new C12029b();
        private static final long serialVersionUID = 1;

        private C12029b() {
        }

        private Object readResolve() {
            return f77938c;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo13178d(Integer value) {
            return value.toString();
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer mo13179e(String value) {
            return Integer.decode(value);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* JADX INFO: renamed from: rd8$c */
    public enum EnumC12030c implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] left, int[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = rd8.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    private rd8() {
    }

    public static List<Integer> asList(int... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new C12028a(backingArray);
    }

    public static int checkedCast(long value) {
        int i = (int) value;
        v7d.checkArgument(((long) i) == value, "Out of range: %s", value);
        return i;
    }

    public static int compare(int a, int b) {
        if (a < b) {
            return -1;
        }
        return a > b ? 1 : 0;
    }

    public static int[] concat(int[]... arrays) {
        int length = 0;
        for (int[] iArr : arrays) {
            length += iArr.length;
        }
        int[] iArr2 = new int[length];
        int length2 = 0;
        for (int[] iArr3 : arrays) {
            System.arraycopy(iArr3, 0, iArr2, length2, iArr3.length);
            length2 += iArr3.length;
        }
        return iArr2;
    }

    public static int constrainToRange(int value, int min, int max) {
        v7d.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static boolean contains(int[] array, int target) {
        for (int i : array) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    public static int[] ensureCapacity(int[] array, int minLength, int padding) {
        v7d.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        v7d.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int fromByteArray(byte[] bytes) {
        v7d.checkArgument(bytes.length >= 4, "array too small: %s < %s", bytes.length, 4);
        return fromBytes(bytes[0], bytes[1], bytes[2], bytes[3]);
    }

    public static int fromBytes(byte b1, byte b2, byte b3, byte b4) {
        return (b1 << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int hashCode(int value) {
        return value;
    }

    public static int indexOf(int[] array, int target) {
        return indexOf(array, target, 0, array.length);
    }

    public static String join(String separator, int... array) {
        v7d.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 5);
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(int[] array, int target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return EnumC12030c.INSTANCE;
    }

    @jd7("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int max(int... array) {
        v7d.checkArgument(array.length > 0);
        int i = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            int i3 = array[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    @jd7("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int min(int... array) {
        v7d.checkArgument(array.length > 0);
        int i = array[0];
        for (int i2 = 1; i2 < array.length; i2++) {
            int i3 = array[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static void reverse(int[] array) {
        v7d.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void rotate(int[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static int saturatedCast(long value) {
        if (value > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (value < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }

    public static void sortDescending(int[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static wz2<String, Integer> stringConverter() {
        return C12029b.f77938c;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof C12028a) {
            return ((C12028a) collection).m21177a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) v7d.checkNotNull(array[i])).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(int value) {
        return new byte[]{(byte) (value >> 24), (byte) (value >> 16), (byte) (value >> 8), (byte) value};
    }

    @wx1
    public static Integer tryParse(String string) {
        return tryParse(string, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(int[] array, int target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(int[] array, int target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotate(int[] array, int distance, int fromIndex, int toIndex) {
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

    @wx1
    public static Integer tryParse(String string, int radix) {
        Long lTryParse = im9.tryParse(string, radix);
        if (lTryParse == null || lTryParse.longValue() != lTryParse.intValue()) {
            return null;
        }
        return Integer.valueOf(lTryParse.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(int[] r5, int[] r6) {
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
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rd8.indexOf(int[], int[]):int");
    }

    public static void reverse(int[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            int i2 = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = i2;
            fromIndex++;
        }
    }

    public static void sortDescending(int[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }
}
