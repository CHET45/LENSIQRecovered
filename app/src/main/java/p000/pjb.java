package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class pjb {
    private pjb() {
    }

    @op1
    /* JADX INFO: renamed from: a */
    public static Object m19531a(@wx1 Object element, int index) {
        if (element != null) {
            return element;
        }
        throw new NullPointerException("at index " + index);
    }

    @op1
    /* JADX INFO: renamed from: b */
    public static Object[] m19532b(Object... array) {
        m19533c(array, array.length);
        return array;
    }

    @op1
    /* JADX INFO: renamed from: c */
    public static Object[] m19533c(Object[] array, int length) {
        for (int i = 0; i < length; i++) {
            m19531a(array[i], i);
        }
        return array;
    }

    @jd7
    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* JADX INFO: renamed from: d */
    public static Object[] m19534d(Object[] elements, int offset, int length) {
        v7d.checkPositionIndexes(offset, offset + length, elements.length);
        if (length == 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[length];
        System.arraycopy(elements, offset, objArr, 0, length);
        return objArr;
    }

    /* JADX INFO: renamed from: e */
    public static void m19535e(Object[] array, int i, int j) {
        Object obj = array[i];
        array[i] = array[j];
        array[j] = obj;
    }

    /* JADX INFO: renamed from: f */
    public static Object[] m19536f(Collection<?> c) {
        return fillArray(c, new Object[c.size()]);
    }

    @op1
    private static Object[] fillArray(Iterable<?> elements, Object[] array) {
        Iterator<?> it = elements.iterator();
        int i = 0;
        while (it.hasNext()) {
            array[i] = it.next();
            i++;
        }
        return array;
    }

    /* JADX INFO: renamed from: g */
    public static <T> T[] m19537g(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public static <T> T[] m19538h(Object[] objArr, int i, int i2, T[] tArr) {
        v7d.checkPositionIndexes(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) newArray(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }

    @jd7
    public static <T> T[] newArray(Class<T> cls, int i) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
    }

    public static <T> T[] newArray(T[] tArr, int i) {
        return (T[]) swc.m22270c(tArr, i);
    }

    public static <T> T[] concat(@dgc T t, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, @dgc T t) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t;
        return tArr2;
    }
}
