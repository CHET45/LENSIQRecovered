package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,265:1\n71#2,16:266\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n*L\n218#1:266,16\n*E\n"})
@e0g(parameters = 1)
public final class h56 implements x36 {

    /* JADX INFO: renamed from: f */
    public static final int f42402f = 0;

    /* JADX INFO: renamed from: a */
    public final int f42403a;

    /* JADX INFO: renamed from: b */
    public final int f42404b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final hv4 f42405c;

    /* JADX INFO: renamed from: d */
    public final long f42406d;

    /* JADX INFO: renamed from: e */
    public final long f42407e;

    public h56() {
        this(0, 0, null, 7, null);
    }

    private final long clampPlayTimeNanos(long j) {
        return kpd.coerceIn(j - this.f42407e, 0L, this.f42406d);
    }

    public final int getDelay() {
        return this.f42404b;
    }

    public final int getDuration() {
        return this.f42403a;
    }

    @Override // p000.x36
    public long getDurationNanos(float f, float f2, float f3) {
        return ((long) (this.f42404b + this.f42403a)) * 1000000;
    }

    @Override // p000.x36
    public float getValueFromNanos(long j, float f, float f2, float f3) {
        float fClampPlayTimeNanos = this.f42403a == 0 ? 1.0f : clampPlayTimeNanos(j) / this.f42406d;
        hv4 hv4Var = this.f42405c;
        if (fClampPlayTimeNanos < 0.0f) {
            fClampPlayTimeNanos = 0.0f;
        }
        return g3i.lerp(f, f2, hv4Var.transform(fClampPlayTimeNanos <= 1.0f ? fClampPlayTimeNanos : 1.0f));
    }

    @Override // p000.x36
    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long jClampPlayTimeNanos = clampPlayTimeNanos(j);
        if (jClampPlayTimeNanos < 0) {
            return 0.0f;
        }
        if (jClampPlayTimeNanos == 0) {
            return f3;
        }
        return (getValueFromNanos(jClampPlayTimeNanos, f, f2, f3) - getValueFromNanos(jClampPlayTimeNanos - 1000000, f, f2, f3)) * 1000.0f;
    }

    public h56(int i, int i2, @yfb hv4 hv4Var) {
        this.f42403a = i;
        this.f42404b = i2;
        this.f42405c = hv4Var;
        this.f42406d = ((long) i) * 1000000;
        this.f42407e = ((long) i2) * 1000000;
    }

    public /* synthetic */ h56(int i, int i2, hv4 hv4Var, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? qv4.getFastOutSlowInEasing() : hv4Var);
    }
}
