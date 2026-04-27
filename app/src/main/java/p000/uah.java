package p000;

import androidx.lifecycle.AbstractC1158q;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@we3
public interface uah {
    @old("DELETE FROM transMachineMsg")
    void deleteAll();

    @old("DELETE FROM transMachineRecord")
    void deleteAllRecord();

    @old("DELETE FROM transMachineRecord WHERE id = :id")
    void deleteRecordById(long id);

    @old("DELETE FROM transMachineMsg WHERE messageTime = :messageTime")
    void deleteSelectData(long messageTime);

    @old("DELETE FROM transMachineRecord WHERE time = :time")
    void deleteSelectRecordData(long time);

    @old("SELECT * FROM transMachineMsg WHERE result = :result AND messageTime = :messageTime")
    dbh findByResult(String result, long messageTime);

    @old("SELECT * FROM transMachineMsg")
    List<dbh> getAll();

    @old("SELECT * FROM transMachineRecord ORDER BY time DESC")
    List<jbh> getAllRecord();

    @old("SELECT * FROM transMachineRecord ORDER BY time DESC")
    AbstractC1158q<List<jbh>> getAllRecordLiveData();

    @old("SELECT * FROM transMachineMsg ORDER BY id DESC LIMIT 50")
    List<dbh> getLatestData();

    @old("SELECT * FROM transMachineMsg ORDER BY messageTime DESC LIMIT 1")
    List<dbh> getLatestOne();

    @old("SELECT * FROM transMachineMsg ORDER BY messageTime DESC LIMIT 50")
    List<dbh> getLatestTen();

    @old("SELECT * FROM transMachineRecord WHERE id =:id")
    jbh getRecordById(long id);

    @old("SELECT COUNT(*) FROM transMachineRecord WHERE date(time/1000, 'unixepoch') = date('now')")
    int getTodayRecordCount();

    @p48
    long insert(dbh message);

    @p48
    void insert(jbh record);

    @old("SELECT * FROM transMachineMsg WHERE voicePath = :voicePath")
    dbh queryByVoicePath(String voicePath);

    @old("UPDATE transMachineRecord SET name = :name ,sourceVoicePath =:mp3Path WHERE id = :id")
    void reRecordNameById(long id, String name, String mp3Path);

    @old("UPDATE transMachineRecord SET sourceVoicePath = :sourceVoicePath  WHERE id = :id")
    void updateSourceVoicePathById(long id, String sourceVoicePath);

    @old("UPDATE transMachineRecord SET sourceVoicePath = :sourceVoicePath  WHERE time = :time")
    void updateSourceVoicePathByTime(long time, String sourceVoicePath);

    @old("UPDATE transMachineMsg SET transResult = :newTransResult , result = :text WHERE messageTime = :messageTime")
    void updateTransResultByMessageTime(long messageTime, String text, String newTransResult);

    @old("UPDATE transMachineMsg SET transResult = :newTransResult , voiceName = :newVoiceName WHERE id = :id")
    void updateTransResultByResult(Integer id, String newTransResult, String newVoiceName);

    @old("UPDATE transMachineMsg SET voicePath = :voicePath  WHERE id = :id")
    void updateVoicePathById(long id, String voicePath);

    @old("UPDATE transMachineMsg SET voicePath = :voicePath  WHERE messageTime = :messageTime")
    void updateVoicePathByMessageTime(long messageTime, String voicePath);
}
