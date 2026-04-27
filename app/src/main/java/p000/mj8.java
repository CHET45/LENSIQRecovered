package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes4.dex */
@c5e(api = 21)
public class mj8 implements nqi {

    /* JADX INFO: renamed from: d */
    public static final String f61133d = "JobInfoScheduler";

    /* JADX INFO: renamed from: e */
    public static final String f61134e = "attemptNumber";

    /* JADX INFO: renamed from: f */
    public static final String f61135f = "backendName";

    /* JADX INFO: renamed from: g */
    public static final String f61136g = "priority";

    /* JADX INFO: renamed from: h */
    public static final String f61137h = "extras";

    /* JADX INFO: renamed from: a */
    public final Context f61138a;

    /* JADX INFO: renamed from: b */
    public final t65 f61139b;

    /* JADX INFO: renamed from: c */
    public final yoe f61140c;

    public mj8(Context context, t65 t65Var, yoe yoeVar) {
        this.f61138a = context;
        this.f61139b = t65Var;
        this.f61140c = yoeVar;
    }

    private boolean isJobServiceOn(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public int m17344a(chh chhVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f61138a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(chhVar.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(gcd.toInt(chhVar.getPriority())).array());
        if (chhVar.getExtras() != null) {
            adler32.update(chhVar.getExtras());
        }
        return (int) adler32.getValue();
    }

    @Override // p000.nqi
    public void schedule(chh chhVar, int i) {
        schedule(chhVar, i, false);
    }

    @Override // p000.nqi
    public void schedule(chh chhVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f61138a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f61138a.getSystemService("jobscheduler");
        int iM17344a = m17344a(chhVar);
        if (!z && isJobServiceOn(jobScheduler, iM17344a, i)) {
            tj9.m22693d(f61133d, "Upload for context %s is already scheduled. Returning...", chhVar);
            return;
        }
        long nextCallTime = this.f61139b.getNextCallTime(chhVar);
        JobInfo.Builder builderConfigureJob = this.f61140c.configureJob(new JobInfo.Builder(iM17344a, componentName), chhVar.getPriority(), nextCallTime, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", chhVar.getBackendName());
        persistableBundle.putInt("priority", gcd.toInt(chhVar.getPriority()));
        if (chhVar.getExtras() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(chhVar.getExtras(), 0));
        }
        builderConfigureJob.setExtras(persistableBundle);
        tj9.m22695d(f61133d, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", chhVar, Integer.valueOf(iM17344a), Long.valueOf(this.f61140c.getScheduleDelay(chhVar.getPriority(), nextCallTime, i)), Long.valueOf(nextCallTime), Integer.valueOf(i));
        jobScheduler.schedule(builderConfigureJob.build());
    }
}
