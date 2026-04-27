package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class xo1 {

    /* JADX INFO: renamed from: k */
    public static final double[][] f98757k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: l */
    public static final double[][] f98758l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* JADX INFO: renamed from: a */
    public final double f98759a;

    /* JADX INFO: renamed from: b */
    public final double f98760b;

    /* JADX INFO: renamed from: c */
    public final double f98761c;

    /* JADX INFO: renamed from: d */
    public final double f98762d;

    /* JADX INFO: renamed from: e */
    public final double f98763e;

    /* JADX INFO: renamed from: f */
    public final double f98764f;

    /* JADX INFO: renamed from: g */
    public final double f98765g;

    /* JADX INFO: renamed from: h */
    public final double f98766h;

    /* JADX INFO: renamed from: i */
    public final double f98767i;

    /* JADX INFO: renamed from: j */
    public final double[] f98768j = {0.0d, 0.0d, 0.0d};

    private xo1(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f98759a = d;
        this.f98760b = d2;
        this.f98761c = d3;
        this.f98762d = d4;
        this.f98763e = d5;
        this.f98764f = d6;
        this.f98765g = d7;
        this.f98766h = d8;
        this.f98767i = d9;
    }

    /* JADX INFO: renamed from: b */
    public static xo1 m25351b(int i, sci sciVar) {
        double dLinearized = xa2.linearized((16711680 & i) >> 16);
        double dLinearized2 = xa2.linearized((65280 & i) >> 8);
        double dLinearized3 = xa2.linearized(i & 255);
        return m25353d((0.41233895d * dLinearized) + (0.35762064d * dLinearized2) + (0.18051042d * dLinearized3), (0.2126d * dLinearized) + (0.7152d * dLinearized2) + (0.0722d * dLinearized3), (dLinearized * 0.01932141d) + (dLinearized2 * 0.11916382d) + (dLinearized3 * 0.95034478d), sciVar);
    }

    /* JADX INFO: renamed from: c */
    public static xo1 m25352c(double d, double d2, double d3) {
        return fromJchInViewingConditions(d, d2, d3, sci.f81232k);
    }

    /* JADX INFO: renamed from: d */
    public static xo1 m25353d(double d, double d2, double d3, sci sciVar) {
        double[][] dArr = f98757k;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[0] * d) + (dArr2[1] * d2) + (dArr2[2] * d3);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[0] * d) + (dArr3[1] * d2) + (dArr3[2] * d3);
        double[] dArr4 = dArr[2];
        double d6 = (dArr4[0] * d) + (dArr4[1] * d2) + (dArr4[2] * d3);
        double d7 = sciVar.getRgbD()[0] * d4;
        double d8 = sciVar.getRgbD()[1] * d5;
        double d9 = sciVar.getRgbD()[2] * d6;
        double dPow = Math.pow((sciVar.m21823b() * Math.abs(d7)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((sciVar.m21823b() * Math.abs(d8)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((sciVar.m21823b() * Math.abs(d9)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d7) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d8) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d9) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d10 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d11 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d12 = dSignum2 * 20.0d;
        double d13 = (((dSignum * 20.0d) + d12) + (21.0d * dSignum3)) / 20.0d;
        double d14 = (((dSignum * 40.0d) + d12) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d11, d10));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d15 = degrees;
        double radians = Math.toRadians(d15);
        double dPow4 = Math.pow((d14 * sciVar.getNbb()) / sciVar.getAw(), sciVar.m21822a() * sciVar.m21826e()) * 100.0d;
        double d16 = dPow4 / 100.0d;
        double dM21822a = (4.0d / sciVar.m21822a()) * Math.sqrt(d16) * (sciVar.getAw() + 4.0d) * sciVar.getFlRoot();
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, sciVar.getN()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d15 < 20.14d ? d15 + 360.0d : d15) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * sciVar.m21824c()) * sciVar.m21825d()) * Math.hypot(d10, d11)) / (d13 + 0.305d), 0.9d);
        double dSqrt = Math.sqrt(d16) * dPow5;
        double flRoot = dSqrt * sciVar.getFlRoot();
        double dLog1p = Math.log1p(flRoot * 0.0228d) * 43.859649122807014d;
        return new xo1(d15, dSqrt, dPow4, dM21822a, flRoot, Math.sqrt((dPow5 * sciVar.m21822a()) / (sciVar.getAw() + 4.0d)) * 50.0d, (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d), dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    public static xo1 fromInt(int i) {
        return m25351b(i, sci.f81232k);
    }

    private static xo1 fromJchInViewingConditions(double d, double d2, double d3, sci sciVar) {
        double d4 = d / 100.0d;
        double dM21822a = (4.0d / sciVar.m21822a()) * Math.sqrt(d4) * (sciVar.getAw() + 4.0d) * sciVar.getFlRoot();
        double flRoot = d2 * sciVar.getFlRoot();
        double dSqrt = Math.sqrt(((d2 / Math.sqrt(d4)) * sciVar.m21822a()) / (sciVar.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d3);
        double d5 = (1.7000000000000002d * d) / ((0.007d * d) + 1.0d);
        double dLog1p = 43.859649122807014d * Math.log1p(flRoot * 0.0228d);
        return new xo1(d3, d2, d, dM21822a, flRoot, dSqrt, d5, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public static xo1 fromUcs(double d, double d2, double d3) {
        return fromUcsInViewingConditions(d, d2, d3, sci.f81232k);
    }

    public static xo1 fromUcsInViewingConditions(double d, double d2, double d3, sci sciVar) {
        double dExpm1 = (Math.expm1(Math.hypot(d2, d3) * 0.0228d) / 0.0228d) / sciVar.getFlRoot();
        double dAtan2 = Math.atan2(d3, d2) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(d / (1.0d - ((d - 100.0d) * 0.007d)), dExpm1, dAtan2, sciVar);
    }

    /* JADX INFO: renamed from: a */
    public double m25354a(xo1 xo1Var) {
        double jstar = getJstar() - xo1Var.getJstar();
        double astar = getAstar() - xo1Var.getAstar();
        double bstar = getBstar() - xo1Var.getBstar();
        return Math.pow(Math.sqrt((jstar * jstar) + (astar * astar) + (bstar * bstar)), 0.63d) * 1.41d;
    }

    /* JADX INFO: renamed from: e */
    public int m25355e(sci sciVar) {
        double[] dArrM25356f = m25356f(sciVar, this.f98768j);
        return xa2.argbFromXyz(dArrM25356f[0], dArrM25356f[1], dArrM25356f[2]);
    }

    /* JADX INFO: renamed from: f */
    public double[] m25356f(sci sciVar, double[] dArr) {
        double dPow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, sciVar.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double aw = sciVar.getAw() * Math.pow(getJ() / 100.0d, (1.0d / sciVar.m21822a()) / sciVar.m21826e());
        double dM21824c = dCos * 3846.153846153846d * sciVar.m21824c() * sciVar.m21825d();
        double nbb = aw / sciVar.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d = (((0.305d + nbb) * 23.0d) * dPow) / (((dM21824c * 23.0d) + ((11.0d * dPow) * dCos2)) + ((dPow * 108.0d) * dSin));
        double d2 = dCos2 * d;
        double d3 = d * dSin;
        double d4 = nbb * 460.0d;
        double d5 = (((451.0d * d2) + d4) + (288.0d * d3)) / 1403.0d;
        double d6 = ((d4 - (891.0d * d2)) - (261.0d * d3)) / 1403.0d;
        double d7 = ((d4 - (d2 * 220.0d)) - (d3 * 6300.0d)) / 1403.0d;
        double dSignum = Math.signum(d5) * (100.0d / sciVar.m21823b()) * Math.pow(Math.max(0.0d, (Math.abs(d5) * 27.13d) / (400.0d - Math.abs(d5))), 2.380952380952381d);
        double dSignum2 = Math.signum(d6) * (100.0d / sciVar.m21823b()) * Math.pow(Math.max(0.0d, (Math.abs(d6) * 27.13d) / (400.0d - Math.abs(d6))), 2.380952380952381d);
        double dSignum3 = Math.signum(d7) * (100.0d / sciVar.m21823b()) * Math.pow(Math.max(0.0d, (Math.abs(d7) * 27.13d) / (400.0d - Math.abs(d7))), 2.380952380952381d);
        double d8 = dSignum / sciVar.getRgbD()[0];
        double d9 = dSignum2 / sciVar.getRgbD()[1];
        double d10 = dSignum3 / sciVar.getRgbD()[2];
        double[][] dArr2 = f98758l;
        double[] dArr3 = dArr2[0];
        double d11 = (dArr3[0] * d8) + (dArr3[1] * d9) + (dArr3[2] * d10);
        double[] dArr4 = dArr2[1];
        double d12 = (dArr4[0] * d8) + (dArr4[1] * d9) + (dArr4[2] * d10);
        double[] dArr5 = dArr2[2];
        double d13 = (d8 * dArr5[0]) + (d9 * dArr5[1]) + (d10 * dArr5[2]);
        if (dArr == null) {
            return new double[]{d11, d12, d13};
        }
        dArr[0] = d11;
        dArr[1] = d12;
        dArr[2] = d13;
        return dArr;
    }

    public double getAstar() {
        return this.f98766h;
    }

    public double getBstar() {
        return this.f98767i;
    }

    public double getChroma() {
        return this.f98760b;
    }

    public double getHue() {
        return this.f98759a;
    }

    public double getJ() {
        return this.f98761c;
    }

    public double getJstar() {
        return this.f98765g;
    }

    public double getM() {
        return this.f98763e;
    }

    public double getQ() {
        return this.f98762d;
    }

    public double getS() {
        return this.f98764f;
    }

    public int toInt() {
        return m25355e(sci.f81232k);
    }
}
