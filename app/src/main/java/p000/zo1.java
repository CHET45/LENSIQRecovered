package p000;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class zo1 {

    /* JADX INFO: renamed from: a */
    public static final float[][] f105570a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f105571b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f105572c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f105573d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private zo1() {
    }

    /* JADX INFO: renamed from: a */
    public static int m26907a(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f105572c;
        return ua2.XYZToColor(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: b */
    public static float m26908b(int i) {
        return m26909c(m26913g(i));
    }

    /* JADX INFO: renamed from: c */
    public static float m26909c(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: renamed from: d */
    public static float m26910d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX INFO: renamed from: e */
    public static float m26911e(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: f */
    public static void m26912f(int i, @efb float[] fArr) {
        float fM26911e = m26911e(Color.red(i));
        float fM26911e2 = m26911e(Color.green(i));
        float fM26911e3 = m26911e(Color.blue(i));
        float[][] fArr2 = f105573d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fM26911e) + (fArr3[1] * fM26911e2) + (fArr3[2] * fM26911e3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fM26911e) + (fArr4[1] * fM26911e2) + (fArr4[2] * fM26911e3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fM26911e * fArr5[0]) + (fM26911e2 * fArr5[1]) + (fM26911e3 * fArr5[2]);
    }

    /* JADX INFO: renamed from: g */
    public static float m26913g(int i) {
        float fM26911e = m26911e(Color.red(i));
        float fM26911e2 = m26911e(Color.green(i));
        float fM26911e3 = m26911e(Color.blue(i));
        float[] fArr = f105573d[1];
        return (fM26911e * fArr[0]) + (fM26911e2 * fArr[1]) + (fM26911e3 * fArr[2]);
    }

    /* JADX INFO: renamed from: h */
    public static float m26914h(float f) {
        return (f > 8.0f ? (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
