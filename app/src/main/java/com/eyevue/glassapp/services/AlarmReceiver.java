package com.eyevue.glassapp.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessage;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDatabase;
import java.util.List;
import p000.C0318am;
import p000.C5372em;
import p000.nn1;
import p000.x4f;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class AlarmReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f18297a = "timestamp";

    /* JADX INFO: renamed from: b */
    public static final String f18298b = "repeat_type";

    /* JADX INFO: renamed from: c */
    public static final String f18299c = "remarks";

    /* JADX INFO: renamed from: d */
    public static final String f18300d = "is_sync_calendar";

    /* JADX INFO: renamed from: e */
    public static final String f18301e = "calendarId";

    /* JADX INFO: renamed from: f */
    public static final String f18302f = "alarm_Id";

    private static long getNewTimestamp(long timestamp, int repeatType) {
        long j;
        if (repeatType == 1) {
            j = 3600000;
        } else {
            if (repeatType != 2) {
                return repeatType == 3 ? nn1.addWithCalendar(timestamp, "week") : repeatType == 4 ? nn1.addWithCalendar(timestamp, "month") : timestamp;
            }
            j = 86400000;
        }
        return timestamp + j;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        if (intent.getAction().equals("intent_alarm")) {
            Bundle extras = intent.getExtras();
            long j = extras.getLong("timestamp");
            extras.getInt(f18298b, -1);
            String str7 = f18299c;
            String string = extras.getString(f18299c, "");
            extras.getLong(f18301e);
            int i2 = extras.getInt(f18302f, -1);
            extras.getBoolean(f18300d, false);
            StringBuilder sb = new StringBuilder();
            sb.append("启动服务处理长时间运行的操作AlarmReceiver onReceive::::::");
            sb.append(j);
            String str8 = ":::";
            sb.append(":::");
            sb.append(i2);
            String str9 = "lttttt";
            C2473f.m4168e("lttttt", sb.toString());
            List<AlarmClockMessage> listFindByResultList = AlarmClockMessageDatabase.getDatabase(context).messageDao().findByResultList(j);
            if (listFindByResultList != null) {
                for (AlarmClockMessage alarmClockMessage : listFindByResultList) {
                    if (alarmClockMessage.getAlarmRepeat() == 0) {
                        AlarmClockMessageDatabase.getDatabase(context).messageDao().updateOutOfTimeByAlarmTime(alarmClockMessage.getId(), j);
                        str6 = str9;
                        str3 = str8;
                        str5 = string;
                        str4 = str7;
                        i = i2;
                    } else {
                        str3 = str8;
                        str4 = str7;
                        i = i2;
                        str5 = string;
                        C5372em.setAlarm(context, alarmClockMessage.getId(), j, getNewTimestamp(j, alarmClockMessage.getAlarmRepeat()), alarmClockMessage.getAlarmRepeat(), alarmClockMessage.getAlarmDescription(), alarmClockMessage.isSyncCalendar(), alarmClockMessage.getCalendarId(), true);
                        str6 = str9;
                        C2473f.m4168e(str6, "更新数据库 实现重复提醒逻辑 AlarmReceiver onReceive::::::" + j + str3 + i);
                    }
                    str9 = str6;
                    str8 = str3;
                    i2 = i;
                    string = str5;
                    str7 = str4;
                }
                str = string;
                str2 = str7;
            } else {
                str = string;
                str2 = f18299c;
                C2473f.m4168e("lttttt", "不存在这条数据 AlarmReceiver onReceive::::::" + j + ":::" + i2);
            }
            zgb.defaultCenter().publish(new C0318am());
            x4f.stopService((Class<?>) AlarmService.class);
            Intent intent2 = new Intent(context, (Class<?>) AlarmService.class);
            intent2.putExtra(str2, str);
            context.startService(intent2);
        }
    }
}
