package p000;

/* JADX INFO: loaded from: classes.dex */
public class a5g implements y4g {

    /* JADX INFO: renamed from: p */
    public static final float f453p = 1.0E-5f;

    /* JADX INFO: renamed from: a */
    public float f454a;

    /* JADX INFO: renamed from: b */
    public float f455b;

    /* JADX INFO: renamed from: c */
    public float f456c;

    /* JADX INFO: renamed from: d */
    public float f457d;

    /* JADX INFO: renamed from: e */
    public float f458e;

    /* JADX INFO: renamed from: f */
    public float f459f;

    /* JADX INFO: renamed from: g */
    public float f460g;

    /* JADX INFO: renamed from: h */
    public float f461h;

    /* JADX INFO: renamed from: i */
    public float f462i;

    /* JADX INFO: renamed from: j */
    public int f463j;

    /* JADX INFO: renamed from: k */
    public String f464k;

    /* JADX INFO: renamed from: m */
    public float f466m;

    /* JADX INFO: renamed from: n */
    public float f467n;

    /* JADX INFO: renamed from: l */
    public boolean f465l = false;

    /* JADX INFO: renamed from: o */
    public boolean f468o = false;

    private float calcY(float f) {
        this.f468o = false;
        float f2 = this.f457d;
        if (f <= f2) {
            float f3 = this.f454a;
            return (f3 * f) + ((((this.f455b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f463j;
        if (i == 1) {
            return this.f460g;
        }
        float f4 = f - f2;
        float f5 = this.f458e;
        if (f4 < f5) {
            float f6 = this.f460g;
            float f7 = this.f455b;
            return f6 + (f7 * f4) + ((((this.f456c - f7) * f4) * f4) / (f5 * 2.0f));
        }
        if (i == 2) {
            return this.f461h;
        }
        float f8 = f4 - f5;
        float f9 = this.f459f;
        if (f8 > f9) {
            this.f468o = true;
            return this.f462i;
        }
        float f10 = this.f461h;
        float f11 = this.f456c;
        return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
    }

    private void setup(float f, float f2, float f3, float f4, float f5) {
        this.f468o = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f454a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f464k = "backward accelerate, decelerate";
                this.f463j = 2;
                this.f454a = f;
                this.f455b = fSqrt;
                this.f456c = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f457d = f8;
                this.f458e = fSqrt / f3;
                this.f460g = ((f + fSqrt) * f8) / 2.0f;
                this.f461h = f2;
                this.f462i = f2;
                return;
            }
            this.f464k = "backward accelerate cruse decelerate";
            this.f463j = 3;
            this.f454a = f;
            this.f455b = f4;
            this.f456c = f4;
            float f9 = (f4 - f) / f3;
            this.f457d = f9;
            float f10 = f4 / f3;
            this.f459f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f458e = ((f2 - f11) - f12) / f4;
            this.f460g = f11;
            this.f461h = f2 - f12;
            this.f462i = f2;
            return;
        }
        if (f7 >= f2) {
            this.f464k = "hard stop";
            this.f463j = 1;
            this.f454a = f;
            this.f455b = 0.0f;
            this.f460g = f2;
            this.f457d = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f464k = "cruse decelerate";
            this.f463j = 2;
            this.f454a = f;
            this.f455b = f;
            this.f456c = 0.0f;
            this.f460g = f13;
            this.f461h = f2;
            this.f457d = f14;
            this.f458e = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
        float f15 = (fSqrt2 - f) / f3;
        this.f457d = f15;
        float f16 = fSqrt2 / f3;
        this.f458e = f16;
        if (fSqrt2 < f4) {
            this.f464k = "accelerate decelerate";
            this.f463j = 2;
            this.f454a = f;
            this.f455b = fSqrt2;
            this.f456c = 0.0f;
            this.f457d = f15;
            this.f458e = f16;
            this.f460g = ((f + fSqrt2) * f15) / 2.0f;
            this.f461h = f2;
            return;
        }
        this.f464k = "accelerate cruse decelerate";
        this.f463j = 3;
        this.f454a = f;
        this.f455b = f4;
        this.f456c = f4;
        float f17 = (f4 - f) / f3;
        this.f457d = f17;
        float f18 = f4 / f3;
        this.f459f = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f458e = ((f2 - f19) - f20) / f4;
        this.f460g = f19;
        this.f461h = f2 - f20;
        this.f462i = f2;
    }

    public void config(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f468o = false;
        this.f466m = f;
        boolean z = f > f2;
        this.f465l = z;
        if (z) {
            setup(-f3, f - f2, f5, f6, f4);
        } else {
            setup(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // p000.y4g
    public String debug(String str, float f) {
        String str2 = str + " ===== " + this.f464k + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        sb.append(this.f465l ? "backwards" : "forward ");
        sb.append(" time = ");
        sb.append(f);
        sb.append("  stages ");
        sb.append(this.f463j);
        sb.append("\n");
        String str3 = sb.toString() + str + " dur " + this.f457d + " vel " + this.f454a + " pos " + this.f460g + "\n";
        if (this.f463j > 1) {
            str3 = str3 + str + " dur " + this.f458e + " vel " + this.f455b + " pos " + this.f461h + "\n";
        }
        if (this.f463j > 2) {
            str3 = str3 + str + " dur " + this.f459f + " vel " + this.f456c + " pos " + this.f462i + "\n";
        }
        float f2 = this.f457d;
        if (f <= f2) {
            return str3 + str + "stage 0\n";
        }
        int i = this.f463j;
        if (i == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f3 = f - f2;
        float f4 = this.f458e;
        if (f3 < f4) {
            return str3 + str + " stage 1\n";
        }
        if (i == 2) {
            return str3 + str + "end stage 1\n";
        }
        if (f3 - f4 < this.f459f) {
            return str3 + str + " stage 2\n";
        }
        return str3 + str + " end stage 2\n";
    }

    @Override // p000.y4g
    public float getInterpolation(float f) {
        float fCalcY = calcY(f);
        this.f467n = f;
        return this.f465l ? this.f466m - fCalcY : this.f466m + fCalcY;
    }

    @Override // p000.y4g
    public float getVelocity(float f) {
        float f2 = this.f457d;
        if (f <= f2) {
            float f3 = this.f454a;
            return f3 + (((this.f455b - f3) * f) / f2);
        }
        int i = this.f463j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f458e;
        if (f4 < f5) {
            float f6 = this.f455b;
            return f6 + (((this.f456c - f6) * f4) / f5);
        }
        if (i == 2) {
            return this.f461h;
        }
        float f7 = f4 - f5;
        float f8 = this.f459f;
        if (f7 >= f8) {
            return this.f462i;
        }
        float f9 = this.f456c;
        return f9 - ((f7 * f9) / f8);
    }

    @Override // p000.y4g
    public boolean isStopped() {
        return getVelocity() < 1.0E-5f && Math.abs(this.f462i - this.f467n) < 1.0E-5f;
    }

    @Override // p000.y4g
    public float getVelocity() {
        return this.f465l ? -getVelocity(this.f467n) : getVelocity(this.f467n);
    }
}
