package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class uyf implements e46 {

    /* JADX INFO: renamed from: b */
    public static final int f89508b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final t36 f89509a;

    public uyf(@yfb c64 c64Var) {
        this.f89509a = new t36(vyf.getPlatformFlingScrollFriction(), c64Var);
    }

    private final float flingDistance(float f) {
        return this.f89509a.flingDistance(f) * Math.signum(f);
    }

    @Override // p000.e46
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // p000.e46
    public long getDurationNanos(float f, float f2) {
        return this.f89509a.flingDuration(f2) * 1000000;
    }

    @Override // p000.e46
    public float getTargetValue(float f, float f2) {
        return f + flingDistance(f2);
    }

    @Override // p000.e46
    public float getValueFromNanos(long j, float f, float f2) {
        return f + this.f89509a.flingInfo(f2).position(j / 1000000);
    }

    @Override // p000.e46
    public float getVelocityFromNanos(long j, float f, float f2) {
        return this.f89509a.flingInfo(f2).velocity(j / 1000000);
    }
}
