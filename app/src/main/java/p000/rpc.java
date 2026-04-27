package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C9278mc;

/* JADX INFO: loaded from: classes6.dex */
public class rpc {

    /* JADX INFO: renamed from: rpc$a */
    public interface InterfaceC12198a {
        void onAllGranted();

        void onDenied(List<String> deniedPermissions);

        void onPermanentlyDenied(List<String> permanentlyDeniedPermissions);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21469b(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 65536).isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21470c() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static boolean containsManageExternalStorage(List<String> permissions2) {
        Iterator<String> it = permissions2.iterator();
        while (it.hasNext()) {
            if (isManageExternalStorage(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21471d() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m21472e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m21473f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handlePermissionResult(AppCompatActivity activity, String[] originalPermissions, Map<String, Boolean> result, InterfaceC12198a callback) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : originalPermissions) {
            if (!isManageExternalStorage(str)) {
                Boolean bool = result.get(str);
                if (bool != null && bool.booleanValue()) {
                    arrayList.add(str);
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                    arrayList2.add(str);
                } else {
                    arrayList3.add(str);
                }
            }
        }
        if (containsManageExternalStorage(Arrays.asList(originalPermissions)) && !hasManageExternalStoragePermission(activity)) {
            arrayList3.add("android.permission.MANAGE_EXTERNAL_STORAGE");
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            callback.onAllGranted();
            return;
        }
        if (!arrayList3.isEmpty()) {
            callback.onPermanentlyDenied(arrayList3);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        callback.onDenied(arrayList2);
    }

    public static boolean hasManageExternalStoragePermission(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Environment.isExternalStorageManager();
        }
        return true;
    }

    private static boolean isManageExternalStorage(String permission) {
        return "android.permission.MANAGE_EXTERNAL_STORAGE".equals(permission);
    }

    public static void openAppSettings(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    public static void openManageExternalStorageSettings(Context context) {
        try {
            Intent intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            context.startActivity(intent);
        } catch (Exception unused) {
            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.parse("package:" + context.getPackageName()));
            context.startActivity(intent2);
        }
    }

    public static void requestPermissions(final AppCompatActivity activity, final String[] permissions2, final InterfaceC12198a callback) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : permissions2) {
            if (isManageExternalStorage(str)) {
                if (!hasManageExternalStoragePermission(activity)) {
                    arrayList.add(str);
                }
            } else if (lx2.checkSelfPermission(activity, str) != 0) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                    arrayList.add(str);
                } else {
                    arrayList2.add(str);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            callback.onAllGranted();
            return;
        }
        if (!arrayList2.isEmpty()) {
            callback.onPermanentlyDenied(arrayList2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (containsManageExternalStorage(arrayList)) {
            openManageExternalStorageSettings(activity);
        } else {
            activity.registerForActivityResult(new C9278mc.k(), new InterfaceC5717fc() { // from class: ppc
                @Override // p000.InterfaceC5717fc
                public final void onActivityResult(Object obj) {
                    rpc.handlePermissionResult(activity, permissions2, (Map) obj, callback);
                }
            }).launch((String[]) arrayList.toArray(new String[0]));
        }
    }

    public static void startApplicationDetails(Context context) {
        context.startActivity(hpc.m12526a(context));
    }

    public static void startPermissionActivity(Context context, List<String> failPermissions) {
        if (!failPermissions.contains("android.permission.MANAGE_EXTERNAL_STORAGE") && !failPermissions.contains(xnc.f98607d) && !failPermissions.contains(xnc.f98609f) && !failPermissions.contains(xnc.f98612i) && !failPermissions.contains(xnc.f98610g)) {
            Intent intentM17537a = mr9.m17537a(context);
            if (intentM17537a == null) {
                intentM17537a = hpc.m12526a(context);
            }
            try {
                context.startActivity(intentM17537a);
                return;
            } catch (Exception unused) {
                if ("android.settings.APPLICATION_DETAILS_SETTINGS".equals(intentM17537a.getAction())) {
                    return;
                }
                context.startActivity(hpc.m12526a(context));
                return;
            }
        }
        if (failPermissions.size() != 1) {
            startApplicationDetails(context);
            return;
        }
        String str = failPermissions.get(0);
        if ("android.permission.MANAGE_EXTERNAL_STORAGE".equals(str)) {
            context.startActivity(hpc.m12530e(context));
            return;
        }
        if (xnc.f98607d.equals(str)) {
            context.startActivity(hpc.m12527b(context));
            return;
        }
        if (xnc.f98609f.equals(str)) {
            context.startActivity(hpc.m12531f(context));
        } else if (xnc.f98612i.equals(str)) {
            context.startActivity(hpc.m12528c(context));
        } else if (xnc.f98610g.equals(str)) {
            context.startActivity(hpc.m12529d(context));
        }
    }
}
