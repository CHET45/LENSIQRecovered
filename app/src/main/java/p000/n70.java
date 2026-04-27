package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n70 {

    /* JADX INFO: renamed from: a */
    public static final int f63427a = -1;

    /* JADX INFO: renamed from: n70$a */
    public interface InterfaceC9717a<E> {
        void execute(int i, E e);
    }

    private n70() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @efb
    public static <T> T[] add(@hib T[] tArr, @hib T t) {
        T[] tArr2 = (T[]) ((Object[]) realAddOne(tArr, t, tArr != null ? tArr.getClass() : t != null ? t.getClass() : Object.class));
        if (tArr2 != null) {
            return tArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static <T> List<T> asArrayList(@hib T... tArr) {
        ArrayList arrayList = new ArrayList();
        if (tArr != null && tArr.length != 0) {
            arrayList.addAll(Arrays.asList(tArr));
        }
        return arrayList;
    }

    @efb
    public static <T> List<T> asLinkedList(@hib T... tArr) {
        LinkedList linkedList = new LinkedList();
        if (tArr != null && tArr.length != 0) {
            linkedList.addAll(Arrays.asList(tArr));
        }
        return linkedList;
    }

    @efb
    public static <T> List<T> asList(@hib T... tArr) {
        if (tArr == null || tArr.length == 0) {
            List<T> listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return listEmptyList;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.asList() marked by @androidx.annotation.NonNull");
        }
        List<T> listAsList = Arrays.asList(tArr);
        if (listAsList != null) {
            return listAsList;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.asList() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static <T> List<T> asUnmodifiableList(@hib T... tArr) {
        List<T> listUnmodifiableList = Collections.unmodifiableList(asList(tArr));
        if (listUnmodifiableList != null) {
            return listUnmodifiableList;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.asUnmodifiableList() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib Object[] objArr, @hib Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    @hib
    public static <T> T[] copy(@hib T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) subArray(tArr, 0, tArr.length);
    }

    public static boolean equals(@hib Object[] objArr, @hib Object[] objArr2) {
        return Arrays.deepEquals(objArr, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void forAllDo(@hib Object obj, @hib InterfaceC9717a<E> interfaceC9717a) {
        if (obj == null || interfaceC9717a == 0) {
            return;
        }
        int i = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                interfaceC9717a.execute(i, objArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i < length2) {
                interfaceC9717a.execute(i, zArr[i] ? Boolean.TRUE : Boolean.FALSE);
                i++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length3 = bArr.length;
            while (i < length3) {
                interfaceC9717a.execute(i, Byte.valueOf(bArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i < length4) {
                interfaceC9717a.execute(i, Character.valueOf(cArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length5 = sArr.length;
            while (i < length5) {
                interfaceC9717a.execute(i, Short.valueOf(sArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length6 = iArr.length;
            while (i < length6) {
                interfaceC9717a.execute(i, Integer.valueOf(iArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            while (i < length7) {
                interfaceC9717a.execute(i, Long.valueOf(jArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length8 = fArr.length;
            while (i < length8) {
                interfaceC9717a.execute(i, Float.valueOf(fArr[i]));
                i++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            throw new IllegalArgumentException("Not an array: " + obj.getClass());
        }
        double[] dArr = (double[]) obj;
        int length9 = dArr.length;
        while (i < length9) {
            interfaceC9717a.execute(i, Double.valueOf(dArr[i]));
            i++;
        }
    }

    @hib
    public static Object get(@hib Object obj, int i) {
        return get(obj, i, null);
    }

    public static int getLength(@hib Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static int indexOf(@hib Object[] objArr, @hib Object obj) {
        return indexOf(objArr, obj, 0);
    }

    public static boolean isEmpty(@hib Object obj) {
        return getLength(obj) == 0;
    }

    public static boolean isSameLength(@hib Object obj, @hib Object obj2) {
        return getLength(obj) == getLength(obj2);
    }

    public static int lastIndexOf(@hib Object[] objArr, @hib Object obj) {
        return lastIndexOf(objArr, obj, Integer.MAX_VALUE);
    }

    @efb
    public static <T> T[] newArray(T... tArr) {
        if (tArr != null) {
            return tArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static boolean[] newBooleanArray(boolean... zArr) {
        if (zArr != null) {
            return zArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newBooleanArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static byte[] newByteArray(byte... bArr) {
        if (bArr != null) {
            return bArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newByteArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static char[] newCharArray(char... cArr) {
        if (cArr != null) {
            return cArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newCharArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static double[] newDoubleArray(double... dArr) {
        if (dArr != null) {
            return dArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newDoubleArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static float[] newFloatArray(float... fArr) {
        if (fArr != null) {
            return fArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newFloatArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static int[] newIntArray(int... iArr) {
        if (iArr != null) {
            return iArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newIntArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static long[] newLongArray(long... jArr) {
        if (jArr != null) {
            return jArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newLongArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static short[] newShortArray(short... sArr) {
        if (sArr != null) {
            return sArr;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.newShortArray() marked by @androidx.annotation.NonNull");
    }

    @efb
    private static Object realAdd(@hib Object obj, int i, @hib Object obj2, Class cls) {
        if (obj == null) {
            if (i == 0) {
                Object objNewInstance = Array.newInstance((Class<?>) cls, 1);
                Array.set(objNewInstance, 0, obj2);
                if (objNewInstance != null) {
                    return objNewInstance;
                }
                throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.realAdd() marked by @androidx.annotation.NonNull");
            }
            throw new IndexOutOfBoundsException("Index: " + i + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i > length || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Length: " + length);
        }
        Object objNewInstance2 = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance2, 0, i);
        Array.set(objNewInstance2, i, obj2);
        if (i < length) {
            System.arraycopy(obj, i, objNewInstance2, i + 1, length - i);
        }
        if (objNewInstance2 != null) {
            return objNewInstance2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.realAdd() marked by @androidx.annotation.NonNull");
    }

    private static Object realAddArr(@hib Object obj, @hib Object obj2) {
        if (obj == null && obj2 == null) {
            return null;
        }
        if (obj == null) {
            return realCopy(obj2);
        }
        if (obj2 == null) {
            return realCopy(obj);
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        return objNewInstance;
    }

    @efb
    private static Object realAddOne(@hib Object obj, @hib Object obj2, Class cls) {
        Object objNewInstance;
        int i = 0;
        if (obj != null) {
            int length = getLength(obj);
            objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, objNewInstance, 0, length);
            i = length;
        } else {
            objNewInstance = Array.newInstance((Class<?>) cls, 1);
        }
        Array.set(objNewInstance, i, obj2);
        if (objNewInstance != null) {
            return objNewInstance;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.realAddOne() marked by @androidx.annotation.NonNull");
    }

    @hib
    private static Object realCopy(@hib Object obj) {
        if (obj == null) {
            return null;
        }
        return realSubArray(obj, 0, getLength(obj));
    }

    @hib
    private static Object realSubArray(@hib Object obj, int i, int i2) {
        if (obj == null) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        int length = getLength(obj);
        if (i2 > length) {
            i2 = length;
        }
        int i3 = i2 - i;
        Class<?> componentType = obj.getClass().getComponentType();
        if (i3 <= 0) {
            return Array.newInstance(componentType, 0);
        }
        Object objNewInstance = Array.newInstance(componentType, i3);
        System.arraycopy(obj, i, objNewInstance, 0, i3);
        return objNewInstance;
    }

    @hib
    public static Object[] remove(@hib Object[] objArr, int i) {
        if (objArr == null) {
            return null;
        }
        return (Object[]) remove((Object) objArr, i);
    }

    @hib
    public static Object[] removeElement(@hib Object[] objArr, @hib Object obj) {
        int iIndexOf = indexOf(objArr, obj);
        return iIndexOf == -1 ? copy(objArr) : remove(objArr, iIndexOf);
    }

    public static <T> void reverse(T[] tArr) {
        if (tArr == null) {
            return;
        }
        int length = tArr.length - 1;
        for (int i = 0; length > i; i++) {
            T t = tArr[length];
            tArr[length] = tArr[i];
            tArr[i] = t;
            length--;
        }
    }

    public static void set(@hib Object obj, int i, @hib Object obj2) {
        if (obj == null) {
            return;
        }
        Array.set(obj, i, obj2);
    }

    public static <T> void sort(@hib T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null || tArr.length < 2) {
            return;
        }
        Arrays.sort(tArr, comparator);
    }

    @hib
    public static <T> T[] subArray(@hib T[] tArr, int i, int i2) {
        return (T[]) ((Object[]) realSubArray(tArr, i, i2));
    }

    @hib
    public static Character[] toObject(@hib char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return new Character[0];
        }
        Character[] chArr = new Character[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            chArr[i] = new Character(cArr[i]);
        }
        return chArr;
    }

    @hib
    public static char[] toPrimitive(@hib Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            cArr[i] = chArr[i].charValue();
        }
        return cArr;
    }

    @efb
    public static String toString(@hib Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            String strDeepToString = Arrays.deepToString((Object[]) obj);
            if (strDeepToString != null) {
                return strDeepToString;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        if (obj instanceof boolean[]) {
            String string = Arrays.toString((boolean[]) obj);
            if (string != null) {
                return string;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        if (obj instanceof byte[]) {
            String string2 = Arrays.toString((byte[]) obj);
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        if (obj instanceof char[]) {
            String string3 = Arrays.toString((char[]) obj);
            if (string3 != null) {
                return string3;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        if (obj instanceof double[]) {
            String string4 = Arrays.toString((double[]) obj);
            if (string4 != null) {
                return string4;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        if (obj instanceof float[]) {
            String string5 = Arrays.toString((float[]) obj);
            if (string5 != null) {
                return string5;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        if (obj instanceof int[]) {
            String string6 = Arrays.toString((int[]) obj);
            if (string6 != null) {
                return string6;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        if (obj instanceof long[]) {
            String string7 = Arrays.toString((long[]) obj);
            if (string7 != null) {
                return string7;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        if (obj instanceof short[]) {
            String string8 = Arrays.toString((short[]) obj);
            if (string8 != null) {
                return string8;
            }
            throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.toString() marked by @androidx.annotation.NonNull");
        }
        throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
    }

    public static boolean contains(@hib long[] jArr, long j) {
        return indexOf(jArr, j) != -1;
    }

    @hib
    public static long[] copy(@hib long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return subArray(jArr, 0, jArr.length);
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @hib
    public static Object get(@hib Object obj, int i, @hib Object obj2) {
        if (obj == null) {
            return obj2;
        }
        try {
            return Array.get(obj, i);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static int indexOf(@hib Object[] objArr, @hib Object obj, int i) {
        if (objArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(@hib Object[] objArr, @hib Object obj, int i) {
        if (objArr == null || i < 0) {
            return -1;
        }
        if (i >= objArr.length) {
            i = objArr.length - 1;
        }
        if (obj == null) {
            while (i >= 0) {
                if (objArr[i] == null) {
                    return i;
                }
                i--;
            }
        } else {
            while (i >= 0) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    @hib
    public static boolean[] remove(@hib boolean[] zArr, int i) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) remove((Object) zArr, i);
    }

    @hib
    public static long[] subArray(@hib long[] jArr, int i, int i2) {
        return (long[]) realSubArray(jArr, i, i2);
    }

    @efb
    public static boolean[] add(@hib boolean[] zArr, boolean z) {
        boolean[] zArr2 = (boolean[]) realAddOne(zArr, Boolean.valueOf(z), Boolean.TYPE);
        if (zArr2 != null) {
            return zArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib int[] iArr, int i) {
        return indexOf(iArr, i) != -1;
    }

    @hib
    public static int[] copy(@hib int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return subArray(iArr, 0, iArr.length);
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @hib
    public static byte[] remove(@hib byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) remove((Object) bArr, i);
    }

    public static void sort(@hib byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        Arrays.sort(bArr);
    }

    @hib
    public static int[] subArray(@hib int[] iArr, int i, int i2) {
        return (int[]) realSubArray(iArr, i, i2);
    }

    @efb
    public static byte[] add(@hib byte[] bArr, byte b) {
        byte[] bArr2 = (byte[]) realAddOne(bArr, Byte.valueOf(b), Byte.TYPE);
        if (bArr2 != null) {
            return bArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib short[] sArr, short s) {
        return indexOf(sArr, s) != -1;
    }

    @hib
    public static short[] copy(@hib short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return subArray(sArr, 0, sArr.length);
    }

    public static boolean equals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @hib
    public static char[] remove(@hib char[] cArr, int i) {
        if (cArr == null) {
            return null;
        }
        return (char[]) remove((Object) cArr, i);
    }

    @hib
    public static boolean[] removeElement(@hib boolean[] zArr, boolean z) {
        int iIndexOf = indexOf(zArr, z);
        if (iIndexOf == -1) {
            return copy(zArr);
        }
        return remove(zArr, iIndexOf);
    }

    @hib
    public static short[] subArray(@hib short[] sArr, int i, int i2) {
        return (short[]) realSubArray(sArr, i, i2);
    }

    @efb
    public static char[] add(@hib char[] cArr, char c) {
        char[] cArr2 = (char[]) realAddOne(cArr, Character.valueOf(c), Character.TYPE);
        if (cArr2 != null) {
            return cArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib char[] cArr, char c) {
        return indexOf(cArr, c) != -1;
    }

    @hib
    public static char[] copy(@hib char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return subArray(cArr, 0, cArr.length);
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @hib
    public static double[] remove(@hib double[] dArr, int i) {
        if (dArr == null) {
            return null;
        }
        return (double[]) remove((Object) dArr, i);
    }

    public static void reverse(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i = 0; length > i; i++) {
            long j = jArr[length];
            jArr[length] = jArr[i];
            jArr[i] = j;
            length--;
        }
    }

    public static void sort(@hib char[] cArr) {
        if (cArr == null || cArr.length < 2) {
            return;
        }
        Arrays.sort(cArr);
    }

    @hib
    public static char[] subArray(@hib char[] cArr, int i, int i2) {
        return (char[]) realSubArray(cArr, i, i2);
    }

    @efb
    public static double[] add(@hib double[] dArr, double d) {
        double[] dArr2 = (double[]) realAddOne(dArr, Double.valueOf(d), Double.TYPE);
        if (dArr2 != null) {
            return dArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib byte[] bArr, byte b) {
        return indexOf(bArr, b) != -1;
    }

    @hib
    public static byte[] copy(@hib byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return subArray(bArr, 0, bArr.length);
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    public static int indexOf(@hib long[] jArr, long j) {
        return indexOf(jArr, j, 0);
    }

    public static int lastIndexOf(@hib long[] jArr, long j) {
        return lastIndexOf(jArr, j, Integer.MAX_VALUE);
    }

    @hib
    public static float[] remove(@hib float[] fArr, int i) {
        if (fArr == null) {
            return null;
        }
        return (float[]) remove((Object) fArr, i);
    }

    @hib
    public static byte[] subArray(@hib byte[] bArr, int i, int i2) {
        return (byte[]) realSubArray(bArr, i, i2);
    }

    @hib
    public static Long[] toObject(@hib long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return new Long[0];
        }
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = new Long(jArr[i]);
        }
        return lArr;
    }

    @hib
    public static char[] toPrimitive(@hib Character[] chArr, char c) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            Character ch = chArr[i];
            cArr[i] = ch == null ? c : ch.charValue();
        }
        return cArr;
    }

    @efb
    public static float[] add(@hib float[] fArr, float f) {
        float[] fArr2 = (float[]) realAddOne(fArr, Float.valueOf(f), Float.TYPE);
        if (fArr2 != null) {
            return fArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib double[] dArr, double d) {
        return indexOf(dArr, d) != -1;
    }

    @hib
    public static double[] copy(@hib double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return subArray(dArr, 0, dArr.length);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static int indexOf(@hib long[] jArr, long j, int i) {
        if (jArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < jArr.length) {
            if (j == jArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(@hib long[] jArr, long j, int i) {
        if (jArr == null || i < 0) {
            return -1;
        }
        if (i >= jArr.length) {
            i = jArr.length - 1;
        }
        while (i >= 0) {
            if (j == jArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @hib
    public static int[] remove(@hib int[] iArr, int i) {
        if (iArr == null) {
            return null;
        }
        return (int[]) remove((Object) iArr, i);
    }

    @hib
    public static byte[] removeElement(@hib byte[] bArr, byte b) {
        int iIndexOf = indexOf(bArr, b);
        if (iIndexOf == -1) {
            return copy(bArr);
        }
        return remove(bArr, iIndexOf);
    }

    public static void sort(@hib double[] dArr) {
        if (dArr == null || dArr.length < 2) {
            return;
        }
        Arrays.sort(dArr);
    }

    @hib
    public static double[] subArray(@hib double[] dArr, int i, int i2) {
        return (double[]) realSubArray(dArr, i, i2);
    }

    @efb
    public static int[] add(@hib int[] iArr, int i) {
        int[] iArr2 = (int[]) realAddOne(iArr, Integer.valueOf(i), Integer.TYPE);
        if (iArr2 != null) {
            return iArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib double[] dArr, double d, double d2) {
        return indexOf(dArr, d, 0, d2) != -1;
    }

    @hib
    public static float[] copy(@hib float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return subArray(fArr, 0, fArr.length);
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @hib
    private static Object realAddArr(@hib Object obj, int i, @hib Object obj2, Class cls) {
        if (obj == null && obj2 == null) {
            return null;
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        if (length == 0) {
            if (i != 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", array1 Length: 0");
            }
            return realCopy(obj2);
        }
        if (length2 == 0) {
            return realCopy(obj);
        }
        if (i > length || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", array1 Length: " + length);
        }
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        if (i == length) {
            System.arraycopy(obj, 0, objNewInstance, 0, length);
            System.arraycopy(obj2, 0, objNewInstance, length, length2);
        } else if (i == 0) {
            System.arraycopy(obj2, 0, objNewInstance, 0, length2);
            System.arraycopy(obj, 0, objNewInstance, length2, length);
        } else {
            System.arraycopy(obj, 0, objNewInstance, 0, i);
            System.arraycopy(obj2, 0, objNewInstance, i, length2);
            System.arraycopy(obj, i, objNewInstance, length2 + i, length - i);
        }
        return objNewInstance;
    }

    @hib
    public static long[] remove(@hib long[] jArr, int i) {
        if (jArr == null) {
            return null;
        }
        return (long[]) remove((Object) jArr, i);
    }

    @hib
    public static float[] subArray(@hib float[] fArr, int i, int i2) {
        return (float[]) realSubArray(fArr, i, i2);
    }

    @efb
    public static long[] add(@hib long[] jArr, long j) {
        long[] jArr2 = (long[]) realAddOne(jArr, Long.valueOf(j), Long.TYPE);
        if (jArr2 != null) {
            return jArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib float[] fArr, float f) {
        return indexOf(fArr, f) != -1;
    }

    @hib
    public static boolean[] copy(@hib boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return subArray(zArr, 0, zArr.length);
    }

    public static int indexOf(@hib int[] iArr, int i) {
        return indexOf(iArr, i, 0);
    }

    @hib
    public static short[] remove(@hib short[] sArr, int i) {
        if (sArr == null) {
            return null;
        }
        return (short[]) remove((Object) sArr, i);
    }

    public static void reverse(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i = 0; length > i; i++) {
            int i2 = iArr[length];
            iArr[length] = iArr[i];
            iArr[i] = i2;
            length--;
        }
    }

    public static void sort(@hib float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return;
        }
        Arrays.sort(fArr);
    }

    @hib
    public static boolean[] subArray(@hib boolean[] zArr, int i, int i2) {
        return (boolean[]) realSubArray(zArr, i, i2);
    }

    @efb
    public static short[] add(@hib short[] sArr, short s) {
        short[] sArr2 = (short[]) realAddOne(sArr, Short.valueOf(s), Short.TYPE);
        if (sArr2 != null) {
            return sArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    public static boolean contains(@hib boolean[] zArr, boolean z) {
        return indexOf(zArr, z) != -1;
    }

    public static int indexOf(@hib int[] iArr, int i, int i2) {
        if (iArr == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < iArr.length) {
            if (i == iArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int lastIndexOf(@hib int[] iArr, int i) {
        return lastIndexOf(iArr, i, Integer.MAX_VALUE);
    }

    @efb
    private static Object remove(@efb Object obj, int i) {
        if (obj != null) {
            int length = getLength(obj);
            if (i >= 0 && i < length) {
                int i2 = length - 1;
                Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i2);
                System.arraycopy(obj, 0, objNewInstance, 0, i);
                if (i < i2) {
                    System.arraycopy(obj, i + 1, objNewInstance, i, (length - i) - 1);
                }
                if (objNewInstance != null) {
                    return objNewInstance;
                }
                throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.remove() marked by @androidx.annotation.NonNull");
            }
            throw new IndexOutOfBoundsException("Index: " + i + ", Length: " + length);
        }
        throw new NullPointerException("Argument 'array' of type Object (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    @hib
    public static char[] removeElement(@hib char[] cArr, char c) {
        int iIndexOf = indexOf(cArr, c);
        if (iIndexOf == -1) {
            return copy(cArr);
        }
        return remove(cArr, iIndexOf);
    }

    @hib
    public static <T> T[] add(@hib T[] tArr, @hib T[] tArr2) {
        return (T[]) ((Object[]) realAddArr(tArr, tArr2));
    }

    public static int lastIndexOf(@hib int[] iArr, int i, int i2) {
        if (iArr == null || i2 < 0) {
            return -1;
        }
        if (i2 >= iArr.length) {
            i2 = iArr.length - 1;
        }
        while (i2 >= 0) {
            if (i == iArr[i2]) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static void sort(@hib int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            return;
        }
        Arrays.sort(iArr);
    }

    @hib
    public static Integer[] toObject(@hib int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = new Integer(iArr[i]);
        }
        return numArr;
    }

    @hib
    public static boolean[] add(@hib boolean[] zArr, @hib boolean[] zArr2) {
        return (boolean[]) realAddArr(zArr, zArr2);
    }

    public static int indexOf(@hib short[] sArr, short s) {
        return indexOf(sArr, s, 0);
    }

    @hib
    public static long[] toPrimitive(@hib Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    @hib
    public static char[] add(@hib char[] cArr, @hib char[] cArr2) {
        return (char[]) realAddArr(cArr, cArr2);
    }

    public static int indexOf(@hib short[] sArr, short s, int i) {
        if (sArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < sArr.length) {
            if (s == sArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @hib
    public static double[] removeElement(@hib double[] dArr, double d) {
        int iIndexOf = indexOf(dArr, d);
        if (iIndexOf == -1) {
            return copy(dArr);
        }
        return remove(dArr, iIndexOf);
    }

    public static void reverse(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i = 0; length > i; i++) {
            short s = sArr[length];
            sArr[length] = sArr[i];
            sArr[i] = s;
            length--;
        }
    }

    public static void sort(@hib long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            return;
        }
        Arrays.sort(jArr);
    }

    @hib
    public static byte[] add(@hib byte[] bArr, @hib byte[] bArr2) {
        return (byte[]) realAddArr(bArr, bArr2);
    }

    public static int lastIndexOf(@hib short[] sArr, short s) {
        return lastIndexOf(sArr, s, Integer.MAX_VALUE);
    }

    @hib
    public static short[] add(@hib short[] sArr, @hib short[] sArr2) {
        return (short[]) realAddArr(sArr, sArr2);
    }

    public static int indexOf(@hib char[] cArr, char c) {
        return indexOf(cArr, c, 0);
    }

    public static int lastIndexOf(@hib short[] sArr, short s, int i) {
        if (sArr == null || i < 0) {
            return -1;
        }
        if (i >= sArr.length) {
            i = sArr.length - 1;
        }
        while (i >= 0) {
            if (s == sArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static void sort(@hib short[] sArr) {
        if (sArr == null || sArr.length < 2) {
            return;
        }
        Arrays.sort(sArr);
    }

    @hib
    public static int[] add(@hib int[] iArr, @hib int[] iArr2) {
        return (int[]) realAddArr(iArr, iArr2);
    }

    public static int indexOf(@hib char[] cArr, char c, int i) {
        if (cArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < cArr.length) {
            if (c == cArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @hib
    public static float[] removeElement(@hib float[] fArr, float f) {
        int iIndexOf = indexOf(fArr, f);
        if (iIndexOf == -1) {
            return copy(fArr);
        }
        return remove(fArr, iIndexOf);
    }

    @hib
    public static Short[] toObject(@hib short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return new Short[0];
        }
        Short[] shArr = new Short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            shArr[i] = new Short(sArr[i]);
        }
        return shArr;
    }

    @hib
    public static long[] add(@hib long[] jArr, @hib long[] jArr2) {
        return (long[]) realAddArr(jArr, jArr2);
    }

    public static void reverse(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i = 0; length > i; i++) {
            char c = cArr[length];
            cArr[length] = cArr[i];
            cArr[i] = c;
            length--;
        }
    }

    @hib
    public static long[] toPrimitive(@hib Long[] lArr, long j) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            Long l = lArr[i];
            jArr[i] = l == null ? j : l.longValue();
        }
        return jArr;
    }

    @hib
    public static float[] add(@hib float[] fArr, @hib float[] fArr2) {
        return (float[]) realAddArr(fArr, fArr2);
    }

    public static int indexOf(@hib byte[] bArr, byte b) {
        return indexOf(bArr, b, 0);
    }

    public static int lastIndexOf(@hib char[] cArr, char c) {
        return lastIndexOf(cArr, c, Integer.MAX_VALUE);
    }

    @hib
    public static double[] add(@hib double[] dArr, @hib double[] dArr2) {
        return (double[]) realAddArr(dArr, dArr2);
    }

    public static int indexOf(@hib byte[] bArr, byte b, int i) {
        if (bArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < bArr.length) {
            if (b == bArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(@hib char[] cArr, char c, int i) {
        if (cArr == null || i < 0) {
            return -1;
        }
        if (i >= cArr.length) {
            i = cArr.length - 1;
        }
        while (i >= 0) {
            if (c == cArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @hib
    public static int[] removeElement(@hib int[] iArr, int i) {
        int iIndexOf = indexOf(iArr, i);
        if (iIndexOf == -1) {
            return copy(iArr);
        }
        return remove(iArr, iIndexOf);
    }

    @hib
    public static <T> T[] add(@hib T[] tArr, int i, @hib T[] tArr2) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (tArr2 == null) {
                return null;
            }
            componentType = tArr2.getClass().getComponentType();
        }
        return (T[]) ((Object[]) realAddArr(tArr, i, tArr2, componentType));
    }

    public static int indexOf(@hib double[] dArr, double d) {
        return indexOf(dArr, d, 0);
    }

    public static void reverse(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b;
            length--;
        }
    }

    @hib
    public static Byte[] toObject(@hib byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new Byte[0];
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new Byte(bArr[i]);
        }
        return bArr2;
    }

    public static int indexOf(@hib double[] dArr, double d, double d2) {
        return indexOf(dArr, d, 0, d2);
    }

    public static int lastIndexOf(@hib byte[] bArr, byte b) {
        return lastIndexOf(bArr, b, Integer.MAX_VALUE);
    }

    @hib
    public static long[] removeElement(@hib long[] jArr, long j) {
        int iIndexOf = indexOf(jArr, j);
        if (iIndexOf == -1) {
            return copy(jArr);
        }
        return remove(jArr, iIndexOf);
    }

    @hib
    public static boolean[] add(@hib boolean[] zArr, int i, @hib boolean[] zArr2) {
        Object objRealAddArr = realAddArr(zArr, i, zArr2, Boolean.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (boolean[]) objRealAddArr;
    }

    public static int indexOf(@hib double[] dArr, double d, int i) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < dArr.length) {
            if (d == dArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(@hib byte[] bArr, byte b, int i) {
        if (bArr == null || i < 0) {
            return -1;
        }
        if (i >= bArr.length) {
            i = bArr.length - 1;
        }
        while (i >= 0) {
            if (b == bArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @hib
    public static int[] toPrimitive(@hib Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static char[] add(@hib char[] cArr, int i, @hib char[] cArr2) {
        Object objRealAddArr = realAddArr(cArr, i, cArr2, Character.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (char[]) objRealAddArr;
    }

    @hib
    public static short[] removeElement(@hib short[] sArr, short s) {
        int iIndexOf = indexOf(sArr, s);
        if (iIndexOf == -1) {
            return copy(sArr);
        }
        return remove(sArr, iIndexOf);
    }

    public static void reverse(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i = 0; length > i; i++) {
            double d = dArr[length];
            dArr[length] = dArr[i];
            dArr[i] = d;
            length--;
        }
    }

    public static int indexOf(@hib double[] dArr, double d, int i, double d2) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        double d3 = d - d2;
        double d4 = d + d2;
        while (i < dArr.length) {
            double d5 = dArr[i];
            if (d5 >= d3 && d5 <= d4) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int lastIndexOf(@hib double[] dArr, double d) {
        return lastIndexOf(dArr, d, Integer.MAX_VALUE);
    }

    @hib
    public static Double[] toObject(@hib double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new Double[0];
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = new Double(dArr[i]);
        }
        return dArr2;
    }

    @hib
    public static byte[] add(@hib byte[] bArr, int i, @hib byte[] bArr2) {
        Object objRealAddArr = realAddArr(bArr, i, bArr2, Byte.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (byte[]) objRealAddArr;
    }

    public static int lastIndexOf(@hib double[] dArr, double d, double d2) {
        return lastIndexOf(dArr, d, Integer.MAX_VALUE, d2);
    }

    public static int lastIndexOf(@hib double[] dArr, double d, int i) {
        if (isEmpty(dArr) || i < 0) {
            return -1;
        }
        if (i >= dArr.length) {
            i = dArr.length - 1;
        }
        while (i >= 0) {
            if (d == dArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @hib
    public static int[] toPrimitive(@hib Integer[] numArr, int i) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i2 = 0; i2 < numArr.length; i2++) {
            Integer num = numArr[i2];
            iArr[i2] = num == null ? i : num.intValue();
        }
        return iArr;
    }

    @hib
    public static short[] add(@hib short[] sArr, int i, @hib short[] sArr2) {
        Object objRealAddArr = realAddArr(sArr, i, sArr2, Short.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (short[]) objRealAddArr;
    }

    public static int indexOf(@hib float[] fArr, float f) {
        return indexOf(fArr, f, 0);
    }

    public static void reverse(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i = 0; length > i; i++) {
            float f = fArr[length];
            fArr[length] = fArr[i];
            fArr[i] = f;
            length--;
        }
    }

    public static int indexOf(@hib float[] fArr, float f, int i) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < fArr.length) {
            if (f == fArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @hib
    public static int[] add(@hib int[] iArr, int i, @hib int[] iArr2) {
        Object objRealAddArr = realAddArr(iArr, i, iArr2, Integer.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (int[]) objRealAddArr;
    }

    @hib
    public static Float[] toObject(@hib float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new Float[0];
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = new Float(fArr[i]);
        }
        return fArr2;
    }

    public static int lastIndexOf(@hib double[] dArr, double d, int i, double d2) {
        if (isEmpty(dArr) || i < 0) {
            return -1;
        }
        if (i >= dArr.length) {
            i = dArr.length - 1;
        }
        double d3 = d - d2;
        double d4 = d + d2;
        while (i >= 0) {
            double d5 = dArr[i];
            if (d5 >= d3 && d5 <= d4) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @hib
    public static long[] add(@hib long[] jArr, int i, @hib long[] jArr2) {
        Object objRealAddArr = realAddArr(jArr, i, jArr2, Long.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (long[]) objRealAddArr;
    }

    public static int indexOf(@hib boolean[] zArr, boolean z) {
        return indexOf(zArr, z, 0);
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i = 0; length > i; i++) {
            boolean z = zArr[length];
            zArr[length] = zArr[i];
            zArr[i] = z;
            length--;
        }
    }

    public static int indexOf(@hib boolean[] zArr, boolean z, int i) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < zArr.length) {
            if (z == zArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @hib
    public static short[] toPrimitive(@hib Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i = 0; i < shArr.length; i++) {
            sArr[i] = shArr[i].shortValue();
        }
        return sArr;
    }

    @hib
    public static float[] add(@hib float[] fArr, int i, @hib float[] fArr2) {
        Object objRealAddArr = realAddArr(fArr, i, fArr2, Float.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (float[]) objRealAddArr;
    }

    public static int lastIndexOf(@hib float[] fArr, float f) {
        return lastIndexOf(fArr, f, Integer.MAX_VALUE);
    }

    @hib
    public static Boolean[] toObject(@hib boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return new Boolean[0];
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = zArr[i] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    @hib
    public static double[] add(@hib double[] dArr, int i, @hib double[] dArr2) {
        Object objRealAddArr = realAddArr(dArr, i, dArr2, Double.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (double[]) objRealAddArr;
    }

    public static int lastIndexOf(@hib float[] fArr, float f, int i) {
        if (isEmpty(fArr) || i < 0) {
            return -1;
        }
        if (i >= fArr.length) {
            i = fArr.length - 1;
        }
        while (i >= 0) {
            if (f == fArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @efb
    public static <T> T[] add(@hib T[] tArr, int i, @hib T t) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else if (t != null) {
            componentType = t.getClass();
        } else {
            return (T[]) new Object[]{null};
        }
        T[] tArr2 = (T[]) ((Object[]) realAdd(tArr, i, t, componentType));
        if (tArr2 != null) {
            return tArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @hib
    public static short[] toPrimitive(@hib Short[] shArr, short s) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i = 0; i < shArr.length; i++) {
            Short sh = shArr[i];
            sArr[i] = sh == null ? s : sh.shortValue();
        }
        return sArr;
    }

    public static int lastIndexOf(@hib boolean[] zArr, boolean z) {
        return lastIndexOf(zArr, z, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@hib boolean[] zArr, boolean z, int i) {
        if (isEmpty(zArr) || i < 0) {
            return -1;
        }
        if (i >= zArr.length) {
            i = zArr.length - 1;
        }
        while (i >= 0) {
            if (z == zArr[i]) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @efb
    public static boolean[] add(@hib boolean[] zArr, int i, boolean z) {
        boolean[] zArr2 = (boolean[]) realAdd(zArr, i, Boolean.valueOf(z), Boolean.TYPE);
        if (zArr2 != null) {
            return zArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static char[] add(@hib char[] cArr, int i, char c) {
        char[] cArr2 = (char[]) realAdd(cArr, i, Character.valueOf(c), Character.TYPE);
        if (cArr2 != null) {
            return cArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static byte[] add(@hib byte[] bArr, int i, byte b) {
        byte[] bArr2 = (byte[]) realAdd(bArr, i, Byte.valueOf(b), Byte.TYPE);
        if (bArr2 != null) {
            return bArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @hib
    public static byte[] toPrimitive(@hib Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    @efb
    public static short[] add(@hib short[] sArr, int i, short s) {
        short[] sArr2 = (short[]) realAdd(sArr, i, Short.valueOf(s), Short.TYPE);
        if (sArr2 != null) {
            return sArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static int[] add(@hib int[] iArr, int i, int i2) {
        int[] iArr2 = (int[]) realAdd(iArr, i, Integer.valueOf(i2), Integer.TYPE);
        if (iArr2 != null) {
            return iArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static long[] add(@hib long[] jArr, int i, long j) {
        long[] jArr2 = (long[]) realAdd(jArr, i, Long.valueOf(j), Long.TYPE);
        if (jArr2 != null) {
            return jArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static float[] add(@hib float[] fArr, int i, float f) {
        float[] fArr2 = (float[]) realAdd(fArr, i, Float.valueOf(f), Float.TYPE);
        if (fArr2 != null) {
            return fArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @efb
    public static double[] add(@hib double[] dArr, int i, double d) {
        double[] dArr2 = (double[]) realAdd(dArr, i, Double.valueOf(d), Double.TYPE);
        if (dArr2 != null) {
            return dArr2;
        }
        throw new NullPointerException("Detected an attempt to return null from a method com.blankj.utilcode.util.ArrayUtils.add() marked by @androidx.annotation.NonNull");
    }

    @hib
    public static byte[] toPrimitive(@hib Byte[] bArr, byte b) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            Byte b2 = bArr[i];
            bArr2[i] = b2 == null ? b : b2.byteValue();
        }
        return bArr2;
    }

    @hib
    public static double[] toPrimitive(@hib Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }

    @hib
    public static double[] toPrimitive(@hib Double[] dArr, double d) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            Double d2 = dArr[i];
            dArr2[i] = d2 == null ? d : d2.doubleValue();
        }
        return dArr2;
    }

    @hib
    public static float[] toPrimitive(@hib Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    @hib
    public static float[] toPrimitive(@hib Float[] fArr, float f) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            Float f2 = fArr[i];
            fArr2[i] = f2 == null ? f : f2.floatValue();
        }
        return fArr2;
    }

    @hib
    public static boolean[] toPrimitive(@hib Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    @hib
    public static boolean[] toPrimitive(@hib Boolean[] boolArr, boolean z) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            Boolean bool = boolArr[i];
            zArr[i] = bool == null ? z : bool.booleanValue();
        }
        return zArr;
    }
}
