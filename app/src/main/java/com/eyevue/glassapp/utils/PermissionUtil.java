package com.eyevue.glassapp.utils;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import p000.lx2;
import p000.xnc;

/* JADX INFO: loaded from: classes4.dex */
public class PermissionUtil {
    public static boolean checkGpsProviderEnable(Context context) {
        LocationManager locationManager;
        return (context == null || (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.C3552d.f23227s)) == null || !locationManager.isProviderEnabled("gps")) ? false : true;
    }

    public static boolean checkPermissionShouldShowDialog(AppCompatActivity activity, String permission) {
        return permission != null && ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    }

    public static boolean isHasConnectPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return isHasPermission(context, xnc.f98625v);
        }
        return true;
    }

    public static boolean isHasLocationPermission(Context context) {
        return isHasPermission(context, xnc.f98584I);
    }

    public static boolean isHasPermission(Context context, String permission) {
        return context != null && lx2.checkSelfPermission(context, permission) == 0;
    }

    public static boolean isHasScanPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return isHasPermission(context, xnc.f98624u);
        }
        return true;
    }

    public static boolean isHasStoragePermission(Context context) {
        return isHasPermission(context, xnc.f98580E) && isHasPermission(context, xnc.f98579D);
    }

    public static boolean isRecordPermission(Context context) {
        return isHasPermission(context, xnc.f98582G);
    }
}
