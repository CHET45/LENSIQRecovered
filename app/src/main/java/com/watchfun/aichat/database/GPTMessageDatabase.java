package com.watchfun.aichat.database;

import android.content.Context;
import p000.b27;
import p000.d27;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes6.dex */
@mi3(entities = {b27.class}, version = 1)
public abstract class GPTMessageDatabase extends uae {

    /* JADX INFO: renamed from: a */
    public static volatile GPTMessageDatabase f25033a;

    @p7e({p7e.EnumC10826a.f69934a})
    public static GPTMessageDatabase getDatabase(Context context) {
        if (f25033a == null) {
            synchronized (GPTMessageDatabase.class) {
                try {
                    if (f25033a == null) {
                        f25033a = (GPTMessageDatabase) tae.databaseBuilder(context.getApplicationContext(), GPTMessageDatabase.class, "gptAiChat").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return f25033a;
    }

    public abstract d27 messageDao();
}
