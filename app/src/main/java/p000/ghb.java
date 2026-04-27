package p000;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class ghb {

    /* JADX INFO: renamed from: a */
    public static final String f39832a = "OP_POST_NOTIFICATION";

    /* JADX INFO: renamed from: b */
    public static final int f39833b = 11;

    /* JADX INFO: renamed from: a */
    public static Intent m11685a(@efb Context context) {
        Intent intent;
        if (C5487ew.m10321q()) {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else if (C5487ew.m10316l()) {
            intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        } else {
            intent = null;
        }
        return !qpc.m20477a(context, intent) ? bpc.m3314b(context) : intent;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11686b(@efb Context context) {
        if (C5487ew.m10319o()) {
            return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        if (C5487ew.m10315k()) {
            return qpc.m20481e(context, f39832a, 11);
        }
        return true;
    }
}
