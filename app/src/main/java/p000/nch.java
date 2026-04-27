package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@we3
public interface nch {
    @old("DELETE FROM twoEarTransAi")
    void deleteAll();

    @old("DELETE FROM twoEarTransAi WHERE messageTime = :messageTime")
    void deleteSelectData(long messageTime);

    @old("SELECT * FROM twoEarTransAi WHERE result = :result AND messageTime = :messageTime")
    pch findByResult(String result, long messageTime);

    @old("SELECT * FROM twoEarTransAi")
    List<pch> getAll();

    @old("SELECT * FROM twoEarTransAi ORDER BY messageTime DESC LIMIT 50")
    List<pch> getLatestTen();

    @p48
    void insert(pch message);

    @old("UPDATE twoEarTransAi SET transResult = :newTransResult , result = :text WHERE messageTime = :messageTime")
    void updateTransResultByMessageTime(long messageTime, String text, String newTransResult);

    @old("UPDATE twoEarTransAi SET transResult = :newTransResult ,voiceName = :newVoiceName WHERE id = :id")
    void updateTransResultByResult(Integer id, String newTransResult, String newVoiceName);

    @old("UPDATE twoEarTransAi SET voicePath = :voicePath  WHERE id = :id")
    void updateVoicePathById(long id, String voicePath);
}
