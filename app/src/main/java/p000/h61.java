package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class h61 {

    /* JADX INFO: renamed from: a */
    @h78(from = 0)
    public final long f42436a;

    /* JADX INFO: renamed from: b */
    @h78(from = 0)
    public final long f42437b;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f42438c;

    public h61(long j, long j2) {
        this(j, j2, 0L);
    }

    public h61 copy() {
        return new h61(this.f42436a, this.f42437b, this.f42438c.get());
    }

    public long getContentLength() {
        return this.f42437b;
    }

    public long getCurrentOffset() {
        return this.f42438c.get();
    }

    public long getRangeLeft() {
        return this.f42436a + this.f42438c.get();
    }

    public long getRangeRight() {
        return (this.f42436a + this.f42437b) - 1;
    }

    public long getStartOffset() {
        return this.f42436a;
    }

    public void increaseCurrentOffset(@h78(from = 1) long j) {
        this.f42438c.addAndGet(j);
    }

    public void resetBlock() {
        this.f42438c.set(0L);
    }

    public String toString() {
        return "[" + this.f42436a + ", " + getRangeRight() + ")-current:" + this.f42438c;
    }

    public h61(long j, long j2, @h78(from = 0) long j3) {
        if (j < 0 || ((j2 < 0 && j2 != -1) || j3 < 0)) {
            throw new IllegalArgumentException();
        }
        this.f42436a = j;
        this.f42437b = j2;
        this.f42438c = new AtomicLong(j3);
    }
}
