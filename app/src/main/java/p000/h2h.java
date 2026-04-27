package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class h2h {

    /* JADX INFO: renamed from: e */
    public static final long f42143e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public static final long f42144f = 9223372036854775806L;

    /* JADX INFO: renamed from: g */
    public static final long f42145g = 8589934592L;

    /* JADX INFO: renamed from: a */
    @xc7("this")
    public long f42146a;

    /* JADX INFO: renamed from: b */
    @xc7("this")
    public long f42147b;

    /* JADX INFO: renamed from: c */
    @xc7("this")
    public long f42148c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal<Long> f42149d = new ThreadLocal<>();

    public h2h(long j) {
        reset(j);
    }

    public static long ptsToUs(long j) {
        return t0i.scaleLargeTimestamp(j, 1000000L, 90000L);
    }

    public static long usToNonWrappedPts(long j) {
        return t0i.scaleLargeTimestamp(j, 90000L, 1000000L);
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
                long jLongValue = this.f42146a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) v80.checkNotNull(this.f42149d.get())).longValue();
                }
                this.f42147b = jLongValue - j;
                notifyAll();
            }
            this.f42148c = j;
            return j + this.f42147b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f42148c;
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

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f42148c;
            if (j2 != -9223372036854775807L) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j2);
                long j3 = jUsToNonWrappedPts / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= jUsToNonWrappedPts) {
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
        j = this.f42146a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        try {
            j = this.f42148c;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.f42147b : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.f42147b;
    }

    public synchronized boolean isInitialized() {
        return this.f42147b != -9223372036854775807L;
    }

    public synchronized void reset(long j) {
        this.f42146a = j;
        this.f42147b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f42148c = -9223372036854775807L;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        try {
            v80.checkState(this.f42146a == 9223372036854775806L);
            if (isInitialized()) {
                return;
            }
            if (z) {
                this.f42149d.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!isInitialized()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        v80.checkState(j3 > 0);
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
