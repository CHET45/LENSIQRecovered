package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class okb extends sj5 {
    private okb() {
    }

    public static boolean equal(@wx1 Object a, @wx1 Object b) {
        return a == b || (a != null && a.equals(b));
    }

    public static int hashCode(@wx1 Object... objects) {
        return Arrays.hashCode(objects);
    }
}
