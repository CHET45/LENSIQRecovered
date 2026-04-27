package p000;

import androidx.work.C1507b;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@we3
@p7e({p7e.EnumC10826a.f69935b})
public interface fqi {
    @old("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void delete(@efb String workSpecId);

    @old("DELETE FROM WorkProgress")
    void deleteAll();

    @hib
    @old("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    C1507b getProgressForWorkSpecId(@efb String workSpecId);

    @efb
    @old("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
    List<C1507b> getProgressForWorkSpecIds(@efb List<String> workSpecIds);

    @p48(onConflict = 1)
    void insert(@efb eqi progress);
}
