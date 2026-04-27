package com.eyevue.glassapp.database.alarmclock;

import android.content.Context;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes4.dex */
@mi3(entities = {AlarmClockMessage.class}, version = 1)
public abstract class AlarmClockMessageDatabase extends uae {
    private static volatile AlarmClockMessageDatabase INSTANCE;

    @p7e({p7e.EnumC10826a.f69934a})
    public static AlarmClockMessageDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (AlarmClockMessageDatabase.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = (AlarmClockMessageDatabase) tae.databaseBuilder(context.getApplicationContext(), AlarmClockMessageDatabase.class, "AlarmClock").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public abstract AlarmClockMessageDao messageDao();
}
