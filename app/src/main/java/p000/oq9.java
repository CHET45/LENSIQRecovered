package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class oq9 {

    /* JADX INFO: renamed from: a */
    public static String f68300a = "";

    public static String getCurrentProcessName(@efb Context context) {
        if (!TextUtils.isEmpty(f68300a)) {
            return f68300a;
        }
        String currentProcessNameByApplication = getCurrentProcessNameByApplication();
        f68300a = currentProcessNameByApplication;
        if (!TextUtils.isEmpty(currentProcessNameByApplication)) {
            return f68300a;
        }
        String currentProcessNameByActivityThread = getCurrentProcessNameByActivityThread();
        f68300a = currentProcessNameByActivityThread;
        if (!TextUtils.isEmpty(currentProcessNameByActivityThread)) {
            return f68300a;
        }
        String currentProcessNameByActivityManager = getCurrentProcessNameByActivityManager(context);
        f68300a = currentProcessNameByActivityManager;
        return currentProcessNameByActivityManager;
    }

    private static String getCurrentProcessNameByActivityManager(@efb Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    @efb
    private static String getCurrentProcessNameByActivityThread() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            return objInvoke instanceof String ? (String) objInvoke : "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @efb
    private static String getCurrentProcessNameByApplication() {
        return Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "";
    }
}
