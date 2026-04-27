package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ki5 implements xp0 {

    /* JADX INFO: renamed from: c */
    public static final double f54191c = 0.9999d;

    /* JADX INFO: renamed from: a */
    public final double f54192a;

    /* JADX INFO: renamed from: b */
    public long f54193b;

    public ki5() {
        this(0.9999d);
    }

    @Override // p000.xp0
    public void addSample(long j, long j2) {
        long j3 = (8000000 * j) / j2;
        if (this.f54193b == Long.MIN_VALUE) {
            this.f54193b = j3;
        } else {
            double dPow = Math.pow(this.f54192a, Math.sqrt(j));
            this.f54193b = (long) ((this.f54193b * dPow) + ((1.0d - dPow) * j3));
        }
    }

    @Override // p000.xp0
    public long getBandwidthEstimate() {
        return this.f54193b;
    }

    @Override // p000.xp0
    public void reset() {
        this.f54193b = Long.MIN_VALUE;
    }

    public ki5(double d) {
        this.f54192a = d;
        this.f54193b = Long.MIN_VALUE;
    }
}
