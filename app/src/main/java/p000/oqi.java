package p000;

import androidx.work.C1507b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p000.p7e;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
@j35(indices = {@tz7({"schedule_requested_at"}), @tz7({"period_start_time"})})
@p7e({p7e.EnumC10826a.f69935b})
public final class oqi {

    /* JADX INFO: renamed from: t */
    public static final long f68335t = -1;

    /* JADX INFO: renamed from: a */
    @dbd
    @efb
    @ab2(name = "id")
    public String f68337a;

    /* JADX INFO: renamed from: b */
    @efb
    @ab2(name = "state")
    public tpi.EnumC13161a f68338b;

    /* JADX INFO: renamed from: c */
    @efb
    @ab2(name = "worker_class_name")
    public String f68339c;

    /* JADX INFO: renamed from: d */
    @ab2(name = "input_merger_class_name")
    public String f68340d;

    /* JADX INFO: renamed from: e */
    @efb
    @ab2(name = "input")
    public C1507b f68341e;

    /* JADX INFO: renamed from: f */
    @efb
    @ab2(name = "output")
    public C1507b f68342f;

    /* JADX INFO: renamed from: g */
    @ab2(name = "initial_delay")
    public long f68343g;

    /* JADX INFO: renamed from: h */
    @ab2(name = "interval_duration")
    public long f68344h;

    /* JADX INFO: renamed from: i */
    @ab2(name = "flex_duration")
    public long f68345i;

    /* JADX INFO: renamed from: j */
    @efb
    @oy4
    public lu2 f68346j;

    /* JADX INFO: renamed from: k */
    @h78(from = 0)
    @ab2(name = "run_attempt_count")
    public int f68347k;

    /* JADX INFO: renamed from: l */
    @efb
    @ab2(name = "backoff_policy")
    public oo0 f68348l;

    /* JADX INFO: renamed from: m */
    @ab2(name = "backoff_delay_duration")
    public long f68349m;

    /* JADX INFO: renamed from: n */
    @ab2(name = "period_start_time")
    public long f68350n;

    /* JADX INFO: renamed from: o */
    @ab2(name = "minimum_retention_duration")
    public long f68351o;

    /* JADX INFO: renamed from: p */
    @ab2(name = "schedule_requested_at")
    public long f68352p;

    /* JADX INFO: renamed from: q */
    @ab2(name = "run_in_foreground")
    public boolean f68353q;

    /* JADX INFO: renamed from: r */
    @efb
    @ab2(name = "out_of_quota_policy")
    public h8c f68354r;

    /* JADX INFO: renamed from: s */
    public static final String f68334s = cj9.tagWithPrefix("WorkSpec");

    /* JADX INFO: renamed from: u */
    public static final f07<List<C10507c>, List<tpi>> f68336u = new C10505a();

    /* JADX INFO: renamed from: oqi$a */
    public class C10505a implements f07<List<C10507c>, List<tpi>> {
        @Override // p000.f07
        public List<tpi> apply(List<C10507c> input) {
            if (input == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(input.size());
            Iterator<C10507c> it = input.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toWorkInfo());
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: oqi$b */
    public static class C10506b {

        /* JADX INFO: renamed from: a */
        @ab2(name = "id")
        public String f68355a;

        /* JADX INFO: renamed from: b */
        @ab2(name = "state")
        public tpi.EnumC13161a f68356b;

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof C10506b)) {
                return false;
            }
            C10506b c10506b = (C10506b) o;
            if (this.f68356b != c10506b.f68356b) {
                return false;
            }
            return this.f68355a.equals(c10506b.f68355a);
        }

        public int hashCode() {
            return (this.f68355a.hashCode() * 31) + this.f68356b.hashCode();
        }
    }

    /* JADX INFO: renamed from: oqi$c */
    public static class C10507c {

        /* JADX INFO: renamed from: a */
        @ab2(name = "id")
        public String f68357a;

        /* JADX INFO: renamed from: b */
        @ab2(name = "state")
        public tpi.EnumC13161a f68358b;

        /* JADX INFO: renamed from: c */
        @ab2(name = "output")
        public C1507b f68359c;

        /* JADX INFO: renamed from: d */
        @ab2(name = "run_attempt_count")
        public int f68360d;

        /* JADX INFO: renamed from: e */
        @txd(entity = rqi.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        public List<String> f68361e;

        /* JADX INFO: renamed from: f */
        @txd(entity = eqi.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        public List<C1507b> f68362f;

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof C10507c)) {
                return false;
            }
            C10507c c10507c = (C10507c) o;
            if (this.f68360d != c10507c.f68360d) {
                return false;
            }
            String str = this.f68357a;
            if (str == null ? c10507c.f68357a != null : !str.equals(c10507c.f68357a)) {
                return false;
            }
            if (this.f68358b != c10507c.f68358b) {
                return false;
            }
            C1507b c1507b = this.f68359c;
            if (c1507b == null ? c10507c.f68359c != null : !c1507b.equals(c10507c.f68359c)) {
                return false;
            }
            List<String> list = this.f68361e;
            if (list == null ? c10507c.f68361e != null : !list.equals(c10507c.f68361e)) {
                return false;
            }
            List<C1507b> list2 = this.f68362f;
            List<C1507b> list3 = c10507c.f68362f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f68357a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            tpi.EnumC13161a enumC13161a = this.f68358b;
            int iHashCode2 = (iHashCode + (enumC13161a != null ? enumC13161a.hashCode() : 0)) * 31;
            C1507b c1507b = this.f68359c;
            int iHashCode3 = (((iHashCode2 + (c1507b != null ? c1507b.hashCode() : 0)) * 31) + this.f68360d) * 31;
            List<String> list = this.f68361e;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<C1507b> list2 = this.f68362f;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        @efb
        public tpi toWorkInfo() {
            List<C1507b> list = this.f68362f;
            return new tpi(UUID.fromString(this.f68357a), this.f68358b, this.f68359c, this.f68361e, (list == null || list.isEmpty()) ? C1507b.f11240c : this.f68362f.get(0), this.f68360d);
        }
    }

    public oqi(@efb String id, @efb String workerClassName) {
        this.f68338b = tpi.EnumC13161a.ENQUEUED;
        C1507b c1507b = C1507b.f11240c;
        this.f68341e = c1507b;
        this.f68342f = c1507b;
        this.f68346j = lu2.f58744i;
        this.f68348l = oo0.EXPONENTIAL;
        this.f68349m = 30000L;
        this.f68352p = -1L;
        this.f68354r = h8c.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f68337a = id;
        this.f68339c = workerClassName;
    }

    public long calculateNextRunTime() {
        if (isBackedOff()) {
            return this.f68350n + Math.min(lqi.f58480e, this.f68348l == oo0.LINEAR ? this.f68349m * ((long) this.f68347k) : (long) Math.scalb(this.f68349m, this.f68347k - 1));
        }
        if (!isPeriodic()) {
            long jCurrentTimeMillis = this.f68350n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f68343g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.f68350n;
        long j2 = j == 0 ? jCurrentTimeMillis2 + this.f68343g : j;
        long j3 = this.f68345i;
        long j4 = this.f68344h;
        if (j3 != j4) {
            return j2 + j4 + (j == 0 ? j3 * (-1) : 0L);
        }
        return j2 + (j != 0 ? j4 : 0L);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || oqi.class != o.getClass()) {
            return false;
        }
        oqi oqiVar = (oqi) o;
        if (this.f68343g != oqiVar.f68343g || this.f68344h != oqiVar.f68344h || this.f68345i != oqiVar.f68345i || this.f68347k != oqiVar.f68347k || this.f68349m != oqiVar.f68349m || this.f68350n != oqiVar.f68350n || this.f68351o != oqiVar.f68351o || this.f68352p != oqiVar.f68352p || this.f68353q != oqiVar.f68353q || !this.f68337a.equals(oqiVar.f68337a) || this.f68338b != oqiVar.f68338b || !this.f68339c.equals(oqiVar.f68339c)) {
            return false;
        }
        String str = this.f68340d;
        if (str == null ? oqiVar.f68340d == null : str.equals(oqiVar.f68340d)) {
            return this.f68341e.equals(oqiVar.f68341e) && this.f68342f.equals(oqiVar.f68342f) && this.f68346j.equals(oqiVar.f68346j) && this.f68348l == oqiVar.f68348l && this.f68354r == oqiVar.f68354r;
        }
        return false;
    }

    public boolean hasConstraints() {
        return !lu2.f58744i.equals(this.f68346j);
    }

    public int hashCode() {
        int iHashCode = ((((this.f68337a.hashCode() * 31) + this.f68338b.hashCode()) * 31) + this.f68339c.hashCode()) * 31;
        String str = this.f68340d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f68341e.hashCode()) * 31) + this.f68342f.hashCode()) * 31;
        long j = this.f68343g;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f68344h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f68345i;
        int iHashCode3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f68346j.hashCode()) * 31) + this.f68347k) * 31) + this.f68348l.hashCode()) * 31;
        long j4 = this.f68349m;
        int i3 = (iHashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f68350n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f68351o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f68352p;
        return ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f68353q ? 1 : 0)) * 31) + this.f68354r.hashCode();
    }

    public boolean isBackedOff() {
        return this.f68338b == tpi.EnumC13161a.ENQUEUED && this.f68347k > 0;
    }

    public boolean isPeriodic() {
        return this.f68344h != 0;
    }

    public void setBackoffDelayDuration(long backoffDelayDuration) {
        if (backoffDelayDuration > lqi.f58480e) {
            cj9.get().warning(f68334s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            backoffDelayDuration = 18000000;
        }
        if (backoffDelayDuration < 10000) {
            cj9.get().warning(f68334s, "Backoff delay duration less than minimum value", new Throwable[0]);
            backoffDelayDuration = 10000;
        }
        this.f68349m = backoffDelayDuration;
    }

    public void setPeriodic(long intervalDuration) {
        if (intervalDuration < wnc.f94840g) {
            cj9.get().warning(f68334s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(wnc.f94840g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        setPeriodic(intervalDuration, intervalDuration);
    }

    @efb
    public String toString() {
        return "{WorkSpec: " + this.f68337a + "}";
    }

    public void setPeriodic(long intervalDuration, long flexDuration) {
        if (intervalDuration < wnc.f94840g) {
            cj9.get().warning(f68334s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(wnc.f94840g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        if (flexDuration < 300000) {
            cj9.get().warning(f68334s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            flexDuration = 300000;
        }
        if (flexDuration > intervalDuration) {
            cj9.get().warning(f68334s, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(intervalDuration)), new Throwable[0]);
            flexDuration = intervalDuration;
        }
        this.f68344h = intervalDuration;
        this.f68345i = flexDuration;
    }

    public oqi(@efb oqi other) {
        this.f68338b = tpi.EnumC13161a.ENQUEUED;
        C1507b c1507b = C1507b.f11240c;
        this.f68341e = c1507b;
        this.f68342f = c1507b;
        this.f68346j = lu2.f58744i;
        this.f68348l = oo0.EXPONENTIAL;
        this.f68349m = 30000L;
        this.f68352p = -1L;
        this.f68354r = h8c.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f68337a = other.f68337a;
        this.f68339c = other.f68339c;
        this.f68338b = other.f68338b;
        this.f68340d = other.f68340d;
        this.f68341e = new C1507b(other.f68341e);
        this.f68342f = new C1507b(other.f68342f);
        this.f68343g = other.f68343g;
        this.f68344h = other.f68344h;
        this.f68345i = other.f68345i;
        this.f68346j = new lu2(other.f68346j);
        this.f68347k = other.f68347k;
        this.f68348l = other.f68348l;
        this.f68349m = other.f68349m;
        this.f68350n = other.f68350n;
        this.f68351o = other.f68351o;
        this.f68352p = other.f68352p;
        this.f68353q = other.f68353q;
        this.f68354r = other.f68354r;
    }
}
