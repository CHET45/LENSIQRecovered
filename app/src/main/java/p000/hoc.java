package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 21)
public class hoc extends goc {
    private static Intent getPackagePermissionIntent(@efb Context context) {
        Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        if (C5487ew.m10307c()) {
            intent.setData(qpc.m20489m(context));
        }
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    private static boolean isGrantedPackagePermission(@efb Context context) {
        return qpc.m20480d(context, "android:get_usage_stats");
    }

    @Override // p000.goc, p000.foc, p000.eoc, p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98613j) ? getPackagePermissionIntent(context) : super.getPermissionIntent(context, str);
    }

    @Override // p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (qpc.m20485i(str, xnc.f98613j)) {
            return false;
        }
        return super.isDoNotAskAgainPermission(activity, str);
    }

    @Override // p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98613j) ? isGrantedPackagePermission(context) : super.isGrantedPermission(context, str);
    }
}
