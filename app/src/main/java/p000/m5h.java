package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m5h {

    /* JADX INFO: renamed from: a */
    @gib
    public final t7c f59954a;

    /* JADX INFO: renamed from: b */
    public long f59955b;

    public m5h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m30962calculatePostSlopOffsettuRUvjQ(float f) {
        if (this.f59954a == null) {
            long j = this.f59955b;
            return izb.m30433minusMKHz9U(this.f59955b, izb.m30436timestuRUvjQ(izb.m30424divtuRUvjQ(j, izb.m30427getDistanceimpl(j)), f));
        }
        float fM30965mainAxisk4lQ0M = m30965mainAxisk4lQ0M(this.f59955b) - (Math.signum(m30965mainAxisk4lQ0M(this.f59955b)) * f);
        float fM30964crossAxisk4lQ0M = m30964crossAxisk4lQ0M(this.f59955b);
        return this.f59954a == t7c.Horizontal ? mzb.Offset(fM30965mainAxisk4lQ0M, fM30964crossAxisk4lQ0M) : mzb.Offset(fM30964crossAxisk4lQ0M, fM30965mainAxisk4lQ0M);
    }

    @gib
    /* JADX INFO: renamed from: addPointerInputChange-GcwITfU, reason: not valid java name */
    public final izb m30963addPointerInputChangeGcwITfU(@yfb h2d h2dVar, float f) {
        long jM30434plusMKHz9U = izb.m30434plusMKHz9U(this.f59955b, izb.m30433minusMKHz9U(h2dVar.m29911getPositionF1C5BW0(), h2dVar.m29912getPreviousPositionF1C5BW0()));
        this.f59955b = jM30434plusMKHz9U;
        if ((this.f59954a == null ? izb.m30427getDistanceimpl(jM30434plusMKHz9U) : Math.abs(m30965mainAxisk4lQ0M(jM30434plusMKHz9U))) >= f) {
            return izb.m30418boximpl(m30962calculatePostSlopOffsettuRUvjQ(f));
        }
        return null;
    }

    /* JADX INFO: renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m30964crossAxisk4lQ0M(long j) {
        return this.f59954a == t7c.Horizontal ? izb.m30430getYimpl(j) : izb.m30429getXimpl(j);
    }

    @gib
    public final t7c getOrientation() {
        return this.f59954a;
    }

    /* JADX INFO: renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m30965mainAxisk4lQ0M(long j) {
        return this.f59954a == t7c.Horizontal ? izb.m30429getXimpl(j) : izb.m30430getYimpl(j);
    }

    public final void reset() {
        this.f59955b = izb.f49009b.m30445getZeroF1C5BW0();
    }

    public m5h(@gib t7c t7cVar) {
        this.f59954a = t7cVar;
        this.f59955b = izb.f49009b.m30445getZeroF1C5BW0();
    }

    public /* synthetic */ m5h(t7c t7cVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : t7cVar);
    }
}
