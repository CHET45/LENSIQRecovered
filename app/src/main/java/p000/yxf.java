package p000;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public class yxf {

    /* JADX INFO: renamed from: a */
    public long f103283a;

    /* JADX INFO: renamed from: b */
    public long f103284b;

    /* JADX INFO: renamed from: c */
    public long f103285c;

    /* JADX INFO: renamed from: d */
    public long f103286d;

    /* JADX INFO: renamed from: e */
    public long f103287e;

    /* JADX INFO: renamed from: f */
    public long f103288f;

    private static String humanReadableSpeed(long j, boolean z) {
        return q0i.humanReadableBytes(j, z) + "/s";
    }

    /* JADX INFO: renamed from: a */
    public long m26395a() {
        return SystemClock.uptimeMillis();
    }

    public String averageSpeed() {
        return speedFromBegin();
    }

    public synchronized void downloading(long j) {
        try {
            if (this.f103283a == 0) {
                long jM26395a = m26395a();
                this.f103283a = jM26395a;
                this.f103286d = jM26395a;
            }
            this.f103284b += j;
            this.f103288f += j;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void endTask() {
        this.f103287e = m26395a();
    }

    public synchronized void flush() {
        long jM26395a = m26395a();
        long j = this.f103284b;
        long jMax = Math.max(1L, jM26395a - this.f103283a);
        this.f103284b = 0L;
        this.f103283a = jM26395a;
        this.f103285c = (long) ((j / jMax) * 1000.0f);
    }

    public synchronized long getBytesPerSecondAndFlush() {
        long jM26395a = m26395a() - this.f103283a;
        if (jM26395a < 1000) {
            long j = this.f103285c;
            if (j != 0) {
                return j;
            }
        }
        if (this.f103285c == 0 && jM26395a < 500) {
            return 0L;
        }
        return getInstantBytesPerSecondAndFlush();
    }

    public synchronized long getBytesPerSecondFromBegin() {
        long jM26395a;
        try {
            jM26395a = this.f103287e;
            if (jM26395a == 0) {
                jM26395a = m26395a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (long) ((this.f103288f / Math.max(1L, jM26395a - this.f103286d)) * 1000.0f);
    }

    public long getInstantBytesPerSecondAndFlush() {
        flush();
        return this.f103285c;
    }

    public synchronized long getInstantSpeedDurationMillis() {
        return m26395a() - this.f103283a;
    }

    public String getSpeedWithBinaryAndFlush() {
        return humanReadableSpeed(getInstantBytesPerSecondAndFlush(), false);
    }

    public String getSpeedWithSIAndFlush() {
        return humanReadableSpeed(getInstantBytesPerSecondAndFlush(), true);
    }

    public String instantSpeed() {
        return getSpeedWithSIAndFlush();
    }

    public String lastSpeed() {
        return humanReadableSpeed(this.f103285c, true);
    }

    public synchronized void reset() {
        this.f103283a = 0L;
        this.f103284b = 0L;
        this.f103285c = 0L;
        this.f103286d = 0L;
        this.f103287e = 0L;
        this.f103288f = 0L;
    }

    public String speed() {
        return humanReadableSpeed(getBytesPerSecondAndFlush(), true);
    }

    public String speedFromBegin() {
        return humanReadableSpeed(getBytesPerSecondFromBegin(), true);
    }
}
