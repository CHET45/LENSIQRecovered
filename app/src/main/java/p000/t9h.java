package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@we3
public interface t9h {
    @old("DELETE FROM transFreelyNew")
    void deleteAll();

    @old("DELETE FROM transFreelyNew WHERE messageTime = :messageTime")
    void deleteSelectData(long messageTime);

    @old("SELECT * FROM transFreelyNew WHERE result = :result AND messageTime = :messageTime")
    z9h findByResult(String result, long messageTime);

    @old("SELECT * FROM transFreelyNew")
    List<z9h> getAll();

    @old("SELECT * FROM transFreelyNew ORDER BY messageTime DESC LIMIT 50")
    List<z9h> getLatestTen();

    @p48
    void insert(z9h message);

    @old("UPDATE transFreelyNew SET transResult = :newTransResult, voiceName = :newVoiceName,voicePath= :voicePath WHERE messageTime = :messageTime")
    void updateByMessageTime(long messageTime, String newTransResult, String newVoiceName, String voicePath);

    @old("UPDATE transFreelyNew SET transResult = :newTransResult , result = :text WHERE messageTime = :messageTime")
    void updateTransResultByMessageTime(long messageTime, String text, String newTransResult);

    @old("UPDATE transFreelyNew SET transResult = :newTransResult , voiceName = :newVoiceName WHERE id = :id")
    void updateTransResultByResult(Integer id, String newTransResult, String newVoiceName);

    @old("UPDATE transFreelyNew SET voicePath = :voicePath  WHERE id = :id")
    void updateVoicePathById(long id, String voicePath);
}
