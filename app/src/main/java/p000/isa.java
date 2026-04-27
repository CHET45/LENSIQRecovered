package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class isa {

    /* JADX INFO: renamed from: a */
    public static final char f48124a = '{';

    /* JADX INFO: renamed from: b */
    public static final char f48125b = '}';

    /* JADX INFO: renamed from: c */
    public static final String f48126c = "{}";

    /* JADX INFO: renamed from: d */
    public static final char f48127d = '\\';

    /* JADX INFO: renamed from: a */
    public static final Throwable m13364a(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    public static final uq6 arrayFormat(String str, Object[] objArr) {
        Throwable thM13364a = m13364a(objArr);
        if (thM13364a != null) {
            objArr = trimmedCopy(objArr);
        }
        return arrayFormat(str, objArr, thM13364a);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m13365b(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    private static void booleanArrayAppend(StringBuilder sb, boolean[] zArr) {
        sb.append(C4584d2.f28242k);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(C4584d2.f28243l);
    }

    private static void byteArrayAppend(StringBuilder sb, byte[] bArr) {
        sb.append(C4584d2.f28242k);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(C4584d2.f28243l);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m13366c(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    private static void charArrayAppend(StringBuilder sb, char[] cArr) {
        sb.append(C4584d2.f28242k);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(C4584d2.f28243l);
    }

    private static void deeplyAppendParameter(StringBuilder sb, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            safeObjectAppend(sb, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            booleanArrayAppend(sb, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayAppend(sb, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            charArrayAppend(sb, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            shortArrayAppend(sb, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            intArrayAppend(sb, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            longArrayAppend(sb, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            floatArrayAppend(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            doubleArrayAppend(sb, (double[]) obj);
        } else {
            objectArrayAppend(sb, (Object[]) obj, map);
        }
    }

    private static void doubleArrayAppend(StringBuilder sb, double[] dArr) {
        sb.append(C4584d2.f28242k);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(C4584d2.f28243l);
    }

    private static void floatArrayAppend(StringBuilder sb, float[] fArr) {
        sb.append(C4584d2.f28242k);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(C4584d2.f28243l);
    }

    public static final uq6 format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    private static void intArrayAppend(StringBuilder sb, int[] iArr) {
        sb.append(C4584d2.f28242k);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(C4584d2.f28243l);
    }

    private static void longArrayAppend(StringBuilder sb, long[] jArr) {
        sb.append(C4584d2.f28242k);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(C4584d2.f28243l);
    }

    private static void objectArrayAppend(StringBuilder sb, Object[] objArr, Map<Object[], Object> map) {
        sb.append(C4584d2.f28242k);
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                deeplyAppendParameter(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb.append(C4584d2.f28243l);
    }

    private static void safeObjectAppend(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            z0i.report("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
            sb.append("[FAILED toString()]");
        }
    }

    private static void shortArrayAppend(StringBuilder sb, short[] sArr) {
        sb.append(C4584d2.f28242k);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(C4584d2.f28243l);
    }

    private static Object[] trimmedCopy(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    public static final uq6 format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }

    public static final uq6 arrayFormat(String str, Object[] objArr, Throwable th) {
        int i;
        if (str == null) {
            return new uq6(null, objArr, th);
        }
        if (objArr == null) {
            return new uq6(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf(f48126c, i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return new uq6(str, objArr, th);
                }
                sb.append((CharSequence) str, i3, str.length());
                return new uq6(sb.toString(), objArr, th);
            }
            if (m13366c(str, iIndexOf)) {
                if (!m13365b(str, iIndexOf)) {
                    i2--;
                    sb.append((CharSequence) str, i3, iIndexOf - 1);
                    sb.append('{');
                    i = iIndexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    sb.append((CharSequence) str, i3, iIndexOf - 1);
                    deeplyAppendParameter(sb, objArr[i2], new HashMap());
                }
            } else {
                sb.append((CharSequence) str, i3, iIndexOf);
                deeplyAppendParameter(sb, objArr[i2], new HashMap());
            }
            i = iIndexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        return new uq6(sb.toString(), objArr, th);
    }
}
