package com.watchfun.trans.database.transear;

import android.content.Context;
import p000.bah;
import p000.cah;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes6.dex */
@mi3(entities = {bah.class}, version = 1)
public abstract class TransHeadSetMessageDatabase extends uae {

    /* JADX INFO: renamed from: a */
    public static volatile TransHeadSetMessageDatabase f25314a;

    @p7e({p7e.EnumC10826a.f69934a})
    public static TransHeadSetMessageDatabase getDatabase(Context context) {
        if (f25314a == null) {
            synchronized (TransHeadSetMessageDatabase.class) {
                try {
                    if (f25314a == null) {
                        f25314a = (TransHeadSetMessageDatabase) tae.databaseBuilder(context.getApplicationContext(), TransHeadSetMessageDatabase.class, "transHeadSetAi").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return f25314a;
    }

    public abstract cah messageDao();
}
