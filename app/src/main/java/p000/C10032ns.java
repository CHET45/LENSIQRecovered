package p000;

/* JADX INFO: renamed from: ns */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C10032ns {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C10032ns f65416a = new C10032ns();

    /* JADX INFO: renamed from: b */
    public static final int f65417b = 100;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final float[] f65418c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final float[] f65419d;

    /* JADX INFO: renamed from: e */
    public static final int f65420e;

    /* JADX INFO: renamed from: ns$a */
    @e0g(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c */
        public static final int f65421c = 0;

        /* JADX INFO: renamed from: a */
        public final float f65422a;

        /* JADX INFO: renamed from: b */
        public final float f65423b;

        public a(float f, float f2) {
            this.f65422a = f;
            this.f65423b = f2;
        }

        public static /* synthetic */ a copy$default(a aVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = aVar.f65422a;
            }
            if ((i & 2) != 0) {
                f2 = aVar.f65423b;
            }
            return aVar.copy(f, f2);
        }

        public final float component1() {
            return this.f65422a;
        }

        public final float component2() {
            return this.f65423b;
        }

        @yfb
        public final a copy(float f, float f2) {
            return new a(f, f2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f65422a, aVar.f65422a) == 0 && Float.compare(this.f65423b, aVar.f65423b) == 0;
        }

        public final float getDistanceCoefficient() {
            return this.f65422a;
        }

        public final float getVelocityCoefficient() {
            return this.f65423b;
        }

        public int hashCode() {
            return (Float.hashCode(this.f65422a) * 31) + Float.hashCode(this.f65423b);
        }

        @yfb
        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f65422a + ", velocityCoefficient=" + this.f65423b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f65418c = fArr;
        float[] fArr2 = new float[101];
        f65419d = fArr2;
        syf.computeSplineInfo(fArr, fArr2, 100);
        f65420e = 8;
    }

    private C10032ns() {
    }

    public final double deceleration(float f, float f2) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) f2));
    }

    @yfb
    public final a flingPosition(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fCoerceIn = kpd.coerceIn(f, 0.0f, 1.0f);
        float f4 = 100;
        int i = (int) (f4 * fCoerceIn);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = f65418c;
            float f7 = fArr[i];
            float f8 = (fArr[i2] - f7) / (f6 - f5);
            float f9 = ((fCoerceIn - f5) * f8) + f7;
            f2 = f8;
            f3 = f9;
        }
        return new a(f3, f2);
    }
}
