package p000;

import java.util.Collection;
import java.util.Set;
import p000.n4g;

/* JADX INFO: loaded from: classes7.dex */
@uw7
public final class ij7 {

    /* JADX INFO: renamed from: a */
    public final int f47174a;

    /* JADX INFO: renamed from: b */
    public final long f47175b;

    /* JADX INFO: renamed from: c */
    public final Set<n4g.EnumC9694b> f47176c;

    public ij7(int i, long j, Set<n4g.EnumC9694b> set) {
        this.f47174a = i;
        this.f47175b = j;
        this.f47176c = dy7.copyOf((Collection) set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ij7.class != obj.getClass()) {
            return false;
        }
        ij7 ij7Var = (ij7) obj;
        return this.f47174a == ij7Var.f47174a && this.f47175b == ij7Var.f47175b && okb.equal(this.f47176c, ij7Var.f47176c);
    }

    public int hashCode() {
        return okb.hashCode(Integer.valueOf(this.f47174a), Long.valueOf(this.f47175b), this.f47176c);
    }

    public String toString() {
        return yya.toStringHelper(this).add("maxAttempts", this.f47174a).add("hedgingDelayNanos", this.f47175b).add("nonFatalStatusCodes", this.f47176c).toString();
    }
}
