package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,131:1\n33#2,6:132\n33#2,6:138\n33#2,6:144\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n112#1:132,6\n115#1:138,6\n118#1:144,6\n*E\n"})
@e0g(parameters = 0)
public final class tbc implements mbc, vba {

    /* JADX INFO: renamed from: u */
    public static final int f84155u = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<bca> f84156a;

    /* JADX INFO: renamed from: b */
    public final int f84157b;

    /* JADX INFO: renamed from: c */
    public final int f84158c;

    /* JADX INFO: renamed from: d */
    public final int f84159d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final t7c f84160e;

    /* JADX INFO: renamed from: f */
    public final int f84161f;

    /* JADX INFO: renamed from: g */
    public final int f84162g;

    /* JADX INFO: renamed from: h */
    public final boolean f84163h;

    /* JADX INFO: renamed from: i */
    public final int f84164i;

    /* JADX INFO: renamed from: j */
    @gib
    public final bca f84165j;

    /* JADX INFO: renamed from: k */
    @gib
    public final bca f84166k;

    /* JADX INFO: renamed from: l */
    public float f84167l;

    /* JADX INFO: renamed from: m */
    public int f84168m;

    /* JADX INFO: renamed from: n */
    public boolean f84169n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final msf f84170o;

    /* JADX INFO: renamed from: p */
    public final boolean f84171p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final List<bca> f84172q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final List<bca> f84173r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final x13 f84174s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ vba f84175t;

    public tbc(@yfb List<bca> list, int i, int i2, int i3, @yfb t7c t7cVar, int i4, int i5, boolean z, int i6, @gib bca bcaVar, @gib bca bcaVar2, float f, int i7, boolean z2, @yfb msf msfVar, @yfb vba vbaVar, boolean z3, @yfb List<bca> list2, @yfb List<bca> list3, @yfb x13 x13Var) {
        this.f84156a = list;
        this.f84157b = i;
        this.f84158c = i2;
        this.f84159d = i3;
        this.f84160e = t7cVar;
        this.f84161f = i4;
        this.f84162g = i5;
        this.f84163h = z;
        this.f84164i = i6;
        this.f84165j = bcaVar;
        this.f84166k = bcaVar2;
        this.f84167l = f;
        this.f84168m = i7;
        this.f84169n = z2;
        this.f84170o = msfVar;
        this.f84171p = z3;
        this.f84172q = list2;
        this.f84173r = list3;
        this.f84174s = x13Var;
        this.f84175t = vbaVar;
    }

    @Override // p000.mbc
    public int getAfterContentPadding() {
        return this.f84159d;
    }

    @Override // p000.vba
    @yfb
    public Map<AbstractC9938nm, Integer> getAlignmentLines() {
        return this.f84175t.getAlignmentLines();
    }

    @Override // p000.mbc
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    @Override // p000.mbc
    public int getBeyondViewportPageCount() {
        return this.f84164i;
    }

    public final boolean getCanScrollBackward() {
        bca bcaVar = this.f84165j;
        return ((bcaVar != null ? bcaVar.getIndex() : 0) == 0 && this.f84168m == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.f84169n;
    }

    @yfb
    public final x13 getCoroutineScope() {
        return this.f84174s;
    }

    @gib
    public final bca getCurrentPage() {
        return this.f84166k;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.f84167l;
    }

    @yfb
    public final List<bca> getExtraPagesAfter() {
        return this.f84173r;
    }

    @yfb
    public final List<bca> getExtraPagesBefore() {
        return this.f84172q;
    }

    @gib
    public final bca getFirstVisiblePage() {
        return this.f84165j;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.f84168m;
    }

    @Override // p000.vba
    public int getHeight() {
        return this.f84175t.getHeight();
    }

    @Override // p000.mbc
    @yfb
    public t7c getOrientation() {
        return this.f84160e;
    }

    @Override // p000.mbc
    public int getPageSize() {
        return this.f84157b;
    }

    @Override // p000.mbc
    public int getPageSpacing() {
        return this.f84158c;
    }

    public final boolean getRemeasureNeeded() {
        return this.f84171p;
    }

    @Override // p000.mbc
    public boolean getReverseLayout() {
        return this.f84163h;
    }

    @Override // p000.vba
    @gib
    public qy6<rce, bth> getRulers() {
        return this.f84175t.getRulers();
    }

    @Override // p000.mbc
    @yfb
    public msf getSnapPosition() {
        return this.f84170o;
    }

    @Override // p000.mbc
    public int getViewportEndOffset() {
        return this.f84162g;
    }

    @Override // p000.mbc
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo30983getViewportSizeYbymL2g() {
        return s78.IntSize(getWidth(), getHeight());
    }

    @Override // p000.mbc
    public int getViewportStartOffset() {
        return this.f84161f;
    }

    @Override // p000.mbc
    @yfb
    public List<bca> getVisiblePagesInfo() {
        return this.f84156a;
    }

    @Override // p000.vba
    public int getWidth() {
        return this.f84175t.getWidth();
    }

    @Override // p000.vba
    public void placeChildren() {
        this.f84175t.placeChildren();
    }

    public final void setCanScrollForward(boolean z) {
        this.f84169n = z;
    }

    public final void setCurrentPageOffsetFraction(float f) {
        this.f84167l = f;
    }

    public final void setFirstVisiblePageScrollOffset(int i) {
        this.f84168m = i;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i) {
        int i2;
        int pageSize = getPageSize() + getPageSpacing();
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (!this.f84171p && !getVisiblePagesInfo().isEmpty() && this.f84165j != null && (i2 = this.f84168m - i) >= 0 && i2 < pageSize) {
            float f = pageSize != 0 ? i / pageSize : 0.0f;
            float f2 = this.f84167l - f;
            if (this.f84166k != null && f2 < 0.5f && f2 > -0.5f) {
                bca bcaVar = (bca) v82.first((List) getVisiblePagesInfo());
                bca bcaVar2 = (bca) v82.last((List) getVisiblePagesInfo());
                if (i >= 0 ? Math.min(getViewportStartOffset() - bcaVar.getOffset(), getViewportEndOffset() - bcaVar2.getOffset()) > i : Math.min((bcaVar.getOffset() + pageSize) - getViewportStartOffset(), (bcaVar2.getOffset() + pageSize) - getViewportEndOffset()) > (-i)) {
                    this.f84167l -= f;
                    this.f84168m -= i;
                    List<bca> visiblePagesInfo = getVisiblePagesInfo();
                    int size = visiblePagesInfo.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        visiblePagesInfo.get(i3).applyScrollDelta(i);
                    }
                    List<bca> list = this.f84172q;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        list.get(i4).applyScrollDelta(i);
                    }
                    List<bca> list2 = this.f84173r;
                    int size3 = list2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        list2.get(i5).applyScrollDelta(i);
                    }
                    z = true;
                    z = true;
                    z = true;
                    if (!this.f84169n && i > 0) {
                        this.f84169n = true;
                    }
                }
            }
        }
        return z;
    }

    public /* synthetic */ tbc(List list, int i, int i2, int i3, t7c t7cVar, int i4, int i5, boolean z, int i6, bca bcaVar, bca bcaVar2, float f, int i7, boolean z2, msf msfVar, vba vbaVar, boolean z3, List list2, List list3, x13 x13Var, int i8, jt3 jt3Var) {
        this(list, i, i2, i3, t7cVar, i4, i5, z, i6, bcaVar, bcaVar2, f, i7, z2, msfVar, vbaVar, z3, (i8 & 131072) != 0 ? l82.emptyList() : list2, (i8 & 262144) != 0 ? l82.emptyList() : list3, x13Var);
    }
}
