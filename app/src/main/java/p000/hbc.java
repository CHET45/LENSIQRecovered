package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hbc implements sd1 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final dcc f43096b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final sd1 f43097c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final InterfaceC11178py<Float> f43098d;

    public hbc(@yfb dcc dccVar, @yfb sd1 sd1Var) {
        this.f43096b = dccVar;
        this.f43097c = sd1Var;
        this.f43098d = sd1Var.getScrollAnimationSpec();
    }

    private final float overrideProposedOffsetMove(float f) {
        float firstVisiblePageOffset$foundation_release = this.f43096b.getFirstVisiblePageOffset$foundation_release() * (-1);
        while (f > 0.0f && firstVisiblePageOffset$foundation_release < f) {
            firstVisiblePageOffset$foundation_release += this.f43096b.getPageSizeWithSpacing$foundation_release();
        }
        while (f < 0.0f && firstVisiblePageOffset$foundation_release > f) {
            firstVisiblePageOffset$foundation_release -= this.f43096b.getPageSizeWithSpacing$foundation_release();
        }
        return firstVisiblePageOffset$foundation_release;
    }

    @Override // p000.sd1
    public float calculateScrollDistance(float f, float f2, float f3) {
        float fCalculateScrollDistance = this.f43097c.calculateScrollDistance(f, f2, f3);
        if (fCalculateScrollDistance != 0.0f) {
            return overrideProposedOffsetMove(fCalculateScrollDistance);
        }
        if (this.f43096b.getFirstVisiblePageOffset$foundation_release() == 0) {
            return 0.0f;
        }
        float firstVisiblePageOffset$foundation_release = this.f43096b.getFirstVisiblePageOffset$foundation_release() * (-1.0f);
        if (this.f43096b.getLastScrolledForward()) {
            firstVisiblePageOffset$foundation_release += this.f43096b.getPageSizeWithSpacing$foundation_release();
        }
        return kpd.coerceIn(firstVisiblePageOffset$foundation_release, -f3, f3);
    }

    @yfb
    public final sd1 getDefaultBringIntoViewSpec() {
        return this.f43097c;
    }

    @yfb
    public final dcc getPagerState() {
        return this.f43096b;
    }

    @Override // p000.sd1
    @yfb
    public InterfaceC11178py<Float> getScrollAnimationSpec() {
        return this.f43098d;
    }
}
