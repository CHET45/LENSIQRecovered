package p000;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class ap7 {

    /* JADX INFO: renamed from: a */
    public int f11519a;

    /* JADX INFO: renamed from: b */
    public C1545a[][] f11520b;

    /* JADX INFO: renamed from: c */
    public int f11521c;

    /* JADX INFO: renamed from: d */
    public double[] f11522d;

    /* JADX INFO: renamed from: e */
    public double f11523e;

    /* JADX INFO: renamed from: f */
    public double[][] f11524f;

    /* JADX INFO: renamed from: ap7$a */
    public static class C1545a {

        /* JADX INFO: renamed from: a */
        public double f11525a;

        /* JADX INFO: renamed from: b */
        public double f11526b;

        /* JADX INFO: renamed from: c */
        public double f11527c;

        /* JADX INFO: renamed from: d */
        public double f11528d;

        public C1545a(double d, double d2, double d3, double d4) {
            this.f11525a = d;
            this.f11526b = d2;
            this.f11527c = d3;
            this.f11528d = d4;
        }

        public double eval(double d) {
            return (((((this.f11528d * d) + this.f11527c) * d) + this.f11526b) * d) + this.f11525a;
        }

        public double vel(double d) {
            return (((this.f11528d * 3.0d * d) + (this.f11527c * 2.0d)) * d) + this.f11526b;
        }
    }

    public ap7(double[][] dArr) {
        setup(dArr);
    }

    /* JADX INFO: renamed from: a */
    public static C1545a[] m2519a(int i, double[] dArr) {
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        double[] dArr4 = new double[i];
        int i2 = i - 1;
        int i3 = 0;
        dArr2[0] = 0.5d;
        int i4 = 1;
        for (int i5 = 1; i5 < i2; i5++) {
            dArr2[i5] = 1.0d / (4.0d - dArr2[i5 - 1]);
        }
        int i6 = i - 2;
        dArr2[i2] = 1.0d / (2.0d - dArr2[i6]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i4 < i2) {
            int i7 = i4 + 1;
            int i8 = i4 - 1;
            dArr3[i4] = (((dArr[i7] - dArr[i8]) * 3.0d) - dArr3[i8]) * dArr2[i4];
            i4 = i7;
        }
        double d = (((dArr[i2] - dArr[i6]) * 3.0d) - dArr3[i6]) * dArr2[i2];
        dArr3[i2] = d;
        dArr4[i2] = d;
        while (i6 >= 0) {
            dArr4[i6] = dArr3[i6] - (dArr2[i6] * dArr4[i6 + 1]);
            i6--;
        }
        C1545a[] c1545aArr = new C1545a[i2];
        while (i3 < i2) {
            double d2 = dArr[i3];
            double d3 = dArr4[i3];
            int i9 = i3 + 1;
            double d4 = dArr[i9];
            double d5 = dArr4[i9];
            c1545aArr[i3] = new C1545a((float) d2, d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
            i3 = i9;
        }
        return c1545aArr;
    }

    public double approxLength(C1545a[] c1545aArr) {
        int i;
        int length = c1545aArr.length;
        double[] dArr = new double[c1545aArr.length];
        double d = 0.0d;
        double d2 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d3 = 0.0d;
            while (i < c1545aArr.length) {
                double d4 = dArr[i];
                double dEval = c1545aArr[i].eval(d2);
                dArr[i] = dEval;
                double d5 = d4 - dEval;
                d3 += d5 * d5;
                i++;
            }
            if (d2 > 0.0d) {
                dSqrt += Math.sqrt(d3);
            }
            d2 += 0.1d;
        }
        while (i < c1545aArr.length) {
            double d6 = dArr[i];
            double dEval2 = c1545aArr[i].eval(1.0d);
            dArr[i] = dEval2;
            double d7 = d6 - dEval2;
            d += d7 * d7;
            i++;
        }
        return dSqrt + Math.sqrt(d);
    }

    public void getPos(double d, double[] dArr) {
        double d2 = d * this.f11523e;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f11522d;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f11520b[i2][i].eval(d2 / this.f11522d[i]);
        }
    }

    public void getVelocity(double d, double[] dArr) {
        double d2 = d * this.f11523e;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f11522d;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f11520b[i2][i].vel(d2 / this.f11522d[i]);
        }
    }

    public void setup(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.f11521c = length;
        int length2 = dArr.length;
        this.f11519a = length2;
        this.f11524f = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f11520b = new C1545a[this.f11521c][];
        for (int i2 = 0; i2 < this.f11521c; i2++) {
            for (int i3 = 0; i3 < this.f11519a; i3++) {
                this.f11524f[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.f11521c;
            if (i4 >= i) {
                break;
            }
            C1545a[][] c1545aArr = this.f11520b;
            double[] dArr2 = this.f11524f[i4];
            c1545aArr[i4] = m2519a(dArr2.length, dArr2);
            i4++;
        }
        this.f11522d = new double[this.f11519a - 1];
        this.f11523e = 0.0d;
        C1545a[] c1545aArr2 = new C1545a[i];
        for (int i5 = 0; i5 < this.f11522d.length; i5++) {
            for (int i6 = 0; i6 < this.f11521c; i6++) {
                c1545aArr2[i6] = this.f11520b[i6][i5];
            }
            double d = this.f11523e;
            double[] dArr3 = this.f11522d;
            double dApproxLength = approxLength(c1545aArr2);
            dArr3[i5] = dApproxLength;
            this.f11523e = d + dApproxLength;
        }
    }

    public ap7() {
    }

    public void getPos(double d, float[] fArr) {
        double d2 = d * this.f11523e;
        int i = 0;
        while (true) {
            double[] dArr = this.f11522d;
            if (i >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.f11520b[i2][i].eval(d2 / this.f11522d[i]);
        }
    }

    public double getPos(double d, int i) {
        double[] dArr;
        double d2 = d * this.f11523e;
        int i2 = 0;
        while (true) {
            dArr = this.f11522d;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i2];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i2++;
        }
        return this.f11520b[i][i2].eval(d2 / dArr[i2]);
    }
}
