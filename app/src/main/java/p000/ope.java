package p000;

import android.content.Context;
import androidx.work.C1506a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class ope {

    /* JADX INFO: renamed from: a */
    public static final String f68278a = "androidx.work.impl.background.gcm.GcmScheduler";

    /* JADX INFO: renamed from: b */
    public static final String f68279b = cj9.tagWithPrefix("Schedulers");

    private ope() {
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static roe m18807a(@efb Context context, @efb zpi workManager) {
        ojg ojgVar = new ojg(context, workManager);
        pac.setComponentEnabled(context, SystemJobService.class, true);
        cj9.get().debug(f68279b, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return ojgVar;
    }

    public static void schedule(@efb C1506a configuration, @efb WorkDatabase workDatabase, List<roe> schedulers) {
        if (schedulers == null || schedulers.size() == 0) {
            return;
        }
        pqi pqiVarWorkSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<oqi> eligibleWorkForScheduling = pqiVarWorkSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            List<oqi> allEligibleWorkSpecsForScheduling = pqiVarWorkSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<oqi> it = eligibleWorkForScheduling.iterator();
                while (it.hasNext()) {
                    pqiVarWorkSpecDao.markWorkSpecScheduled(it.next().f68337a, jCurrentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                oqi[] oqiVarArr = (oqi[]) eligibleWorkForScheduling.toArray(new oqi[eligibleWorkForScheduling.size()]);
                for (roe roeVar : schedulers) {
                    if (roeVar.hasLimitedSchedulingSlots()) {
                        roeVar.schedule(oqiVarArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling == null || allEligibleWorkSpecsForScheduling.size() <= 0) {
                return;
            }
            oqi[] oqiVarArr2 = (oqi[]) allEligibleWorkSpecsForScheduling.toArray(new oqi[allEligibleWorkSpecsForScheduling.size()]);
            for (roe roeVar2 : schedulers) {
                if (!roeVar2.hasLimitedSchedulingSlots()) {
                    roeVar2.schedule(oqiVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    @hib
    private static roe tryCreateGcmBasedScheduler(@efb Context context) {
        try {
            roe roeVar = (roe) Class.forName(f68278a).getConstructor(Context.class).newInstance(context);
            cj9.get().debug(f68279b, String.format("Created %s", f68278a), new Throwable[0]);
            return roeVar;
        } catch (Throwable th) {
            cj9.get().debug(f68279b, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
