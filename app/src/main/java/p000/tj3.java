package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class tj3 {

    /* JADX INFO: renamed from: a */
    public static final int f85022a = 64;

    /* JADX INFO: renamed from: b */
    public static final Map<String, Long> f85023b = new ConcurrentHashMap(64);

    /* JADX INFO: renamed from: c */
    public static final long f85024c = 1000;

    private tj3() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void clearIfNecessary(long j) {
        Map<String, Long> map = f85023b;
        if (map.size() < 64) {
            return;
        }
        Iterator<Map.Entry<String, Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (j >= it.next().getValue().longValue()) {
                it.remove();
            }
        }
    }

    public static boolean isValid(@efb View view) {
        if (view != null) {
            return isValid(view, 1000L);
        }
        throw new NullPointerException("Argument 'view' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isValid(@efb View view, long j) {
        if (view != null) {
            return isValid(String.valueOf(view.hashCode()), j);
        }
        throw new NullPointerException("Argument 'view' of type View (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isValid(@efb String str, long j) {
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("The key is null.");
            }
            if (j >= 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                clearIfNecessary(jElapsedRealtime);
                Map<String, Long> map = f85023b;
                Long l = map.get(str);
                if (l != null && jElapsedRealtime < l.longValue()) {
                    return false;
                }
                map.put(str, Long.valueOf(jElapsedRealtime + j));
                return true;
            }
            throw new IllegalArgumentException("The duration is less than 0.");
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
