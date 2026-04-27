package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,135:1\n33#2,6:136\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n*L\n121#1:136,6\n*E\n"})
@e0g(parameters = 0)
public final class hy8 implements fy8, vba {

    /* JADX INFO: renamed from: s */
    public static final int f45226s = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final ly8 f45227a;

    /* JADX INFO: renamed from: b */
    public int f45228b;

    /* JADX INFO: renamed from: c */
    public boolean f45229c;

    /* JADX INFO: renamed from: d */
    public float f45230d;

    /* JADX INFO: renamed from: e */
    public final boolean f45231e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final x13 f45232f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final c64 f45233g;

    /* JADX INFO: renamed from: h */
    public final int f45234h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final qy6<Integer, List<scc<Integer, ku2>>> f45235i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final List<iy8> f45236j;

    /* JADX INFO: renamed from: k */
    public final int f45237k;

    /* JADX INFO: renamed from: l */
    public final int f45238l;

    /* JADX INFO: renamed from: m */
    public final int f45239m;

    /* JADX INFO: renamed from: n */
    public final boolean f45240n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final t7c f45241o;

    /* JADX INFO: renamed from: p */
    public final int f45242p;

    /* JADX INFO: renamed from: q */
    public final int f45243q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ vba f45244r;

    /* JADX WARN: Multi-variable type inference failed */
    public hy8(@gib ly8 ly8Var, int i, boolean z, float f, @yfb vba vbaVar, boolean z2, @yfb x13 x13Var, @yfb c64 c64Var, int i2, @yfb qy6<? super Integer, ? extends List<scc<Integer, ku2>>> qy6Var, @yfb List<iy8> list, int i3, int i4, int i5, boolean z3, @yfb t7c t7cVar, int i6, int i7) {
        this.f45227a = ly8Var;
        this.f45228b = i;
        this.f45229c = z;
        this.f45230d = f;
        this.f45231e = z2;
        this.f45232f = x13Var;
        this.f45233g = c64Var;
        this.f45234h = i2;
        this.f45235i = qy6Var;
        this.f45236j = list;
        this.f45237k = i3;
        this.f45238l = i4;
        this.f45239m = i5;
        this.f45240n = z3;
        this.f45241o = t7cVar;
        this.f45242p = i6;
        this.f45243q = i7;
        this.f45244r = vbaVar;
    }

    @Override // p000.fy8
    public int getAfterContentPadding() {
        return this.f45242p;
    }

    @Override // p000.vba
    @yfb
    public Map<AbstractC9938nm, Integer> getAlignmentLines() {
        return this.f45244r.getAlignmentLines();
    }

    @Override // p000.fy8
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        ly8 ly8Var = this.f45227a;
        return ((ly8Var != null ? ly8Var.getIndex() : 0) == 0 && this.f45228b == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.f45229c;
    }

    public final float getConsumedScroll() {
        return this.f45230d;
    }

    @yfb
    public final x13 getCoroutineScope() {
        return this.f45232f;
    }

    @yfb
    public final c64 getDensity() {
        return this.f45233g;
    }

    @gib
    public final ly8 getFirstVisibleLine() {
        return this.f45227a;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.f45228b;
    }

    @Override // p000.vba
    public int getHeight() {
        return this.f45244r.getHeight();
    }

    @Override // p000.fy8
    public int getMainAxisItemSpacing() {
        return this.f45243q;
    }

    @Override // p000.fy8
    @yfb
    public t7c getOrientation() {
        return this.f45241o;
    }

    @yfb
    public final qy6<Integer, List<scc<Integer, ku2>>> getPrefetchInfoRetriever() {
        return this.f45235i;
    }

    public final boolean getRemeasureNeeded() {
        return this.f45231e;
    }

    @Override // p000.fy8
    public boolean getReverseLayout() {
        return this.f45240n;
    }

    @Override // p000.vba
    @gib
    public qy6<rce, bth> getRulers() {
        return this.f45244r.getRulers();
    }

    public final int getSlotsPerLine() {
        return this.f45234h;
    }

    @Override // p000.fy8
    public int getTotalItemsCount() {
        return this.f45239m;
    }

    @Override // p000.fy8
    public int getViewportEndOffset() {
        return this.f45238l;
    }

    @Override // p000.fy8
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo29680getViewportSizeYbymL2g() {
        return s78.IntSize(getWidth(), getHeight());
    }

    @Override // p000.fy8
    public int getViewportStartOffset() {
        return this.f45237k;
    }

    @Override // p000.fy8
    @yfb
    public List<iy8> getVisibleItemsInfo() {
        return this.f45236j;
    }

    @Override // p000.vba
    public int getWidth() {
        return this.f45244r.getWidth();
    }

    @Override // p000.vba
    public void placeChildren() {
        this.f45244r.placeChildren();
    }

    public final void setCanScrollForward(boolean z) {
        this.f45229c = z;
    }

    public final void setConsumedScroll(float f) {
        this.f45230d = f;
    }

    public final void setFirstVisibleLineScrollOffset(int i) {
        this.f45228b = i;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i) {
        ly8 ly8Var;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (!this.f45231e && !getVisibleItemsInfo().isEmpty() && (ly8Var = this.f45227a) != null) {
            int mainAxisSizeWithSpacings = ly8Var.getMainAxisSizeWithSpacings();
            int i2 = this.f45228b - i;
            if (i2 >= 0 && i2 < mainAxisSizeWithSpacings) {
                iy8 iy8Var = (iy8) v82.first((List) getVisibleItemsInfo());
                iy8 iy8Var2 = (iy8) v82.last((List) getVisibleItemsInfo());
                if (!iy8Var.getNonScrollableItem() && !iy8Var2.getNonScrollableItem() && (i >= 0 ? Math.min(getViewportStartOffset() - wy8.offsetOnMainAxis(iy8Var, getOrientation()), getViewportEndOffset() - wy8.offsetOnMainAxis(iy8Var2, getOrientation())) > i : Math.min((wy8.offsetOnMainAxis(iy8Var, getOrientation()) + iy8Var.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (wy8.offsetOnMainAxis(iy8Var2, getOrientation()) + iy8Var2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-i))) {
                    this.f45228b -= i;
                    List<iy8> visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        visibleItemsInfo.get(i3).applyScrollDelta(i);
                    }
                    this.f45230d = i;
                    z = true;
                    z = true;
                    z = true;
                    if (!this.f45229c && i > 0) {
                        this.f45229c = true;
                    }
                }
            }
        }
        return z;
    }
}
