package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.internal.p017ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ox4
public final class rw1 {

    /* JADX INFO: renamed from: a */
    public static final int f79908a = 2;

    /* JADX INFO: renamed from: rw1$a */
    @gd7
    public static class C12324a extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final char[] f79909a;

        /* JADX INFO: renamed from: b */
        public final int f79910b;

        /* JADX INFO: renamed from: c */
        public final int f79911c;

        public C12324a(char[] array) {
            this(array, 0, array.length);
        }

        /* JADX INFO: renamed from: a */
        public char[] m21581a() {
            return Arrays.copyOfRange(this.f79909a, this.f79910b, this.f79911c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return (target instanceof Character) && rw1.indexOf(this.f79909a, ((Character) target).charValue(), this.f79910b, this.f79911c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C12324a)) {
                return super.equals(object);
            }
            C12324a c12324a = (C12324a) object;
            int size = size();
            if (c12324a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f79909a[this.f79910b + i] != c12324a.f79909a[c12324a.f79910b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.f79910b; i < this.f79911c; i++) {
                iHashCode = (iHashCode * 31) + rw1.hashCode(this.f79909a[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            int iIndexOf;
            if (!(target instanceof Character) || (iIndexOf = rw1.indexOf(this.f79909a, ((Character) target).charValue(), this.f79910b, this.f79911c)) < 0) {
                return -1;
            }
            return iIndexOf - this.f79910b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            int iLastIndexOf;
            if (!(target instanceof Character) || (iLastIndexOf = rw1.lastIndexOf(this.f79909a, ((Character) target).charValue(), this.f79910b, this.f79911c)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.f79910b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f79911c - this.f79910b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            char[] cArr = this.f79909a;
            int i = this.f79910b;
            return new C12324a(cArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
            sb.append(C4584d2.f28242k);
            sb.append(this.f79909a[this.f79910b]);
            int i = this.f79910b;
            while (true) {
                i++;
                if (i >= this.f79911c) {
                    sb.append(C4584d2.f28243l);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f79909a[i]);
            }
        }

        public C12324a(char[] array, int start, int end) {
            this.f79909a = array;
            this.f79910b = start;
            this.f79911c = end;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int index) {
            v7d.checkElementIndex(index, size());
            return Character.valueOf(this.f79909a[this.f79910b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int index, Character element) {
            v7d.checkElementIndex(index, size());
            char[] cArr = this.f79909a;
            int i = this.f79910b;
            char c = cArr[i + index];
            cArr[i + index] = ((Character) v7d.checkNotNull(element)).charValue();
            return Character.valueOf(c);
        }
    }

    /* JADX INFO: renamed from: rw1$b */
    public enum EnumC12325b implements Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(char[] left, char[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = rw1.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    private rw1() {
    }

    public static List<Character> asList(char... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new C12324a(backingArray);
    }

    public static char checkedCast(long value) {
        char c = (char) value;
        v7d.checkArgument(((long) c) == value, "Out of range: %s", value);
        return c;
    }

    public static int compare(char a, char b) {
        return a - b;
    }

    public static char[] concat(char[]... arrays) {
        int length = 0;
        for (char[] cArr : arrays) {
            length += cArr.length;
        }
        char[] cArr2 = new char[length];
        int length2 = 0;
        for (char[] cArr3 : arrays) {
            System.arraycopy(cArr3, 0, cArr2, length2, cArr3.length);
            length2 += cArr3.length;
        }
        return cArr2;
    }

    public static char constrainToRange(char value, char min, char max) {
        v7d.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return value < min ? min : value < max ? value : max;
    }

    public static boolean contains(char[] array, char target) {
        for (char c : array) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    public static char[] ensureCapacity(char[] array, int minLength, int padding) {
        v7d.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        v7d.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @jd7
    public static char fromByteArray(byte[] bytes) {
        v7d.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return fromBytes(bytes[0], bytes[1]);
    }

    @jd7
    public static char fromBytes(byte b1, byte b2) {
        return (char) ((b1 << 8) | (b2 & 255));
    }

    public static int hashCode(char value) {
        return value;
    }

    public static int indexOf(char[] array, char target) {
        return indexOf(array, target, 0, array.length);
    }

    public static String join(String separator, char... array) {
        v7d.checkNotNull(separator);
        int length = array.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((separator.length() * (length - 1)) + length);
        sb.append(array[0]);
        for (int i = 1; i < length; i++) {
            sb.append(separator);
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(char[] array, char target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return EnumC12325b.INSTANCE;
    }

    public static char max(char... array) {
        v7d.checkArgument(array.length > 0);
        char c = array[0];
        for (int i = 1; i < array.length; i++) {
            char c2 = array[i];
            if (c2 > c) {
                c = c2;
            }
        }
        return c;
    }

    public static char min(char... array) {
        v7d.checkArgument(array.length > 0);
        char c = array[0];
        for (int i = 1; i < array.length; i++) {
            char c2 = array[i];
            if (c2 < c) {
                c = c2;
            }
        }
        return c;
    }

    public static void reverse(char[] array) {
        v7d.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void rotate(char[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static char saturatedCast(long value) {
        if (value > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return (char) 65535;
        }
        if (value < 0) {
            return (char) 0;
        }
        return (char) value;
    }

    public static void sortDescending(char[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof C12324a) {
            return ((C12324a) collection).m21581a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = ((Character) v7d.checkNotNull(array[i])).charValue();
        }
        return cArr;
    }

    @jd7
    public static byte[] toByteArray(char value) {
        return new byte[]{(byte) (value >> '\b'), (byte) value};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(char[] array, char target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(char[] array, char target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotate(char[] array, int distance, int fromIndex, int toIndex) {
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
    public static int indexOf(char[] r5, char[] r6) {
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
            char r3 = r5[r3]
            char r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: p000.rw1.indexOf(char[], char[]):int");
    }

    public static void reverse(char[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            char c = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = c;
            fromIndex++;
        }
    }

    public static void sortDescending(char[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        reverse(array, fromIndex, toIndex);
    }
}
