package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n75#2:129\n108#2,2:130\n75#2:132\n108#2,2:133\n1#3:135\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n34#1:129\n34#1:130,2\n36#1:132\n36#1:133,2\n*E\n"})
@e0g(parameters = 0)
public final class i19 {

    /* JADX INFO: renamed from: f */
    public static final int f45422f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final k5b f45423a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final k5b f45424b;

    /* JADX INFO: renamed from: c */
    public boolean f45425c;

    /* JADX INFO: renamed from: d */
    @gib
    public Object f45426d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final d09 f45427e;

    /* JADX WARN: Illegal instructions before constructor call */
    public i19() {
        int i = 0;
        this(i, i, 3, null);
    }

    private final void setScrollOffset(int i) {
        this.f45424b.setIntValue(i);
    }

    private final void update(int i, int i2) {
        if (i >= 0.0f) {
            setIndex(i);
            this.f45427e.update(i);
            setScrollOffset(i2);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
    }

    public final int getIndex() {
        return this.f45423a.getIntValue();
    }

    @yfb
    public final d09 getNearestRangeState() {
        return this.f45427e;
    }

    public final int getScrollOffset() {
        return this.f45424b.getIntValue();
    }

    public final void requestPositionAndForgetLastKnownKey(int i, int i2) {
        update(i, i2);
        this.f45426d = null;
    }

    public final void setIndex(int i) {
        this.f45423a.setIntValue(i);
    }

    public final void updateFromMeasureResult(@yfb a19 a19Var) {
        b19 firstVisibleItem = a19Var.getFirstVisibleItem();
        this.f45426d = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.f45425c || a19Var.getTotalItemsCount() > 0) {
            this.f45425c = true;
            int firstVisibleItemScrollOffset = a19Var.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset >= 0.0f) {
                b19 firstVisibleItem2 = a19Var.getFirstVisibleItem();
                update(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0, firstVisibleItemScrollOffset);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
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

    @ah5
    public final int updateScrollPositionIfTheFirstItemWasMoved(@yfb u09 u09Var, int i) {
        int iFindIndexByKey = wz8.findIndexByKey(u09Var, this.f45426d, i);
        if (i != iFindIndexByKey) {
            setIndex(iFindIndexByKey);
            this.f45427e.update(i);
        }
        return iFindIndexByKey;
    }

    public i19(int i, int i2) {
        this.f45423a = etf.mutableIntStateOf(i);
        this.f45424b = etf.mutableIntStateOf(i2);
        this.f45427e = new d09(i, 30, 100);
    }

    public /* synthetic */ i19(int i, int i2, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
