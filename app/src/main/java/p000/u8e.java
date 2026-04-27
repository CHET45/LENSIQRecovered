package p000;

import java.util.Collection;
import java.util.Set;
import p000.n4g;

/* JADX INFO: loaded from: classes7.dex */
@uw7
public final class u8e {

    /* JADX INFO: renamed from: a */
    public final int f87070a;

    /* JADX INFO: renamed from: b */
    public final long f87071b;

    /* JADX INFO: renamed from: c */
    public final long f87072c;

    /* JADX INFO: renamed from: d */
    public final double f87073d;

    /* JADX INFO: renamed from: e */
    @eib
    public final Long f87074e;

    /* JADX INFO: renamed from: f */
    public final Set<n4g.EnumC9694b> f87075f;

    public u8e(int i, long j, long j2, double d, @eib Long l, @ofb Set<n4g.EnumC9694b> set) {
        this.f87070a = i;
        this.f87071b = j;
        this.f87072c = j2;
        this.f87073d = d;
        this.f87074e = l;
        this.f87075f = dy7.copyOf((Collection) set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u8e)) {
            return false;
        }
        u8e u8eVar = (u8e) obj;
        return this.f87070a == u8eVar.f87070a && this.f87071b == u8eVar.f87071b && this.f87072c == u8eVar.f87072c && Double.compare(this.f87073d, u8eVar.f87073d) == 0 && okb.equal(this.f87074e, u8eVar.f87074e) && okb.equal(this.f87075f, u8eVar.f87075f);
    }

    public int hashCode() {
        return okb.hashCode(Integer.valueOf(this.f87070a), Long.valueOf(this.f87071b), Long.valueOf(this.f87072c), Double.valueOf(this.f87073d), this.f87074e, this.f87075f);
    }

    public String toString() {
        return yya.toStringHelper(this).add("maxAttempts", this.f87070a).add("initialBackoffNanos", this.f87071b).add("maxBackoffNanos", this.f87072c).add("backoffMultiplier", this.f87073d).add("perAttemptRecvTimeoutNanos", this.f87074e).add("retryableStatusCodes", this.f87075f).toString();
    }
}
