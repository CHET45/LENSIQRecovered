package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 30)
public class noc extends loc {
    private static Intent getManageStoragePermissionIntent(@efb Context context) {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(qpc.m20489m(context));
        if (!qpc.m20477a(context, intent)) {
            intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
        }
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    private static boolean isGrantedManageStoragePermission() {
        return Environment.isExternalStorageManager();
    }

    @Override // p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, "android.permission.MANAGE_EXTERNAL_STORAGE") ? getManageStoragePermissionIntent(context) : super.getPermissionIntent(context, str);
    }

    @Override // p000.loc, p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (qpc.m20485i(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            return false;
        }
        return super.isDoNotAskAgainPermission(activity, str);
    }

    @Override // p000.loc, p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        return qpc.m20485i(str, "android.permission.MANAGE_EXTERNAL_STORAGE") ? isGrantedManageStoragePermission() : super.isGrantedPermission(context, str);
    }
}
