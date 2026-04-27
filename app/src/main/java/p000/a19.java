package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,134:1\n33#2,6:135\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n120#1:135,6\n*E\n"})
@e0g(parameters = 0)
public final class a19 implements y09, vba {

    /* JADX INFO: renamed from: s */
    public static final int f110s = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final b19 f111a;

    /* JADX INFO: renamed from: b */
    public int f112b;

    /* JADX INFO: renamed from: c */
    public boolean f113c;

    /* JADX INFO: renamed from: d */
    public float f114d;

    /* JADX INFO: renamed from: e */
    public final float f115e;

    /* JADX INFO: renamed from: f */
    public final boolean f116f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final x13 f117g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final c64 f118h;

    /* JADX INFO: renamed from: i */
    public final long f119i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final List<b19> f120j;

    /* JADX INFO: renamed from: k */
    public final int f121k;

    /* JADX INFO: renamed from: l */
    public final int f122l;

    /* JADX INFO: renamed from: m */
    public final int f123m;

    /* JADX INFO: renamed from: n */
    public final boolean f124n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final t7c f125o;

    /* JADX INFO: renamed from: p */
    public final int f126p;

    /* JADX INFO: renamed from: q */
    public final int f127q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ vba f128r;

    public /* synthetic */ a19(b19 b19Var, int i, boolean z, float f, vba vbaVar, float f2, boolean z2, x13 x13Var, c64 c64Var, long j, List list, int i2, int i3, int i4, boolean z3, t7c t7cVar, int i5, int i6, jt3 jt3Var) {
        this(b19Var, i, z, f, vbaVar, f2, z2, x13Var, c64Var, j, list, i2, i3, i4, z3, t7cVar, i5, i6);
    }

    @Override // p000.y09
    public int getAfterContentPadding() {
        return this.f126p;
    }

    @Override // p000.vba
    @yfb
    public Map<AbstractC9938nm, Integer> getAlignmentLines() {
        return this.f128r.getAlignmentLines();
    }

    @Override // p000.y09
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        b19 b19Var = this.f111a;
        return ((b19Var != null ? b19Var.getIndex() : 0) == 0 && this.f112b == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.f113c;
    }

    /* JADX INFO: renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m27178getChildConstraintsmsEJaDk() {
        return this.f119i;
    }

    public final float getConsumedScroll() {
        return this.f114d;
    }

    @yfb
    public final x13 getCoroutineScope() {
        return this.f117g;
    }

    @yfb
    public final c64 getDensity() {
        return this.f118h;
    }

    @gib
    public final b19 getFirstVisibleItem() {
        return this.f111a;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f112b;
    }

    @Override // p000.vba
    public int getHeight() {
        return this.f128r.getHeight();
    }

    @Override // p000.y09
    public int getMainAxisItemSpacing() {
        return this.f127q;
    }

    @Override // p000.y09
    @yfb
    public t7c getOrientation() {
        return this.f125o;
    }

    public final boolean getRemeasureNeeded() {
        return this.f116f;
    }

    @Override // p000.y09
    public boolean getReverseLayout() {
        return this.f124n;
    }

    @Override // p000.vba
    @gib
    public qy6<rce, bth> getRulers() {
        return this.f128r.getRulers();
    }

    public final float getScrollBackAmount() {
        return this.f115e;
    }

    @Override // p000.y09
    public int getTotalItemsCount() {
        return this.f123m;
    }

    @Override // p000.y09
    public int getViewportEndOffset() {
        return this.f122l;
    }

    @Override // p000.y09
    /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    public long mo27179getViewportSizeYbymL2g() {
        return s78.IntSize(getWidth(), getHeight());
    }

    @Override // p000.y09
    public int getViewportStartOffset() {
        return this.f121k;
    }

    @Override // p000.y09
    @yfb
    public List<b19> getVisibleItemsInfo() {
        return this.f120j;
    }

    @Override // p000.vba
    public int getWidth() {
        return this.f128r.getWidth();
    }

    @Override // p000.vba
    public void placeChildren() {
        this.f128r.placeChildren();
    }

    public final void setCanScrollForward(boolean z) {
        this.f113c = z;
    }

    public final void setConsumedScroll(float f) {
        this.f114d = f;
    }

    public final void setFirstVisibleItemScrollOffset(int i) {
        this.f112b = i;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i, boolean z) {
        b19 b19Var;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (!this.f116f && !getVisibleItemsInfo().isEmpty() && (b19Var = this.f111a) != null) {
            int mainAxisSizeWithSpacings = b19Var.getMainAxisSizeWithSpacings();
            int i2 = this.f112b - i;
            if (i2 >= 0 && i2 < mainAxisSizeWithSpacings) {
                b19 b19Var2 = (b19) v82.first((List) getVisibleItemsInfo());
                b19 b19Var3 = (b19) v82.last((List) getVisibleItemsInfo());
                if (!b19Var2.getNonScrollableItem() && !b19Var3.getNonScrollableItem() && (i >= 0 ? Math.min(getViewportStartOffset() - b19Var2.getOffset(), getViewportEndOffset() - b19Var3.getOffset()) > i : Math.min((b19Var2.getOffset() + b19Var2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (b19Var3.getOffset() + b19Var3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-i))) {
                    this.f112b -= i;
                    List<b19> visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        visibleItemsInfo.get(i3).applyScrollDelta(i, z);
                    }
                    this.f114d = i;
                    z2 = true;
                    z2 = true;
                    z2 = true;
                    if (!this.f113c && i > 0) {
                        this.f113c = true;
                    }
                }
            }
        }
        return z2;
    }

    private a19(b19 b19Var, int i, boolean z, float f, vba vbaVar, float f2, boolean z2, x13 x13Var, c64 c64Var, long j, List<b19> list, int i2, int i3, int i4, boolean z3, t7c t7cVar, int i5, int i6) {
        this.f111a = b19Var;
        this.f112b = i;
        this.f113c = z;
        this.f114d = f;
        this.f115e = f2;
        this.f116f = z2;
        this.f117g = x13Var;
        this.f118h = c64Var;
        this.f119i = j;
        this.f120j = list;
        this.f121k = i2;
        this.f122l = i3;
        this.f123m = i4;
        this.f124n = z3;
        this.f125o = t7cVar;
        this.f126p = i5;
        this.f127q = i6;
        this.f128r = vbaVar;
    }
}
