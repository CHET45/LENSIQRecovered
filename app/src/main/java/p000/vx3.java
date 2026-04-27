package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class vx3 implements hab {

    /* JADX INFO: renamed from: a */
    @yfb
    public final dcc f92540a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final t7c f92541b;

    public vx3(@yfb dcc dccVar, @yfb t7c t7cVar) {
        this.f92540a = dccVar;
        this.f92541b = t7cVar;
    }

    /* JADX INFO: renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m32819mainAxisk4lQ0M(long j) {
        return this.f92541b == t7c.Horizontal ? izb.m30429getXimpl(j) : izb.m30430getYimpl(j);
    }

    /* JADX INFO: renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m32820consumeOnOrientationQWom1Mo(long j, @yfb t7c t7cVar) {
        return t7cVar == t7c.Vertical ? i4i.m30153copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null) : i4i.m30153copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
    }

    @yfb
    public final t7c getOrientation() {
        return this.f92541b;
    }

    @yfb
    public final dcc getState() {
        return this.f92540a;
    }

    @Override // p000.hab
    @gib
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo29969onPostFlingRZ2iAVY(long j, long j2, @yfb zy2<? super i4i> zy2Var) {
        return i4i.m30148boximpl(m32820consumeOnOrientationQWom1Mo(j2, this.f92541b));
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo29970onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!oab.m31311equalsimpl0(i, oab.f66990b.m31322getSideEffectWNlRxjI()) || m32819mainAxisk4lQ0M(j2) == 0.0f) {
            return izb.f49009b.m30445getZeroF1C5BW0();
        }
        throw new CancellationException();
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo29972onPreScrollOzD1aCk(long j, int i) {
        if (!oab.m31311equalsimpl0(i, oab.f66990b.m31323getUserInputWNlRxjI()) || Math.abs(this.f92540a.getCurrentPageOffsetFraction()) <= 1.0E-6d) {
            return izb.f49009b.m30445getZeroF1C5BW0();
        }
        float currentPageOffsetFraction = this.f92540a.getCurrentPageOffsetFraction() * this.f92540a.getPageSize$foundation_release();
        float pageSize = ((this.f92540a.getLayoutInfo().getPageSize() + this.f92540a.getLayoutInfo().getPageSpacing()) * (-Math.signum(this.f92540a.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
        if (this.f92540a.getCurrentPageOffsetFraction() > 0.0f) {
            pageSize = currentPageOffsetFraction;
            currentPageOffsetFraction = pageSize;
        }
        t7c t7cVar = this.f92541b;
        t7c t7cVar2 = t7c.Horizontal;
        float fM30430getYimpl = -this.f92540a.dispatchRawDelta(-kpd.coerceIn(t7cVar == t7cVar2 ? izb.m30429getXimpl(j) : izb.m30430getYimpl(j), currentPageOffsetFraction, pageSize));
        float fM30429getXimpl = this.f92541b == t7cVar2 ? fM30430getYimpl : izb.m30429getXimpl(j);
        if (this.f92541b != t7c.Vertical) {
            fM30430getYimpl = izb.m30430getYimpl(j);
        }
        return izb.m30422copydBAh8RU(j, fM30429getXimpl, fM30430getYimpl);
    }
}
