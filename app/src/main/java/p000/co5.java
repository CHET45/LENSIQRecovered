package p000;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes7.dex */
public class co5 {

    /* JADX INFO: renamed from: a */
    public static final int f17230a = 4096;

    public static si2[] cconvolve(si2[] si2VarArr, si2[] si2VarArr2) {
        if (si2VarArr.length != si2VarArr2.length) {
            throw new IllegalArgumentException("Dimensions don't agree");
        }
        int length = si2VarArr.length;
        si2[] si2VarArrFft = fft(si2VarArr);
        si2[] si2VarArrFft2 = fft(si2VarArr2);
        si2[] si2VarArr3 = new si2[length];
        for (int i = 0; i < length; i++) {
            si2VarArr3[i] = si2VarArrFft[i].times(si2VarArrFft2[i]);
        }
        return ifft(si2VarArr3);
    }

    public static si2[] convolve(si2[] si2VarArr, si2[] si2VarArr2) {
        si2 si2Var = new si2(0.0d, 0.0d);
        si2[] si2VarArr3 = new si2[si2VarArr.length * 2];
        for (int i = 0; i < si2VarArr.length; i++) {
            si2VarArr3[i] = si2VarArr[i];
        }
        for (int length = si2VarArr.length; length < si2VarArr.length * 2; length++) {
            si2VarArr3[length] = si2Var;
        }
        si2[] si2VarArr4 = new si2[si2VarArr2.length * 2];
        for (int i2 = 0; i2 < si2VarArr2.length; i2++) {
            si2VarArr4[i2] = si2VarArr2[i2];
        }
        for (int length2 = si2VarArr2.length; length2 < si2VarArr2.length * 2; length2++) {
            si2VarArr4[length2] = si2Var;
        }
        return cconvolve(si2VarArr3, si2VarArr4);
    }

    public static si2[] fft(si2[] si2VarArr) {
        int length = si2VarArr.length;
        if (length == 1) {
            return new si2[]{si2VarArr[0]};
        }
        if (length % 2 != 0) {
            throw new IllegalArgumentException("n is not a power of 2");
        }
        int i = length / 2;
        si2[] si2VarArr2 = new si2[i];
        for (int i2 = 0; i2 < i; i2++) {
            si2VarArr2[i2] = si2VarArr[i2 * 2];
        }
        si2[] si2VarArrFft = fft(si2VarArr2);
        for (int i3 = 0; i3 < i; i3++) {
            si2VarArr2[i3] = si2VarArr[(i3 * 2) + 1];
        }
        si2[] si2VarArrFft2 = fft(si2VarArr2);
        si2[] si2VarArr3 = new si2[length];
        for (int i4 = 0; i4 < i; i4++) {
            double d = (((double) (i4 * (-2))) * 3.141592653589793d) / ((double) length);
            si2 si2Var = new si2(Math.cos(d), Math.sin(d));
            si2VarArr3[i4] = si2VarArrFft[i4].plus(si2Var.times(si2VarArrFft2[i4]));
            si2VarArr3[i4 + i] = si2VarArrFft[i4].minus(si2Var.times(si2VarArrFft2[i4]));
        }
        return si2VarArr3;
    }

    public static double fun(int i) {
        return Math.sin(i * 15.0f);
    }

    public static double getY(double[] dArr) {
        double d = 0.0d;
        int i = 0;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            double d2 = dArr[i2];
            if (d2 > d) {
                i = i2;
                d = d2;
            }
        }
        int i3 = i + 1;
        log(String.format("x： %s ， y: %s", Integer.valueOf(i3), Double.valueOf(d)));
        log(String.format("频率： %sHz", Float.valueOf(i3 / 4096.0f)));
        log(String.format("频率2： %sHz", Float.valueOf((4096 - i3) / 4096.0f)));
        log(String.format("振幅： %s", Double.valueOf(d)));
        return d;
    }

    public static si2[] ifft(si2[] si2VarArr) {
        int length = si2VarArr.length;
        si2[] si2VarArr2 = new si2[length];
        for (int i = 0; i < length; i++) {
            si2VarArr2[i] = si2VarArr[i].conjugate();
        }
        si2[] si2VarArrFft = fft(si2VarArr2);
        for (int i2 = 0; i2 < length; i2++) {
            si2VarArrFft[i2] = si2VarArrFft[i2].conjugate();
        }
        for (int i3 = 0; i3 < length; i3++) {
            si2VarArrFft[i3] = si2VarArrFft[i3].scale(1.0d / ((double) length));
        }
        return si2VarArrFft;
    }

    public static void log(String str) {
        System.out.println(str);
    }

    public static void show(si2[] si2VarArr, String str) {
        PrintStream printStream = System.out;
        printStream.println(str);
        printStream.println("-------------------");
        for (int i = 0; i < 4096; i++) {
            System.out.println(si2VarArr[i]);
        }
        System.out.println();
    }

    public static double[] fft(double[] dArr, int i) {
        int length = dArr.length;
        if (length == 1) {
            return dArr;
        }
        si2[] si2VarArr = new si2[length];
        int i2 = length / 2;
        double[] dArr2 = new double[i2];
        for (int i3 = 0; i3 < length; i3++) {
            si2VarArr[i3] = new si2(dArr[i3], 0.0d);
        }
        si2[] si2VarArrFft = fft(si2VarArr);
        for (int i4 = 0; i4 < i2; i4++) {
            dArr2[i4] = Math.sqrt(Math.pow(si2VarArrFft[i4].m22015re(), 2.0d) + Math.pow(si2VarArrFft[i4].m22014im(), 2.0d)) / ((double) dArr.length);
        }
        return dArr2;
    }
}
