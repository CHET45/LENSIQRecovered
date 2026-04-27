package p000;

import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mkb {
    private mkb() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <T> int compare(T t, T t2, @efb Comparator<? super T> comparator) {
        if (comparator == null) {
            throw new NullPointerException("Argument 'c' of type Comparator<? super T> (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (t == t2) {
            return 0;
        }
        return comparator.compare(t, t2);
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> T getOrDefault(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int hashCodes(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj.getClass().isArray() && Array.getLength(obj) == 0) {
            return true;
        }
        if ((obj instanceof CharSequence) && obj.toString().length() == 0) {
            return true;
        }
        if ((obj instanceof Collection) && ((Collection) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof scf) && ((scf) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof SparseArray) && ((SparseArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof SparseBooleanArray) && ((SparseBooleanArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof SparseIntArray) && ((SparseIntArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof SparseLongArray) && ((SparseLongArray) obj).size() == 0) {
            return true;
        }
        if ((obj instanceof zl9) && ((zl9) obj).size() == 0) {
            return true;
        }
        return (obj instanceof LongSparseArray) && ((LongSparseArray) obj).size() == 0;
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static <T> T requireNonNull(T t) {
        t.getClass();
        return t;
    }

    public static void requireNonNulls(Object... objArr) {
        objArr.getClass();
        for (Object obj : objArr) {
            obj.getClass();
        }
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String toString(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }

    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

    public static boolean isNotEmpty(scf scfVar) {
        return !isEmpty(scfVar);
    }

    public static boolean isNotEmpty(SparseArray sparseArray) {
        return !isEmpty(sparseArray);
    }

    public static boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        return !isEmpty(sparseBooleanArray);
    }

    public static boolean isNotEmpty(SparseIntArray sparseIntArray) {
        return !isEmpty(sparseIntArray);
    }

    public static boolean isNotEmpty(zl9 zl9Var) {
        return !isEmpty(zl9Var);
    }

    @c5e(api = 18)
    public static boolean isNotEmpty(SparseLongArray sparseLongArray) {
        return !isEmpty(sparseLongArray);
    }

    @c5e(api = 16)
    public static boolean isNotEmpty(LongSparseArray longSparseArray) {
        return !isEmpty(longSparseArray);
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.toString().length() == 0;
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    public static boolean isEmpty(scf scfVar) {
        return scfVar == null || scfVar.isEmpty();
    }

    public static boolean isEmpty(SparseArray sparseArray) {
        return sparseArray == null || sparseArray.size() == 0;
    }

    public static boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray == null || sparseBooleanArray.size() == 0;
    }

    public static boolean isEmpty(SparseIntArray sparseIntArray) {
        return sparseIntArray == null || sparseIntArray.size() == 0;
    }

    public static boolean isEmpty(zl9 zl9Var) {
        return zl9Var == null || zl9Var.size() == 0;
    }

    @c5e(api = 18)
    public static boolean isEmpty(SparseLongArray sparseLongArray) {
        return sparseLongArray == null || sparseLongArray.size() == 0;
    }

    @c5e(api = 16)
    public static boolean isEmpty(LongSparseArray longSparseArray) {
        return longSparseArray == null || longSparseArray.size() == 0;
    }
}
