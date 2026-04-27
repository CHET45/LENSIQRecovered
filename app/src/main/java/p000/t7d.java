package p000;

import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class t7d {
    private t7d() {
    }

    public static void checkArgument(boolean z, @efb String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @efb
    public static String checkNotEmpty(@hib String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    @efb
    public static <T> T checkNotNull(@hib T t) {
        return (T) checkNotNull(t, "Argument must not be null");
    }

    @efb
    public static <T> T checkNotNull(@hib T t, @efb String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    @efb
    public static <T extends Collection<Y>, Y> T checkNotEmpty(@efb T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }
}
