package p000;

import android.content.Context;
import android.os.Build;
import android.os.Environment;

/* JADX INFO: loaded from: classes6.dex */
public class l5g {
    public static boolean hasManageExternalStoragePermission(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Environment.isExternalStorageManager();
        }
        return true;
    }

    public static boolean hasPermissions(Context context, String[] permissions2) {
        if (context == null || permissions2 == null) {
            return false;
        }
        for (String str : permissions2) {
            if (lx2.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
