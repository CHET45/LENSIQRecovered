package p000;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.sl0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class yoe {

    /* JADX INFO: renamed from: a */
    public static final long f102433a = 86400000;

    /* JADX INFO: renamed from: b */
    public static final long f102434b = 30000;

    /* JADX INFO: renamed from: c */
    public static final long f102435c = 1000;

    /* JADX INFO: renamed from: d */
    public static final long f102436d = 10000;

    /* JADX INFO: renamed from: yoe$a */
    public static class C15747a {

        /* JADX INFO: renamed from: a */
        public g52 f102437a;

        /* JADX INFO: renamed from: b */
        public Map<acd, AbstractC15748b> f102438b = new HashMap();

        public C15747a addConfig(acd acdVar, AbstractC15748b abstractC15748b) {
            this.f102438b.put(acdVar, abstractC15748b);
            return this;
        }

        public yoe build() {
            if (this.f102437a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f102438b.keySet().size() < acd.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<acd, AbstractC15748b> map = this.f102438b;
            this.f102438b = new HashMap();
            return yoe.m26260a(this.f102437a, map);
        }

        public C15747a setClock(g52 g52Var) {
            this.f102437a = g52Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: yoe$b */
    @AutoValue
    public static abstract class AbstractC15748b {

        /* JADX INFO: renamed from: yoe$b$a */
        @AutoValue.Builder
        public static abstract class a {
            public abstract AbstractC15748b build();

            public abstract a setDelta(long j);

            public abstract a setFlags(Set<EnumC15749c> set);

            public abstract a setMaxAllowedDelay(long j);
        }

        public static a builder() {
            return new sl0.C12642b().setFlags(Collections.emptySet());
        }

        /* JADX INFO: renamed from: a */
        public abstract long mo22086a();

        /* JADX INFO: renamed from: b */
        public abstract Set<EnumC15749c> mo22087b();

        /* JADX INFO: renamed from: c */
        public abstract long mo22088c();
    }

    /* JADX INFO: renamed from: yoe$c */
    public enum EnumC15749c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* JADX INFO: renamed from: a */
    public static yoe m26260a(g52 g52Var, Map<acd, AbstractC15748b> map) {
        return new rl0(g52Var, map);
    }

    private long adjustedExponentialBackoff(int i, long j) {
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * ((long) r7))));
    }

    public static C15747a builder() {
        return new C15747a();
    }

    public static yoe getDefault(g52 g52Var) {
        return builder().addConfig(acd.DEFAULT, AbstractC15748b.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build()).addConfig(acd.HIGHEST, AbstractC15748b.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(acd.VERY_LOW, AbstractC15748b.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(immutableSetOf(EnumC15749c.DEVICE_IDLE)).build()).setClock(g52Var).build();
    }

    private static <T> Set<T> immutableSetOf(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @c5e(api = 21)
    private void populateFlags(JobInfo.Builder builder, Set<EnumC15749c> set) {
        if (set.contains(EnumC15749c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC15749c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC15749c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract g52 mo21416b();

    /* JADX INFO: renamed from: c */
    public abstract Map<acd, AbstractC15748b> mo21417c();

    @c5e(api = 21)
    public JobInfo.Builder configureJob(JobInfo.Builder builder, acd acdVar, long j, int i) {
        builder.setMinimumLatency(getScheduleDelay(acdVar, j, i));
        populateFlags(builder, mo21417c().get(acdVar).mo22087b());
        return builder;
    }

    public Set<EnumC15749c> getFlags(acd acdVar) {
        return mo21417c().get(acdVar).mo22087b();
    }

    public long getScheduleDelay(acd acdVar, long j, int i) {
        long time = j - mo21416b().getTime();
        AbstractC15748b abstractC15748b = mo21417c().get(acdVar);
        return Math.min(Math.max(adjustedExponentialBackoff(i, abstractC15748b.mo22086a()), time), abstractC15748b.mo22088c());
    }
}
