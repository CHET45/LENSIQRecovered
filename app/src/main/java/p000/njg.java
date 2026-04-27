package p000;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import p000.bx2;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(api = 23)
@p7e({p7e.EnumC10826a.f69935b})
public class njg {

    /* JADX INFO: renamed from: b */
    public static final String f64774b = cj9.tagWithPrefix("SystemJobInfoConverter");

    /* JADX INFO: renamed from: c */
    public static final String f64775c = "EXTRA_WORK_SPEC_ID";

    /* JADX INFO: renamed from: d */
    public static final String f64776d = "EXTRA_IS_PERIODIC";

    /* JADX INFO: renamed from: a */
    public final ComponentName f64777a;

    /* JADX INFO: renamed from: njg$a */
    public static /* synthetic */ class C9909a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64778a;

        static {
            int[] iArr = new int[wbb.values().length];
            f64778a = iArr;
            try {
                iArr[wbb.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64778a[wbb.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64778a[wbb.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64778a[wbb.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64778a[wbb.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @fdi(otherwise = 3)
    public njg(@efb Context context) {
        this.f64777a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX INFO: renamed from: b */
    public static int m17973b(wbb networkType) {
        int i = C9909a.f64778a[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        cj9.get().debug(f64774b, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m17974c(@efb JobInfo.Builder builder, @efb wbb networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != wbb.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m17973b(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    @c5e(24)
    private static JobInfo.TriggerContentUri convertContentUriTrigger(bx2.C2095a c2095a) {
        return new JobInfo.TriggerContentUri(c2095a.getUri(), c2095a.shouldTriggerForDescendants() ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public JobInfo m17975a(oqi workSpec, int jobId) {
        lu2 lu2Var = workSpec.f68346j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f64775c, workSpec.f68337a);
        persistableBundle.putBoolean(f64776d, workSpec.isPeriodic());
        JobInfo.Builder extras = new JobInfo.Builder(jobId, this.f64777a).setRequiresCharging(lu2Var.requiresCharging()).setRequiresDeviceIdle(lu2Var.requiresDeviceIdle()).setExtras(persistableBundle);
        m17974c(extras, lu2Var.getRequiredNetworkType());
        if (!lu2Var.requiresDeviceIdle()) {
            extras.setBackoffCriteria(workSpec.f68349m, workSpec.f68348l == oo0.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(workSpec.calculateNextRunTime() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.f68353q) {
            extras.setImportantWhileForeground(true);
        }
        if (lu2Var.hasContentUriTriggers()) {
            Iterator<bx2.C2095a> it = lu2Var.getContentUriTriggers().getTriggers().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(convertContentUriTrigger(it.next()));
            }
            extras.setTriggerContentUpdateDelay(lu2Var.getTriggerContentUpdateDelay());
            extras.setTriggerContentMaxDelay(lu2Var.getTriggerMaxContentDelay());
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(lu2Var.requiresBatteryNotLow());
        extras.setRequiresStorageNotLow(lu2Var.requiresStorageNotLow());
        boolean z = workSpec.f68347k > 0;
        boolean z2 = jMax > 0;
        if (nf1.isAtLeastS() && workSpec.f68353q && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
