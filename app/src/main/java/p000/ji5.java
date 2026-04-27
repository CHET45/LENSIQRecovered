package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ji5 implements wp0 {

    /* JADX INFO: renamed from: c */
    public static final double f50645c = 0.9999d;

    /* JADX INFO: renamed from: a */
    public final double f50646a;

    /* JADX INFO: renamed from: b */
    public long f50647b;

    public ji5() {
        this(0.9999d);
    }

    @Override // p000.wp0
    public void addSample(long j, long j2) {
        long j3 = (8000000 * j) / j2;
        if (this.f50647b == Long.MIN_VALUE) {
            this.f50647b = j3;
        } else {
            double dPow = Math.pow(this.f50646a, Math.sqrt(j));
            this.f50647b = (long) ((this.f50647b * dPow) + ((1.0d - dPow) * j3));
        }
    }

    @Override // p000.wp0
    public long getBandwidthEstimate() {
        return this.f50647b;
    }

    @Override // p000.wp0
    public void reset() {
        this.f50647b = Long.MIN_VALUE;
    }

    public ji5(double d) {
        this.f50646a = d;
        this.f50647b = Long.MIN_VALUE;
    }
}
