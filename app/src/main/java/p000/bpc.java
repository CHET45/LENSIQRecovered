package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class bpc {

    /* JADX INFO: renamed from: a */
    public static final String f14402a = "com.huawei.systemmanager";

    /* JADX INFO: renamed from: b */
    public static final String f14403b = "com.miui.securitycenter";

    /* JADX INFO: renamed from: c */
    public static final String f14404c = "com.oppo.safe";

    /* JADX INFO: renamed from: d */
    public static final String f14405d = "com.color.safecenter";

    /* JADX INFO: renamed from: e */
    public static final String f14406e = "com.oplus.safecenter";

    /* JADX INFO: renamed from: f */
    public static final String f14407f = "com.iqoo.secure";

    @efb
    /* JADX INFO: renamed from: a */
    public static Intent m3313a() {
        return new Intent("android.settings.SETTINGS");
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static Intent m3314b(@efb Context context) {
        return m3315c(context, null);
    }

    @efb
    /* JADX INFO: renamed from: c */
    public static Intent m3315c(@efb Context context, @hib List<String> list) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(qpc.m20489m(context));
        if (list != null && !list.isEmpty() && zsc.m27075b()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("permissionList", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            intent.putExtras(bundle);
            intent.putExtra("isGetPermission", true);
        }
        if (qpc.m20477a(context, intent)) {
            return intent;
        }
        Intent intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
        if (qpc.m20477a(context, intent2)) {
            return intent2;
        }
        Intent intent3 = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
        return qpc.m20477a(context, intent3) ? intent3 : m3313a();
    }

    @hib
    /* JADX INFO: renamed from: d */
    public static Intent m3316d(Context context) {
        Intent intent = new Intent("com.oppo.safe.permission.PermissionTopActivity");
        Intent intentM3323k = m3323k(context);
        if (!qpc.m20477a(context, intent)) {
            intent = null;
        }
        return qpc.m20477a(context, intentM3323k) ? o1g.m18258a(intent, intentM3323k) : intent;
    }

    @hib
    /* JADX INFO: renamed from: e */
    public static Intent m3317e(Context context) {
        Intent intent = new Intent();
        intent.setClassName(f14402a, "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity");
        Intent intent2 = new Intent();
        intent2.setClassName(f14402a, "com.huawei.notificationmanager.ui.NotificationManagmentActivity");
        Intent intentM3318f = m3318f(context);
        String strM27074a = zsc.m27074a();
        if (strM27074a == null) {
            strM27074a = "";
        }
        if (strM27074a.startsWith("3.0")) {
            if (!qpc.m20477a(context, intent2)) {
                intent2 = null;
            }
            if (qpc.m20477a(context, intent)) {
                intent2 = o1g.m18258a(intent2, intent);
            }
        } else {
            if (!qpc.m20477a(context, intent)) {
                intent = null;
            }
            intent2 = qpc.m20477a(context, intent2) ? o1g.m18258a(intent, intent2) : intent;
        }
        return qpc.m20477a(context, intentM3318f) ? o1g.m18258a(intent2, intentM3318f) : intent2;
    }

    @hib
    /* JADX INFO: renamed from: f */
    public static Intent m3318f(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(f14402a);
        if (qpc.m20477a(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }

    @hib
    /* JADX INFO: renamed from: g */
    public static Intent m3319g(Context context) {
        Intent intentPutExtra = new Intent().setAction("miui.intent.action.APP_PERM_EDITOR").putExtra("extra_pkgname", context.getPackageName());
        Intent intentM3327o = m3327o(context);
        if (!qpc.m20477a(context, intentPutExtra)) {
            intentPutExtra = null;
        }
        return qpc.m20477a(context, intentM3327o) ? o1g.m18258a(intentPutExtra, intentM3327o) : intentPutExtra;
    }

    @hib
    /* JADX INFO: renamed from: h */
    public static Intent m3320h(Context context) {
        return m3319g(context);
    }

    @hib
    /* JADX INFO: renamed from: i */
    public static Intent m3321i(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.Settings$AppOpsDetailsActivity");
        Bundle bundle = new Bundle();
        bundle.putString(C12269rt.f79418l, context.getPackageName());
        intent.putExtra(":settings:show_fragment_args", bundle);
        intent.setData(qpc.m20489m(context));
        if (qpc.m20477a(context, intent)) {
            return intent;
        }
        return null;
    }

    @hib
    /* JADX INFO: renamed from: j */
    public static Intent m3322j(Context context) {
        return m3321i(context);
    }

    @hib
    /* JADX INFO: renamed from: k */
    public static Intent m3323k(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(f14404c);
        if (qpc.m20477a(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage(f14405d);
        if (qpc.m20477a(context, launchIntentForPackage2)) {
            return launchIntentForPackage2;
        }
        Intent launchIntentForPackage3 = context.getPackageManager().getLaunchIntentForPackage(f14406e);
        if (qpc.m20477a(context, launchIntentForPackage3)) {
            return launchIntentForPackage3;
        }
        return null;
    }

    @hib
    /* JADX INFO: renamed from: l */
    public static Intent m3324l(Context context) {
        Intent intent = new Intent("permission.intent.action.softPermissionDetail");
        intent.putExtra("packagename", context.getPackageName());
        if (qpc.m20477a(context, intent)) {
            return intent;
        }
        return null;
    }

    @hib
    /* JADX INFO: renamed from: m */
    public static Intent m3325m(Context context) {
        Intent intentM3326n = m3326n(context);
        if (qpc.m20477a(context, intentM3326n)) {
            return intentM3326n;
        }
        return null;
    }

    @hib
    /* JADX INFO: renamed from: n */
    public static Intent m3326n(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(f14407f);
        if (qpc.m20477a(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }

    @hib
    /* JADX INFO: renamed from: o */
    public static Intent m3327o(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(f14403b);
        if (qpc.m20477a(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }
}
