package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes8.dex */
public final class spc {

    /* JADX INFO: renamed from: a */
    public static final scf<String, Integer> f82533a;

    static {
        scf<String, Integer> scfVar = new scf<>(13);
        f82533a = scfVar;
        scfVar.put(xnc.f98594S, 14);
        scfVar.put(xnc.f98592Q, 16);
        scfVar.put(xnc.f98579D, 16);
        scfVar.put(xnc.f98593R, 16);
        scfVar.put(xnc.f98597V, 20);
        scfVar.put(xnc.f98609f, 23);
        scfVar.put(xnc.f98610g, 23);
        scfVar.put(xnc.f98577B, 26);
        scfVar.put(xnc.f98578C, 26);
        scfVar.put(xnc.f98576A, 28);
        scfVar.put(xnc.f98628y, 29);
        scfVar.put(xnc.f98629z, 29);
        scfVar.put("android.permission.ACCESS_BACKGROUND_LOCATION", 29);
    }

    private spc() {
    }

    private static boolean hasSelfPermission(Context context, String str) {
        try {
            return aoc.checkSelfPermission(context, str) == 0;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean hasSelfPermissions(Context context, String... strArr) {
        for (String str : strArr) {
            if (permissionExists(str) && !hasSelfPermission(context, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean permissionExists(String str) {
        Integer num = f82533a.get(str);
        return num == null || Build.VERSION.SDK_INT >= num.intValue();
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyPermissions(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean shouldShowRequestPermissionRationale(Fragment fragment, String... strArr) {
        for (String str : strArr) {
            if (fragment.shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }
}
