package p000;

import android.view.View;
import androidx.constraintlayout.widget.C0898a;
import androidx.constraintlayout.widget.C0901d;
import com.arthenica.ffmpegkit.StreamInformation;
import com.eyevue.glassapp.view.photo.C2865a;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class uza implements Comparable<uza> {

    /* JADX INFO: renamed from: Z1 */
    public static final String f89557Z1 = "MotionPaths";

    /* JADX INFO: renamed from: a2 */
    public static final boolean f89558a2 = false;

    /* JADX INFO: renamed from: b2 */
    public static final boolean f89559b2 = false;

    /* JADX INFO: renamed from: c2 */
    public static final int f89560c2 = 0;

    /* JADX INFO: renamed from: d2 */
    public static final int f89561d2 = 1;

    /* JADX INFO: renamed from: e2 */
    public static final int f89562e2 = 2;

    /* JADX INFO: renamed from: f2 */
    public static final int f89563f2 = 3;

    /* JADX INFO: renamed from: g2 */
    public static final int f89564g2 = 4;

    /* JADX INFO: renamed from: h2 */
    public static final int f89565h2 = 5;

    /* JADX INFO: renamed from: i2 */
    public static final int f89566i2 = 1;

    /* JADX INFO: renamed from: j2 */
    public static final int f89567j2 = 0;

    /* JADX INFO: renamed from: k2 */
    public static final int f89568k2 = 2;

    /* JADX INFO: renamed from: l2 */
    public static String[] f89569l2 = {C2865a.f19004r, "x", "y", StreamInformation.KEY_WIDTH, StreamInformation.KEY_HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: C */
    public float f89570C;

    /* JADX INFO: renamed from: L */
    public int f89573L;

    /* JADX INFO: renamed from: M */
    public int f89574M;

    /* JADX INFO: renamed from: M1 */
    public double[] f89575M1;

    /* JADX INFO: renamed from: N */
    public float f89576N;

    /* JADX INFO: renamed from: Q */
    public eza f89577Q;

    /* JADX INFO: renamed from: V1 */
    public double[] f89578V1;

    /* JADX INFO: renamed from: X */
    public LinkedHashMap<String, C0898a> f89579X;

    /* JADX INFO: renamed from: Y */
    public int f89580Y;

    /* JADX INFO: renamed from: Z */
    public int f89581Z;

    /* JADX INFO: renamed from: a */
    public gv4 f89582a;

    /* JADX INFO: renamed from: c */
    public float f89584c;

    /* JADX INFO: renamed from: d */
    public float f89585d;

    /* JADX INFO: renamed from: e */
    public float f89586e;

    /* JADX INFO: renamed from: f */
    public float f89587f;

    /* JADX INFO: renamed from: m */
    public float f89588m;

    /* JADX INFO: renamed from: b */
    public int f89583b = 0;

    /* JADX INFO: renamed from: F */
    public float f89571F = Float.NaN;

    /* JADX INFO: renamed from: H */
    public float f89572H = Float.NaN;

    public uza() {
        int i = dq8.f30366f;
        this.f89573L = i;
        this.f89574M = i;
        this.f89576N = Float.NaN;
        this.f89577Q = null;
        this.f89579X = new LinkedHashMap<>();
        this.f89580Y = 0;
        this.f89575M1 = new double[18];
        this.f89578V1 = new double[18];
    }

    private boolean diff(float a, float b) {
        return (Float.isNaN(a) || Float.isNaN(b)) ? Float.isNaN(a) != Float.isNaN(b) : Math.abs(a - b) > 1.0E-6f;
    }

    private static final float xRotate(float sin, float cos, float cx, float cy, float x, float y) {
        return (((x - cx) * cos) - ((y - cy) * sin)) + cx;
    }

    private static final float yRotate(float sin, float cos, float cx, float cy, float x, float y) {
        return ((x - cx) * sin) + ((y - cy) * cos) + cy;
    }

    /* JADX INFO: renamed from: a */
    public void m23643a(uza points, boolean[] mask, String[] custom, boolean arcMode) {
        boolean zDiff = diff(this.f89586e, points.f89586e);
        boolean zDiff2 = diff(this.f89587f, points.f89587f);
        mask[0] = mask[0] | diff(this.f89585d, points.f89585d);
        boolean z = zDiff | zDiff2 | arcMode;
        mask[1] = mask[1] | z;
        mask[2] = z | mask[2];
        mask[3] = mask[3] | diff(this.f89588m, points.f89588m);
        mask[4] = diff(this.f89570C, points.f89570C) | mask[4];
    }

    public void applyParameters(C0901d.a c) {
        this.f89582a = gv4.getInterpolator(c.f7065d.f7243d);
        C0901d.c cVar = c.f7065d;
        this.f89573L = cVar.f7244e;
        this.f89574M = cVar.f7241b;
        this.f89571F = cVar.f7248i;
        this.f89583b = cVar.f7245f;
        this.f89581Z = cVar.f7242c;
        this.f89572H = c.f7064c.f7258e;
        this.f89576N = c.f7066e.f7160D;
        for (String str : c.f7068g.keySet()) {
            C0898a c0898a = c.f7068g.get(str);
            if (c0898a != null && c0898a.isContinuous()) {
                this.f89579X.put(str, c0898a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23644b(double[] data, int[] toUse) {
        float[] fArr = {this.f89585d, this.f89586e, this.f89587f, this.f89588m, this.f89570C, this.f89571F};
        int i = 0;
        for (int i2 : toUse) {
            if (i2 < 6) {
                data[i] = fArr[r2];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m23645c(int[] toUse, double[] data, float[] point, int offset) {
        float f = this.f89588m;
        float f2 = this.f89570C;
        for (int i = 0; i < toUse.length; i++) {
            float f3 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 3) {
                f = f3;
            } else if (i2 == 4) {
                f2 = f3;
            }
        }
        point[offset] = f;
        point[offset + 1] = f2;
    }

    public void configureRelativeTo(eza toOrbit) {
        toOrbit.m10391m(this.f89572H);
    }

    /* JADX INFO: renamed from: d */
    public void m23646d(double p, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f89586e;
        float fCos = this.f89587f;
        float f = this.f89588m;
        float f2 = this.f89570C;
        for (int i = 0; i < toUse.length; i++) {
            float f3 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                fSin = f3;
            } else if (i2 == 2) {
                fCos = f3;
            } else if (i2 == 3) {
                f = f3;
            } else if (i2 == 4) {
                f2 = f3;
            }
        }
        eza ezaVar = this.f89577Q;
        if (ezaVar != null) {
            float[] fArr = new float[2];
            ezaVar.getCenter(p, fArr, new float[2]);
            float f4 = fArr[0];
            float f5 = fArr[1];
            double d = f4;
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((d + (Math.sin(d3) * d2)) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (d2 * Math.cos(d3))) - ((double) (f2 / 2.0f)));
        }
        point[offset] = fSin + (f / 2.0f) + 0.0f;
        point[offset + 1] = fCos + (f2 / 2.0f) + 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public void m23647e(double p, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float f;
        float f2 = this.f89586e;
        float f3 = this.f89587f;
        float f4 = this.f89588m;
        float f5 = this.f89570C;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < toUse.length; i++) {
            float f10 = (float) data[i];
            float f11 = (float) vdata[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float fCos = (f9 / 2.0f) + f8;
        eza ezaVar = this.f89577Q;
        if (ezaVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            ezaVar.getCenter(p, fArr, fArr2);
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            double d = f2;
            double d2 = f3;
            f = f4;
            float fSin = (float) ((((double) f14) + (Math.sin(d2) * d)) - ((double) (f4 / 2.0f)));
            float fCos2 = (float) ((((double) f15) - (d * Math.cos(d2))) - ((double) (f5 / 2.0f)));
            double d3 = f6;
            double d4 = f8;
            float fSin2 = (float) (((double) f16) + (Math.sin(d2) * d3) + (Math.cos(d2) * d4));
            fCos = (float) ((((double) f17) - (d3 * Math.cos(d2))) + (Math.sin(d2) * d4));
            f13 = fSin2;
            f2 = fSin;
            f3 = fCos2;
            f12 = 2.0f;
        } else {
            f = f4;
        }
        point[0] = f2 + (f / f12) + 0.0f;
        point[1] = f3 + (f5 / f12) + 0.0f;
        velocity[0] = f13;
        velocity[1] = fCos;
    }

    /* JADX INFO: renamed from: f */
    public void m23648f(double p, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f89586e;
        float fCos = this.f89587f;
        float f = this.f89588m;
        float f2 = this.f89570C;
        for (int i = 0; i < toUse.length; i++) {
            float f3 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                fSin = f3;
            } else if (i2 == 2) {
                fCos = f3;
            } else if (i2 == 3) {
                f = f3;
            } else if (i2 == 4) {
                f2 = f3;
            }
        }
        eza ezaVar = this.f89577Q;
        if (ezaVar != null) {
            float[] fArr = new float[2];
            ezaVar.getCenter(p, fArr, new float[2]);
            float f4 = fArr[0];
            float f5 = fArr[1];
            double d = f4;
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((d + (Math.sin(d3) * d2)) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (d2 * Math.cos(d3))) - ((double) (f2 / 2.0f)));
        }
        point[offset] = fSin + (f / 2.0f) + 0.0f;
        point[offset + 1] = fCos + (f2 / 2.0f) + 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public int m23649g(String name, double[] value, int offset) {
        C0898a c0898a = this.f89579X.get(name);
        int i = 0;
        if (c0898a == null) {
            return 0;
        }
        if (c0898a.numberOfInterpolatedValues() == 1) {
            value[offset] = c0898a.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = c0898a.numberOfInterpolatedValues();
        c0898a.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i < iNumberOfInterpolatedValues) {
            value[offset] = r2[i];
            i++;
            offset++;
        }
        return iNumberOfInterpolatedValues;
    }

    /* JADX INFO: renamed from: h */
    public int m23650h(String name) {
        C0898a c0898a = this.f89579X.get(name);
        if (c0898a == null) {
            return 0;
        }
        return c0898a.numberOfInterpolatedValues();
    }

    /* JADX INFO: renamed from: i */
    public void m23651i(int[] toUse, double[] data, float[] path, int offset) {
        float f = this.f89586e;
        float fCos = this.f89587f;
        float f2 = this.f89588m;
        float f3 = this.f89570C;
        for (int i = 0; i < toUse.length; i++) {
            float f4 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f4;
            } else if (i2 == 2) {
                fCos = f4;
            } else if (i2 == 3) {
                f2 = f4;
            } else if (i2 == 4) {
                f3 = f4;
            }
        }
        eza ezaVar = this.f89577Q;
        if (ezaVar != null) {
            float centerX = ezaVar.getCenterX();
            float centerY = this.f89577Q.getCenterY();
            double d = f;
            double d2 = fCos;
            float fSin = (float) ((((double) centerX) + (Math.sin(d2) * d)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) centerY) - (d * Math.cos(d2))) - ((double) (f3 / 2.0f)));
            f = fSin;
        }
        float f5 = f2 + f;
        float f6 = f3 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        path[offset] = f + 0.0f;
        path[offset + 1] = fCos + 0.0f;
        path[offset + 2] = f5 + 0.0f;
        path[offset + 3] = fCos + 0.0f;
        path[offset + 4] = f5 + 0.0f;
        path[offset + 5] = f6 + 0.0f;
        path[offset + 6] = f + 0.0f;
        path[offset + 7] = f6 + 0.0f;
    }

    /* JADX INFO: renamed from: j */
    public boolean m23652j(String name) {
        return this.f89579X.containsKey(name);
    }

    /* JADX INFO: renamed from: k */
    public void m23653k(ir8 c, uza startTimePoint, uza endTimePoint) {
        float f = c.f30387a / 100.0f;
        this.f89584c = f;
        this.f89583b = c.f48060H;
        float f2 = Float.isNaN(c.f48061I) ? f : c.f48061I;
        float f3 = Float.isNaN(c.f48062J) ? f : c.f48062J;
        float f4 = endTimePoint.f89588m;
        float f5 = startTimePoint.f89588m;
        float f6 = endTimePoint.f89570C;
        float f7 = startTimePoint.f89570C;
        this.f89585d = this.f89584c;
        float f8 = startTimePoint.f89586e;
        float f9 = startTimePoint.f89587f;
        float f10 = (endTimePoint.f89586e + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (endTimePoint.f89587f + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = ((f4 - f5) * f2) / 2.0f;
        this.f89586e = (int) ((f8 + (f10 * f)) - f12);
        float f13 = ((f6 - f7) * f3) / 2.0f;
        this.f89587f = (int) ((f9 + (f11 * f)) - f13);
        this.f89588m = (int) (f5 + r9);
        this.f89570C = (int) (f7 + r12);
        float f14 = Float.isNaN(c.f48063K) ? f : c.f48063K;
        float f15 = Float.isNaN(c.f48066N) ? 0.0f : c.f48066N;
        if (!Float.isNaN(c.f48064L)) {
            f = c.f48064L;
        }
        float f16 = Float.isNaN(c.f48065M) ? 0.0f : c.f48065M;
        this.f89580Y = 0;
        this.f89586e = (int) (((startTimePoint.f89586e + (f14 * f10)) + (f16 * f11)) - f12);
        this.f89587f = (int) (((startTimePoint.f89587f + (f10 * f15)) + (f11 * f)) - f13);
        this.f89582a = gv4.getInterpolator(c.f48058F);
        this.f89573L = c.f48059G;
    }

    /* JADX INFO: renamed from: l */
    public void m23654l(ir8 c, uza startTimePoint, uza endTimePoint) {
        float f = c.f30387a / 100.0f;
        this.f89584c = f;
        this.f89583b = c.f48060H;
        float f2 = Float.isNaN(c.f48061I) ? f : c.f48061I;
        float f3 = Float.isNaN(c.f48062J) ? f : c.f48062J;
        float f4 = endTimePoint.f89588m - startTimePoint.f89588m;
        float f5 = endTimePoint.f89570C - startTimePoint.f89570C;
        this.f89585d = this.f89584c;
        if (!Float.isNaN(c.f48063K)) {
            f = c.f48063K;
        }
        float f6 = startTimePoint.f89586e;
        float f7 = startTimePoint.f89588m;
        float f8 = startTimePoint.f89587f;
        float f9 = startTimePoint.f89570C;
        float f10 = (endTimePoint.f89586e + (endTimePoint.f89588m / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (endTimePoint.f89587f + (endTimePoint.f89570C / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = (f4 * f2) / 2.0f;
        this.f89586e = (int) ((f6 + f12) - f13);
        float f14 = f * f11;
        float f15 = (f5 * f3) / 2.0f;
        this.f89587f = (int) ((f8 + f14) - f15);
        this.f89588m = (int) (f7 + r7);
        this.f89570C = (int) (f9 + r8);
        float f16 = Float.isNaN(c.f48064L) ? 0.0f : c.f48064L;
        this.f89580Y = 1;
        float f17 = (int) ((startTimePoint.f89586e + f12) - f13);
        float f18 = (int) ((startTimePoint.f89587f + f14) - f15);
        this.f89586e = f17 + ((-f11) * f16);
        this.f89587f = f18 + (f10 * f16);
        this.f89574M = this.f89574M;
        this.f89582a = gv4.getInterpolator(c.f48058F);
        this.f89573L = c.f48059G;
    }

    /* JADX INFO: renamed from: m */
    public void m23655m(int parentWidth, int parentHeight, ir8 c, uza s, uza e) {
        float fMin;
        float f;
        float f2 = c.f30387a / 100.0f;
        this.f89584c = f2;
        this.f89583b = c.f48060H;
        this.f89580Y = c.f48067O;
        float f3 = Float.isNaN(c.f48061I) ? f2 : c.f48061I;
        float f4 = Float.isNaN(c.f48062J) ? f2 : c.f48062J;
        float f5 = e.f89588m;
        float f6 = s.f89588m;
        float f7 = e.f89570C;
        float f8 = s.f89570C;
        this.f89585d = this.f89584c;
        this.f89588m = (int) (f6 + ((f5 - f6) * f3));
        this.f89570C = (int) (f8 + ((f7 - f8) * f4));
        int i = c.f48067O;
        if (i == 1) {
            float f9 = Float.isNaN(c.f48063K) ? f2 : c.f48063K;
            float f10 = e.f89586e;
            float f11 = s.f89586e;
            this.f89586e = (f9 * (f10 - f11)) + f11;
            if (!Float.isNaN(c.f48064L)) {
                f2 = c.f48064L;
            }
            float f12 = e.f89587f;
            float f13 = s.f89587f;
            this.f89587f = (f2 * (f12 - f13)) + f13;
        } else if (i != 2) {
            float f14 = Float.isNaN(c.f48063K) ? f2 : c.f48063K;
            float f15 = e.f89586e;
            float f16 = s.f89586e;
            this.f89586e = (f14 * (f15 - f16)) + f16;
            if (!Float.isNaN(c.f48064L)) {
                f2 = c.f48064L;
            }
            float f17 = e.f89587f;
            float f18 = s.f89587f;
            this.f89587f = (f2 * (f17 - f18)) + f18;
        } else {
            if (Float.isNaN(c.f48063K)) {
                float f19 = e.f89586e;
                float f20 = s.f89586e;
                fMin = ((f19 - f20) * f2) + f20;
            } else {
                fMin = Math.min(f4, f3) * c.f48063K;
            }
            this.f89586e = fMin;
            if (Float.isNaN(c.f48064L)) {
                float f21 = e.f89587f;
                float f22 = s.f89587f;
                f = (f2 * (f21 - f22)) + f22;
            } else {
                f = c.f48064L;
            }
            this.f89587f = f;
        }
        this.f89574M = s.f89574M;
        this.f89582a = gv4.getInterpolator(c.f48058F);
        this.f89573L = c.f48059G;
    }

    /* JADX INFO: renamed from: n */
    public void m23656n(int parentWidth, int parentHeight, ir8 c, uza startTimePoint, uza endTimePoint) {
        float f = c.f30387a / 100.0f;
        this.f89584c = f;
        this.f89583b = c.f48060H;
        float f2 = Float.isNaN(c.f48061I) ? f : c.f48061I;
        float f3 = Float.isNaN(c.f48062J) ? f : c.f48062J;
        float f4 = endTimePoint.f89588m;
        float f5 = startTimePoint.f89588m;
        float f6 = endTimePoint.f89570C;
        float f7 = startTimePoint.f89570C;
        this.f89585d = this.f89584c;
        float f8 = startTimePoint.f89586e;
        float f9 = startTimePoint.f89587f;
        float f10 = endTimePoint.f89586e + (f4 / 2.0f);
        float f11 = endTimePoint.f89587f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f89586e = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.f89587f = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.f89588m = (int) (f5 + f12);
        this.f89570C = (int) (f7 + f13);
        this.f89580Y = 2;
        if (!Float.isNaN(c.f48063K)) {
            this.f89586e = (int) (c.f48063K * ((int) (parentWidth - this.f89588m)));
        }
        if (!Float.isNaN(c.f48064L)) {
            this.f89587f = (int) (c.f48064L * ((int) (parentHeight - this.f89570C)));
        }
        this.f89574M = this.f89574M;
        this.f89582a = gv4.getInterpolator(c.f48058F);
        this.f89573L = c.f48059G;
    }

    /* JADX INFO: renamed from: o */
    public void m23657o(float x, float y, float w, float h) {
        this.f89586e = x;
        this.f89587f = y;
        this.f89588m = w;
        this.f89570C = h;
    }

    /* JADX INFO: renamed from: p */
    public void m23658p(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i = 0; i < toUse.length; i++) {
            float f5 = (float) deltaData[i];
            double d = data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f5;
            } else if (i2 == 2) {
                f3 = f5;
            } else if (i2 == 3) {
                f2 = f5;
            } else if (i2 == 4) {
                f4 = f5;
            }
        }
        float f6 = f - ((0.0f * f2) / 2.0f);
        float f7 = f3 - ((0.0f * f4) / 2.0f);
        mAnchorDpDt[0] = (f6 * (1.0f - locationX)) + (((f2 * 1.0f) + f6) * locationX) + 0.0f;
        mAnchorDpDt[1] = (f7 * (1.0f - locationY)) + (((f4 * 1.0f) + f7) * locationY) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public void m23659q(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float f;
        float f2;
        float f3 = this.f89586e;
        float f4 = this.f89587f;
        float f5 = this.f89588m;
        float f6 = this.f89570C;
        if (toUse.length != 0 && this.f89575M1.length <= toUse[toUse.length - 1]) {
            int i = toUse[toUse.length - 1] + 1;
            this.f89575M1 = new double[i];
            this.f89578V1 = new double[i];
        }
        Arrays.fill(this.f89575M1, Double.NaN);
        for (int i2 = 0; i2 < toUse.length; i2++) {
            double[] dArr = this.f89575M1;
            int i3 = toUse[i2];
            dArr[i3] = data[i2];
            this.f89578V1[i3] = slope[i2];
        }
        float f7 = Float.NaN;
        int i4 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr2 = this.f89575M1;
            if (i4 >= dArr2.length) {
                break;
            }
            if (Double.isNaN(dArr2[i4]) && (cycle == null || cycle[i4] == 0.0d)) {
                f2 = f7;
            } else {
                double d = cycle != null ? cycle[i4] : 0.0d;
                if (!Double.isNaN(this.f89575M1[i4])) {
                    d = this.f89575M1[i4] + d;
                }
                f2 = f7;
                float f12 = (float) d;
                float f13 = (float) this.f89578V1[i4];
                if (i4 == 1) {
                    f7 = f2;
                    f8 = f13;
                    f3 = f12;
                } else if (i4 == 2) {
                    f7 = f2;
                    f9 = f13;
                    f4 = f12;
                } else if (i4 == 3) {
                    f7 = f2;
                    f10 = f13;
                    f5 = f12;
                } else if (i4 == 4) {
                    f7 = f2;
                    f11 = f13;
                    f6 = f12;
                } else if (i4 == 5) {
                    f7 = f12;
                }
                i4++;
            }
            f7 = f2;
            i4++;
        }
        float f14 = f7;
        eza ezaVar = this.f89577Q;
        if (ezaVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            ezaVar.getCenter(position, fArr, fArr2);
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d2 = f3;
            double d3 = f4;
            float fSin = (float) ((((double) f15) + (Math.sin(d3) * d2)) - ((double) (f5 / 2.0f)));
            f = f6;
            float fCos = (float) ((((double) f16) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
            double d4 = f8;
            double d5 = f9;
            float fSin2 = (float) (((double) f17) + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float fCos2 = (float) ((((double) f18) - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (slope.length >= 2) {
                slope[0] = fSin2;
                slope[1] = fCos2;
            }
            if (!Float.isNaN(f14)) {
                view.setRotation((float) (((double) f14) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f3 = fSin;
            f4 = fCos;
        } else {
            f = f6;
            if (!Float.isNaN(f14)) {
                view.setRotation((float) (((double) 0.0f) + ((double) f14) + Math.toDegrees(Math.atan2(f9 + (f11 / 2.0f), f8 + (f10 / 2.0f)))));
            }
        }
        if (view instanceof o46) {
            ((o46) view).layout(f3, f4, f5 + f3, f4 + f);
            return;
        }
        float f19 = f3 + 0.5f;
        int i5 = (int) f19;
        float f20 = f4 + 0.5f;
        int i6 = (int) f20;
        int i7 = (int) (f19 + f5);
        int i8 = (int) (f20 + f);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight() || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    public void setupRelative(eza mc, uza relative) {
        double d = ((this.f89586e + (this.f89588m / 2.0f)) - relative.f89586e) - (relative.f89588m / 2.0f);
        double d2 = ((this.f89587f + (this.f89570C / 2.0f)) - relative.f89587f) - (relative.f89570C / 2.0f);
        this.f89577Q = mc;
        this.f89586e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f89576N)) {
            this.f89587f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f89587f = (float) Math.toRadians(this.f89576N);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb uza o) {
        return Float.compare(this.f89585d, o.f89585d);
    }

    public uza(int parentWidth, int parentHeight, ir8 c, uza startTimePoint, uza endTimePoint) {
        int i = dq8.f30366f;
        this.f89573L = i;
        this.f89574M = i;
        this.f89576N = Float.NaN;
        this.f89577Q = null;
        this.f89579X = new LinkedHashMap<>();
        this.f89580Y = 0;
        this.f89575M1 = new double[18];
        this.f89578V1 = new double[18];
        if (startTimePoint.f89574M != dq8.f30366f) {
            m23655m(parentWidth, parentHeight, c, startTimePoint, endTimePoint);
            return;
        }
        int i2 = c.f48067O;
        if (i2 == 1) {
            m23654l(c, startTimePoint, endTimePoint);
        } else if (i2 != 2) {
            m23653k(c, startTimePoint, endTimePoint);
        } else {
            m23656n(parentWidth, parentHeight, c, startTimePoint, endTimePoint);
        }
    }
}
