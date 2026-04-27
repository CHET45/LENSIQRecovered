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
public final class hb1 {

    /* JADX INFO: renamed from: hb1$a */
    @gd7
    public static class C6781a extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final boolean[] f43052a;

        /* JADX INFO: renamed from: b */
        public final int f43053b;

        /* JADX INFO: renamed from: c */
        public final int f43054c;

        public C6781a(boolean[] array) {
            this(array, 0, array.length);
        }

        /* JADX INFO: renamed from: a */
        public boolean[] m12301a() {
            return Arrays.copyOfRange(this.f43052a, this.f43053b, this.f43054c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return (target instanceof Boolean) && hb1.indexOf(this.f43052a, ((Boolean) target).booleanValue(), this.f43053b, this.f43054c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C6781a)) {
                return super.equals(object);
            }
            C6781a c6781a = (C6781a) object;
            int size = size();
            if (c6781a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f43052a[this.f43053b + i] != c6781a.f43052a[c6781a.f43053b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.f43053b; i < this.f43054c; i++) {
                iHashCode = (iHashCode * 31) + hb1.hashCode(this.f43052a[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            int iIndexOf;
            if (!(target instanceof Boolean) || (iIndexOf = hb1.indexOf(this.f43052a, ((Boolean) target).booleanValue(), this.f43053b, this.f43054c)) < 0) {
                return -1;
            }
            return iIndexOf - this.f43053b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            int iLastIndexOf;
            if (!(target instanceof Boolean) || (iLastIndexOf = hb1.lastIndexOf(this.f43052a, ((Boolean) target).booleanValue(), this.f43053b, this.f43054c)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.f43053b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f43054c - this.f43053b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.f43052a;
            int i = this.f43053b;
            return new C6781a(zArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.f43052a[this.f43053b] ? "[true" : "[false");
            int i = this.f43053b;
            while (true) {
                i++;
                if (i >= this.f43054c) {
                    sb.append(C4584d2.f28243l);
                    return sb.toString();
                }
                sb.append(this.f43052a[i] ? ", true" : ", false");
            }
        }

        public C6781a(boolean[] array, int start, int end) {
            this.f43052a = array;
            this.f43053b = start;
            this.f43054c = end;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int index) {
            v7d.checkElementIndex(index, size());
            return Boolean.valueOf(this.f43052a[this.f43053b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int index, Boolean element) {
            v7d.checkElementIndex(index, size());
            boolean[] zArr = this.f43052a;
            int i = this.f43053b;
            boolean z = zArr[i + index];
            zArr[i + index] = ((Boolean) v7d.checkNotNull(element)).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: hb1$b */
    public enum EnumC6782b implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* JADX INFO: renamed from: a */
        public final int f43058a;

        /* JADX INFO: renamed from: b */
        public final String f43059b;

        EnumC6782b(int trueValue, String toString) {
            this.f43058a = trueValue;
            this.f43059b = toString;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f43059b;
        }

        @Override // java.util.Comparator
        public int compare(Boolean a, Boolean b) {
            return (b.booleanValue() ? this.f43058a : 0) - (a.booleanValue() ? this.f43058a : 0);
        }
    }

    /* JADX INFO: renamed from: hb1$c */
    public enum EnumC6783c implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] left, boolean[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = hb1.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    private hb1() {
    }

    public static List<Boolean> asList(boolean... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new C6781a(backingArray);
    }

    public static int compare(boolean a, boolean b) {
        if (a == b) {
            return 0;
        }
        return a ? 1 : -1;
    }

    public static boolean[] concat(boolean[]... arrays) {
        int length = 0;
        for (boolean[] zArr : arrays) {
            length += zArr.length;
        }
        boolean[] zArr2 = new boolean[length];
        int length2 = 0;
        for (boolean[] zArr3 : arrays) {
            System.arraycopy(zArr3, 0, zArr2, length2, zArr3.length);
            length2 += zArr3.length;
        }
        return zArr2;
    }

    public static boolean contains(boolean[] array, boolean target) {
        for (boolean z : array) {
            if (z == target) {
                return true;
            }
        }
        return false;
    }

    public static int countTrue(boolean... values) {
        int i = 0;
        for (boolean z : values) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public static boolean[] ensureCapacity(boolean[] array, int minLength, int padding) {
        v7d.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        v7d.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static Comparator<Boolean> falseFirst() {
        return EnumC6782b.FALSE_FIRST;
    }

    public static int hashCode(boolean value) {
        return value ? 1231 : 1237;
    }

    public static int indexOf(boolean[] array, boolean target) {
        return indexOf(array, target, 0, array.length);
    }

    public static String join(String separator, boolean... array) {
        v7d.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 7);
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(boolean[] array, boolean target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return EnumC6783c.INSTANCE;
    }

    public static void reverse(boolean[] array) {
        v7d.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void rotate(boolean[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof C6781a) {
            return ((C6781a) collection).m12301a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((Boolean) v7d.checkNotNull(array[i])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> trueFirst() {
        return EnumC6782b.TRUE_FIRST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(boolean[] array, boolean target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(boolean[] array, boolean target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotate(boolean[] array, int distance, int fromIndex, int toIndex) {
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
    public static int indexOf(boolean[] r5, boolean[] r6) {
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
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: p000.hb1.indexOf(boolean[], boolean[]):int");
    }

    public static void reverse(boolean[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            boolean z = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = z;
            fromIndex++;
        }
    }
}
