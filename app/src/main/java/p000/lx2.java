package p000;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.app.LocaleManagerCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@igg({"PrivateConstructorForUtilityClass"})
public class lx2 {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    /* JADX INFO: renamed from: lx2$a */
    @c5e(21)
    public static class C9016a {
        private C9016a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static File m16433a(Context context) {
            return context.getCodeCacheDir();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Drawable m16434b(Context context, int i) {
            return context.getDrawable(i);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static File m16435c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: lx2$b */
    @c5e(23)
    public static class C9017b {
        private C9017b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m16436a(Context context, int i) {
            return context.getColor(i);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static <T> T m16437b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static String m16438c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: lx2$c */
    @c5e(24)
    public static class C9018c {
        private C9018c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Context m16439a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static File m16440b(Context context) {
            return context.getDataDir();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m16441c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: lx2$d */
    @c5e(26)
    public static class C9019d {
        private C9019d() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Intent m16442a(Context context, @hib BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, lx2.obtainAndCheckReceiverPermission(context), handler);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static ComponentName m16443b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: lx2$e */
    @c5e(28)
    public static class C9020e {
        private C9020e() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Executor m16444a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: lx2$f */
    @c5e(30)
    public static class C9021f {
        private C9021f() {
        }

        @efb
        @ih4
        /* JADX INFO: renamed from: a */
        public static Context m16445a(@efb Context context, @hib String str) {
            return context.createAttributionContext(str);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static String m16446b(Context context) {
            return context.getAttributionTag();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static Display m16447c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(lx2.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* JADX INFO: renamed from: lx2$g */
    @c5e(33)
    public static class C9022g {
        private C9022g() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Intent m16448a(Context context, @hib BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* JADX INFO: renamed from: lx2$h */
    public static final class C9023h {

        /* JADX INFO: renamed from: a */
        public static final HashMap<Class<?>, String> f59112a;

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            f59112a = map;
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, "activity");
            map.put(AlarmManager.class, NotificationCompat.CATEGORY_ALARM);
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, FirebaseAnalytics.Param.LOCATION);
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, FirebaseAnalytics.Event.SEARCH);
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }

        private C9023h() {
        }
    }

    /* JADX INFO: renamed from: lx2$i */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC9024i {
    }

    public static int checkSelfPermission(@efb Context context, @efb String str) {
        pkb.requireNonNull(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals(xnc.f98618o, str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    @efb
    public static Context createAttributionContext(@efb Context context, @hib String str) {
        return Build.VERSION.SDK_INT >= 30 ? C9021f.m16445a(context, str) : context;
    }

    @hib
    public static Context createDeviceProtectedStorageContext(@efb Context context) {
        return C9018c.m16439a(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    Log.w(TAG, "Unable to create files subdir " + file.getPath());
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @hib
    public static String getAttributionTag(@efb Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C9021f.m16446b(context);
        }
        return null;
    }

    @efb
    public static File getCodeCacheDir(@efb Context context) {
        return C9016a.m16433a(context);
    }

    @g92
    public static int getColor(@efb Context context, @w92 int i) {
        return C9017b.m16436a(context, i);
    }

    @hib
    public static ColorStateList getColorStateList(@efb Context context, @w92 int i) {
        return f7e.getColorStateList(context.getResources(), i, context.getTheme());
    }

    @efb
    public static Context getContextForLanguage(@efb Context context) {
        af9 applicationLocales = LocaleManagerCompat.getApplicationLocales(context);
        if (Build.VERSION.SDK_INT > 32 || applicationLocales.isEmpty()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        rq2.setLocales(configuration, applicationLocales);
        return context.createConfigurationContext(configuration);
    }

    @hib
    public static File getDataDir(@efb Context context) {
        return C9018c.m16440b(context);
    }

    @efb
    public static Display getDisplayOrDefault(@efb Context context) {
        return Build.VERSION.SDK_INT >= 30 ? C9021f.m16447c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @hib
    public static Drawable getDrawable(@efb Context context, @gq4 int i) {
        return C9016a.m16434b(context, i);
    }

    @efb
    public static File[] getExternalCacheDirs(@efb Context context) {
        return context.getExternalCacheDirs();
    }

    @efb
    public static File[] getExternalFilesDirs(@efb Context context, @hib String str) {
        return context.getExternalFilesDirs(str);
    }

    @efb
    public static Executor getMainExecutor(@efb Context context) {
        return Build.VERSION.SDK_INT >= 28 ? C9020e.m16444a(context) : r85.create(new Handler(context.getMainLooper()));
    }

    @hib
    public static File getNoBackupFilesDir(@efb Context context) {
        return C9016a.m16435c(context);
    }

    @efb
    public static File[] getObbDirs(@efb Context context) {
        return context.getObbDirs();
    }

    @efb
    public static String getString(@efb Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    @hib
    public static <T> T getSystemService(@efb Context context, @efb Class<T> cls) {
        return (T) C9017b.m16437b(context, cls);
    }

    @hib
    public static String getSystemServiceName(@efb Context context, @efb Class<?> cls) {
        return C9017b.m16438c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(@efb Context context) {
        return C9018c.m16441c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (aoc.checkSelfPermission(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @hib
    public static Intent registerReceiver(@efb Context context, @hib BroadcastReceiver broadcastReceiver, @efb IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(@efb Context context, @efb Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(@efb Context context, @efb Intent intent, @hib Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(@efb Context context, @efb Intent intent) {
        C9019d.m16443b(context, intent);
    }

    @hib
    public static Intent registerReceiver(@efb Context context, @hib BroadcastReceiver broadcastReceiver, @efb IntentFilter intentFilter, @hib String str, @hib Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 == 0 || (i3 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? C9022g.m16448a(context, broadcastReceiver, intentFilter, str, handler, i3) : C9019d.m16442a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(@efb Context context, @efb Intent[] intentArr, @hib Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
