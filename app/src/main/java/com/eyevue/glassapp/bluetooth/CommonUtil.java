package com.eyevue.glassapp.bluetooth;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.util.Calendar;
import java.util.Locale;
import p000.igg;
import p000.lx2;
import p000.xnc;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtil {

    @igg({"StaticFieldLeak"})
    private static Context mainContext;
    private static Handler mainHandler;

    public static void checkAllNotNull(Object... references) {
        for (Object obj : references) {
            obj.getClass();
        }
    }

    public static boolean checkHasConnectPermission(Context context) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return checkHasPermission(context, xnc.f98625v);
        }
        return true;
    }

    public static boolean checkHasPermission(Context context, String permission) {
        return context != null && lx2.checkSelfPermission(context, permission) == 0;
    }

    public static boolean checkHasScanPermission(Context context) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return checkHasPermission(context, xnc.f98624u);
        }
        return true;
    }

    public static <T> T checkNotNull(T obj) {
        obj.getClass();
        return obj;
    }

    public static String formatString(String format, Object... args) {
        return String.format(Locale.ENGLISH, format, args);
    }

    public static long getCurrentTime() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static Context getMainContext() {
        return mainContext;
    }

    public static Handler getMainHandler() {
        return mainHandler;
    }

    public static boolean isHasLocationPermission() {
        return isHasLocationPermission(mainContext);
    }

    public static boolean isHasPermission(Context context, String permission) {
        return context != null && lx2.checkSelfPermission(context, permission) == 0;
    }

    public static boolean isHasStoragePermission() {
        return isHasStoragePermission(mainContext);
    }

    private static void releaseMainContext() {
        Handler handler = mainHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            mainHandler = null;
        }
        if (mainContext != null) {
            mainContext = null;
            System.gc();
        }
    }

    public static void setMainContext(Context context) {
        mainContext = (Context) checkNotNull(context);
        mainHandler = new Handler(mainContext.getMainLooper());
    }

    public void finalize() throws Throwable {
        releaseMainContext();
        super.finalize();
    }

    public static <T> T checkNotNull(T obj, String errMsg) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(errMsg);
    }

    public static boolean isHasLocationPermission(Context context) {
        return Build.VERSION.SDK_INT >= 31 || isHasPermission(context, xnc.f98584I) || isHasPermission(context, xnc.f98583H);
    }

    public static boolean isHasStoragePermission(Context context) {
        return isHasPermission(context, xnc.f98580E) || isHasPermission(context, xnc.f98579D);
    }
}
