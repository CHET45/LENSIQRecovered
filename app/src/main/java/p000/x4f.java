package p000;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.ServiceConnection;
import com.blankj.utilcode.util.C2479l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class x4f {
    private x4f() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void bindService(@efb String str, @efb ServiceConnection serviceConnection, int i) {
        if (str == null) {
            throw new NullPointerException("Argument 'className' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (serviceConnection == null) {
            throw new NullPointerException("Argument 'conn' of type ServiceConnection (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        try {
            bindService(Class.forName(str), serviceConnection, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Set<String> getAllRunningServices() {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) C2479l.getApp().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        HashSet hashSet = new HashSet();
        if (runningServices == null || runningServices.size() == 0) {
            return null;
        }
        Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().service.getClassName());
        }
        return hashSet;
    }

    public static boolean isServiceRunning(@efb Class<?> cls) {
        if (cls != null) {
            return isServiceRunning(cls.getName());
        }
        throw new NullPointerException("Argument 'cls' of type Class<?> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void startService(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'className' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        try {
            startService(Class.forName(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean stopService(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'className' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        try {
            return stopService(Class.forName(str));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void unbindService(@efb ServiceConnection serviceConnection) {
        if (serviceConnection == null) {
            throw new NullPointerException("Argument 'conn' of type ServiceConnection (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        C2479l.getApp().unbindService(serviceConnection);
    }

    public static boolean isServiceRunning(@efb String str) {
        if (str != null) {
            try {
                List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) C2479l.getApp().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
                if (runningServices != null && runningServices.size() != 0) {
                    Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                    while (it.hasNext()) {
                        if (str.equals(it.next().service.getClassName())) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
        throw new NullPointerException("Argument 'className' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void startService(@efb Class<?> cls) {
        if (cls != null) {
            startService(new Intent(C2479l.getApp(), cls));
            return;
        }
        throw new NullPointerException("Argument 'cls' of type Class<?> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean stopService(@efb Class<?> cls) {
        if (cls != null) {
            return stopService(new Intent(C2479l.getApp(), cls));
        }
        throw new NullPointerException("Argument 'cls' of type Class<?> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void bindService(@efb Class<?> cls, @efb ServiceConnection serviceConnection, int i) {
        if (cls == null) {
            throw new NullPointerException("Argument 'cls' of type Class<?> (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (serviceConnection != null) {
            bindService(new Intent(C2479l.getApp(), cls), serviceConnection, i);
            return;
        }
        throw new NullPointerException("Argument 'conn' of type ServiceConnection (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void startService(Intent intent) {
        try {
            intent.setFlags(32);
            C2479l.getApp().startForegroundService(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean stopService(@efb Intent intent) {
        if (intent != null) {
            try {
                return C2479l.getApp().stopService(intent);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        throw new NullPointerException("Argument 'intent' of type Intent (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void bindService(@efb Intent intent, @efb ServiceConnection serviceConnection, int i) {
        if (intent == null) {
            throw new NullPointerException("Argument 'intent' of type Intent (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (serviceConnection != null) {
            try {
                C2479l.getApp().bindService(intent, serviceConnection, i);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        throw new NullPointerException("Argument 'conn' of type ServiceConnection (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
