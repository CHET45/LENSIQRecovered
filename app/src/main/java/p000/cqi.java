package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@we3
public interface cqi {
    @efb
    @old("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> getNamesForWorkSpecId(@efb String workSpecId);

    @old("SELECT work_spec_id FROM workname WHERE name=:name")
    List<String> getWorkSpecIdsWithName(String name);

    @p48(onConflict = 5)
    void insert(bqi workName);
}
