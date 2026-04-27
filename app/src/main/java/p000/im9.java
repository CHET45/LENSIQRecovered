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
@gd7
@ox4
public final class im9 {

    /* JADX INFO: renamed from: a */
    public static final int f47438a = 8;

    /* JADX INFO: renamed from: b */
    public static final long f47439b = 4611686018427387904L;

    /* JADX INFO: renamed from: im9$a */
    public static final class C7496a {

        /* JADX INFO: renamed from: a */
        public static final byte[] f47440a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            f47440a = bArr;
        }

        private C7496a() {
        }

        /* JADX INFO: renamed from: a */
        public static int m13176a(char c) {
            if (c < 128) {
                return f47440a[c];
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: im9$b */
    public enum EnumC7497b implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] left, long[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = im9.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    /* JADX INFO: renamed from: im9$c */
    @gd7
    public static class C7498c extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final long[] f47443a;

        /* JADX INFO: renamed from: b */
        public final int f47444b;

        /* JADX INFO: renamed from: c */
        public final int f47445c;

        public C7498c(long[] array) {
            this(array, 0, array.length);
        }

        /* JADX INFO: renamed from: a */
        public long[] m13177a() {
            return Arrays.copyOfRange(this.f47443a, this.f47444b, this.f47445c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return (target instanceof Long) && im9.indexOf(this.f47443a, ((Long) target).longValue(), this.f47444b, this.f47445c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C7498c)) {
                return super.equals(object);
            }
            C7498c c7498c = (C7498c) object;
            int size = size();
            if (c7498c.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f47443a[this.f47444b + i] != c7498c.f47443a[c7498c.f47444b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.f47444b; i < this.f47445c; i++) {
                iHashCode = (iHashCode * 31) + im9.hashCode(this.f47443a[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            int iIndexOf;
            if (!(target instanceof Long) || (iIndexOf = im9.indexOf(this.f47443a, ((Long) target).longValue(), this.f47444b, this.f47445c)) < 0) {
                return -1;
            }
            return iIndexOf - this.f47444b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            int iLastIndexOf;
            if (!(target instanceof Long) || (iLastIndexOf = im9.lastIndexOf(this.f47443a, ((Long) target).longValue(), this.f47444b, this.f47445c)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.f47444b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f47445c - this.f47444b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            long[] jArr = this.f47443a;
            int i = this.f47444b;
            return new C7498c(jArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append(C4584d2.f28242k);
            sb.append(this.f47443a[this.f47444b]);
            int i = this.f47444b;
            while (true) {
                i++;
                if (i >= this.f47445c) {
                    sb.append(C4584d2.f28243l);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f47443a[i]);
            }
        }

        public C7498c(long[] array, int start, int end) {
            this.f47443a = array;
            this.f47444b = start;
            this.f47445c = end;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int index) {
            v7d.checkElementIndex(index, size());
            return Long.valueOf(this.f47443a[this.f47444b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int index, Long element) {
            v7d.checkElementIndex(index, size());
            long[] jArr = this.f47443a;
            int i = this.f47444b;
            long j = jArr[i + index];
            jArr[i + index] = ((Long) v7d.checkNotNull(element)).longValue();
            return Long.valueOf(j);
        }
    }

    /* JADX INFO: renamed from: im9$d */
    public static final class C7499d extends wz2<String, Long> implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final C7499d f47446c = new C7499d();
        private static final long serialVersionUID = 1;

        private C7499d() {
        }

        private Object readResolve() {
            return f47446c;
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo13178d(Long value) {
            return value.toString();
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long mo13179e(String value) {
            return Long.decode(value);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    private im9() {
    }

    public static List<Long> asList(long... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new C7498c(backingArray);
    }

    private static int checkNoOverflow(long result) {
        int i = (int) result;
        v7d.checkArgument(result == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i;
    }

    public static int compare(long a, long b) {
        if (a < b) {
            return -1;
        }
        return a > b ? 1 : 0;
    }

    public static long[] concat(long[]... arrays) {
        long length = 0;
        for (long[] jArr : arrays) {
            length += (long) jArr.length;
        }
        long[] jArr2 = new long[checkNoOverflow(length)];
        int length2 = 0;
        for (long[] jArr3 : arrays) {
            System.arraycopy(jArr3, 0, jArr2, length2, jArr3.length);
            length2 += jArr3.length;
        }
        return jArr2;
    }

    public static long constrainToRange(long value, long min, long max) {
        v7d.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static boolean contains(long[] array, long target) {
        for (long j : array) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }

    public static long[] ensureCapacity(long[] array, int minLength, int padding) {
        v7d.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        v7d.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static long fromByteArray(byte[] bytes) {
        v7d.checkArgument(bytes.length >= 8, "array too small: %s < %s", bytes.length, 8);
        return fromBytes(bytes[0], bytes[1], bytes[2], bytes[3], bytes[4], bytes[5], bytes[6], bytes[7]);
    }

    public static long fromBytes(byte b1, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b1) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    public static int hashCode(long value) {
        return (int) (value ^ (value >>> 32));
    }

    public static int indexOf(long[] array, long target) {
        return indexOf(array, target, 0, array.length);
    }

    public static String join(String separator, long... array) {
        v7d.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 10);
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(long[] array, long target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return EnumC7497b.INSTANCE;
    }

    public static long max(long... array) {
        v7d.checkArgument(array.length > 0);
        long j = array[0];
        for (int i = 1; i < array.length; i++) {
            long j2 = array[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static long min(long... array) {
        v7d.checkArgument(array.length > 0);
        long j = array[0];
        for (int i = 1; i < array.length; i++) {
            long j2 = array[i];
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public static void reverse(long[] array) {
        v7d.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void rotate(long[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static void sortDescending(long[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static wz2<String, Long> stringConverter() {
        return C7499d.f47446c;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof C7498c) {
            return ((C7498c) collection).m13177a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) v7d.checkNotNull(array[i])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long value) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & value);
            value >>= 8;
        }
        return bArr;
    }

    @wx1
    public static Long tryParse(String string) {
        return tryParse(string, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(long[] array, long target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(long[] array, long target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotate(long[] array, int distance, int fromIndex, int toIndex) {
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
    public static Long tryParse(String string, int radix) {
        if (((String) v7d.checkNotNull(string)).isEmpty()) {
            return null;
        }
        if (radix < 2 || radix > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + radix);
        }
        int i = string.charAt(0) == '-' ? 1 : 0;
        if (i == string.length()) {
            return null;
        }
        int i2 = i + 1;
        int iM13176a = C7496a.m13176a(string.charAt(i));
        if (iM13176a < 0 || iM13176a >= radix) {
            return null;
        }
        long j = -iM13176a;
        long j2 = radix;
        long j3 = Long.MIN_VALUE / j2;
        while (i2 < string.length()) {
            int i3 = i2 + 1;
            int iM13176a2 = C7496a.m13176a(string.charAt(i2));
            if (iM13176a2 < 0 || iM13176a2 >= radix || j < j3) {
                return null;
            }
            long j4 = j * j2;
            long j5 = iM13176a2;
            if (j4 < j5 - Long.MIN_VALUE) {
                return null;
            }
            j = j4 - j5;
            i2 = i3;
        }
        if (i != 0) {
            return Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(long[] r7, long[] r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: p000.im9.indexOf(long[], long[]):int");
    }

    public static void reverse(long[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            long j = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = j;
            fromIndex++;
        }
    }

    public static void sortDescending(long[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }
}
