package com.eyevue.glassapp.database.realtimetranslation;

import java.util.List;
import p000.dwh;
import p000.old;
import p000.p48;
import p000.we3;

/* JADX INFO: loaded from: classes4.dex */
@we3
public interface RealTimeMessageDao {
    @old("DELETE FROM realtimeMessageTb")
    void deleteAll();

    @old("DELETE FROM realtimeMessageTb WHERE messageTime = :messageTime")
    void deleteSelectData(long messageTime);

    @old("SELECT * FROM realtimeMessageTb WHERE result = :result AND messageTime = :messageTime")
    RealTimeMessageTb findByResult(String result, long messageTime);

    @old("SELECT * FROM realtimeMessageTb")
    List<RealTimeMessageTb> getAll();

    @old("SELECT * FROM realtimeMessageTb ORDER BY id DESC LIMIT 50")
    List<RealTimeMessageTb> getLatestData();

    @old("SELECT * FROM realtimeMessageTb ORDER BY messageTime DESC LIMIT 1")
    List<RealTimeMessageTb> getLatestOne();

    @p48
    long insert(RealTimeMessageTb message);

    @old("SELECT * FROM realtimeMessageTb WHERE messageTime = :messageTime")
    RealTimeMessageTb queryByTime(long messageTime);

    @old("SELECT * FROM realtimeMessageTb WHERE voicePath = :voicePath")
    RealTimeMessageTb queryByVoicePath(String voicePath);

    @dwh
    int update(RealTimeMessageTb transMachineMessage);

    @old("UPDATE realtimeMessageTb SET transResult = :newTransResult , result = :text WHERE messageTime = :messageTime")
    void updateTransResultByMessageTime(long messageTime, String text, String newTransResult);

    @old("UPDATE realtimeMessageTb SET transResult = :newTransResult , voiceName = :newVoiceName WHERE id = :id")
    void updateTransResultByResult(Integer id, String newTransResult, String newVoiceName);

    @old("UPDATE realtimeMessageTb SET voicePath = :voicePath  WHERE id = :id")
    void updateVoicePathById(long id, String voicePath);

    @old("UPDATE realtimeMessageTb SET voicePath = :voicePath  WHERE messageTime = :messageTime")
    void updateVoicePathByMessageTime(long messageTime, String voicePath);
}
