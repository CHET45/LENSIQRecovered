package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class t36 {

    /* JADX INFO: renamed from: d */
    public static final int f83607d = 0;

    /* JADX INFO: renamed from: a */
    public final float f83608a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final c64 f83609b;

    /* JADX INFO: renamed from: c */
    public final float f83610c;

    /* JADX INFO: renamed from: t36$a */
    @e0g(parameters = 1)
    public static final class C12897a {

        /* JADX INFO: renamed from: d */
        public static final int f83611d = 0;

        /* JADX INFO: renamed from: a */
        public final float f83612a;

        /* JADX INFO: renamed from: b */
        public final float f83613b;

        /* JADX INFO: renamed from: c */
        public final long f83614c;

        public C12897a(float f, float f2, long j) {
            this.f83612a = f;
            this.f83613b = f2;
            this.f83614c = j;
        }

        public static /* synthetic */ C12897a copy$default(C12897a c12897a, float f, float f2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c12897a.f83612a;
            }
            if ((i & 2) != 0) {
                f2 = c12897a.f83613b;
            }
            if ((i & 4) != 0) {
                j = c12897a.f83614c;
            }
            return c12897a.copy(f, f2, j);
        }

        public final float component1() {
            return this.f83612a;
        }

        public final float component2() {
            return this.f83613b;
        }

        public final long component3() {
            return this.f83614c;
        }

        @yfb
        public final C12897a copy(float f, float f2, long j) {
            return new C12897a(f, f2, j);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12897a)) {
                return false;
            }
            C12897a c12897a = (C12897a) obj;
            return Float.compare(this.f83612a, c12897a.f83612a) == 0 && Float.compare(this.f83613b, c12897a.f83613b) == 0 && this.f83614c == c12897a.f83614c;
        }

        public final float getDistance() {
            return this.f83613b;
        }

        public final long getDuration() {
            return this.f83614c;
        }

        public final float getInitialVelocity() {
            return this.f83612a;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f83612a) * 31) + Float.hashCode(this.f83613b)) * 31) + Long.hashCode(this.f83614c);
        }

        public final float position(long j) {
            long j2 = this.f83614c;
            return this.f83613b * Math.signum(this.f83612a) * C10032ns.f65416a.flingPosition(j2 > 0 ? j / j2 : 1.0f).getDistanceCoefficient();
        }

        @yfb
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f83612a + ", distance=" + this.f83613b + ", duration=" + this.f83614c + ')';
        }

        public final float velocity(long j) {
            long j2 = this.f83614c;
            return (((C10032ns.f65416a.flingPosition(j2 > 0 ? j / j2 : 1.0f).getVelocityCoefficient() * Math.signum(this.f83612a)) * this.f83613b) / this.f83614c) * 1000.0f;
        }
    }

    public t36(float f, @yfb c64 c64Var) {
        this.f83608a = f;
        this.f83609b = c64Var;
        this.f83610c = computeDeceleration(c64Var);
    }

    private final float computeDeceleration(c64 c64Var) {
        return u36.computeDeceleration(0.84f, c64Var.getDensity());
    }

    private final double getSplineDeceleration(float f) {
        return C10032ns.f65416a.deceleration(f, this.f83608a * this.f83610c);
    }

    public final float flingDistance(float f) {
        return (float) (((double) (this.f83608a * this.f83610c)) * Math.exp((((double) u36.f86721c) / (((double) u36.f86721c) - 1.0d)) * getSplineDeceleration(f)));
    }

    public final long flingDuration(float f) {
        return (long) (Math.exp(getSplineDeceleration(f) / (((double) u36.f86721c) - 1.0d)) * 1000.0d);
    }

    @yfb
    public final C12897a flingInfo(float f) {
        double splineDeceleration = getSplineDeceleration(f);
        double d = ((double) u36.f86721c) - 1.0d;
        return new C12897a(f, (float) (((double) (this.f83608a * this.f83610c)) * Math.exp((((double) u36.f86721c) / d) * splineDeceleration)), (long) (Math.exp(splineDeceleration / d) * 1000.0d));
    }

    @yfb
    public final c64 getDensity() {
        return this.f83609b;
    }
}
