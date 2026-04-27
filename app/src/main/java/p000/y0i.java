package p000;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class y0i {

    /* JADX INFO: renamed from: a */
    public static final String[] f99993a = new String[0];

    /* JADX INFO: renamed from: b */
    public static final Charset f99994b = Charset.forName("UTF-8");

    private y0i() {
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> List<T> immutableList(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] intersect(Class<T> cls, T[] tArr, T[] tArr2) {
        List listIntersect = intersect(tArr, tArr2);
        return (T[]) listIntersect.toArray((Object[]) Array.newInstance((Class<?>) cls, listIntersect.size()));
    }

    private static <T> List<T> intersect(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t2 = tArr2[i];
                    if (t.equals(t2)) {
                        arrayList.add(t2);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }
}
