package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPositionKt\n*L\n1#1,146:1\n75#2:147\n108#2,2:148\n76#3:150\n109#3,2:151\n136#4,4:153\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n38#1:147\n38#1:148,2\n41#1:150\n41#1:151,2\n114#1:153,4\n*E\n"})
@e0g(parameters = 0)
public final class wbc {

    /* JADX INFO: renamed from: g */
    public static final int f93897g = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final dcc f93898a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final k5b f93899b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final b5b f93900c;

    /* JADX INFO: renamed from: d */
    public boolean f93901d;

    /* JADX INFO: renamed from: e */
    @gib
    public Object f93902e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final d09 f93903f;

    public wbc(int i, float f, @yfb dcc dccVar) {
        this.f93898a = dccVar;
        this.f93899b = etf.mutableIntStateOf(i);
        this.f93900c = pbd.mutableFloatStateOf(f);
        this.f93903f = new d09(i, 30, 100);
    }

    private final void setCurrentPage(int i) {
        this.f93899b.setIntValue(i);
    }

    private final void setCurrentPageOffsetFraction(float f) {
        this.f93900c.setFloatValue(f);
    }

    private final void update(int i, float f) {
        setCurrentPage(i);
        this.f93903f.update(i);
        setCurrentPageOffsetFraction(f);
    }

    public final void applyScrollDelta(int i) {
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + (this.f93898a.getPageSizeWithSpacing$foundation_release() == 0 ? 0.0f : i / this.f93898a.getPageSizeWithSpacing$foundation_release()));
    }

    public final int getCurrentPage() {
        return this.f93899b.getIntValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.f93900c.getFloatValue();
    }

    @yfb
    public final d09 getNearestRangeState() {
        return this.f93903f;
    }

    @yfb
    public final dcc getState() {
        return this.f93898a;
    }

    public final int matchPageWithKey(@yfb qbc qbcVar, int i) {
        int iFindIndexByKey = wz8.findIndexByKey(qbcVar, this.f93902e, i);
        if (i != iFindIndexByKey) {
            setCurrentPage(iFindIndexByKey);
            this.f93903f.update(i);
        }
        return iFindIndexByKey;
    }

    public final void requestPositionAndForgetLastKnownKey(int i, float f) {
        update(i, f);
        this.f93902e = null;
    }

    public final void updateCurrentPageOffsetFraction(float f) {
        setCurrentPageOffsetFraction(f);
    }

    public final void updateFromMeasureResult(@yfb tbc tbcVar) {
        bca currentPage = tbcVar.getCurrentPage();
        this.f93902e = currentPage != null ? currentPage.getKey() : null;
        if (this.f93901d || !tbcVar.getVisiblePagesInfo().isEmpty()) {
            this.f93901d = true;
            bca currentPage2 = tbcVar.getCurrentPage();
            update(currentPage2 != null ? currentPage2.getIndex() : 0, tbcVar.getCurrentPageOffsetFraction());
        }
    }

    public /* synthetic */ wbc(int i, float f, dcc dccVar, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, dccVar);
    }
}
