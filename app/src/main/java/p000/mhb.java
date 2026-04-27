package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@igg({"InlinedApi"})
public final class mhb {

    /* JADX INFO: renamed from: a */
    public static final int f61014a = -1000;

    /* JADX INFO: renamed from: b */
    public static final int f61015b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f61016c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f61017d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f61018e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f61019f = 4;

    /* JADX INFO: renamed from: mhb$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9355a {
    }

    private mhb() {
    }

    public static void createNotificationChannel(Context context, String str, @g8g int i, @g8g int i2, int i3) {
        NotificationManager notificationManager = (NotificationManager) v80.checkNotNull((NotificationManager) context.getSystemService("notification"));
        NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i), i3);
        if (i2 != 0) {
            notificationChannel.setDescription(context.getString(i2));
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void setNotification(Context context, int i, @hib Notification notification) {
        NotificationManager notificationManager = (NotificationManager) v80.checkNotNull((NotificationManager) context.getSystemService("notification"));
        if (notification != null) {
            notificationManager.notify(i, notification);
        } else {
            notificationManager.cancel(i);
        }
    }
}
