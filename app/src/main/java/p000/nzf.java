package p000;

/* JADX INFO: loaded from: classes.dex */
public class nzf implements y4g {

    /* JADX INFO: renamed from: l */
    public static final double f66118l = Double.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public double f66121c;

    /* JADX INFO: renamed from: d */
    public double f66122d;

    /* JADX INFO: renamed from: e */
    public double f66123e;

    /* JADX INFO: renamed from: f */
    public float f66124f;

    /* JADX INFO: renamed from: g */
    public float f66125g;

    /* JADX INFO: renamed from: h */
    public float f66126h;

    /* JADX INFO: renamed from: i */
    public float f66127i;

    /* JADX INFO: renamed from: j */
    public float f66128j;

    /* JADX INFO: renamed from: a */
    public double f66119a = 0.5d;

    /* JADX INFO: renamed from: b */
    public boolean f66120b = false;

    /* JADX INFO: renamed from: k */
    public int f66129k = 0;

    private void compute(double d) {
        double d2 = this.f66121c;
        double d3 = this.f66119a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f66127i)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) iSqrt);
        int i = 0;
        while (i < iSqrt) {
            float f = this.f66125g;
            double d5 = this.f66122d;
            float f2 = this.f66126h;
            double d6 = d2;
            double d7 = ((-d2) * (((double) f) - d5)) - (((double) f2) * d3);
            float f3 = this.f66127i;
            double d8 = d3;
            double d9 = ((double) f2) + (((d7 / ((double) f3)) * d4) / 2.0d);
            double d10 = ((((-((((double) f) + ((d4 * d9) / 2.0d)) - d5)) * d6) - (d9 * d8)) / ((double) f3)) * d4;
            float f4 = (float) (((double) f2) + d10);
            this.f66126h = f4;
            float f5 = (float) (((double) f) + ((((double) f2) + (d10 / 2.0d)) * d4));
            this.f66125g = f5;
            int i2 = this.f66129k;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.f66125g = -f5;
                    this.f66126h = -f4;
                }
                float f6 = this.f66125g;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f66125g = 2.0f - f6;
                    this.f66126h = -this.f66126h;
                }
            }
            i++;
            d2 = d6;
            d3 = d8;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m18232a(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + g1i.f38277c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    @Override // p000.y4g
    public String debug(String str, float f) {
        return null;
    }

    public float getAcceleration() {
        double d = this.f66121c;
        return ((float) (((-d) * (((double) this.f66125g) - this.f66122d)) - (this.f66119a * ((double) this.f66126h)))) / this.f66127i;
    }

    @Override // p000.y4g
    public float getInterpolation(float f) {
        compute(f - this.f66124f);
        this.f66124f = f;
        return this.f66125g;
    }

    @Override // p000.y4g
    public float getVelocity(float f) {
        return this.f66126h;
    }

    @Override // p000.y4g
    public boolean isStopped() {
        double d = ((double) this.f66125g) - this.f66122d;
        double d2 = this.f66121c;
        double d3 = this.f66126h;
        return Math.sqrt((((d3 * d3) * ((double) this.f66127i)) + ((d2 * d) * d)) / d2) <= ((double) this.f66128j);
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f66122d = f2;
        this.f66119a = f6;
        this.f66120b = false;
        this.f66125g = f;
        this.f66123e = f3;
        this.f66121c = f5;
        this.f66127i = f4;
        this.f66128j = f7;
        this.f66129k = i;
        this.f66124f = 0.0f;
    }

    @Override // p000.y4g
    public float getVelocity() {
        return 0.0f;
    }
}
