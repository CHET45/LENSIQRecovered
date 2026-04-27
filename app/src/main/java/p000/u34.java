package p000;

import java.util.HashMap;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class u34 {

    /* JADX INFO: renamed from: d */
    public static final String f86711d = cj9.tagWithPrefix("DelayedWorkTracker");

    /* JADX INFO: renamed from: a */
    public final gb7 f86712a;

    /* JADX INFO: renamed from: b */
    public final rde f86713b;

    /* JADX INFO: renamed from: c */
    public final Map<String, Runnable> f86714c = new HashMap();

    /* JADX INFO: renamed from: u34$a */
    public class RunnableC13349a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ oqi f86715a;

        public RunnableC13349a(final oqi val$workSpec) {
            this.f86715a = val$workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            cj9.get().debug(u34.f86711d, String.format("Scheduling work %s", this.f86715a.f68337a), new Throwable[0]);
            u34.this.f86712a.schedule(this.f86715a);
        }
    }

    public u34(@efb gb7 scheduler, @efb rde runnableScheduler) {
        this.f86712a = scheduler;
        this.f86713b = runnableScheduler;
    }

    public void schedule(@efb final oqi workSpec) {
        Runnable runnableRemove = this.f86714c.remove(workSpec.f68337a);
        if (runnableRemove != null) {
            this.f86713b.cancel(runnableRemove);
        }
        RunnableC13349a runnableC13349a = new RunnableC13349a(workSpec);
        this.f86714c.put(workSpec.f68337a, runnableC13349a);
        this.f86713b.scheduleWithDelay(workSpec.calculateNextRunTime() - System.currentTimeMillis(), runnableC13349a);
    }

    public void unschedule(@efb String workSpecId) {
        Runnable runnableRemove = this.f86714c.remove(workSpecId);
        if (runnableRemove != null) {
            this.f86713b.cancel(runnableRemove);
        }
    }
}
