package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class x7d {
    public static void checkArgument(boolean z, @eib String str, @eib Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T checkNotNull(@ofb T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static <T> T checkNotNull(@ofb T t, @eib Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T checkNotNull(@ofb T t, String str, @eib Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.format(Locale.US, str, objArr));
    }
}
