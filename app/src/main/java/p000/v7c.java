package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class v7c {

    /* JADX INFO: renamed from: i */
    public static String f90249i = "Oscillator";

    /* JADX INFO: renamed from: j */
    public static final int f90250j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f90251k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f90252l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f90253m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f90254n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f90255o = 5;

    /* JADX INFO: renamed from: p */
    public static final int f90256p = 6;

    /* JADX INFO: renamed from: q */
    public static final int f90257q = 7;

    /* JADX INFO: renamed from: c */
    public double[] f90260c;

    /* JADX INFO: renamed from: d */
    public String f90261d;

    /* JADX INFO: renamed from: e */
    public qya f90262e;

    /* JADX INFO: renamed from: f */
    public int f90263f;

    /* JADX INFO: renamed from: a */
    public float[] f90258a = new float[0];

    /* JADX INFO: renamed from: b */
    public double[] f90259b = new double[0];

    /* JADX INFO: renamed from: g */
    public double f90264g = 6.283185307179586d;

    /* JADX INFO: renamed from: h */
    public boolean f90265h = false;

    /* JADX INFO: renamed from: a */
    public double m23845a(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f90259b, d);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f90258a;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f90259b;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return (d * d4) + (((double) f2) - (d4 * d3));
    }

    public void addPoint(double d, float f) {
        int length = this.f90258a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f90259b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f90259b = Arrays.copyOf(this.f90259b, length);
        this.f90258a = Arrays.copyOf(this.f90258a, length);
        this.f90260c = new double[length];
        double[] dArr = this.f90259b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f90259b[iBinarySearch] = d;
        this.f90258a[iBinarySearch] = f;
        this.f90265h = false;
    }

    /* JADX INFO: renamed from: b */
    public double m23846b(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f90259b, d);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f90258a;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f90259b;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return this.f90260c[i3] + ((((double) f2) - (d4 * d3)) * (d - d3)) + ((d4 * ((d * d) - (d3 * d3))) / 2.0d);
    }

    public double getSlope(double d, double d2, double d3) {
        double dM23846b = d2 + m23846b(d);
        double dM23845a = m23845a(d) + d3;
        switch (this.f90263f) {
            case 1:
                return 0.0d;
            case 2:
                return dM23845a * 4.0d * Math.signum((((dM23846b * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dM23845a * 2.0d;
            case 4:
                return (-dM23845a) * 2.0d;
            case 5:
                double d4 = this.f90264g;
                return (-d4) * dM23845a * Math.sin(d4 * dM23846b);
            case 6:
                return dM23845a * 4.0d * ((((dM23846b * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f90262e.getSlope(dM23846b % 1.0d, 0);
            default:
                double d5 = this.f90264g;
                return dM23845a * d5 * Math.cos(d5 * dM23846b);
        }
    }

    public double getValue(double d, double d2) {
        double dAbs;
        double dM23846b = m23846b(d) + d2;
        switch (this.f90263f) {
            case 1:
                return Math.signum(0.5d - (dM23846b % 1.0d));
            case 2:
                dAbs = Math.abs((((dM23846b * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dM23846b * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dM23846b * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f90264g * (d2 + dM23846b));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dM23846b * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f90262e.getPos(dM23846b % 1.0d, 0);
            default:
                return Math.sin(this.f90264g * dM23846b);
        }
        return 1.0d - dAbs;
    }

    public void normalize() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f90258a;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.f90258a;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            float f = (fArr2[i3] + fArr2[i2]) / 2.0f;
            double[] dArr = this.f90259b;
            d2 += (dArr[i2] - dArr[i3]) * ((double) f);
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f90258a;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = (float) (((double) fArr3[i4]) * (d / d2));
            i4++;
        }
        this.f90260c[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.f90258a;
            if (i5 >= fArr4.length) {
                this.f90265h = true;
                return;
            }
            int i6 = i5 - 1;
            float f2 = (fArr4[i6] + fArr4[i5]) / 2.0f;
            double[] dArr2 = this.f90259b;
            double d3 = dArr2[i5] - dArr2[i6];
            double[] dArr3 = this.f90260c;
            dArr3[i5] = dArr3[i6] + (d3 * ((double) f2));
            i5++;
        }
    }

    public void setType(int i, String str) {
        this.f90263f = i;
        this.f90261d = str;
        if (str != null) {
            this.f90262e = qya.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f90259b) + " period=" + Arrays.toString(this.f90258a);
    }
}
