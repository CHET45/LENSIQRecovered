package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.services.AlarmReceiver;

/* JADX INFO: renamed from: em */
/* JADX INFO: loaded from: classes4.dex */
public class C5372em {

    /* JADX INFO: renamed from: a */
    public static final String f33390a = "AlarmUtils";

    public static void cancelAlarm(Context context, long timestamp, int repeatType, String remarks, boolean isSyncCalendar, long calendarId) {
        Intent intent = new Intent(context, (Class<?>) AlarmReceiver.class);
        intent.putExtra("timestamp", timestamp);
        intent.putExtra(AlarmReceiver.f18298b, repeatType);
        intent.putExtra(AlarmReceiver.f18299c, remarks);
        intent.putExtra(AlarmReceiver.f18300d, isSyncCalendar);
        intent.putExtra(AlarmReceiver.f18301e, calendarId);
        intent.setAction("intent_alarm");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, (int) (timestamp % 2147483647L), intent, 603979776);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (broadcast != null && alarmManager != null) {
            C2473f.m4168e(f33390a, "取消闹钟：" + timestamp);
            alarmManager.cancel(broadcast);
            broadcast.cancel();
        }
        nn1.deleteCalendarEventById(context, calendarId);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0190  */
    @p000.igg({"ScheduleExactAlarm", "ResourceType"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setAlarm(android.content.Context r22, int r23, long r24, long r26, int r28, java.lang.String r29, boolean r30, long r31, boolean r33) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5372em.setAlarm(android.content.Context, int, long, long, int, java.lang.String, boolean, long, boolean):void");
    }

    @igg({"ScheduleExactAlarm"})
    private static void setExactAlarmCompat(AlarmManager alarmManager, long newTimestamp, PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(0, newTimestamp, pendingIntent);
    }
}
