package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class e4i<V extends AbstractC16313zy> implements x3i<V> {

    /* JADX INFO: renamed from: f */
    public static final int f31795f = 8;

    /* JADX INFO: renamed from: a */
    public final int f31796a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final w3i<V> f31797b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final x1e f31798c;

    /* JADX INFO: renamed from: d */
    public final long f31799d;

    /* JADX INFO: renamed from: e */
    public final long f31800e;

    public /* synthetic */ e4i(int i, w3i w3iVar, x1e x1eVar, long j, jt3 jt3Var) {
        this(i, w3iVar, x1eVar, j);
    }

    private final long repetitionPlayTimeNanos(long j) {
        long j2 = this.f31800e;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long jMin = Math.min(j3 / this.f31799d, ((long) this.f31796a) - 1);
        return (this.f31798c == x1e.Restart || jMin % ((long) 2) == 0) ? j3 - (jMin * this.f31799d) : ((jMin + 1) * this.f31799d) - j3;
    }

    private final V repetitionStartVelocity(long j, V v, V v2, V v3) {
        long j2 = this.f31800e;
        long j3 = j + j2;
        long j4 = this.f31799d;
        return j3 > j4 ? (V) getVelocityFromNanos(j4 - j2, v, v2, v3) : v2;
    }

    @Override // p000.t3i
    public long getDurationNanos(@yfb V v, @yfb V v2, @yfb V v3) {
        return (((long) this.f31796a) * this.f31799d) - this.f31800e;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.f31799d;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return this.f31797b.getValueFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return this.f31797b.getVelocityFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    private e4i(int i, w3i<V> w3iVar, x1e x1eVar, long j) {
        this.f31796a = i;
        this.f31797b = w3iVar;
        this.f31798c = x1eVar;
        if (i < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.f31799d = ((long) (w3iVar.getDelayMillis() + w3iVar.getDurationMillis())) * 1000000;
        this.f31800e = j * 1000000;
    }

    public /* synthetic */ e4i(int i, w3i w3iVar, x1e x1eVar, long j, int i2, jt3 jt3Var) {
        this(i, w3iVar, (i2 & 4) != 0 ? x1e.Restart : x1eVar, (i2 & 8) != 0 ? s1g.m32247constructorimpl$default(0, 0, 2, null) : j, (jt3) null);
    }

    public /* synthetic */ e4i(int i, w3i w3iVar, x1e x1eVar, int i2, jt3 jt3Var) {
        this(i, w3iVar, (i2 & 4) != 0 ? x1e.Restart : x1eVar);
    }

    @q64(level = u64.f86867c, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ e4i(int i, w3i w3iVar, x1e x1eVar) {
        this(i, w3iVar, x1eVar, s1g.m32247constructorimpl$default(0, 0, 2, null), (jt3) null);
    }
}
