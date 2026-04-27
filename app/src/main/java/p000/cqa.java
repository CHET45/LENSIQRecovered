package p000;

import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class cqa {

    /* JADX INFO: renamed from: a */
    public static final String f27077a = "MeizuUtils";

    public static void applyPermission(Fragment fragment) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.putExtra("packageName", fragment.getActivity().getPackageName());
            fragment.startActivityForResult(intent, tpc.f85549b);
        } catch (Exception e) {
            try {
                Log.e(f27077a, "获取悬浮窗权限, 打开AppSecActivity失败, " + Log.getStackTraceString(e));
                tpc.commonROMPermissionApplyInternal(fragment);
            } catch (Exception e2) {
                Log.e(f27077a, "获取悬浮窗权限失败, 通用获取方法失败, " + Log.getStackTraceString(e2));
            }
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
            Log.e(f27077a, Log.getStackTraceString(e));
            return false;
        }
    }
}
