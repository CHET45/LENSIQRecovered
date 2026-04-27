package p000;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.provider.Settings;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 23)
public class ioc extends hoc {
    private static Intent getIgnoreBatteryPermissionIntent(@efb Context context) {
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(qpc.m20489m(context));
        if (!qpc.m20477a(context, intent)) {
            intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        }
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    private static Intent getNotDisturbPermissionIntent(@efb Context context) {
        Intent intent;
        if (C5487ew.m10307c()) {
            intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS");
            intent.setData(qpc.m20489m(context));
            if (zsc.m27077d() || zsc.m27078e()) {
                intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
            }
        } else {
            intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
        }
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    private static Intent getSettingPermissionIntent(@efb Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(qpc.m20489m(context));
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    private static boolean isGrantedIgnoreBatteryPermission(@efb Context context) {
        return ((PowerManager) context.getSystemService(PowerManager.class)).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    private static boolean isGrantedNotDisturbPermission(@efb Context context) {
        return ((NotificationManager) context.getSystemService(NotificationManager.class)).isNotificationPolicyAccessGranted();
    }

    private static boolean isGrantedSettingPermission(@efb Context context) {
        if (C5487ew.m10318n()) {
            return Settings.System.canWrite(context);
        }
        return true;
    }

    @Override // p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public Intent getPermissionIntent(@efb Context context, @efb String str) {
        return qpc.m20485i(str, xnc.f98610g) ? getSettingPermissionIntent(context) : qpc.m20485i(str, xnc.f98612i) ? getNotDisturbPermissionIntent(context) : qpc.m20485i(str, xnc.f98611h) ? getIgnoreBatteryPermissionIntent(context) : super.getPermissionIntent(context, str);
    }

    @Override // p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str) {
        if (xnc.m25334b(str) > C5487ew.m10305a()) {
            if (qpc.m20485i(str, xnc.f98617n)) {
                return false;
            }
            if (qpc.m20485i(str, xnc.f98618o)) {
                return super.isDoNotAskAgainPermission(activity, str);
            }
            if (qpc.m20485i(str, xnc.f98619p)) {
                return (qpc.m20482f(activity, xnc.f98583H) || qpc.m20498v(activity, xnc.f98583H)) ? false : true;
            }
            if (qpc.m20485i(str, xnc.f98620q)) {
                return (qpc.m20482f(activity, xnc.f98597V) || qpc.m20498v(activity, xnc.f98597V)) ? false : true;
            }
            if (qpc.m20484h(new String[]{xnc.f98621r, xnc.f98622s, xnc.f98623t}, str)) {
                return (qpc.m20482f(activity, xnc.f98579D) || qpc.m20498v(activity, xnc.f98579D)) ? false : true;
            }
            if (qpc.m20485i(str, xnc.f98624u)) {
                return (qpc.m20482f(activity, xnc.f98583H) || qpc.m20498v(activity, xnc.f98583H)) ? false : true;
            }
            if (qpc.m20484h(new String[]{xnc.f98625v, xnc.f98626w}, str)) {
                return false;
            }
            if (qpc.m20485i(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                return (qpc.m20482f(activity, xnc.f98583H) || qpc.m20498v(activity, xnc.f98583H)) ? false : true;
            }
            if (qpc.m20485i(str, xnc.f98628y)) {
                return false;
            }
            if (qpc.m20485i(str, xnc.f98629z)) {
                return (qpc.m20482f(activity, xnc.f98579D) || qpc.m20498v(activity, xnc.f98579D)) ? false : true;
            }
            if (qpc.m20485i(str, xnc.f98576A) || qpc.m20485i(str, xnc.f98578C)) {
                return false;
            }
            if (qpc.m20485i(str, xnc.f98577B)) {
                return (qpc.m20482f(activity, xnc.f98590O) || qpc.m20498v(activity, xnc.f98590O)) ? false : true;
            }
        }
        if (qpc.m20484h(new String[]{xnc.f98602a, xnc.f98618o}, str)) {
            return super.isDoNotAskAgainPermission(activity, str);
        }
        if (xnc.m25337e(str)) {
            return false;
        }
        return (qpc.m20482f(activity, str) || qpc.m20498v(activity, str)) ? false : true;
    }

    @Override // p000.hoc, p000.goc, p000.foc, p000.eoc, p000.doc
    public boolean isGrantedPermission(@efb Context context, @efb String str) {
        if (xnc.m25334b(str) > C5487ew.m10305a()) {
            if (qpc.m20485i(str, xnc.f98617n)) {
                return true;
            }
            if (qpc.m20485i(str, xnc.f98618o)) {
                return super.isGrantedPermission(context, str);
            }
            if (qpc.m20485i(str, xnc.f98619p)) {
                return qpc.m20482f(context, xnc.f98583H);
            }
            if (qpc.m20485i(str, xnc.f98620q)) {
                return qpc.m20482f(context, xnc.f98597V);
            }
            if (qpc.m20484h(new String[]{xnc.f98621r, xnc.f98622s, xnc.f98623t}, str)) {
                return qpc.m20482f(context, xnc.f98579D);
            }
            if (qpc.m20485i(str, xnc.f98624u)) {
                return qpc.m20482f(context, xnc.f98583H);
            }
            if (qpc.m20484h(new String[]{xnc.f98625v, xnc.f98626w}, str)) {
                return true;
            }
            if (qpc.m20485i(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                return qpc.m20482f(context, xnc.f98579D) && qpc.m20482f(context, xnc.f98580E);
            }
            if (qpc.m20485i(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                return qpc.m20482f(context, xnc.f98583H);
            }
            if (qpc.m20485i(str, xnc.f98628y)) {
                return true;
            }
            if (qpc.m20485i(str, xnc.f98629z)) {
                return qpc.m20482f(context, xnc.f98579D);
            }
            if (qpc.m20485i(str, xnc.f98576A) || qpc.m20485i(str, xnc.f98578C)) {
                return true;
            }
            if (qpc.m20485i(str, xnc.f98577B)) {
                return qpc.m20482f(context, xnc.f98590O);
            }
        }
        return qpc.m20484h(new String[]{xnc.f98602a, xnc.f98618o}, str) ? super.isGrantedPermission(context, str) : xnc.m25337e(str) ? qpc.m20485i(str, xnc.f98610g) ? isGrantedSettingPermission(context) : qpc.m20485i(str, xnc.f98612i) ? isGrantedNotDisturbPermission(context) : qpc.m20485i(str, xnc.f98611h) ? isGrantedIgnoreBatteryPermission(context) : super.isGrantedPermission(context, str) : qpc.m20482f(context, str);
    }
}
