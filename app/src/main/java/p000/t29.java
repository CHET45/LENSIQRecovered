package p000;

import java.util.List;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,173:1\n75#2:174\n108#2,2:175\n75#2:177\n108#2,2:178\n13600#3,2:180\n116#4,2:182\n33#4,6:184\n118#4:190\n602#5,8:191\n602#5,8:199\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n37#1:174\n37#1:175,2\n41#1:177\n41#1:178,2\n48#1:180,2\n86#1:182,2\n86#1:184,6\n86#1:190\n94#1:191,8\n146#1:199,8\n*E\n"})
@e0g(parameters = 0)
public final class t29 {

    /* JADX INFO: renamed from: i */
    public static final int f83497i = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<Integer, Integer, int[]> f83498a;

    /* JADX INFO: renamed from: b */
    @yfb
    public int[] f83499b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final k5b f83500c;

    /* JADX INFO: renamed from: d */
    @yfb
    public int[] f83501d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final k5b f83502e;

    /* JADX INFO: renamed from: f */
    public boolean f83503f;

    /* JADX INFO: renamed from: g */
    @gib
    public Object f83504g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final d09 f83505h;

    /* JADX WARN: Multi-variable type inference failed */
    public t29(@yfb int[] iArr, @yfb int[] iArr2, @yfb gz6<? super Integer, ? super Integer, int[]> gz6Var) {
        this.f83498a = gz6Var;
        this.f83499b = iArr;
        this.f83500c = etf.mutableIntStateOf(calculateFirstVisibleIndex(iArr));
        this.f83501d = iArr2;
        this.f83502e = etf.mutableIntStateOf(calculateFirstVisibleScrollOffset(iArr, iArr2));
        Integer numMinOrNull = e80.minOrNull(iArr);
        this.f83505h = new d09(numMinOrNull != null ? numMinOrNull.intValue() : 0, 90, 200);
    }

    private final int calculateFirstVisibleIndex(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    private final int calculateFirstVisibleScrollOffset(int[] iArr, int[] iArr2) {
        int iCalculateFirstVisibleIndex = calculateFirstVisibleIndex(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iCalculateFirstVisibleIndex) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    private final void setIndex(int i) {
        this.f83500c.setIntValue(i);
    }

    private final void setScrollOffset(int i) {
        this.f83502e.setIntValue(i);
    }

    private final void update(int[] iArr, int[] iArr2) {
        this.f83499b = iArr;
        setIndex(calculateFirstVisibleIndex(iArr));
        this.f83501d = iArr2;
        setScrollOffset(calculateFirstVisibleScrollOffset(iArr, iArr2));
    }

    public final int getIndex() {
        return this.f83500c.getIntValue();
    }

    @yfb
    public final int[] getIndices() {
        return this.f83499b;
    }

    @yfb
    public final d09 getNearestRangeState() {
        return this.f83505h;
    }

    public final int getScrollOffset() {
        return this.f83502e.getIntValue();
    }

    @yfb
    public final int[] getScrollOffsets() {
        return this.f83501d;
    }

    public final void requestPositionAndForgetLastKnownKey(int i, int i2) {
        int[] iArrInvoke = this.f83498a.invoke(Integer.valueOf(i), Integer.valueOf(this.f83499b.length));
        int length = iArrInvoke.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = i2;
        }
        update(iArrInvoke, iArr);
        this.f83505h.update(i);
        this.f83504g = null;
    }

    public final void updateFromMeasureResult(@yfb o29 o29Var) {
        q29 q29Var;
        int iCalculateFirstVisibleIndex = calculateFirstVisibleIndex(o29Var.getFirstVisibleItemIndices());
        List<q29> visibleItemsInfo = o29Var.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                q29Var = null;
                break;
            }
            q29Var = visibleItemsInfo.get(i);
            if (q29Var.getIndex() == iCalculateFirstVisibleIndex) {
                break;
            } else {
                i++;
            }
        }
        q29 q29Var2 = q29Var;
        this.f83504g = q29Var2 != null ? q29Var2.getKey() : null;
        this.f83505h.update(iCalculateFirstVisibleIndex);
        if (this.f83503f || o29Var.getTotalItemsCount() > 0) {
            this.f83503f = true;
            ssf.C12771a c12771a = ssf.f82790e;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                update(o29Var.getFirstVisibleItemIndices(), o29Var.getFirstVisibleItemScrollOffsets());
                bth bthVar = bth.f14751a;
            } finally {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            }
        }
    }

    public final void updateScrollOffset(@yfb int[] iArr) {
        this.f83501d = iArr;
        setScrollOffset(calculateFirstVisibleScrollOffset(this.f83499b, iArr));
    }

    @ah5
    @yfb
    public final int[] updateScrollPositionIfTheFirstItemWasMoved(@yfb vz8 vz8Var, @yfb int[] iArr) {
        Object obj = this.f83504g;
        Integer orNull = e80.getOrNull(iArr, 0);
        int iFindIndexByKey = wz8.findIndexByKey(vz8Var, obj, orNull != null ? orNull.intValue() : 0);
        if (!e80.contains(iArr, iFindIndexByKey)) {
            this.f83505h.update(iFindIndexByKey);
            ssf.C12771a c12771a = ssf.f82790e;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                iArr = this.f83498a.invoke(Integer.valueOf(iFindIndexByKey), Integer.valueOf(iArr.length));
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                this.f83499b = iArr;
                setIndex(calculateFirstVisibleIndex(iArr));
            } catch (Throwable th) {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return iArr;
    }
}
