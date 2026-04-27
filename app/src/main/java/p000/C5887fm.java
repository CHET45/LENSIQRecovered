package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1513a;
import p000.p7e;

/* JADX INFO: renamed from: fm */
/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class C5887fm {

    /* JADX INFO: renamed from: a */
    public static final String f37101a = cj9.tagWithPrefix("Alarms");

    private C5887fm() {
    }

    public static void cancelAlarm(@efb Context context, @efb zpi workManager, @efb String workSpecId) {
        ijg ijgVarSystemIdInfoDao = workManager.getWorkDatabase().systemIdInfoDao();
        hjg systemIdInfo = ijgVarSystemIdInfoDao.getSystemIdInfo(workSpecId);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, workSpecId, systemIdInfo.f43827b);
            cj9.get().debug(f37101a, String.format("Removing SystemIdInfo for workSpecId (%s)", workSpecId), new Throwable[0]);
            ijgVarSystemIdInfoDao.removeSystemIdInfo(workSpecId);
        }
    }

    private static void cancelExactAlarm(@efb Context context, @efb String workSpecId, int alarmId) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, alarmId, C1513a.m2466b(context, workSpecId), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        cj9.get().debug(f37101a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", workSpecId, Integer.valueOf(alarmId)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void setAlarm(@efb Context context, @efb zpi workManager, @efb String workSpecId, long triggerAtMillis) {
        WorkDatabase workDatabase = workManager.getWorkDatabase();
        ijg ijgVarSystemIdInfoDao = workDatabase.systemIdInfoDao();
        hjg systemIdInfo = ijgVarSystemIdInfoDao.getSystemIdInfo(workSpecId);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, workSpecId, systemIdInfo.f43827b);
            setExactAlarm(context, workSpecId, systemIdInfo.f43827b, triggerAtMillis);
        } else {
            int iNextAlarmManagerId = new ir7(workDatabase).nextAlarmManagerId();
            ijgVarSystemIdInfoDao.insertSystemIdInfo(new hjg(workSpecId, iNextAlarmManagerId));
            setExactAlarm(context, workSpecId, iNextAlarmManagerId, triggerAtMillis);
        }
    }

    private static void setExactAlarm(@efb Context context, @efb String workSpecId, int alarmId, long triggerAtMillis) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, alarmId, C1513a.m2466b(context, workSpecId), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, triggerAtMillis, service);
        }
    }
}
