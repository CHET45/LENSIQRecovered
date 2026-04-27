package p000;

import androidx.appcompat.widget.C0546a;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes8.dex */
public enum dp7 {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{"date", C0546a.f3357s}),
    NUMBER(new Class[]{Number.class}, new String[]{"number", "choice"});


    /* JADX INFO: renamed from: C */
    public static final dp7[] f30321C;

    /* JADX INFO: renamed from: m */
    public static final dp7[] f30327m;

    /* JADX INFO: renamed from: a */
    public final Class<?>[] f30328a;

    /* JADX INFO: renamed from: b */
    public final String[] f30329b;

    static {
        dp7 dp7Var = DATE;
        dp7 dp7Var2 = NUMBER;
        f30327m = new dp7[]{dp7Var, dp7Var2};
        f30321C = new dp7[]{dp7Var, dp7Var2};
    }

    dp7(Class[] clsArr, String[] strArr) {
        this.f30328a = clsArr;
        this.f30329b = strArr;
    }

    private static <E> Set<E> arrayToSet(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static dp7 intersect(dp7 dp7Var, dp7 dp7Var2) {
        dp7 dp7Var3 = UNUSED;
        if (dp7Var == dp7Var3) {
            return dp7Var2;
        }
        if (dp7Var2 == dp7Var3) {
            return dp7Var;
        }
        dp7 dp7Var4 = GENERAL;
        if (dp7Var == dp7Var4) {
            return dp7Var2;
        }
        if (dp7Var2 == dp7Var4) {
            return dp7Var;
        }
        Set setArrayToSet = arrayToSet(dp7Var.f30328a);
        setArrayToSet.retainAll(arrayToSet(dp7Var2.f30328a));
        for (dp7 dp7Var5 : f30321C) {
            if (arrayToSet(dp7Var5.f30328a).equals(setArrayToSet)) {
                return dp7Var5;
            }
        }
        throw new RuntimeException();
    }

    public static boolean isSubsetOf(dp7 dp7Var, dp7 dp7Var2) {
        return intersect(dp7Var, dp7Var2) == dp7Var;
    }

    public static dp7 stringToI18nConversionCategory(String str) {
        String lowerCase = str.toLowerCase();
        for (dp7 dp7Var : f30327m) {
            for (String str2 : dp7Var.f30329b) {
                if (str2.equals(lowerCase)) {
                    return dp7Var;
                }
            }
        }
        throw new IllegalArgumentException("Invalid format type " + lowerCase);
    }

    public static dp7 union(dp7 dp7Var, dp7 dp7Var2) {
        dp7 dp7Var3 = UNUSED;
        return (dp7Var == dp7Var3 || dp7Var2 == dp7Var3 || dp7Var == (dp7Var3 = GENERAL) || dp7Var2 == dp7Var3 || dp7Var == (dp7Var3 = DATE) || dp7Var2 == dp7Var3) ? dp7Var3 : NUMBER;
    }

    public boolean isAssignableFrom(Class<?> cls) {
        Class<?>[] clsArr = this.f30328a;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder(name());
        if (this.f30328a == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", c0b.f15434d);
            for (Class<?> cls : this.f30328a) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb.append(stringJoiner);
        }
        return sb.toString();
    }
}
