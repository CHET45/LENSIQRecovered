package p000;

import android.util.Range;

/* JADX INFO: loaded from: classes3.dex */
public class u6i {

    /* JADX INFO: renamed from: e */
    public static final float f86909e = 0.2f;

    /* JADX INFO: renamed from: a */
    public long f86910a;

    /* JADX INFO: renamed from: b */
    public long f86911b;

    /* JADX INFO: renamed from: c */
    public double f86912c;

    /* JADX INFO: renamed from: d */
    public Range<Double> f86913d;

    public u6i(@y46(from = 0.0d, fromInclusive = false) float f) {
        v80.checkArgument(f > 0.0f);
        Range<Double> range = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        this.f86913d = range;
        this.f86912c = ((Double) range.getUpper()).doubleValue();
        this.f86910a = -9223372036854775807L;
        this.f86911b = -9223372036854775807L;
    }

    private double calculateDerivativeFromLastFrame(long j, long j2) {
        long j3 = this.f86910a;
        if (j3 != -9223372036854775807L) {
            if (this.f86911b != -9223372036854775807L && j != j3) {
                return (j2 - r4) / (j - j3);
            }
        }
        return ((Double) this.f86913d.getUpper()).doubleValue();
    }

    private void updateDerivativeWithExponentialMovingAverage(double d) {
        this.f86912c = (this.f86912c * 0.800000011920929d) + (d * 0.20000000298023224d);
    }

    public void onVideoFrameProcessed(long j, long j2) {
        v80.checkArgument(j != -9223372036854775807L);
        v80.checkArgument(j2 != -9223372036854775807L);
        updateDerivativeWithExponentialMovingAverage(((Double) this.f86913d.clamp(Double.valueOf(calculateDerivativeFromLastFrame(j, j2)))).doubleValue());
        this.f86910a = j;
        this.f86911b = j2;
    }

    public long predictEarlyUs(long j) {
        if (this.f86910a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f86911b + ((j - r0) * this.f86912c));
    }

    public void reset() {
        this.f86912c = ((Double) this.f86913d.getUpper()).doubleValue();
        this.f86910a = -9223372036854775807L;
        this.f86911b = -9223372036854775807L;
    }

    public void setPlaybackSpeed(@y46(from = 0.0d, fromInclusive = false) float f) {
        v80.checkArgument(f > 0.0f);
        this.f86913d = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        reset();
    }
}
