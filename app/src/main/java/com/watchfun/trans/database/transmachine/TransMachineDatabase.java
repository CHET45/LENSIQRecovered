package com.watchfun.trans.database.transmachine;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000.dbh;
import p000.jbh;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;
import p000.uah;

/* JADX INFO: loaded from: classes6.dex */
@mi3(entities = {dbh.class, jbh.class}, version = 1)
public abstract class TransMachineDatabase extends uae {

    /* JADX INFO: renamed from: a */
    public static volatile TransMachineDatabase f25320a;

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f25321b = Executors.newFixedThreadPool(4);

    @p7e({p7e.EnumC10826a.f69934a})
    public static TransMachineDatabase getDatabase(Context context) {
        if (f25320a == null) {
            synchronized (TransMachineDatabase.class) {
                try {
                    if (f25320a == null) {
                        f25320a = (TransMachineDatabase) tae.databaseBuilder(context.getApplicationContext(), TransMachineDatabase.class, "transMachineMsg").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return f25320a;
    }

    public static ExecutorService getDatabaseWriteExecutor() {
        return f25321b;
    }

    public abstract uah messageDao();
}
