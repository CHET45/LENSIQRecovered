package com.eyevue.glassapp.database.aichat;

import android.content.Context;
import p000.mi3;
import p000.p7e;
import p000.tae;
import p000.uae;

/* JADX INFO: loaded from: classes4.dex */
@mi3(entities = {AiChatMessage.class}, version = 1)
public abstract class AiChatMessageDatabase extends uae {
    private static volatile AiChatMessageDatabase INSTANCE;

    @p7e({p7e.EnumC10826a.f69934a})
    public static AiChatMessageDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (AiChatMessageDatabase.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = (AiChatMessageDatabase) tae.databaseBuilder(context.getApplicationContext(), AiChatMessageDatabase.class, "AiChat").allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public abstract AiChatMessageDao messageDao();
}
