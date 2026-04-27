package p000;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ox4
public final class hcf {

    /* JADX INFO: renamed from: a */
    public static final byte f43148a = 64;

    /* JADX INFO: renamed from: hcf$a */
    public enum EnumC6796a implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(byte[] left, byte[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = hcf.compare(left[i], right[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }
    }

    private hcf() {
    }

    public static byte checkedCast(long value) {
        byte b = (byte) value;
        v7d.checkArgument(((long) b) == value, "Out of range: %s", value);
        return b;
    }

    public static int compare(byte a, byte b) {
        return a - b;
    }

    public static String join(String separator, byte... array) {
        v7d.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 5);
        sb.append((int) array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append((int) array[i]);
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return EnumC6796a.INSTANCE;
    }

    public static byte max(byte... array) {
        v7d.checkArgument(array.length > 0);
        byte b = array[0];
        for (int i = 1; i < array.length; i++) {
            byte b2 = array[i];
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    public static byte min(byte... array) {
        v7d.checkArgument(array.length > 0);
        byte b = array[0];
        for (int i = 1; i < array.length; i++) {
            byte b2 = array[i];
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    public static byte saturatedCast(long value) {
        if (value > 127) {
            return (byte) 127;
        }
        if (value < -128) {
            return (byte) -128;
        }
        return (byte) value;
    }

    public static void sortDescending(byte[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(byte[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        ck1.reverse(array, fromIndex, toIndex);
    }
}
