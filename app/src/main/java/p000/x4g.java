package p000;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class x4g extends gv4 {

    /* JADX INFO: renamed from: q */
    public static final boolean f96700q = false;

    /* JADX INFO: renamed from: p */
    public qya f96701p;

    public x4g(String str) {
        this.f41450a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.f96701p = genSpline(Arrays.copyOf(dArr, i + 1));
    }

    private static qya genSpline(String str) {
        String[] strArrSplit = str.split("\\s+");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(strArrSplit[i]);
        }
        return genSpline(dArr);
    }

    @Override // p000.gv4
    public double get(double d) {
        return this.f96701p.getPos(d, 0);
    }

    @Override // p000.gv4
    public double getDiff(double d) {
        return this.f96701p.getSlope(d, 0);
    }

    private static qya genSpline(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        qya qyaVar = new qya(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + qyaVar.getPos(0.0d, 0));
        printStream.println(" 1 " + qyaVar.getPos(1.0d, 0));
        return qyaVar;
    }
}
