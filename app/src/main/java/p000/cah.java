package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@we3
public interface cah {
    @old("DELETE FROM transHeadSetAi")
    void deleteAll();

    @old("DELETE FROM transHeadSetAi WHERE messageTime = :messageTime")
    void deleteSelectData(long messageTime);

    @old("SELECT * FROM transHeadSetAi WHERE result = :result AND messageTime = :messageTime")
    bah findByResult(String result, long messageTime);

    @old("SELECT * FROM transHeadSetAi")
    List<bah> getAll();

    @old("SELECT * FROM transHeadSetAi ORDER BY messageTime DESC LIMIT 50")
    List<bah> getLatestTen();

    @p48
    void insert(bah message);

    @old("UPDATE transHeadSetAi SET transResult = :newTransResult , result = :text WHERE messageTime = :messageTime")
    void updateTransResultByMessageTime(long messageTime, String text, String newTransResult);

    @old("UPDATE transHeadSetAi SET transResult = :newTransResult,voiceName = :newVoiceName WHERE id = :id")
    void updateTransResultByResult(Integer id, String newTransResult, String newVoiceName);

    @old("UPDATE transHeadSetAi SET voicePath = :voicePath  WHERE id = :id")
    void updateVoicePathById(long id, String voicePath);
}
