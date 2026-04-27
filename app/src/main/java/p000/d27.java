package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@we3
public interface d27 {
    @old("DELETE FROM gptAiChat")
    void deleteAll();

    @old("DELETE FROM gptAiChat WHERE messageTime = :messageTime")
    void deleteSelectData(long j);

    @old("SELECT * FROM gptAiChat")
    List<b27> getAll();

    @old("SELECT * FROM gptAiChat ORDER BY messageTime DESC LIMIT 50")
    List<b27> getLatestTen();

    @p48(onConflict = 1)
    void insert(b27 b27Var);
}
