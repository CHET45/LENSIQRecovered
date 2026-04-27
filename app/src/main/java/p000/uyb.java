package p000;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public class uyb {
    public static boolean checkGpsProviderEnable(Context context) {
        LocationManager locationManager;
        return (context == null || (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.C3552d.f23227s)) == null || !locationManager.isProviderEnabled("gps")) ? false : true;
    }

    public static boolean checkPermissionShouldShowDialog(AppCompatActivity appCompatActivity, String str) {
        return str != null && ActivityCompat.shouldShowRequestPermissionRationale(appCompatActivity, str);
    }

    public static boolean hasPermissions(Context context, String[] strArr) {
        if (context == null || strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (lx2.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
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

    public static boolean isHasPermission(Context context, String str) {
        return context != null && lx2.checkSelfPermission(context, str) == 0;
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
