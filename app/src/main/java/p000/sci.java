package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class sci {

    /* JADX INFO: renamed from: k */
    public static final sci f81232k = defaultWithBackgroundLstar(50.0d);

    /* JADX INFO: renamed from: a */
    public final double f81233a;

    /* JADX INFO: renamed from: b */
    public final double f81234b;

    /* JADX INFO: renamed from: c */
    public final double f81235c;

    /* JADX INFO: renamed from: d */
    public final double f81236d;

    /* JADX INFO: renamed from: e */
    public final double f81237e;

    /* JADX INFO: renamed from: f */
    public final double f81238f;

    /* JADX INFO: renamed from: g */
    public final double[] f81239g;

    /* JADX INFO: renamed from: h */
    public final double f81240h;

    /* JADX INFO: renamed from: i */
    public final double f81241i;

    /* JADX INFO: renamed from: j */
    public final double f81242j;

    private sci(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f81238f = d;
        this.f81233a = d2;
        this.f81234b = d3;
        this.f81235c = d4;
        this.f81236d = d5;
        this.f81237e = d6;
        this.f81239g = dArr;
        this.f81240h = d7;
        this.f81241i = d8;
        this.f81242j = d9;
    }

    public static sci defaultWithBackgroundLstar(double d) {
        return make(xa2.whitePointD65(), (xa2.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    public static sci make(double[] dArr, double d, double d2, double d3, boolean z) {
        double dMax = Math.max(0.1d, d2);
        double[][] dArr2 = xo1.f98757k;
        double d4 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d5 = dArr3[0] * d4;
        double d6 = dArr[1];
        double d7 = d5 + (dArr3[1] * d6);
        double d8 = dArr[2];
        double d9 = d7 + (dArr3[2] * d8);
        double[] dArr4 = dArr2[1];
        double d10 = (dArr4[0] * d4) + (dArr4[1] * d6) + (dArr4[2] * d8);
        double[] dArr5 = dArr2[2];
        double d11 = (d4 * dArr5[0]) + (d6 * dArr5[1]) + (d8 * dArr5[2]);
        double d12 = (d3 / 10.0d) + 0.8d;
        double dLerp = d12 >= 0.9d ? s3a.lerp(0.59d, 0.69d, (d12 - 0.9d) * 10.0d) : s3a.lerp(0.525d, 0.59d, (d12 - 0.8d) * 10.0d);
        double dClampDouble = s3a.clampDouble(0.0d, 1.0d, z ? 1.0d : (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d12);
        double[] dArr6 = {(((100.0d / d9) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d10) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d11) * dClampDouble) + 1.0d) - dClampDouble};
        double d13 = 5.0d * d;
        double d14 = 1.0d / (d13 + 1.0d);
        double d15 = d14 * d14 * d14 * d14;
        double d16 = 1.0d - d15;
        double dCbrt = (d15 * d) + (0.1d * d16 * d16 * Math.cbrt(d13));
        double dYFromLstar = xa2.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d9) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d10) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d11) / 100.0d, 0.42d)};
        double d17 = dArr7[0];
        double d18 = (d17 * 400.0d) / (d17 + 27.13d);
        double d19 = dArr7[1];
        double d20 = (d19 * 400.0d) / (d19 + 27.13d);
        double d21 = dArr7[2];
        double[] dArr8 = {d18, d20, (400.0d * d21) / (d21 + 27.13d)};
        return new sci(dYFromLstar, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * dPow, dPow, dPow, dLerp, d12, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    /* JADX INFO: renamed from: a */
    public double m21822a() {
        return this.f81236d;
    }

    /* JADX INFO: renamed from: b */
    public double m21823b() {
        return this.f81240h;
    }

    /* JADX INFO: renamed from: c */
    public double m21824c() {
        return this.f81237e;
    }

    /* JADX INFO: renamed from: d */
    public double m21825d() {
        return this.f81235c;
    }

    /* JADX INFO: renamed from: e */
    public double m21826e() {
        return this.f81242j;
    }

    public double getAw() {
        return this.f81233a;
    }

    public double getFlRoot() {
        return this.f81241i;
    }

    public double getN() {
        return this.f81238f;
    }

    public double getNbb() {
        return this.f81234b;
    }

    public double[] getRgbD() {
        return this.f81239g;
    }
}
