package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@we3
public interface sqi {
    @old("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> getTagsForWorkSpecId(String id);

    @old("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> getWorkSpecIdsWithTag(String tag);

    @p48(onConflict = 5)
    void insert(rqi workTag);
}
