package com.watchfun.trans.database.twoear;

import android.content.Context;
import p000.mi3;
import p000.nch;
import p000.p7e;
import p000.pch;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes6.dex */
@mi3(entities = {pch.class}, version = 1)
public abstract class TransTwoEarDatabase extends uae {

    /* JADX INFO: renamed from: a */
    public static volatile TransTwoEarDatabase f25327a;

    @p7e({p7e.EnumC10826a.f69934a})
    public static TransTwoEarDatabase getDatabase(Context context) {
        if (f25327a == null) {
            synchronized (TransTwoEarDatabase.class) {
                try {
                    if (f25327a == null) {
                        f25327a = (TransTwoEarDatabase) tae.databaseBuilder(context.getApplicationContext(), TransTwoEarDatabase.class, "twoEarTransAi").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return f25327a;
    }

    public abstract nch messageDao();
}
