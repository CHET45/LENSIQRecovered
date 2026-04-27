package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class e56 implements x36 {

    /* JADX INFO: renamed from: e */
    public static final int f31836e = 8;

    /* JADX INFO: renamed from: a */
    public final float f31837a;

    /* JADX INFO: renamed from: b */
    public final float f31838b;

    /* JADX INFO: renamed from: c */
    public final float f31839c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final kzf f31840d;

    public e56() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public final float getDampingRatio() {
        return this.f31837a;
    }

    @Override // p000.x36
    public long getDurationNanos(float f, float f2, float f3) {
        float stiffness = this.f31840d.getStiffness();
        float dampingRatio = this.f31840d.getDampingRatio();
        float f4 = f - f2;
        float f5 = this.f31839c;
        return izf.estimateAnimationDurationMillis(stiffness, dampingRatio, f3 / f5, f4 / f5, 1.0f) * 1000000;
    }

    @Override // p000.x36
    public float getEndVelocity(float f, float f2, float f3) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.f31838b;
    }

    @Override // p000.x36
    public float getValueFromNanos(long j, float f, float f2, float f3) {
        this.f31840d.setFinalPosition(f2);
        return aza.m27916getValueimpl(this.f31840d.m30802updateValuesIJZedt4$animation_core_release(f, f3, j / 1000000));
    }

    @Override // p000.x36
    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        this.f31840d.setFinalPosition(f2);
        return aza.m27917getVelocityimpl(this.f31840d.m30802updateValuesIJZedt4$animation_core_release(f, f3, j / 1000000));
    }

    public e56(float f, float f2, float f3) {
        this.f31837a = f;
        this.f31838b = f2;
        this.f31839c = f3;
        kzf kzfVar = new kzf(1.0f);
        kzfVar.setDampingRatio(f);
        kzfVar.setStiffness(f2);
        this.f31840d = kzfVar;
    }

    public /* synthetic */ e56(float f, float f2, float f3, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
