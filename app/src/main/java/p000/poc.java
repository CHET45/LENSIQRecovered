package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 33)
public class poc extends ooc {
    @Override // p000.ooc, p000.noc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98618o) ? ghb.m11685a(context) : super.getPermissionIntent(context, str);
    }

    @Override // p000.ooc, p000.noc, p000.loc, p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (qpc.m20485i(str, xnc.f98620q)) {
            return !qpc.m20482f(activity, xnc.f98597V) ? !qpc.m20498v(activity, xnc.f98597V) : (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true;
        }
        if (qpc.m20484h(new String[]{xnc.f98618o, xnc.f98619p, xnc.f98621r, xnc.f98622s, xnc.f98623t}, str)) {
            return (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true;
        }
        if (C5487ew.m10306b(activity) >= 33) {
            if (qpc.m20485i(str, xnc.f98580E)) {
                return false;
            }
            if (qpc.m20485i(str, xnc.f98579D)) {
                return (qpc.m20482f(activity, xnc.f98621r) || qpc.m20498v(activity, xnc.f98621r) || qpc.m20482f(activity, xnc.f98622s) || qpc.m20498v(activity, xnc.f98622s) || qpc.m20482f(activity, xnc.f98623t) || qpc.m20498v(activity, xnc.f98623t)) ? false : true;
            }
        }
        return super.isDoNotAskAgainPermission(activity, str);
    }

    @Override // p000.ooc, p000.noc, p000.loc, p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        if (qpc.m20485i(str, xnc.f98620q)) {
            return qpc.m20482f(context, xnc.f98597V) && qpc.m20482f(context, xnc.f98620q);
        }
        if (qpc.m20484h(new String[]{xnc.f98618o, xnc.f98619p, xnc.f98621r, xnc.f98622s, xnc.f98623t}, str)) {
            return qpc.m20482f(context, str);
        }
        if (C5487ew.m10306b(context) >= 33) {
            if (qpc.m20485i(str, xnc.f98580E)) {
                return true;
            }
            if (qpc.m20485i(str, xnc.f98579D)) {
                return qpc.m20482f(context, xnc.f98621r) && qpc.m20482f(context, xnc.f98622s) && qpc.m20482f(context, xnc.f98623t);
            }
        }
        return super.isGrantedPermission(context, str);
    }
}
