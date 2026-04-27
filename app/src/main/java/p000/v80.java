package p000;

import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class v80 {
    private v80() {
    }

    @bkd
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @bkd
    public static int checkIndex(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    @bkd
    public static void checkMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    @bkd
    @z25({"#1"})
    public static String checkNotEmpty(@hib String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @bkd
    @z25({"#1"})
    public static <T> T checkNotNull(@hib T t) {
        t.getClass();
        return t;
    }

    @bkd
    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @bkd
    @z25({"#1"})
    public static <T> T checkStateNotNull(@hib T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @bkd
    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @bkd
    @z25({"#1"})
    public static <T> T checkNotNull(@hib T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @bkd
    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @bkd
    @z25({"#1"})
    public static <T> T checkStateNotNull(@hib T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    @bkd
    @z25({"#1"})
    public static String checkNotEmpty(@hib String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }
}
