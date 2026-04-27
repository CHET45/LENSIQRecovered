package com.watchfun.trans.database.transmachinepublic;

import android.content.Context;
import p000.fbh;
import p000.hbh;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes6.dex */
@mi3(entities = {hbh.class}, version = 1)
public abstract class TransMachinePublicDatabase extends uae {

    /* JADX INFO: renamed from: a */
    public static volatile TransMachinePublicDatabase f25324a;

    @p7e({p7e.EnumC10826a.f69934a})
    public static TransMachinePublicDatabase getDatabase(Context context) {
        if (f25324a == null) {
            synchronized (TransMachinePublicDatabase.class) {
                try {
                    if (f25324a == null) {
                        f25324a = (TransMachinePublicDatabase) tae.databaseBuilder(context.getApplicationContext(), TransMachinePublicDatabase.class, "transMachineAiPublic").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return f25324a;
    }

    public abstract fbh messageDao();
}
