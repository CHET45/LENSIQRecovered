package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class qpg extends Exception {
    private static final long serialVersionUID = 31935685163547539L;

    /* JADX INFO: renamed from: a */
    public final TimeUnit f75086a;

    /* JADX INFO: renamed from: b */
    public final long f75087b;

    public qpg(long j, TimeUnit timeUnit) {
        super(String.format("test timed out after %d %s", Long.valueOf(j), timeUnit.name().toLowerCase()));
        this.f75086a = timeUnit;
        this.f75087b = j;
    }

    public TimeUnit getTimeUnit() {
        return this.f75086a;
    }

    public long getTimeout() {
        return this.f75087b;
    }
}
