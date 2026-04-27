package com.watchfun.trans.database.transfreely;

import android.content.Context;
import p000.mi3;
import p000.p7e;
import p000.t9h;
import p000.tae;
import p000.uae;
import p000.z9h;

/* JADX INFO: loaded from: classes6.dex */
@mi3(entities = {z9h.class}, version = 1)
public abstract class TransFreelyDatabase extends uae {

    /* JADX INFO: renamed from: a */
    public static volatile TransFreelyDatabase f25317a;

    @p7e({p7e.EnumC10826a.f69934a})
    public static TransFreelyDatabase getDatabase(Context context) {
        if (f25317a == null) {
            synchronized (TransFreelyDatabase.class) {
                try {
                    if (f25317a == null) {
                        f25317a = (TransFreelyDatabase) tae.databaseBuilder(context.getApplicationContext(), TransFreelyDatabase.class, "transFreelyNew").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return f25317a;
    }

    public abstract t9h messageDao();
}
