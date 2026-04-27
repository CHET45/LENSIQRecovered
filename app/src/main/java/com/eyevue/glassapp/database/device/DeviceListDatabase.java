package com.eyevue.glassapp.database.device;

import android.content.Context;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes4.dex */
@mi3(entities = {DeviceInfoBean.class}, version = 1)
public abstract class DeviceListDatabase extends uae {
    private static volatile DeviceListDatabase INSTANCE;

    @p7e({p7e.EnumC10826a.f69934a})
    public static DeviceListDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (DeviceListDatabase.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = (DeviceListDatabase) tae.databaseBuilder(context.getApplicationContext(), DeviceListDatabase.class, "DeviceList").allowMainThreadQueries().fallbackToDestructiveMigration().build();
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public abstract DeviceListDao getDeviceListDao();
}
