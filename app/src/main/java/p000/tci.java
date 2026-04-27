package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tci {

    /* JADX INFO: renamed from: k */
    public static final tci f84287k = m22466k(zo1.f105572c, (float) ((((double) zo1.m26914h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a */
    public final float f84288a;

    /* JADX INFO: renamed from: b */
    public final float f84289b;

    /* JADX INFO: renamed from: c */
    public final float f84290c;

    /* JADX INFO: renamed from: d */
    public final float f84291d;

    /* JADX INFO: renamed from: e */
    public final float f84292e;

    /* JADX INFO: renamed from: f */
    public final float f84293f;

    /* JADX INFO: renamed from: g */
    public final float[] f84294g;

    /* JADX INFO: renamed from: h */
    public final float f84295h;

    /* JADX INFO: renamed from: i */
    public final float f84296i;

    /* JADX INFO: renamed from: j */
    public final float f84297j;

    private tci(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f84293f = f;
        this.f84288a = f2;
        this.f84289b = f3;
        this.f84290c = f4;
        this.f84291d = f5;
        this.f84292e = f6;
        this.f84294g = fArr;
        this.f84295h = f7;
        this.f84296i = f8;
        this.f84297j = f9;
    }

    @efb
    /* JADX INFO: renamed from: k */
    public static tci m22466k(@efb float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = zo1.f105570a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float fM26910d = ((double) f12) >= 0.9d ? zo1.m26910d(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : zo1.m26910d(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(((double) f) * 5.0d)));
        float fM26914h = zo1.m26914h(f2) / fArr[1];
        double d2 = fM26914h;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f11)) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        return new tci(fM26914h, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fM26910d, f12, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX INFO: renamed from: a */
    public float m22467a() {
        return this.f84288a;
    }

    /* JADX INFO: renamed from: b */
    public float m22468b() {
        return this.f84291d;
    }

    /* JADX INFO: renamed from: c */
    public float m22469c() {
        return this.f84295h;
    }

    /* JADX INFO: renamed from: d */
    public float m22470d() {
        return this.f84296i;
    }

    /* JADX INFO: renamed from: e */
    public float m22471e() {
        return this.f84293f;
    }

    /* JADX INFO: renamed from: f */
    public float m22472f() {
        return this.f84289b;
    }

    /* JADX INFO: renamed from: g */
    public float m22473g() {
        return this.f84292e;
    }

    /* JADX INFO: renamed from: h */
    public float m22474h() {
        return this.f84290c;
    }

    @efb
    /* JADX INFO: renamed from: i */
    public float[] m22475i() {
        return this.f84294g;
    }

    /* JADX INFO: renamed from: j */
    public float m22476j() {
        return this.f84297j;
    }
}
