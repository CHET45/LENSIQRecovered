package p000;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class dhi {

    /* JADX INFO: renamed from: a */
    public static final String f29682a = cj9.tagWithPrefix("WakeLocks");

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f29683b = new WeakHashMap<>();

    private dhi() {
    }

    public static void checkWakeLocks() {
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f29683b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                cj9.get().warning(f29682a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock newWakeLock(@efb Context context, @efb String tag) {
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f29683b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str);
        }
        return wakeLockNewWakeLock;
    }
}
