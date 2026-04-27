package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class g4i<V extends AbstractC16313zy> implements x3i<V> {

    /* JADX INFO: renamed from: d */
    public static final int f38779d = 8;

    /* JADX INFO: renamed from: a */
    public final float f38780a;

    /* JADX INFO: renamed from: b */
    public final float f38781b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y3i<V> f38782c;

    private g4i(float f, float f2, InterfaceC2106bz interfaceC2106bz) {
        this.f38780a = f;
        this.f38781b = f2;
        this.f38782c = new y3i<>(interfaceC2106bz);
    }

    public final float getDampingRatio() {
        return this.f38780a;
    }

    @Override // p000.t3i
    public long getDurationNanos(@yfb V v, @yfb V v2, @yfb V v3) {
        return this.f38782c.getDurationNanos(v, v2, v3);
    }

    @Override // p000.t3i
    @yfb
    public V getEndVelocity(@yfb V v, @yfb V v2, @yfb V v3) {
        return (V) this.f38782c.getEndVelocity(v, v2, v3);
    }

    public final float getStiffness() {
        return this.f38781b;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return (V) this.f38782c.getValueFromNanos(j, v, v2, v3);
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return (V) this.f38782c.getVelocityFromNanos(j, v, v2, v3);
    }

    @Override // p000.x3i, p000.t3i
    public boolean isInfinite() {
        return this.f38782c.isInfinite();
    }

    public /* synthetic */ g4i(float f, float f2, AbstractC16313zy abstractC16313zy, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : abstractC16313zy);
    }

    public g4i(float f, float f2, @gib V v) {
        this(f, f2, u3i.createSpringAnimations(v, f, f2));
    }
}
