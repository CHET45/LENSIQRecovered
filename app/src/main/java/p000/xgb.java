package p000;

import android.app.NotificationManager;
import android.os.Parcelable;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class xgb {
    private xgb() {
    }

    @c5e(23)
    @efb
    /* JADX INFO: renamed from: a */
    public static Parcelable[] m25127a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
