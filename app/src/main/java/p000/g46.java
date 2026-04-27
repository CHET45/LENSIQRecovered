package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class g46 implements e46 {

    /* JADX INFO: renamed from: c */
    public static final int f38424c = 0;

    /* JADX INFO: renamed from: a */
    public final float f38425a;

    /* JADX INFO: renamed from: b */
    public final float f38426b;

    /* JADX WARN: Illegal instructions before constructor call */
    public g46() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    @Override // p000.e46
    public float getAbsVelocityThreshold() {
        return this.f38425a;
    }

    @Override // p000.e46
    public long getDurationNanos(float f, float f2) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f2))) * 1000.0f) / this.f38426b)) * 1000000;
    }

    @Override // p000.e46
    public float getTargetValue(float f, float f2) {
        if (Math.abs(f2) <= getAbsVelocityThreshold()) {
            return f;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / f2));
        float f3 = this.f38426b;
        return (f - (f2 / f3)) + ((f2 / f3) * ((float) Math.exp((((double) f3) * ((dLog / ((double) f3)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    @Override // p000.e46
    public float getValueFromNanos(long j, float f, float f2) {
        float f3 = this.f38426b;
        return (f - (f2 / f3)) + ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f)));
    }

    @Override // p000.e46
    public float getVelocityFromNanos(long j, float f, float f2) {
        return f2 * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f38426b));
    }

    public g46(@y46(from = 0.0d, fromInclusive = false) float f, @y46(from = 0.0d, fromInclusive = false) float f2) {
        this.f38425a = Math.max(1.0E-7f, Math.abs(f2));
        this.f38426b = Math.max(1.0E-4f, f) * (-4.2f);
    }

    public /* synthetic */ g46(float f, float f2, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.1f : f2);
    }
}
