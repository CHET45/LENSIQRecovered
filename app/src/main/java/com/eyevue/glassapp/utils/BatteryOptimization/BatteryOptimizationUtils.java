package com.eyevue.glassapp.utils.BatteryOptimization;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import p000.c5e;

/* JADX INFO: loaded from: classes4.dex */
public class BatteryOptimizationUtils {
    private static final int REQUEST_BATTERY_OPTIMIZATION_SETTINGS = 1002;
    private static final int REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = 1001;
    private static BatteryOptimizationCallback sCallback;

    public static void handleActivityResult(int requestCode, int resultCode, Intent data, Activity activity) {
        if (sCallback == null) {
            return;
        }
        sCallback.onResult((requestCode == 1001 || requestCode == 1002) ? isIgnoringBatteryOptimizations(activity) : false, requestCode);
        sCallback = null;
    }

    public static boolean isIgnoringBatteryOptimizations(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return false;
    }

    @c5e(api = 23)
    public static void jumpAutoStartManagementActivity(Activity activity, BatteryOptimizationCallback callback) {
        sCallback = callback;
        if (isIgnoringBatteryOptimizations(activity)) {
            if (callback != null) {
                callback.onResult(true, 1002);
            }
        } else {
            Intent intent = new Intent();
            intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
            activity.startActivityForResult(intent, 1002);
        }
    }

    @c5e(api = 23)
    public static void requestIgnoreBatteryOptimizations(Activity activity, BatteryOptimizationCallback callback) {
        sCallback = callback;
        if (isIgnoringBatteryOptimizations(activity)) {
            if (callback != null) {
                callback.onResult(true, 1001);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + activity.getPackageName()));
        activity.startActivityForResult(intent, 1001);
    }
}
