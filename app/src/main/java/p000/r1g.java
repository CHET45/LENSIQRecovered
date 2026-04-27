package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class r1g<V extends AbstractC16313zy> implements t3i<V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final t3i<V> f76788a;

    /* JADX INFO: renamed from: b */
    public final long f76789b;

    public r1g(@yfb t3i<V> t3iVar, long j) {
        this.f76788a = t3iVar;
        this.f76789b = j;
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof r1g)) {
            return false;
        }
        r1g r1gVar = (r1g) obj;
        return r1gVar.f76789b == this.f76789b && md8.areEqual(r1gVar.f76788a, this.f76788a);
    }

    @Override // p000.t3i
    public long getDurationNanos(@yfb V v, @yfb V v2, @yfb V v3) {
        return this.f76788a.getDurationNanos(v, v2, v3) + this.f76789b;
    }

    public final long getStartDelayNanos() {
        return this.f76789b;
    }

    @Override // p000.t3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        long j2 = this.f76789b;
        return j < j2 ? v : (V) this.f76788a.getValueFromNanos(j - j2, v, v2, v3);
    }

    @yfb
    public final t3i<V> getVectorizedAnimationSpec() {
        return this.f76788a;
    }

    @Override // p000.t3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3) {
        long j2 = this.f76789b;
        return j < j2 ? v3 : (V) this.f76788a.getVelocityFromNanos(j - j2, v, v2, v3);
    }

    public int hashCode() {
        return (this.f76788a.hashCode() * 31) + Long.hashCode(this.f76789b);
    }

    @Override // p000.t3i
    public boolean isInfinite() {
        return this.f76788a.isInfinite();
    }
}
