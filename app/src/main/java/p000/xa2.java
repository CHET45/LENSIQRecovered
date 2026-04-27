package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class xa2 {

    /* JADX INFO: renamed from: a */
    public static final double[][] f97341a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: b */
    public static final double[][] f97342b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: c */
    public static final double[] f97343c = {95.047d, 100.0d, 108.883d};

    private xa2() {
    }

    /* JADX INFO: renamed from: a */
    public static double m25070a(double d) {
        return d > 0.008856451679035631d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static int alphaFromArgb(int i) {
        return (i >> 24) & 255;
    }

    public static int argbFromLab(double d, double d2, double d3) {
        double[] dArr = f97343c;
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = d4 - (d3 / 200.0d);
        return argbFromXyz(m25071b((d2 / 500.0d) + d4) * dArr[0], m25071b(d4) * dArr[1], m25071b(d5) * dArr[2]);
    }

    public static int argbFromLinrgb(double[] dArr) {
        return argbFromRgb(delinearized(dArr[0]), delinearized(dArr[1]), delinearized(dArr[2]));
    }

    public static int argbFromLstar(double d) {
        int iDelinearized = delinearized(yFromLstar(d));
        return argbFromRgb(iDelinearized, iDelinearized, iDelinearized);
    }

    public static int argbFromRgb(int i, int i2, int i3) {
        return ((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255);
    }

    public static int argbFromXyz(double d, double d2, double d3) {
        double[][] dArr = f97342b;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[0] * d) + (dArr2[1] * d2) + (dArr2[2] * d3);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[0] * d) + (dArr3[1] * d2) + (dArr3[2] * d3);
        double[] dArr4 = dArr[2];
        return argbFromRgb(delinearized(d4), delinearized(d5), delinearized((dArr4[0] * d) + (dArr4[1] * d2) + (dArr4[2] * d3)));
    }

    /* JADX INFO: renamed from: b */
    public static double m25071b(double d) {
        double d2 = d * d * d;
        return d2 > 0.008856451679035631d ? d2 : ((d * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static int blueFromArgb(int i) {
        return i & 255;
    }

    public static int delinearized(double d) {
        double d2 = d / 100.0d;
        return s3a.clampInt(0, 255, (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int greenFromArgb(int i) {
        return (i >> 8) & 255;
    }

    public static boolean isOpaque(int i) {
        return alphaFromArgb(i) >= 255;
    }

    public static double[] labFromArgb(int i) {
        double dLinearized = linearized(redFromArgb(i));
        double dLinearized2 = linearized(greenFromArgb(i));
        double dLinearized3 = linearized(blueFromArgb(i));
        double[][] dArr = f97341a;
        double[] dArr2 = dArr[0];
        double d = (dArr2[0] * dLinearized) + (dArr2[1] * dLinearized2) + (dArr2[2] * dLinearized3);
        double[] dArr3 = dArr[1];
        double d2 = (dArr3[0] * dLinearized) + (dArr3[1] * dLinearized2) + (dArr3[2] * dLinearized3);
        double[] dArr4 = dArr[2];
        double d3 = (dArr4[0] * dLinearized) + (dArr4[1] * dLinearized2) + (dArr4[2] * dLinearized3);
        double[] dArr5 = f97343c;
        double d4 = d / dArr5[0];
        double d5 = d2 / dArr5[1];
        double d6 = d3 / dArr5[2];
        double dM25070a = m25070a(d4);
        double dM25070a2 = m25070a(d5);
        return new double[]{(116.0d * dM25070a2) - 16.0d, (dM25070a - dM25070a2) * 500.0d, (dM25070a2 - m25070a(d6)) * 200.0d};
    }

    public static double linearized(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static double lstarFromArgb(int i) {
        return (m25070a(xyzFromArgb(i)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static double lstarFromY(double d) {
        return (m25070a(d / 100.0d) * 116.0d) - 16.0d;
    }

    public static int redFromArgb(int i) {
        return (i >> 16) & 255;
    }

    public static double[] whitePointD65() {
        return f97343c;
    }

    public static double[] xyzFromArgb(int i) {
        return s3a.matrixMultiply(new double[]{linearized(redFromArgb(i)), linearized(greenFromArgb(i)), linearized(blueFromArgb(i))}, f97341a);
    }

    public static double yFromLstar(double d) {
        return m25071b((d + 16.0d) / 116.0d) * 100.0d;
    }
}
