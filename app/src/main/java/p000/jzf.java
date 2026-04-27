package p000;

import p000.p7e;
import p000.xt4;

/* JADX INFO: loaded from: classes3.dex */
public final class jzf implements xp6 {

    /* JADX INFO: renamed from: k */
    public static final float f52285k = 10000.0f;

    /* JADX INFO: renamed from: l */
    public static final float f52286l = 1500.0f;

    /* JADX INFO: renamed from: m */
    public static final float f52287m = 200.0f;

    /* JADX INFO: renamed from: n */
    public static final float f52288n = 50.0f;

    /* JADX INFO: renamed from: o */
    public static final float f52289o = 0.2f;

    /* JADX INFO: renamed from: p */
    public static final float f52290p = 0.5f;

    /* JADX INFO: renamed from: q */
    public static final float f52291q = 0.75f;

    /* JADX INFO: renamed from: r */
    public static final float f52292r = 1.0f;

    /* JADX INFO: renamed from: s */
    public static final double f52293s = 62.5d;

    /* JADX INFO: renamed from: t */
    public static final double f52294t = Double.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public double f52295a;

    /* JADX INFO: renamed from: b */
    public double f52296b;

    /* JADX INFO: renamed from: c */
    public boolean f52297c;

    /* JADX INFO: renamed from: d */
    public double f52298d;

    /* JADX INFO: renamed from: e */
    public double f52299e;

    /* JADX INFO: renamed from: f */
    public double f52300f;

    /* JADX INFO: renamed from: g */
    public double f52301g;

    /* JADX INFO: renamed from: h */
    public double f52302h;

    /* JADX INFO: renamed from: i */
    public double f52303i;

    /* JADX INFO: renamed from: j */
    public final xt4.C15289p f52304j;

    public jzf() {
        this.f52295a = Math.sqrt(1500.0d);
        this.f52296b = 0.5d;
        this.f52297c = false;
        this.f52303i = Double.MAX_VALUE;
        this.f52304j = new xt4.C15289p();
    }

    private void init() {
        if (this.f52297c) {
            return;
        }
        if (this.f52303i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.f52296b;
        if (d > 1.0d) {
            double d2 = this.f52295a;
            this.f52300f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.f52296b;
            double d4 = this.f52295a;
            this.f52301g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= 0.0d && d < 1.0d) {
            this.f52302h = this.f52295a * Math.sqrt(1.0d - (d * d));
        }
        this.f52297c = true;
    }

    /* JADX INFO: renamed from: a */
    public void m14390a(double d) {
        double dAbs = Math.abs(d);
        this.f52298d = dAbs;
        this.f52299e = dAbs * 62.5d;
    }

    /* JADX INFO: renamed from: b */
    public xt4.C15289p m14391b(double d, double d2, long j) {
        double dCos;
        double dPow;
        init();
        double d3 = j / 1000.0d;
        double d4 = d - this.f52303i;
        double d5 = this.f52296b;
        if (d5 > 1.0d) {
            double d6 = this.f52301g;
            double d7 = this.f52300f;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            dPow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f52300f * d3) * d9);
            double d10 = this.f52301g;
            double dPow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f52300f;
            dCos = dPow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.f52295a;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            dPow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double dPow3 = d14 * Math.pow(2.718281828459045d, (-this.f52295a) * d3);
            double d15 = this.f52295a;
            dCos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (dPow3 * (-d15));
        } else {
            double d16 = 1.0d / this.f52302h;
            double d17 = this.f52295a;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            double dPow4 = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.f52302h * d3) * d4) + (Math.sin(this.f52302h * d3) * d18));
            double d19 = this.f52295a;
            double d20 = this.f52296b;
            double d21 = (-d19) * dPow4 * d20;
            double dPow5 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d22 = this.f52302h;
            double dSin = (-d22) * d4 * Math.sin(d22 * d3);
            double d23 = this.f52302h;
            dCos = d21 + (dPow5 * (dSin + (d18 * d23 * Math.cos(d23 * d3))));
            dPow = dPow4;
        }
        xt4.C15289p c15289p = this.f52304j;
        c15289p.f99222a = (float) (dPow + this.f52303i);
        c15289p.f99223b = (float) dCos;
        return c15289p;
    }

    @Override // p000.xp6
    @p7e({p7e.EnumC10826a.f69934a})
    public float getAcceleration(float f, float f2) {
        float finalPosition = f - getFinalPosition();
        double d = this.f52295a;
        return (float) (((-(d * d)) * ((double) finalPosition)) - (((d * 2.0d) * this.f52296b) * ((double) f2)));
    }

    public float getDampingRatio() {
        return (float) this.f52296b;
    }

    public float getFinalPosition() {
        return (float) this.f52303i;
    }

    public float getStiffness() {
        double d = this.f52295a;
        return (float) (d * d);
    }

    @Override // p000.xp6
    @p7e({p7e.EnumC10826a.f69934a})
    public boolean isAtEquilibrium(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f52299e && ((double) Math.abs(f - getFinalPosition())) < this.f52298d;
    }

    public jzf setDampingRatio(@y46(from = 0.0d) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f52296b = f;
        this.f52297c = false;
        return this;
    }

    public jzf setFinalPosition(float f) {
        this.f52303i = f;
        return this;
    }

    public jzf setStiffness(@y46(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f52295a = Math.sqrt(f);
        this.f52297c = false;
        return this;
    }

    public jzf(float f) {
        this.f52295a = Math.sqrt(1500.0d);
        this.f52296b = 0.5d;
        this.f52297c = false;
        this.f52303i = Double.MAX_VALUE;
        this.f52304j = new xt4.C15289p();
        this.f52303i = f;
    }
}
