package p000;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;

/* JADX INFO: loaded from: classes5.dex */
public final class xoi {

    /* JADX INFO: renamed from: a */
    public static final String f98842a = "OP_SYSTEM_ALERT_WINDOW";

    /* JADX INFO: renamed from: b */
    public static final int f98843b = 24;

    /* JADX INFO: renamed from: a */
    public static Intent m25366a(@efb Context context) {
        if (!C5487ew.m10318n()) {
            if (zsc.m27076c()) {
                return o1g.m18258a(bpc.m3317e(context), bpc.m3314b(context));
            }
            if (zsc.m27079f()) {
                return o1g.m18258a(zsc.m27080g() ? bpc.m3320h(context) : null, bpc.m3314b(context));
            }
            return zsc.m27075b() ? o1g.m18258a(bpc.m3316d(context), bpc.m3314b(context)) : zsc.m27082i() ? o1g.m18258a(bpc.m3325m(context), bpc.m3314b(context)) : zsc.m27081h() ? o1g.m18258a(bpc.m3322j(context), bpc.m3314b(context)) : bpc.m3314b(context);
        }
        if (C5487ew.m10308d() && zsc.m27079f() && zsc.m27080g()) {
            return o1g.m18258a(bpc.m3319g(context), bpc.m3314b(context));
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(qpc.m20489m(context));
        return qpc.m20477a(context, intent) ? intent : bpc.m3314b(context);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25367b(@efb Context context) {
        if (C5487ew.m10318n()) {
            return Settings.canDrawOverlays(context);
        }
        if (C5487ew.m10315k()) {
            return qpc.m20481e(context, f98842a, 24);
        }
        return true;
    }
}
