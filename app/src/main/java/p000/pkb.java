package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class pkb {
    private pkb() {
    }

    public static boolean equals(@hib Object obj, @hib Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int hash(@hib Object... objArr) {
        return Objects.hash(objArr);
    }

    public static int hashCode(@hib Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @efb
    public static <T> T requireNonNull(@hib T t) {
        t.getClass();
        return t;
    }

    @hib
    public static String toString(@hib Object obj, @hib String str) {
        return obj != null ? obj.toString() : str;
    }

    @efb
    public static <T> T requireNonNull(@hib T t, @efb String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
