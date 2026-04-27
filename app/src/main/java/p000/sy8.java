package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n75#2:130\n108#2,2:131\n75#2:133\n108#2,2:134\n1#3:136\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n35#1:130\n35#1:131,2\n38#1:133\n38#1:134,2\n*E\n"})
@e0g(parameters = 0)
public final class sy8 {

    /* JADX INFO: renamed from: f */
    public static final int f83217f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final k5b f83218a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final k5b f83219b;

    /* JADX INFO: renamed from: c */
    public boolean f83220c;

    /* JADX INFO: renamed from: d */
    @gib
    public Object f83221d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final d09 f83222e;

    /* JADX WARN: Illegal instructions before constructor call */
    public sy8() {
        int i = 0;
        this(i, i, 3, null);
    }

    private final void setIndex(int i) {
        this.f83218a.setIntValue(i);
    }

    private final void setScrollOffset(int i) {
        this.f83219b.setIntValue(i);
    }

    private final void update(int i, int i2) {
        if (i >= 0.0f) {
            setIndex(i);
            this.f83222e.update(i);
            setScrollOffset(i2);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
    }

    public final int getIndex() {
        return this.f83218a.getIntValue();
    }

    @yfb
    public final d09 getNearestRangeState() {
        return this.f83222e;
    }

    public final int getScrollOffset() {
        return this.f83219b.getIntValue();
    }

    public final void requestPositionAndForgetLastKnownKey(int i, int i2) {
        update(i, i2);
        this.f83221d = null;
    }

    public final void updateFromMeasureResult(@yfb hy8 hy8Var) {
        iy8[] items;
        iy8 iy8Var;
        iy8[] items2;
        iy8 iy8Var2;
        ly8 firstVisibleLine = hy8Var.getFirstVisibleLine();
        this.f83221d = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (iy8Var2 = (iy8) e80.firstOrNull(items2)) == null) ? null : iy8Var2.getKey();
        if (this.f83220c || hy8Var.getTotalItemsCount() > 0) {
            this.f83220c = true;
            int firstVisibleLineScrollOffset = hy8Var.getFirstVisibleLineScrollOffset();
            if (firstVisibleLineScrollOffset >= 0.0f) {
                ly8 firstVisibleLine2 = hy8Var.getFirstVisibleLine();
                update((firstVisibleLine2 == null || (items = firstVisibleLine2.getItems()) == null || (iy8Var = (iy8) e80.firstOrNull(items)) == null) ? 0 : iy8Var.getIndex(), firstVisibleLineScrollOffset);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')').toString());
            }
        }
    }

    public final void updateScrollOffset(int i) {
        if (i >= 0.0f) {
            setScrollOffset(i);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i + ')').toString());
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(@yfb yx8 yx8Var, int i) {
        int iFindIndexByKey = wz8.findIndexByKey(yx8Var, this.f83221d, i);
        if (i != iFindIndexByKey) {
            setIndex(iFindIndexByKey);
            this.f83222e.update(i);
        }
        return iFindIndexByKey;
    }

    public sy8(int i, int i2) {
        this.f83218a = etf.mutableIntStateOf(i);
        this.f83219b = etf.mutableIntStateOf(i2);
        this.f83222e = new d09(i, 90, 200);
    }

    public /* synthetic */ sy8(int i, int i2, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
