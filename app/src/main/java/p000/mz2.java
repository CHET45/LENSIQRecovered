package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class mz2 {

    /* JADX INFO: renamed from: a */
    public static final double f62836a = 1.0d;

    /* JADX INFO: renamed from: b */
    public static final double f62837b = 21.0d;

    /* JADX INFO: renamed from: c */
    public static final double f62838c = 3.0d;

    /* JADX INFO: renamed from: d */
    public static final double f62839d = 4.5d;

    /* JADX INFO: renamed from: e */
    public static final double f62840e = 7.0d;

    /* JADX INFO: renamed from: f */
    public static final double f62841f = 0.04d;

    /* JADX INFO: renamed from: g */
    public static final double f62842g = 0.4d;

    private mz2() {
    }

    public static double darker(double d, double d2) {
        if (d >= 0.0d && d <= 100.0d) {
            double dYFromLstar = xa2.yFromLstar(d);
            double d3 = ((dYFromLstar + 5.0d) / d2) - 5.0d;
            if (d3 >= 0.0d && d3 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(dYFromLstar, d3);
                double dAbs = Math.abs(dRatioOfYs - d2);
                if (dRatioOfYs < d2 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double dLstarFromY = xa2.lstarFromY(d3) - 0.4d;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double darkerUnsafe(double d, double d2) {
        return Math.max(0.0d, darker(d, d2));
    }

    public static double lighter(double d, double d2) {
        if (d >= 0.0d && d <= 100.0d) {
            double dYFromLstar = xa2.yFromLstar(d);
            double d3 = ((dYFromLstar + 5.0d) * d2) - 5.0d;
            if (d3 >= 0.0d && d3 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(d3, dYFromLstar);
                double dAbs = Math.abs(dRatioOfYs - d2);
                if (dRatioOfYs < d2 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double dLstarFromY = xa2.lstarFromY(d3) + 0.4d;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double lighterUnsafe(double d, double d2) {
        double dLighter = lighter(d, d2);
        if (dLighter < 0.0d) {
            return 100.0d;
        }
        return dLighter;
    }

    public static double ratioOfTones(double d, double d2) {
        return ratioOfYs(xa2.yFromLstar(d), xa2.yFromLstar(d2));
    }

    public static double ratioOfYs(double d, double d2) {
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }
}
