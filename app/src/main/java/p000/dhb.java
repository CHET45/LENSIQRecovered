package p000;

import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class dhb {

    /* JADX INFO: renamed from: a */
    public static final String f29678a = "enabled_notification_listeners";

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent m9166a(@p000.efb android.content.Context r6) {
        /*
            boolean r0 = p000.C5487ew.m10308d()
            r1 = 0
            if (r0 == 0) goto L52
            qt r0 = p000.qpc.m20488l(r6)
            if (r0 == 0) goto L2d
            java.util.List<qt$d> r0 = r0.f75563f
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r0.next()
            qt$d r3 = (p000.C11673qt.d) r3
            java.lang.String r4 = r3.f75573b
            java.lang.String r5 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L2b
            goto L14
        L2b:
            if (r2 == 0) goto L2f
        L2d:
            r2 = r1
            goto L31
        L2f:
            r2 = r3
            goto L14
        L31:
            if (r2 == 0) goto L52
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS"
            r0.<init>(r3)
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r2 = r2.f75572a
            r3.<init>(r6, r2)
            java.lang.String r2 = r3.flattenToString()
            java.lang.String r3 = "android.provider.extra.NOTIFICATION_LISTENER_COMPONENT_NAME"
            r0.putExtra(r3, r2)
            boolean r2 = p000.qpc.m20477a(r6, r0)
            if (r2 != 0) goto L51
            goto L52
        L51:
            r1 = r0
        L52:
            if (r1 != 0) goto L69
            boolean r0 = p000.C5487ew.m10317m()
            java.lang.String r1 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            if (r0 == 0) goto L63
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
        L61:
            r1 = r0
            goto L69
        L63:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            goto L61
        L69:
            boolean r0 = p000.qpc.m20477a(r6, r1)
            if (r0 != 0) goto L73
            android.content.Intent r1 = p000.bpc.m3314b(r6)
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dhb.m9166a(android.content.Context):android.content.Intent");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9167b(@efb Context context) {
        if (!C5487ew.m10314j()) {
            return true;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str : string.split(g1i.f38277c)) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString != null && TextUtils.equals(componentNameUnflattenFromString.getPackageName(), context.getPackageName())) {
                try {
                    Class.forName(componentNameUnflattenFromString.getClassName());
                    return true;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
