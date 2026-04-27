package com.watchfun.trans.database.freedomTalk;

import android.content.Context;
import p000.bx6;
import p000.dx6;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes6.dex */
@mi3(entities = {dx6.class}, version = 1)
public abstract class FreedomTalkDatabase extends uae {

    /* JADX INFO: renamed from: a */
    public static volatile FreedomTalkDatabase f25311a;

    @p7e({p7e.EnumC10826a.f69934a})
    public static FreedomTalkDatabase getDatabase(Context context) {
        if (f25311a == null) {
            synchronized (FreedomTalkDatabase.class) {
                try {
                    if (f25311a == null) {
                        f25311a = (FreedomTalkDatabase) tae.databaseBuilder(context.getApplicationContext(), FreedomTalkDatabase.class, "freedomTalkAi").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return f25311a;
    }

    public abstract bx6 messageDao();
}
