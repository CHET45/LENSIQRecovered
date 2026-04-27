package com.eyevue.glassapp.utils.photo;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import p000.lx2;
import p000.xnc;

/* JADX INFO: loaded from: classes4.dex */
public class PermissionUtils {
    public static final int PERMISSION_REQUEST_CODE = 100;
    private static final String TAG = "PermissionUtils";

    public interface PermissionCallback {
        void onPermissionDenied();

        void onPermissionGranted();
    }

    public static boolean checkStoragePermission(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        boolean z = lx2.checkSelfPermission(context, xnc.f98580E) == 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Check storage permission (Android < R): ");
        sb.append(z);
        return z;
    }

    public static boolean handlePermissionResult(int requestCode, int[] grantResults, PermissionCallback callback) {
        if (requestCode == 100) {
            if (grantResults.length > 0 && grantResults[0] == 0) {
                if (callback == null) {
                    return true;
                }
                callback.onPermissionGranted();
                return true;
            }
            if (callback != null) {
                callback.onPermissionDenied();
            }
        }
        return false;
    }

    public static void requestStoragePermission(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{xnc.f98580E}, 100);
    }
}
