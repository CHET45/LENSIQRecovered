package p000;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 34)
public class qoc extends poc {
    @Override // p000.poc, p000.ooc, p000.noc, p000.loc, p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        return qpc.m20485i(str, xnc.f98617n) ? (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true : super.isDoNotAskAgainPermission(activity, str);
    }

    @Override // p000.poc, p000.ooc, p000.noc, p000.loc, p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98617n) ? qpc.m20482f(context, xnc.f98617n) : super.isGrantedPermission(context, str);
    }
}
