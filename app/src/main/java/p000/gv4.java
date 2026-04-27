package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class gv4 {

    /* JADX INFO: renamed from: c */
    public static final String f41437c = "cubic(0.4, 0.0, 0.2, 1)";

    /* JADX INFO: renamed from: d */
    public static final String f41438d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* JADX INFO: renamed from: e */
    public static final String f41439e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* JADX INFO: renamed from: f */
    public static final String f41440f = "cubic(1, 1, 0, 0)";

    /* JADX INFO: renamed from: g */
    public static final String f41441g = "cubic(0.36, 0, 0.66, -0.56)";

    /* JADX INFO: renamed from: h */
    public static final String f41442h = "cubic(0.34, 1.56, 0.64, 1)";

    /* JADX INFO: renamed from: m */
    public static final String f41447m = "anticipate";

    /* JADX INFO: renamed from: n */
    public static final String f41448n = "overshoot";

    /* JADX INFO: renamed from: a */
    public String f41450a = "identity";

    /* JADX INFO: renamed from: b */
    public static gv4 f41436b = new gv4();

    /* JADX INFO: renamed from: k */
    public static final String f41445k = "standard";

    /* JADX INFO: renamed from: j */
    public static final String f41444j = "accelerate";

    /* JADX INFO: renamed from: i */
    public static final String f41443i = "decelerate";

    /* JADX INFO: renamed from: l */
    public static final String f41446l = "linear";

    /* JADX INFO: renamed from: o */
    public static String[] f41449o = {f41445k, f41444j, f41443i, f41446l};

    public static gv4 getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C6589a(str);
        }
        if (str.startsWith("spline")) {
            return new x4g(str);
        }
        if (str.startsWith("Schlick")) {
            return new rqe(str);
        }
        switch (str) {
            case "accelerate":
                return new C6589a(f41438d);
            case "decelerate":
                return new C6589a(f41439e);
            case "anticipate":
                return new C6589a(f41441g);
            case "linear":
                return new C6589a(f41440f);
            case "overshoot":
                return new C6589a(f41442h);
            case "standard":
                return new C6589a(f41437c);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f41449o));
                return f41436b;
        }
    }

    public double get(double d) {
        return d;
    }

    public double getDiff(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f41450a;
    }

    /* JADX INFO: renamed from: gv4$a */
    public static class C6589a extends gv4 {

        /* JADX INFO: renamed from: t */
        public static double f41451t = 0.01d;

        /* JADX INFO: renamed from: u */
        public static double f41452u = 1.0E-4d;

        /* JADX INFO: renamed from: p */
        public double f41453p;

        /* JADX INFO: renamed from: q */
        public double f41454q;

        /* JADX INFO: renamed from: r */
        public double f41455r;

        /* JADX INFO: renamed from: s */
        public double f41456s;

        public C6589a(String str) {
            this.f41450a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f41453p = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.f41454q = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.f41455r = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.f41456s = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        private double getDiffX(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f41453p;
            double d4 = this.f41455r;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        private double getDiffY(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f41454q;
            double d4 = this.f41456s;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        private double getX(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f41453p * d2 * d3 * d) + (this.f41455r * d3 * d * d) + (d * d * d);
        }

        private double getY(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f41454q * d2 * d3 * d) + (this.f41456s * d3 * d * d) + (d * d * d);
        }

        /* JADX INFO: renamed from: a */
        public void m11994a(double d, double d2, double d3, double d4) {
            this.f41453p = d;
            this.f41454q = d2;
            this.f41455r = d3;
            this.f41456s = d4;
        }

        @Override // p000.gv4
        public double get(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f41451t) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double x = getX(d4);
            double d5 = d3 + d2;
            double x2 = getX(d5);
            double y = getY(d4);
            return (((getY(d5) - y) * (d - x)) / (x2 - x)) + y;
        }

        @Override // p000.gv4
        public double getDiff(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f41452u) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (getY(d5) - getY(d4)) / (getX(d5) - getX(d4));
        }

        public C6589a(double d, double d2, double d3, double d4) {
            m11994a(d, d2, d3, d4);
        }
    }
}
