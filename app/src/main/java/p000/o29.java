package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,265:1\n33#2,6:266\n33#2,6:272\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n190#1:266,6\n223#1:272,6\n*E\n"})
@e0g(parameters = 0)
public final class o29 implements j29, vba {

    /* JADX INFO: renamed from: u */
    public static final int f66278u = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final int[] f66279a;

    /* JADX INFO: renamed from: b */
    @yfb
    public int[] f66280b;

    /* JADX INFO: renamed from: c */
    public float f66281c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final vba f66282d;

    /* JADX INFO: renamed from: e */
    public boolean f66283e;

    /* JADX INFO: renamed from: f */
    public final boolean f66284f;

    /* JADX INFO: renamed from: g */
    public final boolean f66285g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final x29 f66286h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final y29 f66287i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final c64 f66288j;

    /* JADX INFO: renamed from: k */
    public final int f66289k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final List<q29> f66290l;

    /* JADX INFO: renamed from: m */
    public final long f66291m;

    /* JADX INFO: renamed from: n */
    public final int f66292n;

    /* JADX INFO: renamed from: o */
    public final int f66293o;

    /* JADX INFO: renamed from: p */
    public final int f66294p;

    /* JADX INFO: renamed from: q */
    public final int f66295q;

    /* JADX INFO: renamed from: r */
    public final int f66296r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final x13 f66297s;

    /* JADX INFO: renamed from: t */
    @yfb
    public final t7c f66298t;

    public /* synthetic */ o29(int[] iArr, int[] iArr2, float f, vba vbaVar, boolean z, boolean z2, boolean z3, x29 x29Var, y29 y29Var, c64 c64Var, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, x13 x13Var, jt3 jt3Var) {
        this(iArr, iArr2, f, vbaVar, z, z2, z3, x29Var, y29Var, c64Var, i, list, j, i2, i3, i4, i5, i6, x13Var);
    }

    @Override // p000.j29
    public int getAfterContentPadding() {
        return this.f66295q;
    }

    @Override // p000.vba
    @yfb
    public Map<AbstractC9938nm, Integer> getAlignmentLines() {
        return this.f66282d.getAlignmentLines();
    }

    @Override // p000.j29
    public int getBeforeContentPadding() {
        return this.f66294p;
    }

    public final boolean getCanScrollBackward() {
        return this.f66279a[0] != 0 || this.f66280b[0] > 0;
    }

    public final boolean getCanScrollForward() {
        return this.f66283e;
    }

    public final float getConsumedScroll() {
        return this.f66281c;
    }

    @yfb
    public final x13 getCoroutineScope() {
        return this.f66297s;
    }

    @yfb
    public final c64 getDensity() {
        return this.f66288j;
    }

    @yfb
    public final int[] getFirstVisibleItemIndices() {
        return this.f66279a;
    }

    @yfb
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.f66280b;
    }

    @Override // p000.vba
    public int getHeight() {
        return this.f66282d.getHeight();
    }

    @Override // p000.j29
    public int getMainAxisItemSpacing() {
        return this.f66296r;
    }

    @yfb
    public final vba getMeasureResult() {
        return this.f66282d;
    }

    @Override // p000.j29
    @yfb
    public t7c getOrientation() {
        return this.f66298t;
    }

    public final boolean getRemeasureNeeded() {
        return this.f66285g;
    }

    @Override // p000.vba
    @gib
    public qy6<rce, bth> getRulers() {
        return this.f66282d.getRulers();
    }

    @yfb
    public final x29 getSlots() {
        return this.f66286h;
    }

    @yfb
    public final y29 getSpanProvider() {
        return this.f66287i;
    }

    @Override // p000.j29
    public int getTotalItemsCount() {
        return this.f66289k;
    }

    @Override // p000.j29
    public int getViewportEndOffset() {
        return this.f66293o;
    }

    @Override // p000.j29
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo30447getViewportSizeYbymL2g() {
        return this.f66291m;
    }

    @Override // p000.j29
    public int getViewportStartOffset() {
        return this.f66292n;
    }

    @Override // p000.j29
    @yfb
    public List<q29> getVisibleItemsInfo() {
        return this.f66290l;
    }

    @Override // p000.vba
    public int getWidth() {
        return this.f66282d.getWidth();
    }

    public final boolean isVertical() {
        return this.f66284f;
    }

    @Override // p000.vba
    public void placeChildren() {
        this.f66282d.placeChildren();
    }

    public final void setCanScrollForward(boolean z) {
        this.f66283e = z;
    }

    public final void setConsumedScroll(float f) {
        this.f66281c = f;
    }

    public final void setFirstVisibleItemScrollOffsets(@yfb int[] iArr) {
        this.f66280b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean tryToApplyScrollWithoutRemeasure(int r9) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o29.tryToApplyScrollWithoutRemeasure(int):boolean");
    }

    private o29(int[] iArr, int[] iArr2, float f, vba vbaVar, boolean z, boolean z2, boolean z3, x29 x29Var, y29 y29Var, c64 c64Var, int i, List<q29> list, long j, int i2, int i3, int i4, int i5, int i6, x13 x13Var) {
        this.f66279a = iArr;
        this.f66280b = iArr2;
        this.f66281c = f;
        this.f66282d = vbaVar;
        this.f66283e = z;
        this.f66284f = z2;
        this.f66285g = z3;
        this.f66286h = x29Var;
        this.f66287i = y29Var;
        this.f66288j = c64Var;
        this.f66289k = i;
        this.f66290l = list;
        this.f66291m = j;
        this.f66292n = i2;
        this.f66293o = i3;
        this.f66294p = i4;
        this.f66295q = i5;
        this.f66296r = i6;
        this.f66297s = x13Var;
        this.f66298t = z2 ? t7c.Vertical : t7c.Horizontal;
    }
}
