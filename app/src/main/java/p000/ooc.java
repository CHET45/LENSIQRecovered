package p000;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 31)
public class ooc extends noc {
    private static Intent getAlarmPermissionIntent(@efb Context context) {
        Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
        intent.setData(qpc.m20489m(context));
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    private static boolean isGrantedAlarmPermission(@efb Context context) {
        return ((AlarmManager) context.getSystemService(AlarmManager.class)).canScheduleExactAlarms();
    }

    @Override // p000.noc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98604b) ? getAlarmPermissionIntent(context) : super.getPermissionIntent(context, str);
    }

    @Override // p000.noc, p000.loc, p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (qpc.m20485i(str, xnc.f98604b)) {
            return false;
        }
        return qpc.m20484h(new String[]{xnc.f98624u, xnc.f98625v, xnc.f98626w}, str) ? (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true : (activity.getApplicationInfo().targetSdkVersion < 31 || !qpc.m20485i(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) ? super.isDoNotAskAgainPermission(activity, str) : (qpc.m20482f(activity, xnc.f98583H) || qpc.m20482f(activity, xnc.f98584I)) ? (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true : (qpc.m20498v(activity, xnc.f98583H) || qpc.m20498v(activity, xnc.f98584I)) ? false : true;
    }

    @Override // p000.noc, p000.loc, p000.koc, p000.joc, p000.ioc, p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98604b) ? isGrantedAlarmPermission(context) : qpc.m20484h(new String[]{xnc.f98624u, xnc.f98625v, xnc.f98626w}, str) ? qpc.m20482f(context, str) : super.isGrantedPermission(context, str);
    }
}
