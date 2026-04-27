package p000;

import androidx.lifecycle.AbstractC1158q;
import androidx.work.C1507b;
import java.util.List;
import p000.oqi;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
@we3
@igg({"UnknownNullness"})
public interface pqi {
    @old("DELETE FROM workspec WHERE id=:id")
    void delete(String id);

    @old("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
    List<oqi> getAllEligibleWorkSpecsForScheduling(int maxLimit);

    @old("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> getAllUnfinishedWork();

    @old("SELECT id FROM workspec")
    List<String> getAllWorkSpecIds();

    @ddh
    @old("SELECT id FROM workspec")
    AbstractC1158q<List<String>> getAllWorkSpecIdsLiveData();

    @old("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<oqi> getEligibleWorkForScheduling(int schedulerLimit);

    @old("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<C1507b> getInputsFromPrerequisites(String id);

    @old("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
    List<oqi> getRecentlyCompletedWork(long startingAt);

    @old("SELECT * FROM workspec WHERE state=1")
    List<oqi> getRunningWork();

    @old("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    AbstractC1158q<Long> getScheduleRequestedAtLiveData(@efb String id);

    @old("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<oqi> getScheduledWork();

    @old("SELECT state FROM workspec WHERE id=:id")
    tpi.EnumC13161a getState(String id);

    @old("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> getUnfinishedWorkWithName(@efb String name);

    @old("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<String> getUnfinishedWorkWithTag(@efb String tag);

    @old("SELECT * FROM workspec WHERE id=:id")
    oqi getWorkSpec(String id);

    @old("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<oqi.C10506b> getWorkSpecIdAndStatesForName(String name);

    @old("SELECT * FROM workspec WHERE id IN (:ids)")
    oqi[] getWorkSpecs(List<String> ids);

    @ddh
    @old("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=:id")
    oqi.C10507c getWorkStatusPojoForId(String id);

    @ddh
    @old("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    List<oqi.C10507c> getWorkStatusPojoForIds(List<String> ids);

    @ddh
    @old("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<oqi.C10507c> getWorkStatusPojoForName(String name);

    @ddh
    @old("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<oqi.C10507c> getWorkStatusPojoForTag(String tag);

    @ddh
    @old("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    AbstractC1158q<List<oqi.C10507c>> getWorkStatusPojoLiveDataForIds(List<String> ids);

    @ddh
    @old("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    AbstractC1158q<List<oqi.C10507c>> getWorkStatusPojoLiveDataForName(String name);

    @ddh
    @old("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    AbstractC1158q<List<oqi.C10507c>> getWorkStatusPojoLiveDataForTag(String tag);

    @old("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean hasUnfinishedWork();

    @old("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int incrementWorkSpecRunAttemptCount(String id);

    @p48(onConflict = 5)
    void insertWorkSpec(oqi workSpec);

    @old("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int markWorkSpecScheduled(@efb String id, long startTime);

    @old("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    @old("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int resetScheduledState();

    @old("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int resetWorkSpecRunAttemptCount(String id);

    @old("UPDATE workspec SET output=:output WHERE id=:id")
    void setOutput(String id, C1507b output);

    @old("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void setPeriodStartTime(String id, long periodStartTime);

    @old("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int setState(tpi.EnumC13161a state, String... ids);
}
