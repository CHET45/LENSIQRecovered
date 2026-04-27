package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;

/* JADX INFO: loaded from: classes3.dex */
public final class fre {
    private fre() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getAppScreenHeight() {
        WindowManager windowManager = (WindowManager) C2479l.getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int getAppScreenWidth() {
        WindowManager windowManager = (WindowManager) C2479l.getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static float getScreenDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int getScreenDensityDpi() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static int getScreenHeight() {
        WindowManager windowManager = (WindowManager) C2479l.getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int getScreenRotation(@efb Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public static int getScreenWidth() {
        WindowManager windowManager = (WindowManager) C2479l.getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static float getScreenXDpi() {
        return Resources.getSystem().getDisplayMetrics().xdpi;
    }

    public static float getScreenYDpi() {
        return Resources.getSystem().getDisplayMetrics().ydpi;
    }

    public static int getSleepDuration() {
        try {
            return Settings.System.getInt(C2479l.getApp().getContentResolver(), "screen_off_timeout");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return -123;
        }
    }

    public static boolean isFullScreen(@efb Activity activity) {
        if (activity != null) {
            return (activity.getWindow().getAttributes().flags & 1024) == 1024;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isLandscape() {
        return C2479l.getApp().getResources().getConfiguration().orientation == 2;
    }

    public static boolean isPortrait() {
        return C2479l.getApp().getResources().getConfiguration().orientation == 1;
    }

    public static boolean isScreenLock() {
        KeyguardManager keyguardManager = (KeyguardManager) C2479l.getApp().getSystemService("keyguard");
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static Bitmap screenShot(@efb Activity activity) {
        if (activity != null) {
            return screenShot(activity, false);
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setFullScreen(@efb Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        activity.getWindow().addFlags(1024);
    }

    @igg({"SourceLockedOrientationActivity"})
    public static void setLandscape(@efb Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        activity.setRequestedOrientation(0);
    }

    public static void setNonFullScreen(@efb Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        activity.getWindow().clearFlags(1024);
    }

    @igg({"SourceLockedOrientationActivity"})
    public static void setPortrait(@efb Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        activity.setRequestedOrientation(1);
    }

    @j5e(xnc.f98610g)
    public static void setSleepDuration(int i) {
        Settings.System.putInt(C2479l.getApp().getContentResolver(), "screen_off_timeout", i);
    }

    public static void toggleFullScreen(@efb Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        boolean zIsFullScreen = isFullScreen(activity);
        Window window = activity.getWindow();
        if (zIsFullScreen) {
            window.clearFlags(1024);
        } else {
            window.addFlags(1024);
        }
    }

    public int calculateDistanceByX(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return getScreenWidth() - iArr[0];
    }

    public int calculateDistanceByY(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return getScreenHeight() - iArr[1];
    }

    public int getViewX(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public int getViewY(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    public static Bitmap screenShot(@efb Activity activity, boolean z) {
        if (activity != null) {
            Bitmap bitmapM4293d1 = C2481n.m4293d1(activity.getWindow().getDecorView());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (z) {
                int iM4292d0 = C2481n.m4292d0();
                return Bitmap.createBitmap(bitmapM4293d1, 0, iM4292d0, displayMetrics.widthPixels, displayMetrics.heightPixels - iM4292d0);
            }
            return Bitmap.createBitmap(bitmapM4293d1, 0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
