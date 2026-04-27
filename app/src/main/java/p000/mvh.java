package p000;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ox4
public final class mvh {

    /* JADX INFO: renamed from: a */
    public static final long f62406a = -1;

    /* JADX INFO: renamed from: mvh$a */
    public enum EnumC9555a implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] left, long[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                long j = left[i];
                long j2 = right[i];
                if (j != j2) {
                    return mvh.compare(j, j2);
                }
            }
            return left.length - right.length;
        }
    }

    /* JADX INFO: renamed from: mvh$b */
    public static final class C9556b {

        /* JADX INFO: renamed from: a */
        public static final long[] f62409a = new long[37];

        /* JADX INFO: renamed from: b */
        public static final int[] f62410b = new int[37];

        /* JADX INFO: renamed from: c */
        public static final int[] f62411c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = i;
                f62409a[i] = mvh.divide(-1L, j);
                f62410b[i] = (int) mvh.remainder(-1L, j);
                f62411c[i] = bigInteger.toString(i).length() - 1;
            }
        }

        private C9556b() {
        }

        /* JADX INFO: renamed from: a */
        public static boolean m17597a(long current, int digit, int radix) {
            if (current < 0) {
                return true;
            }
            long j = f62409a[radix];
            if (current < j) {
                return false;
            }
            return current > j || digit > f62410b[radix];
        }
    }

    private mvh() {
    }

    public static int compare(long a, long b) {
        return im9.compare(flip(a), flip(b));
    }

    @op1
    public static long decode(String stringValue) {
        shc shcVarM22003a = shc.m22003a(stringValue);
        try {
            return parseUnsignedLong(shcVarM22003a.f81841a, shcVarM22003a.f81842b);
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public static long divide(long dividend, long divisor) {
        if (divisor < 0) {
            return compare(dividend, divisor) < 0 ? 0L : 1L;
        }
        if (dividend >= 0) {
            return dividend / divisor;
        }
        long j = ((dividend >>> 1) / divisor) << 1;
        return j + ((long) (compare(dividend - (j * divisor), divisor) < 0 ? 0 : 1));
    }

    private static long flip(long a) {
        return a ^ Long.MIN_VALUE;
    }

    public static String join(String separator, long... array) {
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

    public static Comparator<long[]> lexicographicalComparator() {
        return EnumC9555a.INSTANCE;
    }

    public static long max(long... array) {
        v7d.checkArgument(array.length > 0);
        long jFlip = flip(array[0]);
        for (int i = 1; i < array.length; i++) {
            long jFlip2 = flip(array[i]);
            if (jFlip2 > jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    public static long min(long... array) {
        v7d.checkArgument(array.length > 0);
        long jFlip = flip(array[0]);
        for (int i = 1; i < array.length; i++) {
            long jFlip2 = flip(array[i]);
            if (jFlip2 < jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    @op1
    public static long parseUnsignedLong(String string) {
        return parseUnsignedLong(string, 10);
    }

    public static long remainder(long dividend, long divisor) {
        if (divisor < 0) {
            return compare(dividend, divisor) < 0 ? dividend : dividend - divisor;
        }
        if (dividend >= 0) {
            return dividend % divisor;
        }
        long j = dividend - ((((dividend >>> 1) / divisor) << 1) * divisor);
        if (compare(j, divisor) < 0) {
            divisor = 0;
        }
        return j - divisor;
    }

    public static void sort(long[] array) {
        v7d.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sortDescending(long[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static String toString(long x) {
        return toString(x, 10);
    }

    @op1
    public static long parseUnsignedLong(String string, int radix) {
        v7d.checkNotNull(string);
        if (string.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (radix < 2 || radix > 36) {
            throw new NumberFormatException("illegal radix: " + radix);
        }
        int i = C9556b.f62411c[radix] - 1;
        long j = 0;
        for (int i2 = 0; i2 < string.length(); i2++) {
            int iDigit = Character.digit(string.charAt(i2), radix);
            if (iDigit == -1) {
                throw new NumberFormatException(string);
            }
            if (i2 > i && C9556b.m17597a(j, iDigit, radix)) {
                throw new NumberFormatException("Too large for unsigned long: " + string);
            }
            j = (j * ((long) radix)) + ((long) iDigit);
        }
        return j;
    }

    public static String toString(long x, int radix) {
        v7d.checkArgument(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        if (x == 0) {
            return a43.f347l;
        }
        if (x > 0) {
            return Long.toString(x, radix);
        }
        int i = 64;
        char[] cArr = new char[64];
        int i2 = radix - 1;
        if ((radix & i2) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(radix);
            do {
                i--;
                cArr[i] = Character.forDigit(((int) x) & i2, radix);
                x >>>= iNumberOfTrailingZeros;
            } while (x != 0);
        } else {
            long jDivide = (radix & 1) == 0 ? (x >>> 1) / ((long) (radix >>> 1)) : divide(x, radix);
            long j = radix;
            int i3 = 63;
            cArr[63] = Character.forDigit((int) (x - (jDivide * j)), radix);
            while (jDivide > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (jDivide % j), radix);
                jDivide /= j;
            }
            i = i3;
        }
        return new String(cArr, i, 64 - i);
    }

    public static void sort(long[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = flip(array[i]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = flip(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void sortDescending(long[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = Long.MAX_VALUE ^ array[i];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Long.MAX_VALUE;
            fromIndex++;
        }
    }
}
