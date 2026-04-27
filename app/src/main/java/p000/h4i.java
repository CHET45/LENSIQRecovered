package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class h4i<V extends AbstractC16313zy> implements w3i<V> {

    /* JADX INFO: renamed from: e */
    public static final int f42377e = 8;

    /* JADX INFO: renamed from: a */
    public final int f42378a;

    /* JADX INFO: renamed from: b */
    public final int f42379b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final hv4 f42380c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final y3i<V> f42381d;

    public h4i() {
        this(0, 0, null, 7, null);
    }

    @Override // p000.w3i
    public int getDelayMillis() {
        return this.f42379b;
    }

    @Override // p000.w3i
    public int getDurationMillis() {
        return this.f42378a;
    }

    @yfb
    public final hv4 getEasing() {
        return this.f42380c;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return (V) this.f42381d.getValueFromNanos(j, v, v2, v3);
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return (V) this.f42381d.getVelocityFromNanos(j, v, v2, v3);
    }

    public h4i(int i, int i2, @yfb hv4 hv4Var) {
        this.f42378a = i;
        this.f42379b = i2;
        this.f42380c = hv4Var;
        this.f42381d = new y3i<>(new h56(getDurationMillis(), getDelayMillis(), hv4Var));
    }

    public /* synthetic */ h4i(int i, int i2, hv4 hv4Var, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? qv4.getFastOutSlowInEasing() : hv4Var);
    }
}
