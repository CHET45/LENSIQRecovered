package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 14)
public class eoc implements doc {
    private static Intent getVpnPermissionIntent(@efb Context context) {
        Intent intentPrepare = VpnService.prepare(context);
        return !qpc.m20477a(context, intentPrepare) ? bpc.m3314b(context) : intentPrepare;
    }

    private static boolean isGrantedVpnPermission(@efb Context context) {
        return VpnService.prepare(context) == null;
    }

    @Override // p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98615l) ? getVpnPermissionIntent(context) : bpc.m3315c(context, Collections.singletonList(str));
    }

    @Override // p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        return false;
    }

    @Override // p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        if (qpc.m20485i(str, xnc.f98615l)) {
            return isGrantedVpnPermission(context);
        }
        return true;
    }
}
