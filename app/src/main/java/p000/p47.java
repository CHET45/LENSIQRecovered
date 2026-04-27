package p000;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.provider.Settings;

/* JADX INFO: loaded from: classes5.dex */
public final class p47 {

    /* JADX INFO: renamed from: a */
    public static final String f69632a = "OP_GET_INSTALLED_APPS";

    /* JADX INFO: renamed from: b */
    public static final int f69633b = 10022;

    /* JADX INFO: renamed from: a */
    public static Intent m19266a(@efb Context context) {
        if (zsc.m27079f()) {
            return o1g.m18258a(zsc.m27080g() ? bpc.m3319g(context) : null, bpc.m3314b(context));
        }
        return bpc.m3314b(context);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19267b(@efb Activity activity) {
        if (!C5487ew.m10315k()) {
            return false;
        }
        if (C5487ew.m10318n() && isSupportGetInstalledAppsPermission(activity)) {
            return (qpc.m20482f(activity, xnc.f98602a) || qpc.m20498v(activity, xnc.f98602a)) ? false : true;
        }
        if (zsc.m27079f() && isMiuiSupportGetInstalledAppsPermission() && zsc.m27080g()) {
            return !m19268c(activity);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m19268c(@efb Context context) {
        if (!C5487ew.m10315k()) {
            return true;
        }
        if (C5487ew.m10318n() && isSupportGetInstalledAppsPermission(context)) {
            return qpc.m20482f(context, xnc.f98602a);
        }
        if (zsc.m27079f() && isMiuiSupportGetInstalledAppsPermission() && zsc.m27080g()) {
            return qpc.m20481e(context, f69632a, f69633b);
        }
        return true;
    }

    private static boolean isMiuiSupportGetInstalledAppsPermission() {
        if (!C5487ew.m10315k()) {
            return true;
        }
        try {
            Class.forName(AppOpsManager.class.getName()).getDeclaredField(f69632a);
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return true;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    @c5e(api = 23)
    private static boolean isSupportGetInstalledAppsPermission(Context context) {
        try {
            PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo(xnc.f98602a, 0);
            if (permissionInfo != null) {
                return C5487ew.m10322r() ? permissionInfo.getProtection() == 1 : (permissionInfo.protectionLevel & 15) == 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "oem_installed_apps_runtime_permission_enable") == 1;
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
