package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class yo1 {

    /* JADX INFO: renamed from: j */
    public static final float f102369j = 0.2f;

    /* JADX INFO: renamed from: k */
    public static final float f102370k = 1.0f;

    /* JADX INFO: renamed from: l */
    public static final float f102371l = 0.4f;

    /* JADX INFO: renamed from: m */
    public static final float f102372m = 0.01f;

    /* JADX INFO: renamed from: a */
    public final float f102373a;

    /* JADX INFO: renamed from: b */
    public final float f102374b;

    /* JADX INFO: renamed from: c */
    public final float f102375c;

    /* JADX INFO: renamed from: d */
    public final float f102376d;

    /* JADX INFO: renamed from: e */
    public final float f102377e;

    /* JADX INFO: renamed from: f */
    public final float f102378f;

    /* JADX INFO: renamed from: g */
    public final float f102379g;

    /* JADX INFO: renamed from: h */
    public final float f102380h;

    /* JADX INFO: renamed from: i */
    public final float f102381i;

    public yo1(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f102373a = f;
        this.f102374b = f2;
        this.f102375c = f3;
        this.f102376d = f4;
        this.f102377e = f5;
        this.f102378f = f6;
        this.f102379g = f7;
        this.f102380h = f8;
        this.f102381i = f9;
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static yo1 m26241b(@g92 int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m26242c(i, tci.f84287k, fArr, fArr2);
        return new yo1(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* JADX INFO: renamed from: c */
    public static void m26242c(@g92 int i, @efb tci tciVar, @hib @zpf(7) float[] fArr, @efb @zpf(3) float[] fArr2) {
        zo1.m26912f(i, fArr2);
        float[][] fArr3 = zo1.f105570a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = tciVar.m22475i()[0] * f6;
        float f10 = tciVar.m22475i()[1] * f7;
        float f11 = tciVar.m22475i()[2] * f8;
        float fPow = (float) Math.pow(((double) (tciVar.m22469c() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (tciVar.m22469c() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (tciVar.m22469c() * Math.abs(f11))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * tciVar.m22472f()) / tciVar.m22467a(), tciVar.m22468b() * tciVar.m22476j())) * 100.0f;
        float fM22468b = (4.0f / tciVar.m22468b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (tciVar.m22467a() + 4.0f) * tciVar.m22470d();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, tciVar.m22471e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * tciVar.m22473g()) * tciVar.m22474h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fM22470d = tciVar.m22470d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r7 * tciVar.m22468b()) / (tciVar.m22467a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM22470d) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM22468b;
            fArr[2] = fM22470d;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    @hib
    private static yo1 findCamByJ(@y46(from = 0.0d, m25645to = 360.0d) float f, @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false) float f2, @y46(from = 0.0d, m25645to = ua2.f87251b) float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        yo1 yo1Var = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iM26255o = fromJch(f8, f2, f).m26255o();
            float fM26908b = zo1.m26908b(iM26255o);
            float fAbs = Math.abs(f3 - fM26908b);
            if (fAbs < 0.2f) {
                yo1 yo1VarM26241b = m26241b(iM26255o);
                float fM26244a = yo1VarM26241b.m26244a(fromJch(yo1VarM26241b.m26249h(), yo1VarM26241b.m26247f(), f));
                if (fM26244a <= 1.0f) {
                    yo1Var = yo1VarM26241b;
                    f5 = fAbs;
                    f7 = fM26244a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            }
            if (fM26908b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return yo1Var;
    }

    @efb
    private static yo1 fromJch(@y46(from = 0.0d, m25645to = ua2.f87251b) float f, @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false) float f2, @y46(from = 0.0d, m25645to = 360.0d) float f3) {
        return fromJchInFrame(f, f2, f3, tci.f84287k);
    }

    @efb
    private static yo1 fromJchInFrame(@y46(from = 0.0d, m25645to = ua2.f87251b) float f, @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false) float f2, @y46(from = 0.0d, m25645to = 360.0d) float f3, tci tciVar) {
        float fM22468b = (4.0f / tciVar.m22468b()) * ((float) Math.sqrt(((double) f) / 100.0d)) * (tciVar.m22467a() + 4.0f) * tciVar.m22470d();
        float fM22470d = f2 * tciVar.m22470d();
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(r4))) * tciVar.m22468b()) / (tciVar.m22467a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fM22470d) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new yo1(f3, f2, f, fM22468b, fM22470d, fSqrt, f4, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    public static void getM3HCTfromColor(@g92 int i, @efb @zpf(3) float[] fArr) {
        m26242c(i, tci.f84287k, null, fArr);
        fArr[2] = zo1.m26908b(i);
    }

    @g92
    /* JADX INFO: renamed from: m */
    public static int m26243m(@y46(from = 0.0d, m25645to = 360.0d) float f, @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false) float f2, @y46(from = 0.0d, m25645to = ua2.f87251b) float f3, @efb tci tciVar) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return zo1.m26907a(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        yo1 yo1Var = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            yo1 yo1VarFindCamByJ = findCamByJ(fMin, f5, f3);
            if (!z) {
                if (yo1VarFindCamByJ == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    yo1Var = yo1VarFindCamByJ;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (yo1VarFindCamByJ != null) {
                    return yo1VarFindCamByJ.m26254n(tciVar);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return yo1Var == null ? zo1.m26907a(f3) : yo1Var.m26254n(tciVar);
    }

    public static int toColor(@y46(from = 0.0d, m25645to = 360.0d) float f, @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false) float f2, @y46(from = 0.0d, m25645to = ua2.f87251b) float f3) {
        return m26243m(f, f2, f3, tci.f84287k);
    }

    /* JADX INFO: renamed from: a */
    public float m26244a(@efb yo1 yo1Var) {
        float fM26250i = m26250i() - yo1Var.m26250i();
        float fM26245d = m26245d() - yo1Var.m26245d();
        float fM26246e = m26246e() - yo1Var.m26246e();
        return (float) (Math.pow(Math.sqrt((fM26250i * fM26250i) + (fM26245d * fM26245d) + (fM26246e * fM26246e)), 0.63d) * 1.41d);
    }

    @y46(from = ak4.f1795e, fromInclusive = false, m25645to = ak4.f1794d, toInclusive = false)
    /* JADX INFO: renamed from: d */
    public float m26245d() {
        return this.f102380h;
    }

    @y46(from = ak4.f1795e, fromInclusive = false, m25645to = ak4.f1794d, toInclusive = false)
    /* JADX INFO: renamed from: e */
    public float m26246e() {
        return this.f102381i;
    }

    @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false)
    /* JADX INFO: renamed from: f */
    public float m26247f() {
        return this.f102374b;
    }

    @y46(from = 0.0d, m25645to = 360.0d, toInclusive = false)
    /* JADX INFO: renamed from: g */
    public float m26248g() {
        return this.f102373a;
    }

    @y46(from = 0.0d, m25645to = ua2.f87251b)
    /* JADX INFO: renamed from: h */
    public float m26249h() {
        return this.f102375c;
    }

    @y46(from = 0.0d, m25645to = ua2.f87251b)
    /* JADX INFO: renamed from: i */
    public float m26250i() {
        return this.f102379g;
    }

    @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false)
    /* JADX INFO: renamed from: j */
    public float m26251j() {
        return this.f102377e;
    }

    @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false)
    /* JADX INFO: renamed from: k */
    public float m26252k() {
        return this.f102376d;
    }

    @y46(from = 0.0d, m25645to = ak4.f1794d, toInclusive = false)
    /* JADX INFO: renamed from: l */
    public float m26253l() {
        return this.f102378f;
    }

    @g92
    /* JADX INFO: renamed from: n */
    public int m26254n(@efb tci tciVar) {
        float fPow = (float) Math.pow(((double) ((((double) m26247f()) == 0.0d || ((double) m26249h()) == 0.0d) ? 0.0f : m26247f() / ((float) Math.sqrt(((double) m26249h()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, tciVar.m22471e()), 0.73d), 1.1111111111111112d);
        double dM26248g = (m26248g() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM26248g) + 3.8d)) * 0.25f;
        float fM22467a = tciVar.m22467a() * ((float) Math.pow(((double) m26249h()) / 100.0d, (1.0d / ((double) tciVar.m22468b())) / ((double) tciVar.m22476j())));
        float fM22473g = fCos * 3846.1538f * tciVar.m22473g() * tciVar.m22474h();
        float fM22472f = fM22467a / tciVar.m22472f();
        float fSin = (float) Math.sin(dM26248g);
        float fCos2 = (float) Math.cos(dM26248g);
        float f = (((0.305f + fM22472f) * 23.0f) * fPow) / (((fM22473g * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = fM22472f * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float fSignum = Math.signum(f5) * (100.0f / tciVar.m22469c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f5)) * 27.13d) / (400.0d - ((double) Math.abs(f5)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f6) * (100.0f / tciVar.m22469c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f) * (100.0f / tciVar.m22469c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f7 = fSignum / tciVar.m22475i()[0];
        float f8 = fSignum2 / tciVar.m22475i()[1];
        float f9 = fSignum3 / tciVar.m22475i()[2];
        float[][] fArr = zo1.f105571b;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[0] * f7) + (fArr2[1] * f8) + (fArr2[2] * f9);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[0] * f7) + (fArr3[1] * f8) + (fArr3[2] * f9);
        float[] fArr4 = fArr[2];
        return ua2.XYZToColor(f10, f11, (f7 * fArr4[0]) + (f8 * fArr4[1]) + (f9 * fArr4[2]));
    }

    @g92
    /* JADX INFO: renamed from: o */
    public int m26255o() {
        return m26254n(tci.f84287k);
    }
}
