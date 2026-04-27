package p000;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fc2 {

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f36072a;

    static {
        Map<String, String> map;
        try {
            Field declaredField = bm7.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map<String, String> mapEmptyMap = Collections.emptyMap();
            th.printStackTrace();
            map = mapEmptyMap;
        }
        f36072a = map;
    }

    private fc2() {
    }

    public static int codepointsForName(@efb String str, @efb int[] iArr) {
        String str2 = f36072a.get(str);
        if (str2 == null) {
            return 0;
        }
        int length = str2.length();
        if (length == 1) {
            iArr[0] = str2.charAt(0);
        } else {
            iArr[0] = str2.charAt(0);
            iArr[1] = str2.charAt(1);
        }
        return length;
    }

    public static boolean isNamedEntity(@efb String str) {
        return f36072a.containsKey(str);
    }
}
