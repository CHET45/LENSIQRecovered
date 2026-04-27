package p000;

import androidx.work.ListenableWorker;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import p000.lqi;

/* JADX INFO: loaded from: classes3.dex */
public final class wnc extends lqi {

    /* JADX INFO: renamed from: g */
    @igg({"MinMaxConstant"})
    public static final long f94840g = 900000;

    /* JADX INFO: renamed from: h */
    @igg({"MinMaxConstant"})
    public static final long f94841h = 300000;

    public wnc(C14705a builder) {
        super(builder.f58486b, builder.f58487c, builder.f58488d);
    }

    /* JADX INFO: renamed from: wnc$a */
    public static final class C14705a extends lqi.AbstractC8940a<C14705a, wnc> {
        public C14705a(@efb Class<? extends ListenableWorker> workerClass, long repeatInterval, @efb TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            this.f58487c.setPeriodic(repeatIntervalTimeUnit.toMillis(repeatInterval));
        }

        @Override // p000.lqi.AbstractC8940a
        @efb
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public wnc mo9694a() {
            if (this.f58485a && this.f58487c.f68346j.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (this.f58487c.f68353q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new wnc(this);
        }

        @Override // p000.lqi.AbstractC8940a
        @efb
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C14705a mo9695b() {
            return this;
        }

        @c5e(26)
        public C14705a(@efb Class<? extends ListenableWorker> workerClass, @efb Duration repeatInterval) {
            super(workerClass);
            this.f58487c.setPeriodic(repeatInterval.toMillis());
        }

        public C14705a(@efb Class<? extends ListenableWorker> workerClass, long repeatInterval, @efb TimeUnit repeatIntervalTimeUnit, long flexInterval, @efb TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            this.f58487c.setPeriodic(repeatIntervalTimeUnit.toMillis(repeatInterval), flexIntervalTimeUnit.toMillis(flexInterval));
        }

        @c5e(26)
        public C14705a(@efb Class<? extends ListenableWorker> workerClass, @efb Duration repeatInterval, @efb Duration flexInterval) {
            super(workerClass);
            this.f58487c.setPeriodic(repeatInterval.toMillis(), flexInterval.toMillis());
        }
    }
}
