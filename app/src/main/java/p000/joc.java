package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 26)
public class joc extends ioc {
    private static Intent getInstallPermissionIntent(@efb Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(qpc.m20489m(context));
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    private static Intent getPictureInPicturePermissionIntent(@efb Context context) {
        Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS");
        intent.setData(qpc.m20489m(context));
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    private static boolean isGrantedInstallPermission(@efb Context context) {
        return context.getPackageManager().canRequestPackageInstalls();
    }

    private static boolean isGrantedPictureInPicturePermission(@efb Context context) {
        return qpc.m20480d(context, "android:picture_in_picture");
    }

    @Override // p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98607d) ? getInstallPermissionIntent(context) : qpc.m20485i(str, xnc.f98608e) ? getPictureInPicturePermissionIntent(context) : super.getPermissionIntent(context, str);
    }

    @Override // p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (qpc.m20485i(str, xnc.f98607d) || qpc.m20485i(str, xnc.f98608e)) {
            return false;
        }
        return qpc.m20484h(new String[]{xnc.f98577B, xnc.f98578C}, str) ? (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true : super.isDoNotAskAgainPermission(activity, str);
    }

    @Override // p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98607d) ? isGrantedInstallPermission(context) : qpc.m20485i(str, xnc.f98608e) ? isGrantedPictureInPicturePermission(context) : qpc.m20484h(new String[]{xnc.f98577B, xnc.f98578C}, str) ? qpc.m20482f(context, str) : super.isGrantedPermission(context, str);
    }
}
