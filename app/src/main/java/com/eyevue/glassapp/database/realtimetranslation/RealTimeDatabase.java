package com.eyevue.glassapp.database.realtimetranslation;

import android.content.Context;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes4.dex */
@mi3(entities = {RealTimeMessageTb.class}, version = 1)
public abstract class RealTimeDatabase extends uae {
    private static volatile RealTimeDatabase INSTANCE;

    @p7e({p7e.EnumC10826a.f69934a})
    public static RealTimeDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (RealTimeDatabase.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = (RealTimeDatabase) tae.databaseBuilder(context.getApplicationContext(), RealTimeDatabase.class, "realtimeMessageTb").allowMainThreadQueries().fallbackToDestructiveMigration().build();
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public abstract RealTimeMessageDao getRealTimeMessageDao();
}
