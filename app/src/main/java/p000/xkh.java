package p000;

/* JADX INFO: loaded from: classes.dex */
public class xkh {

    /* JADX INFO: renamed from: d */
    public static xkh f98313d = null;

    /* JADX INFO: renamed from: e */
    public static final int f98314e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f98315f = 1;

    /* JADX INFO: renamed from: g */
    public static final float f98316g = 0.017453292f;

    /* JADX INFO: renamed from: h */
    public static final float f98317h = 9.0E-4f;

    /* JADX INFO: renamed from: i */
    public static final float f98318i = -0.10471976f;

    /* JADX INFO: renamed from: j */
    public static final float f98319j = 0.0334196f;

    /* JADX INFO: renamed from: k */
    public static final float f98320k = 3.49066E-4f;

    /* JADX INFO: renamed from: l */
    public static final float f98321l = 5.236E-6f;

    /* JADX INFO: renamed from: m */
    public static final float f98322m = 0.4092797f;

    /* JADX INFO: renamed from: n */
    public static final long f98323n = 946728000000L;

    /* JADX INFO: renamed from: a */
    public long f98324a;

    /* JADX INFO: renamed from: b */
    public long f98325b;

    /* JADX INFO: renamed from: c */
    public int f98326c;

    /* JADX INFO: renamed from: a */
    public static xkh m25262a() {
        if (f98313d == null) {
            f98313d = new xkh();
        }
        return f98313d;
    }

    public void calculateTwilight(long j, double d, double d2) {
        double d3 = (0.01720197f * ((j - f98323n) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r3 - 9.0E-4f)) - r7) + 9.0E-4f)) + ((-d2) / 360.0d) + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(dAsin))) / (Math.cos(d4) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f98326c = 1;
            this.f98324a = -1L;
            this.f98325b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f98326c = 0;
                this.f98324a = -1L;
                this.f98325b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f98324a = Math.round((dRound + dAcos) * 8.64E7d) + f98323n;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + f98323n;
            this.f98325b = jRound;
            if (jRound >= j || this.f98324a <= j) {
                this.f98326c = 1;
            } else {
                this.f98326c = 0;
            }
        }
    }
}
