package p000;

import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;
import android.widget.Toast;

/* JADX INFO: loaded from: classes4.dex */
public class yo7 {

    /* JADX INFO: renamed from: a */
    public static final String f102409a = "HuaweiUtils";

    public static void applyPermission(Fragment fragment) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(bpc.f14402a, "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
            if (sae.getEmuiVersion() == 3.1d) {
                fragment.startActivityForResult(intent, tpc.f85549b);
            } else {
                intent.setComponent(new ComponentName(bpc.f14402a, "com.huawei.notificationmanager.ui.NotificationManagmentActivity"));
                fragment.startActivityForResult(intent, tpc.f85549b);
            }
        } catch (ActivityNotFoundException e) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName("com.Android.settings", "com.android.settings.permission.TabItem"));
            fragment.startActivityForResult(intent2, tpc.f85549b);
            e.printStackTrace();
            Log.e(f102409a, Log.getStackTraceString(e));
        } catch (SecurityException e2) {
            Intent intent3 = new Intent();
            intent3.setFlags(268435456);
            intent3.setComponent(new ComponentName(bpc.f14402a, "com.huawei.permissionmanager.ui.MainActivity"));
            fragment.startActivityForResult(intent3, tpc.f85549b);
            Log.e(f102409a, Log.getStackTraceString(e2));
        } catch (Exception e3) {
            Toast.makeText(fragment.getActivity(), "进入设置页面失败，请手动设置", 1).show();
            Log.e(f102409a, Log.getStackTraceString(e3));
        }
    }

    public static boolean checkFloatWindowPermission(Context context) {
        return checkOp(context, 24);
    }

    @omg(19)
    private static boolean checkOp(Context context, int op) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(op), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            Log.e(f102409a, Log.getStackTraceString(e));
            return false;
        }
    }
}
