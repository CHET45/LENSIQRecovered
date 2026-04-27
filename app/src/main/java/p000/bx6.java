package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@we3
public interface bx6 {
    @old("DELETE FROM freedomTalkAi")
    void deleteAll();

    @old("DELETE FROM freedomTalkAi WHERE messageTime = :messageTime")
    void deleteSelectData(long messageTime);

    @old("SELECT * FROM freedomTalkAi WHERE result = :result AND messageTime = :messageTime")
    dx6 findByResult(String result, long messageTime);

    @old("SELECT * FROM freedomTalkAi")
    List<dx6> getAll();

    @old("SELECT * FROM freedomTalkAi ORDER BY messageTime DESC LIMIT 50")
    List<dx6> getLatestTen();

    @p48
    void insert(dx6 message);

    @old("UPDATE freedomTalkAi SET transResult = :newTransResult , voiceName = :newVoiceName WHERE id = :id")
    void updateTransResultByResult(Integer id, String newTransResult, String newVoiceName);

    @old("UPDATE freedomTalkAi SET voicePath = :voicePath  WHERE id = :id")
    void updateVoicePathById(long id, String voicePath);
}
