package p000;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@we3
public interface esa {
    @old("SELECT * FROM chatAiNew")
    List<C13560uk> getAll();

    @old("SELECT * FROM chatAiNew ORDER BY messageTime DESC LIMIT 50")
    List<C13560uk> getLatestTen();

    @p48
    void insert(C13560uk message);
}
