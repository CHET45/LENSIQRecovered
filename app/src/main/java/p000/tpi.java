package p000;

import androidx.work.C1507b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class tpi {

    /* JADX INFO: renamed from: a */
    @efb
    public UUID f85562a;

    /* JADX INFO: renamed from: b */
    @efb
    public EnumC13161a f85563b;

    /* JADX INFO: renamed from: c */
    @efb
    public C1507b f85564c;

    /* JADX INFO: renamed from: d */
    @efb
    public Set<String> f85565d;

    /* JADX INFO: renamed from: e */
    @efb
    public C1507b f85566e;

    /* JADX INFO: renamed from: f */
    public int f85567f;

    /* JADX INFO: renamed from: tpi$a */
    public enum EnumC13161a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public tpi(@efb UUID id, @efb EnumC13161a state, @efb C1507b outputData, @efb List<String> tags, @efb C1507b progress, int runAttemptCount) {
        this.f85562a = id;
        this.f85563b = state;
        this.f85564c = outputData;
        this.f85565d = new HashSet(tags);
        this.f85566e = progress;
        this.f85567f = runAttemptCount;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || tpi.class != o.getClass()) {
            return false;
        }
        tpi tpiVar = (tpi) o;
        if (this.f85567f == tpiVar.f85567f && this.f85562a.equals(tpiVar.f85562a) && this.f85563b == tpiVar.f85563b && this.f85564c.equals(tpiVar.f85564c) && this.f85565d.equals(tpiVar.f85565d)) {
            return this.f85566e.equals(tpiVar.f85566e);
        }
        return false;
    }

    @efb
    public UUID getId() {
        return this.f85562a;
    }

    @efb
    public C1507b getOutputData() {
        return this.f85564c;
    }

    @efb
    public C1507b getProgress() {
        return this.f85566e;
    }

    @h78(from = 0)
    public int getRunAttemptCount() {
        return this.f85567f;
    }

    @efb
    public EnumC13161a getState() {
        return this.f85563b;
    }

    @efb
    public Set<String> getTags() {
        return this.f85565d;
    }

    public int hashCode() {
        return (((((((((this.f85562a.hashCode() * 31) + this.f85563b.hashCode()) * 31) + this.f85564c.hashCode()) * 31) + this.f85565d.hashCode()) * 31) + this.f85566e.hashCode()) * 31) + this.f85567f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f85562a + "', mState=" + this.f85563b + ", mOutputData=" + this.f85564c + ", mTags=" + this.f85565d + ", mProgress=" + this.f85566e + '}';
    }
}
