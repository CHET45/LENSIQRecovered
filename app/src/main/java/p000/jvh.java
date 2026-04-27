package p000;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ox4
public final class jvh {

    /* JADX INFO: renamed from: a */
    public static final long f52115a = 4294967295L;

    /* JADX INFO: renamed from: jvh$a */
    public enum EnumC8124a implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] left, int[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int i2 = left[i];
                int i3 = right[i];
                if (i2 != i3) {
                    return jvh.compare(i2, i3);
                }
            }
            return left.length - right.length;
        }
    }

    private jvh() {
    }

    /* JADX INFO: renamed from: a */
    public static int m14357a(int value) {
        return value ^ Integer.MIN_VALUE;
    }

    public static int checkedCast(long value) {
        v7d.checkArgument((value >> 32) == 0, "out of range: %s", value);
        return (int) value;
    }

    public static int compare(int a, int b) {
        return rd8.compare(m14357a(a), m14357a(b));
    }

    @op1
    public static int decode(String stringValue) {
        shc shcVarM22003a = shc.m22003a(stringValue);
        try {
            return parseUnsignedInt(shcVarM22003a.f81841a, shcVarM22003a.f81842b);
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public static int divide(int dividend, int divisor) {
        return (int) (toLong(dividend) / toLong(divisor));
    }

    public static String join(String separator, int... array) {
        v7d.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 5);
        sb.append(toString(array[0]));
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append(toString(array[i]));
        }
        return sb.toString();
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return EnumC8124a.INSTANCE;
    }

    public static int max(int... array) {
        v7d.checkArgument(array.length > 0);
        int iM14357a = m14357a(array[0]);
        for (int i = 1; i < array.length; i++) {
            int iM14357a2 = m14357a(array[i]);
            if (iM14357a2 > iM14357a) {
                iM14357a = iM14357a2;
            }
        }
        return m14357a(iM14357a);
    }

    public static int min(int... array) {
        v7d.checkArgument(array.length > 0);
        int iM14357a = m14357a(array[0]);
        for (int i = 1; i < array.length; i++) {
            int iM14357a2 = m14357a(array[i]);
            if (iM14357a2 < iM14357a) {
                iM14357a = iM14357a2;
            }
        }
        return m14357a(iM14357a);
    }

    @op1
    public static int parseUnsignedInt(String s) {
        return parseUnsignedInt(s, 10);
    }

    public static int remainder(int dividend, int divisor) {
        return (int) (toLong(dividend) % toLong(divisor));
    }

    public static int saturatedCast(long value) {
        if (value <= 0) {
            return 0;
        }
        if (value >= 4294967296L) {
            return -1;
        }
        return (int) value;
    }

    public static void sort(int[] array) {
        v7d.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sortDescending(int[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static long toLong(int value) {
        return ((long) value) & 4294967295L;
    }

    public static String toString(int x) {
        return toString(x, 10);
    }

    @op1
    public static int parseUnsignedInt(String string, int radix) {
        v7d.checkNotNull(string);
        long j = Long.parseLong(string, radix);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException("Input " + string + " in base " + radix + " is not in the range of an unsigned integer");
    }

    public static String toString(int x, int radix) {
        return Long.toString(((long) x) & 4294967295L, radix);
    }

    public static void sort(int[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = m14357a(array[i]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = m14357a(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void sortDescending(int[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = Integer.MAX_VALUE ^ array[i];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Integer.MAX_VALUE;
            fromIndex++;
        }
    }
}
