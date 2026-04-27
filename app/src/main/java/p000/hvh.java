package p000;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@ox4
public final class hvh {

    /* JADX INFO: renamed from: a */
    public static final byte f45007a = -128;

    /* JADX INFO: renamed from: b */
    public static final byte f45008b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f45009c = 255;

    /* JADX INFO: renamed from: hvh$a */
    @gdi
    public static class C7038a {

        /* JADX INFO: renamed from: a */
        public static final String f45010a = C7038a.class.getName() + "$UnsafeComparator";

        /* JADX INFO: renamed from: b */
        public static final Comparator<byte[]> f45011b = m12634a();

        /* JADX INFO: renamed from: hvh$a$a */
        public enum a implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] left, byte[] right) {
                int iMin = Math.min(left.length, right.length);
                for (int i = 0; i < iMin; i++) {
                    int iCompare = hvh.compare(left[i], right[i]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return left.length - right.length;
            }
        }

        /* JADX INFO: renamed from: hvh$a$b */
        @gdi
        public enum b implements Comparator<byte[]> {
            INSTANCE;


            /* JADX INFO: renamed from: b */
            public static final boolean f45015b = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

            /* JADX INFO: renamed from: c */
            public static final Unsafe f45016c;

            /* JADX INFO: renamed from: d */
            public static final int f45017d;

            /* JADX INFO: renamed from: hvh$a$b$a */
            public class a implements PrivilegedExceptionAction<Unsafe> {
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            }

            static {
                Unsafe unsafe = getUnsafe();
                f45016c = unsafe;
                int iArrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                f45017d = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (SecurityException unused) {
                        return (Unsafe) AccessController.doPrivileged(new a());
                    }
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] left, byte[] right) {
                int iMin = Math.min(left.length, right.length);
                int i = iMin & (-8);
                int i2 = 0;
                while (i2 < i) {
                    Unsafe unsafe = f45016c;
                    int i3 = f45017d;
                    long j = i2;
                    long j2 = unsafe.getLong(left, ((long) i3) + j);
                    long j3 = unsafe.getLong(right, ((long) i3) + j);
                    if (j2 != j3) {
                        if (f45015b) {
                            return mvh.compare(j2, j3);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                        return ((int) ((j2 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j3 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i2 += 8;
                }
                while (i2 < iMin) {
                    int iCompare = hvh.compare(left[i2], right[i2]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i2++;
                }
                return left.length - right.length;
            }
        }

        /* JADX INFO: renamed from: a */
        public static Comparator<byte[]> m12634a() {
            try {
                Object[] enumConstants = Class.forName(f45010a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return hvh.m12633a();
            }
        }
    }

    private hvh() {
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static Comparator<byte[]> m12633a() {
        return C7038a.a.INSTANCE;
    }

    @op1
    public static byte checkedCast(long value) {
        v7d.checkArgument((value >> 8) == 0, "out of range: %s", value);
        return (byte) value;
    }

    public static int compare(byte a, byte b) {
        return toInt(a) - toInt(b);
    }

    private static byte flip(byte b) {
        return (byte) (b ^ 128);
    }

    public static String join(String separator, byte... array) {
        v7d.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * (separator.length() + 3));
        sb.append(toInt(array[0]));
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append(toString(array[i]));
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return C7038a.f45011b;
    }

    public static byte max(byte... array) {
        v7d.checkArgument(array.length > 0);
        int i = toInt(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            int i3 = toInt(array[i2]);
            if (i3 > i) {
                i = i3;
            }
        }
        return (byte) i;
    }

    public static byte min(byte... array) {
        v7d.checkArgument(array.length > 0);
        int i = toInt(array[0]);
        for (int i2 = 1; i2 < array.length; i2++) {
            int i3 = toInt(array[i2]);
            if (i3 < i) {
                i = i3;
            }
        }
        return (byte) i;
    }

    @op1
    public static byte parseUnsignedByte(String string) {
        return parseUnsignedByte(string, 10);
    }

    public static byte saturatedCast(long value) {
        if (value > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (value < 0) {
            return (byte) 0;
        }
        return (byte) value;
    }

    public static void sort(byte[] array) {
        v7d.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sortDescending(byte[] array) {
        v7d.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static int toInt(byte value) {
        return value & 255;
    }

    public static String toString(byte x) {
        return toString(x, 10);
    }

    @op1
    public static byte parseUnsignedByte(String string, int radix) {
        int i = Integer.parseInt((String) v7d.checkNotNull(string), radix);
        if ((i >> 8) == 0) {
            return (byte) i;
        }
        throw new NumberFormatException("out of range: " + i);
    }

    public static String toString(byte x, int radix) {
        v7d.checkArgument(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        return Integer.toString(toInt(x), radix);
    }

    public static void sort(byte[] array, int fromIndex, int toIndex) {
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

    public static void sortDescending(byte[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = (byte) (array[i] ^ 127);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = (byte) (array[fromIndex] ^ 127);
            fromIndex++;
        }
    }
}
