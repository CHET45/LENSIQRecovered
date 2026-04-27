package p000;

import p000.xt4;

/* JADX INFO: loaded from: classes3.dex */
public final class r36 extends xt4<r36> {

    /* JADX INFO: renamed from: G */
    public final C11867a f76964G;

    /* JADX INFO: renamed from: r36$a */
    public static final class C11867a implements xp6 {

        /* JADX INFO: renamed from: d */
        public static final float f76965d = -4.2f;

        /* JADX INFO: renamed from: e */
        public static final float f76966e = 62.5f;

        /* JADX INFO: renamed from: b */
        public float f76968b;

        /* JADX INFO: renamed from: a */
        public float f76967a = -4.2f;

        /* JADX INFO: renamed from: c */
        public final xt4.C15289p f76969c = new xt4.C15289p();

        /* JADX INFO: renamed from: a */
        public float m20960a() {
            return this.f76967a / (-4.2f);
        }

        /* JADX INFO: renamed from: b */
        public void m20961b(float f) {
            this.f76967a = f * (-4.2f);
        }

        /* JADX INFO: renamed from: c */
        public void m20962c(float f) {
            this.f76968b = f * 62.5f;
        }

        /* JADX INFO: renamed from: d */
        public xt4.C15289p m20963d(float f, float f2, long j) {
            float f3 = j;
            this.f76969c.f99223b = (float) (((double) f2) * Math.exp((f3 / 1000.0f) * this.f76967a));
            xt4.C15289p c15289p = this.f76969c;
            float f4 = this.f76967a;
            c15289p.f99222a = (float) (((double) (f - (f2 / f4))) + (((double) (f2 / f4)) * Math.exp((f4 * f3) / 1000.0f)));
            xt4.C15289p c15289p2 = this.f76969c;
            if (isAtEquilibrium(c15289p2.f99222a, c15289p2.f99223b)) {
                this.f76969c.f99223b = 0.0f;
            }
            return this.f76969c;
        }

        @Override // p000.xp6
        public float getAcceleration(float f, float f2) {
            return f2 * this.f76967a;
        }

        @Override // p000.xp6
        public boolean isAtEquilibrium(float f, float f2) {
            return Math.abs(f2) < this.f76968b;
        }
    }

    public r36(k56 k56Var) {
        super(k56Var);
        C11867a c11867a = new C11867a();
        this.f76964G = c11867a;
        c11867a.m20962c(m25444b());
    }

    @Override // p000.xt4
    /* JADX INFO: renamed from: a */
    public float mo12675a(float f, float f2) {
        return this.f76964G.getAcceleration(f, f2);
    }

    @Override // p000.xt4
    /* JADX INFO: renamed from: c */
    public boolean mo12676c(float f, float f2) {
        return f >= this.f99214g || f <= this.f99215h || this.f76964G.isAtEquilibrium(f, f2);
    }

    @Override // p000.xt4
    /* JADX INFO: renamed from: e */
    public void mo12677e(float f) {
        this.f76964G.m20962c(f);
    }

    @Override // p000.xt4
    /* JADX INFO: renamed from: f */
    public boolean mo12678f(long j) {
        xt4.C15289p c15289pM20963d = this.f76964G.m20963d(this.f99209b, this.f99208a, j);
        float f = c15289pM20963d.f99222a;
        this.f99209b = f;
        float f2 = c15289pM20963d.f99223b;
        this.f99208a = f2;
        float f3 = this.f99215h;
        if (f < f3) {
            this.f99209b = f3;
            return true;
        }
        float f4 = this.f99214g;
        if (f <= f4) {
            return mo12676c(f, f2);
        }
        this.f99209b = f4;
        return true;
    }

    public float getFriction() {
        return this.f76964G.m20960a();
    }

    public r36 setFriction(@y46(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.f76964G.m20961b(f);
        return this;
    }

    @Override // p000.xt4
    public r36 setMaxValue(float f) {
        super.setMaxValue(f);
        return this;
    }

    @Override // p000.xt4
    public r36 setMinValue(float f) {
        super.setMinValue(f);
        return this;
    }

    @Override // p000.xt4
    public r36 setStartVelocity(float f) {
        super.setStartVelocity(f);
        return this;
    }

    public <K> r36(K k, x46<K> x46Var) {
        super(k, x46Var);
        C11867a c11867a = new C11867a();
        this.f76964G = c11867a;
        c11867a.m20962c(m25444b());
    }
}
