package p000;

import com.blankj.utilcode.util.C2473f;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 uz2, still in use, count: 1, list:
  (r0v0 uz2) from 0x009c: FILLED_NEW_ARRAY (r0v0 uz2), (r1v1 uz2), (r3v3 uz2), (r12v1 uz2), (r13v1 uz2) A[WRAPPED] elemType: uz2
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
public final class uz2 {
    GENERAL("bBhHsS", null),
    CHAR("cC", Character.class, Byte.class, Short.class, Integer.class),
    INT("doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", Long.class, Calendar.class, Date.class),
    CHAR_AND_INT(null, Byte.class, Short.class, Integer.class),
    INT_AND_TIME(null, Long.class),
    NULL(null, new Class[0]),
    UNUSED(null, null);


    /* JADX INFO: renamed from: M */
    public static final uz2[] f89538M;

    /* JADX INFO: renamed from: N */
    public static final uz2[] f89539N;

    /* JADX INFO: renamed from: Q */
    public static final uz2[] f89540Q;

    /* JADX INFO: renamed from: a */
    public final Class<?>[] f89547a;

    /* JADX INFO: renamed from: b */
    public final String f89548b;

    static {
        uz2 uz2Var = CHAR;
        uz2 uz2Var2 = INT;
        uz2 uz2Var3 = FLOAT;
        uz2 uz2Var4 = TIME;
        uz2 uz2Var5 = CHAR_AND_INT;
        uz2 uz2Var6 = INT_AND_TIME;
        uz2 uz2Var7 = NULL;
        f89538M = new uz2[]{uz2Var, uz2Var, uz2Var2, uz2Var3, uz2Var4};
        f89539N = new uz2[]{uz2Var, uz2Var2, uz2Var3, uz2Var4, uz2Var5, uz2Var6, uz2Var7};
        f89540Q = new uz2[]{uz2Var7, uz2Var5, uz2Var6, uz2Var, uz2Var2, uz2Var3, uz2Var4};
    }

    private uz2(String str, Class... clsArr) {
        this.f89548b = str;
        if (clsArr == null) {
            this.f89547a = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(cls);
            Class<? extends Object> clsUnwrapPrimitive = unwrapPrimitive(cls);
            if (clsUnwrapPrimitive != null) {
                arrayList.add(clsUnwrapPrimitive);
            }
        }
        this.f89547a = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    private static <E> Set<E> arrayToSet(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static uz2 fromConversionChar(char c) {
        for (uz2 uz2Var : f89538M) {
            if (uz2Var.f89548b.contains(String.valueOf(c))) {
                return uz2Var;
            }
        }
        throw new IllegalArgumentException("Bad conversion character " + c);
    }

    public static uz2 intersect(uz2 uz2Var, uz2 uz2Var2) {
        uz2 uz2Var3 = UNUSED;
        if (uz2Var == uz2Var3) {
            return uz2Var2;
        }
        if (uz2Var2 == uz2Var3) {
            return uz2Var;
        }
        uz2 uz2Var4 = GENERAL;
        if (uz2Var == uz2Var4) {
            return uz2Var2;
        }
        if (uz2Var2 == uz2Var4) {
            return uz2Var;
        }
        Set setArrayToSet = arrayToSet(uz2Var.f89547a);
        setArrayToSet.retainAll(arrayToSet(uz2Var2.f89547a));
        for (uz2 uz2Var5 : f89539N) {
            if (arrayToSet(uz2Var5.f89547a).equals(setArrayToSet)) {
                return uz2Var5;
            }
        }
        throw new RuntimeException();
    }

    public static boolean isSubsetOf(uz2 uz2Var, uz2 uz2Var2) {
        return intersect(uz2Var, uz2Var2) == uz2Var;
    }

    public static uz2 union(uz2 uz2Var, uz2 uz2Var2) {
        uz2 uz2Var3 = UNUSED;
        if (uz2Var == uz2Var3 || uz2Var2 == uz2Var3 || uz2Var == (uz2Var3 = GENERAL) || uz2Var2 == uz2Var3) {
            return uz2Var3;
        }
        uz2 uz2Var4 = CHAR_AND_INT;
        if ((uz2Var == uz2Var4 && uz2Var2 == INT_AND_TIME) || (uz2Var == INT_AND_TIME && uz2Var2 == uz2Var4)) {
            return INT;
        }
        Set setArrayToSet = arrayToSet(uz2Var.f89547a);
        setArrayToSet.addAll(arrayToSet(uz2Var2.f89547a));
        for (uz2 uz2Var5 : f89540Q) {
            if (arrayToSet(uz2Var5.f89547a).equals(setArrayToSet)) {
                return uz2Var5;
            }
        }
        return GENERAL;
    }

    private static Class<? extends Object> unwrapPrimitive(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return null;
    }

    public static uz2 valueOf(String str) {
        return (uz2) Enum.valueOf(uz2.class, str);
    }

    public static uz2[] values() {
        return (uz2[]) f89541X.clone();
    }

    public boolean isAssignableFrom(Class<?> cls) {
        Class<?>[] clsArr = this.f89547a;
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
    @bkd
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class<?>[] clsArr = this.f89547a;
        if (clsArr == null || clsArr.length == 0) {
            return sb.toString();
        }
        StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", c0b.f15434d);
        for (Class<?> cls : this.f89547a) {
            stringJoiner.add(cls.getSimpleName());
        }
        sb.append(C2473f.f17566z);
        sb.append(stringJoiner);
        return sb.toString();
    }
}
