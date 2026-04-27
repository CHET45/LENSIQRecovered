package p000;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class dd2 {
    private int assertArraysAreSameLength(Object obj, Object obj2, String str) {
        if (obj == null) {
            q80.fail(str + "expected array was null");
        }
        if (obj2 == null) {
            q80.fail(str + "actual array was null");
        }
        int length = Array.getLength(obj2);
        int length2 = Array.getLength(obj);
        if (length != length2) {
            q80.fail(str + "array lengths differed, expected.length=" + length2 + " actual.length=" + length);
        }
        return length2;
    }

    private boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2788a(Object obj, Object obj2);

    public void arrayEquals(String str, Object obj, Object obj2) throws v50 {
        if (obj == obj2 || Arrays.deepEquals(new Object[]{obj}, new Object[]{obj2})) {
            return;
        }
        String str2 = str == null ? "" : str + ": ";
        int iAssertArraysAreSameLength = assertArraysAreSameLength(obj, obj2, str2);
        for (int i = 0; i < iAssertArraysAreSameLength; i++) {
            Object obj3 = Array.get(obj, i);
            Object obj4 = Array.get(obj2, i);
            if (isArray(obj3) && isArray(obj4)) {
                try {
                    arrayEquals(str, obj3, obj4);
                } catch (v50 e) {
                    e.addDimension(i);
                    throw e;
                }
            } else {
                try {
                    mo2788a(obj3, obj4);
                } catch (AssertionError e2) {
                    throw new v50(str2, e2, i);
                }
            }
        }
    }
}
