package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.p7e;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
@c5e(23)
@p7e({p7e.EnumC10826a.f69935b})
public class ojg implements roe {

    /* JADX INFO: renamed from: e */
    public static final String f67850e = cj9.tagWithPrefix("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f67851a;

    /* JADX INFO: renamed from: b */
    public final JobScheduler f67852b;

    /* JADX INFO: renamed from: c */
    public final zpi f67853c;

    /* JADX INFO: renamed from: d */
    public final njg f67854d;

    public ojg(@efb Context context, @efb zpi workManager) {
        this(context, workManager, (JobScheduler) context.getSystemService("jobscheduler"), new njg(context));
    }

    public static void cancelAll(@efb Context context) {
        List<JobInfo> pendingJobs;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (pendingJobs = getPendingJobs(context, jobScheduler)) == null || pendingJobs.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = pendingJobs.iterator();
        while (it.hasNext()) {
            cancelJobById(jobScheduler, it.next().getId());
        }
    }

    private static void cancelJobById(@efb JobScheduler jobScheduler, int id) {
        try {
            jobScheduler.cancel(id);
        } catch (Throwable th) {
            cj9.get().error(f67850e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id)), th);
        }
    }

    @hib
    private static List<Integer> getPendingJobIds(@efb Context context, @efb JobScheduler jobScheduler, @efb String workSpecId) {
        List<JobInfo> pendingJobs = getPendingJobs(context, jobScheduler);
        if (pendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : pendingJobs) {
            if (workSpecId.equals(getWorkSpecIdFromJobInfo(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @hib
    private static List<JobInfo> getPendingJobs(@efb Context context, @efb JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            cj9.get().error(f67850e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @hib
    private static String getWorkSpecIdFromJobInfo(@efb JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey(njg.f64775c)) {
                return extras.getString(njg.f64775c);
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean reconcileJobs(@efb Context context, @efb zpi workManager) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> pendingJobs = getPendingJobs(context, jobScheduler);
        List<String> workSpecIds = workManager.getWorkDatabase().systemIdInfoDao().getWorkSpecIds();
        boolean z = false;
        HashSet hashSet = new HashSet(pendingJobs != null ? pendingJobs.size() : 0);
        if (pendingJobs != null && !pendingJobs.isEmpty()) {
            for (JobInfo jobInfo : pendingJobs) {
                String workSpecIdFromJobInfo = getWorkSpecIdFromJobInfo(jobInfo);
                if (TextUtils.isEmpty(workSpecIdFromJobInfo)) {
                    cancelJobById(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(workSpecIdFromJobInfo);
                }
            }
        }
        Iterator<String> it = workSpecIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                cj9.get().debug(f67850e, "Reconciling jobs", new Throwable[0]);
                z = true;
                break;
            }
        }
        if (z) {
            WorkDatabase workDatabase = workManager.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                pqi pqiVarWorkSpecDao = workDatabase.workSpecDao();
                Iterator<String> it2 = workSpecIds.iterator();
                while (it2.hasNext()) {
                    pqiVarWorkSpecDao.markWorkSpecScheduled(it2.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
        return z;
    }

    @Override // p000.roe
    public void cancel(@efb String workSpecId) {
        List<Integer> pendingJobIds = getPendingJobIds(this.f67851a, this.f67852b, workSpecId);
        if (pendingJobIds == null || pendingJobIds.isEmpty()) {
            return;
        }
        Iterator<Integer> it = pendingJobIds.iterator();
        while (it.hasNext()) {
            cancelJobById(this.f67852b, it.next().intValue());
        }
        this.f67853c.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(workSpecId);
    }

    @Override // p000.roe
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // p000.roe
    public void schedule(@efb oqi... workSpecs) {
        WorkDatabase workDatabase = this.f67853c.getWorkDatabase();
        ir7 ir7Var = new ir7(workDatabase);
        for (oqi oqiVar : workSpecs) {
            workDatabase.beginTransaction();
            try {
                oqi workSpec = workDatabase.workSpecDao().getWorkSpec(oqiVar.f68337a);
                if (workSpec == null) {
                    cj9.get().warning(f67850e, "Skipping scheduling " + oqiVar.f68337a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else if (workSpec.f68338b != tpi.EnumC13161a.ENQUEUED) {
                    cj9.get().warning(f67850e, "Skipping scheduling " + oqiVar.f68337a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else {
                    hjg systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(oqiVar.f68337a);
                    int iNextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.f43827b : ir7Var.nextJobSchedulerIdWithRange(this.f67853c.getConfiguration().getMinJobSchedulerId(), this.f67853c.getConfiguration().getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        this.f67853c.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(new hjg(oqiVar.f68337a, iNextJobSchedulerIdWithRange));
                    }
                    scheduleInternal(oqiVar, iNextJobSchedulerIdWithRange);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    @fdi
    public void scheduleInternal(oqi workSpec, int jobId) {
        JobInfo jobInfoM17975a = this.f67854d.m17975a(workSpec, jobId);
        cj9 cj9Var = cj9.get();
        String str = f67850e;
        cj9Var.debug(str, String.format("Scheduling work ID %s Job ID %s", workSpec.f68337a, Integer.valueOf(jobId)), new Throwable[0]);
        try {
            if (this.f67852b.schedule(jobInfoM17975a) == 0) {
                cj9.get().warning(str, String.format("Unable to schedule work ID %s", workSpec.f68337a), new Throwable[0]);
                if (workSpec.f68353q && workSpec.f68354r == h8c.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.f68353q = false;
                    cj9.get().debug(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.f68337a), new Throwable[0]);
                    scheduleInternal(workSpec, jobId);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> pendingJobs = getPendingJobs(this.f67851a, this.f67852b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(pendingJobs != null ? pendingJobs.size() : 0), Integer.valueOf(this.f67853c.getWorkDatabase().workSpecDao().getScheduledWork().size()), Integer.valueOf(this.f67853c.getConfiguration().getMaxSchedulerLimit()));
            cj9.get().error(f67850e, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e);
        } catch (Throwable th) {
            cj9.get().error(f67850e, String.format("Unable to schedule %s", workSpec), th);
        }
    }

    @fdi
    public ojg(Context context, zpi workManager, JobScheduler jobScheduler, njg systemJobInfoConverter) {
        this.f67851a = context;
        this.f67853c = workManager;
        this.f67852b = jobScheduler;
        this.f67854d = systemJobInfoConverter;
    }
}
