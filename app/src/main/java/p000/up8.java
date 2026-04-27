package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class up8 {

    /* JADX INFO: renamed from: h */
    @gdi
    public static final int f88713h = 2;

    /* JADX INFO: renamed from: i */
    @gdi
    public static final long f88714i = TimeUnit.HOURS.toNanos(2);

    /* JADX INFO: renamed from: a */
    public final boolean f88715a;

    /* JADX INFO: renamed from: b */
    public final long f88716b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13641b f88717c;

    /* JADX INFO: renamed from: d */
    public final long f88718d;

    /* JADX INFO: renamed from: e */
    public long f88719e;

    /* JADX INFO: renamed from: f */
    public boolean f88720f;

    /* JADX INFO: renamed from: g */
    public int f88721g;

    /* JADX INFO: renamed from: up8$a */
    @gdi
    public static class C13640a implements InterfaceC13641b {

        /* JADX INFO: renamed from: a */
        public static final C13640a f88722a = new C13640a();

        @Override // p000.up8.InterfaceC13641b
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: up8$b */
    @gdi
    public interface InterfaceC13641b {
        long nanoTime();
    }

    public up8(boolean z, long j, TimeUnit timeUnit) {
        this(z, j, timeUnit, C13640a.f88722a);
    }

    private static long compareNanos(long j, long j2) {
        return j - j2;
    }

    public void onTransportActive() {
        this.f88720f = true;
    }

    public void onTransportIdle() {
        this.f88720f = false;
    }

    @dy1
    public boolean pingAcceptable() {
        long jNanoTime = this.f88717c.nanoTime();
        if (this.f88720f || this.f88715a ? compareNanos(this.f88719e + this.f88716b, jNanoTime) <= 0 : compareNanos(this.f88719e + f88714i, jNanoTime) <= 0) {
            this.f88719e = jNanoTime;
            return true;
        }
        int i = this.f88721g + 1;
        this.f88721g = i;
        return i <= 2;
    }

    public void resetCounters() {
        this.f88719e = this.f88718d;
        this.f88721g = 0;
    }

    @gdi
    public up8(boolean z, long j, TimeUnit timeUnit, InterfaceC13641b interfaceC13641b) {
        v7d.checkArgument(j >= 0, "minTime must be non-negative: %s", j);
        this.f88715a = z;
        this.f88716b = Math.min(timeUnit.toNanos(j), f88714i);
        this.f88717c = interfaceC13641b;
        long jNanoTime = interfaceC13641b.nanoTime();
        this.f88718d = jNanoTime;
        this.f88719e = jNanoTime;
    }
}
