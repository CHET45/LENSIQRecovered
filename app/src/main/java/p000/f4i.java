package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 2)
public final class f4i<V extends AbstractC16313zy> implements w3i<V> {

    /* JADX INFO: renamed from: b */
    public static final int f35331b = 0;

    /* JADX INFO: renamed from: a */
    public final int f35332a;

    public f4i() {
        this(0, 1, null);
    }

    @Override // p000.w3i
    public int getDelayMillis() {
        return this.f35332a;
    }

    @Override // p000.w3i
    public int getDurationMillis() {
        return 0;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return j < ((long) getDelayMillis()) * 1000000 ? v : v2;
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return v3;
    }

    public f4i(int i) {
        this.f35332a = i;
    }

    public /* synthetic */ f4i(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
