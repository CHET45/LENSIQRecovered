package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@we3
public interface fbh {
    @old("DELETE FROM transMachineAiPublic")
    void deleteAll();

    @old("DELETE FROM transMachineAiPublic WHERE messageTime = :messageTime")
    void deleteSelectData(long messageTime);

    @old("SELECT * FROM transMachineAiPublic WHERE result = :result AND messageTime = :messageTime")
    hbh findByResult(String result, long messageTime);

    @old("SELECT * FROM transMachineAiPublic")
    List<hbh> getAll();

    @old("SELECT * FROM transMachineAiPublic ORDER BY id DESC LIMIT 50")
    List<hbh> getLatestData();

    @old("SELECT * FROM transMachineAiPublic ORDER BY messageTime DESC LIMIT 1")
    List<hbh> getLatestOne();

    @p48
    long insert(hbh message);

    @old("SELECT * FROM transMachineAiPublic WHERE messageTime = :messageTime")
    hbh queryByTime(long messageTime);

    @old("SELECT * FROM transMachineAiPublic WHERE voicePath = :voicePath")
    hbh queryByVoicePath(String voicePath);

    @dwh
    int update(hbh transMachineMessage);

    @old("UPDATE transMachineAiPublic SET transResult = :newTransResult , result = :text WHERE messageTime = :messageTime")
    void updateTransResultByMessageTime(long messageTime, String text, String newTransResult);

    @old("UPDATE transMachineAiPublic SET transResult = :newTransResult , voiceName = :newVoiceName WHERE id = :id")
    void updateTransResultByResult(Integer id, String newTransResult, String newVoiceName);

    @old("UPDATE transMachineAiPublic SET voicePath = :voicePath  WHERE id = :id")
    void updateVoicePathById(long id, String voicePath);

    @old("UPDATE transMachineAiPublic SET voicePath = :voicePath  WHERE messageTime = :messageTime")
    void updateVoicePathByMessageTime(long messageTime, String voicePath);
}
