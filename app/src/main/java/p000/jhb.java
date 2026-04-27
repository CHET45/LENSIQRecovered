package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class jhb {

    /* JADX INFO: renamed from: a */
    public static final int f50565a = 200;

    /* JADX INFO: renamed from: b */
    public static final String f50566b = "NotificationPermissionUtils";

    public static boolean checkPermission(Context context) {
        return Build.VERSION.SDK_INT < 33 || lx2.checkSelfPermission(context, xnc.f98618o) == 0;
    }

    public static void requestPermission(Activity activity, c4c onPermissionResult) {
        if (Build.VERSION.SDK_INT < 33) {
            onPermissionResult.permissionResult(true);
        } else if (checkPermission(activity)) {
            onPermissionResult.permissionResult(true);
        } else {
            ihb.requestPermission(activity, onPermissionResult);
        }
    }
}
