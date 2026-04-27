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
public final class obf extends pbf {

    /* JADX INFO: renamed from: a */
    public static final int f67095a = 2;

    /* JADX INFO: renamed from: b */
    public static final short f67096b = 16384;

    /* JADX INFO: renamed from: obf$a */
    public enum EnumC10291a implements Comparator<short[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(short[] left, short[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = obf.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    /* JADX INFO: renamed from: obf$b */
    @gd7
    public static class C10292b extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final short[] f67099a;

        /* JADX INFO: renamed from: b */
        public final int f67100b;

        /* JADX INFO: renamed from: c */
        public final int f67101c;

        public C10292b(short[] array) {
            this(array, 0, array.length);
        }

        /* JADX INFO: renamed from: a */
        public short[] m18569a() {
            return Arrays.copyOfRange(this.f67099a, this.f67100b, this.f67101c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return (target instanceof Short) && obf.indexOf(this.f67099a, ((Short) target).shortValue(), this.f67100b, this.f67101c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C10292b)) {
                return super.equals(object);
            }
            C10292b c10292b = (C10292b) object;
            int size = size();
            if (c10292b.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f67099a[this.f67100b + i] != c10292b.f67099a[c10292b.f67100b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.f67100b; i < this.f67101c; i++) {
                iHashCode = (iHashCode * 31) + obf.hashCode(this.f67099a[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            int iIndexOf;
            if (!(target instanceof Short) || (iIndexOf = obf.indexOf(this.f67099a, ((Short) target).shortValue(), this.f67100b, this.f67101c)) < 0) {
                return -1;
            }
            return iIndexOf - this.f67100b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            int iLastIndexOf;
            if (!(target instanceof Short) || (iLastIndexOf = obf.lastIndexOf(this.f67099a, ((Short) target).shortValue(), this.f67100b, this.f67101c)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.f67100b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67101c - this.f67100b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            short[] sArr = this.f67099a;
            int i = this.f67100b;
            return new C10292b(sArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append(C4584d2.f28242k);
            sb.append((int) this.f67099a[this.f67100b]);
            int i = this.f67100b;
            while (true) {
                i++;
                if (i >= this.f67101c) {
                    sb.append(C4584d2.f28243l);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.f67099a[i]);
            }
        }

        public C10292b(short[] array, int start, int end) {
            this.f67099a = array;
            this.f67100b = start;
            this.f67101c = end;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int index) {
            v7d.checkElementIndex(index, size());
            return Short.valueOf(this.f67099a[this.f67100b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int index, Short element) {
            v7d.checkElementIndex(index, size());
            short[] sArr = this.f67099a;
            int i = this.f67100b;
            short s = sArr[i + index];
            sArr[i + index] = ((Short) v7d.checkNotNull(element)).shortValue();
            return Short.valueOf(s);
        }
    }

    /* JADX INFO: renamed from: obf$c */
    public static final class C10293c extends wz2<String, Short> implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final C10293c f67102c = new C10293c();
        private static final long serialVersionUID = 1;

        private C10293c() {
        }

        private Object readResolve() {
            return f67102c;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo13178d(Short value) {
            return value.toString();
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Short mo13179e(String value) {
            return Short.decode(value);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    private obf() {
    }

    public static List<Short> asList(short... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new C10292b(backingArray);
    }

    public static short checkedCast(long value) {
        short s = (short) value;
        v7d.checkArgument(((long) s) == value, "Out of range: %s", value);
        return s;
    }

    public static int compare(short a, short b) {
        return a - b;
    }

    public static short[] concat(short[]... arrays) {
        int length = 0;
        for (short[] sArr : arrays) {
            length += sArr.length;
        }
        short[] sArr2 = new short[length];
        int length2 = 0;
        for (short[] sArr3 : arrays) {
            System.arraycopy(sArr3, 0, sArr2, length2, sArr3.length);
            length2 += sArr3.length;
        }
        return sArr2;
    }

    public static short constrainToRange(short value, short min, short max) {
        v7d.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", (int) min, (int) max);
        return value < min ? min : value < max ? value : max;
    }

    public static boolean contains(short[] array, short target) {
        for (short s : array) {
            if (s == target) {
                return true;
            }
        }
        return false;
    }

    public static short[] ensureCapacity(short[] array, int minLength, int padding) {
        v7d.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        v7d.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @jd7
    public static short fromByteArray(byte[] bytes) {
        v7d.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return fromBytes(bytes[0], bytes[1]);
    }

    @jd7
    public static short fromBytes(byte b1, byte b2) {
        return (short) ((b1 << 8) | (b2 & 255));
    }

    public static int hashCode(short value) {
        return value;
    }

    public static int indexOf(short[] array, short target) {
        return indexOf(array, target, 0, array.length);
    }

    public static String join(String separator, short... array) {
        v7d.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 6);
        sb.append((int) array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append((int) array[i]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(short[] array, short target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static Comparator<short[]> lexicographicalComparator() {
        return EnumC10291a.INSTANCE;
    }

    @jd7("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short max(short... array) {
        v7d.checkArgument(array.length > 0);
        short s = array[0];
        for (int i = 1; i < array.length; i++) {
            short s2 = array[i];
            if (s2 > s) {
                s = s2;
            }
        }
        return s;
    }

    @jd7("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short min(short... array) {
        v7d.checkArgument(array.length > 0);
        short s = array[0];
        for (int i = 1; i < array.length; i++) {
            short s2 = array[i];
            if (s2 < s) {
                s = s2;
            }
        }
        return s;
    }

    public static void reverse(short[] array) {
        v7d.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void rotate(short[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static short saturatedCast(long value) {
        return value > 32767 ? taf.f84095c : value < -32768 ? taf.f84094b : (short) value;
    }

    public static void sortDescending(short[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static wz2<String, Short> stringConverter() {
        return C10293c.f67102c;
    }

    public static short[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof C10292b) {
            return ((C10292b) collection).m18569a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = ((Number) v7d.checkNotNull(array[i])).shortValue();
        }
        return sArr;
    }

    @jd7
    public static byte[] toByteArray(short value) {
        return new byte[]{(byte) (value >> 8), (byte) value};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(short[] array, short target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(short[] array, short target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotate(short[] array, int distance, int fromIndex, int toIndex) {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(short[] r5, short[] r6) {
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
            short r3 = r5[r3]
            short r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: p000.obf.indexOf(short[], short[]):int");
    }

    public static void reverse(short[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            short s = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = s;
            fromIndex++;
        }
    }

    public static void sortDescending(short[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }
}
