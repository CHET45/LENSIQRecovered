package com.eyevue.glassapp.database.aichat;

import java.util.List;
import p000.old;
import p000.p48;
import p000.we3;

/* JADX INFO: loaded from: classes4.dex */
@we3
public interface AiChatMessageDao {
    @old("DELETE FROM AiChat")
    void deleteAll();

    @old("DELETE FROM AiChat WHERE messageTime = :messageTime")
    void deleteSelectData(long messageTime);

    @old("SELECT * FROM AiChat")
    List<AiChatMessage> getAll();

    @old("SELECT * FROM AiChat ORDER BY messageTime DESC")
    List<AiChatMessage> getLatestTen();

    @p48(onConflict = 1)
    void insert(AiChatMessage message);
}
