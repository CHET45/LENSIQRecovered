package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public final class mr9 {

    /* JADX INFO: renamed from: a */
    public static final String f61836a = Build.MANUFACTURER.toLowerCase();

    /* JADX INFO: renamed from: a */
    public static Intent m17537a(Context context) {
        String str = f61836a;
        if (str.contains("huawei")) {
            return huawei(context);
        }
        if (str.contains("xiaomi")) {
            return xiaomi(context);
        }
        if (str.contains("oppo")) {
            return oppo(context);
        }
        if (str.contains("vivo")) {
            return vivo(context);
        }
        if (str.contains(as9.f11749c)) {
            return meizu(context);
        }
        return null;
    }

    private static Intent huawei(Context context) {
        Intent intent = new Intent();
        intent.setClassName(bpc.f14402a, "com.huawei.permissionmanager.ui.SingleAppActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName(bpc.f14402a, "com.huawei.permissionmanager.ui.MainActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        return null;
    }

    private static Intent meizu(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.putExtra("packageName", context.getPackageName());
        intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        return null;
    }

    private static Intent oppo(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setClassName(bpc.f14405d, "com.color.safecenter.permission.PermissionManagerActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.coloros.securitypermission", "com.coloros.securitypermission.permission.PermissionGroupsActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.coloros.securitypermission", "com.coloros.securitypermission.permission.PermissionManagerActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName(bpc.f14404c, "com.oppo.safe.permission.PermissionAppListActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        return null;
    }

    private static Intent vivo(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packagename", context.getPackageName());
        intent.setClassName(bpc.f14407f, "com.iqoo.secure.safeguard.SoftPermissionDetailActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName(bpc.f14407f, "com.iqoo.secure.safeguard.SoftPermissionDetailActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        return null;
    }

    private static Intent xiaomi(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.putExtra("extra_pkgname", context.getPackageName());
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setPackage(bpc.f14403b);
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName(bpc.f14403b, "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        intent.setClassName(bpc.f14403b, "com.miui.permcenter.permissions.PermissionsEditorActivity");
        if (rpc.m21469b(context, intent)) {
            return intent;
        }
        return null;
    }
}
