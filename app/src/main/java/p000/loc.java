package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 29)
public class loc extends koc {
    private boolean hasReadStoragePermission(@efb Context context) {
        return (!C5487ew.m10310f() || C5487ew.m10306b(context) < 33) ? (!C5487ew.m10308d() || C5487ew.m10306b(context) < 30) ? qpc.m20482f(context, xnc.f98579D) : qpc.m20482f(context, xnc.f98579D) || isGrantedPermission(context, "android.permission.MANAGE_EXTERNAL_STORAGE") : qpc.m20482f(context, xnc.f98621r) || isGrantedPermission(context, "android.permission.MANAGE_EXTERNAL_STORAGE");
    }

    private static boolean isUseDeprecationExternalStorage() {
        return Environment.isExternalStorageLegacy();
    }

    @Override // p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (qpc.m20485i(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return !qpc.m20482f(activity, xnc.f98583H) ? !qpc.m20498v(activity, xnc.f98583H) : (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true;
        }
        if (qpc.m20485i(str, xnc.f98629z)) {
            return (!hasReadStoragePermission(activity) || qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true;
        }
        if (qpc.m20485i(str, xnc.f98628y)) {
            return (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true;
        }
        if (C5487ew.m10308d() || !qpc.m20485i(str, "android.permission.MANAGE_EXTERNAL_STORAGE") || isUseDeprecationExternalStorage()) {
            return super.isDoNotAskAgainPermission(activity, str);
        }
        return true;
    }

    @Override // p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        if (qpc.m20485i(str, xnc.f98629z)) {
            return hasReadStoragePermission(context) && qpc.m20482f(context, xnc.f98629z);
        }
        if (qpc.m20484h(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", xnc.f98628y}, str)) {
            return qpc.m20482f(context, str);
        }
        if (C5487ew.m10308d() || !qpc.m20485i(str, "android.permission.MANAGE_EXTERNAL_STORAGE") || isUseDeprecationExternalStorage()) {
            return super.isGrantedPermission(context, str);
        }
        return false;
    }
}
