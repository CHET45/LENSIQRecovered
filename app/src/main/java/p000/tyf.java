package p000;

import p000.C10621os;

/* JADX INFO: loaded from: classes.dex */
public final class tyf implements e46 {

    /* JADX INFO: renamed from: a */
    public final float f86350a;

    public tyf(@yfb c64 c64Var) {
        this.f86350a = c64Var.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f) {
        return C10621os.f68517a.deceleration(f, wni.f94882b * this.f86350a);
    }

    public final float flingDistance(float f) {
        return ((float) (((double) (wni.f94882b * this.f86350a)) * Math.exp((wni.f94885e / wni.f94886f) * getSplineDeceleration(f)))) * Math.signum(f);
    }

    @Override // p000.e46
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // p000.e46
    public long getDurationNanos(float f, float f2) {
        return (long) (Math.exp(getSplineDeceleration(f2) / wni.f94886f) * 1.0E9d);
    }

    @Override // p000.e46
    public float getTargetValue(float f, float f2) {
        return f + flingDistance(f2);
    }

    @Override // p000.e46
    public float getValueFromNanos(long j, float f, float f2) {
        long durationNanos = getDurationNanos(0.0f, f2);
        return f + (flingDistance(f2) * C10621os.a.m31632getDistanceCoefficientimpl(C10621os.f68517a.m31627flingPositionLfoxSSI(durationNanos > 0 ? j / durationNanos : 1.0f)));
    }

    @Override // p000.e46
    public float getVelocityFromNanos(long j, float f, float f2) {
        long durationNanos = getDurationNanos(0.0f, f2);
        return ((C10621os.a.m31633getVelocityCoefficientimpl(C10621os.f68517a.m31627flingPositionLfoxSSI(durationNanos > 0 ? j / durationNanos : 1.0f)) * flingDistance(f2)) / durationNanos) * 1.0E9f;
    }
}
