package p000;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.blankj.utilcode.util.C2479l;

/* JADX INFO: loaded from: classes3.dex */
public final class cta {
    private cta() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String getMetaDataInActivity(@efb Activity activity, @efb String str) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (str != null) {
            return getMetaDataInActivity((Class<? extends Activity>) activity.getClass(), str);
        }
        throw new NullPointerException("Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getMetaDataInApp(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        try {
            return String.valueOf(C2479l.getApp().getPackageManager().getApplicationInfo(C2479l.getApp().getPackageName(), 128).metaData.get(str));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getMetaDataInReceiver(@efb BroadcastReceiver broadcastReceiver, @efb String str) {
        if (broadcastReceiver == null) {
            throw new NullPointerException("Argument 'receiver' of type BroadcastReceiver (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (str != null) {
            return getMetaDataInReceiver(broadcastReceiver, str);
        }
        throw new NullPointerException("Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getMetaDataInService(@efb Service service, @efb String str) {
        if (service == null) {
            throw new NullPointerException("Argument 'service' of type Service (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (str != null) {
            return getMetaDataInService((Class<? extends Service>) service.getClass(), str);
        }
        throw new NullPointerException("Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getMetaDataInActivity(@efb Class<? extends Activity> cls, @efb String str) {
        if (cls == null) {
            throw new NullPointerException("Argument 'clz' of type Class<? extends Activity> (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (str != null) {
            try {
                return String.valueOf(C2479l.getApp().getPackageManager().getActivityInfo(new ComponentName(C2479l.getApp(), cls), 128).metaData.get(str));
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return "";
            }
        }
        throw new NullPointerException("Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getMetaDataInReceiver(@efb Class<? extends BroadcastReceiver> cls, @efb String str) {
        if (cls == null) {
            throw new NullPointerException("Argument 'clz' of type Class<? extends BroadcastReceiver> (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (str != null) {
            try {
                return String.valueOf(C2479l.getApp().getPackageManager().getReceiverInfo(new ComponentName(C2479l.getApp(), cls), 128).metaData.get(str));
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return "";
            }
        }
        throw new NullPointerException("Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getMetaDataInService(@efb Class<? extends Service> cls, @efb String str) {
        if (cls == null) {
            throw new NullPointerException("Argument 'clz' of type Class<? extends Service> (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (str != null) {
            try {
                return String.valueOf(C2479l.getApp().getPackageManager().getServiceInfo(new ComponentName(C2479l.getApp(), cls), 128).metaData.get(str));
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return "";
            }
        }
        throw new NullPointerException("Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
