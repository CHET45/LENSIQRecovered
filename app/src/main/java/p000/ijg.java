package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@we3
public interface ijg {
    @hib
    @old("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    hjg getSystemIdInfo(@efb String workSpecId);

    @efb
    @old("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> getWorkSpecIds();

    @p48(onConflict = 1)
    void insertSystemIdInfo(@efb hjg systemIdInfo);

    @old("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(@efb String workSpecId);
}
