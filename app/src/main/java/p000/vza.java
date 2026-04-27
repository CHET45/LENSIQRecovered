package p000;

import com.arthenica.ffmpegkit.StreamInformation;
import com.eyevue.glassapp.view.photo.C2865a;
import java.util.Arrays;
import java.util.HashMap;
import p000.d0b;

/* JADX INFO: loaded from: classes.dex */
public class vza implements Comparable<vza> {

    /* JADX INFO: renamed from: Z1 */
    public static final String f92916Z1 = "MotionPaths";

    /* JADX INFO: renamed from: a2 */
    public static final boolean f92917a2 = false;

    /* JADX INFO: renamed from: b2 */
    public static final boolean f92918b2 = false;

    /* JADX INFO: renamed from: c2 */
    public static final int f92919c2 = 0;

    /* JADX INFO: renamed from: d2 */
    public static final int f92920d2 = 1;

    /* JADX INFO: renamed from: e2 */
    public static final int f92921e2 = 2;

    /* JADX INFO: renamed from: f2 */
    public static final int f92922f2 = 3;

    /* JADX INFO: renamed from: g2 */
    public static final int f92923g2 = 4;

    /* JADX INFO: renamed from: h2 */
    public static final int f92924h2 = 5;

    /* JADX INFO: renamed from: i2 */
    public static final int f92925i2 = 1;

    /* JADX INFO: renamed from: j2 */
    public static final int f92926j2 = 0;

    /* JADX INFO: renamed from: k2 */
    public static final int f92927k2 = 2;

    /* JADX INFO: renamed from: l2 */
    public static String[] f92928l2 = {C2865a.f19004r, "x", "y", StreamInformation.KEY_WIDTH, StreamInformation.KEY_HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: C */
    public float f92929C;

    /* JADX INFO: renamed from: F */
    public float f92930F;

    /* JADX INFO: renamed from: H */
    public float f92931H;

    /* JADX INFO: renamed from: L */
    public int f92932L;

    /* JADX INFO: renamed from: M */
    public int f92933M;

    /* JADX INFO: renamed from: M1 */
    public double[] f92934M1;

    /* JADX INFO: renamed from: N */
    public float f92935N;

    /* JADX INFO: renamed from: Q */
    public zya f92936Q;

    /* JADX INFO: renamed from: V1 */
    public double[] f92937V1;

    /* JADX INFO: renamed from: X */
    public HashMap<String, ge3> f92938X;

    /* JADX INFO: renamed from: Y */
    public int f92939Y;

    /* JADX INFO: renamed from: Z */
    public int f92940Z;

    /* JADX INFO: renamed from: a */
    public gv4 f92941a;

    /* JADX INFO: renamed from: b */
    public int f92942b;

    /* JADX INFO: renamed from: c */
    public float f92943c;

    /* JADX INFO: renamed from: d */
    public float f92944d;

    /* JADX INFO: renamed from: e */
    public float f92945e;

    /* JADX INFO: renamed from: f */
    public float f92946f;

    /* JADX INFO: renamed from: m */
    public float f92947m;

    public vza() {
        this.f92942b = 0;
        this.f92930F = Float.NaN;
        this.f92931H = Float.NaN;
        this.f92932L = -1;
        this.f92933M = -1;
        this.f92935N = Float.NaN;
        this.f92936Q = null;
        this.f92938X = new HashMap<>();
        this.f92939Y = 0;
        this.f92934M1 = new double[18];
        this.f92937V1 = new double[18];
    }

    private boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    private static final float xRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private static final float yRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    /* JADX INFO: renamed from: a */
    public void m24265a(vza vzaVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean zDiff = diff(this.f92945e, vzaVar.f92945e);
        boolean zDiff2 = diff(this.f92946f, vzaVar.f92946f);
        zArr[0] = zArr[0] | diff(this.f92944d, vzaVar.f92944d);
        boolean z2 = zDiff | zDiff2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | diff(this.f92947m, vzaVar.f92947m);
        zArr[4] = diff(this.f92929C, vzaVar.f92929C) | zArr[4];
    }

    public void applyParameters(d0b d0bVar) {
        this.f92941a = gv4.getInterpolator(d0bVar.f28162i.f28171c);
        d0b.C4572a c4572a = d0bVar.f28162i;
        this.f92932L = c4572a.f28172d;
        this.f92933M = c4572a.f28169a;
        this.f92930F = c4572a.f28176h;
        this.f92942b = c4572a.f28173e;
        this.f92940Z = c4572a.f28170b;
        this.f92931H = d0bVar.f28163j.f28185d;
        this.f92935N = 0.0f;
        for (String str : d0bVar.getCustomAttributeNames()) {
            ge3 customAttribute = d0bVar.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.f92938X.put(str, customAttribute);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24266b(double[] dArr, int[] iArr) {
        float[] fArr = {this.f92944d, this.f92945e, this.f92946f, this.f92947m, this.f92929C, this.f92930F};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[r2];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m24267c(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f92947m;
        float f2 = this.f92929C;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    public void configureRelativeTo(zya zyaVar) {
        zyaVar.m27143i(this.f92931H);
    }

    /* JADX INFO: renamed from: d */
    public void m24268d(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f92945e;
        float fCos = this.f92946f;
        float f = this.f92947m;
        float f2 = this.f92929C;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        zya zyaVar = this.f92936Q;
        if (zyaVar != null) {
            float[] fArr2 = new float[2];
            zyaVar.getCenter(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (d3 * Math.cos(d4))) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = fSin + (f / 2.0f) + 0.0f;
        fArr[i + 1] = fCos + (f2 / 2.0f) + 0.0f;
    }

    /* JADX INFO: renamed from: e */
    public void m24269e(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f92945e;
        float f3 = this.f92946f;
        float f4 = this.f92947m;
        float f5 = this.f92929C;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
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
        zya zyaVar = this.f92936Q;
        if (zyaVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            zyaVar.getCenter(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            f = f4;
            float fSin = (float) ((((double) f14) + (Math.sin(d3) * d2)) - ((double) (f4 / 2.0f)));
            float fCos2 = (float) ((((double) f15) - (d2 * Math.cos(d3))) - ((double) (f5 / 2.0f)));
            double d4 = f6;
            double d5 = f8;
            float fSin2 = (float) (((double) f16) + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            fCos = (float) ((((double) f17) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = fSin2;
            f2 = fSin;
            f3 = fCos2;
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = fCos;
    }

    /* JADX INFO: renamed from: f */
    public void m24270f(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f92945e;
        float fCos = this.f92946f;
        float f = this.f92947m;
        float f2 = this.f92929C;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        zya zyaVar = this.f92936Q;
        if (zyaVar != null) {
            float[] fArr2 = new float[2];
            zyaVar.getCenter(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (d3 * Math.cos(d4))) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = fSin + (f / 2.0f) + 0.0f;
        fArr[i + 1] = fCos + (f2 / 2.0f) + 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public int m24271g(String str, double[] dArr, int i) {
        ge3 ge3Var = this.f92938X.get(str);
        int i2 = 0;
        if (ge3Var == null) {
            return 0;
        }
        if (ge3Var.numberOfInterpolatedValues() == 1) {
            dArr[i] = ge3Var.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = ge3Var.numberOfInterpolatedValues();
        ge3Var.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i2 < iNumberOfInterpolatedValues) {
            dArr[i] = r2[i2];
            i2++;
            i++;
        }
        return iNumberOfInterpolatedValues;
    }

    /* JADX INFO: renamed from: h */
    public int m24272h(String str) {
        ge3 ge3Var = this.f92938X.get(str);
        if (ge3Var == null) {
            return 0;
        }
        return ge3Var.numberOfInterpolatedValues();
    }

    /* JADX INFO: renamed from: i */
    public void m24273i(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f92945e;
        float fCos = this.f92946f;
        float f2 = this.f92947m;
        float f3 = this.f92929C;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        zya zyaVar = this.f92936Q;
        if (zyaVar != null) {
            float centerX = zyaVar.getCenterX();
            float centerY = this.f92936Q.getCenterY();
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
        fArr[i] = f + 0.0f;
        fArr[i + 1] = fCos + 0.0f;
        fArr[i + 2] = f5 + 0.0f;
        fArr[i + 3] = fCos + 0.0f;
        fArr[i + 4] = f5 + 0.0f;
        fArr[i + 5] = f6 + 0.0f;
        fArr[i + 6] = f + 0.0f;
        fArr[i + 7] = f6 + 0.0f;
    }

    /* JADX INFO: renamed from: j */
    public boolean m24274j(String str) {
        return this.f92938X.containsKey(str);
    }

    /* JADX INFO: renamed from: k */
    public void m24275k(rza rzaVar, vza vzaVar, vza vzaVar2) {
        float f = rzaVar.f69274h / 100.0f;
        this.f92943c = f;
        this.f92942b = rzaVar.f80192B;
        float f2 = Float.isNaN(rzaVar.f80193C) ? f : rzaVar.f80193C;
        float f3 = Float.isNaN(rzaVar.f80194D) ? f : rzaVar.f80194D;
        float f4 = vzaVar2.f92947m;
        float f5 = vzaVar.f92947m;
        float f6 = vzaVar2.f92929C;
        float f7 = vzaVar.f92929C;
        this.f92944d = this.f92943c;
        float f8 = vzaVar.f92945e;
        float f9 = vzaVar.f92946f;
        float f10 = (vzaVar2.f92945e + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (vzaVar2.f92946f + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = ((f4 - f5) * f2) / 2.0f;
        this.f92945e = (int) ((f8 + (f10 * f)) - f12);
        float f13 = ((f6 - f7) * f3) / 2.0f;
        this.f92946f = (int) ((f9 + (f11 * f)) - f13);
        this.f92947m = (int) (f5 + r9);
        this.f92929C = (int) (f7 + r12);
        float f14 = Float.isNaN(rzaVar.f80195E) ? f : rzaVar.f80195E;
        float f15 = Float.isNaN(rzaVar.f80198H) ? 0.0f : rzaVar.f80198H;
        if (!Float.isNaN(rzaVar.f80196F)) {
            f = rzaVar.f80196F;
        }
        float f16 = Float.isNaN(rzaVar.f80197G) ? 0.0f : rzaVar.f80197G;
        this.f92939Y = 0;
        this.f92945e = (int) (((vzaVar.f92945e + (f14 * f10)) + (f16 * f11)) - f12);
        this.f92946f = (int) (((vzaVar.f92946f + (f10 * f15)) + (f11 * f)) - f13);
        this.f92941a = gv4.getInterpolator(rzaVar.f80203z);
        this.f92932L = rzaVar.f80191A;
    }

    /* JADX INFO: renamed from: l */
    public void m24276l(rza rzaVar, vza vzaVar, vza vzaVar2) {
        float f = rzaVar.f69274h / 100.0f;
        this.f92943c = f;
        this.f92942b = rzaVar.f80192B;
        float f2 = Float.isNaN(rzaVar.f80193C) ? f : rzaVar.f80193C;
        float f3 = Float.isNaN(rzaVar.f80194D) ? f : rzaVar.f80194D;
        float f4 = vzaVar2.f92947m - vzaVar.f92947m;
        float f5 = vzaVar2.f92929C - vzaVar.f92929C;
        this.f92944d = this.f92943c;
        if (!Float.isNaN(rzaVar.f80195E)) {
            f = rzaVar.f80195E;
        }
        float f6 = vzaVar.f92945e;
        float f7 = vzaVar.f92947m;
        float f8 = vzaVar.f92946f;
        float f9 = vzaVar.f92929C;
        float f10 = (vzaVar2.f92945e + (vzaVar2.f92947m / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (vzaVar2.f92946f + (vzaVar2.f92929C / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = (f4 * f2) / 2.0f;
        this.f92945e = (int) ((f6 + f12) - f13);
        float f14 = f * f11;
        float f15 = (f5 * f3) / 2.0f;
        this.f92946f = (int) ((f8 + f14) - f15);
        this.f92947m = (int) (f7 + r7);
        this.f92929C = (int) (f9 + r8);
        float f16 = Float.isNaN(rzaVar.f80196F) ? 0.0f : rzaVar.f80196F;
        this.f92939Y = 1;
        float f17 = (int) ((vzaVar.f92945e + f12) - f13);
        float f18 = (int) ((vzaVar.f92946f + f14) - f15);
        this.f92945e = f17 + ((-f11) * f16);
        this.f92946f = f18 + (f10 * f16);
        this.f92933M = this.f92933M;
        this.f92941a = gv4.getInterpolator(rzaVar.f80203z);
        this.f92932L = rzaVar.f80191A;
    }

    /* JADX INFO: renamed from: m */
    public void m24277m(int i, int i2, rza rzaVar, vza vzaVar, vza vzaVar2) {
        float fMin;
        float f;
        float f2 = rzaVar.f69274h / 100.0f;
        this.f92943c = f2;
        this.f92942b = rzaVar.f80192B;
        this.f92939Y = rzaVar.f80199I;
        float f3 = Float.isNaN(rzaVar.f80193C) ? f2 : rzaVar.f80193C;
        float f4 = Float.isNaN(rzaVar.f80194D) ? f2 : rzaVar.f80194D;
        float f5 = vzaVar2.f92947m;
        float f6 = vzaVar.f92947m;
        float f7 = vzaVar2.f92929C;
        float f8 = vzaVar.f92929C;
        this.f92944d = this.f92943c;
        this.f92947m = (int) (f6 + ((f5 - f6) * f3));
        this.f92929C = (int) (f8 + ((f7 - f8) * f4));
        int i3 = rzaVar.f80199I;
        if (i3 == 1) {
            float f9 = Float.isNaN(rzaVar.f80195E) ? f2 : rzaVar.f80195E;
            float f10 = vzaVar2.f92945e;
            float f11 = vzaVar.f92945e;
            this.f92945e = (f9 * (f10 - f11)) + f11;
            if (!Float.isNaN(rzaVar.f80196F)) {
                f2 = rzaVar.f80196F;
            }
            float f12 = vzaVar2.f92946f;
            float f13 = vzaVar.f92946f;
            this.f92946f = (f2 * (f12 - f13)) + f13;
        } else if (i3 != 2) {
            float f14 = Float.isNaN(rzaVar.f80195E) ? f2 : rzaVar.f80195E;
            float f15 = vzaVar2.f92945e;
            float f16 = vzaVar.f92945e;
            this.f92945e = (f14 * (f15 - f16)) + f16;
            if (!Float.isNaN(rzaVar.f80196F)) {
                f2 = rzaVar.f80196F;
            }
            float f17 = vzaVar2.f92946f;
            float f18 = vzaVar.f92946f;
            this.f92946f = (f2 * (f17 - f18)) + f18;
        } else {
            if (Float.isNaN(rzaVar.f80195E)) {
                float f19 = vzaVar2.f92945e;
                float f20 = vzaVar.f92945e;
                fMin = ((f19 - f20) * f2) + f20;
            } else {
                fMin = Math.min(f4, f3) * rzaVar.f80195E;
            }
            this.f92945e = fMin;
            if (Float.isNaN(rzaVar.f80196F)) {
                float f21 = vzaVar2.f92946f;
                float f22 = vzaVar.f92946f;
                f = (f2 * (f21 - f22)) + f22;
            } else {
                f = rzaVar.f80196F;
            }
            this.f92946f = f;
        }
        this.f92933M = vzaVar.f92933M;
        this.f92941a = gv4.getInterpolator(rzaVar.f80203z);
        this.f92932L = rzaVar.f80191A;
    }

    /* JADX INFO: renamed from: n */
    public void m24278n(int i, int i2, rza rzaVar, vza vzaVar, vza vzaVar2) {
        float f = rzaVar.f69274h / 100.0f;
        this.f92943c = f;
        this.f92942b = rzaVar.f80192B;
        float f2 = Float.isNaN(rzaVar.f80193C) ? f : rzaVar.f80193C;
        float f3 = Float.isNaN(rzaVar.f80194D) ? f : rzaVar.f80194D;
        float f4 = vzaVar2.f92947m;
        float f5 = vzaVar.f92947m;
        float f6 = vzaVar2.f92929C;
        float f7 = vzaVar.f92929C;
        this.f92944d = this.f92943c;
        float f8 = vzaVar.f92945e;
        float f9 = vzaVar.f92946f;
        float f10 = vzaVar2.f92945e + (f4 / 2.0f);
        float f11 = vzaVar2.f92946f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f92945e = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.f92946f = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.f92947m = (int) (f5 + f12);
        this.f92929C = (int) (f7 + f13);
        this.f92939Y = 2;
        if (!Float.isNaN(rzaVar.f80195E)) {
            this.f92945e = (int) (rzaVar.f80195E * ((int) (i - this.f92947m)));
        }
        if (!Float.isNaN(rzaVar.f80196F)) {
            this.f92946f = (int) (rzaVar.f80196F * ((int) (i2 - this.f92929C)));
        }
        this.f92933M = this.f92933M;
        this.f92941a = gv4.getInterpolator(rzaVar.f80203z);
        this.f92932L = rzaVar.f80191A;
    }

    /* JADX INFO: renamed from: o */
    public void m24279o(float f, float f2, float f3, float f4) {
        this.f92945e = f;
        this.f92946f = f2;
        this.f92947m = f3;
        this.f92929C = f4;
    }

    /* JADX INFO: renamed from: p */
    public void m24280p(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* JADX INFO: renamed from: q */
    public void m24281q(float f, d0b d0bVar, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3;
        float f4 = this.f92945e;
        float f5 = this.f92946f;
        float f6 = this.f92947m;
        float f7 = this.f92929C;
        if (iArr.length != 0 && this.f92934M1.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f92934M1 = new double[i];
            this.f92937V1 = new double[i];
        }
        Arrays.fill(this.f92934M1, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.f92934M1;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.f92937V1[i3] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f92934M1;
            if (i4 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f3 = f8;
            } else {
                double d = dArr3 != null ? dArr3[i4] : 0.0d;
                if (!Double.isNaN(this.f92934M1[i4])) {
                    d = this.f92934M1[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f92937V1[i4];
                if (i4 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i4 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i4 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i4 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i4 == 5) {
                    f8 = f13;
                }
                i4++;
            }
            f8 = f3;
            i4++;
        }
        float f15 = f8;
        zya zyaVar = this.f92936Q;
        if (zyaVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            zyaVar.getCenter(f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f4;
            double d3 = f5;
            float fSin = (float) ((((double) f16) + (Math.sin(d3) * d2)) - ((double) (f6 / 2.0f)));
            f2 = f7;
            float fCos = (float) ((((double) f17) - (Math.cos(d3) * d2)) - ((double) (f7 / 2.0f)));
            double d4 = f9;
            double d5 = f10;
            float fSin2 = (float) (((double) f18) + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float fCos2 = (float) ((((double) f19) - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f15)) {
                d0bVar.setRotationZ((float) (((double) f15) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f4 = fSin;
            f5 = fCos;
        } else {
            f2 = f7;
            if (!Float.isNaN(f15)) {
                d0bVar.setRotationZ((float) (((double) 0.0f) + ((double) f15) + Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f)))));
            }
        }
        float f20 = f4 + 0.5f;
        float f21 = f5 + 0.5f;
        d0bVar.layout((int) f20, (int) f21, (int) (f20 + f6), (int) (f21 + f2));
    }

    public void setupRelative(zya zyaVar, vza vzaVar) {
        double d = ((this.f92945e + (this.f92947m / 2.0f)) - vzaVar.f92945e) - (vzaVar.f92947m / 2.0f);
        double d2 = ((this.f92946f + (this.f92929C / 2.0f)) - vzaVar.f92946f) - (vzaVar.f92929C / 2.0f);
        this.f92936Q = zyaVar;
        this.f92945e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f92935N)) {
            this.f92946f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f92946f = (float) Math.toRadians(this.f92935N);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(vza vzaVar) {
        return Float.compare(this.f92944d, vzaVar.f92944d);
    }

    public vza(int i, int i2, rza rzaVar, vza vzaVar, vza vzaVar2) {
        this.f92942b = 0;
        this.f92930F = Float.NaN;
        this.f92931H = Float.NaN;
        this.f92932L = -1;
        this.f92933M = -1;
        this.f92935N = Float.NaN;
        this.f92936Q = null;
        this.f92938X = new HashMap<>();
        this.f92939Y = 0;
        this.f92934M1 = new double[18];
        this.f92937V1 = new double[18];
        if (vzaVar.f92933M != -1) {
            m24277m(i, i2, rzaVar, vzaVar, vzaVar2);
            return;
        }
        int i3 = rzaVar.f80199I;
        if (i3 == 1) {
            m24276l(rzaVar, vzaVar, vzaVar2);
        } else if (i3 != 2) {
            m24275k(rzaVar, vzaVar, vzaVar2);
        } else {
            m24278n(i, i2, rzaVar, vzaVar, vzaVar2);
        }
    }
}
