package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@we3
public interface l64 {
    @old("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> getDependentWorkIds(String id);

    @old("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    List<String> getPrerequisites(String id);

    @old("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean hasCompletedAllPrerequisites(String id);

    @old("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean hasDependents(String id);

    @p48(onConflict = 5)
    void insertDependency(h64 dependency);
}
