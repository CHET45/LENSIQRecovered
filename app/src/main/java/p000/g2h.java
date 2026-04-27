package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g2h {

    /* JADX INFO: renamed from: e */
    public static final long f38306e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public static final long f38307f = 9223372036854775806L;

    /* JADX INFO: renamed from: g */
    public static final long f38308g = 8589934592L;

    /* JADX INFO: renamed from: a */
    @xc7("this")
    public long f38309a;

    /* JADX INFO: renamed from: b */
    @xc7("this")
    public long f38310b;

    /* JADX INFO: renamed from: c */
    @xc7("this")
    public long f38311c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal<Long> f38312d = new ThreadLocal<>();

    public g2h(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % 8589934592L;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!isInitialized()) {
                long jLongValue = this.f38309a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) u80.checkNotNull(this.f38312d.get())).longValue();
                }
                this.f38310b = jLongValue - j;
                notifyAll();
            }
            this.f38311c = j;
            return j + this.f38310b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f38311c;
            if (j2 != -9223372036854775807L) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j2);
                long j3 = (4294967296L + jUsToNonWrappedPts) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jUsToNonWrappedPts) < Math.abs(j - jUsToNonWrappedPts)) {
                    j = j4;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.f38309a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        try {
            j = this.f38311c;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.f38310b : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.f38310b;
    }

    public synchronized boolean isInitialized() {
        return this.f38310b != -9223372036854775807L;
    }

    public synchronized void reset(long j) {
        this.f38309a = j;
        this.f38310b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f38311c = -9223372036854775807L;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        try {
            u80.checkState(this.f38309a == 9223372036854775806L);
            if (isInitialized()) {
                return;
            }
            if (z) {
                this.f38312d.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!isInitialized()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        u80.checkState(j3 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j3);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j2 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j3 = j2 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
