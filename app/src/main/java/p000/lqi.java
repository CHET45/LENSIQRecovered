package p000;

import androidx.work.C1507b;
import androidx.work.ListenableWorker;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p000.p7e;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqi {

    /* JADX INFO: renamed from: d */
    public static final long f58479d = 30000;

    /* JADX INFO: renamed from: e */
    @igg({"MinMaxConstant"})
    public static final long f58480e = 18000000;

    /* JADX INFO: renamed from: f */
    @igg({"MinMaxConstant"})
    public static final long f58481f = 10000;

    /* JADX INFO: renamed from: a */
    @efb
    public UUID f58482a;

    /* JADX INFO: renamed from: b */
    @efb
    public oqi f58483b;

    /* JADX INFO: renamed from: c */
    @efb
    public Set<String> f58484c;

    @p7e({p7e.EnumC10826a.f69935b})
    public lqi(@efb UUID id, @efb oqi workSpec, @efb Set<String> tags) {
        this.f58482a = id;
        this.f58483b = workSpec;
        this.f58484c = tags;
    }

    @efb
    public UUID getId() {
        return this.f58482a;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public String getStringId() {
        return this.f58482a.toString();
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public Set<String> getTags() {
        return this.f58484c;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public oqi getWorkSpec() {
        return this.f58483b;
    }

    /* JADX INFO: renamed from: lqi$a */
    public static abstract class AbstractC8940a<B extends AbstractC8940a<?, ?>, W extends lqi> {

        /* JADX INFO: renamed from: c */
        public oqi f58487c;

        /* JADX INFO: renamed from: e */
        public Class<? extends ListenableWorker> f58489e;

        /* JADX INFO: renamed from: a */
        public boolean f58485a = false;

        /* JADX INFO: renamed from: d */
        public Set<String> f58488d = new HashSet();

        /* JADX INFO: renamed from: b */
        public UUID f58486b = UUID.randomUUID();

        public AbstractC8940a(@efb Class<? extends ListenableWorker> workerClass) {
            this.f58489e = workerClass;
            this.f58487c = new oqi(this.f58486b.toString(), workerClass.getName());
            addTag(workerClass.getName());
        }

        @efb
        /* JADX INFO: renamed from: a */
        public abstract W mo9694a();

        @efb
        public final B addTag(@efb String str) {
            this.f58488d.add(str);
            return (B) mo9695b();
        }

        @efb
        /* JADX INFO: renamed from: b */
        public abstract B mo9695b();

        @efb
        public final W build() {
            W w = (W) mo9694a();
            lu2 lu2Var = this.f58487c.f68346j;
            boolean z = lu2Var.hasContentUriTriggers() || lu2Var.requiresBatteryNotLow() || lu2Var.requiresCharging() || lu2Var.requiresDeviceIdle();
            oqi oqiVar = this.f58487c;
            if (oqiVar.f68353q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (oqiVar.f68343g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f58486b = UUID.randomUUID();
            oqi oqiVar2 = new oqi(this.f58487c);
            this.f58487c = oqiVar2;
            oqiVar2.f68337a = this.f58486b.toString();
            return w;
        }

        @efb
        public final B keepResultsForAtLeast(long j, @efb TimeUnit timeUnit) {
            this.f58487c.f68351o = timeUnit.toMillis(j);
            return (B) mo9695b();
        }

        @efb
        public final B setBackoffCriteria(@efb oo0 oo0Var, long j, @efb TimeUnit timeUnit) {
            this.f58485a = true;
            oqi oqiVar = this.f58487c;
            oqiVar.f68348l = oo0Var;
            oqiVar.setBackoffDelayDuration(timeUnit.toMillis(j));
            return (B) mo9695b();
        }

        @efb
        public final B setConstraints(@efb lu2 lu2Var) {
            this.f58487c.f68346j = lu2Var;
            return (B) mo9695b();
        }

        @efb
        @igg({"MissingGetterMatchingBuilder"})
        public B setExpedited(@efb h8c h8cVar) {
            oqi oqiVar = this.f58487c;
            oqiVar.f68353q = true;
            oqiVar.f68354r = h8cVar;
            return (B) mo9695b();
        }

        @efb
        public B setInitialDelay(long j, @efb TimeUnit timeUnit) {
            this.f58487c.f68343g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f58487c.f68343g) {
                return (B) mo9695b();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @efb
        @fdi
        @p7e({p7e.EnumC10826a.f69935b})
        public final B setInitialRunAttemptCount(int i) {
            this.f58487c.f68347k = i;
            return (B) mo9695b();
        }

        @efb
        @fdi
        @p7e({p7e.EnumC10826a.f69935b})
        public final B setInitialState(@efb tpi.EnumC13161a enumC13161a) {
            this.f58487c.f68338b = enumC13161a;
            return (B) mo9695b();
        }

        @efb
        public final B setInputData(@efb C1507b c1507b) {
            this.f58487c.f68341e = c1507b;
            return (B) mo9695b();
        }

        @efb
        @fdi
        @p7e({p7e.EnumC10826a.f69935b})
        public final B setPeriodStartTime(long j, @efb TimeUnit timeUnit) {
            this.f58487c.f68350n = timeUnit.toMillis(j);
            return (B) mo9695b();
        }

        @efb
        @fdi
        @p7e({p7e.EnumC10826a.f69935b})
        public final B setScheduleRequestedAt(long j, @efb TimeUnit timeUnit) {
            this.f58487c.f68352p = timeUnit.toMillis(j);
            return (B) mo9695b();
        }

        @c5e(26)
        @efb
        public final B keepResultsForAtLeast(@efb Duration duration) {
            this.f58487c.f68351o = duration.toMillis();
            return (B) mo9695b();
        }

        @c5e(26)
        @efb
        public final B setBackoffCriteria(@efb oo0 oo0Var, @efb Duration duration) {
            this.f58485a = true;
            oqi oqiVar = this.f58487c;
            oqiVar.f68348l = oo0Var;
            oqiVar.setBackoffDelayDuration(duration.toMillis());
            return (B) mo9695b();
        }

        @c5e(26)
        @efb
        public B setInitialDelay(@efb Duration duration) {
            this.f58487c.f68343g = duration.toMillis();
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f58487c.f68343g) {
                return (B) mo9695b();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }
}
