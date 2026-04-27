package com.watchfun.voicenotes.database;

import java.util.List;
import p000.dwh;
import p000.old;
import p000.p48;
import p000.w44;
import p000.we3;

/* JADX INFO: loaded from: classes7.dex */
@we3
public interface VoiceNotesDao {
    @w44
    void deleteMeetInfo(VoiceNotesBean voiceNotesBean);

    @old("SELECT * FROM voicenotes WHERE id = :id")
    VoiceNotesBean findById(String str);

    @old("SELECT * FROM voicenotes WHERE mid = :mid")
    VoiceNotesBean findByMid(long j);

    @old("SELECT * FROM voicenotes")
    List<VoiceNotesBean> getAll();

    @p48
    void saveMeetInfo(VoiceNotesBean voiceNotesBean);

    @dwh
    void updateMeetInfo(VoiceNotesBean voiceNotesBean);

    @old("UPDATE voicenotes SET recordTime = :recordTime ,recordPath = :mp3RecordPath  WHERE recordPath = :recordPath AND createTime=:createTime")
    void updateMeetingDataByRecordPath(String str, String str2, long j, String str3);

    @old("UPDATE voicenotes SET id = :id  WHERE recordPath = :recordPath AND createTime=:createTime")
    void updateMeetingDataByRecordPath(String str, String str2, String str3);
}
