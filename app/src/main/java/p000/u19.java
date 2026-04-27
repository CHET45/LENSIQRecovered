package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nLazyStaggeredGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n116#2,2:82\n33#2,6:84\n118#2:90\n132#2,3:91\n33#2,4:94\n135#2,2:98\n38#2:100\n137#2:101\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n*L\n49#1:82,2\n49#1:84,6\n49#1:90\n71#1:91,3\n71#1:94,4\n71#1:98,2\n71#1:100\n71#1:101\n*E\n"})
@e0g(parameters = 0)
public final class u19 implements jz8 {

    /* JADX INFO: renamed from: b */
    public static final int f86550b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z29 f86551a;

    public u19(@yfb z29 z29Var) {
        this.f86551a = z29Var;
    }

    private final int calculateVisibleItemsAverageSize(j29 j29Var) {
        List<b29> visibleItemsInfo = j29Var.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int iM32086getHeightimpl = 0;
        for (int i = 0; i < size; i++) {
            b29 b29Var = visibleItemsInfo.get(i);
            iM32086getHeightimpl += j29Var.getOrientation() == t7c.Vertical ? r78.m32086getHeightimpl(b29Var.mo27945getSizeYbymL2g()) : r78.m32087getWidthimpl(b29Var.mo27945getSizeYbymL2g());
        }
        return (iM32086getHeightimpl / visibleItemsInfo.size()) + j29Var.getMainAxisItemSpacing();
    }

    @Override // p000.jz8
    public float calculateDistanceTo(int i) {
        b29 b29Var;
        j29 layoutInfo = this.f86551a.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0.0f;
        }
        List<b29> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                b29Var = null;
                break;
            }
            b29Var = visibleItemsInfo.get(i2);
            if (b29Var.getIndex() == i) {
                break;
            }
            i2++;
        }
        if (b29Var != null) {
            return layoutInfo.getOrientation() == t7c.Vertical ? a78.m27202getYimpl(r4.mo27944getOffsetnOccac()) : a78.m27201getXimpl(r4.mo27944getOffsetnOccac());
        }
        int iCalculateVisibleItemsAverageSize = calculateVisibleItemsAverageSize(layoutInfo);
        int laneCount$foundation_release = this.f86551a.getLaneCount$foundation_release();
        return (iCalculateVisibleItemsAverageSize * ((i / laneCount$foundation_release) - (getFirstVisibleItemIndex() / laneCount$foundation_release))) - getFirstVisibleItemScrollOffset();
    }

    @Override // p000.jz8
    public int getFirstVisibleItemIndex() {
        return this.f86551a.getFirstVisibleItemIndex();
    }

    @Override // p000.jz8
    public int getFirstVisibleItemScrollOffset() {
        return this.f86551a.getFirstVisibleItemScrollOffset();
    }

    @Override // p000.jz8
    public int getItemCount() {
        return this.f86551a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // p000.jz8
    public int getLastVisibleItemIndex() {
        b29 b29Var = (b29) v82.lastOrNull((List) this.f86551a.getLayoutInfo().getVisibleItemsInfo());
        if (b29Var != null) {
            return b29Var.getIndex();
        }
        return 0;
    }

    @Override // p000.jz8
    @gib
    public Object scroll(@yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objScroll$default = ase.scroll$default(this.f86551a, null, gz6Var, zy2Var, 1, null);
        return objScroll$default == pd8.getCOROUTINE_SUSPENDED() ? objScroll$default : bth.f14751a;
    }

    @Override // p000.jz8
    public void snapToItem(@yfb vre vreVar, int i, int i2) {
        this.f86551a.snapToItemInternal$foundation_release(i, i2, true);
    }
}
