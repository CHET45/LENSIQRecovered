package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 19)
public class goc extends foc {
    @Override // p000.foc, p000.eoc, p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98609f) ? xoi.m25366a(context) : qpc.m20485i(str, xnc.f98602a) ? p47.m19266a(context) : qpc.m20485i(str, xnc.f98616m) ? ghb.m11685a(context) : (C5487ew.m10310f() || !qpc.m20485i(str, xnc.f98618o)) ? super.getPermissionIntent(context, str) : ghb.m11685a(context);
    }

    @Override // p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (qpc.m20485i(str, xnc.f98609f)) {
            return false;
        }
        if (qpc.m20485i(str, xnc.f98602a)) {
            return p47.m19267b(activity);
        }
        if (qpc.m20485i(str, xnc.f98616m)) {
            return false;
        }
        if (C5487ew.m10310f() || !qpc.m20485i(str, xnc.f98618o)) {
            return super.isDoNotAskAgainPermission(activity, str);
        }
        return false;
    }

    @Override // p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98609f) ? xoi.m25367b(context) : qpc.m20485i(str, xnc.f98602a) ? p47.m19268c(context) : qpc.m20485i(str, xnc.f98616m) ? ghb.m11686b(context) : (C5487ew.m10310f() || !qpc.m20485i(str, xnc.f98618o)) ? super.isGrantedPermission(context, str) : ghb.m11686b(context);
    }
}
