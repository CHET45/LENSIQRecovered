package p000;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class h70 {
    private h70() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> T[] m12172a(T[] tArr, int i) {
        if (tArr.length < i) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
