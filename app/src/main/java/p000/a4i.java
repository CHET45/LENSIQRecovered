package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class a4i<V extends AbstractC16313zy> implements t3i<V> {

    /* JADX INFO: renamed from: e */
    public static final int f409e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final w3i<V> f410a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final x1e f411b;

    /* JADX INFO: renamed from: c */
    public final long f412c;

    /* JADX INFO: renamed from: d */
    public final long f413d;

    public /* synthetic */ a4i(w3i w3iVar, x1e x1eVar, long j, jt3 jt3Var) {
        this(w3iVar, x1eVar, j);
    }

    private final long repetitionPlayTimeNanos(long j) {
        long j2 = this.f413d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f412c;
        long j5 = j3 / j4;
        return (this.f411b == x1e.Restart || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    private final V repetitionStartVelocity(long j, V v, V v2, V v3) {
        long j2 = this.f413d;
        long j3 = j + j2;
        long j4 = this.f412c;
        return j3 > j4 ? this.f410a.getVelocityFromNanos(j4 - j2, v, v3, v2) : v2;
    }

    @Override // p000.t3i
    public long getDurationNanos(@yfb V v, @yfb V v2, @yfb V v3) {
        return Long.MAX_VALUE;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.f412c;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return this.f410a.getValueFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        return this.f410a.getVelocityFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    @Override // p000.t3i
    public boolean isInfinite() {
        return true;
    }

    private a4i(w3i<V> w3iVar, x1e x1eVar, long j) {
        this.f410a = w3iVar;
        this.f411b = x1eVar;
        this.f412c = ((long) (w3iVar.getDelayMillis() + w3iVar.getDurationMillis())) * 1000000;
        this.f413d = j * 1000000;
    }

    public /* synthetic */ a4i(w3i w3iVar, x1e x1eVar, long j, int i, jt3 jt3Var) {
        this(w3iVar, (i & 2) != 0 ? x1e.Restart : x1eVar, (i & 4) != 0 ? s1g.m32247constructorimpl$default(0, 0, 2, null) : j, (jt3) null);
    }

    public /* synthetic */ a4i(w3i w3iVar, x1e x1eVar, int i, jt3 jt3Var) {
        this(w3iVar, (i & 2) != 0 ? x1e.Restart : x1eVar);
    }

    @q64(level = u64.f86867c, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ a4i(w3i w3iVar, x1e x1eVar) {
        this(w3iVar, x1eVar, s1g.m32247constructorimpl$default(0, 0, 2, null), (jt3) null);
    }
}
