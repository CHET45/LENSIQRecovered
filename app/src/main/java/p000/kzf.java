package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class kzf {

    /* JADX INFO: renamed from: h */
    public static final int f55723h = 8;

    /* JADX INFO: renamed from: a */
    public float f55724a;

    /* JADX INFO: renamed from: c */
    public boolean f55726c;

    /* JADX INFO: renamed from: d */
    public double f55727d;

    /* JADX INFO: renamed from: e */
    public double f55728e;

    /* JADX INFO: renamed from: f */
    public double f55729f;

    /* JADX INFO: renamed from: b */
    public double f55725b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g */
    public float f55730g = 1.0f;

    public kzf(float f) {
        this.f55724a = f;
    }

    private final void init() {
        if (this.f55726c) {
            return;
        }
        if (this.f55724a == lzf.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f = this.f55730g;
        double d = ((double) f) * ((double) f);
        if (f > 1.0f) {
            double d2 = this.f55725b;
            double d3 = d - ((double) 1);
            this.f55727d = (((double) (-f)) * d2) + (d2 * Math.sqrt(d3));
            double d4 = -this.f55730g;
            double d5 = this.f55725b;
            this.f55728e = (d4 * d5) - (d5 * Math.sqrt(d3));
        } else if (f >= 0.0f && f < 1.0f) {
            this.f55729f = this.f55725b * Math.sqrt(((double) 1) - d);
        }
        this.f55726c = true;
    }

    public final float getAcceleration(float f, float f2) {
        float f3 = f - this.f55724a;
        double d = this.f55725b;
        return (float) (((-(d * d)) * ((double) f3)) - (((d * 2.0d) * ((double) this.f55730g)) * ((double) f2)));
    }

    public final float getDampingRatio() {
        return this.f55730g;
    }

    public final float getFinalPosition() {
        return this.f55724a;
    }

    public final float getStiffness() {
        double d = this.f55725b;
        return (float) (d * d);
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f55730g = f;
        this.f55726c = false;
    }

    public final void setFinalPosition(float f) {
        this.f55724a = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f55725b = Math.sqrt(f);
        this.f55726c = false;
    }

    /* JADX INFO: renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m30802updateValuesIJZedt4$animation_core_release(float f, float f2, long j) {
        double dCos;
        double dExp;
        init();
        float f3 = f - this.f55724a;
        double d = j / 1000.0d;
        float f4 = this.f55730g;
        if (f4 > 1.0f) {
            double d2 = f3;
            double d3 = this.f55728e;
            double d4 = f2;
            double d5 = this.f55727d;
            double d6 = d2 - (((d3 * d2) - d4) / (d3 - d5));
            double d7 = ((d2 * d3) - d4) / (d3 - d5);
            dExp = (Math.exp(d3 * d) * d6) + (Math.exp(this.f55727d * d) * d7);
            double d8 = this.f55728e;
            double dExp2 = d6 * d8 * Math.exp(d8 * d);
            double d9 = this.f55727d;
            dCos = dExp2 + (d7 * d9 * Math.exp(d9 * d));
        } else if (f4 == 1.0f) {
            double d10 = this.f55725b;
            double d11 = f3;
            double d12 = ((double) f2) + (d10 * d11);
            double d13 = d11 + (d12 * d);
            double dExp3 = Math.exp((-d10) * d) * d13;
            double dExp4 = d13 * Math.exp((-this.f55725b) * d);
            double d14 = this.f55725b;
            dCos = (dExp4 * (-d14)) + (d12 * Math.exp((-d14) * d));
            dExp = dExp3;
        } else {
            double d15 = ((double) 1) / this.f55729f;
            double d16 = this.f55725b;
            double d17 = f3;
            double d18 = d15 * ((((double) f4) * d16 * d17) + ((double) f2));
            double dExp5 = Math.exp(((double) (-f4)) * d16 * d) * ((Math.cos(this.f55729f * d) * d17) + (Math.sin(this.f55729f * d) * d18));
            double d19 = this.f55725b;
            float f5 = this.f55730g;
            double d20 = (-d19) * dExp5 * ((double) f5);
            double dExp6 = Math.exp(((double) (-f5)) * d19 * d);
            double d21 = this.f55729f;
            double dSin = (-d21) * d17 * Math.sin(d21 * d);
            double d22 = this.f55729f;
            dCos = d20 + (dExp6 * (dSin + (d18 * d22 * Math.cos(d22 * d))));
            dExp = dExp5;
        }
        return lzf.Motion((float) (dExp + ((double) this.f55724a)), (float) dCos);
    }
}
