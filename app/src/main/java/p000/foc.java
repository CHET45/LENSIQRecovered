package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 18)
public class foc extends eoc {
    @Override // p000.eoc, p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98614k) ? dhb.m9166a(context) : super.getPermissionIntent(context, str);
    }

    @Override // p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (qpc.m20485i(str, xnc.f98614k)) {
            return false;
        }
        return super.isDoNotAskAgainPermission(activity, str);
    }

    @Override // p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98614k) ? dhb.m9167b(context) : super.isGrantedPermission(context, str);
    }
}
